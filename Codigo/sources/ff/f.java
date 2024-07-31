package ff;

import android.content.Context;
import df.v;
import gk.Continuation;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.y;
import yk.a;
import zb.n;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c */
    public static final a f15150c = new a(null);

    /* renamed from: d */
    private static final rk.a<Context, x0.f<a1.d>> f15151d = z0.a.b(v.f14085a.b(), null, null, null, 14, null);

    /* renamed from: a */
    private final h f15152a;

    /* renamed from: b */
    private final h f15153b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ vk.h<Object>[] f15154a = {y.e(new t(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final x0.f<a1.d> b(Context context) {
            return (x0.f) f.f15151d.a(context, f15154a[0]);
        }

        public final f c() {
            Object k10 = n.a(zb.c.f32513a).k(f.class);
            kotlin.jvm.internal.n.d(k10, "Firebase.app[SessionsSettings::class.java]");
            return (f) k10;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {134, 135}, m = "updateSettings")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f15155a;

        /* renamed from: b */
        /* synthetic */ Object f15156b;

        /* renamed from: d */
        int f15158d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15156b = obj;
            this.f15158d |= Integer.MIN_VALUE;
            return f.this.g(this);
        }
    }

    private f(Context context, gk.f fVar, gk.f fVar2, fe.f fVar3, df.b bVar) {
        this(new ff.b(context), new c(fVar2, fVar3, bVar, new d(bVar, fVar, null, 4, null), f15150c.b(context)));
    }

    public f(h localOverrideSettings, h remoteSettings) {
        kotlin.jvm.internal.n.e(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.n.e(remoteSettings, "remoteSettings");
        this.f15152a = localOverrideSettings;
        this.f15153b = remoteSettings;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(zb.g r8, gk.f r9, gk.f r10, fe.f r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.n.e(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.n.e(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.n.e(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.n.e(r11, r0)
            android.content.Context r2 = r8.m()
            java.lang.String r0 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.n.d(r2, r0)
            df.a0 r0 = df.a0.f13963a
            df.b r6 = r0.b(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.f.<init>(zb.g, gk.f, gk.f, fe.f):void");
    }

    private final boolean e(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private final boolean f(long j10) {
        return yk.a.G(j10) && yk.a.B(j10);
    }

    public final double b() {
        Double c10 = this.f15152a.c();
        if (c10 != null) {
            double doubleValue = c10.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double c11 = this.f15153b.c();
        if (c11 == null) {
            return 1.0d;
        }
        double doubleValue2 = c11.doubleValue();
        if (e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        yk.a b10 = this.f15152a.b();
        if (b10 != null) {
            long K = b10.K();
            if (f(K)) {
                return K;
            }
        }
        yk.a b11 = this.f15153b.b();
        if (b11 != null) {
            long K2 = b11.K();
            if (f(K2)) {
                return K2;
            }
        }
        a.C0535a c0535a = yk.a.f32011b;
        return yk.c.h(30, yk.d.MINUTES);
    }

    public final boolean d() {
        Boolean a10 = this.f15152a.a();
        if (a10 != null) {
            return a10.booleanValue();
        }
        Boolean a11 = this.f15153b.a();
        if (a11 != null) {
            return a11.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(gk.Continuation<? super ck.v> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ff.f.b
            if (r0 == 0) goto L13
            r0 = r6
            ff.f$b r0 = (ff.f.b) r0
            int r1 = r0.f15158d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15158d = r1
            goto L18
        L13:
            ff.f$b r0 = new ff.f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15156b
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f15158d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ck.o.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f15155a
            ff.f r2 = (ff.f) r2
            ck.o.b(r6)
            goto L4d
        L3c:
            ck.o.b(r6)
            ff.h r6 = r5.f15152a
            r0.f15155a = r5
            r0.f15158d = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            ff.h r6 = r2.f15153b
            r2 = 0
            r0.f15155a = r2
            r0.f15158d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            ck.v r6 = ck.v.f7137a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.f.g(gk.Continuation):java.lang.Object");
    }
}
