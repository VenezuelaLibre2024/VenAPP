package t6;

import android.os.SystemClock;
import t6.c2;

/* loaded from: classes.dex */
public final class q implements z1 {

    /* renamed from: a, reason: collision with root package name */
    private final float f26356a;

    /* renamed from: b, reason: collision with root package name */
    private final float f26357b;

    /* renamed from: c, reason: collision with root package name */
    private final long f26358c;

    /* renamed from: d, reason: collision with root package name */
    private final float f26359d;

    /* renamed from: e, reason: collision with root package name */
    private final long f26360e;

    /* renamed from: f, reason: collision with root package name */
    private final long f26361f;

    /* renamed from: g, reason: collision with root package name */
    private final float f26362g;

    /* renamed from: h, reason: collision with root package name */
    private long f26363h;

    /* renamed from: i, reason: collision with root package name */
    private long f26364i;

    /* renamed from: j, reason: collision with root package name */
    private long f26365j;

    /* renamed from: k, reason: collision with root package name */
    private long f26366k;

    /* renamed from: l, reason: collision with root package name */
    private long f26367l;

    /* renamed from: m, reason: collision with root package name */
    private long f26368m;

    /* renamed from: n, reason: collision with root package name */
    private float f26369n;

    /* renamed from: o, reason: collision with root package name */
    private float f26370o;

    /* renamed from: p, reason: collision with root package name */
    private float f26371p;

    /* renamed from: q, reason: collision with root package name */
    private long f26372q;

    /* renamed from: r, reason: collision with root package name */
    private long f26373r;

    /* renamed from: s, reason: collision with root package name */
    private long f26374s;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private float f26375a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        private float f26376b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        private long f26377c = 1000;

        /* renamed from: d, reason: collision with root package name */
        private float f26378d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        private long f26379e = t8.r0.C0(20);

        /* renamed from: f, reason: collision with root package name */
        private long f26380f = t8.r0.C0(500);

        /* renamed from: g, reason: collision with root package name */
        private float f26381g = 0.999f;

        public q a() {
            return new q(this.f26375a, this.f26376b, this.f26377c, this.f26378d, this.f26379e, this.f26380f, this.f26381g);
        }
    }

    private q(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f26356a = f10;
        this.f26357b = f11;
        this.f26358c = j10;
        this.f26359d = f12;
        this.f26360e = j11;
        this.f26361f = j12;
        this.f26362g = f13;
        this.f26363h = -9223372036854775807L;
        this.f26364i = -9223372036854775807L;
        this.f26366k = -9223372036854775807L;
        this.f26367l = -9223372036854775807L;
        this.f26370o = f10;
        this.f26369n = f11;
        this.f26371p = 1.0f;
        this.f26372q = -9223372036854775807L;
        this.f26365j = -9223372036854775807L;
        this.f26368m = -9223372036854775807L;
        this.f26373r = -9223372036854775807L;
        this.f26374s = -9223372036854775807L;
    }

    private void f(long j10) {
        long j11 = this.f26373r + (this.f26374s * 3);
        if (this.f26368m > j11) {
            float C0 = (float) t8.r0.C0(this.f26358c);
            this.f26368m = hb.g.c(j11, this.f26365j, this.f26368m - (((this.f26371p - 1.0f) * C0) + ((this.f26369n - 1.0f) * C0)));
            return;
        }
        long r10 = t8.r0.r(j10 - (Math.max(0.0f, this.f26371p - 1.0f) / this.f26359d), this.f26368m, j11);
        this.f26368m = r10;
        long j12 = this.f26367l;
        if (j12 == -9223372036854775807L || r10 <= j12) {
            return;
        }
        this.f26368m = j12;
    }

    private void g() {
        long j10 = this.f26363h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f26364i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f26366k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f26367l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f26365j == j10) {
            return;
        }
        this.f26365j = j10;
        this.f26368m = j10;
        this.f26373r = -9223372036854775807L;
        this.f26374s = -9223372036854775807L;
        this.f26372q = -9223372036854775807L;
    }

    private static long h(long j10, long j11, float f10) {
        return (((float) j10) * f10) + ((1.0f - f10) * ((float) j11));
    }

    private void i(long j10, long j11) {
        long h10;
        long j12 = j10 - j11;
        long j13 = this.f26373r;
        if (j13 == -9223372036854775807L) {
            this.f26373r = j12;
            h10 = 0;
        } else {
            long max = Math.max(j12, h(j13, j12, this.f26362g));
            this.f26373r = max;
            h10 = h(this.f26374s, Math.abs(j12 - max), this.f26362g);
        }
        this.f26374s = h10;
    }

    @Override // t6.z1
    public void a(c2.g gVar) {
        this.f26363h = t8.r0.C0(gVar.f25943a);
        this.f26366k = t8.r0.C0(gVar.f25944b);
        this.f26367l = t8.r0.C0(gVar.f25945c);
        float f10 = gVar.f25946d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f26356a;
        }
        this.f26370o = f10;
        float f11 = gVar.f25947e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f26357b;
        }
        this.f26369n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f26363h = -9223372036854775807L;
        }
        g();
    }

    @Override // t6.z1
    public float b(long j10, long j11) {
        if (this.f26363h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f26372q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f26372q < this.f26358c) {
            return this.f26371p;
        }
        this.f26372q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f26368m;
        if (Math.abs(j12) < this.f26360e) {
            this.f26371p = 1.0f;
        } else {
            this.f26371p = t8.r0.p((this.f26359d * ((float) j12)) + 1.0f, this.f26370o, this.f26369n);
        }
        return this.f26371p;
    }

    @Override // t6.z1
    public long c() {
        return this.f26368m;
    }

    @Override // t6.z1
    public void d() {
        long j10 = this.f26368m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f26361f;
        this.f26368m = j11;
        long j12 = this.f26367l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f26368m = j12;
        }
        this.f26372q = -9223372036854775807L;
    }

    @Override // t6.z1
    public void e(long j10) {
        this.f26364i = j10;
        g();
    }
}
