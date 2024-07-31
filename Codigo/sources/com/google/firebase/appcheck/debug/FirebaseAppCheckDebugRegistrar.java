package com.google.firebase.appcheck.debug;

import com.google.firebase.appcheck.debug.FirebaseAppCheckDebugRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import dc.a;
import dc.b;
import fc.c;
import gc.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import pc.d;
import pc.e0;
import pc.q;
import ye.h;
import zb.g;

/* loaded from: classes.dex */
public class FirebaseAppCheckDebugRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e b(e0 e0Var, e0 e0Var2, e0 e0Var3, d dVar) {
        return new e((g) dVar.get(g.class), dVar.f(c.class), (Executor) dVar.e(e0Var), (Executor) dVar.e(e0Var2), (Executor) dVar.e(e0Var3));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pc.c<?>> getComponents() {
        final e0 a10 = e0.a(dc.c.class, Executor.class);
        final e0 a11 = e0.a(a.class, Executor.class);
        final e0 a12 = e0.a(b.class, Executor.class);
        return Arrays.asList(pc.c.c(e.class).h("fire-app-check-debug").b(q.j(g.class)).b(q.i(c.class)).b(q.k(a10)).b(q.k(a11)).b(q.k(a12)).f(new pc.g() { // from class: fc.b
            @Override // pc.g
            public final Object a(d dVar) {
                e b10;
                b10 = FirebaseAppCheckDebugRegistrar.b(e0.this, a11, a12, dVar);
                return b10;
            }
        }).d(), h.b("fire-app-check-debug", "17.1.1"));
    }
}
