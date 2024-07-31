package com.google.mlkit.vision.common.internal;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;
import pc.g;
import pc.q;

/* loaded from: classes2.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return zzp.zzi(pc.c.c(a.class).b(q.n(a.C0187a.class)).f(new g() { // from class: com.google.mlkit.vision.common.internal.d
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return new a(dVar.c(a.C0187a.class));
            }
        }).d());
    }
}
