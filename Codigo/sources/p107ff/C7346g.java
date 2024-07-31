package p107ff;

import ck.C2030o;
import ck.C2037v;
import cl.C2041d;
import cl.InterfaceC2039b;
import com.facebook.ads.AdError;
import hk.C7752d;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p003a1.AbstractC0015d;
import p003a1.C0012a;
import p003a1.C0017f;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;
import p430x0.InterfaceC12255f;
import p494zk.C13067i;
import p494zk.InterfaceC13076k0;

/* renamed from: ff.g */
/* loaded from: classes2.dex */
public final class C7346g {

    /* renamed from: c */
    private static final b f16582c = new b(null);

    /* renamed from: d */
    @Deprecated
    private static final AbstractC0015d.a<Boolean> f16583d = C0017f.m58a("firebase_sessions_enabled");

    /* renamed from: e */
    @Deprecated
    private static final AbstractC0015d.a<Double> f16584e = C0017f.m59b("firebase_sessions_sampling_rate");

    /* renamed from: f */
    @Deprecated
    private static final AbstractC0015d.a<Integer> f16585f = C0017f.m61d("firebase_sessions_restart_timeout");

    /* renamed from: g */
    @Deprecated
    private static final AbstractC0015d.a<Integer> f16586g = C0017f.m61d("firebase_sessions_cache_duration");

    /* renamed from: h */
    @Deprecated
    private static final AbstractC0015d.a<Long> f16587h = C0017f.m62e("firebase_sessions_cache_updated_time");

    /* renamed from: a */
    private final InterfaceC12255f<AbstractC0015d> f16588a;

