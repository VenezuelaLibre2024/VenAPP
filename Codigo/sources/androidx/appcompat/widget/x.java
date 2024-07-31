package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
class x extends s {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f1695d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1696e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f1697f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1698g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1699h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1700i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(SeekBar seekBar) {
        super(seekBar);
        this.f1697f = null;
        this.f1698g = null;
        this.f1699h = false;
        this.f1700i = false;
        this.f1695d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1696e;
        if (drawable != null) {
            if (this.f1699h || this.f1700i) {
                Drawable i10 = androidx.core.graphics.drawable.a.i(drawable.mutate());
                this.f1696e = i10;
                if (this.f1699h) {
                    androidx.core.graphics.drawable.a.g(i10, this.f1697f);
                }
                if (this.f1700i) {
                    androidx.core.graphics.drawable.a.h(this.f1696e, this.f1698g);
                }
                if (this.f1696e.isStateful()) {
                    this.f1696e.setState(this.f1695d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.s
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1695d.getContext();
        int[] iArr = g.j.T;
        l1 u10 = l1.u(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1695d;
        androidx.core.view.x0.U(seekBar, seekBar.getContext(), iArr, attributeSet, u10.q(), i10, 0);
        Drawable g10 = u10.g(g.j.U);
        if (g10 != null) {
            this.f1695d.setThumb(g10);
        }
        j(u10.f(g.j.V));
        int i11 = g.j.X;
        if (u10.r(i11)) {
            this.f1698g = p0.d(u10.j(i11, -1), this.f1698g);
            this.f1700i = true;
        }
        int i12 = g.j.W;
        if (u10.r(i12)) {
            this.f1697f = u10.c(i12);
            this.f1699h = true;
        }
        u10.v();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1696e != null) {
            int max = this.f1695d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1696e.getIntrinsicWidth();
                int intrinsicHeight = this.f1696e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1696e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1695d.getWidth() - this.f1695d.getPaddingLeft()) - this.f1695d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1695d.getPaddingLeft(), this.f1695d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1696e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1696e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1695d.getDrawableState())) {
            this.f1695d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1696e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1696e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1696e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1695d);
            androidx.core.graphics.drawable.a.e(drawable, androidx.core.view.x0.u(this.f1695d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1695d.getDrawableState());
            }
            f();
        }
        this.f1695d.invalidate();
    }
}
