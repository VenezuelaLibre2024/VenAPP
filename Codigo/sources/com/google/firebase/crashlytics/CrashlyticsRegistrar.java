package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import ef.b;
import fe.f;
import java.util.Arrays;
import java.util.List;
import pc.c;
import pc.d;
import pc.q;
import ye.h;
import zb.g;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        ef.a.f14644a.a(b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(d dVar) {
        return a.e((g) dVar.get(g.class), (f) dVar.get(f.class), dVar.h(sc.a.class), dVar.h(cc.a.class), dVar.h(bf.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(a.class).h("fire-cls").b(q.j(g.class)).b(q.j(f.class)).b(q.a(sc.a.class)).b(q.a(cc.a.class)).b(q.a(bf.a.class)).f(new pc.g() { // from class: rc.f
            @Override // pc.g
            public final Object a(pc.d dVar) {
                com.google.firebase.crashlytics.a b10;
                b10 = CrashlyticsRegistrar.this.b(dVar);
                return b10;
            }
        }).e().d(), h.b("fire-cls", "18.6.0"));
    }
}
