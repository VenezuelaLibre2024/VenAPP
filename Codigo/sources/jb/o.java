package jb;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import vb.a0;
import vb.c0;
import vb.i0;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a */
    private final c0.b f19854a;

    private o(c0.b bVar) {
        this.f19854a = bVar;
    }

    private synchronized c0.c c(vb.y yVar, i0 i0Var) {
        int g10;
        g10 = g();
        if (i0Var == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return c0.c.f0().A(yVar).B(g10).D(vb.z.ENABLED).C(i0Var).build();
    }

    private synchronized boolean e(int i10) {
        Iterator<c0.c> it = this.f19854a.D().iterator();
        while (it.hasNext()) {
            if (it.next().b0() == i10) {
                return true;
            }
        }
        return false;
    }

    private synchronized c0.c f(a0 a0Var) {
        return c(x.k(a0Var), a0Var.a0());
    }

    private synchronized int g() {
        int c10;
        do {
            c10 = com.google.crypto.tink.internal.t.c();
        } while (e(c10));
        return c10;
    }

    public static o i() {
        return new o(c0.e0());
    }

    public static o j(n nVar) {
        return new o(nVar.h().a());
    }

    public synchronized o a(l lVar) {
        b(lVar.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(a0 a0Var, boolean z10) {
        c0.c f10;
        f10 = f(a0Var);
        this.f19854a.A(f10);
        if (z10) {
            this.f19854a.E(f10.b0());
        }
        return f10.b0();
    }

    public synchronized n d() {
        return n.e(this.f19854a.build());
    }

    public synchronized o h(int i10) {
        for (int i11 = 0; i11 < this.f19854a.C(); i11++) {
            c0.c B = this.f19854a.B(i11);
            if (B.b0() == i10) {
                if (!B.d0().equals(vb.z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                }
                this.f19854a.E(i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}
