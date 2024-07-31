package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C1116x0;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1131a implements View.OnTouchListener {

    /* renamed from: C */
    private static final int f4752C = ViewConfiguration.getTapTimeout();

    /* renamed from: A */
    private boolean f4753A;

    /* renamed from: B */
    private boolean f4754B;

    /* renamed from: c */
    final View f4757c;

    /* renamed from: d */
    private Runnable f4758d;

    /* renamed from: r */
    private int f4761r;

    /* renamed from: s */
    private int f4762s;

    /* renamed from: w */
    private boolean f4766w;

    /* renamed from: x */
    boolean f4767x;

    /* renamed from: y */
    boolean f4768y;

    /* renamed from: z */
    boolean f4769z;

    /* renamed from: a */
    final a f4755a = new a();

    /* renamed from: b */
    private final Interpolator f4756b = new AccelerateInterpolator();

    /* renamed from: e */
    private float[] f4759e = {0.0f, 0.0f};

    /* renamed from: f */
    private float[] f4760f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: t */
    private float[] f4763t = {0.0f, 0.0f};

    /* renamed from: u */
    private float[] f4764u = {0.0f, 0.0f};

    /* renamed from: v */
    private float[] f4765v = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f4770a;

        /* renamed from: b */
        private int f4771b;

        /* renamed from: c */
        private float f4772c;

        /* renamed from: d */
        private float f4773d;

        /* renamed from: j */
        private float f4779j;

        /* renamed from: k */
        private int f4780k;

        /* renamed from: e */
        private long f4774e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f4778i = -1;

        /* renamed from: f */
        private long f4775f = 0;

        /* renamed from: g */
        private int f4776g = 0;

        /* renamed from: h */
        private int f4777h = 0;

        a() {
        }

        /* renamed from: e */
        private float m5522e(long j10) {
            long j11 = this.f4774e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f4778i;
            if (j12 < 0 || j10 < j12) {
                return AbstractViewOnTouchListenerC1131a.m5501e(((float) (j10 - j11)) / this.f4770a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f4779j;
            return (1.0f - f10) + (f10 * AbstractViewOnTouchListenerC1131a.m5501e(((float) (j10 - j12)) / this.f4780k, 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m5523g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        /* renamed from: a */
        public void m5524a() {
            if (this.f4775f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m5523g = m5523g(m5522e(currentAnimationTimeMillis));
            long j10 = currentAnimationTimeMillis - this.f4775f;
            this.f4775f = currentAnimationTimeMillis;
            float f10 = ((float) j10) * m5523g;
            this.f4776g = (int) (this.f4772c * f10);
            this.f4777h = (int) (f10 * this.f4773d);
        }

        /* renamed from: b */
        public int m5525b() {
            return this.f4776g;
        }

        /* renamed from: c */
        public int m5526c() {
            return this.f4777h;
        }

        /* renamed from: d */
        public int m5527d() {
            float f10 = this.f4772c;
            return (int) (f10 / Math.abs(f10));
        }

        /* renamed from: f */
        public int m5528f() {
            float f10 = this.f4773d;
            return (int) (f10 / Math.abs(f10));
        }

        /* renamed from: h */
        public boolean m5529h() {
            return this.f4778i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f4778i + ((long) this.f4780k);
        }

        /* renamed from: i */
        public void m5530i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4780k = AbstractViewOnTouchListenerC1131a.m5502f((int) (currentAnimationTimeMillis - this.f4774e), 0, this.f4771b);
            this.f4779j = m5522e(currentAnimationTimeMillis);
            this.f4778i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m5531j(int i10) {
            this.f4771b = i10;
        }

        /* renamed from: k */
        public void m5532k(int i10) {
            this.f4770a = i10;
        }

        /* renamed from: l */
        public void m5533l(float f10, float f11) {
            this.f4772c = f10;
            this.f4773d = f11;
        }

        /* renamed from: m */
        public void m5534m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4774e = currentAnimationTimeMillis;
            this.f4778i = -1L;
            this.f4775f = currentAnimationTimeMillis;
            this.f4779j = 0.5f;
            this.f4776g = 0;
            this.f4777h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC1131a abstractViewOnTouchListenerC1131a = AbstractViewOnTouchListenerC1131a.this;
            if (abstractViewOnTouchListenerC1131a.f4769z) {
                if (abstractViewOnTouchListenerC1131a.f4767x) {
                    abstractViewOnTouchListenerC1131a.f4767x = false;
                    abstractViewOnTouchListenerC1131a.f4755a.m5534m();
                }
                a aVar = AbstractViewOnTouchListenerC1131a.this.f4755a;
                if (aVar.m5529h() || !AbstractViewOnTouchListenerC1131a.this.m5521u()) {
                    AbstractViewOnTouchListenerC1131a.this.f4769z = false;
                    return;
                }
                AbstractViewOnTouchListenerC1131a abstractViewOnTouchListenerC1131a2 = AbstractViewOnTouchListenerC1131a.this;
                if (abstractViewOnTouchListenerC1131a2.f4768y) {
                    abstractViewOnTouchListenerC1131a2.f4768y = false;
                    abstractViewOnTouchListenerC1131a2.m5509c();
                }
                aVar.m5524a();
                AbstractViewOnTouchListenerC1131a.this.mo5510j(aVar.m5525b(), aVar.m5526c());
                C1116x0.m5253R(AbstractViewOnTouchListenerC1131a.this.f4757c, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC1131a(View view) {
        this.f4757c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        m5515o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        m5516p(f12, f12);
        m5512l(1);
        m5514n(Float.MAX_VALUE, Float.MAX_VALUE);
        m5519s(0.2f, 0.2f);
        m5520t(1.0f, 1.0f);
        m5511k(f4752C);
        m5518r(500);
        m5517q(500);
    }

    /* renamed from: d */
    private float m5500d(int i10, float f10, float f11, float f12) {
        float m5504h = m5504h(this.f4759e[i10], f11, this.f4760f[i10], f10);
        if (m5504h == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f4763t[i10];
        float f14 = this.f4764u[i10];
        float f15 = this.f4765v[i10];
        float f16 = f13 * f12;
        return m5504h > 0.0f ? m5501e(m5504h * f16, f14, f15) : -m5501e((-m5504h) * f16, f14, f15);
    }

    /* renamed from: e */
    static float m5501e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* renamed from: f */
    static int m5502f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    /* renamed from: g */
    private float m5503g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f4761r;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f4769z && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m5504h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float m5501e = m5501e(f10 * f11, 0.0f, f12);
        float m5503g = m5503g(f11 - f13, m5501e) - m5503g(f13, m5501e);
        if (m5503g < 0.0f) {
            interpolation = -this.f4756b.getInterpolation(-m5503g);
        } else {
            if (m5503g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f4756b.getInterpolation(m5503g);
        }
        return m5501e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m5505i() {
        if (this.f4767x) {
            this.f4769z = false;
        } else {
            this.f4755a.m5530i();
        }
    }

    /* renamed from: v */
    private void m5506v() {
        int i10;
        if (this.f4758d == null) {
            this.f4758d = new b();
        }
        this.f4769z = true;
        this.f4767x = true;
        if (this.f4766w || (i10 = this.f4762s) <= 0) {
            this.f4758d.run();
        } else {
            C1116x0.m5254S(this.f4757c, this.f4758d, i10);
        }
        this.f4766w = true;
    }

    /* renamed from: a */
    public abstract boolean mo5507a(int i10);

    /* renamed from: b */
    public abstract boolean mo5508b(int i10);

    /* renamed from: c */
    void m5509c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f4757c.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo5510j(int i10, int i11);

    /* renamed from: k */
    public AbstractViewOnTouchListenerC1131a m5511k(int i10) {
        this.f4762s = i10;
        return this;
    }

    /* renamed from: l */
    public AbstractViewOnTouchListenerC1131a m5512l(int i10) {
        this.f4761r = i10;
        return this;
    }

    /* renamed from: m */
    public AbstractViewOnTouchListenerC1131a m5513m(boolean z10) {
        if (this.f4753A && !z10) {
            m5505i();
        }
        this.f4753A = z10;
        return this;
    }

    /* renamed from: n */
    public AbstractViewOnTouchListenerC1131a m5514n(float f10, float f11) {
        float[] fArr = this.f4760f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* renamed from: o */
    public AbstractViewOnTouchListenerC1131a m5515o(float f10, float f11) {
        float[] fArr = this.f4765v;
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
            boolean r0 = r5.f4753A
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
            r5.m5505i()
            goto L58
        L1a:
            r5.f4768y = r2
            r5.f4766w = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4757c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m5500d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4757c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m5500d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f4755a
            r7.m5533l(r0, r6)
            boolean r6 = r5.f4769z
            if (r6 != 0) goto L58
            boolean r6 = r5.m5521u()
            if (r6 == 0) goto L58
            r5.m5506v()
        L58:
            boolean r6 = r5.f4754B
            if (r6 == 0) goto L61
            boolean r6 = r5.f4769z
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC1131a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractViewOnTouchListenerC1131a m5516p(float f10, float f11) {
        float[] fArr = this.f4764u;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractViewOnTouchListenerC1131a m5517q(int i10) {
        this.f4755a.m5531j(i10);
        return this;
    }

    /* renamed from: r */
    public AbstractViewOnTouchListenerC1131a m5518r(int i10) {
        this.f4755a.m5532k(i10);
        return this;
    }

    /* renamed from: s */
    public AbstractViewOnTouchListenerC1131a m5519s(float f10, float f11) {
        float[] fArr = this.f4759e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* renamed from: t */
    public AbstractViewOnTouchListenerC1131a m5520t(float f10, float f11) {
        float[] fArr = this.f4763t;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m5521u() {
        a aVar = this.f4755a;
        int m5528f = aVar.m5528f();
        int m5527d = aVar.m5527d();
        return (m5528f != 0 && mo5508b(m5528f)) || (m5527d != 0 && mo5507a(m5527d));
    }
}
