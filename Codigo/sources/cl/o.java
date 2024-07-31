package cl;

import ck.n;
import ck.v;
import el.h0;
import gk.Continuation;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o extends dl.d<m<?>> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f7186a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state");
    private volatile Object _state;

    @Override // dl.d
    /* renamed from: d */
    public boolean a(m<?> mVar) {
        h0 h0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7186a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        h0Var = n.f7184a;
        atomicReferenceFieldUpdater.set(this, h0Var);
        return true;
    }

    public final Object e(Continuation<? super v> continuation) {
        Continuation b10;
        h0 h0Var;
        Object c10;
        Object c11;
        b10 = hk.c.b(continuation);
        zk.n nVar = new zk.n(b10, 1);
        nVar.z();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7186a;
        h0Var = n.f7184a;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, h0Var, nVar)) {
            n.a aVar = ck.n.f7126b;
            nVar.resumeWith(ck.n.b(v.f7137a));
        }
        Object w10 = nVar.w();
        c10 = hk.d.c();
        if (w10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        c11 = hk.d.c();
        return w10 == c11 ? w10 : v.f7137a;
    }

    @Override // dl.d
    /* renamed from: f */
    public Continuation<v>[] b(m<?> mVar) {
        f7186a.set(this, null);
        return dl.c.f14250a;
    }

    public final void g() {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        h0 h0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7186a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            h0Var = n.f7185b;
            if (obj == h0Var) {
                return;
            }
            h0Var2 = n.f7184a;
            if (obj == h0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7186a;
                h0Var3 = n.f7185b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, obj, h0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f7186a;
                h0Var4 = n.f7184a;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater3, this, obj, h0Var4)) {
                    n.a aVar = ck.n.f7126b;
                    ((zk.n) obj).resumeWith(ck.n.b(v.f7137a));
                    return;
                }
            }
        }
    }

    public final boolean h() {
        h0 h0Var;
        h0 h0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7186a;
        h0Var = n.f7184a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, h0Var);
        kotlin.jvm.internal.n.b(andSet);
        h0Var2 = n.f7185b;
        return andSet == h0Var2;
    }
}
