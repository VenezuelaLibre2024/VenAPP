package com.google.firebase.dynamiclinks.internal;

import androidx.annotation.Keep;
import cc.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import fd.b;
import gd.g;
import java.util.Arrays;
import java.util.List;
import pc.c;
import pc.d;
import pc.q;
import ye.h;

@Keep
/* loaded from: classes.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b lambda$getComponents$0(d dVar) {
        return new g((zb.g) dVar.get(zb.g.class), dVar.f(a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(b.class).h(LIBRARY_NAME).b(q.j(zb.g.class)).b(q.i(a.class)).f(new pc.g() { // from class: gd.f
            @Override // pc.g
            public final Object a(pc.d dVar) {
                fd.b lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseDynamicLinkRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            }
        }).d(), h.b(LIBRARY_NAME, "21.2.0"));
    }
}
