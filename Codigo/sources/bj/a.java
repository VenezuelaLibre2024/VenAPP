package bj;

import eb.i;
import vi.g1;
import vi.p0;

/* loaded from: classes3.dex */
public abstract class a extends p0 {
    @Override // vi.p0
    public boolean b() {
        return f().b();
    }

    @Override // vi.p0
    public void c(g1 g1Var) {
        f().c(g1Var);
    }

    @Override // vi.p0
    public void d(p0.g gVar) {
        f().d(gVar);
    }

    protected abstract p0 f();

    public String toString() {
        return i.c(this).d("delegate", f()).toString();
    }
}
