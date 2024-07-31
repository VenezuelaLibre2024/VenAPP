package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.h;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: r, reason: collision with root package name */
    private static final Interpolator f5490r = new LinearInterpolator();

    /* renamed from: s, reason: collision with root package name */
    private static final Interpolator f5491s = new f1.a();

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f5492t = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    private final c f5493a;

    /* renamed from: b, reason: collision with root package name */
    private float f5494b;

    /* renamed from: c, reason: collision with root package name */
    private Resources f5495c;

    /* renamed from: d, reason: collision with root package name */
    private Animator f5496d;

    /* renamed from: e, reason: collision with root package name */
    float f5497e;

    /* renamed from: f, reason: collision with root package name */
    boolean f5498f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f5499a;

        a(c cVar) {
            this.f5499a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f5499a);
            b.this.b(floatValue, this.f5499a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0088b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f5501a;

        C0088b(c cVar) {
            this.f5501a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f5501a, true);
            this.f5501a.A();
            this.f5501a.l();
            b bVar = b.this;
            if (!bVar.f5498f) {
                bVar.f5497e += 1.0f;
                return;
            }
            bVar.f5498f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f5501a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f5497e = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final RectF f5503a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f5504b;

        /* renamed from: c, reason: collision with root package name */
        final Paint f5505c;

        /* renamed from: d, reason: collision with root package name */
        final Paint f5506d;

        /* renamed from: e, reason: collision with root package name */
        float f5507e;

        /* renamed from: f, reason: collision with root package name */
        float f5508f;

        /* renamed from: g, reason: collision with root package name */
        float f5509g;

        /* renamed from: h, reason: collision with root package name */
        float f5510h;

        /* renamed from: i, reason: collision with root package name */
        int[] f5511i;

        /* renamed from: j, reason: collision with root package name */
        int f5512j;

        /* renamed from: k, reason: collision with root package name */
        float f5513k;

        /* renamed from: l, reason: collision with root package name */
        float f5514l;

        /* renamed from: m, reason: collision with root package name */
        float f5515m;

        /* renamed from: n, reason: collision with root package name */
        boolean f5516n;

        /* renamed from: o, reason: collision with root package name */
        Path f5517o;

        /* renamed from: p, reason: collision with root package name */
        float f5518p;

        /* renamed from: q, reason: collision with root package name */
        float f5519q;

        /* renamed from: r, reason: collision with root package name */
        int f5520r;

        /* renamed from: s, reason: collision with root package name */
        int f5521s;

        /* renamed from: t, reason: collision with root package name */
        int f5522t;

        /* renamed from: u, reason: collision with root package name */
        int f5523u;

        c() {
            Paint paint = new Paint();
            this.f5504b = paint;
            Paint paint2 = new Paint();
            this.f5505c = paint2;
            Paint paint3 = new Paint();
            this.f5506d = paint3;
            this.f5507e = 0.0f;
            this.f5508f = 0.0f;
            this.f5509g = 0.0f;
            this.f5510h = 5.0f;
            this.f5518p = 1.0f;
            this.f5522t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f5513k = this.f5507e;
            this.f5514l = this.f5508f;
            this.f5515m = this.f5509g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f5503a;
            float f10 = this.f5519q;
            float f11 = (this.f5510h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f5520r * this.f5518p) / 2.0f, this.f5510h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f5507e;
            float f13 = this.f5509g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f5508f + f13) * 360.0f) - f14;
            this.f5504b.setColor(this.f5523u);
            this.f5504b.setAlpha(this.f5522t);
            float f16 = this.f5510h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f5506d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f5504b);
            b(canvas, f14, f15, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f5516n) {
                Path path = this.f5517o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f5517o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f5520r * this.f5518p) / 2.0f;
                this.f5517o.moveTo(0.0f, 0.0f);
                this.f5517o.lineTo(this.f5520r * this.f5518p, 0.0f);
                Path path3 = this.f5517o;
                float f13 = this.f5520r;
                float f14 = this.f5518p;
                path3.lineTo((f13 * f14) / 2.0f, this.f5521s * f14);
                this.f5517o.offset((min + rectF.centerX()) - f12, rectF.centerY() + (this.f5510h / 2.0f));
                this.f5517o.close();
                this.f5505c.setColor(this.f5523u);
                this.f5505c.setAlpha(this.f5522t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f5517o, this.f5505c);
                canvas.restore();
            }
        }

        int c() {
            return this.f5522t;
        }

        float d() {
            return this.f5508f;
        }

        int e() {
            return this.f5511i[f()];
        }

        int f() {
            return (this.f5512j + 1) % this.f5511i.length;
        }

        float g() {
            return this.f5507e;
        }

        int h() {
            return this.f5511i[this.f5512j];
        }

        float i() {
            return this.f5514l;
        }

        float j() {
            return this.f5515m;
        }

        float k() {
            return this.f5513k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f5513k = 0.0f;
            this.f5514l = 0.0f;
            this.f5515m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f5522t = i10;
        }

        void o(float f10, float f11) {
            this.f5520r = (int) f10;
            this.f5521s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f5518p) {
                this.f5518p = f10;
            }
        }

        void q(float f10) {
            this.f5519q = f10;
        }

        void r(int i10) {
            this.f5523u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f5504b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f5512j = i10;
            this.f5523u = this.f5511i[i10];
        }

        void u(int[] iArr) {
            this.f5511i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f5508f = f10;
        }

        void w(float f10) {
            this.f5509g = f10;
        }

        void x(boolean z10) {
            if (this.f5516n != z10) {
                this.f5516n = z10;
            }
        }

        void y(float f10) {
            this.f5507e = f10;
        }

        void z(float f10) {
            this.f5510h = f10;
            this.f5504b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f5495c = ((Context) h.k(context)).getResources();
        c cVar = new c();
        this.f5493a = cVar;
        cVar.u(f5492t);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float floor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((floor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void h(float f10) {
        this.f5494b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f5493a;
        float f14 = this.f5495c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f5493a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f5490r);
        ofFloat.addListener(new C0088b(cVar));
        this.f5496d = ofFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f5498f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                f11 = (f5491s.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k10 = cVar.k() + 0.79f;
                interpolation = k10 - (((1.0f - f5491s.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = k10;
            }
            float f12 = j10 + (0.20999998f * f10);
            float f13 = (f10 + this.f5497e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(f11);
            cVar.w(f12);
            h(f13);
        }
    }

    public void d(boolean z10) {
        this.f5493a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f5494b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f5493a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f5493a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f5493a.u(iArr);
        this.f5493a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f5493a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5493a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5496d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f5493a.y(f10);
        this.f5493a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f5493a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (i10 == 0) {
            f10 = 12.0f;
            f11 = 6.0f;
            f12 = 11.0f;
            f13 = 3.0f;
        } else {
            f10 = 10.0f;
            f11 = 5.0f;
            f12 = 7.5f;
            f13 = 2.5f;
        }
        i(f12, f13, f10, f11);
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        cVar.r(f10 > 0.75f ? c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()) : cVar.h());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5493a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5493a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j10;
        this.f5496d.cancel();
        this.f5493a.A();
        if (this.f5493a.d() != this.f5493a.g()) {
            this.f5498f = true;
            animator = this.f5496d;
            j10 = 666;
        } else {
            this.f5493a.t(0);
            this.f5493a.m();
            animator = this.f5496d;
            j10 = 1332;
        }
        animator.setDuration(j10);
        this.f5496d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5496d.cancel();
        h(0.0f);
        this.f5493a.x(false);
        this.f5493a.t(0);
        this.f5493a.m();
        invalidateSelf();
    }
}
