package df;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import gk.Continuation;
import zk.l0;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final b f14072c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final zb.g f14073a;

    /* renamed from: b, reason: collision with root package name */
    private final ff.f f14074b;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {44, 48}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements ok.p<zk.k0, Continuation<? super ck.v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14075a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ gk.f f14077c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(gk.f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14077c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(String str, zb.p pVar) {
            Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            i0.f14069a.a(null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<ck.v> create(Object obj, Continuation<?> continuation) {
            return new a(this.f14077c, continuation);
        }

        @Override // ok.p
        public final Object invoke(zk.k0 k0Var, Continuation<? super ck.v> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(ck.v.f7137a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = hk.b.c()
                int r1 = r5.f14075a
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                ck.o.b(r6)
                goto L6f
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                ck.o.b(r6)
                goto L2e
            L20:
                ck.o.b(r6)
                ef.a r6 = ef.a.f14644a
                r5.f14075a = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L5b
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L5b
                java.lang.Object r1 = r6.next()
                ef.b r1 = (ef.b) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L48
                r4 = 0
            L5b:
                if (r4 == 0) goto L60
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                goto L7d
            L60:
                df.k r6 = df.k.this
                ff.f r6 = df.k.b(r6)
                r5.f14075a = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L6f
                return r0
            L6f:
                df.k r6 = df.k.this
                ff.f r6 = df.k.b(r6)
                boolean r6 = r6.d()
                if (r6 != 0) goto L81
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
            L7d:
                android.util.Log.d(r2, r6)
                goto L9e
            L81:
                df.f0 r6 = new df.f0
                gk.f r0 = r5.f14077c
                r6.<init>(r0)
                r6.i()
                df.i0 r0 = df.i0.f14069a
                r0.a(r6)
                df.k r6 = df.k.this
                zb.g r6 = df.k.a(r6)
                df.j r0 = new df.j
                r0.<init>()
                r6.h(r0)
            L9e:
                ck.v r6 = ck.v.f7137a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: df.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public k(zb.g firebaseApp, ff.f settings, gk.f backgroundDispatcher) {
        kotlin.jvm.internal.n.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.n.e(settings, "settings");
        kotlin.jvm.internal.n.e(backgroundDispatcher, "backgroundDispatcher");
        this.f14073a = firebaseApp;
        this.f14074b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.m().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(i0.f14069a);
            zk.j.d(l0.a(backgroundDispatcher), null, null, new a(backgroundDispatcher, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
