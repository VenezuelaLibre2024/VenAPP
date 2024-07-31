package dl;

import ck.v;
import gk.Continuation;
import gk.f;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.p;
import ok.q;
import zk.a2;

/* loaded from: classes3.dex */
public final class i<T> extends kotlin.coroutines.jvm.internal.d implements cl.c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final cl.c<T> f14258a;

    /* renamed from: b, reason: collision with root package name */
    public final gk.f f14259b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14260c;

    /* renamed from: d, reason: collision with root package name */
    private gk.f f14261d;

    /* renamed from: e, reason: collision with root package name */
    private Continuation<? super v> f14262e;

    /* loaded from: classes3.dex */
    static final class a extends o implements p<Integer, f.b, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14263a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i10, f.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, f.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(cl.c<? super T> cVar, gk.f fVar) {
        super(g.f14253a, gk.g.f16294a);
        this.f14258a = cVar;
        this.f14259b = fVar;
        this.f14260c = ((Number) fVar.z0(0, a.f14263a)).intValue();
    }

    private final void a(gk.f fVar, gk.f fVar2, T t10) {
        if (fVar2 instanceof e) {
            g((e) fVar2, t10);
        }
        k.a(this, fVar);
    }

    private final Object f(Continuation<? super v> continuation, T t10) {
        q qVar;
        Object c10;
        gk.f context = continuation.getContext();
        a2.h(context);
        gk.f fVar = this.f14261d;
        if (fVar != context) {
            a(context, fVar, t10);
            this.f14261d = context;
        }
        this.f14262e = continuation;
        qVar = j.f14264a;
        cl.c<T> cVar = this.f14258a;
        n.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        n.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object m10 = qVar.m(cVar, t10, this);
        c10 = hk.d.c();
        if (!n.a(m10, c10)) {
            this.f14262e = null;
        }
        return m10;
    }

    private final void g(e eVar, Object obj) {
        String f10;
        f10 = xk.i.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + eVar.f14251a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(f10.toString());
    }

    @Override // cl.c
    public Object emit(T t10, Continuation<? super v> continuation) {
        Object c10;
        Object c11;
        try {
            Object f10 = f(continuation, t10);
            c10 = hk.d.c();
            if (f10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            c11 = hk.d.c();
            return f10 == c11 ? f10 : v.f7137a;
        } catch (Throwable th2) {
            this.f14261d = new e(th2, continuation.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Continuation<? super v> continuation = this.f14262e;
        if (continuation instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, gk.Continuation
    public gk.f getContext() {
        gk.f fVar = this.f14261d;
        return fVar == null ? gk.g.f16294a : fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Object c10;
        Throwable d10 = ck.n.d(obj);
        if (d10 != null) {
            this.f14261d = new e(d10, getContext());
        }
        Continuation<? super v> continuation = this.f14262e;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        c10 = hk.d.c();
        return c10;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
