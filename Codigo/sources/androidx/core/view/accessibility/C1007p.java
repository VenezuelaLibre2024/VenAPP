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
import androidx.core.os.C0942a;
import androidx.core.view.accessibility.InterfaceC1010s;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p299q0.C10221e;

/* renamed from: androidx.core.view.accessibility.p */
/* loaded from: classes.dex */
public class C1007p {

    /* renamed from: d */
    private static int f4555d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f4556a;

    /* renamed from: b */
    public int f4557b = -1;

    /* renamed from: c */
    private int f4558c = -1;

    /* renamed from: androidx.core.view.accessibility.p$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: A */
        public static final a f4559A;

        /* renamed from: B */
        public static final a f4560B;

        /* renamed from: C */
        public static final a f4561C;

        /* renamed from: D */
        public static final a f4562D;

        /* renamed from: E */
        public static final a f4563E;

        /* renamed from: F */
        public static final a f4564F;

        /* renamed from: G */
        public static final a f4565G;

        /* renamed from: H */
        public static final a f4566H;

        /* renamed from: I */
        public static final a f4567I;

        /* renamed from: J */
        public static final a f4568J;

        /* renamed from: K */
        public static final a f4569K;

        /* renamed from: L */
        public static final a f4570L;

        /* renamed from: M */
        public static final a f4571M;

        /* renamed from: N */
        public static final a f4572N;

        /* renamed from: O */
        public static final a f4573O;

        /* renamed from: P */
        public static final a f4574P;

        /* renamed from: Q */
        public static final a f4575Q;

        /* renamed from: R */
        public static final a f4576R;

        /* renamed from: S */
        public static final a f4577S;

        /* renamed from: T */
        public static final a f4578T;

        /* renamed from: d */
        public static final a f4579d = new a(1, null);

        /* renamed from: e */
        public static final a f4580e = new a(2, null);

        /* renamed from: f */
        public static final a f4581f = new a(4, null);

        /* renamed from: g */
        public static final a f4582g = new a(8, null);

        /* renamed from: h */
        public static final a f4583h = new a(16, null);

        /* renamed from: i */
        public static final a f4584i = new a(32, null);

        /* renamed from: j */
        public static final a f4585j = new a(64, null);

        /* renamed from: k */
        public static final a f4586k = new a(RecognitionOptions.ITF, null);

        /* renamed from: l */
        public static final a f4587l = new a(RecognitionOptions.QR_CODE, null, InterfaceC1010s.b.class);

        /* renamed from: m */
        public static final a f4588m = new a(RecognitionOptions.UPC_A, null, InterfaceC1010s.b.class);

        /* renamed from: n */
        public static final a f4589n = new a(RecognitionOptions.UPC_E, null, InterfaceC1010s.c.class);

        /* renamed from: o */
        public static final a f4590o = new a(RecognitionOptions.PDF417, null, InterfaceC1010s.c.class);

        /* renamed from: p */
        public static final a f4591p = new a(RecognitionOptions.AZTEC, null);

        /* renamed from: q */
        public static final a f4592q = new a(8192, null);

        /* renamed from: r */
        public static final a f4593r = new a(16384, null);

        /* renamed from: s */
        public static final a f4594s = new a(RecognitionOptions.TEZ_CODE, null);

        /* renamed from: t */
        public static final a f4595t = new a(65536, null);

        /* renamed from: u */
        public static final a f4596u = new a(131072, null, InterfaceC1010s.g.class);

        /* renamed from: v */
        public static final a f4597v = new a(262144, null);

        /* renamed from: w */
        public static final a f4598w = new a(524288, null);

        /* renamed from: x */
        public static final a f4599x = new a(1048576, null);

        /* renamed from: y */
        public static final a f4600y = new a(2097152, null, InterfaceC1010s.h.class);

        /* renamed from: z */
        public static final a f4601z;

        /* renamed from: a */
        final Object f4602a;

        /* renamed from: b */
        private final int f4603b;

