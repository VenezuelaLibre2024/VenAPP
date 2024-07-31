package zk;

import gk.Continuation;
import gk.d;
import gk.f;

/* loaded from: classes3.dex */
public abstract class h0 extends gk.a implements gk.d {

    /* renamed from: b */
    public static final a f32893b = new a(null);

    /* loaded from: classes3.dex */
    public static final class a extends gk.b<gk.d, h0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zk.h0$a$a */
        /* loaded from: classes3.dex */
        public static final class C0545a extends kotlin.jvm.internal.o implements ok.l<f.b, h0> {

            /* renamed from: a */
            public static final C0545a f32894a = new C0545a();

            C0545a() {
                super(1);
            }

            @Override // ok.l
            /* renamed from: a */
            public final h0 invoke(f.b bVar) {
                if (bVar instanceof h0) {
                    return (h0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(gk.d.f16291n, C0545a.f32894a);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public h0() {
        super(gk.d.f16291n);
    }

    public abstract void D0(gk.f fVar, Runnable runnable);

    @Override // gk.d
    public final <T> Continuation<T> E(Continuation<? super T> continuation) {
        return new el.j(this, continuation);
    }

    public boolean F0(gk.f fVar) {
        return true;
    }

    public h0 H0(int i10) {
        el.p.a(i10);
        return new el.o(this, i10);
    }

    @Override // gk.a, gk.f
    public gk.f Q(f.c<?> cVar) {
        return d.a.b(this, cVar);
    }

    @Override // gk.a, gk.f.b, gk.f
    public <E extends f.b> E b(f.c<E> cVar) {
        return (E) d.a.a(this, cVar);
    }

    @Override // gk.d
    public final void h0(Continuation<?> continuation) {
        kotlin.jvm.internal.n.c(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((el.j) continuation).r();
    }

    public String toString() {
        return o0.a(this) + '@' + o0.b(this);
    }
}
