package com.google.firebase.appcheck.safetynet;

import com.google.firebase.appcheck.safetynet.FirebaseAppCheckSafetyNetRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import dc.a;
import dc.b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import nc.g;
import pc.c;
import pc.d;
import pc.e0;
import pc.q;
import ye.h;

/* loaded from: classes.dex */
public class FirebaseAppCheckSafetyNetRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g b(e0 e0Var, e0 e0Var2, e0 e0Var3, d dVar) {
        return new g((zb.g) dVar.get(zb.g.class), (Executor) dVar.e(e0Var), (Executor) dVar.e(e0Var2), (Executor) dVar.e(e0Var3));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        final e0 a10 = e0.a(dc.c.class, Executor.class);
        final e0 a11 = e0.a(a.class, Executor.class);
        final e0 a12 = e0.a(b.class, Executor.class);
        return Arrays.asList(c.c(g.class).h("fire-app-check-safety-net").b(q.j(zb.g.class)).b(q.k(a10)).b(q.k(a11)).b(q.k(a12)).f(new pc.g() { // from class: mc.a
            @Override // pc.g
            public final Object a(d dVar) {
                g b10;
                b10 = FirebaseAppCheckSafetyNetRegistrar.b(e0.this, a11, a12, dVar);
                return b10;
            }
        }).d(), h.b("fire-app-check-safety-net", "16.1.2"));
    }
}
