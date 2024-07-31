package bj;

import eb.i;
import java.util.List;
import vi.p0;
import vi.x;

/* loaded from: classes3.dex */
public abstract class c extends p0.h {
    @Override // vi.p0.h
    public List<x> b() {
        return i().b();
    }

    @Override // vi.p0.h
    public Object d() {
        return i().d();
    }

    @Override // vi.p0.h
    public void e() {
        i().e();
    }

    @Override // vi.p0.h
    public void f() {
        i().f();
    }

    @Override // vi.p0.h
    public void g(p0.j jVar) {
        i().g(jVar);
    }

    protected abstract p0.h i();

    public String toString() {
        return i.c(this).d("delegate", i()).toString();
    }
}
