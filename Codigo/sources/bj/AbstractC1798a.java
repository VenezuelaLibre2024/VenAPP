package bj;

import p082eb.C7153i;
import vi.AbstractC11939p0;
import vi.C11915g1;

/* renamed from: bj.a */
/* loaded from: classes3.dex */
public abstract class AbstractC1798a extends AbstractC11939p0 {
    @Override // vi.AbstractC11939p0
    /* renamed from: b */
    public boolean mo9548b() {
        return mo9551f().mo9548b();
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: c */
    public void mo9549c(C11915g1 c11915g1) {
        mo9551f().mo9549c(c11915g1);
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: d */
    public void mo9550d(AbstractC11939p0.g gVar) {
        mo9551f().mo9550d(gVar);
    }

    /* renamed from: f */
    protected abstract AbstractC11939p0 mo9551f();

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", mo9551f()).toString();
    }
}
