package io.flutter.plugins.googlemobileads.nativetemplates;

import android.graphics.Typeface;
import android.util.Log;

/* loaded from: classes3.dex */
public enum FlutterNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    /* renamed from: io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle;

        static {
            int[] iArr = new int[FlutterNativeTemplateFontStyle.values().length];
            $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle = iArr;
            try {
                iArr[FlutterNativeTemplateFontStyle.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle[FlutterNativeTemplateFontStyle.BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle[FlutterNativeTemplateFontStyle.ITALIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle[FlutterNativeTemplateFontStyle.MONOSPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static FlutterNativeTemplateFontStyle fromIntValue(int i10) {
        if (i10 >= 0 && i10 < values().length) {
            return values()[i10];
        }
        Log.w("NativeTemplateFontStyle", "Invalid index for NativeTemplateFontStyle: " + i10);
        return NORMAL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Typeface getTypeface() {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.defaultFromStyle(2) : Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}
