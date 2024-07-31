package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import bi.C1797i;
import ci.InterfaceC2008a;
import ci.InterfaceC2010c;
import com.yalantis.ucrop.view.C6801b;
import fi.C7357b;
import fi.C7362g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p068di.C6973b;
import p068di.C6975d;
import p086ei.AsyncTaskC7195a;

/* renamed from: com.yalantis.ucrop.view.a */
/* loaded from: classes3.dex */
public class C6800a extends C6801b {

    /* renamed from: F */
    private final RectF f14958F;

    /* renamed from: G */
    private final Matrix f14959G;

    /* renamed from: H */
    private float f14960H;

    /* renamed from: I */
    private float f14961I;

    /* renamed from: J */
    private InterfaceC2010c f14962J;

    /* renamed from: K */
    private Runnable f14963K;

    /* renamed from: L */
    private Runnable f14964L;

    /* renamed from: M */
    private float f14965M;

    /* renamed from: N */
    private float f14966N;

    /* renamed from: O */
    private int f14967O;

    /* renamed from: P */
    private int f14968P;

    /* renamed from: Q */
    private long f14969Q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.a$a */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        private final WeakReference<C6800a> f14970a;

        /* renamed from: b */
        private final long f14971b;

        /* renamed from: c */
        private final long f14972c = System.currentTimeMillis();

        /* renamed from: d */
        private final float f14973d;

        /* renamed from: e */
        private final float f14974e;

        /* renamed from: f */
        private final float f14975f;

        /* renamed from: r */
        private final float f14976r;

        /* renamed from: s */
        private final float f14977s;

        /* renamed from: t */
        private final float f14978t;

        /* renamed from: u */
        private final boolean f14979u;

        public a(C6800a c6800a, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.f14970a = new WeakReference<>(c6800a);
            this.f14971b = j10;
            this.f14973d = f10;
            this.f14974e = f11;
            this.f14975f = f12;
            this.f14976r = f13;
            this.f14977s = f14;
            this.f14978t = f15;
            this.f14979u = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6800a c6800a = this.f14970a.get();
            if (c6800a == null) {
                return;
            }
            float min = (float) Math.min(this.f14971b, System.currentTimeMillis() - this.f14972c);
            float m22199b = C7357b.m22199b(min, 0.0f, this.f14975f, (float) this.f14971b);
            float m22199b2 = C7357b.m22199b(min, 0.0f, this.f14976r, (float) this.f14971b);
            float m22198a = C7357b.m22198a(min, 0.0f, this.f14978t, (float) this.f14971b);
            if (min < ((float) this.f14971b)) {
                float[] fArr = c6800a.f14993e;
                c6800a.m19667o(m22199b - (fArr[0] - this.f14973d), m22199b2 - (fArr[1] - this.f14974e));
                if (!this.f14979u) {
                    c6800a.m19647F(this.f14977s + m22198a, c6800a.f14958F.centerX(), c6800a.f14958F.centerY());
                }
                if (c6800a.m19654x()) {
                    return;
                }
                c6800a.post(this);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.a$b */
    /* loaded from: classes3.dex */
    private static class b implements Runnable {

        /* renamed from: a */
        private final WeakReference<C6800a> f14980a;

        /* renamed from: b */
        private final long f14981b;

        /* renamed from: c */
        private final long f14982c = System.currentTimeMillis();

        /* renamed from: d */
        private final float f14983d;

        /* renamed from: e */
        private final float f14984e;

        /* renamed from: f */
        private final float f14985f;

        /* renamed from: r */
        private final float f14986r;

        public b(C6800a c6800a, long j10, float f10, float f11, float f12, float f13) {
            this.f14980a = new WeakReference<>(c6800a);
            this.f14981b = j10;
            this.f14983d = f10;
            this.f14984e = f11;
            this.f14985f = f12;
            this.f14986r = f13;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6800a c6800a = this.f14980a.get();
            if (c6800a == null) {
                return;
            }
            float min = (float) Math.min(this.f14981b, System.currentTimeMillis() - this.f14982c);
            float m22198a = C7357b.m22198a(min, 0.0f, this.f14984e, (float) this.f14981b);
            if (min >= ((float) this.f14981b)) {
                c6800a.m19644B();
            } else {
                c6800a.m19647F(this.f14983d + m22198a, this.f14985f, this.f14986r);
                c6800a.post(this);
            }
        }
    }

    public C6800a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6800a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14958F = new RectF();
        this.f14959G = new Matrix();
        this.f14961I = 10.0f;
        this.f14964L = null;
        this.f14967O = 0;
        this.f14968P = 0;
        this.f14969Q = 500L;
    }

    /* renamed from: C */
    private void m19638C(float f10, float f11) {
        float width = this.f14958F.width();
        float height = this.f14958F.height();
        float max = Math.max(this.f14958F.width() / f10, this.f14958F.height() / f11);
        RectF rectF = this.f14958F;
        float f12 = ((width - (f10 * max)) / 2.0f) + rectF.left;
        float f13 = ((height - (f11 * max)) / 2.0f) + rectF.top;
        this.f14995r.reset();
        this.f14995r.postScale(max, max);
        this.f14995r.postTranslate(f12, f13);
        setImageMatrix(this.f14995r);
    }

    /* renamed from: s */
    private float[] m19640s() {
        this.f14959G.reset();
        this.f14959G.setRotate(-getCurrentAngle());
        float[] fArr = this.f14992d;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] m22225b = C7362g.m22225b(this.f14958F);
        this.f14959G.mapPoints(copyOf);
        this.f14959G.mapPoints(m22225b);
        RectF m22227d = C7362g.m22227d(copyOf);
        RectF m22227d2 = C7362g.m22227d(m22225b);
        float f10 = m22227d.left - m22227d2.left;
        float f11 = m22227d.top - m22227d2.top;
        float f12 = m22227d.right - m22227d2.right;
        float f13 = m22227d.bottom - m22227d2.bottom;
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
        this.f14959G.reset();
        this.f14959G.setRotate(getCurrentAngle());
        this.f14959G.mapPoints(fArr2);
        return fArr2;
    }

