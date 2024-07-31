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

/* loaded from: classes.dex */
class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f2818a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f2820c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f2821d;

    /* renamed from: e, reason: collision with root package name */
    private float f2822e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f2825h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f2826i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f2827j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2823f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2824g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f2828k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f2819b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(ColorStateList colorStateList, float f10) {
        this.f2818a = f10;
        e(colorStateList);
        this.f2820c = new RectF();
        this.f2821d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2825h = colorStateList;
        this.f2819b.setColor(colorStateList.getColorForState(getState(), this.f2825h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2820c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f2821d.set(rect);
        if (this.f2823f) {
            this.f2821d.inset((int) Math.ceil(e.a(this.f2822e, this.f2818a, this.f2824g)), (int) Math.ceil(e.b(this.f2822e, this.f2818a, this.f2824g)));
            this.f2820c.set(this.f2821d);
        }
    }

    public ColorStateList b() {
        return this.f2825h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f2822e;
    }

    public float d() {
        return this.f2818a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f2819b;
        if (this.f2826i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f2826i);
            z10 = true;
        }
        RectF rectF = this.f2820c;
        float f10 = this.f2818a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f2822e && this.f2823f == z10 && this.f2824g == z11) {
            return;
        }
        this.f2822e = f10;
        this.f2823f = z10;
        this.f2824g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2821d, this.f2818a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 == this.f2818a) {
            return;
        }
        this.f2818a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2827j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f2825h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2825h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f2819b.getColor();
        if (z10) {
            this.f2819b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2827j;
        if (colorStateList2 == null || (mode = this.f2828k) == null) {
            return z10;
        }
        this.f2826i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f2819b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2819b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2827j = colorStateList;
        this.f2826i = a(colorStateList, this.f2828k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2828k = mode;
        this.f2826i = a(this.f2827j, mode);
        invalidateSelf();
    }
}
