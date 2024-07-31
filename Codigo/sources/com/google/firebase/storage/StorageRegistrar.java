package com.google.firebase.storage;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

@Keep
/* loaded from: classes2.dex */
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    pc.e0<Executor> blockingExecutor = pc.e0.a(dc.b.class, Executor.class);
    pc.e0<Executor> uiExecutor = pc.e0.a(dc.d.class, Executor.class);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g lambda$getComponents$0(pc.d dVar) {
        return new g((zb.g) dVar.get(zb.g.class), dVar.f(oc.b.class), dVar.f(jc.b.class), (Executor) dVar.e(this.blockingExecutor), (Executor) dVar.e(this.uiExecutor));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pc.c<?>> getComponents() {
        return Arrays.asList(pc.c.c(g.class).h(LIBRARY_NAME).b(pc.q.j(zb.g.class)).b(pc.q.k(this.blockingExecutor)).b(pc.q.k(this.uiExecutor)).b(pc.q.i(oc.b.class)).b(pc.q.i(jc.b.class)).f(new pc.g() { // from class: com.google.firebase.storage.q
            @Override // pc.g
            public final Object a(pc.d dVar) {
                g lambda$getComponents$0;
                lambda$getComponents$0 = StorageRegistrar.this.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            }
        }).d(), ye.h.b(LIBRARY_NAME, "20.3.0"));
    }
}
