package p099f7;

import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p396v6.C11668s0;
import p459y6.C12607a0;
import p459y6.InterfaceC12636z;

/* renamed from: f7.h */
/* loaded from: classes.dex */
final class C7312h implements InterfaceC7311g {

    /* renamed from: a */
    private final long[] f16410a;

    /* renamed from: b */
    private final long[] f16411b;

    /* renamed from: c */
    private final long f16412c;

    /* renamed from: d */
    private final long f16413d;

    private C7312h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f16410a = jArr;
        this.f16411b = jArr2;
        this.f16412c = j10;
        this.f16413d = j11;
    }

    /* renamed from: a */
    public static C7312h m21913a(long j10, long j11, C11668s0.a aVar, C11146e0 c11146e0) {
        int m34664H;
        c11146e0.m34678V(10);
        int m34692q = c11146e0.m34692q();
        if (m34692q <= 0) {
            return null;
        }
        int i10 = aVar.f30477d;
        long m34885O0 = C11172r0.m34885O0(m34692q, (i10 >= 32000 ? 1152 : 576) * 1000000, i10);
        int m34670N = c11146e0.m34670N();
        int m34670N2 = c11146e0.m34670N();
        int m34670N3 = c11146e0.m34670N();
        c11146e0.m34678V(2);
        long j12 = j11 + aVar.f30476c;
        long[] jArr = new long[m34670N];
        long[] jArr2 = new long[m34670N];
        int i11 = 0;
        long j13 = j11;
        while (i11 < m34670N) {
            int i12 = m34670N2;
            long j14 = j12;
            jArr[i11] = (i11 * m34885O0) / m34670N;
            jArr2[i11] = Math.max(j13, j14);
            if (m34670N3 == 1) {
                m34664H = c11146e0.m34664H();
            } else if (m34670N3 == 2) {
                m34664H = c11146e0.m34670N();
            } else if (m34670N3 == 3) {
                m34664H = c11146e0.m34667K();
            } else {
                if (m34670N3 != 4) {
                    return null;
                }
                m34664H = c11146e0.m34668L();
            }
            j13 += m34664H * i12;
            i11++;
            jArr = jArr;
            m34670N2 = i12;
            j12 = j14;
        }
        long[] jArr3 = jArr;
        if (j10 != -1 && j10 != j13) {
            C11173s.m34970i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new C7312h(jArr3, jArr2, m34885O0, j13);
    }

    @Override // p099f7.InterfaceC7311g
    /* renamed from: c */
    public long mo21887c(long j10) {
        return this.f16410a[C11172r0.m34926i(this.f16411b, j10, true, true)];
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: d */
    public InterfaceC12636z.a mo125d(long j10) {
        int m34926i = C11172r0.m34926i(this.f16410a, j10, true, true);
        C12607a0 c12607a0 = new C12607a0(this.f16410a[m34926i], this.f16411b[m34926i]);
        if (c12607a0.f34223a >= j10 || m34926i == this.f16410a.length - 1) {
            return new InterfaceC12636z.a(c12607a0);
        }
        int i10 = m34926i + 1;
        return new InterfaceC12636z.a(c12607a0, new C12607a0(this.f16410a[i10], this.f16411b[i10]));
    }

    @Override // p099f7.InterfaceC7311g
    /* renamed from: g */
    public long mo21888g() {
        return this.f16413d;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: h */
    public boolean mo126h() {
        return true;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: i */
    public long mo127i() {
        return this.f16412c;
    }
}
