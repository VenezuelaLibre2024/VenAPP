package p099f7;

import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p396v6.C11668s0;
import p459y6.C12607a0;
import p459y6.InterfaceC12636z;

/* renamed from: f7.i */
/* loaded from: classes.dex */
final class C7313i implements InterfaceC7311g {

    /* renamed from: a */
    private final long f16414a;

    /* renamed from: b */
    private final int f16415b;

    /* renamed from: c */
    private final long f16416c;

    /* renamed from: d */
    private final long f16417d;

    /* renamed from: e */
    private final long f16418e;

    /* renamed from: f */
    private final long[] f16419f;

    private C7313i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    private C7313i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f16414a = j10;
        this.f16415b = i10;
        this.f16416c = j11;
        this.f16419f = jArr;
        this.f16417d = j12;
        this.f16418e = j12 != -1 ? j10 + j12 : -1L;
    }

    /* renamed from: a */
    public static C7313i m21914a(long j10, long j11, C11668s0.a aVar, C11146e0 c11146e0) {
        int m34668L;
        int i10 = aVar.f30480g;
        int i11 = aVar.f30477d;
        int m34692q = c11146e0.m34692q();
        if ((m34692q & 1) != 1 || (m34668L = c11146e0.m34668L()) == 0) {
            return null;
        }
        long m34885O0 = C11172r0.m34885O0(m34668L, i10 * 1000000, i11);
        if ((m34692q & 6) != 6) {
            return new C7313i(j11, aVar.f30476c, m34885O0);
        }
        long m34666J = c11146e0.m34666J();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = c11146e0.m34664H();
        }
        if (j10 != -1) {
            long j12 = j11 + m34666J;
            if (j10 != j12) {
                C11173s.m34970i("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new C7313i(j11, aVar.f30476c, m34885O0, m34666J, jArr);
    }

    /* renamed from: b */
    private long m21915b(int i10) {
        return (this.f16416c * i10) / 100;
    }

    @Override // p099f7.InterfaceC7311g
    /* renamed from: c */
    public long mo21887c(long j10) {
        long j11 = j10 - this.f16414a;
        if (!mo126h() || j11 <= this.f16415b) {
            return 0L;
        }
        long[] jArr = (long[]) C11137a.m34607i(this.f16419f);
        double d10 = (j11 * 256.0d) / this.f16417d;
        int m34926i = C11172r0.m34926i(jArr, (long) d10, true, true);
        long m21915b = m21915b(m34926i);
        long j12 = jArr[m34926i];
        int i10 = m34926i + 1;
        long m21915b2 = m21915b(i10);
        return m21915b + Math.round((j12 == (m34926i == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (m21915b2 - m21915b));
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: d */
    public InterfaceC12636z.a mo125d(long j10) {
        if (!mo126h()) {
            return new InterfaceC12636z.a(new C12607a0(0L, this.f16414a + this.f16415b));
        }
        long m34944r = C11172r0.m34944r(j10, 0L, this.f16416c);
        double d10 = (m34944r * 100.0d) / this.f16416c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) C11137a.m34607i(this.f16419f))[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new InterfaceC12636z.a(new C12607a0(m34944r, this.f16414a + C11172r0.m34944r(Math.round((d11 / 256.0d) * this.f16417d), this.f16415b, this.f16417d - 1)));
    }

    @Override // p099f7.InterfaceC7311g
    /* renamed from: g */
    public long mo21888g() {
        return this.f16418e;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: h */
    public boolean mo126h() {
        return this.f16419f != null;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: i */
    public long mo127i() {
        return this.f16416c;
    }
}
