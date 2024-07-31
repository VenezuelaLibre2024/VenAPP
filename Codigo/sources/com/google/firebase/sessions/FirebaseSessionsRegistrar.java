package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import dc.b;
import df.b0;
import df.c0;
import df.d0;
import df.g0;
import df.k;
import df.k0;
import df.w;
import df.x;
import dk.r;
import fe.f;
import java.util.List;
import kotlin.jvm.internal.n;
import pc.c;
import pc.d;
import pc.e0;
import pc.q;
import ye.h;
import zb.g;
import zk.h0;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final a Companion = new a(null);

    @Deprecated
    private static final e0<g> firebaseApp = e0.b(g.class);

    @Deprecated
    private static final e0<f> firebaseInstallationsApi = e0.b(f.class);

    @Deprecated
    private static final e0<h0> backgroundDispatcher = e0.a(dc.a.class, h0.class);

    @Deprecated
    private static final e0<h0> blockingDispatcher = e0.a(b.class, h0.class);

    @Deprecated
    private static final e0<f6.g> transportFactory = e0.b(f6.g.class);

    @Deprecated
    private static final e0<b0> sessionFirelogPublisher = e0.b(b0.class);

    @Deprecated
    private static final e0<d0> sessionGenerator = e0.b(d0.class);

    @Deprecated
    private static final e0<ff.f> sessionsSettings = e0.b(ff.f.class);

    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final k m10getComponents$lambda0(d dVar) {
        Object e10 = dVar.e(firebaseApp);
        n.d(e10, "container[firebaseApp]");
        Object e11 = dVar.e(sessionsSettings);
        n.d(e11, "container[sessionsSettings]");
        Object e12 = dVar.e(backgroundDispatcher);
        n.d(e12, "container[backgroundDispatcher]");
        return new k((g) e10, (ff.f) e11, (gk.f) e12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-1, reason: not valid java name */
    public static final d0 m11getComponents$lambda1(d dVar) {
        return new d0(k0.f14078a, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-2, reason: not valid java name */
    public static final b0 m12getComponents$lambda2(d dVar) {
        Object e10 = dVar.e(firebaseApp);
        n.d(e10, "container[firebaseApp]");
        g gVar = (g) e10;
        Object e11 = dVar.e(firebaseInstallationsApi);
        n.d(e11, "container[firebaseInstallationsApi]");
        f fVar = (f) e11;
        Object e12 = dVar.e(sessionsSettings);
        n.d(e12, "container[sessionsSettings]");
        ff.f fVar2 = (ff.f) e12;
        ee.b b10 = dVar.b(transportFactory);
        n.d(b10, "container.getProvider(transportFactory)");
        df.g gVar2 = new df.g(b10);
        Object e13 = dVar.e(backgroundDispatcher);
        n.d(e13, "container[backgroundDispatcher]");
        return new c0(gVar, fVar, fVar2, gVar2, (gk.f) e13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-3, reason: not valid java name */
    public static final ff.f m13getComponents$lambda3(d dVar) {
        Object e10 = dVar.e(firebaseApp);
        n.d(e10, "container[firebaseApp]");
        Object e11 = dVar.e(blockingDispatcher);
        n.d(e11, "container[blockingDispatcher]");
        Object e12 = dVar.e(backgroundDispatcher);
        n.d(e12, "container[backgroundDispatcher]");
        Object e13 = dVar.e(firebaseInstallationsApi);
        n.d(e13, "container[firebaseInstallationsApi]");
        return new ff.f((g) e10, (gk.f) e11, (gk.f) e12, (f) e13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-4, reason: not valid java name */
    public static final w m14getComponents$lambda4(d dVar) {
        Context m10 = ((g) dVar.e(firebaseApp)).m();
        n.d(m10, "container[firebaseApp].applicationContext");
        Object e10 = dVar.e(backgroundDispatcher);
        n.d(e10, "container[backgroundDispatcher]");
        return new x(m10, (gk.f) e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-5, reason: not valid java name */
    public static final g0 m15getComponents$lambda5(d dVar) {
        Object e10 = dVar.e(firebaseApp);
        n.d(e10, "container[firebaseApp]");
        return new df.h0((g) e10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<? extends Object>> getComponents() {
        List<c<? extends Object>> l10;
        c.b h10 = c.c(k.class).h(LIBRARY_NAME);
        e0<g> e0Var = firebaseApp;
        c.b b10 = h10.b(q.k(e0Var));
        e0<ff.f> e0Var2 = sessionsSettings;
        c.b b11 = b10.b(q.k(e0Var2));
        e0<h0> e0Var3 = backgroundDispatcher;
        c.b b12 = c.c(b0.class).h("session-publisher").b(q.k(e0Var));
        e0<f> e0Var4 = firebaseInstallationsApi;
        l10 = r.l(b11.b(q.k(e0Var3)).f(new pc.g() { // from class: df.m
            @Override // pc.g
            public final Object a(pc.d dVar) {
                k m10getComponents$lambda0;
                m10getComponents$lambda0 = FirebaseSessionsRegistrar.m10getComponents$lambda0(dVar);
                return m10getComponents$lambda0;
            }
        }).e().d(), c.c(d0.class).h("session-generator").f(new pc.g() { // from class: df.n
            @Override // pc.g
            public final Object a(pc.d dVar) {
                d0 m11getComponents$lambda1;
                m11getComponents$lambda1 = FirebaseSessionsRegistrar.m11getComponents$lambda1(dVar);
                return m11getComponents$lambda1;
            }
        }).d(), b12.b(q.k(e0Var4)).b(q.k(e0Var2)).b(q.m(transportFactory)).b(q.k(e0Var3)).f(new pc.g() { // from class: df.o
            @Override // pc.g
            public final Object a(pc.d dVar) {
                b0 m12getComponents$lambda2;
                m12getComponents$lambda2 = FirebaseSessionsRegistrar.m12getComponents$lambda2(dVar);
                return m12getComponents$lambda2;
            }
        }).d(), c.c(ff.f.class).h("sessions-settings").b(q.k(e0Var)).b(q.k(blockingDispatcher)).b(q.k(e0Var3)).b(q.k(e0Var4)).f(new pc.g() { // from class: df.p
            @Override // pc.g
            public final Object a(pc.d dVar) {
                ff.f m13getComponents$lambda3;
                m13getComponents$lambda3 = FirebaseSessionsRegistrar.m13getComponents$lambda3(dVar);
                return m13getComponents$lambda3;
            }
        }).d(), c.c(w.class).h("sessions-datastore").b(q.k(e0Var)).b(q.k(e0Var3)).f(new pc.g() { // from class: df.q
            @Override // pc.g
            public final Object a(pc.d dVar) {
                w m14getComponents$lambda4;
                m14getComponents$lambda4 = FirebaseSessionsRegistrar.m14getComponents$lambda4(dVar);
                return m14getComponents$lambda4;
            }
        }).d(), c.c(g0.class).h("sessions-service-binder").b(q.k(e0Var)).f(new pc.g() { // from class: df.r
            @Override // pc.g
            public final Object a(pc.d dVar) {
                g0 m15getComponents$lambda5;
                m15getComponents$lambda5 = FirebaseSessionsRegistrar.m15getComponents$lambda5(dVar);
                return m15getComponents$lambda5;
            }
        }).d(), h.b(LIBRARY_NAME, "1.2.0"));
        return l10;
    }
}
