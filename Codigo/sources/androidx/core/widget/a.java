package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.x0;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int C = ViewConfiguration.getTapTimeout();
    private boolean A;
    private boolean B;

    /* renamed from: c, reason: collision with root package name */
    final View f4047c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f4048d;

    /* renamed from: r, reason: collision with root package name */
    private int f4051r;

    /* renamed from: s, reason: collision with root package name */
    private int f4052s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f4056w;

    /* renamed from: x, reason: collision with root package name */
    boolean f4057x;

    /* renamed from: y, reason: collision with root package name */
    boolean f4058y;

    /* renamed from: z, reason: collision with root package name */
    boolean f4059z;

    /* renamed from: a, reason: collision with root package name */
    final C0055a f4045a = new C0055a();

    /* renamed from: b, reason: collision with root package name */
    private final Interpolator f4046b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    private float[] f4049e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    private float[] f4050f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: t, reason: collision with root package name */
    private float[] f4053t = {0.0f, 0.0f};

    /* renamed from: u, reason: collision with root package name */
    private float[] f4054u = {0.0f, 0.0f};

    /* renamed from: v, reason: collision with root package name */
    private float[] f4055v = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0055a {

        /* renamed from: a, reason: collision with root package name */
        private int f4060a;

        /* renamed from: b, reason: collision with root package name */
        private int f4061b;

        /* renamed from: c, reason: collision with root package name */
        private float f4062c;

        /* renamed from: d, reason: collision with root package name */
        private float f4063d;

        /* renamed from: j, reason: collision with root package name */
        private float f4069j;

        /* renamed from: k, reason: collision with root package name */
        private int f4070k;

        /* renamed from: e, reason: collision with root package name */
        private long f4064e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f4068i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f4065f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f4066g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f4067h = 0;

        C0055a() {
        }

        private float e(long j10) {
            long j11 = this.f4064e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f4068i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / this.f4060a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f4069j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / this.f4070k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f4065f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g10 = g(e(currentAnimationTimeMillis));
            long j10 = currentAnimationTimeMillis - this.f4065f;
            this.f4065f = currentAnimationTimeMillis;
            float f10 = ((float) j10) * g10;
            this.f4066g = (int) (this.f4062c * f10);
            this.f4067h = (int) (f10 * this.f4063d);
        }

        public int b() {
            return this.f4066g;
        }

        public int c() {
            return this.f4067h;
        }

        public int d() {
            float f10 = this.f4062c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f4063d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f4068i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f4068i + ((long) this.f4070k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4070k = a.f((int) (currentAnimationTimeMillis - this.f4064e), 0, this.f4061b);
            this.f4069j = e(currentAnimationTimeMillis);
            this.f4068i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f4061b = i10;
        }

        public void k(int i10) {
            this.f4060a = i10;
        }

        public void l(float f10, float f11) {
            this.f4062c = f10;
            this.f4063d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4064e = currentAnimationTimeMillis;
            this.f4068i = -1L;
            this.f4065f = currentAnimationTimeMillis;
            this.f4069j = 0.5f;
            this.f4066g = 0;
            this.f4067h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f4059z) {
                if (aVar.f4057x) {
                    aVar.f4057x = false;
                    aVar.f4045a.m();
                }
                C0055a c0055a = a.this.f4045a;
                if (c0055a.h() || !a.this.u()) {
                    a.this.f4059z = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f4058y) {
                    aVar2.f4058y = false;
                    aVar2.c();
                }
                c0055a.a();
                a.this.j(c0055a.b(), c0055a.c());
                x0.R(a.this.f4047c, this);
            }
        }
    }

    public a(View view) {
        this.f4047c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(C);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f4049e[i10], f11, this.f4050f[i10], f10);
        if (h10 == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f4053t[i10];
        float f14 = this.f4054u[i10];
        float f15 = this.f4055v[i10];
        float f16 = f13 * f12;
        return h10 > 0.0f ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f4051r;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f4059z && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            interpolation = -this.f4046b.getInterpolation(-g10);
        } else {
            if (g10 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f4046b.getInterpolation(g10);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f4057x) {
            this.f4059z = false;
        } else {
            this.f4045a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f4048d == null) {
            this.f4048d = new b();
        }
        this.f4059z = true;
        this.f4057x = true;
        if (this.f4056w || (i10 = this.f4052s) <= 0) {
            this.f4048d.run();
        } else {
            x0.S(this.f4047c, this.f4048d, i10);
        }
        this.f4056w = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f4047c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f4052s = i10;
        return this;
    }

    public a l(int i10) {
        this.f4051r = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.A && !z10) {
            i();
        }
        this.A = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f4050f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f4055v;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.A
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f4058y = r2
            r5.f4056w = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4047c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4047c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f4045a
            r7.l(r0, r6)
            boolean r6 = r5.f4059z
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.B
            if (r6 == 0) goto L61
            boolean r6 = r5.f4059z
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f4054u;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f4045a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f4045a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f4049e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f4053t;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0055a c0055a = this.f4045a;
        int f10 = c0055a.f();
        int d10 = c0055a.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
