package y6;

import t8.r0;
import y6.t;
import y6.z;

/* loaded from: classes.dex */
public final class s implements z {

    /* renamed from: a, reason: collision with root package name */
    private final t f31770a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31771b;

    public s(t tVar, long j10) {
        this.f31770a = tVar;
        this.f31771b = j10;
    }

    private a0 a(long j10, long j11) {
        return new a0((j10 * 1000000) / this.f31770a.f31776e, this.f31771b + j11);
    }

    @Override // y6.z
    public z.a d(long j10) {
        t8.a.i(this.f31770a.f31782k);
        t tVar = this.f31770a;
        t.a aVar = tVar.f31782k;
        long[] jArr = aVar.f31784a;
        long[] jArr2 = aVar.f31785b;
        int i10 = r0.i(jArr, tVar.i(j10), true, false);
        a0 a10 = a(i10 == -1 ? 0L : jArr[i10], i10 != -1 ? jArr2[i10] : 0L);
        if (a10.f31687a == j10 || i10 == jArr.length - 1) {
            return new z.a(a10);
        }
        int i11 = i10 + 1;
        return new z.a(a10, a(jArr[i11], jArr2[i11]));
    }

    @Override // y6.z
    public boolean h() {
        return true;
    }

    @Override // y6.z
    public long i() {
        return this.f31770a.f();
    }
}
