package p361t6;

import android.os.SystemClock;
import p137hb.C7692g;
import p361t6.C11010c2;
import p363t8.C11172r0;

/* renamed from: t6.q */
/* loaded from: classes.dex */
public final class C11086q implements InterfaceC11133z1 {

    /* renamed from: a */
    private final float f28583a;

    /* renamed from: b */
    private final float f28584b;

    /* renamed from: c */
    private final long f28585c;

    /* renamed from: d */
    private final float f28586d;

    /* renamed from: e */
    private final long f28587e;

    /* renamed from: f */
    private final long f28588f;

    /* renamed from: g */
    private final float f28589g;

    /* renamed from: h */
    private long f28590h;

    /* renamed from: i */
    private long f28591i;

    /* renamed from: j */
    private long f28592j;

    /* renamed from: k */
    private long f28593k;

    /* renamed from: l */
    private long f28594l;

    /* renamed from: m */
    private long f28595m;

    /* renamed from: n */
    private float f28596n;

    /* renamed from: o */
    private float f28597o;

    /* renamed from: p */
    private float f28598p;

    /* renamed from: q */
    private long f28599q;

    /* renamed from: r */
    private long f28600r;

    /* renamed from: s */
    private long f28601s;

    /* renamed from: t6.q$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private float f28602a = 0.97f;

        /* renamed from: b */
        private float f28603b = 1.03f;

        /* renamed from: c */
        private long f28604c = 1000;

        /* renamed from: d */
        private float f28605d = 1.0E-7f;

        /* renamed from: e */
        private long f28606e = C11172r0.m34861C0(20);

        /* renamed from: f */
        private long f28607f = C11172r0.m34861C0(500);

        /* renamed from: g */
        private float f28608g = 0.999f;

        /* renamed from: a */
        public C11086q m34317a() {
            return new C11086q(this.f28602a, this.f28603b, this.f28604c, this.f28605d, this.f28606e, this.f28607f, this.f28608g);
        }
    }

    private C11086q(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f28583a = f10;
        this.f28584b = f11;
        this.f28585c = j10;
        this.f28586d = f12;
        this.f28587e = j11;
        this.f28588f = j12;
        this.f28589g = f13;
        this.f28590h = -9223372036854775807L;
        this.f28591i = -9223372036854775807L;
        this.f28593k = -9223372036854775807L;
        this.f28594l = -9223372036854775807L;
        this.f28597o = f10;
        this.f28596n = f11;
        this.f28598p = 1.0f;
        this.f28599q = -9223372036854775807L;
        this.f28592j = -9223372036854775807L;
        this.f28595m = -9223372036854775807L;
        this.f28600r = -9223372036854775807L;
        this.f28601s = -9223372036854775807L;
    }

    /* renamed from: f */
    private void m34308f(long j10) {
        long j11 = this.f28600r + (this.f28601s * 3);
        if (this.f28595m > j11) {
            float m34861C0 = (float) C11172r0.m34861C0(this.f28585c);
            this.f28595m = C7692g.m23427c(j11, this.f28592j, this.f28595m - (((this.f28598p - 1.0f) * m34861C0) + ((this.f28596n - 1.0f) * m34861C0)));
            return;
        }
        long m34944r = C11172r0.m34944r(j10 - (Math.max(0.0f, this.f28598p - 1.0f) / this.f28586d), this.f28595m, j11);
        this.f28595m = m34944r;
        long j12 = this.f28594l;
        if (j12 == -9223372036854775807L || m34944r <= j12) {
            return;
        }
        this.f28595m = j12;
    }

    /* renamed from: g */
    private void m34309g() {
        long j10 = this.f28590h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f28591i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f28593k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f28594l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f28592j == j10) {
            return;
        }
        this.f28592j = j10;
        this.f28595m = j10;
        this.f28600r = -9223372036854775807L;
        this.f28601s = -9223372036854775807L;
        this.f28599q = -9223372036854775807L;
    }

    /* renamed from: h */
    private static long m34310h(long j10, long j11, float f10) {
        return (((float) j10) * f10) + ((1.0f - f10) * ((float) j11));
    }

    /* renamed from: i */
    private void m34311i(long j10, long j11) {
        long m34310h;
        long j12 = j10 - j11;
        long j13 = this.f28600r;
        if (j13 == -9223372036854775807L) {
            this.f28600r = j12;
            m34310h = 0;
        } else {
            long max = Math.max(j12, m34310h(j13, j12, this.f28589g));
            this.f28600r = max;
            m34310h = m34310h(this.f28601s, Math.abs(j12 - max), this.f28589g);
        }
        this.f28601s = m34310h;
    }

    @Override // p361t6.InterfaceC11133z1
    /* renamed from: a */
    public void mo34312a(C11010c2.g gVar) {
        this.f28590h = C11172r0.m34861C0(gVar.f28087a);
        this.f28593k = C11172r0.m34861C0(gVar.f28088b);
        this.f28594l = C11172r0.m34861C0(gVar.f28089c);
        float f10 = gVar.f28090d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f28583a;
        }
        this.f28597o = f10;
        float f11 = gVar.f28091e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f28584b;
        }
        this.f28596n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f28590h = -9223372036854775807L;
        }
        m34309g();
    }

    @Override // p361t6.InterfaceC11133z1
    /* renamed from: b */
    public float mo34313b(long j10, long j11) {
        if (this.f28590h == -9223372036854775807L) {
            return 1.0f;
        }
        m34311i(j10, j11);
        if (this.f28599q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f28599q < this.f28585c) {
            return this.f28598p;
        }
        this.f28599q = SystemClock.elapsedRealtime();
        m34308f(j10);
        long j12 = j10 - this.f28595m;
        if (Math.abs(j12) < this.f28587e) {
            this.f28598p = 1.0f;
        } else {
            this.f28598p = C11172r0.m34940p((this.f28586d * ((float) j12)) + 1.0f, this.f28597o, this.f28596n);
        }
        return this.f28598p;
    }

    @Override // p361t6.InterfaceC11133z1
    /* renamed from: c */
    public long mo34314c() {
        return this.f28595m;
    }

    @Override // p361t6.InterfaceC11133z1
    /* renamed from: d */
    public void mo34315d() {
        long j10 = this.f28595m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f28588f;
        this.f28595m = j11;
        long j12 = this.f28594l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f28595m = j12;
        }
        this.f28599q = -9223372036854775807L;
    }

    @Override // p361t6.InterfaceC11133z1
    /* renamed from: e */
    public void mo34316e(long j10) {
        this.f28591i = j10;
        m34309g();
    }
}
