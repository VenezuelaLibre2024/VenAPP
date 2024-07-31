package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import ed.b;
import f6.g;
import h6.u;
import java.util.Arrays;
import java.util.List;
import pc.c;
import pc.d;
import pc.e0;
import pc.q;
import ye.h;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(d dVar) {
        u.f((Context) dVar.get(Context.class));
        return u.c().g(a.f8097h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$1(d dVar) {
        u.f((Context) dVar.get(Context.class));
        return u.c().g(a.f8097h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$2(d dVar) {
        u.f((Context) dVar.get(Context.class));
        return u.c().g(a.f8096g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(g.class).h(LIBRARY_NAME).b(q.j(Context.class)).f(new pc.g() { // from class: ed.c
            @Override // pc.g
            public final Object a(pc.d dVar) {
                g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            }
        }).d(), c.e(e0.a(ed.a.class, g.class)).b(q.j(Context.class)).f(new pc.g() { // from class: ed.d
            @Override // pc.g
            public final Object a(pc.d dVar) {
                g lambda$getComponents$1;
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(dVar);
                return lambda$getComponents$1;
            }
        }).d(), c.e(e0.a(b.class, g.class)).b(q.j(Context.class)).f(new pc.g() { // from class: ed.e
            @Override // pc.g
            public final Object a(pc.d dVar) {
                g lambda$getComponents$2;
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(dVar);
                return lambda$getComponents$2;
            }
        }).d(), h.b(LIBRARY_NAME, "18.2.0"));
    }
}
