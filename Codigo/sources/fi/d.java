package fi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class d extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f15227b;

    /* renamed from: d, reason: collision with root package name */
    private int f15229d;

    /* renamed from: e, reason: collision with root package name */
    private int f15230e;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f15226a = new Paint(2);

    /* renamed from: c, reason: collision with root package name */
    private int f15228c = 255;

    public d(Bitmap bitmap) {
        b(bitmap);
    }

    public Bitmap a() {
        return this.f15227b;
    }

    public void b(Bitmap bitmap) {
        this.f15227b = bitmap;
        if (bitmap != null) {
            this.f15229d = bitmap.getWidth();
            this.f15230e = this.f15227b.getHeight();
        } else {
            this.f15230e = 0;
            this.f15229d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f15227b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f15227b, (Rect) null, getBounds(), this.f15226a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15228c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15230e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f15229d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f15230e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f15229d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f15228c = i10;
        this.f15226a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15226a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f15226a.setFilterBitmap(z10);
    }
}
