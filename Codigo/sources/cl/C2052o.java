package cl;

import androidx.concurrent.futures.C0741b;
import ck.C2029n;
import ck.C2037v;
import hk.C7751c;
import hk.C7752d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.jvm.internal.C9322n;
import p069dl.AbstractC7046d;
import p069dl.C7045c;
import p124gk.Continuation;
import p494zk.C13087n;

/* renamed from: cl.o */
/* loaded from: classes3.dex */
final class C2052o extends AbstractC7046d<C2050m<?>> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f8138a = AtomicReferenceFieldUpdater.newUpdater(C2052o.class, Object.class, "_state");
    private volatile Object _state;

    @Override // p069dl.AbstractC7046d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10382a(C2050m<?> c2050m) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8138a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, C2051n.m10379b());
        return true;
    }

    /* renamed from: e */
    public final Object m10385e(Continuation<? super C2037v> continuation) {
        Continuation m23654b;
        Object m23655c;
        Object m23655c2;
        m23654b = C7751c.m23654b(continuation);
        C13087n c13087n = new C13087n(m23654b, 1);
        c13087n.m43269z();
        if (!C0741b.m3751a(f8138a, this, C2051n.m10379b(), c13087n)) {
            C2029n.a aVar = C2029n.f8078b;
            c13087n.resumeWith(C2029n.m10340b(C2037v.f8089a));
        }
        Object m43267w = c13087n.m43267w();
        m23655c = C7752d.m23655c();
        if (m43267w == m23655c) {
            C9302h.m27753c(continuation);
        }
        m23655c2 = C7752d.m23655c();
        return m43267w == m23655c2 ? m43267w : C2037v.f8089a;
    }

    @Override // p069dl.AbstractC7046d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Continuation<C2037v>[] mo10383b(C2050m<?> c2050m) {
        f8138a.set(this, null);
        return C7045c.f15608a;
    }

    /* renamed from: g */
    public final void m10387g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8138a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == C2051n.m10380c()) {
                return;
            }
            if (obj == C2051n.m10379b()) {
                if (C0741b.m3751a(f8138a, this, obj, C2051n.m10380c())) {
                    return;
                }
            } else if (C0741b.m3751a(f8138a, this, obj, C2051n.m10379b())) {
                C2029n.a aVar = C2029n.f8078b;
                ((C13087n) obj).resumeWith(C2029n.m10340b(C2037v.f8089a));
                return;
            }
        }
    }

    /* renamed from: h */
    public final boolean m10388h() {
        Object andSet = f8138a.getAndSet(this, C2051n.m10379b());
        C9322n.m27778b(andSet);
        return andSet == C2051n.m10380c();
    }
}
