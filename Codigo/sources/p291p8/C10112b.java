package p291p8;

import java.util.Collections;
import java.util.List;
import p120g8.C7484b;
import p120g8.InterfaceC7491i;
import p363t8.C11137a;

/* renamed from: p8.b */
/* loaded from: classes.dex */
final class C10112b implements InterfaceC7491i {

    /* renamed from: a */
    private final List<C7484b> f24804a;

    public C10112b(List<C7484b> list) {
        this.f24804a = Collections.unmodifiableList(list);
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: b */
    public int mo22798b(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: h */
    public List<C7484b> mo22799h(long j10) {
        return j10 >= 0 ? this.f24804a : Collections.emptyList();
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: i */
    public long mo22800i(int i10) {
        C11137a.m34599a(i10 == 0);
        return 0L;
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: l */
    public int mo22801l() {
        return 1;
    }
}
