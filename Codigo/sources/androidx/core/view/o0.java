package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f3943a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f3944b;

    /* renamed from: c, reason: collision with root package name */
    private final View f3945c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3946d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f3947e;

    public o0(View view) {
        this.f3945c = view;
    }

    private boolean h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent i15;
        int i16;
        int i17;
        int[] iArr3;
        if (!m() || (i15 = i(i14)) == null) {
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
            this.f3945c.getLocationInWindow(iArr);
            i16 = iArr[0];
            i17 = iArr[1];
        } else {
            i16 = 0;
            i17 = 0;
        }
        if (iArr2 == null) {
            int[] j10 = j();
            j10[0] = 0;
            j10[1] = 0;
            iArr3 = j10;
        } else {
            iArr3 = iArr2;
        }
        l2.d(i15, this.f3945c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f3945c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i16;
            iArr[1] = iArr[1] - i17;
        }
        return true;
    }

    private ViewParent i(int i10) {
        if (i10 == 0) {
            return this.f3943a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f3944b;
    }

    private int[] j() {
        if (this.f3947e == null) {
            this.f3947e = new int[2];
        }
        return this.f3947e;
    }

    private void o(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f3943a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f3944b = viewParent;
        }
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent i10;
        if (!m() || (i10 = i(0)) == null) {
            return false;
        }
        return l2.a(i10, this.f3945c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent i10;
        if (!m() || (i10 = i(0)) == null) {
            return false;
        }
        return l2.b(i10, this.f3945c, f10, f11);
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent i13;
        int i14;
        int i15;
        if (!m() || (i13 = i(i12)) == null) {
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
            this.f3945c.getLocationInWindow(iArr2);
            i14 = iArr2[0];
            i15 = iArr2[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        l2.c(i13, this.f3945c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f3945c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i14;
            iArr2[1] = iArr2[1] - i15;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return h(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return h(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i10) {
        return i(i10) != null;
    }

    public boolean m() {
        return this.f3946d;
    }

    public void n(boolean z10) {
        if (this.f3946d) {
            x0.n0(this.f3945c);
        }
        this.f3946d = z10;
    }

    public boolean p(int i10) {
        return q(i10, 0);
    }

    public boolean q(int i10, int i11) {
        if (l(i11)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f3945c;
        for (ViewParent parent = this.f3945c.getParent(); parent != null; parent = parent.getParent()) {
            if (l2.f(parent, view, this.f3945c, i10, i11)) {
                o(i11, parent);
                l2.e(parent, view, this.f3945c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i10) {
        ViewParent i11 = i(i10);
        if (i11 != null) {
            l2.g(i11, this.f3945c, i10);
            o(i10, null);
        }
    }
}