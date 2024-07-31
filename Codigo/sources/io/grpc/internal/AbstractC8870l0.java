package io.grpc.internal;

import p082eb.C7153i;
import vi.AbstractC11913g;
import vi.AbstractC11945s0;
import vi.C11901c;
import vi.C11955x0;

/* renamed from: io.grpc.internal.l0 */
/* loaded from: classes3.dex */
abstract class AbstractC8870l0 extends AbstractC11945s0 {

    /* renamed from: a */
    private final AbstractC11945s0 f20708a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8870l0(AbstractC11945s0 abstractC11945s0) {
        this.f20708a = abstractC11945s0;
    }

    @Override // vi.AbstractC11904d
    /* renamed from: a */
    public String mo25517a() {
        return this.f20708a.mo25517a();
    }

    @Override // vi.AbstractC11904d
    /* renamed from: h */
    public <RequestT, ResponseT> AbstractC11913g<RequestT, ResponseT> mo25518h(C11955x0<RequestT, ResponseT> c11955x0, C11901c c11901c) {
        return this.f20708a.mo25518h(c11955x0, c11901c);
    }

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", this.f20708a).toString();
    }
}
