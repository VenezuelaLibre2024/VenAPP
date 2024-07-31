package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(pc.e0 e0Var, pc.e0 e0Var2, pc.e0 e0Var3, pc.e0 e0Var4, pc.e0 e0Var5, pc.d dVar) {
        return new oc.a2((zb.g) dVar.get(zb.g.class), dVar.f(jc.b.class), dVar.f(od.i.class), (Executor) dVar.e(e0Var), (Executor) dVar.e(e0Var2), (Executor) dVar.e(e0Var3), (ScheduledExecutorService) dVar.e(e0Var4), (Executor) dVar.e(e0Var5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<pc.c<?>> getComponents() {
        final pc.e0 a10 = pc.e0.a(dc.a.class, Executor.class);
        final pc.e0 a11 = pc.e0.a(dc.b.class, Executor.class);
        final pc.e0 a12 = pc.e0.a(dc.c.class, Executor.class);
        final pc.e0 a13 = pc.e0.a(dc.c.class, ScheduledExecutorService.class);
        final pc.e0 a14 = pc.e0.a(dc.d.class, Executor.class);
        return Arrays.asList(pc.c.d(FirebaseAuth.class, oc.b.class).b(pc.q.j(zb.g.class)).b(pc.q.l(od.i.class)).b(pc.q.k(a10)).b(pc.q.k(a11)).b(pc.q.k(a12)).b(pc.q.k(a13)).b(pc.q.k(a14)).b(pc.q.i(jc.b.class)).f(new pc.g() { // from class: com.google.firebase.auth.j1
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(pc.e0.this, a11, a12, a13, a14, dVar);
            }
        }).d(), od.h.a(), ye.h.b("fire-auth", "22.3.0"));
    }
}
