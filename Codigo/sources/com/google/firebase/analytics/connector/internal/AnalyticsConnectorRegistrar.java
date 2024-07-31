package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import pc.q;
import ye.h;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<pc.c<?>> getComponents() {
        return Arrays.asList(pc.c.c(cc.a.class).b(q.j(zb.g.class)).b(q.j(Context.class)).b(q.j(nd.d.class)).f(new pc.g() { // from class: com.google.firebase.analytics.connector.internal.c
            @Override // pc.g
            public final Object a(pc.d dVar) {
                cc.a h10;
                h10 = cc.b.h((zb.g) dVar.get(zb.g.class), (Context) dVar.get(Context.class), (nd.d) dVar.get(nd.d.class));
                return h10;
            }
        }).e().d(), h.b("fire-analytics", "21.5.0"));
    }
}
