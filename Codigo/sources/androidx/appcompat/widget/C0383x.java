package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0888a;
import androidx.core.view.C1116x0;
import p111g.C7386j;

/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
class C0383x extends C0368s {

    /* renamed from: d */
    private final SeekBar f1989d;

    /* renamed from: e */
    private Drawable f1990e;

    /* renamed from: f */
    private ColorStateList f1991f;

    /* renamed from: g */
    private PorterDuff.Mode f1992g;

    /* renamed from: h */
    private boolean f1993h;

    /* renamed from: i */
    private boolean f1994i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0383x(SeekBar seekBar) {
        super(seekBar);
        this.f1991f = null;
        this.f1992g = null;
        this.f1993h = false;
        this.f1994i = false;
        this.f1989d = seekBar;
    }

    /* renamed from: f */
    private void m2041f() {
        Drawable drawable = this.f1990e;
        if (drawable != null) {
            if (this.f1993h || this.f1994i) {
                Drawable m4545i = C0888a.m4545i(drawable.mutate());
                this.f1990e = m4545i;
                if (this.f1993h) {
                    C0888a.m4543g(m4545i, this.f1991f);
                }
                if (this.f1994i) {
                    C0888a.m4544h(this.f1990e, this.f1992g);
                }
                if (this.f1990e.isStateful()) {
                    this.f1990e.setState(this.f1989d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0368s
    /* renamed from: c */
    public void mo1955c(AttributeSet attributeSet, int i10) {
        super.mo1955c(attributeSet, i10);
        Context context = this.f1989d.getContext();
        int[] iArr = C7386j.f16951T;
        C0349l1 m1845u = C0349l1.m1845u(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1989d;
        C1116x0.m5256U(seekBar, seekBar.getContext(), iArr, attributeSet, m1845u.m1862q(), i10, 0);
        Drawable m1852g = m1845u.m1852g(C7386j.f16955U);
        if (m1852g != null) {
            this.f1989d.setThumb(m1852g);
        }
        m2045j(m1845u.m1851f(C7386j.f16959V));
        int i11 = C7386j.f16967X;
        if (m1845u.m1863r(i11)) {
            this.f1992g = C0360p0.m1909d(m1845u.m1855j(i11, -1), this.f1992g);
            this.f1994i = true;
        }
        int i12 = C7386j.f16963W;
        if (m1845u.m1863r(i12)) {
            this.f1991f = m1845u.m1848c(i12);
            this.f1993h = true;
        }
        m1845u.m1864v();
        m2041f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m2042g(Canvas canvas) {
        if (this.f1990e != null) {
            int max = this.f1989d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1990e.getIntrinsicWidth();
                int intrinsicHeight = this.f1990e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1990e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1989d.getWidth() - this.f1989d.getPaddingLeft()) - this.f1989d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1989d.getPaddingLeft(), this.f1989d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1990e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m2043h() {
        Drawable drawable = this.f1990e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1989d.getDrawableState())) {
            this.f1989d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m2044i() {
        Drawable drawable = this.f1990e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m2045j(Drawable drawable) {
        Drawable drawable2 = this.f1990e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1990e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1989d);
            C0888a.m4541e(drawable, C1116x0.m5296u(this.f1989d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1989d.getDrawableState());
            }
            m2041f();
        }
        this.f1989d.invalidate();
    }
}
