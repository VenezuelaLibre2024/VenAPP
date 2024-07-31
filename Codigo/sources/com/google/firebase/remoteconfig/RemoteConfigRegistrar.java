package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import fe.f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import pc.d;
import pc.e0;
import pc.q;
import ye.h;
import zb.g;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$getComponents$0(e0 e0Var, d dVar) {
        return new c((Context) dVar.get(Context.class), (ScheduledExecutorService) dVar.e(e0Var), (g) dVar.get(g.class), (f) dVar.get(f.class), ((com.google.firebase.abt.component.a) dVar.get(com.google.firebase.abt.component.a.class)).b("frc"), dVar.f(cc.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pc.c<?>> getComponents() {
        final e0 a10 = e0.a(dc.b.class, ScheduledExecutorService.class);
        return Arrays.asList(pc.c.d(c.class, bf.a.class).h(LIBRARY_NAME).b(q.j(Context.class)).b(q.k(a10)).b(q.j(g.class)).b(q.j(f.class)).b(q.j(com.google.firebase.abt.component.a.class)).b(q.i(cc.a.class)).f(new pc.g() { // from class: ze.q
            @Override // pc.g
            public final Object a(pc.d dVar) {
                com.google.firebase.remoteconfig.c lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(e0.this, dVar);
                return lambda$getComponents$0;
            }
        }).e().d(), h.b(LIBRARY_NAME, "21.6.0"));
    }
}
