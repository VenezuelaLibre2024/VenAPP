package df;

import a1.d;
import android.content.Context;
import android.util.Log;
import gk.Continuation;
import java.util.concurrent.atomic.AtomicReference;
import zk.l0;

/* loaded from: classes2.dex */
public final class x implements w {

    /* renamed from: f, reason: collision with root package name */
    private static final b f14091f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    private static final rk.a<Context, x0.f<a1.d>> f14092g = z0.a.b(v.f14085a.a(), null, null, null, 14, null);

    /* renamed from: b, reason: collision with root package name */
    private final Context f14093b;

    /* renamed from: c, reason: collision with root package name */
    private final gk.f f14094c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<l> f14095d;

    /* renamed from: e, reason: collision with root package name */
    private final cl.b<l> f14096e;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements ok.p<zk.k0, Continuation<? super ck.v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14097a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: df.x$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0211a<T> implements cl.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f14099a;

            C0211a(x xVar) {
                this.f14099a = xVar;
            }

            @Override // cl.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(l lVar, Continuation<? super ck.v> continuation) {
                this.f14099a.f14095d.set(lVar);
                return ck.v.f7137a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<ck.v> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // ok.p
        public final Object invoke(zk.k0 k0Var, Continuation<? super ck.v> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(ck.v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = hk.d.c();
            int i10 = this.f14097a;
            if (i10 == 0) {
                ck.o.b(obj);
                cl.b bVar = x.this.f14096e;
                C0211a c0211a = new C0211a(x.this);
                this.f14097a = 1;
                if (bVar.a(c0211a, this) == c10) {
                    return c10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ck.o.b(obj);
            }
            return ck.v.f7137a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ vk.h<Object>[] f14100a = {kotlin.jvm.internal.y.e(new kotlin.jvm.internal.t(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final x0.f<a1.d> b(Context context) {
            return (x0.f) x.f14092g.a(context, f14100a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14101a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final d.a<String> f14102b = a1.f.f("session_id");

        private c() {
        }

        public final d.a<String> a() {
            return f14102b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements ok.q<cl.c<? super a1.d>, Throwable, Continuation<? super ck.v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14103a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14104b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14105c;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // ok.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object m(cl.c<? super a1.d> cVar, Throwable th2, Continuation<? super ck.v> continuation) {
            d dVar = new d(continuation);
            dVar.f14104b = cVar;
            dVar.f14105c = th2;
            return dVar.invokeSuspend(ck.v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = hk.d.c();
            int i10 = this.f14103a;
            if (i10 == 0) {
                ck.o.b(obj);
                cl.c cVar = (cl.c) this.f14104b;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f14105c);
                a1.d a10 = a1.e.a();
                this.f14104b = null;
                this.f14103a = 1;
                if (cVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ck.o.b(obj);
            }
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements cl.b<l> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ cl.b f14106a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f14107b;

        /* loaded from: classes2.dex */
        public static final class a<T> implements cl.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ cl.c f14108a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f14109b;

            @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {224}, m = "emit")
            /* renamed from: df.x$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0212a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f14110a;

                /* renamed from: b, reason: collision with root package name */
                int f14111b;

                public C0212a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f14110a = obj;
                    this.f14111b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(cl.c cVar, x xVar) {
                this.f14108a = cVar;
                this.f14109b = xVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // cl.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, gk.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof df.x.e.a.C0212a
                    if (r0 == 0) goto L13
                    r0 = r6
                    df.x$e$a$a r0 = (df.x.e.a.C0212a) r0
                    int r1 = r0.f14111b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f14111b = r1
                    goto L18
                L13:
                    df.x$e$a$a r0 = new df.x$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f14110a
                    java.lang.Object r1 = hk.b.c()
                    int r2 = r0.f14111b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ck.o.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    ck.o.b(r6)
                    cl.c r6 = r4.f14108a
                    a1.d r5 = (a1.d) r5
                    df.x r2 = r4.f14109b
                    df.l r5 = df.x.h(r2, r5)
                    r0.f14111b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    ck.v r5 = ck.v.f7137a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: df.x.e.a.emit(java.lang.Object, gk.Continuation):java.lang.Object");
            }
        }

        public e(cl.b bVar, x xVar) {
            this.f14106a = bVar;
            this.f14107b = xVar;
        }

        @Override // cl.b
        public Object a(cl.c<? super l> cVar, Continuation continuation) {
            Object c10;
            Object a10 = this.f14106a.a(new a(cVar, this.f14107b), continuation);
            c10 = hk.d.c();
            return a10 == c10 ? a10 : ck.v.f7137a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements ok.p<zk.k0, Continuation<? super ck.v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14113a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f14115c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements ok.p<a1.a, Continuation<? super ck.v>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f14116a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f14117b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f14118c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f14118c = str;
            }

            @Override // ok.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(a1.a aVar, Continuation<? super ck.v> continuation) {
                return ((a) create(aVar, continuation)).invokeSuspend(ck.v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<ck.v> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f14118c, continuation);
                aVar.f14117b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                hk.d.c();
                if (this.f14116a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ck.o.b(obj);
                ((a1.a) this.f14117b).i(c.f14101a.a(), this.f14118c);
                return ck.v.f7137a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f14115c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<ck.v> create(Object obj, Continuation<?> continuation) {
            return new f(this.f14115c, continuation);
        }

        @Override // ok.p
        public final Object invoke(zk.k0 k0Var, Continuation<? super ck.v> continuation) {
            return ((f) create(k0Var, continuation)).invokeSuspend(ck.v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = hk.d.c();
            int i10 = this.f14113a;
            if (i10 == 0) {
                ck.o.b(obj);
                x0.f b10 = x.f14091f.b(x.this.f14093b);
                a aVar = new a(this.f14115c, null);
                this.f14113a = 1;
                if (a1.g.a(b10, aVar, this) == c10) {
                    return c10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ck.o.b(obj);
            }
            return ck.v.f7137a;
        }
    }

    public x(Context context, gk.f backgroundDispatcher) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(backgroundDispatcher, "backgroundDispatcher");
        this.f14093b = context;
        this.f14094c = backgroundDispatcher;
        this.f14095d = new AtomicReference<>();
        this.f14096e = new e(cl.d.a(f14091f.b(context).getData(), new d(null)), this);
        zk.j.d(l0.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l i(a1.d dVar) {
        return new l((String) dVar.b(c.f14101a.a()));
    }

    @Override // df.w
    public String a() {
        l lVar = this.f14095d.get();
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    @Override // df.w
    public void b(String sessionId) {
        kotlin.jvm.internal.n.e(sessionId, "sessionId");
        zk.j.d(l0.a(this.f14094c), null, null, new f(sessionId, null), 3, null);
    }
}
