package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.c;
import fe.f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import oe.b;
import oe.e;
import pc.d;
import pc.e0;
import pc.q;
import pe.a;
import ye.h;
import zb.g;
import zb.r;

@Keep
/* loaded from: classes.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b lambda$getComponents$0(e0 e0Var, d dVar) {
        return new b((g) dVar.get(g.class), (r) dVar.f(r.class).get(), (Executor) dVar.e(e0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e providesFirebasePerformance(d dVar) {
        dVar.get(b.class);
        return a.b().b(new qe.a((g) dVar.get(g.class), (f) dVar.get(f.class), dVar.f(c.class), dVar.f(f6.g.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<pc.c<?>> getComponents() {
        final e0 a10 = e0.a(dc.d.class, Executor.class);
        return Arrays.asList(pc.c.c(e.class).h(LIBRARY_NAME).b(q.j(g.class)).b(q.l(c.class)).b(q.j(f.class)).b(q.l(f6.g.class)).b(q.j(b.class)).f(new pc.g() { // from class: oe.c
            @Override // pc.g
            public final Object a(pc.d dVar) {
                e providesFirebasePerformance;
                providesFirebasePerformance = FirebasePerfRegistrar.providesFirebasePerformance(dVar);
                return providesFirebasePerformance;
            }
        }).d(), pc.c.c(b.class).h(EARLY_LIBRARY_NAME).b(q.j(g.class)).b(q.i(r.class)).b(q.k(a10)).e().f(new pc.g() { // from class: oe.d
            @Override // pc.g
            public final Object a(pc.d dVar) {
                b lambda$getComponents$0;
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(e0.this, dVar);
                return lambda$getComponents$0;
            }
        }).d(), h.b(LIBRARY_NAME, "20.5.1"));
    }
}