        /* renamed from: c */
        private final Class<? extends InterfaceC1010s.a> f4604c;

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
            f4601z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f4559A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC1010s.e.class);
            f4560B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f4561C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f4562D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f4563E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i10 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction18;
            } else {
                accessibilityAction = null;
            }
            f4564F = new a(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i10 >= 29) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction17;
            } else {
                accessibilityAction2 = null;
            }
            f4565G = new a(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            if (i10 >= 29) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction16;
            } else {
                accessibilityAction3 = null;
            }
            f4566H = new a(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i10 >= 29) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction15;
            } else {
                accessibilityAction4 = null;
            }
            f4567I = new a(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            f4568J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f4569K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC1010s.f.class);
            if (i10 >= 26) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction5 = accessibilityAction14;
            } else {
                accessibilityAction5 = null;
            }
            f4570L = new a(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, InterfaceC1010s.d.class);
            if (i10 >= 28) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction6 = accessibilityAction13;
            } else {
                accessibilityAction6 = null;
            }
            f4571M = new a(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i10 >= 28) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction7 = accessibilityAction12;
            } else {
                accessibilityAction7 = null;
            }
            f4572N = new a(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i10 >= 30) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction8 = accessibilityAction11;
            } else {
                accessibilityAction8 = null;
            }
            f4573O = new a(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i10 >= 30) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction9 = accessibilityAction10;
            } else {
                accessibilityAction9 = null;
            }
            f4574P = new a(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
            f4575Q = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.ALT, null, null, null);
            f4576R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.CTRL, null, null, null);
            f4577S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.FUNCTION, null, null, null);
            f4578T = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.KEYCODE_0, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends InterfaceC1010s.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i10, CharSequence charSequence, InterfaceC1010s interfaceC1010s, Class<? extends InterfaceC1010s.a> cls) {
            this.f4603b = i10;
            this.f4602a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f4604c = cls;
        }

        /* renamed from: a */
        public int m4927a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4602a).getId();
        }

        /* renamed from: b */
        public CharSequence m4928b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4602a).getLabel();
        }

        /* renamed from: c */
        public boolean m4929c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f4602a;
            Object obj3 = ((a) obj).f4602a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f4602a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String m4888h = C1007p.m4888h(this.f4603b);
            if (m4888h.equals("ACTION_UNKNOWN") && m4928b() != null) {
                m4888h = m4928b().toString();
            }
            sb2.append(m4888h);
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.accessibility.p$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Bundle m4930a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    /* renamed from: androidx.core.view.accessibility.p$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final Object f4605a;

        c(Object obj) {
            this.f4605a = obj;
        }

        /* renamed from: a */
        public static c m4931a(int i10, int i11, boolean z10, int i12) {
            return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* renamed from: androidx.core.view.accessibility.p$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        final Object f4606a;

        d(Object obj) {
            this.f4606a = obj;
        }

        /* renamed from: a */
        public static d m4932a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    private C1007p(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4556a = accessibilityNodeInfo;
    }

    /* renamed from: H */
    private void m4882H(View view) {
        SparseArray<WeakReference<ClickableSpan>> m4891q = m4891q(view);
        if (m4891q != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < m4891q.size(); i10++) {
                if (m4891q.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                m4891q.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    /* renamed from: I */
    private void m4883I(int i10, boolean z10) {
        Bundle m4918n = m4918n();
        if (m4918n != null) {
            int i11 = m4918n.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            m4918n.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    /* renamed from: S */
    public static C1007p m4884S(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1007p(accessibilityNodeInfo);
    }

    /* renamed from: c */
    private void m4885c(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        m4887f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m4887f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m4887f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m4887f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    /* renamed from: e */
    private void m4886e() {
        b.m4930a(this.f4556a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.m4930a(this.f4556a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.m4930a(this.f4556a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.m4930a(this.f4556a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: f */
    private List<Integer> m4887f(String str) {
        ArrayList<Integer> integerArrayList = b.m4930a(this.f4556a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.m4930a(this.f4556a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: h */
    static String m4888h(int i10) {
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

    /* renamed from: l */
    public static ClickableSpan[] m4889l(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: o */
    private SparseArray<WeakReference<ClickableSpan>> m4890o(View view) {
        SparseArray<WeakReference<ClickableSpan>> m4891q = m4891q(view);
        if (m4891q != null) {
            return m4891q;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C10221e.f25273I, sparseArray);
        return sparseArray;
    }

    /* renamed from: q */
    private SparseArray<WeakReference<ClickableSpan>> m4891q(View view) {
        return (SparseArray) view.getTag(C10221e.f25273I);
    }

    /* renamed from: u */
    private boolean m4892u() {
        return !m4887f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: v */
    private int m4893v(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f4555d;
        f4555d = i11 + 1;
        return i11;
    }

    /* renamed from: A */
    public boolean m4894A() {
        return this.f4556a.isFocusable();
    }

    /* renamed from: B */
    public boolean m4895B() {
        return this.f4556a.isFocused();
    }

    /* renamed from: C */
    public boolean m4896C() {
        return this.f4556a.isLongClickable();
    }

    /* renamed from: D */
    public boolean m4897D() {
        return this.f4556a.isPassword();
    }

    /* renamed from: E */
    public boolean m4898E() {
        return this.f4556a.isScrollable();
    }

    /* renamed from: F */
    public boolean m4899F() {
        return this.f4556a.isSelected();
    }

    /* renamed from: G */
    public boolean m4900G(int i10, Bundle bundle) {
        return this.f4556a.performAction(i10, bundle);
    }

    /* renamed from: J */
    public void m4901J(CharSequence charSequence) {
        this.f4556a.setClassName(charSequence);
    }

    /* renamed from: K */
    public void m4902K(Object obj) {
        this.f4556a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((c) obj).f4605a);
    }

    /* renamed from: L */
    public void m4903L(Object obj) {
        this.f4556a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((d) obj).f4606a);
    }

    /* renamed from: M */
    public void m4904M(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4556a.setHeading(z10);
        } else {
            m4883I(2, z10);
        }
    }

    /* renamed from: N */
    public void m4905N(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4556a.setPaneTitle(charSequence);
        } else {
            b.m4930a(this.f4556a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: O */
    public void m4906O(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4556a.setScreenReaderFocusable(z10);
        } else {
            m4883I(1, z10);
        }
    }

    /* renamed from: P */
    public void m4907P(boolean z10) {
        this.f4556a.setScrollable(z10);
    }

    /* renamed from: Q */
    public void m4908Q(CharSequence charSequence) {
        if (C0942a.m4698b()) {
            this.f4556a.setStateDescription(charSequence);
        } else {
            b.m4930a(this.f4556a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: R */
    public AccessibilityNodeInfo m4909R() {
        return this.f4556a;
    }

    /* renamed from: a */
    public void m4910a(int i10) {
        this.f4556a.addAction(i10);
    }

    /* renamed from: b */
    public void m4911b(a aVar) {
        this.f4556a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f4602a);
    }

    /* renamed from: d */
    public void m4912d(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m4886e();
            m4882H(view);
            ClickableSpan[] m4889l = m4889l(charSequence);
            if (m4889l == null || m4889l.length <= 0) {
                return;
            }
            m4918n().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C10221e.f25284a);
            SparseArray<WeakReference<ClickableSpan>> m4890o = m4890o(view);
            for (int i10 = 0; i10 < m4889l.length; i10++) {
                int m4893v = m4893v(m4889l[i10], m4890o);
                m4890o.put(m4893v, new WeakReference<>(m4889l[i10]));
                m4885c(m4889l[i10], (Spanned) charSequence, m4893v);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1007p)) {
            return false;
        }
        C1007p c1007p = (C1007p) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4556a;
        if (accessibilityNodeInfo == null) {
            if (c1007p.f4556a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c1007p.f4556a)) {
            return false;
        }
        return this.f4558c == c1007p.f4558c && this.f4557b == c1007p.f4557b;
    }

    /* renamed from: g */
    public List<a> m4913g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f4556a.getActionList();
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
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4556a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public void m4914i(Rect rect) {
        this.f4556a.getBoundsInParent(rect);
    }

    /* renamed from: j */
    public void m4915j(Rect rect) {
        this.f4556a.getBoundsInScreen(rect);
    }

    /* renamed from: k */
    public CharSequence m4916k() {
        return this.f4556a.getClassName();
    }

    /* renamed from: m */
    public CharSequence m4917m() {
        return this.f4556a.getContentDescription();
    }

    /* renamed from: n */
    public Bundle m4918n() {
        return b.m4930a(this.f4556a);
    }

    /* renamed from: p */
    public CharSequence m4919p() {
        return this.f4556a.getPackageName();
    }

    /* renamed from: r */
    public CharSequence m4920r() {
        if (!m4892u()) {
            return this.f4556a.getText();
        }
        List<Integer> m4887f = m4887f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> m4887f2 = m4887f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> m4887f3 = m4887f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> m4887f4 = m4887f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4556a.getText(), 0, this.f4556a.getText().length()));
        for (int i10 = 0; i10 < m4887f.size(); i10++) {
            spannableString.setSpan(new C0992a(m4887f4.get(i10).intValue(), this, m4918n().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m4887f.get(i10).intValue(), m4887f2.get(i10).intValue(), m4887f3.get(i10).intValue());
        }
        return spannableString;
    }

    /* renamed from: s */
    public String m4921s() {
        return C0942a.m4700d() ? this.f4556a.getUniqueId() : b.m4930a(this.f4556a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* renamed from: t */
    public String m4922t() {
        return this.f4556a.getViewIdResourceName();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m4914i(rect);
        sb2.append("; boundsInParent: " + rect);
        m4915j(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m4919p());
        sb2.append("; className: ");
        sb2.append(m4916k());
        sb2.append("; text: ");
        sb2.append(m4920r());
        sb2.append("; contentDescription: ");
        sb2.append(m4917m());
        sb2.append("; viewId: ");
        sb2.append(m4922t());
        sb2.append("; uniqueId: ");
        sb2.append(m4921s());
        sb2.append("; checkable: ");
        sb2.append(m4923w());
        sb2.append("; checked: ");
        sb2.append(m4924x());
        sb2.append("; focusable: ");
        sb2.append(m4894A());
        sb2.append("; focused: ");
        sb2.append(m4895B());
        sb2.append("; selected: ");
        sb2.append(m4899F());
        sb2.append("; clickable: ");
        sb2.append(m4925y());
        sb2.append("; longClickable: ");
        sb2.append(m4896C());
        sb2.append("; enabled: ");
        sb2.append(m4926z());
        sb2.append("; password: ");
        sb2.append(m4897D());
        sb2.append("; scrollable: " + m4898E());
        sb2.append("; [");
        List<a> m4913g = m4913g();
        for (int i10 = 0; i10 < m4913g.size(); i10++) {
            a aVar = m4913g.get(i10);
            String m4888h = m4888h(aVar.m4927a());
            if (m4888h.equals("ACTION_UNKNOWN") && aVar.m4928b() != null) {
                m4888h = aVar.m4928b().toString();
            }
            sb2.append(m4888h);
            if (i10 != m4913g.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: w */
    public boolean m4923w() {
        return this.f4556a.isCheckable();
    }

    /* renamed from: x */
    public boolean m4924x() {
        return this.f4556a.isChecked();
    }

    /* renamed from: y */
    public boolean m4925y() {
        return this.f4556a.isClickable();
    }

    /* renamed from: z */
    public boolean m4926z() {
        return this.f4556a.isEnabled();
    }
}
