package p236m8;

import java.util.Collections;
import java.util.List;
import p120g8.C7484b;
import p120g8.InterfaceC7491i;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: m8.b */
/* loaded from: classes.dex */
final class C9553b implements InterfaceC7491i {

    /* renamed from: a */
    private final C7484b[] f23253a;

    /* renamed from: b */
    private final long[] f23254b;

    public C9553b(C7484b[] c7484bArr, long[] jArr) {
        this.f23253a = c7484bArr;
        this.f23254b = jArr;
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: b */
    public int mo22798b(long j10) {
        int m34918e = C11172r0.m34918e(this.f23254b, j10, false, false);
        if (m34918e < this.f23254b.length) {
            return m34918e;
        }
        return -1;
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: h */
    public List<C7484b> mo22799h(long j10) {
        C7484b c7484b;
        int m34926i = C11172r0.m34926i(this.f23254b, j10, true, false);
        return (m34926i == -1 || (c7484b = this.f23253a[m34926i]) == C7484b.f17635C) ? Collections.emptyList() : Collections.singletonList(c7484b);
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: i */
    public long mo22800i(int i10) {
        C11137a.m34599a(i10 >= 0);
        C11137a.m34599a(i10 < this.f23254b.length);
        return this.f23254b[i10];
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: l */
    public int mo22801l() {
        return this.f23254b.length;
    }
}
