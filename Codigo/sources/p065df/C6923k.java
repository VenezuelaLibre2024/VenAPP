package p065df;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import ck.C2037v;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p107ff.C7345f;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p485zb.C12867g;
import p485zb.C12876p;
import p494zk.C13071j;
import p494zk.C13080l0;
import p494zk.InterfaceC13076k0;

/* renamed from: df.k */
/* loaded from: classes2.dex */
public final class C6923k {

    /* renamed from: c */
    public static final b f15426c = new b(null);

    /* renamed from: a */
    private final C12867g f15427a;

    /* renamed from: b */
    private final C7345f f15428b;

    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.FirebaseSessions$1", m27743f = "FirebaseSessions.kt", m27744l = {44, 48}, m27745m = "invokeSuspend")
    /* renamed from: df.k$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f15429a;

        /* renamed from: c */
        final /* synthetic */ InterfaceC7587f f15431c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC7587f interfaceC7587f, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f15431c = interfaceC7587f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m20041f(String str, C12876p c12876p) {
            Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            C6920i0.f15423a.m20035a(null);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            return new a(this.f15431c, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
            return ((a) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = hk.C7750b.m23652c()
                int r1 = r5.f15429a
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                ck.C2030o.m10349b(r6)
                goto L6f
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                ck.C2030o.m10349b(r6)
                goto L2e
            L20:
                ck.C2030o.m10349b(r6)
                ef.a r6 = p084ef.C7184a.f16067a
                r5.f15429a = r4
                java.lang.Object r6 = r6.m21384c(r5)
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
                ef.b r1 = (p084ef.InterfaceC7185b) r1
                boolean r1 = r1.mo21389a()
                if (r1 == 0) goto L48
                r4 = 0
            L5b:
                if (r4 == 0) goto L60
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                goto L7d
            L60:
                df.k r6 = p065df.C6923k.this
                ff.f r6 = p065df.C6923k.m20039b(r6)
                r5.f15429a = r3
                java.lang.Object r6 = r6.m22058g(r5)
                if (r6 != r0) goto L6f
                return r0
            L6f:
                df.k r6 = p065df.C6923k.this
                ff.f r6 = p065df.C6923k.m20039b(r6)
                boolean r6 = r6.m22057d()
                if (r6 != 0) goto L81
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
            L7d:
                android.util.Log.d(r2, r6)
                goto L9e
            L81:
                df.f0 r6 = new df.f0
                gk.f r0 = r5.f15431c
                r6.<init>(r0)
                r6.m20026i()
                df.i0 r0 = p065df.C6920i0.f15423a
                r0.m20035a(r6)
                df.k r6 = p065df.C6923k.this
                zb.g r6 = p065df.C6923k.m20038a(r6)
                df.j r0 = new df.j
                r0.<init>()
                r6.m42627h(r0)
            L9e:
                ck.v r6 = ck.C2037v.f8089a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p065df.C6923k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: df.k$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    public C6923k(C12867g firebaseApp, C7345f settings, InterfaceC7587f backgroundDispatcher) {
        C9322n.m27781e(firebaseApp, "firebaseApp");
        C9322n.m27781e(settings, "settings");
        C9322n.m27781e(backgroundDispatcher, "backgroundDispatcher");
        this.f15427a = firebaseApp;
        this.f15428b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.m42630m().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(C6920i0.f15423a);
            C13071j.m43218d(C13080l0.m43227a(backgroundDispatcher), null, null, new a(backgroundDispatcher, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
