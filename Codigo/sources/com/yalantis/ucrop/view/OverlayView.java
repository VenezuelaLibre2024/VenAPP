package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import bi.c;
import bi.i;
import ci.d;
import fi.g;

/* loaded from: classes3.dex */
public class OverlayView extends View {
    private Paint A;
    private Paint B;
    private Paint C;
    private Paint D;
    private int E;
    private float F;
    private float G;
    private int H;
    private int I;
    private int J;
    private int K;
    private d L;
    private boolean M;

    /* renamed from: a, reason: collision with root package name */
    private final RectF f13602a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f13603b;

    /* renamed from: c, reason: collision with root package name */
    protected int f13604c;

    /* renamed from: d, reason: collision with root package name */
    protected int f13605d;

    /* renamed from: e, reason: collision with root package name */
    protected float[] f13606e;

    /* renamed from: f, reason: collision with root package name */
    protected float[] f13607f;

    /* renamed from: r, reason: collision with root package name */
    private int f13608r;

    /* renamed from: s, reason: collision with root package name */
    private int f13609s;

    /* renamed from: t, reason: collision with root package name */
    private float f13610t;

    /* renamed from: u, reason: collision with root package name */
    private float[] f13611u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13612v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13613w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f13614x;

    /* renamed from: y, reason: collision with root package name */
    private int f13615y;

