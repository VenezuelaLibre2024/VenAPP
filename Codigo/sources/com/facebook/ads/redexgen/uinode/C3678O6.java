package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.O6 */
/* loaded from: assets/audience_network.dex */
public final class C3678O6 extends ImageView {
    public float A00;
    public final int A01;
    public final int A02;
    public final Bitmap A03;

    public C3678O6(C4337Yn c4337Yn, int i10, int i11) {
        super(c4337Yn);
        this.A03 = AbstractC3545Lx.A01(EnumC3544Lw.RATINGS);
        this.A00 = 1.0f;
        this.A01 = i10;
        this.A02 = i11;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(2);
        paint.setColorFilter(new PorterDuffColorFilter(this.A01, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.A03, (Rect) null, new Rect(0, 0, getWidth(), getHeight()), paint);
        paint.setColorFilter(new PorterDuffColorFilter(this.A02, PorterDuff.Mode.SRC_ATOP));
        Rect fillRect = new Rect(0, 0, (int) (this.A00 * this.A03.getWidth()), this.A03.getHeight());
        Rect drawRect = new Rect(0, 0, (int) (this.A00 * getWidth()), getHeight());
        canvas.drawBitmap(this.A03, fillRect, drawRect, paint);
    }

    public void setFillRatio(float f10) {
        this.A00 = f10;
        postInvalidate();
    }
}
