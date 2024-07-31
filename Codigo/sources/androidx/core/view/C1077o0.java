package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.o0 */
/* loaded from: classes.dex */
public class C1077o0 {

    /* renamed from: a */
    private ViewParent f4635a;

    /* renamed from: b */
    private ViewParent f4636b;

    /* renamed from: c */
    private final View f4637c;

    /* renamed from: d */
    private boolean f4638d;

    /* renamed from: e */
    private int[] f4639e;

    public C1077o0(View view) {
        this.f4637c = view;
    }

    /* renamed from: h */
    private boolean m5081h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent m5082i;
        int i15;
        int i16;
        int[] iArr3;
        if (!m5094m() || (m5082i = m5082i(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f4637c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] m5083j = m5083j();
            m5083j[0] = 0;
            m5083j[1] = 0;
            iArr3 = m5083j;
        } else {
            iArr3 = iArr2;
        }
        C1064l2.m5043d(m5082i, this.f4637c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f4637c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m5082i(int i10) {
        if (i10 == 0) {
            return this.f4635a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f4636b;
    }

    /* renamed from: j */
    private int[] m5083j() {
        if (this.f4639e == null) {
            this.f4639e = new int[2];
        }
        return this.f4639e;
    }

    /* renamed from: o */
    private void m5084o(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f4635a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f4636b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean m5085a(float f10, float f11, boolean z10) {
        ViewParent m5082i;
        if (!m5094m() || (m5082i = m5082i(0)) == null) {
            return false;
        }
        return C1064l2.m5040a(m5082i, this.f4637c, f10, f11, z10);
    }

    /* renamed from: b */
    public boolean m5086b(float f10, float f11) {
        ViewParent m5082i;
        if (!m5094m() || (m5082i = m5082i(0)) == null) {
            return false;
        }
        return C1064l2.m5041b(m5082i, this.f4637c, f10, f11);
    }

    /* renamed from: c */
    public boolean m5087c(int i10, int i11, int[] iArr, int[] iArr2) {
        return m5088d(i10, i11, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m5088d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent m5082i;
        int i13;
        int i14;
        if (!m5094m() || (m5082i = m5082i(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f4637c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = m5083j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C1064l2.m5042c(m5082i, this.f4637c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f4637c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m5089e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        m5081h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* renamed from: f */
    public boolean m5090f(int i10, int i11, int i12, int i13, int[] iArr) {
        return m5081h(i10, i11, i12, i13, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m5091g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return m5081h(i10, i11, i12, i13, iArr, i14, null);
    }

    /* renamed from: k */
    public boolean m5092k() {
        return m5093l(0);
    }

    /* renamed from: l */
    public boolean m5093l(int i10) {
        return m5082i(i10) != null;
    }

    /* renamed from: m */
    public boolean m5094m() {
        return this.f4638d;
    }

    /* renamed from: n */
    public void m5095n(boolean z10) {
        if (this.f4638d) {
            C1116x0.m5289n0(this.f4637c);
        }
        this.f4638d = z10;
    }

    /* renamed from: p */
    public boolean m5096p(int i10) {
        return m5097q(i10, 0);
    }

    /* renamed from: q */
    public boolean m5097q(int i10, int i11) {
        if (m5093l(i11)) {
            return true;
        }
        if (!m5094m()) {
            return false;
        }
        View view = this.f4637c;
        for (ViewParent parent = this.f4637c.getParent(); parent != null; parent = parent.getParent()) {
            if (C1064l2.m5045f(parent, view, this.f4637c, i10, i11)) {
                m5084o(i11, parent);
                C1064l2.m5044e(parent, view, this.f4637c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void m5098r() {
        m5099s(0);
    }

    /* renamed from: s */
    public void m5099s(int i10) {
        ViewParent m5082i = m5082i(i10);
        if (m5082i != null) {
            C1064l2.m5046g(m5082i, this.f4637c, i10);
            m5084o(i10, null);
        }
    }
}
