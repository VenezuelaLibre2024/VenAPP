package z7;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import t6.u1;
import t8.r0;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    final i f32422a;

    /* renamed from: b, reason: collision with root package name */
    final long f32423b;

    /* renamed from: c, reason: collision with root package name */
    final long f32424c;

    /* loaded from: classes.dex */
    public static abstract class a extends k {

        /* renamed from: d, reason: collision with root package name */
        final long f32425d;

        /* renamed from: e, reason: collision with root package name */
        final long f32426e;

        /* renamed from: f, reason: collision with root package name */
        final List<d> f32427f;

        /* renamed from: g, reason: collision with root package name */
        private final long f32428g;

        /* renamed from: h, reason: collision with root package name */
        private final long f32429h;

        /* renamed from: i, reason: collision with root package name */
        final long f32430i;

        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f32425d = j12;
            this.f32426e = j13;
            this.f32427f = list;
            this.f32430i = j14;
            this.f32428g = j15;
            this.f32429h = j16;
        }

        public long c(long j10, long j11) {
            long g10 = g(j10);
            return g10 != -1 ? g10 : (int) (i((j11 - this.f32429h) + this.f32430i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f32428g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f32429h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f32425d;
        }

        public long f(long j10, long j11) {
            if (this.f32427f != null) {
                return -9223372036854775807L;
            }
            long d10 = d(j10, j11) + c(j10, j11);
            return (j(d10) + h(d10, j10)) - this.f32430i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List<d> list = this.f32427f;
            if (list != null) {
                return (list.get((int) (j10 - this.f32425d)).f32436b * 1000000) / this.f32423b;
            }
            long g10 = g(j11);
            return (g10 == -1 || j10 != (e() + g10) - 1) ? (this.f32426e * 1000000) / this.f32423b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long e10 = e();
            long g10 = g(j11);
            if (g10 == 0) {
                return e10;
            }
            if (this.f32427f == null) {
                long j12 = this.f32425d + (j10 / ((this.f32426e * 1000000) / this.f32423b));
                return j12 < e10 ? e10 : g10 == -1 ? j12 : Math.min(j12, (e10 + g10) - 1);
            }
            long j13 = (g10 + e10) - 1;
            long j14 = e10;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                long j16 = j(j15);
                if (j16 < j10) {
                    j14 = j15 + 1;
                } else {
                    if (j16 <= j10) {
                        return j15;
                    }
                    j13 = j15 - 1;
                }
            }
            return j14 == e10 ? j14 : j13;
        }

        public final long j(long j10) {
            List<d> list = this.f32427f;
            return r0.O0(list != null ? list.get((int) (j10 - this.f32425d)).f32435a - this.f32424c : (j10 - this.f32425d) * this.f32426e, 1000000L, this.f32423b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f32427f != null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: j, reason: collision with root package name */
        final List<i> f32431j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f32431j = list2;
        }

        @Override // z7.k.a
        public long g(long j10) {
            return this.f32431j.size();
        }

        @Override // z7.k.a
        public i k(j jVar, long j10) {
            return this.f32431j.get((int) (j10 - this.f32425d));
        }

        @Override // z7.k.a
        public boolean l() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: j, reason: collision with root package name */
        final n f32432j;

        /* renamed from: k, reason: collision with root package name */
        final n f32433k;

        /* renamed from: l, reason: collision with root package name */
        final long f32434l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f32432j = nVar;
            this.f32433k = nVar2;
            this.f32434l = j13;
        }

        @Override // z7.k
        public i a(j jVar) {
            n nVar = this.f32432j;
            if (nVar == null) {
                return super.a(jVar);
            }
            u1 u1Var = jVar.f32409b;
            return new i(nVar.a(u1Var.f26506a, 0L, u1Var.f26513s, 0L), 0L, -1L);
        }

        @Override // z7.k.a
        public long g(long j10) {
            if (this.f32427f != null) {
                return r0.size();
            }
            long j11 = this.f32434l;
            if (j11 != -1) {
                return (j11 - this.f32425d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return gb.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f32423b)), BigInteger.valueOf(this.f32426e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // z7.k.a
        public i k(j jVar, long j10) {
            List<d> list = this.f32427f;
            long j11 = list != null ? list.get((int) (j10 - this.f32425d)).f32435a : (j10 - this.f32425d) * this.f32426e;
            n nVar = this.f32433k;
            u1 u1Var = jVar.f32409b;
            return new i(nVar.a(u1Var.f26506a, j10, u1Var.f26513s, j11), 0L, -1L);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final long f32435a;

        /* renamed from: b, reason: collision with root package name */
        final long f32436b;

        public d(long j10, long j11) {
            this.f32435a = j10;
            this.f32436b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f32435a == dVar.f32435a && this.f32436b == dVar.f32436b;
        }

        public int hashCode() {
            return (((int) this.f32435a) * 31) + ((int) this.f32436b);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends k {

        /* renamed from: d, reason: collision with root package name */
        final long f32437d;

        /* renamed from: e, reason: collision with root package name */
        final long f32438e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f32437d = j12;
            this.f32438e = j13;
        }

        public i c() {
            long j10 = this.f32438e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f32437d, j10);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f32422a = iVar;
        this.f32423b = j10;
        this.f32424c = j11;
    }

    public i a(j jVar) {
        return this.f32422a;
    }

    public long b() {
        return r0.O0(this.f32424c, 1000000L, this.f32423b);
    }
}
