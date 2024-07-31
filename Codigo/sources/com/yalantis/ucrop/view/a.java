package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import bi.i;
import ci.c;
import com.yalantis.ucrop.view.b;
import di.d;
import fi.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class a extends com.yalantis.ucrop.view.b {
    private final RectF F;
    private final Matrix G;
    private float H;
    private float I;
    private c J;
    private Runnable K;
    private Runnable L;
    private float M;
    private float N;
    private int O;
    private int P;
    private long Q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class RunnableC0199a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f13621a;

        /* renamed from: b, reason: collision with root package name */
        private final long f13622b;

        /* renamed from: c, reason: collision with root package name */
        private final long f13623c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private final float f13624d;

        /* renamed from: e, reason: collision with root package name */
        private final float f13625e;

        /* renamed from: f, reason: collision with root package name */
        private final float f13626f;

        /* renamed from: r, reason: collision with root package name */
        private final float f13627r;

        /* renamed from: s, reason: collision with root package name */
        private final float f13628s;

        /* renamed from: t, reason: collision with root package name */
        private final float f13629t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f13630u;

        public RunnableC0199a(a aVar, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.f13621a = new WeakReference<>(aVar);
            this.f13622b = j10;
            this.f13624d = f10;
            this.f13625e = f11;
            this.f13626f = f12;
            this.f13627r = f13;
            this.f13628s = f14;
            this.f13629t = f15;
            this.f13630u = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = this.f13621a.get();
            if (aVar == null) {
                return;
            }
            float min = (float) Math.min(this.f13622b, System.currentTimeMillis() - this.f13623c);
            float b10 = fi.b.b(min, 0.0f, this.f13626f, (float) this.f13622b);
            float b11 = fi.b.b(min, 0.0f, this.f13627r, (float) this.f13622b);
            float a10 = fi.b.a(min, 0.0f, this.f13629t, (float) this.f13622b);
            if (min < ((float) this.f13622b)) {
                float[] fArr = aVar.f13639e;
                aVar.o(b10 - (fArr[0] - this.f13624d), b11 - (fArr[1] - this.f13625e));
                if (!this.f13630u) {
                    aVar.F(this.f13628s + a10, aVar.F.centerX(), aVar.F.centerY());
                }
                if (aVar.x()) {
                    return;
                }
                aVar.post(this);
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f13631a;

        /* renamed from: b, reason: collision with root package name */
        private final long f13632b;

        /* renamed from: c, reason: collision with root package name */
        private final long f13633c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private final float f13634d;

        /* renamed from: e, reason: collision with root package name */
        private final float f13635e;

        /* renamed from: f, reason: collision with root package name */
        private final float f13636f;

        /* renamed from: r, reason: collision with root package name */
        private final float f13637r;

        public b(a aVar, long j10, float f10, float f11, float f12, float f13) {
            this.f13631a = new WeakReference<>(aVar);
            this.f13632b = j10;
            this.f13634d = f10;
            this.f13635e = f11;
            this.f13636f = f12;
            this.f13637r = f13;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = this.f13631a.get();
            if (aVar == null) {
                return;
            }
            float min = (float) Math.min(this.f13632b, System.currentTimeMillis() - this.f13633c);
            float a10 = fi.b.a(min, 0.0f, this.f13635e, (float) this.f13632b);
            if (min >= ((float) this.f13632b)) {
                aVar.B();
            } else {
                aVar.F(this.f13634d + a10, this.f13636f, this.f13637r);
                aVar.post(this);
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.F = new RectF();
        this.G = new Matrix();
        this.I = 10.0f;
        this.L = null;
        this.O = 0;
        this.P = 0;
        this.Q = 500L;
    }

    private void C(float f10, float f11) {
        float width = this.F.width();
        float height = this.F.height();
        float max = Math.max(this.F.width() / f10, this.F.height() / f11);
        RectF rectF = this.F;
        float f12 = ((width - (f10 * max)) / 2.0f) + rectF.left;
        float f13 = ((height - (f11 * max)) / 2.0f) + rectF.top;
        this.f13641r.reset();
        this.f13641r.postScale(max, max);
        this.f13641r.postTranslate(f12, f13);
        setImageMatrix(this.f13641r);
    }

    private float[] s() {
        this.G.reset();
        this.G.setRotate(-getCurrentAngle());
        float[] fArr = this.f13638d;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] b10 = g.b(this.F);
        this.G.mapPoints(copyOf);
        this.G.mapPoints(b10);
        RectF d10 = g.d(copyOf);
        RectF d11 = g.d(b10);
        float f10 = d10.left - d11.left;
        float f11 = d10.top - d11.top;
        float f12 = d10.right - d11.right;
        float f13 = d10.bottom - d11.bottom;
        float[] fArr2 = new float[4];
        if (f10 <= 0.0f) {
            f10 = 0.0f;
        }
        fArr2[0] = f10;
        if (f11 <= 0.0f) {
            f11 = 0.0f;
        }
        fArr2[1] = f11;
        if (f12 >= 0.0f) {
            f12 = 0.0f;
        }
        fArr2[2] = f12;
        if (f13 >= 0.0f) {
            f13 = 0.0f;
        }
        fArr2[3] = f13;
        this.G.reset();
        this.G.setRotate(getCurrentAngle());
        this.G.mapPoints(fArr2);
        return fArr2;
    }

    private void t() {
        if (getDrawable() == null) {
            return;
        }
        u(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
    }

    private void u(float f10, float f11) {
        float min = Math.min(Math.min(this.F.width() / f10, this.F.width() / f11), Math.min(this.F.height() / f11, this.F.height() / f10));
        this.N = min;
        this.M = min * this.I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(i.Z, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(i.f6585a0, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.H = 0.0f;
        } else {
            this.H = abs / abs2;
        }
    }

    public void B() {
        setImageToWrapCropBounds(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D(float f10, float f11, float f12, long j10) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j10, currentScale, f10 - currentScale, f11, f12);
        this.L = bVar;
        post(bVar);
    }

    public void E(float f10) {
        F(f10, this.F.centerX(), this.F.centerY());
    }

    public void F(float f10, float f11, float f12) {
        if (f10 <= getMaxScale()) {
            n(f10 / getCurrentScale(), f11, f12);
        }
    }

    public void G(float f10) {
        H(f10, this.F.centerX(), this.F.centerY());
    }

    public void H(float f10, float f11, float f12) {
        if (f10 >= getMinScale()) {
            n(f10 / getCurrentScale(), f11, f12);
        }
    }

    public c getCropBoundsChangeListener() {
        return this.J;
    }

    public float getMaxScale() {
        return this.M;
    }

    public float getMinScale() {
        return this.N;
    }

    public float getTargetAspectRatio() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yalantis.ucrop.view.b
    public void l() {
        super.l();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.H == 0.0f) {
            this.H = intrinsicWidth / intrinsicHeight;
        }
        int i10 = this.f13642s;
        float f10 = this.H;
        int i11 = (int) (i10 / f10);
        int i12 = this.f13643t;
        if (i11 > i12) {
            this.F.set((i10 - ((int) (i12 * f10))) / 2, 0.0f, r4 + r2, i12);
        } else {
            this.F.set(0.0f, (i12 - i11) / 2, i10, i11 + r6);
        }
        u(intrinsicWidth, intrinsicHeight);
        C(intrinsicWidth, intrinsicHeight);
        c cVar = this.J;
        if (cVar != null) {
            cVar.a(this.H);
        }
        b.InterfaceC0200b interfaceC0200b = this.f13644u;
        if (interfaceC0200b != null) {
            interfaceC0200b.c(getCurrentScale());
            this.f13644u.d(getCurrentAngle());
        }
    }

    @Override // com.yalantis.ucrop.view.b
    public void n(float f10, float f11, float f12) {
        if ((f10 <= 1.0f || getCurrentScale() * f10 > getMaxScale()) && (f10 >= 1.0f || getCurrentScale() * f10 < getMinScale())) {
            return;
        }
        super.n(f10, f11, f12);
    }

    public void setCropBoundsChangeListener(c cVar) {
        this.J = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.H = rectF.width() / rectF.height();
        this.F.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        t();
        B();
    }

    public void setImageToWrapCropBounds(boolean z10) {
        float f10;
        float max;
        float f11;
        if (!this.f13648y || x()) {
            return;
        }
        float[] fArr = this.f13639e;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float currentScale = getCurrentScale();
        float centerX = this.F.centerX() - f12;
        float centerY = this.F.centerY() - f13;
        this.G.reset();
        this.G.setTranslate(centerX, centerY);
        float[] fArr2 = this.f13638d;
        float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.G.mapPoints(copyOf);
        boolean y10 = y(copyOf);
        if (y10) {
            float[] s10 = s();
            float f14 = -(s10[0] + s10[2]);
            f11 = -(s10[1] + s10[3]);
            f10 = f14;
            max = 0.0f;
        } else {
            RectF rectF = new RectF(this.F);
            this.G.reset();
            this.G.setRotate(getCurrentAngle());
            this.G.mapRect(rectF);
            float[] c10 = g.c(this.f13638d);
            f10 = centerX;
            max = (Math.max(rectF.width() / c10[0], rectF.height() / c10[1]) * currentScale) - currentScale;
            f11 = centerY;
        }
        if (z10) {
            RunnableC0199a runnableC0199a = new RunnableC0199a(this, this.Q, f12, f13, f10, f11, currentScale, max, y10);
            this.K = runnableC0199a;
            post(runnableC0199a);
        } else {
            o(f10, f11);
            if (y10) {
                return;
            }
            F(currentScale + max, this.F.centerX(), this.F.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.Q = j10;
    }

    public void setMaxResultImageSizeX(int i10) {
        this.O = i10;
    }

    public void setMaxResultImageSizeY(int i10) {
        this.P = i10;
    }

    public void setMaxScaleMultiplier(float f10) {
        this.I = f10;
    }

    public void setTargetAspectRatio(float f10) {
        if (getDrawable() == null) {
            this.H = f10;
            return;
        }
        if (f10 == 0.0f) {
            f10 = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        }
        this.H = f10;
        c cVar = this.J;
        if (cVar != null) {
            cVar.a(this.H);
        }
    }

    public void v() {
        removeCallbacks(this.K);
        removeCallbacks(this.L);
    }

    public void w(Bitmap.CompressFormat compressFormat, int i10, ci.a aVar) {
        v();
        setImageToWrapCropBounds(false);
        d dVar = new d(this.F, g.d(this.f13638d), getCurrentScale(), getCurrentAngle());
        di.b bVar = new di.b(this.O, this.P, compressFormat, i10, getImageInputPath(), getImageOutputPath(), getExifInfo());
        bVar.j(getImageInputUri());
        bVar.k(getImageOutputUri());
        new ei.a(getContext(), getViewBitmap(), dVar, bVar, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    protected boolean x() {
        return y(this.f13638d);
    }

    protected boolean y(float[] fArr) {
        this.G.reset();
        this.G.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.G.mapPoints(copyOf);
        float[] b10 = g.b(this.F);
        this.G.mapPoints(b10);
        return g.d(copyOf).contains(g.d(b10));
    }

    public void z(float f10) {
        m(f10, this.F.centerX(), this.F.centerY());
    }
}
