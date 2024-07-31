package p494zk;

import ck.C2037v;
import java.util.concurrent.CancellationException;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC9998l;
import p427wk.InterfaceC12228d;

/* renamed from: zk.w1 */
/* loaded from: classes3.dex */
public interface InterfaceC13125w1 extends InterfaceC7587f.b {

    /* renamed from: q */
    public static final b f35491q = b.f35492a;

    /* renamed from: zk.w1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m43312a(InterfaceC13125w1 interfaceC13125w1, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC13125w1.mo43108O(cancellationException);
        }

        /* renamed from: b */
        public static <R> R m43313b(InterfaceC13125w1 interfaceC13125w1, R r10, InterfaceC10002p<? super R, ? super InterfaceC7587f.b, ? extends R> interfaceC10002p) {
            return (R) InterfaceC7587f.b.a.m23043a(interfaceC13125w1, r10, interfaceC10002p);
        }

        /* renamed from: c */
        public static <E extends InterfaceC7587f.b> E m43314c(InterfaceC13125w1 interfaceC13125w1, InterfaceC7587f.c<E> cVar) {
            return (E) InterfaceC7587f.b.a.m23044b(interfaceC13125w1, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC13044c1 m43315d(InterfaceC13125w1 interfaceC13125w1, boolean z10, boolean z11, InterfaceC9998l interfaceC9998l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return interfaceC13125w1.mo43122m0(z10, z11, interfaceC9998l);
        }

        /* renamed from: e */
        public static InterfaceC7587f m43316e(InterfaceC13125w1 interfaceC13125w1, InterfaceC7587f.c<?> cVar) {
            return InterfaceC7587f.b.a.m23045c(interfaceC13125w1, cVar);
        }

        /* renamed from: f */
        public static InterfaceC7587f m43317f(InterfaceC13125w1 interfaceC13125w1, InterfaceC7587f interfaceC7587f) {
            return InterfaceC7587f.b.a.m23046d(interfaceC13125w1, interfaceC7587f);
        }
    }

    /* renamed from: zk.w1$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC7587f.c<InterfaceC13125w1> {

        /* renamed from: a */
        static final /* synthetic */ b f35492a = new b();

        private b() {
        }
    }

    /* renamed from: B0 */
    Object mo43101B0(Continuation<? super C2037v> continuation);

    /* renamed from: O */
    void mo43108O(CancellationException cancellationException);

    /* renamed from: R */
    InterfaceC13044c1 mo43109R(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l);

    /* renamed from: a */
    boolean mo43033a();

    InterfaceC13125w1 getParent();

    /* renamed from: i */
    InterfaceC12228d<InterfaceC13125w1> mo43118i();

    boolean isCancelled();

    /* renamed from: j0 */
    InterfaceC13107s mo43120j0(InterfaceC13115u interfaceC13115u);

    /* renamed from: m0 */
    InterfaceC13044c1 mo43122m0(boolean z10, boolean z11, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l);

    /* renamed from: n */
    CancellationException mo43123n();

    boolean start();
}
