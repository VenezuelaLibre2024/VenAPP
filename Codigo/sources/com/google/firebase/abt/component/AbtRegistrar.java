package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import pc.c;
import pc.d;
import pc.g;
import pc.q;
import ye.h;

@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new a((Context) dVar.get(Context.class), dVar.f(cc.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(a.class).h(LIBRARY_NAME).b(q.j(Context.class)).b(q.i(cc.a.class)).f(new g() { // from class: bc.a
            @Override // pc.g
            public final Object a(d dVar) {
                com.google.firebase.abt.component.a lambda$getComponents$0;
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            }
        }).d(), h.b(LIBRARY_NAME, "21.1.1"));
    }
}
