package p099f7;

import android.util.Pair;
import p306q7.C10289k;
import p363t8.C11172r0;
import p459y6.C12607a0;
import p459y6.InterfaceC12636z;

/* renamed from: f7.c */
/* loaded from: classes.dex */
final class C7307c implements InterfaceC7311g {

    /* renamed from: a */
    private final long[] f16385a;

    /* renamed from: b */
    private final long[] f16386b;

    /* renamed from: c */
    private final long f16387c;

    private C7307c(long[] jArr, long[] jArr2, long j10) {
        this.f16385a = jArr;
        this.f16386b = jArr2;
        this.f16387c = j10 == -9223372036854775807L ? C11172r0.m34861C0(jArr2[jArr2.length - 1]) : j10;
    }

    /* renamed from: a */
    public static C7307c m21892a(long j10, C10289k c10289k, long j11) {
        int length = c10289k.f25558e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += c10289k.f25556c + c10289k.f25558e[i12];
            j12 += c10289k.f25557d + c10289k.f25559f[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new C7307c(jArr, jArr2, j11);
    }

    /* renamed from: b */
    private static Pair<Long, Long> m21893b(long j10, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int m34926i = C11172r0.m34926i(jArr, j10, true, true);
        long j11 = jArr[m34926i];
        long j12 = jArr2[m34926i];
        int i10 = m34926i + 1;
        if (i10 == jArr.length) {
            valueOf = Long.valueOf(j11);
            valueOf2 = Long.valueOf(j12);
        } else {
            long j13 = jArr[i10];
            long j14 = jArr2[i10];
            double d10 = j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11);
            valueOf = Long.valueOf(j10);
            valueOf2 = Long.valueOf(((long) (d10 * (j14 - j12))) + j12);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // p099f7.InterfaceC7311g
    /* renamed from: c */
    public long mo21887c(long j10) {
        return C11172r0.m34861C0(((Long) m21893b(j10, this.f16385a, this.f16386b).second).longValue());
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: d */
    public InterfaceC12636z.a mo125d(long j10) {
        Pair<Long, Long> m21893b = m21893b(C11172r0.m34910a1(C11172r0.m34944r(j10, 0L, this.f16387c)), this.f16386b, this.f16385a);
        return new InterfaceC12636z.a(new C12607a0(C11172r0.m34861C0(((Long) m21893b.first).longValue()), ((Long) m21893b.second).longValue()));
    }

    @Override // p099f7.InterfaceC7311g
    /* renamed from: g */
    public long mo21888g() {
        return -1L;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: h */
    public boolean mo126h() {
        return true;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: i */
    public long mo127i() {
        return this.f16387c;
    }
}
