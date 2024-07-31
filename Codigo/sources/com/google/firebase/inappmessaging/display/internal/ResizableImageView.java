package com.google.firebase.inappmessaging.display.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import ud.m;

/* loaded from: classes.dex */
public class ResizableImageView extends AppCompatImageView {

    /* renamed from: d, reason: collision with root package name */
    private int f11932d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f11933a;

        /* renamed from: b, reason: collision with root package name */
        final int f11934b;

        private b(int i10, int i11) {
            this.f11933a = i10;
            this.f11934b = i11;
        }
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    private b c(int i10, int i11) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i10 > maxWidth) {
            m.c("Image: capping width", maxWidth);
            i11 = (i11 * maxWidth) / i10;
            i10 = maxWidth;
        }
        if (i11 > maxHeight) {
            m.c("Image: capping height", maxHeight);
            i10 = (i10 * maxHeight) / i11;
        } else {
            maxHeight = i11;
        }
        return new b(i10, maxHeight);
    }

    private void d() {
        int max = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int max2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = max;
        float f11 = max2;
        m.d("Image: min width, height", f10, f11);
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        m.d("Image: actual width, height", f12, f13);
        float f14 = measuredWidth < max ? f10 / f12 : 1.0f;
        float f15 = measuredHeight < max2 ? f11 / f13 : 1.0f;
        if (f14 <= f15) {
            f14 = f15;
        }
        if (f14 > 1.0d) {
            int ceil = (int) Math.ceil(f12 * f14);
            int ceil2 = (int) Math.ceil(f13 * f14);
            m.a("Measured dimension (" + measuredWidth + "x" + measuredHeight + ") too small.  Resizing to " + ceil + "x" + ceil2);
            b c10 = c(ceil, ceil2);
            setMeasuredDimension(c10.f11933a, c10.f11934b);
        }
    }

    private void e(Context context) {
        this.f11932d = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    private void f(Drawable drawable) {
        m.d("Image: intrinsic width, height", drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        b c10 = c((int) Math.ceil((r0 * this.f11932d) / 160), (int) Math.ceil((r5 * this.f11932d) / 160));
        m.d("Image: new target dimensions", c10.f11933a, c10.f11934b);
        setMeasuredDimension(c10.f11933a, c10.f11934b);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        f(drawable);
        d();
    }
}
