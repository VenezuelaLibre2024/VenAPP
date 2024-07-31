package p430x0;

import ck.C2025j;
import ck.C2030o;
import ck.C2037v;
import ck.InterfaceC2023h;
import cl.C2041d;
import cl.C2051n;
import cl.InterfaceC2039b;
import cl.InterfaceC2040c;
import cl.InterfaceC2048k;
import dk.C7042z;
import hk.C7752d;
import il.InterfaceC8008a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.C9296b;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9330v;
import kotlin.jvm.internal.C9332x;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC9987a;
import p280ok.InterfaceC9998l;
import p494zk.C13127x;
import p494zk.InterfaceC13076k0;
import p494zk.InterfaceC13119v;

/* renamed from: x0.m */
/* loaded from: classes.dex */
public final class C12262m<T> implements InterfaceC12255f<T> {

    /* renamed from: k */
    public static final a f32770k = new a(null);

    /* renamed from: l */
    private static final Set<String> f32771l = new LinkedHashSet();

    /* renamed from: m */
    private static final Object f32772m = new Object();

    /* renamed from: a */
    private final InterfaceC9987a<File> f32773a;

    /* renamed from: b */
    private final InterfaceC12260k<T> f32774b;

    /* renamed from: c */
    private final InterfaceC12251b<T> f32775c;

    /* renamed from: d */
    private final InterfaceC13076k0 f32776d;

    /* renamed from: e */
    private final InterfaceC2039b<T> f32777e;

    /* renamed from: f */
    private final String f32778f;

    /* renamed from: g */
    private final InterfaceC2023h f32779g;

    /* renamed from: h */
    private final InterfaceC2048k<AbstractC12263n<T>> f32780h;

    /* renamed from: i */
    private List<? extends InterfaceC10002p<? super InterfaceC12258i<T>, ? super Continuation<? super C2037v>, ? extends Object>> f32781i;

    /* renamed from: j */
    private final C12261l<b<T>> f32782j;

