package p089el;

import hk.C7751c;
import kotlin.coroutines.jvm.internal.InterfaceC9299e;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p494zk.AbstractC13032a;
import p494zk.C13052e0;

/* renamed from: el.d0 */
/* loaded from: classes3.dex */
public class C7215d0<T> extends AbstractC13032a<T> implements InterfaceC9299e {

    /* renamed from: d */
    public final Continuation<T> f16184d;

    /* JADX WARN: Multi-variable type inference failed */
    public C7215d0(InterfaceC7587f interfaceC7587f, Continuation<? super T> continuation) {
        super(interfaceC7587f, true, true);
        this.f16184d = continuation;
    }

    @Override // p494zk.AbstractC13032a
    /* renamed from: N0 */
    protected void mo21550N0(Object obj) {
        Continuation<T> continuation = this.f16184d;
        continuation.resumeWith(C13052e0.m43147a(obj, continuation));
    }

    @Override // p494zk.C13050d2
    /* renamed from: e0 */
    protected final boolean mo21551e0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC9299e
    public final InterfaceC9299e getCallerFrame() {
        Continuation<T> continuation = this.f16184d;
        if (continuation instanceof InterfaceC9299e) {
            return (InterfaceC9299e) continuation;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p494zk.C13050d2
    /* renamed from: t */
    public void mo21552t(Object obj) {
        Continuation m23654b;
        m23654b = C7751c.m23654b(this.f16184d);
        C7228k.m21597c(m23654b, C13052e0.m43147a(obj, this.f16184d), null, 2, null);
    }
}
