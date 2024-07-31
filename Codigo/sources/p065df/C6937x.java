package p065df;

import android.content.Context;
import android.util.Log;
import ck.C2030o;
import ck.C2037v;
import cl.C2041d;
import cl.InterfaceC2039b;
import cl.InterfaceC2040c;
import hk.C7752d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9328t;
import kotlin.jvm.internal.C9333y;
import p003a1.AbstractC0015d;
import p003a1.C0012a;
import p003a1.C0016e;
import p003a1.C0017f;
import p003a1.C0018g;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC10003q;
import p340rk.InterfaceC10723a;
import p405vk.InterfaceC11971h;
import p430x0.InterfaceC12255f;
import p475z0.C12754a;
import p494zk.C13071j;
import p494zk.C13080l0;
import p494zk.InterfaceC13076k0;

/* renamed from: df.x */
/* loaded from: classes2.dex */
public final class C6937x implements InterfaceC6936w {

    /* renamed from: f */
    private static final b f15445f = new b(null);

    /* renamed from: g */
    @Deprecated
    private static final InterfaceC10723a<Context, InterfaceC12255f<AbstractC0015d>> f15446g = C12754a.m42297b(C6935v.f15439a.m20053a(), null, null, null, 14, null);

    /* renamed from: b */
    private final Context f15447b;

    /* renamed from: c */
    private final InterfaceC7587f f15448c;

    /* renamed from: d */
    private final AtomicReference<C6925l> f15449d;

    /* renamed from: e */
    private final InterfaceC2039b<C6925l> f15450e;

    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.SessionDatastoreImpl$1", m27743f = "SessionDatastore.kt", m27744l = {79}, m27745m = "invokeSuspend")
    /* renamed from: df.x$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f15451a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: df.x$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C13201a<T> implements InterfaceC2040c {

            /* renamed from: a */
            final /* synthetic */ C6937x f15453a;

            C13201a(C6937x c6937x) {
                this.f15453a = c6937x;
            }

