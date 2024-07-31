package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import bi.b;
import bi.c;

/* loaded from: classes3.dex */
public class HorizontalProgressWheelView extends View {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f13659a;

    /* renamed from: b, reason: collision with root package name */
    private a f13660b;

    /* renamed from: c, reason: collision with root package name */
    private float f13661c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f13662d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f13663e;

    /* renamed from: f, reason: collision with root package name */
    private int f13664f;

    /* renamed from: r, reason: collision with root package name */
    private int f13665r;

    /* renamed from: s, reason: collision with root package name */
    private int f13666s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13667t;

    /* renamed from: u, reason: collision with root package name */
    private float f13668u;

    /* renamed from: v, reason: collision with root package name */
    private int f13669v;

    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();

        void c(float f10, float f11);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13659a = new Rect();
        a();
    }

    private void a() {
        this.f13669v = androidx.core.content.a.getColor(getContext(), b.f6536m);
        this.f13664f = getContext().getResources().getDimensionPixelSize(c.f6545i);
        this.f13665r = getContext().getResources().getDimensionPixelSize(c.f6542f);
        this.f13666s = getContext().getResources().getDimensionPixelSize(c.f6543g);
        Paint paint = new Paint(1);
        this.f13662d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f13662d.setStrokeWidth(this.f13664f);
        this.f13662d.setColor(getResources().getColor(b.f6530g));
        Paint paint2 = new Paint(this.f13662d);
        this.f13663e = paint2;
        paint2.setColor(this.f13669v);
        this.f13663e.setStrokeCap(Paint.Cap.ROUND);
        this.f13663e.setStrokeWidth(getContext().getResources().getDimensionPixelSize(c.f6546j));
    }

    private void b(MotionEvent motionEvent, float f10) {
        this.f13668u -= f10;
        postInvalidate();
        this.f13661c = motionEvent.getX();
        a aVar = this.f13660b;
        if (aVar != null) {
            aVar.c(-f10, this.f13668u);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Paint paint;
        float f10;
        super.onDraw(canvas);
        canvas.getClipBounds(this.f13659a);
        int width = this.f13659a.width() / (this.f13664f + this.f13666s);
        float f11 = this.f13668u % (r2 + r1);
        for (int i10 = 0; i10 < width; i10++) {
            int i11 = width / 4;
            if (i10 < i11) {
                paint = this.f13662d;
                f10 = i10;
            } else if (i10 > (width * 3) / 4) {
                paint = this.f13662d;
                f10 = width - i10;
            } else {
                this.f13662d.setAlpha(255);
                float f12 = -f11;
                Rect rect = this.f13659a;
                float f13 = rect.left + f12 + ((this.f13664f + this.f13666s) * i10);
                float centerY = rect.centerY() - (this.f13665r / 4.0f);
                Rect rect2 = this.f13659a;
                canvas.drawLine(f13, centerY, f12 + rect2.left + ((this.f13664f + this.f13666s) * i10), rect2.centerY() + (this.f13665r / 4.0f), this.f13662d);
            }
            paint.setAlpha((int) ((f10 / i11) * 255.0f));
            float f122 = -f11;
            Rect rect3 = this.f13659a;
            float f132 = rect3.left + f122 + ((this.f13664f + this.f13666s) * i10);
            float centerY2 = rect3.centerY() - (this.f13665r / 4.0f);
            Rect rect22 = this.f13659a;
            canvas.drawLine(f132, centerY2, f122 + rect22.left + ((this.f13664f + this.f13666s) * i10), rect22.centerY() + (this.f13665r / 4.0f), this.f13662d);
        }
        canvas.drawLine(this.f13659a.centerX(), this.f13659a.centerY() - (this.f13665r / 2.0f), this.f13659a.centerX(), (this.f13665r / 2.0f) + this.f13659a.centerY(), this.f13663e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13661c = motionEvent.getX();
        } else if (action == 1) {
            a aVar = this.f13660b;
            if (aVar != null) {
                this.f13667t = false;
                aVar.a();
            }
        } else if (action == 2) {
            float x10 = motionEvent.getX() - this.f13661c;
            if (x10 != 0.0f) {
                if (!this.f13667t) {
                    this.f13667t = true;
                    a aVar2 = this.f13660b;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                }
                b(motionEvent, x10);
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i10) {
        this.f13669v = i10;
        this.f13663e.setColor(i10);
        invalidate();
    }

    public void setScrollingListener(a aVar) {
        this.f13660b = aVar;
    }
}
