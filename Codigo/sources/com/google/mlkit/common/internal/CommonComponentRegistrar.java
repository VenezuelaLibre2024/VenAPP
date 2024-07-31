package com.google.mlkit.common.internal;

import com.google.android.gms.internal.mlkit_common.zzar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.a;
import com.google.mlkit.common.sdkinternal.d;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.common.sdkinternal.j;
import com.google.mlkit.common.sdkinternal.n;
import java.util.List;
import pc.c;
import pc.g;
import pc.q;
import tf.c;
import uf.b;

/* loaded from: classes2.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return zzar.zzi(n.f13064b, c.c(b.class).b(q.j(i.class)).f(new g() { // from class: rf.a
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return new uf.b((i) dVar.get(i.class));
            }
        }).d(), c.c(j.class).f(new g() { // from class: rf.b
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return new j();
            }
        }).d(), c.c(tf.c.class).b(q.n(c.a.class)).f(new g() { // from class: rf.c
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return new tf.c(dVar.c(c.a.class));
            }
        }).d(), pc.c.c(d.class).b(q.l(j.class)).f(new g() { // from class: rf.d
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return new com.google.mlkit.common.sdkinternal.d(dVar.f(j.class));
            }
        }).d(), pc.c.c(a.class).f(new g() { // from class: rf.e
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return com.google.mlkit.common.sdkinternal.a.a();
            }
        }).d(), pc.c.c(com.google.mlkit.common.sdkinternal.b.class).b(q.j(a.class)).f(new g() { // from class: rf.f
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return new com.google.mlkit.common.sdkinternal.b((com.google.mlkit.common.sdkinternal.a) dVar.get(com.google.mlkit.common.sdkinternal.a.class));
            }
        }).d(), pc.c.c(sf.a.class).b(q.j(i.class)).f(new g() { // from class: rf.g
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return new sf.a((i) dVar.get(i.class));
            }
        }).d(), pc.c.m(c.a.class).b(q.l(sf.a.class)).f(new g() { // from class: rf.h
            @Override // pc.g
            public final Object a(pc.d dVar) {
                return new c.a(tf.a.class, dVar.f(sf.a.class));
            }
        }).d());
    }
}
