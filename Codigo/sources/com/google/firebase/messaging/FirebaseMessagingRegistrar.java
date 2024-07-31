package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(pc.d dVar) {
        return new FirebaseMessaging((zb.g) dVar.get(zb.g.class), (pd.a) dVar.get(pd.a.class), dVar.f(ye.i.class), dVar.f(od.j.class), (fe.f) dVar.get(fe.f.class), (f6.g) dVar.get(f6.g.class), (nd.d) dVar.get(nd.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<pc.c<?>> getComponents() {
        return Arrays.asList(pc.c.c(FirebaseMessaging.class).h(LIBRARY_NAME).b(pc.q.j(zb.g.class)).b(pc.q.h(pd.a.class)).b(pc.q.i(ye.i.class)).b(pc.q.i(od.j.class)).b(pc.q.h(f6.g.class)).b(pc.q.j(fe.f.class)).b(pc.q.j(nd.d.class)).f(new pc.g() { // from class: com.google.firebase.messaging.c0
            @Override // pc.g
            public final Object a(pc.d dVar) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            }
        }).c().d(), ye.h.b(LIBRARY_NAME, "23.3.1"));
    }
}
