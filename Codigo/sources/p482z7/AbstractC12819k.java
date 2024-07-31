package p482z7;

import gb.C7534a;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p361t6.C11108u1;
import p363t8.C11172r0;

/* renamed from: z7.k */
/* loaded from: classes.dex */
public abstract class AbstractC12819k {

    /* renamed from: a */
    final C12817i f34973a;

    /* renamed from: b */
    final long f34974b;

    /* renamed from: c */
    final long f34975c;

    /* renamed from: z7.k$a */
    /* loaded from: classes.dex */
    public static abstract class a extends AbstractC12819k {

        /* renamed from: d */
        final long f34976d;

        /* renamed from: e */
        final long f34977e;

        /* renamed from: f */
        final List<d> f34978f;

        /* renamed from: g */
        private final long f34979g;

        /* renamed from: h */
        private final long f34980h;

        /* renamed from: i */
        final long f34981i;

        public a(C12817i c12817i, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(c12817i, j10, j11);
            this.f34976d = j12;
            this.f34977e = j13;
            this.f34978f = list;
            this.f34981i = j14;
            this.f34979g = j15;
            this.f34980h = j16;
        }

        /* renamed from: c */
        public long m42549c(long j10, long j11) {
            long mo42553g = mo42553g(j10);
            return mo42553g != -1 ? mo42553g : (int) (m42555i((j11 - this.f34980h) + this.f34981i, j10) - m42550d(j10, j11));
        }

        /* renamed from: d */
        public long m42550d(long j10, long j11) {
            if (mo42553g(j10) == -1) {
                long j12 = this.f34979g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(m42551e(), m42555i((j11 - this.f34980h) - j12, j10));
                }
            }
            return m42551e();
        }

        /* renamed from: e */
        public long m42551e() {
            return this.f34976d;
        }

        /* renamed from: f */
        public long m42552f(long j10, long j11) {
            if (this.f34978f != null) {
                return -9223372036854775807L;
            }
            long m42550d = m42550d(j10, j11) + m42549c(j10, j11);
            return (m42556j(m42550d) + m42554h(m42550d, j10)) - this.f34981i;
        }

        /* renamed from: g */
        public abstract long mo42553g(long j10);

        /* renamed from: h */
        public final long m42554h(long j10, long j11) {
            List<d> list = this.f34978f;
            if (list != null) {
                return (list.get((int) (j10 - this.f34976d)).f34987b * 1000000) / this.f34974b;
            }
            long mo42553g = mo42553g(j11);
            return (mo42553g == -1 || j10 != (m42551e() + mo42553g) - 1) ? (this.f34977e * 1000000) / this.f34974b : j11 - m42556j(j10);
        }

