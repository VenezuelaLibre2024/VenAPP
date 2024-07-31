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
import androidx.core.util.C0984h;
import p093f1.C7266a;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* loaded from: classes.dex */
public class C1426b extends Drawable implements Animatable {

    /* renamed from: r */
    private static final Interpolator f6315r = new LinearInterpolator();

    /* renamed from: s */
    private static final Interpolator f6316s = new C7266a();

    /* renamed from: t */
    private static final int[] f6317t = {-16777216};

    /* renamed from: a */
    private final c f6318a;

    /* renamed from: b */
    private float f6319b;

    /* renamed from: c */
    private Resources f6320c;

    /* renamed from: d */
    private Animator f6321d;

    /* renamed from: e */
    float f6322e;

    /* renamed from: f */
    boolean f6323f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ c f6324a;

        a(c cVar) {
            this.f6324a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1426b.this.m8179n(floatValue, this.f6324a);
            C1426b.this.m8171b(floatValue, this.f6324a, false);
            C1426b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* loaded from: classes.dex */
    public class b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ c f6326a;

        b(c cVar) {
            this.f6326a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C1426b.this.m8171b(1.0f, this.f6326a, true);
            this.f6326a.m8180A();
            this.f6326a.m8192l();
            C1426b c1426b = C1426b.this;
            if (!c1426b.f6323f) {
                c1426b.f6322e += 1.0f;
                return;
            }
            c1426b.f6323f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f6326a.m8204x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1426b.this.f6322e = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final RectF f6328a = new RectF();

        /* renamed from: b */
        final Paint f6329b;

        /* renamed from: c */
        final Paint f6330c;

        /* renamed from: d */
        final Paint f6331d;

        /* renamed from: e */
        float f6332e;

        /* renamed from: f */
        float f6333f;

        /* renamed from: g */
        float f6334g;

        /* renamed from: h */
        float f6335h;

        /* renamed from: i */
        int[] f6336i;

        /* renamed from: j */
        int f6337j;

        /* renamed from: k */
        float f6338k;

        /* renamed from: l */
        float f6339l;

        /* renamed from: m */
        float f6340m;

        /* renamed from: n */
        boolean f6341n;

        /* renamed from: o */
        Path f6342o;

        /* renamed from: p */
        float f6343p;

        /* renamed from: q */
        float f6344q;

        /* renamed from: r */
        int f6345r;

        /* renamed from: s */
        int f6346s;

        /* renamed from: t */
        int f6347t;

        /* renamed from: u */
        int f6348u;

        c() {
            Paint paint = new Paint();
            this.f6329b = paint;
            Paint paint2 = new Paint();
            this.f6330c = paint2;
            Paint paint3 = new Paint();
            this.f6331d = paint3;
            this.f6332e = 0.0f;
            this.f6333f = 0.0f;
            this.f6334g = 0.0f;
            this.f6335h = 5.0f;
            this.f6343p = 1.0f;
            this.f6347t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        void m8180A() {
            this.f6338k = this.f6332e;
            this.f6339l = this.f6333f;
            this.f6340m = this.f6334g;
        }

        /* renamed from: a */
        void m8181a(Canvas canvas, Rect rect) {
            RectF rectF = this.f6328a;
            float f10 = this.f6344q;
            float f11 = (this.f6335h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f6345r * this.f6343p) / 2.0f, this.f6335h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f6332e;
            float f13 = this.f6334g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f6333f + f13) * 360.0f) - f14;
            this.f6329b.setColor(this.f6348u);
            this.f6329b.setAlpha(this.f6347t);
            float f16 = this.f6335h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f6331d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f6329b);
            m8182b(canvas, f14, f15, rectF);
        }

