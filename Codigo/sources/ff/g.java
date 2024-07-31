package ff;

import a1.d;
import ck.o;
import ck.v;
import com.facebook.ads.AdError;
import gk.Continuation;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import ok.p;
import zk.i;
import zk.k0;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final b f15159c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final d.a<Boolean> f15160d = a1.f.a("firebase_sessions_enabled");

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    private static final d.a<Double> f15161e = a1.f.b("firebase_sessions_sampling_rate");

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    private static final d.a<Integer> f15162f = a1.f.d("firebase_sessions_restart_timeout");

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    private static final d.a<Integer> f15163g = a1.f.d("firebase_sessions_cache_duration");

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    private static final d.a<Long> f15164h = a1.f.e("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    private final x0.f<a1.d> f15165a;

    /* renamed from: b, reason: collision with root package name */
    private e f15166b;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends l implements p<k0, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f15167a;

        /* renamed from: b, reason: collision with root package name */
        int f15168b;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // ok.p
        public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            g gVar;
            c10 = hk.d.c();
            int i10 = this.f15168b;
            if (i10 == 0) {
                o.b(obj);
                g gVar2 = g.this;
                cl.b data = gVar2.f15165a.getData();
                this.f15167a = gVar2;
                this.f15168b = 1;
                Object f10 = cl.d.f(data, this);
                if (f10 == c10) {
                    return c10;
                }
                gVar = gVar2;
                obj = f10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (g) this.f15167a;
                o.b(obj);
            }
            gVar.l(((a1.d) obj).d());
            return v.f7137a;
        }
    }

    /* loaded from: classes2.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {112}, m = "updateConfigValue")
    /* loaded from: classes2.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f15170a;

        /* renamed from: c, reason: collision with root package name */
        int f15172c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15170a = obj;
            this.f15172c |= Integer.MIN_VALUE;
            return g.this.h(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<a1.a, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f15173a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15174b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f15175c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d.a<T> f15176d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f15177e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T t10, d.a<T> aVar, g gVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f15175c = t10;
            this.f15176d = aVar;
            this.f15177e = gVar;
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a1.a aVar, Continuation<? super v> continuation) {
            return ((d) create(aVar, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f15175c, this.f15176d, this.f15177e, continuation);
            dVar.f15174b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            hk.d.c();
            if (this.f15173a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            a1.a aVar = (a1.a) this.f15174b;
            T t10 = this.f15175c;
            if (t10 != 0) {
                aVar.i(this.f15176d, t10);
            } else {
                aVar.h(this.f15176d);
            }
            this.f15177e.l(aVar);
            return v.f7137a;
        }
    }

    public g(x0.f<a1.d> dataStore) {
        n.e(dataStore, "dataStore");
        this.f15165a = dataStore;
        i.b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object h(a1.d.a<T> r6, T r7, gk.Continuation<? super ck.v> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ff.g.c
            if (r0 == 0) goto L13
            r0 = r8
            ff.g$c r0 = (ff.g.c) r0
            int r1 = r0.f15172c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15172c = r1
            goto L18
        L13:
            ff.g$c r0 = new ff.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15170a
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f15172c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ck.o.b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            ck.o.b(r8)
            x0.f<a1.d> r8 = r5.f15165a     // Catch: java.io.IOException -> L29
            ff.g$d r2 = new ff.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f15172c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = a1.g.a(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            ck.v r6 = ck.v.f7137a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.g.h(a1.d$a, java.lang.Object, gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(a1.d dVar) {
        this.f15166b = new e((Boolean) dVar.b(f15160d), (Double) dVar.b(f15161e), (Integer) dVar.b(f15162f), (Integer) dVar.b(f15163g), (Long) dVar.b(f15164h));
    }

    public final boolean d() {
        e eVar = this.f15166b;
        e eVar2 = null;
        if (eVar == null) {
            n.p("sessionConfigs");
            eVar = null;
        }
        Long b10 = eVar.b();
        e eVar3 = this.f15166b;
        if (eVar3 == null) {
            n.p("sessionConfigs");
        } else {
            eVar2 = eVar3;
        }
        Integer a10 = eVar2.a();
        return b10 == null || a10 == null || (System.currentTimeMillis() - b10.longValue()) / ((long) AdError.NETWORK_ERROR_CODE) >= ((long) a10.intValue());
    }

    public final Integer e() {
        e eVar = this.f15166b;
        if (eVar == null) {
            n.p("sessionConfigs");
            eVar = null;
        }
        return eVar.d();
    }

    public final Double f() {
        e eVar = this.f15166b;
        if (eVar == null) {
            n.p("sessionConfigs");
            eVar = null;
        }
        return eVar.e();
    }

    public final Boolean g() {
        e eVar = this.f15166b;
        if (eVar == null) {
            n.p("sessionConfigs");
            eVar = null;
        }
        return eVar.c();
    }

    public final Object i(Double d10, Continuation<? super v> continuation) {
        Object c10;
        Object h10 = h(f15161e, d10, continuation);
        c10 = hk.d.c();
        return h10 == c10 ? h10 : v.f7137a;
    }

    public final Object j(Integer num, Continuation<? super v> continuation) {
        Object c10;
        Object h10 = h(f15163g, num, continuation);
        c10 = hk.d.c();
        return h10 == c10 ? h10 : v.f7137a;
    }

    public final Object k(Long l10, Continuation<? super v> continuation) {
        Object c10;
        Object h10 = h(f15164h, l10, continuation);
        c10 = hk.d.c();
        return h10 == c10 ? h10 : v.f7137a;
    }

    public final Object m(Integer num, Continuation<? super v> continuation) {
        Object c10;
        Object h10 = h(f15162f, num, continuation);
        c10 = hk.d.c();
        return h10 == c10 ? h10 : v.f7137a;
    }

    public final Object n(Boolean bool, Continuation<? super v> continuation) {
        Object c10;
        Object h10 = h(f15160d, bool, continuation);
        c10 = hk.d.c();
        return h10 == c10 ? h10 : v.f7137a;
    }
}
