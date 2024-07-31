package v6;

import android.media.AudioTrack;
import android.os.SystemClock;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class x {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;

    /* renamed from: a, reason: collision with root package name */
    private final a f28179a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f28180b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f28181c;

    /* renamed from: d, reason: collision with root package name */
    private int f28182d;

    /* renamed from: e, reason: collision with root package name */
    private int f28183e;

    /* renamed from: f, reason: collision with root package name */
    private w f28184f;

    /* renamed from: g, reason: collision with root package name */
    private int f28185g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f28186h;

    /* renamed from: i, reason: collision with root package name */
    private long f28187i;

    /* renamed from: j, reason: collision with root package name */
    private float f28188j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f28189k;

    /* renamed from: l, reason: collision with root package name */
    private long f28190l;

    /* renamed from: m, reason: collision with root package name */
    private long f28191m;

    /* renamed from: n, reason: collision with root package name */
    private Method f28192n;

    /* renamed from: o, reason: collision with root package name */
    private long f28193o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f28194p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28195q;

    /* renamed from: r, reason: collision with root package name */
    private long f28196r;

    /* renamed from: s, reason: collision with root package name */
    private long f28197s;

    /* renamed from: t, reason: collision with root package name */
    private long f28198t;

    /* renamed from: u, reason: collision with root package name */
    private long f28199u;

    /* renamed from: v, reason: collision with root package name */
    private long f28200v;

    /* renamed from: w, reason: collision with root package name */
    private int f28201w;

    /* renamed from: x, reason: collision with root package name */
    private int f28202x;

    /* renamed from: y, reason: collision with root package name */
    private long f28203y;

    /* renamed from: z, reason: collision with root package name */
    private long f28204z;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public x(a aVar) {
        this.f28179a = (a) t8.a.e(aVar);
        if (t8.r0.f26744a >= 18) {
            try {
                this.f28192n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f28180b = new long[10];
    }

    private boolean a() {
        return this.f28186h && ((AudioTrack) t8.a.e(this.f28181c)).getPlayState() == 2 && e() == 0;
    }

    private long b(long j10) {
        return (j10 * 1000000) / this.f28185g;
    }

    private long e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f28203y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.B, this.A + ((t8.r0.a0((elapsedRealtime * 1000) - j10, this.f28188j) * this.f28185g) / 1000000));
        }
        if (elapsedRealtime - this.f28197s >= 5) {
            v(elapsedRealtime);
            this.f28197s = elapsedRealtime;
        }
        return this.f28198t + (this.f28199u << 32);
    }

    private long f() {
        return b(e());
    }

    private void l(long j10) {
        w wVar = (w) t8.a.e(this.f28184f);
        if (wVar.e(j10)) {
            long c10 = wVar.c();
            long b10 = wVar.b();
            long f10 = f();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f28179a.e(b10, c10, j10, f10);
            } else {
                if (Math.abs(b(b10) - f10) <= 5000000) {
                    wVar.a();
                    return;
                }
                this.f28179a.d(b10, c10, j10, f10);
            }
            wVar.f();
        }
    }

    private void m() {
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f28191m >= 30000) {
            long f10 = f();
            if (f10 != 0) {
                this.f28180b[this.f28201w] = t8.r0.f0(f10, this.f28188j) - nanoTime;
                this.f28201w = (this.f28201w + 1) % 10;
                int i10 = this.f28202x;
                if (i10 < 10) {
                    this.f28202x = i10 + 1;
                }
                this.f28191m = nanoTime;
                this.f28190l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f28202x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f28190l += this.f28180b[i11] / i12;
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f28186h) {
            return;
        }
        l(nanoTime);
        n(nanoTime);
    }

    private void n(long j10) {
        Method method;
        if (!this.f28195q || (method = this.f28192n) == null || j10 - this.f28196r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) t8.r0.j((Integer) method.invoke(t8.a.e(this.f28181c), new Object[0]))).intValue() * 1000) - this.f28187i;
            this.f28193o = intValue;
            long max = Math.max(intValue, 0L);
            this.f28193o = max;
            if (max > 5000000) {
                this.f28179a.c(max);
                this.f28193o = 0L;
            }
        } catch (Exception unused) {
            this.f28192n = null;
        }
        this.f28196r = j10;
    }

    private static boolean o(int i10) {
        return t8.r0.f26744a < 23 && (i10 == 5 || i10 == 6);
    }

    private void r() {
        this.f28190l = 0L;
        this.f28202x = 0;
        this.f28201w = 0;
        this.f28191m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f28189k = false;
    }

    private void v(long j10) {
        int playState = ((AudioTrack) t8.a.e(this.f28181c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & KeyboardMap.kValueMask;
        if (this.f28186h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f28200v = this.f28198t;
            }
            playbackHeadPosition += this.f28200v;
        }
        if (t8.r0.f26744a <= 29) {
            if (playbackHeadPosition == 0 && this.f28198t > 0 && playState == 3) {
                if (this.f28204z == -9223372036854775807L) {
                    this.f28204z = j10;
                    return;
                }
                return;
            }
            this.f28204z = -9223372036854775807L;
        }
        if (this.f28198t > playbackHeadPosition) {
            this.f28199u++;
        }
        this.f28198t = playbackHeadPosition;
    }

    public int c(long j10) {
        return this.f28183e - ((int) (j10 - (e() * this.f28182d)));
    }

    public long d(boolean z10) {
        long f10;
        if (((AudioTrack) t8.a.e(this.f28181c)).getPlayState() == 3) {
            m();
        }
        long nanoTime = System.nanoTime() / 1000;
        w wVar = (w) t8.a.e(this.f28184f);
        boolean d10 = wVar.d();
        if (d10) {
            f10 = b(wVar.b()) + t8.r0.a0(nanoTime - wVar.c(), this.f28188j);
        } else {
            f10 = this.f28202x == 0 ? f() : t8.r0.a0(this.f28190l + nanoTime, this.f28188j);
            if (!z10) {
                f10 = Math.max(0L, f10 - this.f28193o);
            }
        }
        if (this.E != d10) {
            this.G = this.D;
            this.F = this.C;
        }
        long j10 = nanoTime - this.G;
        if (j10 < 1000000) {
            long a02 = this.F + t8.r0.a0(j10, this.f28188j);
            long j11 = (j10 * 1000) / 1000000;
            f10 = ((f10 * j11) + ((1000 - j11) * a02)) / 1000;
        }
        if (!this.f28189k) {
            long j12 = this.C;
            if (f10 > j12) {
                this.f28189k = true;
                this.f28179a.b(System.currentTimeMillis() - t8.r0.a1(t8.r0.f0(t8.r0.a1(f10 - j12), this.f28188j)));
            }
        }
        this.D = nanoTime;
        this.C = f10;
        this.E = d10;
        return f10;
    }

    public void g(long j10) {
        this.A = e();
        this.f28203y = SystemClock.elapsedRealtime() * 1000;
        this.B = j10;
    }

    public boolean h(long j10) {
        return j10 > e() || a();
    }

    public boolean i() {
        return ((AudioTrack) t8.a.e(this.f28181c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f28204z != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f28204z >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) t8.a.e(this.f28181c)).getPlayState();
        if (this.f28186h) {
            if (playState == 2) {
                this.f28194p = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f28194p;
        boolean h10 = h(j10);
        this.f28194p = h10;
        if (z10 && !h10 && playState != 1) {
            this.f28179a.a(this.f28183e, t8.r0.a1(this.f28187i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f28203y != -9223372036854775807L) {
            return false;
        }
        ((w) t8.a.e(this.f28184f)).g();
        return true;
    }

    public void q() {
        r();
        this.f28181c = null;
        this.f28184f = null;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f28181c = audioTrack;
        this.f28182d = i11;
        this.f28183e = i12;
        this.f28184f = new w(audioTrack);
        this.f28185g = audioTrack.getSampleRate();
        this.f28186h = z10 && o(i10);
        boolean u02 = t8.r0.u0(i10);
        this.f28195q = u02;
        this.f28187i = u02 ? b(i12 / i11) : -9223372036854775807L;
        this.f28198t = 0L;
        this.f28199u = 0L;
        this.f28200v = 0L;
        this.f28194p = false;
        this.f28203y = -9223372036854775807L;
        this.f28204z = -9223372036854775807L;
        this.f28196r = 0L;
        this.f28193o = 0L;
        this.f28188j = 1.0f;
    }

    public void t(float f10) {
        this.f28188j = f10;
        w wVar = this.f28184f;
        if (wVar != null) {
            wVar.g();
        }
        r();
    }

    public void u() {
        ((w) t8.a.e(this.f28184f)).g();
    }
}
