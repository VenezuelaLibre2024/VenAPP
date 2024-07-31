package com.google.firebase.inappmessaging.display;

import android.app.Application;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplayRegistrar;
import java.util.Arrays;
import java.util.List;
import pc.c;
import pc.d;
import qd.q;
import sd.b;
import xd.a;
import xd.e;
import ye.h;
import zb.g;

@Keep
/* loaded from: classes.dex */
public class FirebaseInAppMessagingDisplayRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiamd";

    /* JADX INFO: Access modifiers changed from: private */
    public b buildFirebaseInAppMessagingUI(d dVar) {
        g gVar = (g) dVar.get(g.class);
        q qVar = (q) dVar.get(q.class);
        Application application = (Application) gVar.m();
        b a10 = wd.b.a().c(wd.d.a().a(new a(application)).b()).b(new e(qVar)).a().a();
        application.registerActivityLifecycleCallbacks(a10);
        return a10;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(b.class).h(LIBRARY_NAME).b(pc.q.j(g.class)).b(pc.q.j(q.class)).f(new pc.g() { // from class: sd.c
            @Override // pc.g
            public final Object a(pc.d dVar) {
                b buildFirebaseInAppMessagingUI;
                buildFirebaseInAppMessagingUI = FirebaseInAppMessagingDisplayRegistrar.this.buildFirebaseInAppMessagingUI(dVar);
                return buildFirebaseInAppMessagingUI;
            }
        }).e().d(), h.b(LIBRARY_NAME, "20.4.0"));
    }
}
