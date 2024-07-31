package com.yalantis.ucrop.view.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.i0;
import androidx.core.content.a;
import bi.b;
import bi.c;
import bi.i;
import java.util.Locale;

/* loaded from: classes3.dex */
public class AspectRatioTextView extends i0 {

    /* renamed from: s, reason: collision with root package name */
    private final float f13651s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f13652t;

    /* renamed from: u, reason: collision with root package name */
    private Paint f13653u;

    /* renamed from: v, reason: collision with root package name */
    private int f13654v;

    /* renamed from: w, reason: collision with root package name */
    private float f13655w;

    /* renamed from: x, reason: collision with root package name */
    private String f13656x;

    /* renamed from: y, reason: collision with root package name */
    private float f13657y;

    /* renamed from: z, reason: collision with root package name */
    private float f13658z;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13651s = 1.5f;
        this.f13652t = new Rect();
        t(context.obtainStyledAttributes(attributeSet, i.U));
    }

    private void r(int i10) {
        Paint paint = this.f13653u;
        if (paint != null) {
            paint.setColor(i10);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i10, a.getColor(getContext(), b.f6534k)}));
    }

    private void t(TypedArray typedArray) {
        setGravity(1);
        this.f13656x = typedArray.getString(i.V);
        this.f13657y = typedArray.getFloat(i.W, 0.0f);
        float f10 = typedArray.getFloat(i.X, 0.0f);
        this.f13658z = f10;
        float f11 = this.f13657y;
        if (f11 == 0.0f || f10 == 0.0f) {
            this.f13655w = 0.0f;
        } else {
            this.f13655w = f11 / f10;
        }
        this.f13654v = getContext().getResources().getDimensionPixelSize(c.f6544h);
        Paint paint = new Paint(1);
        this.f13653u = paint;
        paint.setStyle(Paint.Style.FILL);
        u();
        r(getResources().getColor(b.f6535l));
        typedArray.recycle();
    }

    private void u() {
        setText(!TextUtils.isEmpty(this.f13656x) ? this.f13656x : String.format(Locale.US, "%d:%d", Integer.valueOf((int) this.f13657y), Integer.valueOf((int) this.f13658z)));
    }

    private void v() {
        if (this.f13655w != 0.0f) {
            float f10 = this.f13657y;
            float f11 = this.f13658z;
            this.f13657y = f11;
            this.f13658z = f10;
            this.f13655w = f11 / f10;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f13652t);
            Rect rect = this.f13652t;
            float f10 = (rect.right - rect.left) / 2.0f;
            float f11 = rect.bottom - (rect.top / 2.0f);
            int i10 = this.f13654v;
            canvas.drawCircle(f10, f11 - (i10 * 1.5f), i10 / 2.0f, this.f13653u);
        }
    }

    public float s(boolean z10) {
        if (z10) {
            v();
            u();
        }
        return this.f13655w;
    }

    public void setActiveColor(int i10) {
        r(i10);
        invalidate();
    }

    public void setAspectRatio(di.a aVar) {
        this.f13656x = aVar.a();
        this.f13657y = aVar.b();
        float c10 = aVar.c();
        this.f13658z = c10;
        float f10 = this.f13657y;
        if (f10 == 0.0f || c10 == 0.0f) {
            this.f13655w = 0.0f;
        } else {
            this.f13655w = f10 / c10;
        }
        u();
    }
}
