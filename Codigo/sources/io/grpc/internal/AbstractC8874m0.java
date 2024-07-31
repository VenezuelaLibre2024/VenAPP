package io.grpc.internal;

import p082eb.C7153i;
import p082eb.C7159o;
import vi.AbstractC11957y0;

/* renamed from: io.grpc.internal.m0 */
/* loaded from: classes3.dex */
abstract class AbstractC8874m0 extends AbstractC11957y0 {

    /* renamed from: a */
    private final AbstractC11957y0 f20734a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8874m0(AbstractC11957y0 abstractC11957y0) {
        C7159o.m21313p(abstractC11957y0, "delegate can not be null");
        this.f20734a = abstractC11957y0;
    }

    @Override // vi.AbstractC11957y0
    /* renamed from: b */
    public void mo25343b() {
        this.f20734a.mo25343b();
    }

    @Override // vi.AbstractC11957y0
    /* renamed from: c */
    public void mo25344c() {
        this.f20734a.mo25344c();
    }

    @Override // vi.AbstractC11957y0
    /* renamed from: d */
    public void mo25345d(AbstractC11957y0.e eVar) {
        this.f20734a.mo25345d(eVar);
    }

    @Override // vi.AbstractC11957y0
    @Deprecated
    /* renamed from: e */
    public void mo25671e(AbstractC11957y0.f fVar) {
        this.f20734a.mo25671e(fVar);
    }

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", this.f20734a).toString();
    }
}
