package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.internal.mlkit_vision_barcode.zzcv;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.vision.barcode.internal.f;
import java.util.List;
import pc.q;

/* loaded from: classes2.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return zzcv.zzh(pc.c.c(f.class).b(q.j(com.google.mlkit.common.sdkinternal.i.class)).f(new pc.g() { // from class: zf.a
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return new f((i) dVar.get(i.class));
            }
        }).d(), pc.c.c(e.class).b(q.j(f.class)).b(q.j(com.google.mlkit.common.sdkinternal.d.class)).b(q.j(com.google.mlkit.common.sdkinternal.i.class)).f(new pc.g() { // from class: com.google.mlkit.vision.barcode.internal.c
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return new e((f) dVar.get(f.class), (com.google.mlkit.common.sdkinternal.d) dVar.get(com.google.mlkit.common.sdkinternal.d.class), (com.google.mlkit.common.sdkinternal.i) dVar.get(com.google.mlkit.common.sdkinternal.i.class));
            }
        }).d());
    }
}
