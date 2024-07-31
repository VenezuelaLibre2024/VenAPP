package bj;

import java.util.concurrent.ScheduledExecutorService;
import p082eb.C7153i;
import vi.AbstractC11910f;
import vi.AbstractC11939p0;
import vi.ExecutorC11927k1;

/* renamed from: bj.b */
/* loaded from: classes3.dex */
public abstract class AbstractC1799b extends AbstractC11939p0.d {
    @Override // vi.AbstractC11939p0.d
    /* renamed from: a */
    public AbstractC11939p0.h mo9552a(AbstractC11939p0.b bVar) {
        return mo9557g().mo9552a(bVar);
    }

    @Override // vi.AbstractC11939p0.d
    /* renamed from: b */
    public AbstractC11910f mo9553b() {
        return mo9557g().mo9553b();
    }

    @Override // vi.AbstractC11939p0.d
    /* renamed from: c */
    public ScheduledExecutorService mo9554c() {
        return mo9557g().mo9554c();
    }

    @Override // vi.AbstractC11939p0.d
    /* renamed from: d */
    public ExecutorC11927k1 mo9555d() {
        return mo9557g().mo9555d();
    }

    @Override // vi.AbstractC11939p0.d
    /* renamed from: e */
    public void mo9556e() {
        mo9557g().mo9556e();
    }

    /* renamed from: g */
    protected abstract AbstractC11939p0.d mo9557g();

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", mo9557g()).toString();
    }
}
