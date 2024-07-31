package p396v6;

import android.media.AudioTrack;
import android.os.SystemClock;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: v6.x */
/* loaded from: classes.dex */
final class C11677x {

    /* renamed from: A */
    private long f30541A;

    /* renamed from: B */
    private long f30542B;

    /* renamed from: C */
    private long f30543C;

    /* renamed from: D */
    private long f30544D;

    /* renamed from: E */
    private boolean f30545E;

    /* renamed from: F */
    private long f30546F;

    /* renamed from: G */
    private long f30547G;

    /* renamed from: a */
    private final a f30548a;

    /* renamed from: b */
    private final long[] f30549b;

    /* renamed from: c */
    private AudioTrack f30550c;

    /* renamed from: d */
    private int f30551d;

    /* renamed from: e */
    private int f30552e;

    /* renamed from: f */
    private C11675w f30553f;

    /* renamed from: g */
    private int f30554g;

    /* renamed from: h */
    private boolean f30555h;

    /* renamed from: i */
    private long f30556i;

    /* renamed from: j */
    private float f30557j;

    /* renamed from: k */
    private boolean f30558k;

    /* renamed from: l */
    private long f30559l;

    /* renamed from: m */
    private long f30560m;

    /* renamed from: n */
    private Method f30561n;

    /* renamed from: o */
    private long f30562o;

    /* renamed from: p */
    private boolean f30563p;

    /* renamed from: q */
    private boolean f30564q;

    /* renamed from: r */
    private long f30565r;

    /* renamed from: s */
    private long f30566s;

    /* renamed from: t */
    private long f30567t;

    /* renamed from: u */
    private long f30568u;

    /* renamed from: v */
    private long f30569v;

    /* renamed from: w */
    private int f30570w;

    /* renamed from: x */
    private int f30571x;

    /* renamed from: y */
    private long f30572y;

    /* renamed from: z */
    private long f30573z;

    /* renamed from: v6.x$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo36614a(int i10, long j10);

        /* renamed from: b */
        void mo36615b(long j10);

        /* renamed from: c */
        void mo36616c(long j10);

        /* renamed from: d */
        void mo36617d(long j10, long j11, long j12, long j13);

