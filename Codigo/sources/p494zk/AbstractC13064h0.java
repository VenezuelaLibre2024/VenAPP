package p494zk;

import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p089el.C7226j;
import p089el.C7236o;
import p089el.C7238p;
import p124gk.AbstractC7582a;
import p124gk.AbstractC7583b;
import p124gk.Continuation;
import p124gk.InterfaceC7585d;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC9998l;

/* renamed from: zk.h0 */
/* loaded from: classes3.dex */
public abstract class AbstractC13064h0 extends AbstractC7582a implements InterfaceC7585d {

    /* renamed from: b */
    public static final a f35444b = new a(null);

    /* renamed from: zk.h0$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC7583b<InterfaceC7585d, AbstractC13064h0> {

        /* renamed from: zk.h0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C13293a extends AbstractC9323o implements InterfaceC9998l<InterfaceC7587f.b, AbstractC13064h0> {

            /* renamed from: a */
            public static final C13293a f35445a = new C13293a();

            C13293a() {
                super(1);
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC13064h0 invoke(InterfaceC7587f.b bVar) {
                if (bVar instanceof AbstractC13064h0) {
                    return (AbstractC13064h0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(InterfaceC7585d.f17928n, C13293a.f35445a);
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public AbstractC13064h0() {
        super(InterfaceC7585d.f17928n);
    }

    /* renamed from: D0 */
    public abstract void mo625D0(InterfaceC7587f interfaceC7587f, Runnable runnable);

    @Override // p124gk.InterfaceC7585d
    /* renamed from: E */
    public final <T> Continuation<T> mo23036E(Continuation<? super T> continuation) {
        return new C7226j(this, continuation);
    }

    /* renamed from: F0 */
    public boolean mo626F0(InterfaceC7587f interfaceC7587f) {
        return true;
    }

    /* renamed from: H0 */
    public AbstractC13064h0 mo23095H0(int i10) {
        C7238p.m21640a(i10);
        return new C7236o(this, i10);
    }

    @Override // p124gk.AbstractC7582a, p124gk.InterfaceC7587f
    /* renamed from: Q */
    public InterfaceC7587f mo20645Q(InterfaceC7587f.c<?> cVar) {
        return InterfaceC7585d.a.m23039b(this, cVar);
    }

    @Override // p124gk.AbstractC7582a, p124gk.InterfaceC7587f.b, p124gk.InterfaceC7587f
    /* renamed from: b */
    public <E extends InterfaceC7587f.b> E mo20647b(InterfaceC7587f.c<E> cVar) {
        return (E) InterfaceC7585d.a.m23038a(this, cVar);
    }

    @Override // p124gk.InterfaceC7585d
    /* renamed from: h0 */
    public final void mo23037h0(Continuation<?> continuation) {
        C9322n.m27779c(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C7226j) continuation).m21591r();
    }

    public String toString() {
        return C13092o0.m43273a(this) + '@' + C13092o0.m43274b(this);
    }
}
