package com.google.firebase.inappmessaging;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import be.k;
import be.n;
import be.z;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingRegistrar;
import dc.a;
import dc.b;
import dc.c;
import f6.g;
import fe.f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import pc.d;
import pc.e0;
import qd.q;
import ye.h;
import zd.r2;

@Keep
/* loaded from: classes.dex */
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";
    private e0<Executor> backgroundExecutor = e0.a(a.class, Executor.class);
    private e0<Executor> blockingExecutor = e0.a(b.class, Executor.class);
    private e0<Executor> lightWeightExecutor = e0.a(c.class, Executor.class);
    private e0<g> legacyTransportFactory = e0.a(ed.a.class, g.class);

    /* JADX INFO: Access modifiers changed from: private */
    public q providesFirebaseInAppMessaging(d dVar) {
        zb.g gVar = (zb.g) dVar.get(zb.g.class);
        f fVar = (f) dVar.get(f.class);
        ee.a h10 = dVar.h(cc.a.class);
        nd.d dVar2 = (nd.d) dVar.get(nd.d.class);
        ae.d d10 = ae.c.a().c(new n((Application) gVar.m())).b(new k(h10, dVar2)).a(new be.a()).f(new be.e0(new r2())).e(new be.q((Executor) dVar.e(this.lightWeightExecutor), (Executor) dVar.e(this.backgroundExecutor), (Executor) dVar.e(this.blockingExecutor))).d();
        return ae.b.a().c(new zd.b(((com.google.firebase.abt.component.a) dVar.get(com.google.firebase.abt.component.a.class)).b("fiam"), (Executor) dVar.e(this.blockingExecutor))).d(new be.d(gVar, fVar, d10.g())).b(new z(gVar)).a(d10).e((g) dVar.e(this.legacyTransportFactory)).build().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<pc.c<?>> getComponents() {
        return Arrays.asList(pc.c.c(q.class).h(LIBRARY_NAME).b(pc.q.j(Context.class)).b(pc.q.j(f.class)).b(pc.q.j(zb.g.class)).b(pc.q.j(com.google.firebase.abt.component.a.class)).b(pc.q.a(cc.a.class)).b(pc.q.k(this.legacyTransportFactory)).b(pc.q.j(nd.d.class)).b(pc.q.k(this.backgroundExecutor)).b(pc.q.k(this.blockingExecutor)).b(pc.q.k(this.lightWeightExecutor)).f(new pc.g() { // from class: qd.w
            @Override // pc.g
            public final Object a(pc.d dVar) {
                q providesFirebaseInAppMessaging;
                providesFirebaseInAppMessaging = FirebaseInAppMessagingRegistrar.this.providesFirebaseInAppMessaging(dVar);
                return providesFirebaseInAppMessaging;
            }
        }).e().d(), h.b(LIBRARY_NAME, "20.4.0"));
    }
}
