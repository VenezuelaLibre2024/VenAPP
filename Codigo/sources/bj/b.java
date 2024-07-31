package bj;

import eb.i;
import java.util.concurrent.ScheduledExecutorService;
import vi.k1;
import vi.p0;

/* loaded from: classes3.dex */
public abstract class b extends p0.d {
    @Override // vi.p0.d
    public p0.h a(p0.b bVar) {
        return g().a(bVar);
    }

    @Override // vi.p0.d
    public vi.f b() {
        return g().b();
    }

    @Override // vi.p0.d
    public ScheduledExecutorService c() {
        return g().c();
    }

    @Override // vi.p0.d
    public k1 d() {
        return g().d();
    }

    @Override // vi.p0.d
    public void e() {
        g().e();
    }

    protected abstract p0.d g();

    public String toString() {
        return i.c(this).d("delegate", g()).toString();
    }
}
