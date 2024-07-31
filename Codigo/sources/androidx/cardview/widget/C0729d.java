package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.d */
/* loaded from: classes.dex */
class C0729d extends Drawable {

    /* renamed from: a */
    private float f3163a;

    /* renamed from: c */
    private final RectF f3165c;

    /* renamed from: d */
    private final Rect f3166d;

    /* renamed from: e */
    private float f3167e;

    /* renamed from: h */
    private ColorStateList f3170h;

    /* renamed from: i */
    private PorterDuffColorFilter f3171i;

    /* renamed from: j */
    private ColorStateList f3172j;

    /* renamed from: f */
    private boolean f3168f = false;

    /* renamed from: g */
    private boolean f3169g = true;

    /* renamed from: k */
    private PorterDuff.Mode f3173k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f3164b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0729d(ColorStateList colorStateList, float f10) {
        this.f3163a = f10;
        m3640e(colorStateList);
        this.f3165c = new RectF();
        this.f3166d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m3639a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m3640e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3170h = colorStateList;
        this.f3164b.setColor(colorStateList.getColorForState(getState(), this.f3170h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m3641i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f3165c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f3166d.set(rect);
        if (this.f3168f) {
            this.f3166d.inset((int) Math.ceil(C0730e.m3648a(this.f3167e, this.f3163a, this.f3169g)), (int) Math.ceil(C0730e.m3649b(this.f3167e, this.f3163a, this.f3169g)));
            this.f3165c.set(this.f3166d);
        }
    }

    /* renamed from: b */
    public ColorStateList m3642b() {
        return this.f3170h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m3643c() {
        return this.f3167e;
    }

    /* renamed from: d */
    public float m3644d() {
        return this.f3163a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f3164b;
        if (this.f3171i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f3171i);
            z10 = true;
        }
        RectF rectF = this.f3165c;
        float f10 = this.f3163a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void m3645f(ColorStateList colorStateList) {
        m3640e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m3646g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f3167e && this.f3168f == z10 && this.f3169g == z11) {
            return;
        }
        this.f3167e = f10;
        this.f3168f = z10;
        this.f3169g = z11;
        m3641i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f3166d, this.f3163a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m3647h(float f10) {
        if (f10 == this.f3163a) {
            return;
        }
        this.f3163a = f10;
        m3641i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f3172j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f3170h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3641i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f3170h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f3164b.getColor();
        if (z10) {
            this.f3164b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f3172j;
        if (colorStateList2 == null || (mode = this.f3173k) == null) {
            return z10;
        }
        this.f3171i = m3639a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f3164b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3164b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3172j = colorStateList;
        this.f3171i = m3639a(colorStateList, this.f3173k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3173k = mode;
        this.f3171i = m3639a(this.f3172j, mode);
        invalidateSelf();
    }
}
