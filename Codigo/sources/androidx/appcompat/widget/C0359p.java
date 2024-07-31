package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C1116x0;
import androidx.core.widget.C1137g;
import p111g.C7386j;
import p125h.C7605a;

/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
public class C0359p {

    /* renamed from: a */
    private final ImageView f1834a;

    /* renamed from: b */
    private C0343j1 f1835b;

    /* renamed from: c */
    private C0343j1 f1836c;

    /* renamed from: d */
    private C0343j1 f1837d;

    /* renamed from: e */
    private int f1838e = 0;

    public C0359p(ImageView imageView) {
        this.f1834a = imageView;
    }

    /* renamed from: a */
    private boolean m1894a(Drawable drawable) {
        if (this.f1837d == null) {
            this.f1837d = new C0343j1();
        }
        C0343j1 c0343j1 = this.f1837d;
        c0343j1.m1829a();
        ColorStateList m5559a = C1137g.m5559a(this.f1834a);
        if (m5559a != null) {
            c0343j1.f1809d = true;
            c0343j1.f1806a = m5559a;
        }
        PorterDuff.Mode m5560b = C1137g.m5560b(this.f1834a);
        if (m5560b != null) {
            c0343j1.f1808c = true;
            c0343j1.f1807b = m5560b;
        }
        if (!c0343j1.f1809d && !c0343j1.f1808c) {
            return false;
        }
        C0341j.m1784i(drawable, c0343j1, this.f1834a.getDrawableState());
        return true;
    }

    /* renamed from: l */
    private boolean m1895l() {
        return this.f1835b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1896b() {
        if (this.f1834a.getDrawable() != null) {
            this.f1834a.getDrawable().setLevel(this.f1838e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1897c() {
        Drawable drawable = this.f1834a.getDrawable();
        if (drawable != null) {
            C0360p0.m1907b(drawable);
        }
        if (drawable != null) {
            if (m1895l() && m1894a(drawable)) {
                return;
            }
            C0343j1 c0343j1 = this.f1836c;
            if (c0343j1 != null) {
                C0341j.m1784i(drawable, c0343j1, this.f1834a.getDrawableState());
                return;
            }
            C0343j1 c0343j12 = this.f1835b;
            if (c0343j12 != null) {
                C0341j.m1784i(drawable, c0343j12, this.f1834a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ColorStateList m1898d() {
        C0343j1 c0343j1 = this.f1836c;
        if (c0343j1 != null) {
            return c0343j1.f1806a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public PorterDuff.Mode m1899e() {
        C0343j1 c0343j1 = this.f1836c;
        if (c0343j1 != null) {
            return c0343j1.f1807b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m1900f() {
        return !(this.f1834a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: g */
    public void m1901g(AttributeSet attributeSet, int i10) {
        int m1858m;
        Context context = this.f1834a.getContext();
        int[] iArr = C7386j.f16935P;
        C0349l1 m1845u = C0349l1.m1845u(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1834a;
        C1116x0.m5256U(imageView, imageView.getContext(), iArr, attributeSet, m1845u.m1862q(), i10, 0);
        try {
            Drawable drawable = this.f1834a.getDrawable();
            if (drawable == null && (m1858m = m1845u.m1858m(C7386j.f16939Q, -1)) != -1 && (drawable = C7605a.m23112b(this.f1834a.getContext(), m1858m)) != null) {
                this.f1834a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0360p0.m1907b(drawable);
            }
            int i11 = C7386j.f16943R;
            if (m1845u.m1863r(i11)) {
                C1137g.m5561c(this.f1834a, m1845u.m1848c(i11));
            }
            int i12 = C7386j.f16947S;
            if (m1845u.m1863r(i12)) {
                C1137g.m5562d(this.f1834a, C0360p0.m1909d(m1845u.m1855j(i12, -1), null));
            }
        } finally {
            m1845u.m1864v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1902h(Drawable drawable) {
        this.f1838e = drawable.getLevel();
    }

    /* renamed from: i */
    public void m1903i(int i10) {
        if (i10 != 0) {
            Drawable m23112b = C7605a.m23112b(this.f1834a.getContext(), i10);
            if (m23112b != null) {
                C0360p0.m1907b(m23112b);
            }
            this.f1834a.setImageDrawable(m23112b);
        } else {
            this.f1834a.setImageDrawable(null);
        }
        m1897c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m1904j(ColorStateList colorStateList) {
        if (this.f1836c == null) {
            this.f1836c = new C0343j1();
        }
        C0343j1 c0343j1 = this.f1836c;
        c0343j1.f1806a = colorStateList;
        c0343j1.f1809d = true;
        m1897c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m1905k(PorterDuff.Mode mode) {
        if (this.f1836c == null) {
            this.f1836c = new C0343j1();
        }
        C0343j1 c0343j1 = this.f1836c;
        c0343j1.f1807b = mode;
        c0343j1.f1808c = true;
        m1897c();
    }
}
