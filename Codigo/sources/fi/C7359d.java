package fi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: fi.d */
/* loaded from: classes3.dex */
public class C7359d extends Drawable {

    /* renamed from: b */
    private Bitmap f16650b;

    /* renamed from: d */
    private int f16652d;

    /* renamed from: e */
    private int f16653e;

    /* renamed from: a */
    private final Paint f16649a = new Paint(2);

    /* renamed from: c */
    private int f16651c = 255;

    public C7359d(Bitmap bitmap) {
        m22203b(bitmap);
    }

    /* renamed from: a */
    public Bitmap m22202a() {
        return this.f16650b;
    }

    /* renamed from: b */
    public void m22203b(Bitmap bitmap) {
        this.f16650b = bitmap;
        if (bitmap != null) {
            this.f16652d = bitmap.getWidth();
            this.f16653e = this.f16650b.getHeight();
        } else {
            this.f16653e = 0;
            this.f16652d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f16650b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f16650b, (Rect) null, getBounds(), this.f16649a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16651c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f16653e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f16652d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f16653e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f16652d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f16651c = i10;
        this.f16649a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f16649a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f16649a.setFilterBitmap(z10);
    }
}
