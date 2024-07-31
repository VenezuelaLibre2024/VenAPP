package df;

import android.util.Log;
import gk.Continuation;
import zk.l0;

/* loaded from: classes2.dex */
public final class c0 implements b0 {

    /* renamed from: g, reason: collision with root package name */
    public static final a f14008g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final double f14009h = Math.random();

    /* renamed from: b, reason: collision with root package name */
    private final zb.g f14010b;

    /* renamed from: c, reason: collision with root package name */
    private final fe.f f14011c;

    /* renamed from: d, reason: collision with root package name */
    private final ff.f f14012d;

    /* renamed from: e, reason: collision with root package name */
    private final h f14013e;

    /* renamed from: f, reason: collision with root package name */
    private final gk.f f14014f;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {113}, m = "getFirebaseInstallationId")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f14015a;

        /* renamed from: c, reason: collision with root package name */
        int f14017c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14015a = obj;
            this.f14017c |= Integer.MIN_VALUE;
            return c0.this.h(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {64, 72, 73}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements ok.p<zk.k0, Continuation<? super ck.v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f14018a;

        /* renamed from: b, reason: collision with root package name */
        Object f14019b;

        /* renamed from: c, reason: collision with root package name */
        Object f14020c;

        /* renamed from: d, reason: collision with root package name */
        Object f14021d;

        /* renamed from: e, reason: collision with root package name */
        Object f14022e;

        /* renamed from: f, reason: collision with root package name */
        Object f14023f;

        /* renamed from: r, reason: collision with root package name */
        Object f14024r;

        /* renamed from: s, reason: collision with root package name */
        Object f14025s;

        /* renamed from: t, reason: collision with root package name */
        int f14026t;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ y f14028v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y yVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f14028v = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<ck.v> create(Object obj, Continuation<?> continuation) {
            return new c(this.f14028v, continuation);
        }

        @Override // ok.p
        public final Object invoke(zk.k0 k0Var, Continuation<? super ck.v> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(ck.v.f7137a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00f8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00f9  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 277
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: df.c0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {95}, m = "shouldLogSession")
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f14029a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14030b;

        /* renamed from: d, reason: collision with root package name */
        int f14032d;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14030b = obj;
            this.f14032d |= Integer.MIN_VALUE;
            return c0.this.j(this);
        }
    }

    public c0(zb.g firebaseApp, fe.f firebaseInstallations, ff.f sessionSettings, h eventGDTLogger, gk.f backgroundDispatcher) {
        kotlin.jvm.internal.n.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.n.e(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.n.e(sessionSettings, "sessionSettings");
        kotlin.jvm.internal.n.e(eventGDTLogger, "eventGDTLogger");
        kotlin.jvm.internal.n.e(backgroundDispatcher, "backgroundDispatcher");
        this.f14010b = firebaseApp;
        this.f14011c = firebaseInstallations;
        this.f14012d = sessionSettings;
        this.f14013e = eventGDTLogger;
        this.f14014f = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(z zVar) {
        try {
            this.f14013e.a(zVar);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + zVar.c().e());
        } catch (RuntimeException e10) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(gk.Continuation<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof df.c0.b
            if (r0 == 0) goto L13
            r0 = r5
            df.c0$b r0 = (df.c0.b) r0
            int r1 = r0.f14017c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14017c = r1
            goto L18
        L13:
            df.c0$b r0 = new df.c0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14015a
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f14017c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ck.o.b(r5)     // Catch: java.lang.Exception -> L29
            goto L4a
        L29:
            r5 = move-exception
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ck.o.b(r5)
            fe.f r5 = r4.f14011c     // Catch: java.lang.Exception -> L29
            com.google.android.gms.tasks.Task r5 = r5.getId()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "firebaseInstallations.id"
            kotlin.jvm.internal.n.d(r5, r2)     // Catch: java.lang.Exception -> L29
            r0.f14017c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = jl.b.a(r5, r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L29
            goto L56
        L4d:
            java.lang.String r0 = "SessionFirelogPublisher"
            java.lang.String r1 = "Error getting Firebase Installation ID. Using an empty ID"
            android.util.Log.e(r0, r1, r5)
            java.lang.String r5 = ""
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: df.c0.h(gk.Continuation):java.lang.Object");
    }

    private final boolean i() {
        return f14009h <= this.f14012d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(gk.Continuation<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof df.c0.d
            if (r0 == 0) goto L13
            r0 = r6
            df.c0$d r0 = (df.c0.d) r0
            int r1 = r0.f14032d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14032d = r1
            goto L18
        L13:
            df.c0$d r0 = new df.c0$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14030b
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f14032d
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f14029a
            df.c0 r0 = (df.c0) r0
            ck.o.b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            ck.o.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            ff.f r6 = r5.f14012d
            r0.f14029a = r5
            r0.f14032d = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            ff.f r6 = r0.f14012d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
        L58:
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L60:
            boolean r6 = r0.i()
            if (r6 != 0) goto L69
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            goto L58
        L69:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: df.c0.j(gk.Continuation):java.lang.Object");
    }

    @Override // df.b0
    public void a(y sessionDetails) {
        kotlin.jvm.internal.n.e(sessionDetails, "sessionDetails");
        zk.j.d(l0.a(this.f14014f), null, null, new c(sessionDetails, null), 3, null);
    }
}