    /* renamed from: x0.m$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final Set<String> m39481a() {
            return C12262m.f32771l;
        }

        /* renamed from: b */
        public final Object m39482b() {
            return C12262m.f32772m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0.m$b */
    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: x0.m$b$a */
        /* loaded from: classes.dex */
        public static final class a<T> extends b<T> {

            /* renamed from: a */
            private final AbstractC12263n<T> f32783a;

            public a(AbstractC12263n<T> abstractC12263n) {
                super(null);
                this.f32783a = abstractC12263n;
            }

            /* renamed from: a */
            public AbstractC12263n<T> m39483a() {
                return this.f32783a;
            }
        }

        /* renamed from: x0.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13267b<T> extends b<T> {

            /* renamed from: a */
            private final InterfaceC10002p<T, Continuation<? super T>, Object> f32784a;

            /* renamed from: b */
            private final InterfaceC13119v<T> f32785b;

            /* renamed from: c */
            private final AbstractC12263n<T> f32786c;

            /* renamed from: d */
            private final InterfaceC7587f f32787d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C13267b(InterfaceC10002p<? super T, ? super Continuation<? super T>, ? extends Object> transform, InterfaceC13119v<T> ack, AbstractC12263n<T> abstractC12263n, InterfaceC7587f callerContext) {
                super(null);
                C9322n.m27781e(transform, "transform");
                C9322n.m27781e(ack, "ack");
                C9322n.m27781e(callerContext, "callerContext");
                this.f32784a = transform;
                this.f32785b = ack;
                this.f32786c = abstractC12263n;
                this.f32787d = callerContext;
            }

            /* renamed from: a */
            public final InterfaceC13119v<T> m39484a() {
                return this.f32785b;
            }

            /* renamed from: b */
            public final InterfaceC7587f m39485b() {
                return this.f32787d;
            }

            /* renamed from: c */
            public AbstractC12263n<T> m39486c() {
                return this.f32786c;
            }

            /* renamed from: d */
            public final InterfaceC10002p<T, Continuation<? super T>, Object> m39487d() {
                return this.f32784a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0.m$c */
    /* loaded from: classes.dex */
    public static final class c extends OutputStream {

        /* renamed from: a */
        private final FileOutputStream f32788a;

        public c(FileOutputStream fileOutputStream) {
            C9322n.m27781e(fileOutputStream, "fileOutputStream");
            this.f32788a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f32788a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            this.f32788a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b10) {
            C9322n.m27781e(b10, "b");
            this.f32788a.write(b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int i10, int i11) {
            C9322n.m27781e(bytes, "bytes");
            this.f32788a.write(bytes, i10, i11);
        }
    }

    /* renamed from: x0.m$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {

        /* renamed from: a */
        final /* synthetic */ C12262m<T> f32789a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C12262m<T> c12262m) {
            super(1);
            this.f32789a = c12262m;
        }

        /* renamed from: a */
        public final void m39488a(Throwable th2) {
            if (th2 != null) {
                ((C12262m) this.f32789a).f32780h.setValue(new C12257h(th2));
            }
            a aVar = C12262m.f32770k;
            Object m39482b = aVar.m39482b();
            C12262m<T> c12262m = this.f32789a;
            synchronized (m39482b) {
                aVar.m39481a().remove(c12262m.m39471q().getAbsolutePath());
                C2037v c2037v = C2037v.f8089a;
            }
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
            m39488a(th2);
            return C2037v.f8089a;
        }
    }

    /* renamed from: x0.m$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC9323o implements InterfaceC10002p<b<T>, Throwable, C2037v> {

        /* renamed from: a */
        public static final e f32790a = new e();

        e() {
            super(2);
        }

        /* renamed from: a */
        public final void m39489a(b<T> msg, Throwable th2) {
            C9322n.m27781e(msg, "msg");
            if (msg instanceof b.C13267b) {
                InterfaceC13119v<T> m39484a = ((b.C13267b) msg).m39484a();
                if (th2 == null) {
                    th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                m39484a.mo43307y(th2);
            }
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ C2037v invoke(Object obj, Throwable th2) {
            m39489a((b) obj, th2);
            return C2037v.f8089a;
        }
    }

    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore$actor$3", m27743f = "SingleProcessDataStore.kt", m27744l = {239, 242}, m27745m = "invokeSuspend")
    /* renamed from: x0.m$f */
    /* loaded from: classes.dex */
    static final class f extends AbstractC9306l implements InterfaceC10002p<b<T>, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f32791a;

        /* renamed from: b */
        /* synthetic */ Object f32792b;

        /* renamed from: c */
        final /* synthetic */ C12262m<T> f32793c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C12262m<T> c12262m, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f32793c = c12262m;
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b<T> bVar, Continuation<? super C2037v> continuation) {
            return ((f) create(bVar, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f32793c, continuation);
            fVar.f32792b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            m23655c = C7752d.m23655c();
            int i10 = this.f32791a;
            if (i10 == 0) {
                C2030o.m10349b(obj);
                b bVar = (b) this.f32792b;
                if (bVar instanceof b.a) {
                    this.f32791a = 1;
                    if (this.f32793c.m39472r((b.a) bVar, this) == m23655c) {
                        return m23655c;
                    }
                } else if (bVar instanceof b.C13267b) {
                    this.f32791a = 2;
                    if (this.f32793c.m39473s((b.C13267b) bVar, this) == m23655c) {
                        return m23655c;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2030o.m10349b(obj);
            }
            return C2037v.f8089a;
        }
    }

    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore$data$1", m27743f = "SingleProcessDataStore.kt", m27744l = {117}, m27745m = "invokeSuspend")
    /* renamed from: x0.m$g */
    /* loaded from: classes.dex */
    static final class g extends AbstractC9306l implements InterfaceC10002p<InterfaceC2040c<? super T>, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f32794a;

        /* renamed from: b */
        private /* synthetic */ Object f32795b;

        /* renamed from: c */
        final /* synthetic */ C12262m<T> f32796c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", m27743f = "SingleProcessDataStore.kt", m27744l = {}, m27745m = "invokeSuspend")
        /* renamed from: x0.m$g$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC9306l implements InterfaceC10002p<AbstractC12263n<T>, Continuation<? super Boolean>, Object> {

            /* renamed from: a */
            int f32797a;

            /* renamed from: b */
            /* synthetic */ Object f32798b;

            /* renamed from: c */
            final /* synthetic */ AbstractC12263n<T> f32799c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC12263n<T> abstractC12263n, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f32799c = abstractC12263n;
            }

            @Override // p280ok.InterfaceC10002p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC12263n<T> abstractC12263n, Continuation<? super Boolean> continuation) {
                return ((a) create(abstractC12263n, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f32799c, continuation);
                aVar.f32798b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                C7752d.m23655c();
                if (this.f32797a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2030o.m10349b(obj);
                AbstractC12263n<T> abstractC12263n = (AbstractC12263n) this.f32798b;
                AbstractC12263n<T> abstractC12263n2 = this.f32799c;
                boolean z10 = false;
                if (!(abstractC12263n2 instanceof C12252c) && !(abstractC12263n2 instanceof C12257h) && abstractC12263n == abstractC12263n2) {
                    z10 = true;
                }
                return C9296b.m27739a(z10);
            }
        }

        /* renamed from: x0.m$g$b */
        /* loaded from: classes.dex */
        public static final class b implements InterfaceC2039b<T> {

            /* renamed from: a */
            final /* synthetic */ InterfaceC2039b f32800a;

            /* renamed from: x0.m$g$b$a */
            /* loaded from: classes.dex */
            public static final class a implements InterfaceC2040c<AbstractC12263n<T>> {

                /* renamed from: a */
                final /* synthetic */ InterfaceC2040c f32801a;

                @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", m27743f = "SingleProcessDataStore.kt", m27744l = {137}, m27745m = "emit")
                /* renamed from: x0.m$g$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C13268a extends AbstractC9298d {

                    /* renamed from: a */
                    /* synthetic */ Object f32802a;

                    /* renamed from: b */
                    int f32803b;

                    public C13268a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
                    public final Object invokeSuspend(Object obj) {
                        this.f32802a = obj;
                        this.f32803b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC2040c interfaceC2040c) {
                    this.f32801a = interfaceC2040c;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // cl.InterfaceC2040c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object emit(java.lang.Object r5, p124gk.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p430x0.C12262m.g.b.a.C13268a
                        if (r0 == 0) goto L13
                        r0 = r6
                        x0.m$g$b$a$a r0 = (p430x0.C12262m.g.b.a.C13268a) r0
                        int r1 = r0.f32803b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32803b = r1
                        goto L18
                    L13:
                        x0.m$g$b$a$a r0 = new x0.m$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f32802a
                        java.lang.Object r1 = hk.C7750b.m23652c()
                        int r2 = r0.f32803b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        ck.C2030o.m10349b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        ck.C2030o.m10349b(r6)
                        cl.c r6 = r4.f32801a
                        x0.n r5 = (p430x0.AbstractC12263n) r5
                        boolean r2 = r5 instanceof p430x0.C12259j
                        if (r2 != 0) goto L73
                        boolean r2 = r5 instanceof p430x0.C12257h
                        if (r2 != 0) goto L6c
                        boolean r2 = r5 instanceof p430x0.C12252c
                        if (r2 == 0) goto L56
                        x0.c r5 = (p430x0.C12252c) r5
                        java.lang.Object r5 = r5.m39436b()
                        r0.f32803b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        ck.v r5 = ck.C2037v.f8089a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof p430x0.C12264o
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
                        x0.h r5 = (p430x0.C12257h) r5
                        java.lang.Throwable r5 = r5.m39447a()
                        throw r5
                    L73:
                        x0.j r5 = (p430x0.C12259j) r5
                        java.lang.Throwable r5 = r5.m39449a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p430x0.C12262m.g.b.a.emit(java.lang.Object, gk.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC2039b interfaceC2039b) {
                this.f32800a = interfaceC2039b;
            }

            @Override // cl.InterfaceC2039b
            /* renamed from: a */
            public Object mo10355a(InterfaceC2040c interfaceC2040c, Continuation continuation) {
                Object m23655c;
                Object mo10355a = this.f32800a.mo10355a(new a(interfaceC2040c), continuation);
                m23655c = C7752d.m23655c();
                return mo10355a == m23655c ? mo10355a : C2037v.f8089a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C12262m<T> c12262m, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f32796c = c12262m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f32796c, continuation);
            gVar.f32795b = obj;
            return gVar;
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC2040c<? super T> interfaceC2040c, Continuation<? super C2037v> continuation) {
            return ((g) create(interfaceC2040c, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            m23655c = C7752d.m23655c();
            int i10 = this.f32794a;
            if (i10 == 0) {
                C2030o.m10349b(obj);
                InterfaceC2040c interfaceC2040c = (InterfaceC2040c) this.f32795b;
                AbstractC12263n abstractC12263n = (AbstractC12263n) ((C12262m) this.f32796c).f32780h.getValue();
                if (!(abstractC12263n instanceof C12252c)) {
                    ((C12262m) this.f32796c).f32782j.m39454e(new b.a(abstractC12263n));
                }
                b bVar = new b(C2041d.m10359c(((C12262m) this.f32796c).f32780h, new a(abstractC12263n, null)));
                this.f32794a = 1;
                if (C2041d.m10360d(interfaceC2040c, bVar, this) == m23655c) {
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

    /* renamed from: x0.m$h */
    /* loaded from: classes.dex */
    static final class h extends AbstractC9323o implements InterfaceC9987a<File> {

        /* renamed from: a */
        final /* synthetic */ C12262m<T> f32805a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C12262m<T> c12262m) {
            super(0);
            this.f32805a = c12262m;
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) ((C12262m) this.f32805a).f32773a.invoke();
            String it = file.getAbsolutePath();
            a aVar = C12262m.f32770k;
            synchronized (aVar.m39482b()) {
                if (!(!aVar.m39481a().contains(it))) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set<String> m39481a = aVar.m39481a();
                C9322n.m27780d(it, "it");
                m39481a.add(it);
            }
            return file;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore", m27743f = "SingleProcessDataStore.kt", m27744l = {276, 281, 284}, m27745m = "handleUpdate")
    /* renamed from: x0.m$i */
    /* loaded from: classes.dex */
    public static final class i extends AbstractC9298d {

        /* renamed from: a */
        Object f32806a;

        /* renamed from: b */
        Object f32807b;

        /* renamed from: c */
        Object f32808c;

        /* renamed from: d */
        /* synthetic */ Object f32809d;

        /* renamed from: e */
        final /* synthetic */ C12262m<T> f32810e;

        /* renamed from: f */
        int f32811f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C12262m<T> c12262m, Continuation<? super i> continuation) {
            super(continuation);
            this.f32810e = c12262m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f32809d = obj;
            this.f32811f |= Integer.MIN_VALUE;
            return this.f32810e.m39473s(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore", m27743f = "SingleProcessDataStore.kt", m27744l = {322, 348, 505}, m27745m = "readAndInit")
    /* renamed from: x0.m$j */
    /* loaded from: classes.dex */
    public static final class j extends AbstractC9298d {

        /* renamed from: a */
        Object f32812a;

        /* renamed from: b */
        Object f32813b;

        /* renamed from: c */
        Object f32814c;

        /* renamed from: d */
        Object f32815d;

        /* renamed from: e */
        Object f32816e;

        /* renamed from: f */
        Object f32817f;

        /* renamed from: r */
        /* synthetic */ Object f32818r;

        /* renamed from: s */
        final /* synthetic */ C12262m<T> f32819s;

        /* renamed from: t */
        int f32820t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C12262m<T> c12262m, Continuation<? super j> continuation) {
            super(continuation);
            this.f32819s = c12262m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f32818r = obj;
            this.f32820t |= Integer.MIN_VALUE;
            return this.f32819s.m39474t(this);
        }
    }

    /* renamed from: x0.m$k */
    /* loaded from: classes.dex */
    public static final class k implements InterfaceC12258i<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8008a f32821a;

        /* renamed from: b */
        final /* synthetic */ C9330v f32822b;

        /* renamed from: c */
        final /* synthetic */ C9332x<T> f32823c;

        /* renamed from: d */
        final /* synthetic */ C12262m<T> f32824d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", m27743f = "SingleProcessDataStore.kt", m27744l = {503, 337, 339}, m27745m = "updateData")
        /* renamed from: x0.m$k$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC9298d {

            /* renamed from: a */
            Object f32825a;

            /* renamed from: b */
            Object f32826b;

            /* renamed from: c */
            Object f32827c;

            /* renamed from: d */
            Object f32828d;

            /* renamed from: e */
            Object f32829e;

            /* renamed from: f */
            /* synthetic */ Object f32830f;

            /* renamed from: s */
            int f32832s;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                this.f32830f = obj;
                this.f32832s |= Integer.MIN_VALUE;
                return k.this.mo39448a(null, this);
            }
        }

        k(InterfaceC8008a interfaceC8008a, C9330v c9330v, C9332x<T> c9332x, C12262m<T> c12262m) {
            this.f32821a = interfaceC8008a;
            this.f32822b = c9330v;
            this.f32823c = c9332x;
            this.f32824d = c12262m;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00d7, B:47:0x00de), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #2 {all -> 0x00df, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00d7, B:47:0x00de), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // p430x0.InterfaceC12258i
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo39448a(p280ok.InterfaceC10002p<? super T, ? super p124gk.Continuation<? super T>, ? extends java.lang.Object> r11, p124gk.Continuation<? super T> r12) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p430x0.C12262m.k.mo39448a(ok.p, gk.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore", m27743f = "SingleProcessDataStore.kt", m27744l = {302}, m27745m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: x0.m$l */
    /* loaded from: classes.dex */
    public static final class l extends AbstractC9298d {

        /* renamed from: a */
        Object f32833a;

        /* renamed from: b */
        /* synthetic */ Object f32834b;

        /* renamed from: c */
        final /* synthetic */ C12262m<T> f32835c;

        /* renamed from: d */
        int f32836d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C12262m<T> c12262m, Continuation<? super l> continuation) {
            super(continuation);
            this.f32835c = c12262m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f32834b = obj;
            this.f32836d |= Integer.MIN_VALUE;
            return this.f32835c.m39475u(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore", m27743f = "SingleProcessDataStore.kt", m27744l = {311}, m27745m = "readAndInitOrPropagateFailure")
    /* renamed from: x0.m$m */
    /* loaded from: classes.dex */
    public static final class m extends AbstractC9298d {

        /* renamed from: a */
        Object f32837a;

        /* renamed from: b */
        /* synthetic */ Object f32838b;

        /* renamed from: c */
        final /* synthetic */ C12262m<T> f32839c;

        /* renamed from: d */
        int f32840d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(C12262m<T> c12262m, Continuation<? super m> continuation) {
            super(continuation);
            this.f32839c = c12262m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f32838b = obj;
            this.f32840d |= Integer.MIN_VALUE;
            return this.f32839c.m39476v(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore", m27743f = "SingleProcessDataStore.kt", m27744l = {381}, m27745m = "readData")
    /* renamed from: x0.m$n */
    /* loaded from: classes.dex */
    public static final class n extends AbstractC9298d {

        /* renamed from: a */
        Object f32841a;

        /* renamed from: b */
        Object f32842b;

        /* renamed from: c */
        Object f32843c;

        /* renamed from: d */
        /* synthetic */ Object f32844d;

        /* renamed from: e */
        final /* synthetic */ C12262m<T> f32845e;

        /* renamed from: f */
        int f32846f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C12262m<T> c12262m, Continuation<? super n> continuation) {
            super(continuation);
            this.f32845e = c12262m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f32844d = obj;
            this.f32846f |= Integer.MIN_VALUE;
            return this.f32845e.m39477w(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore", m27743f = "SingleProcessDataStore.kt", m27744l = {359, 362, 365}, m27745m = "readDataOrHandleCorruption")
    /* renamed from: x0.m$o */
    /* loaded from: classes.dex */
    public static final class o extends AbstractC9298d {

        /* renamed from: a */
        Object f32847a;

        /* renamed from: b */
        Object f32848b;

        /* renamed from: c */
        /* synthetic */ Object f32849c;

        /* renamed from: d */
        final /* synthetic */ C12262m<T> f32850d;

        /* renamed from: e */
        int f32851e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(C12262m<T> c12262m, Continuation<? super o> continuation) {
            super(continuation);
            this.f32850d = c12262m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f32849c = obj;
            this.f32851e |= Integer.MIN_VALUE;
            return this.f32850d.m39478x(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore", m27743f = "SingleProcessDataStore.kt", m27744l = {402, 410}, m27745m = "transformAndWrite")
    /* renamed from: x0.m$p */
    /* loaded from: classes.dex */
    public static final class p extends AbstractC9298d {

        /* renamed from: a */
        Object f32852a;

        /* renamed from: b */
        Object f32853b;

        /* renamed from: c */
        Object f32854c;

        /* renamed from: d */
        /* synthetic */ Object f32855d;

        /* renamed from: e */
        final /* synthetic */ C12262m<T> f32856e;

        /* renamed from: f */
        int f32857f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(C12262m<T> c12262m, Continuation<? super p> continuation) {
            super(continuation);
            this.f32856e = c12262m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f32855d = obj;
            this.f32857f |= Integer.MIN_VALUE;
            return this.f32856e.m39479y(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", m27743f = "SingleProcessDataStore.kt", m27744l = {402}, m27745m = "invokeSuspend")
    /* renamed from: x0.m$q */
    /* loaded from: classes.dex */
    public static final class q extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super T>, Object> {

        /* renamed from: a */
        int f32858a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC10002p<T, Continuation<? super T>, Object> f32859b;

        /* renamed from: c */
        final /* synthetic */ T f32860c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(InterfaceC10002p<? super T, ? super Continuation<? super T>, ? extends Object> interfaceC10002p, T t10, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f32859b = interfaceC10002p;
            this.f32860c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            return new q(this.f32859b, this.f32860c, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super T> continuation) {
            return ((q) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            m23655c = C7752d.m23655c();
            int i10 = this.f32858a;
            if (i10 == 0) {
                C2030o.m10349b(obj);
                InterfaceC10002p<T, Continuation<? super T>, Object> interfaceC10002p = this.f32859b;
                T t10 = this.f32860c;
                this.f32858a = 1;
                obj = interfaceC10002p.invoke(t10, this);
                if (obj == m23655c) {
                    return m23655c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2030o.m10349b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "androidx.datastore.core.SingleProcessDataStore", m27743f = "SingleProcessDataStore.kt", m27744l = {426}, m27745m = "writeData$datastore_core")
    /* renamed from: x0.m$r */
    /* loaded from: classes.dex */
    public static final class r extends AbstractC9298d {

        /* renamed from: a */
        Object f32861a;

        /* renamed from: b */
        Object f32862b;

        /* renamed from: c */
        Object f32863c;

        /* renamed from: d */
        Object f32864d;

        /* renamed from: e */
        Object f32865e;

        /* renamed from: f */
        /* synthetic */ Object f32866f;

        /* renamed from: r */
        final /* synthetic */ C12262m<T> f32867r;

        /* renamed from: s */
        int f32868s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(C12262m<T> c12262m, Continuation<? super r> continuation) {
            super(continuation);
            this.f32867r = c12262m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f32866f = obj;
            this.f32868s |= Integer.MIN_VALUE;
            return this.f32867r.m39480z(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12262m(InterfaceC9987a<? extends File> produceFile, InterfaceC12260k<T> serializer, List<? extends InterfaceC10002p<? super InterfaceC12258i<T>, ? super Continuation<? super C2037v>, ? extends Object>> initTasksList, InterfaceC12251b<T> corruptionHandler, InterfaceC13076k0 scope) {
        InterfaceC2023h m10334a;
        List<? extends InterfaceC10002p<? super InterfaceC12258i<T>, ? super Continuation<? super C2037v>, ? extends Object>> m20630f0;
        C9322n.m27781e(produceFile, "produceFile");
        C9322n.m27781e(serializer, "serializer");
        C9322n.m27781e(initTasksList, "initTasksList");
        C9322n.m27781e(corruptionHandler, "corruptionHandler");
        C9322n.m27781e(scope, "scope");
        this.f32773a = produceFile;
        this.f32774b = serializer;
        this.f32775c = corruptionHandler;
        this.f32776d = scope;
        this.f32777e = C2041d.m10363g(new g(this, null));
        this.f32778f = ".tmp";
        m10334a = C2025j.m10334a(new h(this));
        this.f32779g = m10334a;
        this.f32780h = C2051n.m10378a(C12264o.f32869a);
        m20630f0 = C7042z.m20630f0(initTasksList);
        this.f32781i = m20630f0;
        this.f32782j = new C12261l<>(scope, new d(this), e.f32790a, new f(this, null));
    }

    /* renamed from: p */
    private final void m39470p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(C9322n.m27787k("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final File m39471q() {
        return (File) this.f32779g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final Object m39472r(b.a<T> aVar, Continuation<? super C2037v> continuation) {
        Object m23655c;
        Object m23655c2;
        AbstractC12263n<T> value = this.f32780h.getValue();
        if (!(value instanceof C12252c)) {
            if (value instanceof C12259j) {
                if (value == aVar.m39483a()) {
                    Object m39476v = m39476v(continuation);
                    m23655c2 = C7752d.m23655c();
                    return m39476v == m23655c2 ? m39476v : C2037v.f8089a;
                }
            } else {
                if (C9322n.m27777a(value, C12264o.f32869a)) {
                    Object m39476v2 = m39476v(continuation);
                    m23655c = C7752d.m23655c();
                    return m39476v2 == m23655c ? m39476v2 : C2037v.f8089a;
                }
                if (value instanceof C12257h) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return C2037v.f8089a;
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
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m39473s(p430x0.C12262m.b.C13267b<T> r9, p124gk.Continuation<? super ck.C2037v> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p430x0.C12262m.m39473s(x0.m$b$b, gk.Continuation):java.lang.Object");
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
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m39474t(p124gk.Continuation<? super ck.C2037v> r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p430x0.C12262m.m39474t(gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m39475u(p124gk.Continuation<? super ck.C2037v> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p430x0.C12262m.l
            if (r0 == 0) goto L13
            r0 = r5
            x0.m$l r0 = (p430x0.C12262m.l) r0
            int r1 = r0.f32836d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32836d = r1
            goto L18
        L13:
            x0.m$l r0 = new x0.m$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f32834b
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f32836d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f32833a
            x0.m r0 = (p430x0.C12262m) r0
            ck.C2030o.m10349b(r5)     // Catch: java.lang.Throwable -> L2d
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
            ck.C2030o.m10349b(r5)
            r0.f32833a = r4     // Catch: java.lang.Throwable -> L48
            r0.f32836d = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.m39474t(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            ck.v r5 = ck.C2037v.f8089a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            cl.k<x0.n<T>> r0 = r0.f32780h
            x0.j r1 = new x0.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p430x0.C12262m.m39475u(gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m39476v(p124gk.Continuation<? super ck.C2037v> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p430x0.C12262m.m
            if (r0 == 0) goto L13
            r0 = r5
            x0.m$m r0 = (p430x0.C12262m.m) r0
            int r1 = r0.f32840d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32840d = r1
            goto L18
        L13:
            x0.m$m r0 = new x0.m$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f32838b
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f32840d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f32837a
            x0.m r0 = (p430x0.C12262m) r0
            ck.C2030o.m10349b(r5)     // Catch: java.lang.Throwable -> L2d
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
            ck.C2030o.m10349b(r5)
            r0.f32837a = r4     // Catch: java.lang.Throwable -> L45
            r0.f32840d = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.m39474t(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            cl.k<x0.n<T>> r0 = r0.f32780h
            x0.j r1 = new x0.j
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            ck.v r5 = ck.C2037v.f8089a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p430x0.C12262m.m39476v(gk.Continuation):java.lang.Object");
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
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m39477w(p124gk.Continuation<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p430x0.C12262m.n
            if (r0 == 0) goto L13
            r0 = r6
            x0.m$n r0 = (p430x0.C12262m.n) r0
            int r1 = r0.f32846f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32846f = r1
            goto L18
        L13:
            x0.m$n r0 = new x0.m$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f32844d
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f32846f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f32843c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f32842b
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f32841a
            x0.m r0 = (p430x0.C12262m) r0
            ck.C2030o.m10349b(r6)     // Catch: java.lang.Throwable -> L35
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
            ck.C2030o.m10349b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.m39471q()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            x0.k<T> r6 = r5.f32774b     // Catch: java.lang.Throwable -> L65
            r0.f32841a = r5     // Catch: java.lang.Throwable -> L65
            r0.f32842b = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.f32843c = r4     // Catch: java.lang.Throwable -> L65
            r0.f32846f = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.mo69a(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            mk.C9602b.m28593a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
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
            mk.C9602b.m28593a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.m39471q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            x0.k<T> r6 = r0.f32774b
            java.lang.Object r6 = r6.mo70b()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p430x0.C12262m.m39477w(gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m39478x(p124gk.Continuation<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p430x0.C12262m.o
            if (r0 == 0) goto L13
            r0 = r8
            x0.m$o r0 = (p430x0.C12262m.o) r0
            int r1 = r0.f32851e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32851e = r1
            goto L18
        L13:
            x0.m$o r0 = new x0.m$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f32849c
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f32851e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f32848b
            java.lang.Object r0 = r0.f32847a
            x0.a r0 = (p430x0.C12250a) r0
            ck.C2030o.m10349b(r8)     // Catch: java.io.IOException -> L35
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
            java.lang.Object r2 = r0.f32848b
            x0.a r2 = (p430x0.C12250a) r2
            java.lang.Object r4 = r0.f32847a
            x0.m r4 = (p430x0.C12262m) r4
            ck.C2030o.m10349b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f32847a
            x0.m r2 = (p430x0.C12262m) r2
            ck.C2030o.m10349b(r8)     // Catch: p430x0.C12250a -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            ck.C2030o.m10349b(r8)
            r0.f32847a = r7     // Catch: p430x0.C12250a -> L64
            r0.f32851e = r5     // Catch: p430x0.C12250a -> L64
            java.lang.Object r8 = r7.m39477w(r0)     // Catch: p430x0.C12250a -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            x0.b<T> r5 = r2.f32775c
            r0.f32847a = r2
            r0.f32848b = r8
            r0.f32851e = r4
            java.lang.Object r4 = r5.mo39434a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f32847a = r2     // Catch: java.io.IOException -> L88
            r0.f32848b = r8     // Catch: java.io.IOException -> L88
            r0.f32851e = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.m39480z(r8, r0)     // Catch: java.io.IOException -> L88
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
            ck.C2016a.m10326a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p430x0.C12262m.m39478x(gk.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m39479y(p280ok.InterfaceC10002p<? super T, ? super p124gk.Continuation<? super T>, ? extends java.lang.Object> r8, p124gk.InterfaceC7587f r9, p124gk.Continuation<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p430x0.C12262m.p
            if (r0 == 0) goto L13
            r0 = r10
            x0.m$p r0 = (p430x0.C12262m.p) r0
            int r1 = r0.f32857f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32857f = r1
            goto L18
        L13:
            x0.m$p r0 = new x0.m$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f32855d
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f32857f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f32853b
            java.lang.Object r9 = r0.f32852a
            x0.m r9 = (p430x0.C12262m) r9
            ck.C2030o.m10349b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f32854c
            java.lang.Object r9 = r0.f32853b
            x0.c r9 = (p430x0.C12252c) r9
            java.lang.Object r2 = r0.f32852a
            x0.m r2 = (p430x0.C12262m) r2
            ck.C2030o.m10349b(r10)
            goto L73
        L49:
            ck.C2030o.m10349b(r10)
            cl.k<x0.n<T>> r10 = r7.f32780h
            java.lang.Object r10 = r10.getValue()
            x0.c r10 = (p430x0.C12252c) r10
            r10.m39435a()
            java.lang.Object r2 = r10.m39436b()
            x0.m$q r6 = new x0.m$q
            r6.<init>(r8, r2, r3)
            r0.f32852a = r7
            r0.f32853b = r10
            r0.f32854c = r2
            r0.f32857f = r5
            java.lang.Object r8 = p494zk.C13063h.m43191g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.m39435a()
            boolean r9 = kotlin.jvm.internal.C9322n.m27777a(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f32852a = r2
            r0.f32853b = r10
            r0.f32854c = r3
            r0.f32857f = r4
            java.lang.Object r8 = r2.m39480z(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            cl.k<x0.n<T>> r9 = r9.f32780h
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
        throw new UnsupportedOperationException("Method not decompiled: p430x0.C12262m.m39479y(ok.p, gk.f, gk.Continuation):java.lang.Object");
    }

    @Override // p430x0.InterfaceC12255f
    /* renamed from: a */
    public Object mo47a(InterfaceC10002p<? super T, ? super Continuation<? super T>, ? extends Object> interfaceC10002p, Continuation<? super T> continuation) {
        InterfaceC13119v m43319b = C13127x.m43319b(null, 1, null);
        this.f32782j.m39454e(new b.C13267b(interfaceC10002p, m43319b, this.f32780h.getValue(), continuation.getContext()));
        return m43319b.mo43292i0(continuation);
    }

    @Override // p430x0.InterfaceC12255f
    public InterfaceC2039b<T> getData() {
        return this.f32777e;
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
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m39480z(T r8, p124gk.Continuation<? super ck.C2037v> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p430x0.C12262m.r
            if (r0 == 0) goto L13
            r0 = r9
            x0.m$r r0 = (p430x0.C12262m.r) r0
            int r1 = r0.f32868s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32868s = r1
            goto L18
        L13:
            x0.m$r r0 = new x0.m$r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f32866f
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f32868s
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f32865e
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f32864d
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f32863c
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f32862b
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f32861a
            x0.m r0 = (p430x0.C12262m) r0
            ck.C2030o.m10349b(r9)     // Catch: java.lang.Throwable -> L3d
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
            ck.C2030o.m10349b(r9)
            java.io.File r9 = r7.m39471q()
            r7.m39470p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.m39471q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f32778f
            java.lang.String r2 = kotlin.jvm.internal.C9322n.m27787k(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc9
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc9
            x0.k<T> r4 = r7.f32774b     // Catch: java.lang.Throwable -> Lbe
            x0.m$c r5 = new x0.m$c     // Catch: java.lang.Throwable -> Lbe
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lbe
            r0.f32861a = r7     // Catch: java.lang.Throwable -> Lbe
            r0.f32862b = r9     // Catch: java.lang.Throwable -> Lbe
            r0.f32863c = r2     // Catch: java.lang.Throwable -> Lbe
            r6 = 0
            r0.f32864d = r6     // Catch: java.lang.Throwable -> Lbe
            r0.f32865e = r2     // Catch: java.lang.Throwable -> Lbe
            r0.f32868s = r3     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r8 = r4.mo71c(r8, r5, r0)     // Catch: java.lang.Throwable -> Lbe
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
            ck.v r8 = ck.C2037v.f8089a     // Catch: java.lang.Throwable -> L3d
            mk.C9602b.m28593a(r2, r1)     // Catch: java.io.IOException -> Lc6
            java.io.File r8 = r0.m39471q()     // Catch: java.io.IOException -> Lc6
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lc6
            if (r8 == 0) goto La2
            ck.v r8 = ck.C2037v.f8089a
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
            mk.C9602b.m28593a(r2, r8)     // Catch: java.io.IOException -> Lc6
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
        throw new UnsupportedOperationException("Method not decompiled: p430x0.C12262m.m39480z(java.lang.Object, gk.Continuation):java.lang.Object");
    }
}
