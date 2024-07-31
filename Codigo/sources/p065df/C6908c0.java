package p065df;

import android.util.Log;
import ck.C2037v;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p106fe.InterfaceC7337f;
import p107ff.C7345f;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p485zb.C12867g;
import p494zk.C13071j;
import p494zk.C13080l0;
import p494zk.InterfaceC13076k0;

/* renamed from: df.c0 */
/* loaded from: classes2.dex */
public final class C6908c0 implements InterfaceC6906b0 {

    /* renamed from: g */
    public static final a f15362g = new a(null);

    /* renamed from: h */
    private static final double f15363h = Math.random();

    /* renamed from: b */
    private final C12867g f15364b;

    /* renamed from: c */
    private final InterfaceC7337f f15365c;

    /* renamed from: d */
    private final C7345f f15366d;

    /* renamed from: e */
    private final InterfaceC6917h f15367e;

    /* renamed from: f */
    private final InterfaceC7587f f15368f;

    /* renamed from: df.c0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m27743f = "SessionFirelogPublisher.kt", m27744l = {113}, m27745m = "getFirebaseInstallationId")
    /* renamed from: df.c0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC9298d {

        /* renamed from: a */
        /* synthetic */ Object f15369a;

        /* renamed from: c */
        int f15371c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f15369a = obj;
            this.f15371c |= Integer.MIN_VALUE;
            return C6908c0.this.m19993h(this);
        }
    }

    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", m27743f = "SessionFirelogPublisher.kt", m27744l = {64, 72, 73}, m27745m = "invokeSuspend")
    /* renamed from: df.c0$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        Object f15372a;

        /* renamed from: b */
        Object f15373b;

        /* renamed from: c */
        Object f15374c;

        /* renamed from: d */
        Object f15375d;

        /* renamed from: e */
        Object f15376e;

        /* renamed from: f */
        Object f15377f;

        /* renamed from: r */
        Object f15378r;

        /* renamed from: s */
        Object f15379s;

        /* renamed from: t */
        int f15380t;

        /* renamed from: v */
        final /* synthetic */ C6938y f15382v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C6938y c6938y, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f15382v = c6938y;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            return new c(this.f15382v, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
            return ((c) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00f8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00f9  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 277
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p065df.C6908c0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m27743f = "SessionFirelogPublisher.kt", m27744l = {95}, m27745m = "shouldLogSession")
    /* renamed from: df.c0$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC9298d {

        /* renamed from: a */
        Object f15383a;

        /* renamed from: b */
        /* synthetic */ Object f15384b;

        /* renamed from: d */
        int f15386d;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f15384b = obj;
            this.f15386d |= Integer.MIN_VALUE;
            return C6908c0.this.m19995j(this);
        }
    }

    public C6908c0(C12867g firebaseApp, InterfaceC7337f firebaseInstallations, C7345f sessionSettings, InterfaceC6917h eventGDTLogger, InterfaceC7587f backgroundDispatcher) {
        C9322n.m27781e(firebaseApp, "firebaseApp");
        C9322n.m27781e(firebaseInstallations, "firebaseInstallations");
        C9322n.m27781e(sessionSettings, "sessionSettings");
        C9322n.m27781e(eventGDTLogger, "eventGDTLogger");
        C9322n.m27781e(backgroundDispatcher, "backgroundDispatcher");
        this.f15364b = firebaseApp;
        this.f15365c = firebaseInstallations;
        this.f15366d = sessionSettings;
        this.f15367e = eventGDTLogger;
        this.f15368f = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m19992g(C6939z c6939z) {
        try {
            this.f15367e.mo20031a(c6939z);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + c6939z.m20077c().m20010e());
        } catch (RuntimeException e10) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m19993h(p124gk.Continuation<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p065df.C6908c0.b
            if (r0 == 0) goto L13
            r0 = r5
            df.c0$b r0 = (p065df.C6908c0.b) r0
            int r1 = r0.f15371c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15371c = r1
            goto L18
        L13:
            df.c0$b r0 = new df.c0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f15369a
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f15371c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ck.C2030o.m10349b(r5)     // Catch: java.lang.Exception -> L29
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
            ck.C2030o.m10349b(r5)
            fe.f r5 = r4.f15365c     // Catch: java.lang.Exception -> L29
            com.google.android.gms.tasks.Task r5 = r5.getId()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "firebaseInstallations.id"
            kotlin.jvm.internal.C9322n.m27780d(r5, r2)     // Catch: java.lang.Exception -> L29
            r0.f15371c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = p188jl.C9084b.m26691a(r5, r0)     // Catch: java.lang.Exception -> L29
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
        throw new UnsupportedOperationException("Method not decompiled: p065df.C6908c0.m19993h(gk.Continuation):java.lang.Object");
    }

    /* renamed from: i */
    private final boolean m19994i() {
        return f15363h <= this.f15366d.m22055b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m19995j(p124gk.Continuation<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p065df.C6908c0.d
            if (r0 == 0) goto L13
            r0 = r6
            df.c0$d r0 = (p065df.C6908c0.d) r0
            int r1 = r0.f15386d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15386d = r1
            goto L18
        L13:
            df.c0$d r0 = new df.c0$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15384b
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f15386d
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f15383a
            df.c0 r0 = (p065df.C6908c0) r0
            ck.C2030o.m10349b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            ck.C2030o.m10349b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            ff.f r6 = r5.f15366d
            r0.f15383a = r5
            r0.f15386d = r4
            java.lang.Object r6 = r6.m22058g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            ff.f r6 = r0.f15366d
            boolean r6 = r6.m22057d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
        L58:
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C9296b.m27739a(r1)
            return r6
        L60:
            boolean r6 = r0.m19994i()
            if (r6 != 0) goto L69
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            goto L58
        L69:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C9296b.m27739a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p065df.C6908c0.m19995j(gk.Continuation):java.lang.Object");
    }

    @Override // p065df.InterfaceC6906b0
    /* renamed from: a */
    public void mo19979a(C6938y sessionDetails) {
        C9322n.m27781e(sessionDetails, "sessionDetails");
        C13071j.m43218d(C13080l0.m43227a(this.f15368f), null, null, new c(sessionDetails, null), 3, null);
    }
}