        /* renamed from: i */
        public long m42555i(long j10, long j11) {
            long m42551e = m42551e();
            long mo42553g = mo42553g(j11);
            if (mo42553g == 0) {
                return m42551e;
            }
            if (this.f34978f == null) {
                long j12 = this.f34976d + (j10 / ((this.f34977e * 1000000) / this.f34974b));
                return j12 < m42551e ? m42551e : mo42553g == -1 ? j12 : Math.min(j12, (m42551e + mo42553g) - 1);
            }
            long j13 = (mo42553g + m42551e) - 1;
            long j14 = m42551e;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                long m42556j = m42556j(j15);
                if (m42556j < j10) {
                    j14 = j15 + 1;
                } else {
                    if (m42556j <= j10) {
                        return j15;
                    }
                    j13 = j15 - 1;
                }
            }
            return j14 == m42551e ? j14 : j13;
        }

        /* renamed from: j */
        public final long m42556j(long j10) {
            List<d> list = this.f34978f;
            return C11172r0.m34885O0(list != null ? list.get((int) (j10 - this.f34976d)).f34986a - this.f34975c : (j10 - this.f34976d) * this.f34977e, 1000000L, this.f34974b);
        }

        /* renamed from: k */
        public abstract C12817i mo42557k(AbstractC12818j abstractC12818j, long j10);

        /* renamed from: l */
        public boolean mo42558l() {
            return this.f34978f != null;
        }
    }

    /* renamed from: z7.k$b */
    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: j */
        final List<C12817i> f34982j;

        public b(C12817i c12817i, long j10, long j11, long j12, long j13, List<d> list, long j14, List<C12817i> list2, long j15, long j16) {
            super(c12817i, j10, j11, j12, j13, list, j14, j15, j16);
            this.f34982j = list2;
        }

        @Override // p482z7.AbstractC12819k.a
        /* renamed from: g */
        public long mo42553g(long j10) {
            return this.f34982j.size();
        }

        @Override // p482z7.AbstractC12819k.a
        /* renamed from: k */
        public C12817i mo42557k(AbstractC12818j abstractC12818j, long j10) {
            return this.f34982j.get((int) (j10 - this.f34976d));
        }

        @Override // p482z7.AbstractC12819k.a
        /* renamed from: l */
        public boolean mo42558l() {
            return true;
        }
    }

    /* renamed from: z7.k$c */
    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: j */
        final C12822n f34983j;

        /* renamed from: k */
        final C12822n f34984k;

        /* renamed from: l */
        final long f34985l;

        public c(C12817i c12817i, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, C12822n c12822n, C12822n c12822n2, long j16, long j17) {
            super(c12817i, j10, j11, j12, j14, list, j15, j16, j17);
            this.f34983j = c12822n;
            this.f34984k = c12822n2;
            this.f34985l = j13;
        }

        @Override // p482z7.AbstractC12819k
        /* renamed from: a */
        public C12817i mo42547a(AbstractC12818j abstractC12818j) {
            C12822n c12822n = this.f34983j;
            if (c12822n == null) {
                return super.mo42547a(abstractC12818j);
            }
            C11108u1 c11108u1 = abstractC12818j.f34960b;
            return new C12817i(c12822n.m42562a(c11108u1.f28786a, 0L, c11108u1.f28793s, 0L), 0L, -1L);
        }

        @Override // p482z7.AbstractC12819k.a
        /* renamed from: g */
        public long mo42553g(long j10) {
            if (this.f34978f != null) {
                return r0.size();
            }
            long j11 = this.f34985l;
            if (j11 != -1) {
                return (j11 - this.f34976d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return C7534a.m22879a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f34974b)), BigInteger.valueOf(this.f34977e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // p482z7.AbstractC12819k.a
        /* renamed from: k */
        public C12817i mo42557k(AbstractC12818j abstractC12818j, long j10) {
            List<d> list = this.f34978f;
            long j11 = list != null ? list.get((int) (j10 - this.f34976d)).f34986a : (j10 - this.f34976d) * this.f34977e;
            C12822n c12822n = this.f34984k;
            C11108u1 c11108u1 = abstractC12818j.f34960b;
            return new C12817i(c12822n.m42562a(c11108u1.f28786a, j10, c11108u1.f28793s, j11), 0L, -1L);
        }
    }

    /* renamed from: z7.k$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        final long f34986a;

        /* renamed from: b */
        final long f34987b;

        public d(long j10, long j11) {
            this.f34986a = j10;
            this.f34987b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f34986a == dVar.f34986a && this.f34987b == dVar.f34987b;
        }

        public int hashCode() {
            return (((int) this.f34986a) * 31) + ((int) this.f34987b);
        }
    }

    /* renamed from: z7.k$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC12819k {

        /* renamed from: d */
        final long f34988d;

        /* renamed from: e */
        final long f34989e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(C12817i c12817i, long j10, long j11, long j12, long j13) {
            super(c12817i, j10, j11);
            this.f34988d = j12;
            this.f34989e = j13;
        }

        /* renamed from: c */
        public C12817i m42559c() {
            long j10 = this.f34989e;
            if (j10 <= 0) {
                return null;
            }
            return new C12817i(null, this.f34988d, j10);
        }
    }

    public AbstractC12819k(C12817i c12817i, long j10, long j11) {
        this.f34973a = c12817i;
        this.f34974b = j10;
        this.f34975c = j11;
    }

    /* renamed from: a */
    public C12817i mo42547a(AbstractC12818j abstractC12818j) {
        return this.f34973a;
    }

    /* renamed from: b */
    public long m42548b() {
        return C11172r0.m34885O0(this.f34975c, 1000000L, this.f34974b);
    }
}
