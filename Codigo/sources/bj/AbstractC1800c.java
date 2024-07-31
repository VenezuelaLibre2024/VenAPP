package bj;

import java.util.List;
import p082eb.C7153i;
import vi.AbstractC11939p0;
import vi.C11954x;

/* renamed from: bj.c */
/* loaded from: classes3.dex */
public abstract class AbstractC1800c extends AbstractC11939p0.h {
    @Override // vi.AbstractC11939p0.h
    /* renamed from: b */
    public List<C11954x> mo9558b() {
        return mo9563i().mo9558b();
    }

    @Override // vi.AbstractC11939p0.h
    /* renamed from: d */
    public Object mo9559d() {
        return mo9563i().mo9559d();
    }

    @Override // vi.AbstractC11939p0.h
    /* renamed from: e */
    public void mo9560e() {
        mo9563i().mo9560e();
    }

    @Override // vi.AbstractC11939p0.h
    /* renamed from: f */
    public void mo9561f() {
        mo9563i().mo9561f();
    }

    @Override // vi.AbstractC11939p0.h
    /* renamed from: g */
    public void mo9562g(AbstractC11939p0.j jVar) {
        mo9563i().mo9562g(jVar);
    }

    /* renamed from: i */
    protected abstract AbstractC11939p0.h mo9563i();

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", mo9563i()).toString();
    }
}
