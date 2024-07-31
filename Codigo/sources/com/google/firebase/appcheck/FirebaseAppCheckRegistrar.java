package com.google.firebase.appcheck;

import com.google.firebase.appcheck.FirebaseAppCheckRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import dc.a;
import dc.b;
import ec.e;
import hc.j;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import od.h;
import od.i;
import pc.c;
import pc.d;
import pc.e0;
import pc.q;
import zb.g;

/* loaded from: classes.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e b(e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, d dVar) {
        return new j((g) dVar.get(g.class), dVar.f(i.class), (Executor) dVar.e(e0Var), (Executor) dVar.e(e0Var2), (Executor) dVar.e(e0Var3), (ScheduledExecutorService) dVar.e(e0Var4));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        final e0 a10 = e0.a(dc.d.class, Executor.class);
        final e0 a11 = e0.a(dc.c.class, Executor.class);
        final e0 a12 = e0.a(a.class, Executor.class);
        final e0 a13 = e0.a(b.class, ScheduledExecutorService.class);
        return Arrays.asList(c.d(e.class, jc.b.class).h("fire-app-check").b(q.j(g.class)).b(q.k(a10)).b(q.k(a11)).b(q.k(a12)).b(q.k(a13)).b(q.i(i.class)).f(new pc.g() { // from class: ec.f
            @Override // pc.g
            public final Object a(pc.d dVar) {
                e b10;
                b10 = FirebaseAppCheckRegistrar.b(e0.this, a11, a12, a13, dVar);
                return b10;
            }
        }).c().d(), h.a(), ye.h.b("fire-app-check", "17.1.1"));
    }
}