        /* renamed from: e */
        void mo36618e(long j10, long j11, long j12, long j13);
    }

    public C11677x(a aVar) {
        this.f30548a = (a) C11137a.m34603e(aVar);
        if (C11172r0.f29040a >= 18) {
            try {
                this.f30561n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f30549b = new long[10];
    }

    /* renamed from: a */
    private boolean m36769a() {
        return this.f30555h && ((AudioTrack) C11137a.m34603e(this.f30550c)).getPlayState() == 2 && m36771e() == 0;
    }

    /* renamed from: b */
    private long m36770b(long j10) {
        return (j10 * 1000000) / this.f30554g;
    }

    /* renamed from: e */
    private long m36771e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f30572y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.f30542B, this.f30541A + ((C11172r0.m34909a0((elapsedRealtime * 1000) - j10, this.f30557j) * this.f30554g) / 1000000));
        }
        if (elapsedRealtime - this.f30566s >= 5) {
            m36778v(elapsedRealtime);
            this.f30566s = elapsedRealtime;
        }
        return this.f30567t + (this.f30568u << 32);
    }

    /* renamed from: f */
    private long m36772f() {
        return m36770b(m36771e());
    }

    /* renamed from: l */
    private void m36773l(long j10) {
        C11675w c11675w = (C11675w) C11137a.m34603e(this.f30553f);
        if (c11675w.m36740e(j10)) {
            long m36738c = c11675w.m36738c();
            long m36737b = c11675w.m36737b();
            long m36772f = m36772f();
            if (Math.abs(m36738c - j10) > 5000000) {
                this.f30548a.mo36618e(m36737b, m36738c, j10, m36772f);
            } else {
                if (Math.abs(m36770b(m36737b) - m36772f) <= 5000000) {
                    c11675w.m36736a();
                    return;
                }
                this.f30548a.mo36617d(m36737b, m36738c, j10, m36772f);
            }
            c11675w.m36741f();
        }
    }

    /* renamed from: m */
    private void m36774m() {
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f30560m >= 30000) {
            long m36772f = m36772f();
            if (m36772f != 0) {
                this.f30549b[this.f30570w] = C11172r0.m34921f0(m36772f, this.f30557j) - nanoTime;
                this.f30570w = (this.f30570w + 1) % 10;
                int i10 = this.f30571x;
                if (i10 < 10) {
                    this.f30571x = i10 + 1;
                }
                this.f30560m = nanoTime;
                this.f30559l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f30571x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f30559l += this.f30549b[i11] / i12;
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f30555h) {
            return;
        }
        m36773l(nanoTime);
        m36775n(nanoTime);
    }

    /* renamed from: n */
    private void m36775n(long j10) {
        Method method;
        if (!this.f30564q || (method = this.f30561n) == null || j10 - this.f30565r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) C11172r0.m34928j((Integer) method.invoke(C11137a.m34603e(this.f30550c), new Object[0]))).intValue() * 1000) - this.f30556i;
            this.f30562o = intValue;
            long max = Math.max(intValue, 0L);
            this.f30562o = max;
            if (max > 5000000) {
                this.f30548a.mo36616c(max);
                this.f30562o = 0L;
            }
        } catch (Exception unused) {
            this.f30561n = null;
        }
        this.f30565r = j10;
    }

    /* renamed from: o */
    private static boolean m36776o(int i10) {
        return C11172r0.f29040a < 23 && (i10 == 5 || i10 == 6);
    }

    /* renamed from: r */
    private void m36777r() {
        this.f30559l = 0L;
        this.f30571x = 0;
        this.f30570w = 0;
        this.f30560m = 0L;
        this.f30544D = 0L;
        this.f30547G = 0L;
        this.f30558k = false;
    }

    /* renamed from: v */
    private void m36778v(long j10) {
        int playState = ((AudioTrack) C11137a.m34603e(this.f30550c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & KeyboardMap.kValueMask;
        if (this.f30555h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f30569v = this.f30567t;
            }
            playbackHeadPosition += this.f30569v;
        }
        if (C11172r0.f29040a <= 29) {
            if (playbackHeadPosition == 0 && this.f30567t > 0 && playState == 3) {
                if (this.f30573z == -9223372036854775807L) {
                    this.f30573z = j10;
                    return;
                }
                return;
            }
            this.f30573z = -9223372036854775807L;
        }
        if (this.f30567t > playbackHeadPosition) {
            this.f30568u++;
        }
        this.f30567t = playbackHeadPosition;
    }

    /* renamed from: c */
    public int m36779c(long j10) {
        return this.f30552e - ((int) (j10 - (m36771e() * this.f30551d)));
    }

    /* renamed from: d */
    public long m36780d(boolean z10) {
        long m36772f;
        if (((AudioTrack) C11137a.m34603e(this.f30550c)).getPlayState() == 3) {
            m36774m();
        }
        long nanoTime = System.nanoTime() / 1000;
        C11675w c11675w = (C11675w) C11137a.m34603e(this.f30553f);
        boolean m36739d = c11675w.m36739d();
        if (m36739d) {
            m36772f = m36770b(c11675w.m36737b()) + C11172r0.m34909a0(nanoTime - c11675w.m36738c(), this.f30557j);
        } else {
            m36772f = this.f30571x == 0 ? m36772f() : C11172r0.m34909a0(this.f30559l + nanoTime, this.f30557j);
            if (!z10) {
                m36772f = Math.max(0L, m36772f - this.f30562o);
            }
        }
        if (this.f30545E != m36739d) {
            this.f30547G = this.f30544D;
            this.f30546F = this.f30543C;
        }
        long j10 = nanoTime - this.f30547G;
        if (j10 < 1000000) {
            long m34909a0 = this.f30546F + C11172r0.m34909a0(j10, this.f30557j);
            long j11 = (j10 * 1000) / 1000000;
            m36772f = ((m36772f * j11) + ((1000 - j11) * m34909a0)) / 1000;
        }
        if (!this.f30558k) {
            long j12 = this.f30543C;
            if (m36772f > j12) {
                this.f30558k = true;
                this.f30548a.mo36615b(System.currentTimeMillis() - C11172r0.m34910a1(C11172r0.m34921f0(C11172r0.m34910a1(m36772f - j12), this.f30557j)));
            }
        }
        this.f30544D = nanoTime;
        this.f30543C = m36772f;
        this.f30545E = m36739d;
        return m36772f;
    }

    /* renamed from: g */
    public void m36781g(long j10) {
        this.f30541A = m36771e();
        this.f30572y = SystemClock.elapsedRealtime() * 1000;
        this.f30542B = j10;
    }

    /* renamed from: h */
    public boolean m36782h(long j10) {
        return j10 > m36771e() || m36769a();
    }

    /* renamed from: i */
    public boolean m36783i() {
        return ((AudioTrack) C11137a.m34603e(this.f30550c)).getPlayState() == 3;
    }

    /* renamed from: j */
    public boolean m36784j(long j10) {
        return this.f30573z != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f30573z >= 200;
    }

    /* renamed from: k */
    public boolean m36785k(long j10) {
        int playState = ((AudioTrack) C11137a.m34603e(this.f30550c)).getPlayState();
        if (this.f30555h) {
            if (playState == 2) {
                this.f30563p = false;
                return false;
            }
            if (playState == 1 && m36771e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f30563p;
        boolean m36782h = m36782h(j10);
        this.f30563p = m36782h;
        if (z10 && !m36782h && playState != 1) {
            this.f30548a.mo36614a(this.f30552e, C11172r0.m34910a1(this.f30556i));
        }
        return true;
    }

    /* renamed from: p */
    public boolean m36786p() {
        m36777r();
        if (this.f30572y != -9223372036854775807L) {
            return false;
        }
        ((C11675w) C11137a.m34603e(this.f30553f)).m36742g();
        return true;
    }

    /* renamed from: q */
    public void m36787q() {
        m36777r();
        this.f30550c = null;
        this.f30553f = null;
    }

    /* renamed from: s */
    public void m36788s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f30550c = audioTrack;
        this.f30551d = i11;
        this.f30552e = i12;
        this.f30553f = new C11675w(audioTrack);
        this.f30554g = audioTrack.getSampleRate();
        this.f30555h = z10 && m36776o(i10);
        boolean m34951u0 = C11172r0.m34951u0(i10);
        this.f30564q = m34951u0;
        this.f30556i = m34951u0 ? m36770b(i12 / i11) : -9223372036854775807L;
        this.f30567t = 0L;
        this.f30568u = 0L;
        this.f30569v = 0L;
        this.f30563p = false;
        this.f30572y = -9223372036854775807L;
        this.f30573z = -9223372036854775807L;
        this.f30565r = 0L;
        this.f30562o = 0L;
        this.f30557j = 1.0f;
    }

    /* renamed from: t */
    public void m36789t(float f10) {
        this.f30557j = f10;
        C11675w c11675w = this.f30553f;
        if (c11675w != null) {
            c11675w.m36742g();
        }
        m36777r();
    }

    /* renamed from: u */
    public void m36790u() {
        ((C11675w) C11137a.m34603e(this.f30553f)).m36742g();
    }
}
