package p494zk;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C9322n;
import p124gk.InterfaceC7587f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zk.f */
/* loaded from: classes3.dex */
public final class C13055f<T> extends AbstractC13032a<T> {

    /* renamed from: d */
    private final Thread f35431d;

    /* renamed from: e */
    private final AbstractC13061g1 f35432e;

    public C13055f(InterfaceC7587f interfaceC7587f, Thread thread, AbstractC13061g1 abstractC13061g1) {
        super(interfaceC7587f, true, true);
        this.f35431d = thread;
        this.f35432e = abstractC13061g1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R0 */
    public final T m43159R0() {
        C13042c.m43062a();
        try {
            AbstractC13061g1 abstractC13061g1 = this.f35432e;
            if (abstractC13061g1 != null) {
                AbstractC13061g1.m43175Y0(abstractC13061g1, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC13061g1 abstractC13061g12 = this.f35432e;
                    long mo43182c1 = abstractC13061g12 != null ? abstractC13061g12.mo43182c1() : Long.MAX_VALUE;
                    if (m43117d0()) {
                        C13042c.m43062a();
                        T t10 = (T) C13054e2.m43158h(m43113Y());
                        r3 = t10 instanceof C13033a0 ? (C13033a0) t10 : null;
                        if (r3 == null) {
                            return t10;
                        }
                        throw r3.f35388a;
                    }
                    C13042c.m43062a();
                    LockSupport.parkNanos(this, mo43182c1);
                } finally {
                    AbstractC13061g1 abstractC13061g13 = this.f35432e;
                    if (abstractC13061g13 != null) {
                        AbstractC13061g1.m43173J0(abstractC13061g13, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m43127w(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            C13042c.m43062a();
            throw th2;
        }
    }

    @Override // p494zk.C13050d2
    /* renamed from: e0 */
    protected boolean mo21551e0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p494zk.C13050d2
    /* renamed from: t */
    public void mo21552t(Object obj) {
        if (C9322n.m27777a(Thread.currentThread(), this.f35431d)) {
            return;
        }
        Thread thread = this.f35431d;
        C13042c.m43062a();
        LockSupport.unpark(thread);
    }
}