    /* renamed from: b */
    private C7344e f16589b;

    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.settings.SettingsCache$1", m27743f = "SettingsCache.kt", m27744l = {46}, m27745m = "invokeSuspend")
    /* renamed from: ff.g$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        Object f16590a;

        /* renamed from: b */
        int f16591b;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
            return ((a) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            C7346g c7346g;
            m23655c = C7752d.m23655c();
            int i10 = this.f16591b;
            if (i10 == 0) {
                C2030o.m10349b(obj);
                C7346g c7346g2 = C7346g.this;
                InterfaceC2039b data = c7346g2.f16588a.getData();
                this.f16590a = c7346g2;
                this.f16591b = 1;
                Object m10362f = C2041d.m10362f(data, this);
                if (m10362f == m23655c) {
                    return m23655c;
                }
                c7346g = c7346g2;
                obj = m10362f;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7346g = (C7346g) this.f16590a;
                C2030o.m10349b(obj);
            }
            c7346g.m22066l(((AbstractC0015d) obj).m52d());
            return C2037v.f8089a;
        }
    }

    /* renamed from: ff.g$b */
    /* loaded from: classes2.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.settings.SettingsCache", m27743f = "SettingsCache.kt", m27744l = {112}, m27745m = "updateConfigValue")
    /* renamed from: ff.g$c */
    /* loaded from: classes2.dex */
    public static final class c<T> extends AbstractC9298d {

        /* renamed from: a */
        /* synthetic */ Object f16593a;

        /* renamed from: c */
        int f16595c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f16593a = obj;
            this.f16595c |= Integer.MIN_VALUE;
            return C7346g.this.m22065h(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", m27743f = "SettingsCache.kt", m27744l = {}, m27745m = "invokeSuspend")
    /* renamed from: ff.g$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC9306l implements InterfaceC10002p<C0012a, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f16596a;

        /* renamed from: b */
        /* synthetic */ Object f16597b;

        /* renamed from: c */
        final /* synthetic */ T f16598c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0015d.a<T> f16599d;

        /* renamed from: e */
        final /* synthetic */ C7346g f16600e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T t10, AbstractC0015d.a<T> aVar, C7346g c7346g, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f16598c = t10;
            this.f16599d = aVar;
            this.f16600e = c7346g;
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0012a c0012a, Continuation<? super C2037v> continuation) {
            return ((d) create(c0012a, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f16598c, this.f16599d, this.f16600e, continuation);
            dVar.f16597b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            C7752d.m23655c();
            if (this.f16596a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2030o.m10349b(obj);
            C0012a c0012a = (C0012a) this.f16597b;
            T t10 = this.f16598c;
            if (t10 != 0) {
                c0012a.m44i(this.f16599d, t10);
            } else {
                c0012a.m43h(this.f16599d);
            }
            this.f16600e.m22066l(c0012a);
            return C2037v.f8089a;
        }
    }

    public C7346g(InterfaceC12255f<AbstractC0015d> dataStore) {
        C9322n.m27781e(dataStore, "dataStore");
        this.f16588a = dataStore;
        C13067i.m43212b(null, new a(null), 1, null);
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
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object m22065h(p003a1.AbstractC0015d.a<T> r6, T r7, p124gk.Continuation<? super ck.C2037v> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p107ff.C7346g.c
            if (r0 == 0) goto L13
            r0 = r8
            ff.g$c r0 = (p107ff.C7346g.c) r0
            int r1 = r0.f16595c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16595c = r1
            goto L18
        L13:
            ff.g$c r0 = new ff.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f16593a
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f16595c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ck.C2030o.m10349b(r8)     // Catch: java.io.IOException -> L29
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
            ck.C2030o.m10349b(r8)
            x0.f<a1.d> r8 = r5.f16588a     // Catch: java.io.IOException -> L29
            ff.g$d r2 = new ff.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f16595c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = p003a1.C0018g.m65a(r8, r2, r0)     // Catch: java.io.IOException -> L29
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
            ck.v r6 = ck.C2037v.f8089a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p107ff.C7346g.m22065h(a1.d$a, java.lang.Object, gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m22066l(AbstractC0015d abstractC0015d) {
        this.f16589b = new C7344e((Boolean) abstractC0015d.mo39b(f16583d), (Double) abstractC0015d.mo39b(f16584e), (Integer) abstractC0015d.mo39b(f16585f), (Integer) abstractC0015d.mo39b(f16586g), (Long) abstractC0015d.mo39b(f16587h));
    }

    /* renamed from: d */
    public final boolean m22067d() {
        C7344e c7344e = this.f16589b;
        C7344e c7344e2 = null;
        if (c7344e == null) {
            C9322n.m27792p("sessionConfigs");
            c7344e = null;
        }
        Long m22048b = c7344e.m22048b();
        C7344e c7344e3 = this.f16589b;
        if (c7344e3 == null) {
            C9322n.m27792p("sessionConfigs");
        } else {
            c7344e2 = c7344e3;
        }
        Integer m22047a = c7344e2.m22047a();
        return m22048b == null || m22047a == null || (System.currentTimeMillis() - m22048b.longValue()) / ((long) AdError.NETWORK_ERROR_CODE) >= ((long) m22047a.intValue());
    }

    /* renamed from: e */
    public final Integer m22068e() {
        C7344e c7344e = this.f16589b;
        if (c7344e == null) {
            C9322n.m27792p("sessionConfigs");
            c7344e = null;
        }
        return c7344e.m22050d();
    }

    /* renamed from: f */
    public final Double m22069f() {
        C7344e c7344e = this.f16589b;
        if (c7344e == null) {
            C9322n.m27792p("sessionConfigs");
            c7344e = null;
        }
        return c7344e.m22051e();
    }

    /* renamed from: g */
    public final Boolean m22070g() {
        C7344e c7344e = this.f16589b;
        if (c7344e == null) {
            C9322n.m27792p("sessionConfigs");
            c7344e = null;
        }
        return c7344e.m22049c();
    }

    /* renamed from: i */
    public final Object m22071i(Double d10, Continuation<? super C2037v> continuation) {
        Object m23655c;
        Object m22065h = m22065h(f16584e, d10, continuation);
        m23655c = C7752d.m23655c();
        return m22065h == m23655c ? m22065h : C2037v.f8089a;
    }

    /* renamed from: j */
    public final Object m22072j(Integer num, Continuation<? super C2037v> continuation) {
        Object m23655c;
        Object m22065h = m22065h(f16586g, num, continuation);
        m23655c = C7752d.m23655c();
        return m22065h == m23655c ? m22065h : C2037v.f8089a;
    }

    /* renamed from: k */
    public final Object m22073k(Long l10, Continuation<? super C2037v> continuation) {
        Object m23655c;
        Object m22065h = m22065h(f16587h, l10, continuation);
        m23655c = C7752d.m23655c();
        return m22065h == m23655c ? m22065h : C2037v.f8089a;
    }

    /* renamed from: m */
    public final Object m22074m(Integer num, Continuation<? super C2037v> continuation) {
        Object m23655c;
        Object m22065h = m22065h(f16585f, num, continuation);
        m23655c = C7752d.m23655c();
        return m22065h == m23655c ? m22065h : C2037v.f8089a;
    }

    /* renamed from: n */
    public final Object m22075n(Boolean bool, Continuation<? super C2037v> continuation) {
        Object m23655c;
        Object m22065h = m22065h(f16583d, bool, continuation);
        m23655c = C7752d.m23655c();
        return m22065h == m23655c ? m22065h : C2037v.f8089a;
    }
}
