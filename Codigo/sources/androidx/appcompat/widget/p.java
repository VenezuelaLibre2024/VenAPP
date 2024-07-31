package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private final ImageView f1559a;

    /* renamed from: b */
    private j1 f1560b;

    /* renamed from: c */
    private j1 f1561c;

    /* renamed from: d */
    private j1 f1562d;

    /* renamed from: e */
    private int f1563e = 0;

    public p(ImageView imageView) {
        this.f1559a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1562d == null) {
            this.f1562d = new j1();
        }
        j1 j1Var = this.f1562d;
        j1Var.a();
        ColorStateList a10 = androidx.core.widget.g.a(this.f1559a);
        if (a10 != null) {
            j1Var.f1534d = true;
            j1Var.f1531a = a10;
        }
        PorterDuff.Mode b10 = androidx.core.widget.g.b(this.f1559a);
        if (b10 != null) {
            j1Var.f1533c = true;
            j1Var.f1532b = b10;
        }
        if (!j1Var.f1534d && !j1Var.f1533c) {
            return false;
        }
        j.i(drawable, j1Var, this.f1559a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f1560b != null;
    }

    public void b() {
        if (this.f1559a.getDrawable() != null) {
            this.f1559a.getDrawable().setLevel(this.f1563e);
        }
    }

    public void c() {
        Drawable drawable = this.f1559a.getDrawable();
        if (drawable != null) {
            p0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            j1 j1Var = this.f1561c;
            if (j1Var != null) {
                j.i(drawable, j1Var, this.f1559a.getDrawableState());
                return;
            }
            j1 j1Var2 = this.f1560b;
            if (j1Var2 != null) {
                j.i(drawable, j1Var2, this.f1559a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        j1 j1Var = this.f1561c;
        if (j1Var != null) {
            return j1Var.f1531a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        j1 j1Var = this.f1561c;
        if (j1Var != null) {
            return j1Var.f1532b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f1559a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int m10;
        Context context = this.f1559a.getContext();
        int[] iArr = g.j.P;
        l1 u10 = l1.u(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1559a;
        androidx.core.view.x0.U(imageView, imageView.getContext(), iArr, attributeSet, u10.q(), i10, 0);
        try {
            Drawable drawable = this.f1559a.getDrawable();
            if (drawable == null && (m10 = u10.m(g.j.Q, -1)) != -1 && (drawable = h.a.b(this.f1559a.getContext(), m10)) != null) {
                this.f1559a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                p0.b(drawable);
            }
            int i11 = g.j.R;
            if (u10.r(i11)) {
                androidx.core.widget.g.c(this.f1559a, u10.c(i11));
            }
            int i12 = g.j.S;
            if (u10.r(i12)) {
                androidx.core.widget.g.d(this.f1559a, p0.d(u10.j(i12, -1), null));
            }
        } finally {
            u10.v();
        }
    }

    public void h(Drawable drawable) {
        this.f1563e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = h.a.b(this.f1559a.getContext(), i10);
            if (b10 != null) {
                p0.b(b10);
            }
            this.f1559a.setImageDrawable(b10);
        } else {
            this.f1559a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f1561c == null) {
            this.f1561c = new j1();
        }
        j1 j1Var = this.f1561c;
        j1Var.f1531a = colorStateList;
        j1Var.f1534d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f1561c == null) {
            this.f1561c = new j1();
        }
        j1 j1Var = this.f1561c;
        j1Var.f1532b = mode;
        j1Var.f1533c = true;
        c();
    }
}
