package x0;

import ck.v;
import dk.z;
import gk.Continuation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.x;
import zk.k0;

/* loaded from: classes.dex */
public final class m<T> implements x0.f<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final a f30258k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Set<String> f30259l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    private static final Object f30260m = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final ok.a<File> f30261a;

    /* renamed from: b, reason: collision with root package name */
    private final x0.k<T> f30262b;

    /* renamed from: c, reason: collision with root package name */
    private final x0.b<T> f30263c;

    /* renamed from: d, reason: collision with root package name */
    private final k0 f30264d;

    /* renamed from: e, reason: collision with root package name */
    private final cl.b<T> f30265e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30266f;

    /* renamed from: g, reason: collision with root package name */
    private final ck.h f30267g;

    /* renamed from: h, reason: collision with root package name */
    private final cl.k<x0.n<T>> f30268h;

    /* renamed from: i, reason: collision with root package name */
    private List<? extends ok.p<? super x0.i<T>, ? super Continuation<? super v>, ? extends Object>> f30269i;

    /* renamed from: j, reason: collision with root package name */
    private final x0.l<b<T>> f30270j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Set<String> a() {
            return m.f30259l;
        }

        public final Object b() {
            return m.f30260m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* loaded from: classes.dex */
        public static final class a<T> extends b<T> {

            /* renamed from: a, reason: collision with root package name */
            private final x0.n<T> f30271a;

            public a(x0.n<T> nVar) {
                super(null);
                this.f30271a = nVar;
            }

            public x0.n<T> a() {
                return this.f30271a;
            }
        }

        /* renamed from: x0.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0491b<T> extends b<T> {

            /* renamed from: a, reason: collision with root package name */
            private final ok.p<T, Continuation<? super T>, Object> f30272a;

            /* renamed from: b, reason: collision with root package name */
            private final zk.v<T> f30273b;

            /* renamed from: c, reason: collision with root package name */
            private final x0.n<T> f30274c;

            /* renamed from: d, reason: collision with root package name */
            private final gk.f f30275d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0491b(ok.p<? super T, ? super Continuation<? super T>, ? extends Object> transform, zk.v<T> ack, x0.n<T> nVar, gk.f callerContext) {
                super(null);
                kotlin.jvm.internal.n.e(transform, "transform");
                kotlin.jvm.internal.n.e(ack, "ack");
                kotlin.jvm.internal.n.e(callerContext, "callerContext");
                this.f30272a = transform;
                this.f30273b = ack;
                this.f30274c = nVar;
                this.f30275d = callerContext;
            }

            public final zk.v<T> a() {
                return this.f30273b;
            }

            public final gk.f b() {
                return this.f30275d;
            }

            public x0.n<T> c() {
                return this.f30274c;
            }

            public final ok.p<T, Continuation<? super T>, Object> d() {
                return this.f30272a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f30276a;

        public c(FileOutputStream fileOutputStream) {
            kotlin.jvm.internal.n.e(fileOutputStream, "fileOutputStream");
            this.f30276a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f30276a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            this.f30276a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b10) {
            kotlin.jvm.internal.n.e(b10, "b");
            this.f30276a.write(b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int i10, int i11) {
            kotlin.jvm.internal.n.e(bytes, "bytes");
            this.f30276a.write(bytes, i10, i11);
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.o implements ok.l<Throwable, v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m<T> f30277a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m<T> mVar) {
            super(1);
            this.f30277a = mVar;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                ((m) this.f30277a).f30268h.setValue(new x0.h(th2));
            }
            a aVar = m.f30258k;
            Object b10 = aVar.b();
            m<T> mVar = this.f30277a;
            synchronized (b10) {
                aVar.a().remove(mVar.q().getAbsolutePath());
                v vVar = v.f7137a;
            }
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
            a(th2);
            return v.f7137a;
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.o implements ok.p<b<T>, Throwable, v> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f30278a = new e();

        e() {
            super(2);
        }

        public final void a(b<T> msg, Throwable th2) {
            kotlin.jvm.internal.n.e(msg, "msg");
            if (msg instanceof b.C0491b) {
                zk.v<T> a10 = ((b.C0491b) msg).a();
                if (th2 == null) {
                    th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a10.y(th2);
            }
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ v invoke(Object obj, Throwable th2) {
            a((b) obj, th2);
            return v.f7137a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements ok.p<b<T>, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f30279a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30280b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<T> f30281c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m<T> mVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f30281c = mVar;
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b<T> bVar, Continuation<? super v> continuation) {
            return ((f) create(bVar, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f30281c, continuation);
            fVar.f30280b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = hk.d.c();
            int i10 = this.f30279a;
            if (i10 == 0) {
                ck.o.b(obj);
                b bVar = (b) this.f30280b;
                if (bVar instanceof b.a) {
                    this.f30279a = 1;
                    if (this.f30281c.r((b.a) bVar, this) == c10) {
                        return c10;
                    }
                } else if (bVar instanceof b.C0491b) {
                    this.f30279a = 2;
                    if (this.f30281c.s((b.C0491b) bVar, this) == c10) {
                        return c10;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ck.o.b(obj);
            }
            return v.f7137a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements ok.p<cl.c<? super T>, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f30282a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f30283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<T> f30284c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements ok.p<x0.n<T>, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f30285a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f30286b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ x0.n<T> f30287c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x0.n<T> nVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f30287c = nVar;
            }

            @Override // ok.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x0.n<T> nVar, Continuation<? super Boolean> continuation) {
                return ((a) create(nVar, continuation)).invokeSuspend(v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<v> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f30287c, continuation);
                aVar.f30286b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                hk.d.c();
                if (this.f30285a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ck.o.b(obj);
                x0.n<T> nVar = (x0.n) this.f30286b;
                x0.n<T> nVar2 = this.f30287c;
                boolean z10 = false;
                if (!(nVar2 instanceof x0.c) && !(nVar2 instanceof x0.h) && nVar == nVar2) {
                    z10 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements cl.b<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ cl.b f30288a;

            /* loaded from: classes.dex */
            public static final class a implements cl.c<x0.n<T>> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ cl.c f30289a;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                /* renamed from: x0.m$g$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0492a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f30290a;

                    /* renamed from: b, reason: collision with root package name */
                    int f30291b;

                    public C0492a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f30290a = obj;
                        this.f30291b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(cl.c cVar) {
                    this.f30289a = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // cl.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object emit(java.lang.Object r5, gk.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof x0.m.g.b.a.C0492a
                        if (r0 == 0) goto L13
                        r0 = r6
                        x0.m$g$b$a$a r0 = (x0.m.g.b.a.C0492a) r0
                        int r1 = r0.f30291b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f30291b = r1
                        goto L18
                    L13:
                        x0.m$g$b$a$a r0 = new x0.m$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f30290a
                        java.lang.Object r1 = hk.b.c()
                        int r2 = r0.f30291b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        ck.o.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        ck.o.b(r6)
                        cl.c r6 = r4.f30289a
                        x0.n r5 = (x0.n) r5
                        boolean r2 = r5 instanceof x0.j
                        if (r2 != 0) goto L73
                        boolean r2 = r5 instanceof x0.h
                        if (r2 != 0) goto L6c
                        boolean r2 = r5 instanceof x0.c
                        if (r2 == 0) goto L56
                        x0.c r5 = (x0.c) r5
                        java.lang.Object r5 = r5.b()
                        r0.f30291b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        ck.v r5 = ck.v.f7137a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof x0.o
                        if (r5 == 0) goto L66
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L66:
                        ck.l r5 = new ck.l
                        r5.<init>()
                        throw r5
                    L6c:
                        x0.h r5 = (x0.h) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L73:
                        x0.j r5 = (x0.j) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: x0.m.g.b.a.emit(java.lang.Object, gk.Continuation):java.lang.Object");
                }
            }

            public b(cl.b bVar) {
                this.f30288a = bVar;
            }

            @Override // cl.b
            public Object a(cl.c cVar, Continuation continuation) {
                Object c10;
                Object a10 = this.f30288a.a(new a(cVar), continuation);
                c10 = hk.d.c();
                return a10 == c10 ? a10 : v.f7137a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m<T> mVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f30284c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f30284c, continuation);
            gVar.f30283b = obj;
            return gVar;
        }

        @Override // ok.p
        public final Object invoke(cl.c<? super T> cVar, Continuation<? super v> continuation) {
            return ((g) create(cVar, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = hk.d.c();
            int i10 = this.f30282a;
            if (i10 == 0) {
                ck.o.b(obj);
                cl.c cVar = (cl.c) this.f30283b;
                x0.n nVar = (x0.n) ((m) this.f30284c).f30268h.getValue();
                if (!(nVar instanceof x0.c)) {
                    ((m) this.f30284c).f30270j.e(new b.a(nVar));
                }
                b bVar = new b(cl.d.c(((m) this.f30284c).f30268h, new a(nVar, null)));
                this.f30282a = 1;
                if (cl.d.d(cVar, bVar, this) == c10) {
                    return c10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ck.o.b(obj);
            }
            return v.f7137a;
        }
    }

    /* loaded from: classes.dex */
    static final class h extends kotlin.jvm.internal.o implements ok.a<File> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m<T> f30293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m<T> mVar) {
            super(0);
            this.f30293a = mVar;
        }

        @Override // ok.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) ((m) this.f30293a).f30261a.invoke();
            String it = file.getAbsolutePath();
            a aVar = m.f30258k;
            synchronized (aVar.b()) {
                if (!(!aVar.a().contains(it))) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set<String> a10 = aVar.a();
                kotlin.jvm.internal.n.d(it, "it");
                a10.add(it);
            }
            return file;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    /* loaded from: classes.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30294a;

        /* renamed from: b, reason: collision with root package name */
        Object f30295b;

        /* renamed from: c, reason: collision with root package name */
        Object f30296c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30297d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m<T> f30298e;

        /* renamed from: f, reason: collision with root package name */
        int f30299f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(m<T> mVar, Continuation<? super i> continuation) {
            super(continuation);
            this.f30298e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30297d = obj;
            this.f30299f |= Integer.MIN_VALUE;
            return this.f30298e.s(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    /* loaded from: classes.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30300a;

        /* renamed from: b, reason: collision with root package name */
        Object f30301b;

        /* renamed from: c, reason: collision with root package name */
        Object f30302c;

        /* renamed from: d, reason: collision with root package name */
        Object f30303d;

        /* renamed from: e, reason: collision with root package name */
        Object f30304e;

        /* renamed from: f, reason: collision with root package name */
        Object f30305f;

        /* renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f30306r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ m<T> f30307s;

        /* renamed from: t, reason: collision with root package name */
        int f30308t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(m<T> mVar, Continuation<? super j> continuation) {
            super(continuation);
            this.f30307s = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30306r = obj;
            this.f30308t |= Integer.MIN_VALUE;
            return this.f30307s.t(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class k implements x0.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ il.a f30309a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.v f30310b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x<T> f30311c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<T> f30312d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f30313a;

            /* renamed from: b, reason: collision with root package name */
            Object f30314b;

            /* renamed from: c, reason: collision with root package name */
            Object f30315c;

            /* renamed from: d, reason: collision with root package name */
            Object f30316d;

            /* renamed from: e, reason: collision with root package name */
            Object f30317e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f30318f;

            /* renamed from: s, reason: collision with root package name */
            int f30320s;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f30318f = obj;
                this.f30320s |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        k(il.a aVar, kotlin.jvm.internal.v vVar, x<T> xVar, m<T> mVar) {
            this.f30309a = aVar;
            this.f30310b = vVar;
            this.f30311c = xVar;
            this.f30312d = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00d7, B:47:0x00de), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #2 {all -> 0x00df, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00d7, B:47:0x00de), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // x0.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(ok.p<? super T, ? super gk.Continuation<? super T>, ? extends java.lang.Object> r11, gk.Continuation<? super T> r12) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.m.k.a(ok.p, gk.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    /* loaded from: classes.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30321a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30322b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<T> f30323c;

        /* renamed from: d, reason: collision with root package name */
        int f30324d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(m<T> mVar, Continuation<? super l> continuation) {
            super(continuation);
            this.f30323c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30322b = obj;
            this.f30324d |= Integer.MIN_VALUE;
            return this.f30323c.u(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    /* renamed from: x0.m$m, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0493m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30325a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<T> f30327c;

        /* renamed from: d, reason: collision with root package name */
        int f30328d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0493m(m<T> mVar, Continuation<? super C0493m> continuation) {
            super(continuation);
            this.f30327c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30326b = obj;
            this.f30328d |= Integer.MIN_VALUE;
            return this.f30327c.v(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    /* loaded from: classes.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30329a;

        /* renamed from: b, reason: collision with root package name */
        Object f30330b;

        /* renamed from: c, reason: collision with root package name */
        Object f30331c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30332d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m<T> f30333e;

        /* renamed from: f, reason: collision with root package name */
        int f30334f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(m<T> mVar, Continuation<? super n> continuation) {
            super(continuation);
            this.f30333e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30332d = obj;
            this.f30334f |= Integer.MIN_VALUE;
            return this.f30333e.w(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    /* loaded from: classes.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30335a;

        /* renamed from: b, reason: collision with root package name */
        Object f30336b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f30337c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<T> f30338d;

        /* renamed from: e, reason: collision with root package name */
        int f30339e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(m<T> mVar, Continuation<? super o> continuation) {
            super(continuation);
            this.f30338d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30337c = obj;
            this.f30339e |= Integer.MIN_VALUE;
            return this.f30338d.x(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    /* loaded from: classes.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30340a;

        /* renamed from: b, reason: collision with root package name */
        Object f30341b;

        /* renamed from: c, reason: collision with root package name */
        Object f30342c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30343d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m<T> f30344e;

        /* renamed from: f, reason: collision with root package name */
        int f30345f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(m<T> mVar, Continuation<? super p> continuation) {
            super(continuation);
            this.f30344e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30343d = obj;
            this.f30345f |= Integer.MIN_VALUE;
            return this.f30344e.y(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements ok.p<k0, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f30346a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ok.p<T, Continuation<? super T>, Object> f30347b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f30348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(ok.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, T t10, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f30347b = pVar;
            this.f30348c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            return new q(this.f30347b, this.f30348c, continuation);
        }

        @Override // ok.p
        public final Object invoke(k0 k0Var, Continuation<? super T> continuation) {
            return ((q) create(k0Var, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = hk.d.c();
            int i10 = this.f30346a;
            if (i10 == 0) {
                ck.o.b(obj);
                ok.p<T, Continuation<? super T>, Object> pVar = this.f30347b;
                T t10 = this.f30348c;
                this.f30346a = 1;
                obj = pVar.invoke(t10, this);
                if (obj == c10) {
                    return c10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ck.o.b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    /* loaded from: classes.dex */
    public static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30349a;

        /* renamed from: b, reason: collision with root package name */
        Object f30350b;

        /* renamed from: c, reason: collision with root package name */
        Object f30351c;

        /* renamed from: d, reason: collision with root package name */
        Object f30352d;

        /* renamed from: e, reason: collision with root package name */
        Object f30353e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f30354f;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ m<T> f30355r;

        /* renamed from: s, reason: collision with root package name */
        int f30356s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(m<T> mVar, Continuation<? super r> continuation) {
            super(continuation);
            this.f30355r = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30354f = obj;
            this.f30356s |= Integer.MIN_VALUE;
            return this.f30355r.z(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(ok.a<? extends File> produceFile, x0.k<T> serializer, List<? extends ok.p<? super x0.i<T>, ? super Continuation<? super v>, ? extends Object>> initTasksList, x0.b<T> corruptionHandler, k0 scope) {
        ck.h a10;
        List<? extends ok.p<? super x0.i<T>, ? super Continuation<? super v>, ? extends Object>> f02;
        kotlin.jvm.internal.n.e(produceFile, "produceFile");
        kotlin.jvm.internal.n.e(serializer, "serializer");
        kotlin.jvm.internal.n.e(initTasksList, "initTasksList");
        kotlin.jvm.internal.n.e(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.n.e(scope, "scope");
        this.f30261a = produceFile;
        this.f30262b = serializer;
        this.f30263c = corruptionHandler;
        this.f30264d = scope;
        this.f30265e = cl.d.g(new g(this, null));
        this.f30266f = ".tmp";
        a10 = ck.j.a(new h(this));
        this.f30267g = a10;
        this.f30268h = cl.n.a(x0.o.f30357a);
        f02 = z.f0(initTasksList);
        this.f30269i = f02;
        this.f30270j = new x0.l<>(scope, new d(this), e.f30278a, new f(this, null));
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(kotlin.jvm.internal.n.k("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File q() {
        return (File) this.f30267g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(b.a<T> aVar, Continuation<? super v> continuation) {
        Object c10;
        Object c11;
        x0.n<T> value = this.f30268h.getValue();
        if (!(value instanceof x0.c)) {
            if (value instanceof x0.j) {
                if (value == aVar.a()) {
                    Object v10 = v(continuation);
                    c11 = hk.d.c();
                    return v10 == c11 ? v10 : v.f7137a;
                }
            } else {
                if (kotlin.jvm.internal.n.a(value, x0.o.f30357a)) {
                    Object v11 = v(continuation);
                    c10 = hk.d.c();
                    return v11 == c10 ? v11 : v.f7137a;
                }
                if (value instanceof x0.h) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return v.f7137a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0052, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [x0.m, x0.m<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [zk.v] */
    /* JADX WARN: Type inference failed for: r9v3, types: [zk.v] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(x0.m.b.C0491b<T> r9, gk.Continuation<? super ck.v> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.m.s(x0.m$b$b, gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(gk.Continuation<? super ck.v> r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.m.t(gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(gk.Continuation<? super ck.v> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof x0.m.l
            if (r0 == 0) goto L13
            r0 = r5
            x0.m$l r0 = (x0.m.l) r0
            int r1 = r0.f30324d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30324d = r1
            goto L18
        L13:
            x0.m$l r0 = new x0.m$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30322b
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f30324d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f30321a
            x0.m r0 = (x0.m) r0
            ck.o.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            ck.o.b(r5)
            r0.f30321a = r4     // Catch: java.lang.Throwable -> L48
            r0.f30324d = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            ck.v r5 = ck.v.f7137a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            cl.k<x0.n<T>> r0 = r0.f30268h
            x0.j r1 = new x0.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.m.u(gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(gk.Continuation<? super ck.v> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof x0.m.C0493m
            if (r0 == 0) goto L13
            r0 = r5
            x0.m$m r0 = (x0.m.C0493m) r0
            int r1 = r0.f30328d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30328d = r1
            goto L18
        L13:
            x0.m$m r0 = new x0.m$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30326b
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f30328d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f30325a
            x0.m r0 = (x0.m) r0
            ck.o.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            ck.o.b(r5)
            r0.f30325a = r4     // Catch: java.lang.Throwable -> L45
            r0.f30328d = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            cl.k<x0.n<T>> r0 = r0.f30268h
            x0.j r1 = new x0.j
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            ck.v r5 = ck.v.f7137a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.m.v(gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [x0.m] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [x0.m$n, gk.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [x0.m] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [x0.k, x0.k<T>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(gk.Continuation<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof x0.m.n
            if (r0 == 0) goto L13
            r0 = r6
            x0.m$n r0 = (x0.m.n) r0
            int r1 = r0.f30334f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30334f = r1
            goto L18
        L13:
            x0.m$n r0 = new x0.m$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f30332d
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f30334f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f30331c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f30330b
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f30329a
            x0.m r0 = (x0.m) r0
            ck.o.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            ck.o.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.q()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            x0.k<T> r6 = r5.f30262b     // Catch: java.lang.Throwable -> L65
            r0.f30329a = r5     // Catch: java.lang.Throwable -> L65
            r0.f30330b = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.f30331c = r4     // Catch: java.lang.Throwable -> L65
            r0.f30334f = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            mk.b.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            mk.b.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            x0.k<T> r6 = r0.f30262b
            java.lang.Object r6 = r6.b()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.m.w(gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(gk.Continuation<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof x0.m.o
            if (r0 == 0) goto L13
            r0 = r8
            x0.m$o r0 = (x0.m.o) r0
            int r1 = r0.f30339e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30339e = r1
            goto L18
        L13:
            x0.m$o r0 = new x0.m$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f30337c
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f30339e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f30336b
            java.lang.Object r0 = r0.f30335a
            x0.a r0 = (x0.a) r0
            ck.o.b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f30336b
            x0.a r2 = (x0.a) r2
            java.lang.Object r4 = r0.f30335a
            x0.m r4 = (x0.m) r4
            ck.o.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f30335a
            x0.m r2 = (x0.m) r2
            ck.o.b(r8)     // Catch: x0.a -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            ck.o.b(r8)
            r0.f30335a = r7     // Catch: x0.a -> L64
            r0.f30339e = r5     // Catch: x0.a -> L64
            java.lang.Object r8 = r7.w(r0)     // Catch: x0.a -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            x0.b<T> r5 = r2.f30263c
            r0.f30335a = r2
            r0.f30336b = r8
            r0.f30339e = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f30335a = r2     // Catch: java.io.IOException -> L88
            r0.f30336b = r8     // Catch: java.io.IOException -> L88
            r0.f30339e = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.z(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            ck.a.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.m.x(gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(ok.p<? super T, ? super gk.Continuation<? super T>, ? extends java.lang.Object> r8, gk.f r9, gk.Continuation<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof x0.m.p
            if (r0 == 0) goto L13
            r0 = r10
            x0.m$p r0 = (x0.m.p) r0
            int r1 = r0.f30345f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30345f = r1
            goto L18
        L13:
            x0.m$p r0 = new x0.m$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f30343d
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f30345f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f30341b
            java.lang.Object r9 = r0.f30340a
            x0.m r9 = (x0.m) r9
            ck.o.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f30342c
            java.lang.Object r9 = r0.f30341b
            x0.c r9 = (x0.c) r9
            java.lang.Object r2 = r0.f30340a
            x0.m r2 = (x0.m) r2
            ck.o.b(r10)
            goto L73
        L49:
            ck.o.b(r10)
            cl.k<x0.n<T>> r10 = r7.f30268h
            java.lang.Object r10 = r10.getValue()
            x0.c r10 = (x0.c) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            x0.m$q r6 = new x0.m$q
            r6.<init>(r8, r2, r3)
            r0.f30340a = r7
            r0.f30341b = r10
            r0.f30342c = r2
            r0.f30345f = r5
            java.lang.Object r8 = zk.h.g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = kotlin.jvm.internal.n.a(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f30340a = r2
            r0.f30341b = r10
            r0.f30342c = r3
            r0.f30345f = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            cl.k<x0.n<T>> r9 = r9.f30268h
            x0.c r10 = new x0.c
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.m.y(ok.p, gk.f, gk.Continuation):java.lang.Object");
    }

    @Override // x0.f
    public Object a(ok.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        zk.v b10 = zk.x.b(null, 1, null);
        this.f30270j.e(new b.C0491b(pVar, b10, this.f30268h.getValue(), continuation.getContext()));
        return b10.i0(continuation);
    }

    @Override // x0.f
    public cl.b<T> getData() {
        return this.f30265e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[Catch: IOException -> 0x00c6, TRY_ENTER, TryCatch #2 {IOException -> 0x00c6, blocks: (B:14:0x0092, B:19:0x00a2, B:20:0x00bd, B:27:0x00c2, B:28:0x00c5, B:24:0x00c0), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(T r8, gk.Continuation<? super ck.v> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof x0.m.r
            if (r0 == 0) goto L13
            r0 = r9
            x0.m$r r0 = (x0.m.r) r0
            int r1 = r0.f30356s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30356s = r1
            goto L18
        L13:
            x0.m$r r0 = new x0.m$r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f30354f
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f30356s
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f30353e
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f30352d
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f30351c
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f30350b
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f30349a
            x0.m r0 = (x0.m) r0
            ck.o.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lc0
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            ck.o.b(r9)
            java.io.File r9 = r7.q()
            r7.p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f30266f
            java.lang.String r2 = kotlin.jvm.internal.n.k(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc9
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc9
            x0.k<T> r4 = r7.f30262b     // Catch: java.lang.Throwable -> Lbe
            x0.m$c r5 = new x0.m$c     // Catch: java.lang.Throwable -> Lbe
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lbe
            r0.f30349a = r7     // Catch: java.lang.Throwable -> Lbe
            r0.f30350b = r9     // Catch: java.lang.Throwable -> Lbe
            r0.f30351c = r2     // Catch: java.lang.Throwable -> Lbe
            r6 = 0
            r0.f30352d = r6     // Catch: java.lang.Throwable -> Lbe
            r0.f30353e = r2     // Catch: java.lang.Throwable -> Lbe
            r0.f30356s = r3     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r8 = r4.c(r8, r5, r0)     // Catch: java.lang.Throwable -> Lbe
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            ck.v r8 = ck.v.f7137a     // Catch: java.lang.Throwable -> L3d
            mk.b.a(r2, r1)     // Catch: java.io.IOException -> Lc6
            java.io.File r8 = r0.q()     // Catch: java.io.IOException -> Lc6
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lc6
            if (r8 == 0) goto La2
            ck.v r8 = ck.v.f7137a
            return r8
        La2:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lc6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc6
            r9.<init>()     // Catch: java.io.IOException -> Lc6
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lc6
            r9.append(r3)     // Catch: java.io.IOException -> Lc6
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lc6
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lc6
            r8.<init>(r9)     // Catch: java.io.IOException -> Lc6
            throw r8     // Catch: java.io.IOException -> Lc6
        Lbe:
            r8 = move-exception
            r3 = r9
        Lc0:
            throw r8     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r9 = move-exception
            mk.b.a(r2, r8)     // Catch: java.io.IOException -> Lc6
            throw r9     // Catch: java.io.IOException -> Lc6
        Lc6:
            r8 = move-exception
            r9 = r3
            goto Lca
        Lc9:
            r8 = move-exception
        Lca:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld3
            r9.delete()
        Ld3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.m.z(java.lang.Object, gk.Continuation):java.lang.Object");
    }
}
