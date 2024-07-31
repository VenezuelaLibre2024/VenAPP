package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.Log;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.editing.ListenableEditingState;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class TextInputPlugin implements ListenableEditingState.EditingStateWatcher {
    private static final String TAG = "TextInputPlugin";
    private final AutofillManager afm;
    private SparseArray<TextInputChannel.Configuration> autofillConfiguration;
    private TextInputChannel.Configuration configuration;
    private ImeSyncDeferringInsetsCallback imeSyncCallback;
    private InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
    private boolean isInputConnectionLocked;
    private Rect lastClientRect;
    private InputConnection lastInputConnection;
    private ListenableEditingState mEditable;
    private final InputMethodManager mImm;
    private TextInputChannel.TextEditState mLastKnownFrameworkTextEditingState;
    private boolean mRestartInputPending;
    private final View mView;
    private PlatformViewsController platformViewsController;
    private final TextInputChannel textInputChannel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugin.editing.TextInputPlugin$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements TextInputChannel.TextInputMethodHandler {
        AnonymousClass1() {
        }

        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
        public void clearClient() {
            TextInputPlugin.this.clearTextInputClient();
        }

        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
        public void finishAutofillContext(boolean z10) {
            if (Build.VERSION.SDK_INT < 26 || TextInputPlugin.this.afm == null) {
                return;
            }
            if (z10) {
                TextInputPlugin.this.afm.commit();
            } else {
                TextInputPlugin.this.afm.cancel();
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
        public void hide() {
            if (TextInputPlugin.this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                TextInputPlugin.this.notifyViewExited();
            } else {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.hideTextInput(textInputPlugin.mView);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
        public void requestAutofill() {
            TextInputPlugin.this.notifyViewEntered();
        }

        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
        public void sendAppPrivateCommand(String str, Bundle bundle) {
            TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
        }

        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
        public void setClient(int i10, TextInputChannel.Configuration configuration) {
            TextInputPlugin.this.setTextInputClient(i10, configuration);
        }

        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
        public void setEditableSizeAndTransform(double d10, double d11, double[] dArr) {
            TextInputPlugin.this.saveEditableSizeAndTransform(d10, d11, dArr);
        }

        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
        public void setEditingState(TextInputChannel.TextEditState textEditState) {
            TextInputPlugin textInputPlugin = TextInputPlugin.this;
            textInputPlugin.setTextInputEditingState(textInputPlugin.mView, textEditState);
        }

        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
        public void setPlatformViewClient(int i10, boolean z10) {
            TextInputPlugin.this.setPlatformViewTextInputClient(i10, z10);
        }

        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
        public void show() {
            TextInputPlugin textInputPlugin = TextInputPlugin.this;
            textInputPlugin.showTextInput(textInputPlugin.mView);
        }
    }

    /* renamed from: io.flutter.plugin.editing.TextInputPlugin$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements MinMax {
        final /* synthetic */ boolean val$isAffine;
        final /* synthetic */ double[] val$matrix;
        final /* synthetic */ double[] val$minMax;

        AnonymousClass2(boolean z10, double[] dArr, double[] dArr2) {
            r2 = z10;
            r3 = dArr;
            r4 = dArr2;
        }

        @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
        public void inspect(double d10, double d11) {
            double d12 = 1.0d;
            if (!r2) {
                double[] dArr = r3;
                d12 = 1.0d / (((dArr[3] * d10) + (dArr[7] * d11)) + dArr[15]);
            }
            double[] dArr2 = r3;
            double d13 = ((dArr2[0] * d10) + (dArr2[4] * d11) + dArr2[12]) * d12;
            double d14 = ((dArr2[1] * d10) + (dArr2[5] * d11) + dArr2[13]) * d12;
            double[] dArr3 = r4;
            if (d13 < dArr3[0]) {
                dArr3[0] = d13;
            } else if (d13 > dArr3[1]) {
                dArr3[1] = d13;
            }
            if (d14 < dArr3[2]) {
                dArr3[2] = d14;
            } else if (d14 > dArr3[3]) {
                dArr3[3] = d14;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class InputTarget {

        /* renamed from: id */
        int f17889id;
        Type type;

        /* loaded from: classes3.dex */
        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(Type type, int i10) {
            this.type = type;
            this.f17889id = i10;
        }
    }

    /* loaded from: classes3.dex */
    public interface MinMax {
        void inspect(double d10, double d11);
    }

    public TextInputPlugin(View view, TextInputChannel textInputChannel, PlatformViewsController platformViewsController) {
        int ime;
        int statusBars;
        int navigationBars;
        int i10 = 0;
        this.mView = view;
        this.mEditable = new ListenableEditingState(null, view);
        this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i11 = Build.VERSION.SDK_INT;
        this.afm = i11 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : null;
        if (i11 >= 30) {
            if ((view.getWindowSystemUiVisibility() & 2) == 0) {
                navigationBars = WindowInsets.Type.navigationBars();
                i10 = 0 | navigationBars;
            }
            if ((view.getWindowSystemUiVisibility() & 4) == 0) {
                statusBars = WindowInsets.Type.statusBars();
                i10 |= statusBars;
            }
            ime = WindowInsets.Type.ime();
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, i10, ime);
            this.imeSyncCallback = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.textInputChannel = textInputChannel;
        textInputChannel.setTextInputMethodHandler(new TextInputChannel.TextInputMethodHandler() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
            AnonymousClass1() {
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void clearClient() {
                TextInputPlugin.this.clearTextInputClient();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void finishAutofillContext(boolean z10) {
                if (Build.VERSION.SDK_INT < 26 || TextInputPlugin.this.afm == null) {
                    return;
                }
                if (z10) {
                    TextInputPlugin.this.afm.commit();
                } else {
                    TextInputPlugin.this.afm.cancel();
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void hide() {
                if (TextInputPlugin.this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                    TextInputPlugin.this.notifyViewExited();
                } else {
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void requestAutofill() {
                TextInputPlugin.this.notifyViewEntered();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void sendAppPrivateCommand(String str, Bundle bundle) {
                TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setClient(int i102, TextInputChannel.Configuration configuration) {
                TextInputPlugin.this.setTextInputClient(i102, configuration);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditableSizeAndTransform(double d10, double d11, double[] dArr) {
                TextInputPlugin.this.saveEditableSizeAndTransform(d10, d11, dArr);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditingState(TextInputChannel.TextEditState textEditState) {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, textEditState);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setPlatformViewClient(int i102, boolean z10) {
                TextInputPlugin.this.setPlatformViewTextInputClient(i102, z10);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void show() {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.showTextInput(textInputPlugin.mView);
            }
        });
        textInputChannel.requestExistingInputState();
        this.platformViewsController = platformViewsController;
        platformViewsController.attachTextInputPlugin(this);
    }

    private boolean canShowTextInput() {
        TextInputChannel.InputType inputType;
        TextInputChannel.Configuration configuration = this.configuration;
        return configuration == null || (inputType = configuration.inputType) == null || inputType.type != TextInputChannel.TextInputType.NONE;
    }

    private static boolean composingChanged(TextInputChannel.TextEditState textEditState, TextInputChannel.TextEditState textEditState2) {
        int i10 = textEditState.composingEnd - textEditState.composingStart;
        if (i10 != textEditState2.composingEnd - textEditState2.composingStart) {
            return true;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (textEditState.text.charAt(textEditState.composingStart + i11) != textEditState2.text.charAt(textEditState2.composingStart + i11)) {
                return true;
            }
        }
        return false;
    }

    public void hideTextInput(View view) {
        notifyViewExited();
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int inputTypeFromTextInputType(TextInputChannel.InputType inputType, boolean z10, boolean z11, boolean z12, boolean z13, TextInputChannel.TextCapitalization textCapitalization) {
        TextInputChannel.TextInputType textInputType = inputType.type;
        if (textInputType == TextInputChannel.TextInputType.DATETIME) {
            return 4;
        }
        if (textInputType == TextInputChannel.TextInputType.NUMBER) {
            int i10 = inputType.isSigned ? 4098 : 2;
            return inputType.isDecimal ? i10 | 8192 : i10;
        }
        if (textInputType == TextInputChannel.TextInputType.PHONE) {
            return 3;
        }
        if (textInputType == TextInputChannel.TextInputType.NONE) {
            return 0;
        }
        int i11 = textInputType == TextInputChannel.TextInputType.MULTILINE ? 131073 : textInputType == TextInputChannel.TextInputType.EMAIL_ADDRESS ? 33 : textInputType == TextInputChannel.TextInputType.URL ? 17 : textInputType == TextInputChannel.TextInputType.VISIBLE_PASSWORD ? 145 : textInputType == TextInputChannel.TextInputType.NAME ? 97 : textInputType == TextInputChannel.TextInputType.POSTAL_ADDRESS ? 113 : 1;
        if (z10) {
            i11 = i11 | 524288 | RecognitionOptions.ITF;
        } else {
            if (z11) {
                i11 |= RecognitionOptions.TEZ_CODE;
            }
            if (!z12) {
                i11 |= 524288;
            }
        }
        return textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS ? i11 | RecognitionOptions.AZTEC : textCapitalization == TextInputChannel.TextCapitalization.WORDS ? i11 | 8192 : textCapitalization == TextInputChannel.TextCapitalization.SENTENCES ? i11 | 16384 : i11;
    }

    private boolean needsAutofill() {
        return this.autofillConfiguration != null;
    }

    private void notifyValueChanged(String str) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        String str2 = this.configuration.autofill.uniqueIdentifier;
        AutofillManager autofillManager = this.afm;
        View view = this.mView;
        int hashCode = str2.hashCode();
        forText = AutofillValue.forText(str);
        autofillManager.notifyValueChanged(view, hashCode, forText);
    }

    public void notifyViewEntered() {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.lastClientRect);
        rect.offset(iArr[0], iArr[1]);
        this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
    }

    public void notifyViewExited() {
        TextInputChannel.Configuration configuration;
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || (configuration = this.configuration) == null || configuration.autofill == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyViewExited(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode());
    }

    public void saveEditableSizeAndTransform(double d10, double d11, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z10 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d12 = dArr[12];
        double d13 = dArr[15];
        double d14 = d12 / d13;
        dArr2[1] = d14;
        dArr2[0] = d14;
        double d15 = dArr[13] / d13;
        dArr2[3] = d15;
        dArr2[2] = d15;
        AnonymousClass2 anonymousClass2 = new MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
            final /* synthetic */ boolean val$isAffine;
            final /* synthetic */ double[] val$matrix;
            final /* synthetic */ double[] val$minMax;

            AnonymousClass2(boolean z102, double[] dArr3, double[] dArr22) {
                r2 = z102;
                r3 = dArr3;
                r4 = dArr22;
            }

            @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
            public void inspect(double d102, double d112) {
                double d122 = 1.0d;
                if (!r2) {
                    double[] dArr3 = r3;
                    d122 = 1.0d / (((dArr3[3] * d102) + (dArr3[7] * d112)) + dArr3[15]);
                }
                double[] dArr22 = r3;
                double d132 = ((dArr22[0] * d102) + (dArr22[4] * d112) + dArr22[12]) * d122;
                double d142 = ((dArr22[1] * d102) + (dArr22[5] * d112) + dArr22[13]) * d122;
                double[] dArr32 = r4;
                if (d132 < dArr32[0]) {
                    dArr32[0] = d132;
                } else if (d132 > dArr32[1]) {
                    dArr32[1] = d132;
                }
                if (d142 < dArr32[2]) {
                    dArr32[2] = d142;
                } else if (d142 > dArr32[3]) {
                    dArr32[3] = d142;
                }
            }
        };
        anonymousClass2.inspect(d10, 0.0d);
        anonymousClass2.inspect(d10, d11);
        anonymousClass2.inspect(0.0d, d11);
        Float valueOf = Float.valueOf(this.mView.getContext().getResources().getDisplayMetrics().density);
        this.lastClientRect = new Rect((int) (dArr22[0] * valueOf.floatValue()), (int) (dArr22[2] * valueOf.floatValue()), (int) Math.ceil(dArr22[1] * valueOf.floatValue()), (int) Math.ceil(dArr22[3] * valueOf.floatValue()));
    }

    public void setPlatformViewTextInputClient(int i10, boolean z10) {
        if (!z10) {
            this.inputTarget = new InputTarget(InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i10);
            this.lastInputConnection = null;
        } else {
            this.mView.requestFocus();
            this.inputTarget = new InputTarget(InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i10);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    private void updateAutofillConfigurationIfNeeded(TextInputChannel.Configuration configuration) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (configuration == null || configuration.autofill == null) {
            this.autofillConfiguration = null;
            return;
        }
        TextInputChannel.Configuration[] configurationArr = configuration.fields;
        SparseArray<TextInputChannel.Configuration> sparseArray = new SparseArray<>();
        this.autofillConfiguration = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.autofill.uniqueIdentifier.hashCode(), configuration);
            return;
        }
        for (TextInputChannel.Configuration configuration2 : configurationArr) {
            TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
            if (autofill != null) {
                this.autofillConfiguration.put(autofill.uniqueIdentifier.hashCode(), configuration2);
                AutofillManager autofillManager = this.afm;
                View view = this.mView;
                int hashCode = autofill.uniqueIdentifier.hashCode();
                forText = AutofillValue.forText(autofill.editState.text);
                autofillManager.notifyValueChanged(view, hashCode, forText);
            }
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        TextInputChannel.Configuration configuration;
        TextInputChannel.Configuration.Autofill autofill;
        TextInputChannel.Configuration.Autofill autofill2;
        CharSequence textValue;
        if (Build.VERSION.SDK_INT < 26 || (configuration = this.configuration) == null || this.autofillConfiguration == null || (autofill = configuration.autofill) == null) {
            return;
        }
        HashMap<String, TextInputChannel.TextEditState> hashMap = new HashMap<>();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextInputChannel.Configuration configuration2 = this.autofillConfiguration.get(sparseArray.keyAt(i10));
            if (configuration2 != null && (autofill2 = configuration2.autofill) != null) {
                textValue = sparseArray.valueAt(i10).getTextValue();
                String charSequence = textValue.toString();
                TextInputChannel.TextEditState textEditState = new TextInputChannel.TextEditState(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
                    this.mEditable.setEditingState(textEditState);
                } else {
                    hashMap.put(autofill2.uniqueIdentifier, textEditState);
                }
            }
        }
        this.textInputChannel.updateEditingStateWithTag(this.inputTarget.f17889id, hashMap);
    }

    public void clearPlatformViewClient(int i10) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if ((type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.f17889id == i10) {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            notifyViewExited();
            this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    void clearTextInputClient() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.mEditable.removeEditingStateListener(this);
        notifyViewExited();
        this.configuration = null;
        updateAutofillConfigurationIfNeeded(null);
        this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
    }

    public InputConnection createInputConnection(View view, KeyboardManager keyboardManager, EditorInfo editorInfo) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if (type == InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        }
        if (type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.isInputConnectionLocked) {
                return this.lastInputConnection;
            }
            InputConnection onCreateInputConnection = this.platformViewsController.getPlatformViewById(inputTarget.f17889id).onCreateInputConnection(editorInfo);
            this.lastInputConnection = onCreateInputConnection;
            return onCreateInputConnection;
        }
        TextInputChannel.Configuration configuration = this.configuration;
        int inputTypeFromTextInputType = inputTypeFromTextInputType(configuration.inputType, configuration.obscureText, configuration.autocorrect, configuration.enableSuggestions, configuration.enableIMEPersonalizedLearning, configuration.textCapitalization);
        editorInfo.inputType = inputTypeFromTextInputType;
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.configuration.enableIMEPersonalizedLearning) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.configuration.inputAction;
        int intValue = num == null ? (inputTypeFromTextInputType & 131072) != 0 ? 1 : 6 : num.intValue();
        TextInputChannel.Configuration configuration2 = this.configuration;
        String str = configuration2.actionLabel;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        String[] strArr = configuration2.contentCommitMimeTypes;
        if (strArr != null) {
            t0.d.d(editorInfo, strArr);
        }
        InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.f17889id, this.textInputChannel, keyboardManager, this.mEditable, editorInfo);
        editorInfo.initialSelStart = this.mEditable.getSelectionStart();
        editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
        this.lastInputConnection = inputConnectionAdaptor;
        return inputConnectionAdaptor;
    }

    public void destroy() {
        this.platformViewsController.detachTextInputPlugin();
        this.textInputChannel.setTextInputMethodHandler(null);
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r7 == r1.composingEnd) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void didChangeEditingState(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.mEditable
            java.lang.String r9 = r9.toString()
            r8.notifyValueChanged(r9)
        Lb:
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.mEditable
            int r9 = r9.getSelectionStart()
            io.flutter.plugin.editing.ListenableEditingState r10 = r8.mEditable
            int r10 = r10.getSelectionEnd()
            io.flutter.plugin.editing.ListenableEditingState r11 = r8.mEditable
            int r11 = r11.getComposingStart()
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            int r7 = r0.getComposingEnd()
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            java.util.ArrayList r0 = r0.extractBatchTextEditingDeltas()
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r1 = r8.mLastKnownFrameworkTextEditingState
            if (r1 == 0) goto L52
            io.flutter.plugin.editing.ListenableEditingState r1 = r8.mEditable
            java.lang.String r1 = r1.toString()
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r2 = r8.mLastKnownFrameworkTextEditingState
            java.lang.String r2 = r2.text
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r1 = r8.mLastKnownFrameworkTextEditingState
            int r2 = r1.selectionStart
            if (r9 != r2) goto L50
            int r2 = r1.selectionEnd
            if (r10 != r2) goto L50
            int r2 = r1.composingStart
            if (r11 != r2) goto L50
            int r1 = r1.composingEnd
            if (r7 != r1) goto L50
            goto L52
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            if (r1 != 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.ListenableEditingState r2 = r8.mEditable
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            io.flutter.Log.v(r2, r1)
            io.flutter.embedding.engine.systemchannels.TextInputChannel$Configuration r1 = r8.configuration
            boolean r1 = r1.enableDeltaModel
            if (r1 == 0) goto L86
            io.flutter.embedding.engine.systemchannels.TextInputChannel r1 = r8.textInputChannel
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r2 = r8.inputTarget
            int r2 = r2.f17889id
            r1.updateEditingStateWithDeltas(r2, r0)
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            r0.clearBatchDeltas()
            goto L99
        L86:
            io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = r8.textInputChannel
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r1 = r8.inputTarget
            int r1 = r1.f17889id
            io.flutter.plugin.editing.ListenableEditingState r2 = r8.mEditable
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.updateEditingState(r1, r2, r3, r4, r5, r6)
        L99:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r6 = new io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.mLastKnownFrameworkTextEditingState = r6
            goto Lb1
        Lac:
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.mEditable
            r9.clearBatchDeltas()
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.TextInputPlugin.didChangeEditingState(boolean, boolean, boolean):void");
    }

    Editable getEditable() {
        return this.mEditable;
    }

    ImeSyncDeferringInsetsCallback getImeSyncCallback() {
        return this.imeSyncCallback;
    }

    public InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    public InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public boolean handleKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!getInputMethodManager().isAcceptingText() || (inputConnection = this.lastInputConnection) == null) {
            return false;
        }
        return inputConnection instanceof InputConnectionAdaptor ? ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void lockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = true;
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        AutofillId autofillId;
        AutofillValue forText;
        Rect rect;
        AutofillValue forText2;
        if (Build.VERSION.SDK_INT < 26 || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        autofillId = viewStructure.getAutofillId();
        for (int i11 = 0; i11 < this.autofillConfiguration.size(); i11++) {
            int keyAt = this.autofillConfiguration.keyAt(i11);
            TextInputChannel.Configuration.Autofill autofill = this.autofillConfiguration.valueAt(i11).autofill;
            if (autofill != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i11);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = autofill.hints;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = autofill.hintText;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.lastClientRect) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    forText = AutofillValue.forText(autofill.editState.text);
                    newChild.setAutofillValue(forText);
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
                    forText2 = AutofillValue.forText(this.mEditable);
                    newChild.setAutofillValue(forText2);
                }
            }
        }
    }

    public void sendTextInputAppPrivateCommand(String str, Bundle bundle) {
        this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
    }

    void setTextInputClient(int i10, TextInputChannel.Configuration configuration) {
        notifyViewExited();
        this.configuration = configuration;
        this.inputTarget = canShowTextInput() ? new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i10) : new InputTarget(InputTarget.Type.NO_TARGET, i10);
        this.mEditable.removeEditingStateListener(this);
        TextInputChannel.Configuration.Autofill autofill = configuration.autofill;
        this.mEditable = new ListenableEditingState(autofill != null ? autofill.editState : null, this.mView);
        updateAutofillConfigurationIfNeeded(configuration);
        this.mRestartInputPending = true;
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }

    void setTextInputEditingState(View view, TextInputChannel.TextEditState textEditState) {
        TextInputChannel.TextEditState textEditState2;
        if (!this.mRestartInputPending && (textEditState2 = this.mLastKnownFrameworkTextEditingState) != null && textEditState2.hasComposing()) {
            boolean composingChanged = composingChanged(this.mLastKnownFrameworkTextEditingState, textEditState);
            this.mRestartInputPending = composingChanged;
            if (composingChanged) {
                Log.i(TAG, "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.mLastKnownFrameworkTextEditingState = textEditState;
        this.mEditable.setEditingState(textEditState);
        if (this.mRestartInputPending) {
            this.mImm.restartInput(view);
            this.mRestartInputPending = false;
        }
    }

    void showTextInput(View view) {
        if (!canShowTextInput()) {
            hideTextInput(view);
        } else {
            view.requestFocus();
            this.mImm.showSoftInput(view, 0);
        }
    }

    public void unlockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = false;
        }
    }
}
