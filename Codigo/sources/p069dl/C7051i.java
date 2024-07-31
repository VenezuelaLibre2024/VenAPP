package p069dl;

import ck.C2029n;
import ck.C2037v;
import cl.InterfaceC2040c;
import hk.C7752d;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.coroutines.jvm.internal.InterfaceC9299e;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p124gk.C7588g;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC10003q;
import p450xk.C12517i;
import p494zk.C13035a2;

/* renamed from: dl.i */
/* loaded from: classes3.dex */
public final class C7051i<T> extends AbstractC9298d implements InterfaceC2040c<T> {

    /* renamed from: a */
    public final InterfaceC2040c<T> f15616a;

    /* renamed from: b */
    public final InterfaceC7587f f15617b;

    /* renamed from: c */
    public final int f15618c;

    /* renamed from: d */
    private InterfaceC7587f f15619d;

    /* renamed from: e */
    private Continuation<? super C2037v> f15620e;

    /* renamed from: dl.i$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9323o implements InterfaceC10002p<Integer, InterfaceC7587f.b, Integer> {

        /* renamed from: a */
        public static final a f15621a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m20653a(int i10, InterfaceC7587f.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, InterfaceC7587f.b bVar) {
            return m20653a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7051i(InterfaceC2040c<? super T> interfaceC2040c, InterfaceC7587f interfaceC7587f) {
        super(C7049g.f15611a, C7588g.f17931a);
        this.f15616a = interfaceC2040c;
        this.f15617b = interfaceC7587f;
        this.f15618c = ((Number) interfaceC7587f.mo20648z0(0, a.f15621a)).intValue();
    }

    /* renamed from: a */
    private final void m20650a(InterfaceC7587f interfaceC7587f, InterfaceC7587f interfaceC7587f2, T t10) {
        if (interfaceC7587f2 instanceof C7047e) {
            m20652g((C7047e) interfaceC7587f2, t10);
        }
        C7053k.m20656a(this, interfaceC7587f);
    }

    /* renamed from: f */
    private final Object m20651f(Continuation<? super C2037v> continuation, T t10) {
        InterfaceC10003q interfaceC10003q;
        Object m23655c;
        InterfaceC7587f context = continuation.getContext();
        C13035a2.m43049h(context);
        InterfaceC7587f interfaceC7587f = this.f15619d;
        if (interfaceC7587f != context) {
            m20650a(context, interfaceC7587f, t10);
            this.f15619d = context;
        }
        this.f15620e = continuation;
        interfaceC10003q = C7052j.f15622a;
        InterfaceC2040c<T> interfaceC2040c = this.f15616a;
        C9322n.m27779c(interfaceC2040c, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        C9322n.m27779c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object mo9756m = interfaceC10003q.mo9756m(interfaceC2040c, t10, this);
        m23655c = C7752d.m23655c();
        if (!C9322n.m27777a(mo9756m, m23655c)) {
            this.f15620e = null;
        }
        return mo9756m;
    }

    /* renamed from: g */
    private final void m20652g(C7047e c7047e, Object obj) {
        String m41018f;
        m41018f = C12517i.m41018f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c7047e.f15609a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(m41018f.toString());
    }

    @Override // cl.InterfaceC2040c
    public Object emit(T t10, Continuation<? super C2037v> continuation) {
        Object m23655c;
        Object m23655c2;
        try {
            Object m20651f = m20651f(continuation, t10);
            m23655c = C7752d.m23655c();
            if (m20651f == m23655c) {
                C9302h.m27753c(continuation);
            }
            m23655c2 = C7752d.m23655c();
            return m20651f == m23655c2 ? m20651f : C2037v.f8089a;
        } catch (Throwable th2) {
            this.f15619d = new C7047e(th2, continuation.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9295a, kotlin.coroutines.jvm.internal.InterfaceC9299e
    public InterfaceC9299e getCallerFrame() {
        Continuation<? super C2037v> continuation = this.f15620e;
        if (continuation instanceof InterfaceC9299e) {
            return (InterfaceC9299e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9298d, p124gk.Continuation
    public InterfaceC7587f getContext() {
        InterfaceC7587f interfaceC7587f = this.f15619d;
        return interfaceC7587f == null ? C7588g.f17931a : interfaceC7587f;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
    public Object invokeSuspend(Object obj) {
        Object m23655c;
        Throwable m10342d = C2029n.m10342d(obj);
        if (m10342d != null) {
            this.f15619d = new C7047e(m10342d, getContext());
        }
        Continuation<? super C2037v> continuation = this.f15620e;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        m23655c = C7752d.m23655c();
        return m23655c;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9298d, kotlin.coroutines.jvm.internal.AbstractC9295a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
