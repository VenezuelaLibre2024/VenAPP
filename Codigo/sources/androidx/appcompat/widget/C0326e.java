package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C1116x0;
import p111g.C7386j;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
class C0326e {

    /* renamed from: a */
    private final View f1715a;

    /* renamed from: d */
    private C0343j1 f1718d;

    /* renamed from: e */
    private C0343j1 f1719e;

    /* renamed from: f */
    private C0343j1 f1720f;

    /* renamed from: c */
    private int f1717c = -1;

    /* renamed from: b */
    private final C0341j f1716b = C0341j.m1781b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0326e(View view) {
        this.f1715a = view;
    }

    /* renamed from: a */
    private boolean m1694a(Drawable drawable) {
        if (this.f1720f == null) {
            this.f1720f = new C0343j1();
        }
        C0343j1 c0343j1 = this.f1720f;
        c0343j1.m1829a();
        ColorStateList m5288n = C1116x0.m5288n(this.f1715a);
        if (m5288n != null) {
            c0343j1.f1809d = true;
            c0343j1.f1806a = m5288n;
        }
        PorterDuff.Mode m5290o = C1116x0.m5290o(this.f1715a);
        if (m5290o != null) {
            c0343j1.f1808c = true;
            c0343j1.f1807b = m5290o;
        }
        if (!c0343j1.f1809d && !c0343j1.f1808c) {
            return false;
        }
        C0341j.m1784i(drawable, c0343j1, this.f1715a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1695k() {
        return this.f1718d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1696b() {
        Drawable background = this.f1715a.getBackground();
        if (background != null) {
            if (m1695k() && m1694a(background)) {
                return;
            }
            C0343j1 c0343j1 = this.f1719e;
            if (c0343j1 != null) {
                C0341j.m1784i(background, c0343j1, this.f1715a.getDrawableState());
                return;
            }
            C0343j1 c0343j12 = this.f1718d;
            if (c0343j12 != null) {
                C0341j.m1784i(background, c0343j12, this.f1715a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m1697c() {
        C0343j1 c0343j1 = this.f1719e;
        if (c0343j1 != null) {
            return c0343j1.f1806a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m1698d() {
        C0343j1 c0343j1 = this.f1719e;
        if (c0343j1 != null) {
            return c0343j1.f1807b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1699e(AttributeSet attributeSet, int i10) {
        Context context = this.f1715a.getContext();
        int[] iArr = C7386j.f17088v3;
        C0349l1 m1845u = C0349l1.m1845u(context, attributeSet, iArr, i10, 0);
        View view = this.f1715a;
        C1116x0.m5256U(view, view.getContext(), iArr, attributeSet, m1845u.m1862q(), i10, 0);
        try {
            int i11 = C7386j.f17093w3;
            if (m1845u.m1863r(i11)) {
                this.f1717c = m1845u.m1858m(i11, -1);
                ColorStateList m1787f = this.f1716b.m1787f(this.f1715a.getContext(), this.f1717c);
                if (m1787f != null) {
                    m1702h(m1787f);
                }
            }
            int i12 = C7386j.f17098x3;
            if (m1845u.m1863r(i12)) {
                C1116x0.m5263a0(this.f1715a, m1845u.m1848c(i12));
            }
            int i13 = C7386j.f17103y3;
            if (m1845u.m1863r(i13)) {
                C1116x0.m5265b0(this.f1715a, C0360p0.m1909d(m1845u.m1855j(i13, -1), null));
            }
        } finally {
            m1845u.m1864v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1700f(Drawable drawable) {
        this.f1717c = -1;
        m1702h(null);
        m1696b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1701g(int i10) {
        this.f1717c = i10;
        C0341j c0341j = this.f1716b;
        m1702h(c0341j != null ? c0341j.m1787f(this.f1715a.getContext(), i10) : null);
        m1696b();
    }

    /* renamed from: h */
    void m1702h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1718d == null) {
                this.f1718d = new C0343j1();
            }
            C0343j1 c0343j1 = this.f1718d;
            c0343j1.f1806a = colorStateList;
            c0343j1.f1809d = true;
        } else {
            this.f1718d = null;
        }
        m1696b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m1703i(ColorStateList colorStateList) {
        if (this.f1719e == null) {
            this.f1719e = new C0343j1();
        }
        C0343j1 c0343j1 = this.f1719e;
        c0343j1.f1806a = colorStateList;
        c0343j1.f1809d = true;
        m1696b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m1704j(PorterDuff.Mode mode) {
        if (this.f1719e == null) {
            this.f1719e = new C0343j1();
        }
        C0343j1 c0343j1 = this.f1719e;
        c0343j1.f1807b = mode;
        c0343j1.f1808c = true;
        m1696b();
    }
}
