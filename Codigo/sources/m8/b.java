package m8;

import g8.i;
import java.util.Collections;
import java.util.List;
import t8.r0;

/* loaded from: classes.dex */
final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    private final g8.b[] f21399a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f21400b;

    public b(g8.b[] bVarArr, long[] jArr) {
        this.f21399a = bVarArr;
        this.f21400b = jArr;
    }

    @Override // g8.i
    public int b(long j10) {
        int e10 = r0.e(this.f21400b, j10, false, false);
        if (e10 < this.f21400b.length) {
            return e10;
        }
        return -1;
    }

    @Override // g8.i
    public List<g8.b> h(long j10) {
        g8.b bVar;
        int i10 = r0.i(this.f21400b, j10, true, false);
        return (i10 == -1 || (bVar = this.f21399a[i10]) == g8.b.C) ? Collections.emptyList() : Collections.singletonList(bVar);
    }

    @Override // g8.i
    public long i(int i10) {
        t8.a.a(i10 >= 0);
        t8.a.a(i10 < this.f21400b.length);
        return this.f21400b[i10];
    }

    @Override // g8.i
    public int l() {
        return this.f21400b.length;
    }
}
