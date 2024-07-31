package p107ff;

import android.content.Context;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9328t;
import kotlin.jvm.internal.C9333y;
import p003a1.AbstractC0015d;
import p065df.C6905b;
import p065df.C6935v;
import p106fe.InterfaceC7337f;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p340rk.InterfaceC10723a;
import p405vk.InterfaceC11971h;
import p430x0.InterfaceC12255f;
import p472yk.C12728a;
import p472yk.C12730c;
import p472yk.EnumC12731d;
import p475z0.C12754a;
import p485zb.C12863c;
import p485zb.C12874n;

/* renamed from: ff.f */
/* loaded from: classes2.dex */
public final class C7345f {

    /* renamed from: c */
    public static final a f16573c = new a(null);

    /* renamed from: d */
    private static final InterfaceC10723a<Context, InterfaceC12255f<AbstractC0015d>> f16574d = C12754a.m42297b(C6935v.f15439a.m20054b(), null, null, null, 14, null);

    /* renamed from: a */
    private final InterfaceC7347h f16575a;

    /* renamed from: b */
    private final InterfaceC7347h f16576b;

    /* renamed from: ff.f$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ InterfaceC11971h<Object>[] f16577a = {C9333y.m27800e(new C9328t(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final InterfaceC12255f<AbstractC0015d> m22060b(Context context) {
            return (InterfaceC12255f) C7345f.f16574d.mo32609a(context, f16577a[0]);
        }

        /* renamed from: c */
        public final C7345f m22061c() {
            Object m42629k = C12874n.m42641a(C12863c.f35064a).m42629k(C7345f.class);
            C9322n.m27780d(m42629k, "Firebase.app[SessionsSettings::class.java]");
            return (C7345f) m42629k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.settings.SessionsSettings", m27743f = "SessionsSettings.kt", m27744l = {134, 135}, m27745m = "updateSettings")
    /* renamed from: ff.f$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC9298d {

        /* renamed from: a */
        Object f16578a;

        /* renamed from: b */
        /* synthetic */ Object f16579b;

        /* renamed from: d */
        int f16581d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f16579b = obj;
            this.f16581d |= Integer.MIN_VALUE;
            return C7345f.this.m22058g(this);
        }
    }

    private C7345f(Context context, InterfaceC7587f interfaceC7587f, InterfaceC7587f interfaceC7587f2, InterfaceC7337f interfaceC7337f, C6905b c6905b) {
        this(new C7341b(context), new C7342c(interfaceC7587f2, interfaceC7337f, c6905b, new C7343d(c6905b, interfaceC7587f, null, 4, null), f16573c.m22060b(context)));
    }

    public C7345f(InterfaceC7347h localOverrideSettings, InterfaceC7347h remoteSettings) {
        C9322n.m27781e(localOverrideSettings, "localOverrideSettings");
        C9322n.m27781e(remoteSettings, "remoteSettings");
        this.f16575a = localOverrideSettings;
        this.f16576b = remoteSettings;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7345f(p485zb.C12867g r8, p124gk.InterfaceC7587f r9, p124gk.InterfaceC7587f r10, p106fe.InterfaceC7337f r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.C9322n.m27781e(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.C9322n.m27781e(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.C9322n.m27781e(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.C9322n.m27781e(r11, r0)
            android.content.Context r2 = r8.m42630m()
            java.lang.String r0 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.C9322n.m27780d(r2, r0)
            df.a0 r0 = p065df.C6904a0.f15317a
            df.b r6 = r0.m19971b(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p107ff.C7345f.<init>(zb.g, gk.f, gk.f, fe.f):void");
    }

    /* renamed from: e */
    private final boolean m22053e(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    /* renamed from: f */
    private final boolean m22054f(long j10) {
        return C12728a.m42010G(j10) && C12728a.m42005B(j10);
    }

    /* renamed from: b */
    public final double m22055b() {
        Double mo22039c = this.f16575a.mo22039c();
        if (mo22039c != null) {
            double doubleValue = mo22039c.doubleValue();
            if (m22053e(doubleValue)) {
                return doubleValue;
            }
        }
        Double mo22039c2 = this.f16576b.mo22039c();
        if (mo22039c2 == null) {
            return 1.0d;
        }
        double doubleValue2 = mo22039c2.doubleValue();
        if (m22053e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    /* renamed from: c */
    public final long m22056c() {
        C12728a mo22038b = this.f16575a.mo22038b();
        if (mo22038b != null) {
            long m42031K = mo22038b.m42031K();
            if (m22054f(m42031K)) {
                return m42031K;
            }
        }
        C12728a mo22038b2 = this.f16576b.mo22038b();
        if (mo22038b2 != null) {
            long m42031K2 = mo22038b2.m42031K();
            if (m22054f(m42031K2)) {
                return m42031K2;
            }
        }
        C12728a.a aVar = C12728a.f34547b;
        return C12730c.m42041h(30, EnumC12731d.MINUTES);
    }

    /* renamed from: d */
    public final boolean m22057d() {
        Boolean mo22037a = this.f16575a.mo22037a();
        if (mo22037a != null) {
            return mo22037a.booleanValue();
        }
        Boolean mo22037a2 = this.f16576b.mo22037a();
        if (mo22037a2 != null) {
            return mo22037a2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22058g(p124gk.Continuation<? super ck.C2037v> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p107ff.C7345f.b
            if (r0 == 0) goto L13
            r0 = r6
            ff.f$b r0 = (p107ff.C7345f.b) r0
            int r1 = r0.f16581d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16581d = r1
            goto L18
        L13:
            ff.f$b r0 = new ff.f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16579b
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f16581d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ck.C2030o.m10349b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f16578a
            ff.f r2 = (p107ff.C7345f) r2
            ck.C2030o.m10349b(r6)
            goto L4d
        L3c:
            ck.C2030o.m10349b(r6)
            ff.h r6 = r5.f16575a
            r0.f16578a = r5
            r0.f16581d = r4
            java.lang.Object r6 = r6.mo22040d(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            ff.h r6 = r2.f16576b
            r2 = 0
            r0.f16578a = r2
            r0.f16581d = r3
            java.lang.Object r6 = r6.mo22040d(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            ck.v r6 = ck.C2037v.f8089a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p107ff.C7345f.m22058g(gk.Continuation):java.lang.Object");
    }
}
