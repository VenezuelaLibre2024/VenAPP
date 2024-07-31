package f7;

import android.util.Pair;
import q7.k;
import t8.r0;
import y6.a0;
import y6.z;

/* loaded from: classes.dex */
final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f14962a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f14963b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14964c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f14962a = jArr;
        this.f14963b = jArr2;
        this.f14964c = j10 == -9223372036854775807L ? r0.C0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, k kVar, long j11) {
        int length = kVar.f23590e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += kVar.f23588c + kVar.f23590e[i12];
            j12 += kVar.f23589d + kVar.f23591f[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> b(long j10, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int i10 = r0.i(jArr, j10, true, true);
        long j11 = jArr[i10];
        long j12 = jArr2[i10];
        int i11 = i10 + 1;
        if (i11 == jArr.length) {
            valueOf = Long.valueOf(j11);
            valueOf2 = Long.valueOf(j12);
        } else {
            long j13 = jArr[i11];
            long j14 = jArr2[i11];
            double d10 = j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11);
            valueOf = Long.valueOf(j10);
            valueOf2 = Long.valueOf(((long) (d10 * (j14 - j12))) + j12);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // f7.g
    public long c(long j10) {
        return r0.C0(((Long) b(j10, this.f14962a, this.f14963b).second).longValue());
    }

    @Override // y6.z
    public z.a d(long j10) {
        Pair<Long, Long> b10 = b(r0.a1(r0.r(j10, 0L, this.f14964c)), this.f14963b, this.f14962a);
        return new z.a(new a0(r0.C0(((Long) b10.first).longValue()), ((Long) b10.second).longValue()));
    }

    @Override // f7.g
    public long g() {
        return -1L;
    }

    @Override // y6.z
    public boolean h() {
        return true;
    }

    @Override // y6.z
    public long i() {
        return this.f14964c;
    }
}
