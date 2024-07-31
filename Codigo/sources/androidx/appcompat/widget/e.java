package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private final View f1450a;

    /* renamed from: d */
    private j1 f1453d;

    /* renamed from: e */
    private j1 f1454e;

    /* renamed from: f */
    private j1 f1455f;

    /* renamed from: c */
    private int f1452c = -1;

    /* renamed from: b */
    private final j f1451b = j.b();

    public e(View view) {
        this.f1450a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1455f == null) {
            this.f1455f = new j1();
        }
        j1 j1Var = this.f1455f;
        j1Var.a();
        ColorStateList n10 = androidx.core.view.x0.n(this.f1450a);
        if (n10 != null) {
            j1Var.f1534d = true;
            j1Var.f1531a = n10;
        }
        PorterDuff.Mode o10 = androidx.core.view.x0.o(this.f1450a);
        if (o10 != null) {
            j1Var.f1533c = true;
            j1Var.f1532b = o10;
        }
        if (!j1Var.f1534d && !j1Var.f1533c) {
            return false;
        }
        j.i(drawable, j1Var, this.f1450a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1453d != null;
    }

    public void b() {
        Drawable background = this.f1450a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            j1 j1Var = this.f1454e;
            if (j1Var != null) {
                j.i(background, j1Var, this.f1450a.getDrawableState());
                return;
            }
            j1 j1Var2 = this.f1453d;
            if (j1Var2 != null) {
                j.i(background, j1Var2, this.f1450a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        j1 j1Var = this.f1454e;
        if (j1Var != null) {
            return j1Var.f1531a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        j1 j1Var = this.f1454e;
        if (j1Var != null) {
            return j1Var.f1532b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1450a.getContext();
        int[] iArr = g.j.f15510v3;
        l1 u10 = l1.u(context, attributeSet, iArr, i10, 0);
        View view = this.f1450a;
        androidx.core.view.x0.U(view, view.getContext(), iArr, attributeSet, u10.q(), i10, 0);
        try {
            int i11 = g.j.f15515w3;
            if (u10.r(i11)) {
                this.f1452c = u10.m(i11, -1);
                ColorStateList f10 = this.f1451b.f(this.f1450a.getContext(), this.f1452c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = g.j.f15520x3;
            if (u10.r(i12)) {
                androidx.core.view.x0.a0(this.f1450a, u10.c(i12));
            }
            int i13 = g.j.f15525y3;
            if (u10.r(i13)) {
                androidx.core.view.x0.b0(this.f1450a, p0.d(u10.j(i13, -1), null));
            }
        } finally {
            u10.v();
        }
    }

    public void f(Drawable drawable) {
        this.f1452c = -1;
        h(null);
        b();
    }

    public void g(int i10) {
        this.f1452c = i10;
        j jVar = this.f1451b;
        h(jVar != null ? jVar.f(this.f1450a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1453d == null) {
                this.f1453d = new j1();
            }
            j1 j1Var = this.f1453d;
            j1Var.f1531a = colorStateList;
            j1Var.f1534d = true;
        } else {
            this.f1453d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f1454e == null) {
            this.f1454e = new j1();
        }
        j1 j1Var = this.f1454e;
        j1Var.f1531a = colorStateList;
        j1Var.f1534d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f1454e == null) {
            this.f1454e = new j1();
        }
        j1 j1Var = this.f1454e;
        j1Var.f1532b = mode;
        j1Var.f1533c = true;
        b();
    }
}