        /* renamed from: b */
        void m8182b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f6341n) {
                Path path = this.f6342o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f6342o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f6345r * this.f6343p) / 2.0f;
                this.f6342o.moveTo(0.0f, 0.0f);
                this.f6342o.lineTo(this.f6345r * this.f6343p, 0.0f);
                Path path3 = this.f6342o;
                float f13 = this.f6345r;
                float f14 = this.f6343p;
                path3.lineTo((f13 * f14) / 2.0f, this.f6346s * f14);
                this.f6342o.offset((min + rectF.centerX()) - f12, rectF.centerY() + (this.f6335h / 2.0f));
                this.f6342o.close();
                this.f6330c.setColor(this.f6348u);
                this.f6330c.setAlpha(this.f6347t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f6342o, this.f6330c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        int m8183c() {
            return this.f6347t;
        }

        /* renamed from: d */
        float m8184d() {
            return this.f6333f;
        }

        /* renamed from: e */
        int m8185e() {
            return this.f6336i[m8186f()];
        }

        /* renamed from: f */
        int m8186f() {
            return (this.f6337j + 1) % this.f6336i.length;
        }

        /* renamed from: g */
        float m8187g() {
            return this.f6332e;
        }

        /* renamed from: h */
        int m8188h() {
            return this.f6336i[this.f6337j];
        }

        /* renamed from: i */
        float m8189i() {
            return this.f6339l;
        }

        /* renamed from: j */
        float m8190j() {
            return this.f6340m;
        }

        /* renamed from: k */
        float m8191k() {
            return this.f6338k;
        }

        /* renamed from: l */
        void m8192l() {
            m8200t(m8186f());
        }

        /* renamed from: m */
        void m8193m() {
            this.f6338k = 0.0f;
            this.f6339l = 0.0f;
            this.f6340m = 0.0f;
            m8205y(0.0f);
            m8202v(0.0f);
            m8203w(0.0f);
        }

        /* renamed from: n */
        void m8194n(int i10) {
            this.f6347t = i10;
        }

        /* renamed from: o */
        void m8195o(float f10, float f11) {
            this.f6345r = (int) f10;
            this.f6346s = (int) f11;
        }

        /* renamed from: p */
        void m8196p(float f10) {
            if (f10 != this.f6343p) {
                this.f6343p = f10;
            }
        }

        /* renamed from: q */
        void m8197q(float f10) {
            this.f6344q = f10;
        }

        /* renamed from: r */
        void m8198r(int i10) {
            this.f6348u = i10;
        }

        /* renamed from: s */
        void m8199s(ColorFilter colorFilter) {
            this.f6329b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        void m8200t(int i10) {
            this.f6337j = i10;
            this.f6348u = this.f6336i[i10];
        }

        /* renamed from: u */
        void m8201u(int[] iArr) {
            this.f6336i = iArr;
            m8200t(0);
        }

        /* renamed from: v */
        void m8202v(float f10) {
            this.f6333f = f10;
        }

        /* renamed from: w */
        void m8203w(float f10) {
            this.f6334g = f10;
        }

        /* renamed from: x */
        void m8204x(boolean z10) {
            if (this.f6341n != z10) {
                this.f6341n = z10;
            }
        }

        /* renamed from: y */
        void m8205y(float f10) {
            this.f6332e = f10;
        }

        /* renamed from: z */
        void m8206z(float f10) {
            this.f6335h = f10;
            this.f6329b.setStrokeWidth(f10);
        }
    }

    public C1426b(Context context) {
        this.f6320c = ((Context) C0984h.m4833k(context)).getResources();
        c cVar = new c();
        this.f6318a = cVar;
        cVar.m8201u(f6317t);
        m8177k(2.5f);
        m8170m();
    }

    /* renamed from: a */
    private void m8166a(float f10, c cVar) {
        m8179n(f10, cVar);
        float floor = (float) (Math.floor(cVar.m8190j() / 0.8f) + 1.0d);
        cVar.m8205y(cVar.m8191k() + (((cVar.m8189i() - 0.01f) - cVar.m8191k()) * f10));
        cVar.m8202v(cVar.m8189i());
        cVar.m8203w(cVar.m8190j() + ((floor - cVar.m8190j()) * f10));
    }

    /* renamed from: c */
    private int m8167c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    /* renamed from: h */
    private void m8168h(float f10) {
        this.f6319b = f10;
    }

    /* renamed from: i */
    private void m8169i(float f10, float f11, float f12, float f13) {
        c cVar = this.f6318a;
        float f14 = this.f6320c.getDisplayMetrics().density;
        cVar.m8206z(f11 * f14);
        cVar.m8197q(f10 * f14);
        cVar.m8200t(0);
        cVar.m8195o(f12 * f14, f13 * f14);
    }

    /* renamed from: m */
    private void m8170m() {
        c cVar = this.f6318a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f6315r);
        ofFloat.addListener(new b(cVar));
        this.f6321d = ofFloat;
    }

    /* renamed from: b */
    void m8171b(float f10, c cVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f6323f) {
            m8166a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float m8190j = cVar.m8190j();
            if (f10 < 0.5f) {
                interpolation = cVar.m8191k();
                f11 = (f6316s.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m8191k = cVar.m8191k() + 0.79f;
                interpolation = m8191k - (((1.0f - f6316s.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = m8191k;
            }
            float f12 = m8190j + (0.20999998f * f10);
            float f13 = (f10 + this.f6322e) * 216.0f;
            cVar.m8205y(interpolation);
            cVar.m8202v(f11);
            cVar.m8203w(f12);
            m8168h(f13);
        }
    }

    /* renamed from: d */
    public void m8172d(boolean z10) {
        this.f6318a.m8204x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f6319b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f6318a.m8181a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m8173e(float f10) {
        this.f6318a.m8196p(f10);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m8174f(int... iArr) {
        this.f6318a.m8201u(iArr);
        this.f6318a.m8200t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m8175g(float f10) {
        this.f6318a.m8203w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6318a.m8183c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f6321d.isRunning();
    }

    /* renamed from: j */
    public void m8176j(float f10, float f11) {
        this.f6318a.m8205y(f10);
        this.f6318a.m8202v(f11);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m8177k(float f10) {
        this.f6318a.m8206z(f10);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m8178l(int i10) {
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
        m8169i(f12, f13, f10, f11);
        invalidateSelf();
    }

    /* renamed from: n */
    void m8179n(float f10, c cVar) {
        cVar.m8198r(f10 > 0.75f ? m8167c((f10 - 0.75f) / 0.25f, cVar.m8188h(), cVar.m8185e()) : cVar.m8188h());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f6318a.m8194n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6318a.m8199s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j10;
        this.f6321d.cancel();
        this.f6318a.m8180A();
        if (this.f6318a.m8184d() != this.f6318a.m8187g()) {
            this.f6323f = true;
            animator = this.f6321d;
            j10 = 666;
        } else {
            this.f6318a.m8200t(0);
            this.f6318a.m8193m();
            animator = this.f6321d;
            j10 = 1332;
        }
        animator.setDuration(j10);
        this.f6321d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f6321d.cancel();
        m8168h(0.0f);
        this.f6318a.m8204x(false);
        this.f6318a.m8200t(0);
        this.f6318a.m8193m();
        invalidateSelf();
    }
}