    /* renamed from: z, reason: collision with root package name */
    private Path f13616z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13602a = new RectF();
        this.f13603b = new RectF();
        this.f13611u = null;
        this.f13616z = new Path();
        this.A = new Paint(1);
        this.B = new Paint(1);
        this.C = new Paint(1);
        this.D = new Paint(1);
        this.E = 0;
        this.F = -1.0f;
        this.G = -1.0f;
        this.H = -1;
        this.I = getResources().getDimensionPixelSize(c.f6540d);
        this.J = getResources().getDimensionPixelSize(c.f6541e);
        this.K = getResources().getDimensionPixelSize(c.f6539c);
        d();
    }

    private int c(float f10, float f11) {
        double d10 = this.I;
        int i10 = -1;
        for (int i11 = 0; i11 < 8; i11 += 2) {
            double sqrt = Math.sqrt(Math.pow(f10 - this.f13606e[i11], 2.0d) + Math.pow(f11 - this.f13606e[i11 + 1], 2.0d));
            if (sqrt < d10) {
                i10 = i11 / 2;
                d10 = sqrt;
            }
        }
        if (this.E == 1 && i10 < 0 && this.f13602a.contains(f10, f11)) {
            return 4;
        }
        return i10;
    }

    private void e(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i.f6593e0, getResources().getDimensionPixelSize(c.f6537a));
        int color = typedArray.getColor(i.f6591d0, getResources().getColor(bi.b.f6526c));
        this.C.setStrokeWidth(dimensionPixelSize);
        this.C.setColor(color);
        this.C.setStyle(Paint.Style.STROKE);
        this.D.setStrokeWidth(dimensionPixelSize * 3);
        this.D.setColor(color);
        this.D.setStyle(Paint.Style.STROKE);
    }

    private void f(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i.f6601i0, getResources().getDimensionPixelSize(c.f6538b));
        int color = typedArray.getColor(i.f6595f0, getResources().getColor(bi.b.f6527d));
        this.B.setStrokeWidth(dimensionPixelSize);
        this.B.setColor(color);
        this.f13608r = typedArray.getInt(i.f6599h0, 2);
        this.f13609s = typedArray.getInt(i.f6597g0, 2);
    }

    private void i(float f10, float f11) {
        this.f13603b.set(this.f13602a);
        int i10 = this.H;
        if (i10 == 0) {
            RectF rectF = this.f13603b;
            RectF rectF2 = this.f13602a;
            rectF.set(f10, f11, rectF2.right, rectF2.bottom);
        } else if (i10 == 1) {
            RectF rectF3 = this.f13603b;
            RectF rectF4 = this.f13602a;
            rectF3.set(rectF4.left, f11, f10, rectF4.bottom);
        } else if (i10 == 2) {
            RectF rectF5 = this.f13603b;
            RectF rectF6 = this.f13602a;
            rectF5.set(rectF6.left, rectF6.top, f10, f11);
        } else if (i10 == 3) {
            RectF rectF7 = this.f13603b;
            RectF rectF8 = this.f13602a;
            rectF7.set(f10, rectF8.top, rectF8.right, f11);
        } else if (i10 == 4) {
            this.f13603b.offset(f10 - this.F, f11 - this.G);
            if (this.f13603b.left <= getLeft() || this.f13603b.top <= getTop() || this.f13603b.right >= getRight() || this.f13603b.bottom >= getBottom()) {
                return;
            }
            this.f13602a.set(this.f13603b);
            j();
            postInvalidate();
            return;
        }
        boolean z10 = this.f13603b.height() >= ((float) this.J);
        boolean z11 = this.f13603b.width() >= ((float) this.J);
        RectF rectF9 = this.f13602a;
        rectF9.set(z11 ? this.f13603b.left : rectF9.left, z10 ? this.f13603b.top : rectF9.top, z11 ? this.f13603b.right : rectF9.right, z10 ? this.f13603b.bottom : rectF9.bottom);
        if (z10 || z11) {
            j();
            postInvalidate();
        }
    }

    private void j() {
        this.f13606e = g.b(this.f13602a);
        this.f13607f = g.a(this.f13602a);
        this.f13611u = null;
        this.f13616z.reset();
        this.f13616z.addCircle(this.f13602a.centerX(), this.f13602a.centerY(), Math.min(this.f13602a.width(), this.f13602a.height()) / 2.0f, Path.Direction.CW);
    }

    protected void a(Canvas canvas) {
        if (this.f13613w) {
            if (this.f13611u == null && !this.f13602a.isEmpty()) {
                this.f13611u = new float[(this.f13608r * 4) + (this.f13609s * 4)];
                int i10 = 0;
                for (int i11 = 0; i11 < this.f13608r; i11++) {
                    float[] fArr = this.f13611u;
                    int i12 = i10 + 1;
                    RectF rectF = this.f13602a;
                    fArr[i10] = rectF.left;
                    int i13 = i12 + 1;
                    float f10 = i11 + 1.0f;
                    float height = rectF.height() * (f10 / (this.f13608r + 1));
                    RectF rectF2 = this.f13602a;
                    fArr[i12] = height + rectF2.top;
                    float[] fArr2 = this.f13611u;
                    int i14 = i13 + 1;
                    fArr2[i13] = rectF2.right;
                    i10 = i14 + 1;
                    fArr2[i14] = (rectF2.height() * (f10 / (this.f13608r + 1))) + this.f13602a.top;
                }
                for (int i15 = 0; i15 < this.f13609s; i15++) {
                    float[] fArr3 = this.f13611u;
                    int i16 = i10 + 1;
                    float f11 = i15 + 1.0f;
                    float width = this.f13602a.width() * (f11 / (this.f13609s + 1));
                    RectF rectF3 = this.f13602a;
                    fArr3[i10] = width + rectF3.left;
                    float[] fArr4 = this.f13611u;
                    int i17 = i16 + 1;
                    fArr4[i16] = rectF3.top;
                    int i18 = i17 + 1;
                    float width2 = rectF3.width() * (f11 / (this.f13609s + 1));
                    RectF rectF4 = this.f13602a;
                    fArr4[i17] = width2 + rectF4.left;
                    i10 = i18 + 1;
                    this.f13611u[i18] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f13611u;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.B);
            }
        }
        if (this.f13612v) {
            canvas.drawRect(this.f13602a, this.C);
        }
        if (this.E != 0) {
            canvas.save();
            this.f13603b.set(this.f13602a);
            this.f13603b.inset(this.K, -r1);
            canvas.clipRect(this.f13603b, Region.Op.DIFFERENCE);
            this.f13603b.set(this.f13602a);
            this.f13603b.inset(-r1, this.K);
            canvas.clipRect(this.f13603b, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f13602a, this.D);
            canvas.restore();
        }
    }

    protected void b(Canvas canvas) {
        canvas.save();
        if (this.f13614x) {
            canvas.clipPath(this.f13616z, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f13602a, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f13615y);
        canvas.restore();
        if (this.f13614x) {
            canvas.drawCircle(this.f13602a.centerX(), this.f13602a.centerY(), Math.min(this.f13602a.width(), this.f13602a.height()) / 2.0f, this.A);
        }
    }

    protected void d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(TypedArray typedArray) {
        this.f13614x = typedArray.getBoolean(i.f6587b0, false);
        int color = typedArray.getColor(i.f6589c0, getResources().getColor(bi.b.f6528e));
        this.f13615y = color;
        this.A.setColor(color);
        this.A.setStyle(Paint.Style.STROKE);
        this.A.setStrokeWidth(1.0f);
        e(typedArray);
        this.f13612v = typedArray.getBoolean(i.f6603j0, true);
        f(typedArray);
        this.f13613w = typedArray.getBoolean(i.f6605k0, true);
    }

    public RectF getCropViewRect() {
        return this.f13602a;
    }

    public int getFreestyleCropMode() {
        return this.E;
    }

    public d getOverlayViewChangeListener() {
        return this.L;
    }

    public void h() {
        int i10 = this.f13604c;
        float f10 = this.f13610t;
        int i11 = (int) (i10 / f10);
        int i12 = this.f13605d;
        if (i11 > i12) {
            int i13 = (i10 - ((int) (i12 * f10))) / 2;
            this.f13602a.set(getPaddingLeft() + i13, getPaddingTop(), getPaddingLeft() + r1 + i13, getPaddingTop() + this.f13605d);
        } else {
            int i14 = (i12 - i11) / 2;
            this.f13602a.set(getPaddingLeft(), getPaddingTop() + i14, getPaddingLeft() + this.f13604c, getPaddingTop() + i11 + i14);
        }
        d dVar = this.L;
        if (dVar != null) {
            dVar.a(this.f13602a);
        }
        j();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        a(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f13604c = width - paddingLeft;
            this.f13605d = height - paddingTop;
            if (this.M) {
                this.M = false;
                setTargetAspectRatio(this.f13610t);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f13602a.isEmpty() && this.E != 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int c10 = c(x10, y10);
                this.H = c10;
                boolean z10 = c10 != -1;
                if (!z10) {
                    this.F = -1.0f;
                    this.G = -1.0f;
                } else if (this.F < 0.0f) {
                    this.F = x10;
                    this.G = y10;
                }
                return z10;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.H != -1) {
                float min = Math.min(Math.max(x10, getPaddingLeft()), getWidth() - getPaddingRight());
                float min2 = Math.min(Math.max(y10, getPaddingTop()), getHeight() - getPaddingBottom());
                i(min, min2);
                this.F = min;
                this.G = min2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.F = -1.0f;
                this.G = -1.0f;
                this.H = -1;
                d dVar = this.L;
                if (dVar != null) {
                    dVar.a(this.f13602a);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z10) {
        this.f13614x = z10;
    }

    public void setCropFrameColor(int i10) {
        this.C.setColor(i10);
    }

    public void setCropFrameStrokeWidth(int i10) {
        this.C.setStrokeWidth(i10);
    }

    public void setCropGridColor(int i10) {
        this.B.setColor(i10);
    }

    public void setCropGridColumnCount(int i10) {
        this.f13609s = i10;
        this.f13611u = null;
    }

    public void setCropGridRowCount(int i10) {
        this.f13608r = i10;
        this.f13611u = null;
    }

    public void setCropGridStrokeWidth(int i10) {
        this.B.setStrokeWidth(i10);
    }

    public void setDimmedColor(int i10) {
        this.f13615y = i10;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z10) {
        this.E = z10 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i10) {
        this.E = i10;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(d dVar) {
        this.L = dVar;
    }

    public void setShowCropFrame(boolean z10) {
        this.f13612v = z10;
    }

    public void setShowCropGrid(boolean z10) {
        this.f13613w = z10;
    }

    public void setTargetAspectRatio(float f10) {
        this.f13610t = f10;
        if (this.f13604c <= 0) {
            this.M = true;
        } else {
            h();
            postInvalidate();
        }
    }
}
