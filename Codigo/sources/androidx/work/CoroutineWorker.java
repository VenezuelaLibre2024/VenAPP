package androidx.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.c;
import ck.o;
import ck.v;
import f2.e;
import f2.i;
import gk.Continuation;
import hk.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import ok.p;
import zk.a1;
import zk.b2;
import zk.h0;
import zk.j;
import zk.k0;
import zk.l0;
import zk.w1;
import zk.y;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends c {

    /* renamed from: e, reason: collision with root package name */
    private final y f5654e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<c.a> f5655f;

    /* renamed from: r, reason: collision with root package name */
    private final h0 f5656r;

    @f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends l implements p<k0, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f5657a;

        /* renamed from: b, reason: collision with root package name */
        int f5658b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i<e> f5659c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f5660d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<e> iVar, CoroutineWorker coroutineWorker, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5659c = iVar;
            this.f5660d = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            return new a(this.f5659c, this.f5660d, continuation);
        }

        @Override // ok.p
        public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            i iVar;
            c10 = d.c();
            int i10 = this.f5658b;
            if (i10 == 0) {
                o.b(obj);
                i<e> iVar2 = this.f5659c;
                CoroutineWorker coroutineWorker = this.f5660d;
                this.f5657a = iVar2;
                this.f5658b = 1;
                Object i11 = coroutineWorker.i(this);
                if (i11 == c10) {
                    return c10;
                }
                iVar = iVar2;
                obj = i11;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (i) this.f5657a;
                o.b(obj);
            }
            iVar.b(obj);
            return v.f7137a;
        }
    }

    @f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends l implements p<k0, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f5661a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // ok.p
        public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = d.c();
            int i10 = this.f5661a;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f5661a = 1;
                    obj = coroutineWorker.g(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                CoroutineWorker.this.k().o((c.a) obj);
            } catch (Throwable th2) {
                CoroutineWorker.this.k().p(th2);
            }
            return v.f7137a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        y b10;
        n.e(appContext, "appContext");
        n.e(params, "params");
        b10 = b2.b(null, 1, null);
        this.f5654e = b10;
        androidx.work.impl.utils.futures.c<c.a> s10 = androidx.work.impl.utils.futures.c.s();
        n.d(s10, "create()");
        this.f5655f = s10;
        s10.addListener(new Runnable() { // from class: f2.c
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker.e(CoroutineWorker.this);
            }
        }, getTaskExecutor().b());
        this.f5656r = a1.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CoroutineWorker this$0) {
        n.e(this$0, "this$0");
        if (this$0.f5655f.isCancelled()) {
            w1.a.a(this$0.f5654e, null, 1, null);
        }
    }

    static /* synthetic */ Object j(CoroutineWorker coroutineWorker, Continuation<? super e> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object g(Continuation<? super c.a> continuation);

    @Override // androidx.work.c
    public final com.google.common.util.concurrent.f<e> getForegroundInfoAsync() {
        y b10;
        b10 = b2.b(null, 1, null);
        k0 a10 = l0.a(h().U(b10));
        i iVar = new i(b10, null, 2, null);
        j.d(a10, null, null, new a(iVar, this, null), 3, null);
        return iVar;
    }

    public h0 h() {
        return this.f5656r;
    }

    public Object i(Continuation<? super e> continuation) {
        return j(this, continuation);
    }

    public final androidx.work.impl.utils.futures.c<c.a> k() {
        return this.f5655f;
    }

    @Override // androidx.work.c
    public final void onStopped() {
        super.onStopped();
        this.f5655f.cancel(false);
    }

    @Override // androidx.work.c
    public final com.google.common.util.concurrent.f<c.a> startWork() {
        j.d(l0.a(h().U(this.f5654e)), null, null, new b(null), 3, null);
        return this.f5655f;
    }
}