            @Override // cl.InterfaceC2040c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C6925l c6925l, Continuation<? super C2037v> continuation) {
                this.f15453a.f15449d.set(c6925l);
                return C2037v.f8089a;
            }
        }

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
            m23655c = C7752d.m23655c();
            int i10 = this.f15451a;
            if (i10 == 0) {
                C2030o.m10349b(obj);
                InterfaceC2039b interfaceC2039b = C6937x.this.f15450e;
                C13201a c13201a = new C13201a(C6937x.this);
                this.f15451a = 1;
                if (interfaceC2039b.mo10355a(c13201a, this) == m23655c) {
                    return m23655c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2030o.m10349b(obj);
            }
            return C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: df.x$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        static final /* synthetic */ InterfaceC11971h<Object>[] f15454a = {C9333y.m27800e(new C9328t(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final InterfaceC12255f<AbstractC0015d> m20067b(Context context) {
            return (InterfaceC12255f) C6937x.f15446g.mo32609a(context, f15454a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: df.x$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f15455a = new c();

        /* renamed from: b */
        private static final AbstractC0015d.a<String> f15456b = C0017f.m63f("session_id");

        private c() {
        }

        /* renamed from: a */
        public final AbstractC0015d.a<String> m20068a() {
            return f15456b;
        }
    }

    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", m27743f = "SessionDatastore.kt", m27744l = {73}, m27745m = "invokeSuspend")
    /* renamed from: df.x$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC9306l implements InterfaceC10003q<InterfaceC2040c<? super AbstractC0015d>, Throwable, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f15457a;

        /* renamed from: b */
        private /* synthetic */ Object f15458b;

        /* renamed from: c */
        /* synthetic */ Object f15459c;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // p280ok.InterfaceC10003q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo9756m(InterfaceC2040c<? super AbstractC0015d> interfaceC2040c, Throwable th2, Continuation<? super C2037v> continuation) {
            d dVar = new d(continuation);
            dVar.f15458b = interfaceC2040c;
            dVar.f15459c = th2;
            return dVar.invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            m23655c = C7752d.m23655c();
            int i10 = this.f15457a;
            if (i10 == 0) {
                C2030o.m10349b(obj);
                InterfaceC2040c interfaceC2040c = (InterfaceC2040c) this.f15458b;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f15459c);
                AbstractC0015d m56a = C0016e.m56a();
                this.f15458b = null;
                this.f15457a = 1;
                if (interfaceC2040c.emit(m56a, this) == m23655c) {
                    return m23655c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2030o.m10349b(obj);
            }
            return C2037v.f8089a;
        }
    }

    /* renamed from: df.x$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC2039b<C6925l> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2039b f15460a;

        /* renamed from: b */
        final /* synthetic */ C6937x f15461b;

        /* renamed from: df.x$e$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements InterfaceC2040c {

            /* renamed from: a */
            final /* synthetic */ InterfaceC2040c f15462a;

            /* renamed from: b */
            final /* synthetic */ C6937x f15463b;

            @InterfaceC9300f(m27742c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", m27743f = "SessionDatastore.kt", m27744l = {224}, m27745m = "emit")
            /* renamed from: df.x$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C13202a extends AbstractC9298d {

                /* renamed from: a */
                /* synthetic */ Object f15464a;

                /* renamed from: b */
                int f15465b;

                public C13202a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
                public final Object invokeSuspend(Object obj) {
                    this.f15464a = obj;
                    this.f15465b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2040c interfaceC2040c, C6937x c6937x) {
                this.f15462a = interfaceC2040c;
                this.f15463b = c6937x;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // cl.InterfaceC2040c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, p124gk.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p065df.C6937x.e.a.C13202a
                    if (r0 == 0) goto L13
                    r0 = r6
                    df.x$e$a$a r0 = (p065df.C6937x.e.a.C13202a) r0
                    int r1 = r0.f15465b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f15465b = r1
                    goto L18
                L13:
                    df.x$e$a$a r0 = new df.x$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f15464a
                    java.lang.Object r1 = hk.C7750b.m23652c()
                    int r2 = r0.f15465b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ck.C2030o.m10349b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    ck.C2030o.m10349b(r6)
                    cl.c r6 = r4.f15462a
                    a1.d r5 = (p003a1.AbstractC0015d) r5
                    df.x r2 = r4.f15463b
                    df.l r5 = p065df.C6937x.m20063h(r2, r5)
                    r0.f15465b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    ck.v r5 = ck.C2037v.f8089a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p065df.C6937x.e.a.emit(java.lang.Object, gk.Continuation):java.lang.Object");
            }
        }

        public e(InterfaceC2039b interfaceC2039b, C6937x c6937x) {
            this.f15460a = interfaceC2039b;
            this.f15461b = c6937x;
        }

        @Override // cl.InterfaceC2039b
        /* renamed from: a */
        public Object mo10355a(InterfaceC2040c<? super C6925l> interfaceC2040c, Continuation continuation) {
            Object m23655c;
            Object mo10355a = this.f15460a.mo10355a(new a(interfaceC2040c, this.f15461b), continuation);
            m23655c = C7752d.m23655c();
            return mo10355a == m23655c ? mo10355a : C2037v.f8089a;
        }
    }

    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", m27743f = "SessionDatastore.kt", m27744l = {85}, m27745m = "invokeSuspend")
    /* renamed from: df.x$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f15467a;

        /* renamed from: c */
        final /* synthetic */ String f15469c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC9300f(m27742c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", m27743f = "SessionDatastore.kt", m27744l = {}, m27745m = "invokeSuspend")
        /* renamed from: df.x$f$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC9306l implements InterfaceC10002p<C0012a, Continuation<? super C2037v>, Object> {

            /* renamed from: a */
            int f15470a;

            /* renamed from: b */
            /* synthetic */ Object f15471b;

            /* renamed from: c */
            final /* synthetic */ String f15472c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f15472c = str;
            }

            @Override // p280ok.InterfaceC10002p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C0012a c0012a, Continuation<? super C2037v> continuation) {
                return ((a) create(c0012a, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f15472c, continuation);
                aVar.f15471b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                C7752d.m23655c();
                if (this.f15470a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2030o.m10349b(obj);
                ((C0012a) this.f15471b).m44i(c.f15455a.m20068a(), this.f15472c);
                return C2037v.f8089a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f15469c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            return new f(this.f15469c, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
            return ((f) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            m23655c = C7752d.m23655c();
            int i10 = this.f15467a;
            if (i10 == 0) {
                C2030o.m10349b(obj);
                InterfaceC12255f m20067b = C6937x.f15445f.m20067b(C6937x.this.f15447b);
                a aVar = new a(this.f15469c, null);
                this.f15467a = 1;
                if (C0018g.m65a(m20067b, aVar, this) == m23655c) {
                    return m23655c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2030o.m10349b(obj);
            }
            return C2037v.f8089a;
        }
    }

    public C6937x(Context context, InterfaceC7587f backgroundDispatcher) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(backgroundDispatcher, "backgroundDispatcher");
        this.f15447b = context;
        this.f15448c = backgroundDispatcher;
        this.f15449d = new AtomicReference<>();
        this.f15450e = new e(C2041d.m10357a(f15445f.m20067b(context).getData(), new d(null)), this);
        C13071j.m43218d(C13080l0.m43227a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final C6925l m20064i(AbstractC0015d abstractC0015d) {
        return new C6925l((String) abstractC0015d.mo39b(c.f15455a.m20068a()));
    }

    @Override // p065df.InterfaceC6936w
    /* renamed from: a */
    public String mo20055a() {
        C6925l c6925l = this.f15449d.get();
        if (c6925l != null) {
            return c6925l.m20042a();
        }
        return null;
    }

    @Override // p065df.InterfaceC6936w
    /* renamed from: b */
    public void mo20056b(String sessionId) {
        C9322n.m27781e(sessionId, "sessionId");
        C13071j.m43218d(C13080l0.m43227a(this.f15448c), null, null, new f(sessionId, null), 3, null);
    }
}
