package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import dk.r;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
import pc.e0;
import pc.g;
import pc.q;
import zk.h0;
import zk.o1;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* loaded from: classes.dex */
    public static final class a<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f11576a = new a<>();

        @Override // pc.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h0 a(pc.d dVar) {
            Object e10 = dVar.e(e0.a(dc.a.class, Executor.class));
            n.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return o1.a((Executor) e10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T> f11577a = new b<>();

        @Override // pc.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h0 a(pc.d dVar) {
            Object e10 = dVar.e(e0.a(dc.c.class, Executor.class));
            n.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return o1.a((Executor) e10);
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final c<T> f11578a = new c<>();

        @Override // pc.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h0 a(pc.d dVar) {
            Object e10 = dVar.e(e0.a(dc.b.class, Executor.class));
            n.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return o1.a((Executor) e10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T> f11579a = new d<>();

        @Override // pc.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h0 a(pc.d dVar) {
            Object e10 = dVar.e(e0.a(dc.d.class, Executor.class));
            n.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return o1.a((Executor) e10);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pc.c<?>> getComponents() {
        List<pc.c<?>> l10;
        pc.c d10 = pc.c.e(e0.a(dc.a.class, h0.class)).b(q.k(e0.a(dc.a.class, Executor.class))).f(a.f11576a).d();
        n.d(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        pc.c d11 = pc.c.e(e0.a(dc.c.class, h0.class)).b(q.k(e0.a(dc.c.class, Executor.class))).f(b.f11577a).d();
        n.d(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        pc.c d12 = pc.c.e(e0.a(dc.b.class, h0.class)).b(q.k(e0.a(dc.b.class, Executor.class))).f(c.f11578a).d();
        n.d(d12, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        pc.c d13 = pc.c.e(e0.a(dc.d.class, h0.class)).b(q.k(e0.a(dc.d.class, Executor.class))).f(d.f11579a).d();
        n.d(d13, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        l10 = r.l(d10, d11, d12, d13);
        return l10;
    }
}
