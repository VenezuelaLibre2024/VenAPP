package com.google.firebase.appcheck.playintegrity;

import com.google.firebase.appcheck.playintegrity.FirebaseAppCheckPlayIntegrityRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import dc.b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import lc.i;
import pc.c;
import pc.d;
import pc.e0;
import pc.q;
import ye.h;
import zb.g;

/* loaded from: classes.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i b(e0 e0Var, e0 e0Var2, d dVar) {
        return new i((g) dVar.get(g.class), (Executor) dVar.e(e0Var), (Executor) dVar.e(e0Var2));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        final e0 a10 = e0.a(dc.c.class, Executor.class);
        final e0 a11 = e0.a(b.class, Executor.class);
        return Arrays.asList(c.c(i.class).h("fire-app-check-play-integrity").b(q.j(g.class)).b(q.k(a10)).b(q.k(a11)).f(new pc.g() { // from class: kc.a
            @Override // pc.g
            public final Object a(d dVar) {
                i b10;
                b10 = FirebaseAppCheckPlayIntegrityRegistrar.b(e0.this, a11, dVar);
                return b10;
            }
        }).d(), h.b("fire-app-check-play-integrity", "17.1.1"));
    }
}
