package p217l8;

import java.util.Collections;
import java.util.List;
import p120g8.C7484b;
import p120g8.InterfaceC7491i;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: l8.d */
/* loaded from: classes.dex */
final class C9410d implements InterfaceC7491i {

    /* renamed from: a */
    private final List<List<C7484b>> f22856a;

    /* renamed from: b */
    private final List<Long> f22857b;

    public C9410d(List<List<C7484b>> list, List<Long> list2) {
        this.f22856a = list;
        this.f22857b = list2;
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: b */
    public int mo22798b(long j10) {
        int m34916d = C11172r0.m34916d(this.f22857b, Long.valueOf(j10), false, false);
        if (m34916d < this.f22857b.size()) {
            return m34916d;
        }
        return -1;
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: h */
    public List<C7484b> mo22799h(long j10) {
        int m34920f = C11172r0.m34920f(this.f22857b, Long.valueOf(j10), true, false);
        return m34920f == -1 ? Collections.emptyList() : this.f22856a.get(m34920f);
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: i */
    public long mo22800i(int i10) {
        C11137a.m34599a(i10 >= 0);
        C11137a.m34599a(i10 < this.f22857b.size());
        return this.f22857b.get(i10).longValue();
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: l */
    public int mo22801l() {
        return this.f22857b.size();
    }
}
