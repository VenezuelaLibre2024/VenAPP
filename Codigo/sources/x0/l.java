package x0;

import bl.g;
import ck.v;
import com.google.android.gms.common.api.a;
import gk.Continuation;
import java.util.concurrent.atomic.AtomicInteger;
import ok.p;
import zk.k0;
import zk.w1;

/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: a, reason: collision with root package name */
    private final k0 f30248a;

    /* renamed from: b, reason: collision with root package name */
    private final p<T, Continuation<? super v>, Object> f30249b;

    /* renamed from: c, reason: collision with root package name */
    private final bl.d<T> f30250c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f30251d;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.o implements ok.l<Throwable, v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ok.l<Throwable, v> f30252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<T> f30253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<T, Throwable, v> f30254c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ok.l<? super Throwable, v> lVar, l<T> lVar2, p<? super T, ? super Throwable, v> pVar) {
            super(1);
            this.f30252a = lVar;
            this.f30253b = lVar2;
            this.f30254c = pVar;
        }

        public final void a(Throwable th2) {
            v vVar;
            this.f30252a.invoke(th2);
            ((l) this.f30253b).f30250c.d(th2);
            do {
                Object f10 = bl.g.f(((l) this.f30253b).f30250c.c());
                if (f10 == null) {
                    vVar = null;
                } else {
                    this.f30254c.invoke(f10, th2);
                    vVar = v.f7137a;
                }
            } while (vVar != null);
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
            a(th2);
            return v.f7137a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f30255a;

        /* renamed from: b, reason: collision with root package name */
        int f30256b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<T> f30257c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<T> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f30257c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            return new b(this.f30257c, continuation);
        }

        @Override // ok.p
        public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(v.f7137a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:6:0x006e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = hk.b.c()
                int r1 = r7.f30256b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                ck.o.b(r8)
                r8 = r7
                goto L6e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f30255a
                ok.p r1 = (ok.p) r1
                ck.o.b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L60
            L26:
                ck.o.b(r8)
                x0.l<T> r8 = r7.f30257c
                java.util.concurrent.atomic.AtomicInteger r8 = x0.l.c(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L37
                r8 = r3
                goto L38
            L37:
                r8 = 0
            L38:
                if (r8 == 0) goto L7d
                r8 = r7
            L3b:
                x0.l<T> r1 = r8.f30257c
                zk.k0 r1 = x0.l.d(r1)
                zk.l0.f(r1)
                x0.l<T> r1 = r8.f30257c
                ok.p r1 = x0.l.a(r1)
                x0.l<T> r4 = r8.f30257c
                bl.d r4 = x0.l.b(r4)
                r8.f30255a = r1
                r8.f30256b = r3
                java.lang.Object r4 = r4.b(r8)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L60:
                r5 = 0
                r0.f30255a = r5
                r0.f30256b = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L6c
                return r1
            L6c:
                r8 = r0
                r0 = r1
            L6e:
                x0.l<T> r1 = r8.f30257c
                java.util.concurrent.atomic.AtomicInteger r1 = x0.l.c(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L3b
                ck.v r8 = ck.v.f7137a
                return r8
            L7d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(k0 scope, ok.l<? super Throwable, v> onComplete, p<? super T, ? super Throwable, v> onUndeliveredElement, p<? super T, ? super Continuation<? super v>, ? extends Object> consumeMessage) {
        kotlin.jvm.internal.n.e(scope, "scope");
        kotlin.jvm.internal.n.e(onComplete, "onComplete");
        kotlin.jvm.internal.n.e(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.n.e(consumeMessage, "consumeMessage");
        this.f30248a = scope;
        this.f30249b = consumeMessage;
        this.f30250c = bl.f.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this.f30251d = new AtomicInteger(0);
        w1 w1Var = (w1) scope.h().b(w1.f32940q);
        if (w1Var == null) {
            return;
        }
        w1Var.R(new a(onComplete, this, onUndeliveredElement));
    }

    public final void e(T t10) {
        Object a10 = this.f30250c.a(t10);
        if (a10 instanceof g.a) {
            Throwable e10 = bl.g.e(a10);
            if (e10 != null) {
                throw e10;
            }
            throw new bl.k("Channel was closed normally");
        }
        if (!bl.g.i(a10)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f30251d.getAndIncrement() == 0) {
            zk.j.d(this.f30248a, null, null, new b(this, null), 3, null);
        }
    }
}