    /* renamed from: t */
    private void m19641t() {
        if (getDrawable() == null) {
            return;
        }
        m19642u(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
    }

    /* renamed from: u */
    private void m19642u(float f10, float f11) {
        float min = Math.min(Math.min(this.f14958F.width() / f10, this.f14958F.width() / f11), Math.min(this.f14958F.height() / f11, this.f14958F.height() / f10));
        this.f14966N = min;
        this.f14965M = min * this.f14961I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public void m19643A(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(C1797i.f7532Z, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(C1797i.f7534a0, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.f14960H = 0.0f;
        } else {
            this.f14960H = abs / abs2;
        }
    }

    /* renamed from: B */
    public void m19644B() {
        setImageToWrapCropBounds(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public void m19645D(float f10, float f11, float f12, long j10) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j10, currentScale, f10 - currentScale, f11, f12);
        this.f14964L = bVar;
        post(bVar);
    }

    /* renamed from: E */
    public void m19646E(float f10) {
        m19647F(f10, this.f14958F.centerX(), this.f14958F.centerY());
    }

    /* renamed from: F */
    public void m19647F(float f10, float f11, float f12) {
        if (f10 <= getMaxScale()) {
            mo19651n(f10 / getCurrentScale(), f11, f12);
        }
    }

    /* renamed from: G */
    public void m19648G(float f10) {
        m19649H(f10, this.f14958F.centerX(), this.f14958F.centerY());
    }

    /* renamed from: H */
    public void m19649H(float f10, float f11, float f12) {
        if (f10 >= getMinScale()) {
            mo19651n(f10 / getCurrentScale(), f11, f12);
        }
    }

    public InterfaceC2010c getCropBoundsChangeListener() {
        return this.f14962J;
    }

    public float getMaxScale() {
        return this.f14965M;
    }

    public float getMinScale() {
        return this.f14966N;
    }

    public float getTargetAspectRatio() {
        return this.f14960H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yalantis.ucrop.view.C6801b
    /* renamed from: l */
    public void mo19650l() {
        super.mo19650l();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.f14960H == 0.0f) {
            this.f14960H = intrinsicWidth / intrinsicHeight;
        }
        int i10 = this.f14996s;
        float f10 = this.f14960H;
        int i11 = (int) (i10 / f10);
        int i12 = this.f14997t;
        if (i11 > i12) {
            this.f14958F.set((i10 - ((int) (i12 * f10))) / 2, 0.0f, r4 + r2, i12);
        } else {
            this.f14958F.set(0.0f, (i12 - i11) / 2, i10, i11 + r6);
        }
        m19642u(intrinsicWidth, intrinsicHeight);
        m19638C(intrinsicWidth, intrinsicHeight);
        InterfaceC2010c interfaceC2010c = this.f14962J;
        if (interfaceC2010c != null) {
            interfaceC2010c.mo10307a(this.f14960H);
        }
        C6801b.b bVar = this.f14998u;
        if (bVar != null) {
            bVar.mo19587c(getCurrentScale());
            this.f14998u.mo19588d(getCurrentAngle());
        }
    }

    @Override // com.yalantis.ucrop.view.C6801b
    /* renamed from: n */
    public void mo19651n(float f10, float f11, float f12) {
        if ((f10 <= 1.0f || getCurrentScale() * f10 > getMaxScale()) && (f10 >= 1.0f || getCurrentScale() * f10 < getMinScale())) {
            return;
        }
        super.mo19651n(f10, f11, f12);
    }

    public void setCropBoundsChangeListener(InterfaceC2010c interfaceC2010c) {
        this.f14962J = interfaceC2010c;
    }

    public void setCropRect(RectF rectF) {
        this.f14960H = rectF.width() / rectF.height();
        this.f14958F.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        m19641t();
        m19644B();
    }

    public void setImageToWrapCropBounds(boolean z10) {
        float f10;
        float max;
        float f11;
        if (!this.f15002y || m19654x()) {
            return;
        }
        float[] fArr = this.f14993e;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float currentScale = getCurrentScale();
        float centerX = this.f14958F.centerX() - f12;
        float centerY = this.f14958F.centerY() - f13;
        this.f14959G.reset();
        this.f14959G.setTranslate(centerX, centerY);
        float[] fArr2 = this.f14992d;
        float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.f14959G.mapPoints(copyOf);
        boolean m19655y = m19655y(copyOf);
        if (m19655y) {
            float[] m19640s = m19640s();
            float f14 = -(m19640s[0] + m19640s[2]);
            f11 = -(m19640s[1] + m19640s[3]);
            f10 = f14;
            max = 0.0f;
        } else {
            RectF rectF = new RectF(this.f14958F);
            this.f14959G.reset();
            this.f14959G.setRotate(getCurrentAngle());
            this.f14959G.mapRect(rectF);
            float[] m22226c = C7362g.m22226c(this.f14992d);
            f10 = centerX;
            max = (Math.max(rectF.width() / m22226c[0], rectF.height() / m22226c[1]) * currentScale) - currentScale;
            f11 = centerY;
        }
        if (z10) {
            a aVar = new a(this, this.f14969Q, f12, f13, f10, f11, currentScale, max, m19655y);
            this.f14963K = aVar;
            post(aVar);
        } else {
            m19667o(f10, f11);
            if (m19655y) {
                return;
            }
            m19647F(currentScale + max, this.f14958F.centerX(), this.f14958F.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.f14969Q = j10;
    }

    public void setMaxResultImageSizeX(int i10) {
        this.f14967O = i10;
    }

    public void setMaxResultImageSizeY(int i10) {
        this.f14968P = i10;
    }

    public void setMaxScaleMultiplier(float f10) {
        this.f14961I = f10;
    }

    public void setTargetAspectRatio(float f10) {
        if (getDrawable() == null) {
            this.f14960H = f10;
            return;
        }
        if (f10 == 0.0f) {
            f10 = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        }
        this.f14960H = f10;
        InterfaceC2010c interfaceC2010c = this.f14962J;
        if (interfaceC2010c != null) {
            interfaceC2010c.mo10307a(this.f14960H);
        }
    }

    /* renamed from: v */
    public void m19652v() {
        removeCallbacks(this.f14963K);
        removeCallbacks(this.f14964L);
    }

    /* renamed from: w */
    public void m19653w(Bitmap.CompressFormat compressFormat, int i10, InterfaceC2008a interfaceC2008a) {
        m19652v();
        setImageToWrapCropBounds(false);
        C6975d c6975d = new C6975d(this.f14958F, C7362g.m22227d(this.f14992d), getCurrentScale(), getCurrentAngle());
        C6973b c6973b = new C6973b(this.f14967O, this.f14968P, compressFormat, i10, getImageInputPath(), getImageOutputPath(), getExifInfo());
        c6973b.m20186j(getImageInputUri());
        c6973b.m20187k(getImageOutputUri());
        new AsyncTaskC7195a(getContext(), getViewBitmap(), c6975d, c6973b, interfaceC2008a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: x */
    protected boolean m19654x() {
        return m19655y(this.f14992d);
    }

    /* renamed from: y */
    protected boolean m19655y(float[] fArr) {
        this.f14959G.reset();
        this.f14959G.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.f14959G.mapPoints(copyOf);
        float[] m22225b = C7362g.m22225b(this.f14958F);
        this.f14959G.mapPoints(m22225b);
        return C7362g.m22227d(copyOf).contains(C7362g.m22227d(m22225b));
    }

    /* renamed from: z */
    public void m19656z(float f10) {
        m19666m(f10, this.f14958F.centerX(), this.f14958F.centerY());
    }
}
