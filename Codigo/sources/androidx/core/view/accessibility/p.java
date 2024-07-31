package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.s;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class p {

    /* renamed from: d */
    private static int f3883d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f3884a;

    /* renamed from: b */
    public int f3885b = -1;

    /* renamed from: c */
    private int f3886c = -1;

    /* loaded from: classes.dex */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;

        /* renamed from: d */
        public static final a f3887d = new a(1, null);

        /* renamed from: e */
        public static final a f3888e = new a(2, null);

        /* renamed from: f */
        public static final a f3889f = new a(4, null);

        /* renamed from: g */
        public static final a f3890g = new a(8, null);

        /* renamed from: h */
        public static final a f3891h = new a(16, null);

        /* renamed from: i */
        public static final a f3892i = new a(32, null);

        /* renamed from: j */
        public static final a f3893j = new a(64, null);

        /* renamed from: k */
        public static final a f3894k = new a(RecognitionOptions.ITF, null);

        /* renamed from: l */
        public static final a f3895l = new a(RecognitionOptions.QR_CODE, null, s.b.class);

        /* renamed from: m */
        public static final a f3896m = new a(RecognitionOptions.UPC_A, null, s.b.class);

        /* renamed from: n */
        public static final a f3897n = new a(RecognitionOptions.UPC_E, null, s.c.class);

        /* renamed from: o */
        public static final a f3898o = new a(RecognitionOptions.PDF417, null, s.c.class);

        /* renamed from: p */
        public static final a f3899p = new a(RecognitionOptions.AZTEC, null);

        /* renamed from: q */
        public static final a f3900q = new a(8192, null);

        /* renamed from: r */
        public static final a f3901r = new a(16384, null);

        /* renamed from: s */
        public static final a f3902s = new a(RecognitionOptions.TEZ_CODE, null);

        /* renamed from: t */
        public static final a f3903t = new a(65536, null);

        /* renamed from: u */
        public static final a f3904u = new a(131072, null, s.g.class);

        /* renamed from: v */
        public static final a f3905v = new a(262144, null);

        /* renamed from: w */
        public static final a f3906w = new a(524288, null);

        /* renamed from: x */
        public static final a f3907x = new a(1048576, null);

        /* renamed from: y */
        public static final a f3908y = new a(2097152, null, s.h.class);

        /* renamed from: z */
        public static final a f3909z;

        /* renamed from: a */
        final Object f3910a;

        /* renamed from: b */
        private final int f3911b;

        /* renamed from: c */
        private final Class<? extends s.a> f3912c;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            int i10 = Build.VERSION.SDK_INT;
            f3909z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, s.e.class);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i10 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction18;
            } else {
                accessibilityAction = null;
            }
            F = new a(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i10 >= 29) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction17;
            } else {
                accessibilityAction2 = null;
            }
            G = new a(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            if (i10 >= 29) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction16;
            } else {
                accessibilityAction3 = null;
            }
            H = new a(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i10 >= 29) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction15;
            } else {
                accessibilityAction4 = null;
            }
            I = new a(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, s.f.class);
            if (i10 >= 26) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction5 = accessibilityAction14;
            } else {
                accessibilityAction5 = null;
            }
            L = new a(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, s.d.class);
            if (i10 >= 28) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction6 = accessibilityAction13;
            } else {
                accessibilityAction6 = null;
            }
            M = new a(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i10 >= 28) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction7 = accessibilityAction12;
            } else {
                accessibilityAction7 = null;
            }
            N = new a(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i10 >= 30) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction8 = accessibilityAction11;
            } else {
                accessibilityAction8 = null;
            }
            O = new a(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i10 >= 30) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction9 = accessibilityAction10;
            } else {
                accessibilityAction9 = null;
            }
            P = new a(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
            Q = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.ALT, null, null, null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.CTRL, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.FUNCTION, null, null, null);
            T = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.KEYCODE_0, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends s.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i10, CharSequence charSequence, s sVar, Class<? extends s.a> cls) {
            this.f3911b = i10;
            this.f3910a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f3912c = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3910a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3910a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f3910a;
            Object obj3 = ((a) obj).f3910a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f3910a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String h10 = p.h(this.f3911b);
            if (h10.equals("ACTION_UNKNOWN") && b() != null) {
                h10 = b().toString();
            }
            sb2.append(h10);
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final Object f3913a;

        c(Object obj) {
            this.f3913a = obj;
        }

        public static c a(int i10, int i11, boolean z10, int i12) {
            return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        final Object f3914a;

        d(Object obj) {
            this.f3914a = obj;
        }

        public static d a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    private p(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3884a = accessibilityNodeInfo;
    }

    private void H(View view) {
        SparseArray<WeakReference<ClickableSpan>> q10 = q(view);
        if (q10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < q10.size(); i10++) {
                if (q10.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                q10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void I(int i10, boolean z10) {
        Bundle n10 = n();
        if (n10 != null) {
            int i11 = n10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            n10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public static p S(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new p(accessibilityNodeInfo);
    }

    private void c(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void e() {
        b.a(this.f3884a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.a(this.f3884a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.a(this.f3884a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.a(this.f3884a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> f(String str) {
        ArrayList<Integer> integerArrayList = b.a(this.f3884a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.a(this.f3884a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String h(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case RecognitionOptions.ITF /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case RecognitionOptions.QR_CODE /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case RecognitionOptions.UPC_A /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case RecognitionOptions.UPC_E /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecognitionOptions.PDF417 /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case RecognitionOptions.AZTEC /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case RecognitionOptions.TEZ_CODE /* 32768 */:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] l(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> o(View view) {
        SparseArray<WeakReference<ClickableSpan>> q10 = q(view);
        if (q10 != null) {
            return q10;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(q0.e.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> q(View view) {
        return (SparseArray) view.getTag(q0.e.I);
    }

    private boolean u() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int v(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f3883d;
        f3883d = i11 + 1;
        return i11;
    }

    public boolean A() {
        return this.f3884a.isFocusable();
    }

    public boolean B() {
        return this.f3884a.isFocused();
    }

    public boolean C() {
        return this.f3884a.isLongClickable();
    }

    public boolean D() {
        return this.f3884a.isPassword();
    }

    public boolean E() {
        return this.f3884a.isScrollable();
    }

    public boolean F() {
        return this.f3884a.isSelected();
    }

    public boolean G(int i10, Bundle bundle) {
        return this.f3884a.performAction(i10, bundle);
    }

    public void J(CharSequence charSequence) {
        this.f3884a.setClassName(charSequence);
    }

    public void K(Object obj) {
        this.f3884a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((c) obj).f3913a);
    }

    public void L(Object obj) {
        this.f3884a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((d) obj).f3914a);
    }

    public void M(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3884a.setHeading(z10);
        } else {
            I(2, z10);
        }
    }

    public void N(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3884a.setPaneTitle(charSequence);
        } else {
            b.a(this.f3884a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void O(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3884a.setScreenReaderFocusable(z10);
        } else {
            I(1, z10);
        }
    }

    public void P(boolean z10) {
        this.f3884a.setScrollable(z10);
    }

    public void Q(CharSequence charSequence) {
        if (androidx.core.os.a.b()) {
            this.f3884a.setStateDescription(charSequence);
        } else {
            b.a(this.f3884a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfo R() {
        return this.f3884a;
    }

    public void a(int i10) {
        this.f3884a.addAction(i10);
    }

    public void b(a aVar) {
        this.f3884a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3910a);
    }

    public void d(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            e();
            H(view);
            ClickableSpan[] l10 = l(charSequence);
            if (l10 == null || l10.length <= 0) {
                return;
            }
            n().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", q0.e.f23318a);
            SparseArray<WeakReference<ClickableSpan>> o10 = o(view);
            for (int i10 = 0; i10 < l10.length; i10++) {
                int v10 = v(l10[i10], o10);
                o10.put(v10, new WeakReference<>(l10[i10]));
                c(l10[i10], (Spanned) charSequence, v10);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3884a;
        if (accessibilityNodeInfo == null) {
            if (pVar.f3884a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(pVar.f3884a)) {
            return false;
        }
        return this.f3886c == pVar.f3886c && this.f3885b == pVar.f3885b;
    }

    public List<a> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f3884a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3884a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public void i(Rect rect) {
        this.f3884a.getBoundsInParent(rect);
    }

    public void j(Rect rect) {
        this.f3884a.getBoundsInScreen(rect);
    }

    public CharSequence k() {
        return this.f3884a.getClassName();
    }

    public CharSequence m() {
        return this.f3884a.getContentDescription();
    }

    public Bundle n() {
        return b.a(this.f3884a);
    }

    public CharSequence p() {
        return this.f3884a.getPackageName();
    }

    public CharSequence r() {
        if (!u()) {
            return this.f3884a.getText();
        }
        List<Integer> f10 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> f11 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> f12 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> f13 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3884a.getText(), 0, this.f3884a.getText().length()));
        for (int i10 = 0; i10 < f10.size(); i10++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(f13.get(i10).intValue(), this, n().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), f10.get(i10).intValue(), f11.get(i10).intValue(), f12.get(i10).intValue());
        }
        return spannableString;
    }

    public String s() {
        return androidx.core.os.a.d() ? this.f3884a.getUniqueId() : b.a(this.f3884a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String t() {
        return this.f3884a.getViewIdResourceName();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        i(rect);
        sb2.append("; boundsInParent: " + rect);
        j(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(p());
        sb2.append("; className: ");
        sb2.append(k());
        sb2.append("; text: ");
        sb2.append(r());
        sb2.append("; contentDescription: ");
        sb2.append(m());
        sb2.append("; viewId: ");
        sb2.append(t());
        sb2.append("; uniqueId: ");
        sb2.append(s());
        sb2.append("; checkable: ");
        sb2.append(w());
        sb2.append("; checked: ");
        sb2.append(x());
        sb2.append("; focusable: ");
        sb2.append(A());
        sb2.append("; focused: ");
        sb2.append(B());
        sb2.append("; selected: ");
        sb2.append(F());
        sb2.append("; clickable: ");
        sb2.append(y());
        sb2.append("; longClickable: ");
        sb2.append(C());
        sb2.append("; enabled: ");
        sb2.append(z());
        sb2.append("; password: ");
        sb2.append(D());
        sb2.append("; scrollable: " + E());
        sb2.append("; [");
        List<a> g10 = g();
        for (int i10 = 0; i10 < g10.size(); i10++) {
            a aVar = g10.get(i10);
            String h10 = h(aVar.a());
            if (h10.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                h10 = aVar.b().toString();
            }
            sb2.append(h10);
            if (i10 != g10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public boolean w() {
        return this.f3884a.isCheckable();
    }

    public boolean x() {
        return this.f3884a.isChecked();
    }

    public boolean y() {
        return this.f3884a.isClickable();
    }

    public boolean z() {
        return this.f3884a.isEnabled();
    }
}
