package com.facebook.ads.redexgen.uinode;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: com.facebook.ads.redexgen.X.NK */
/* loaded from: assets/audience_network.dex */
public final class C3630NK extends ProgressBar {
    public static final int A02 = Color.argb(26, 0, 0, 0);
    public static final int A03 = Color.rgb(88, 144, 255);
    public Paint A00;
    public Rect A01;

    public C3630NK(C4337Yn c4337Yn, AttributeSet attributeSet, int i10) {
        super(c4337Yn, attributeSet, i10);
        A01();
    }

    private Drawable A00() {
        return new LayerDrawable(new Drawable[]{new ColorDrawable(0), new ClipDrawable(new ColorDrawable(A03), 3, 1)});
    }

    private void A01() {
        setIndeterminate(false);
        setMax(100);
        setProgressDrawable(A00());
        this.A01 = new Rect();
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A00.setColor(A02);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        canvas.drawRect(this.A01, this.A00);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.A01.set(0, 0, getMeasuredWidth(), 2);
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        super.setProgress(i10 == 100 ? 0 : Math.max(i10, 5));
    }
}
