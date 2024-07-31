package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import pc.e0;
import pc.q;
import qc.j;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ fe.f lambda$getComponents$0(pc.d dVar) {
        return new c((zb.g) dVar.get(zb.g.class), dVar.f(od.i.class), (ExecutorService) dVar.e(e0.a(dc.a.class, ExecutorService.class)), j.c((Executor) dVar.e(e0.a(dc.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pc.c<?>> getComponents() {
        return Arrays.asList(pc.c.c(fe.f.class).h(LIBRARY_NAME).b(q.j(zb.g.class)).b(q.i(od.i.class)).b(q.k(e0.a(dc.a.class, ExecutorService.class))).b(q.k(e0.a(dc.b.class, Executor.class))).f(new pc.g() { // from class: fe.g
            @Override // pc.g
            public final Object a(pc.d dVar) {
                f lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            }
        }).d(), od.h.a(), ye.h.b(LIBRARY_NAME, "17.2.0"));
    }
}
