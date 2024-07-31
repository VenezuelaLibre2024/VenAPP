package el;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class t<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14810a = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_cur");
    private volatile Object _cur;

    public t(boolean z10) {
        this._cur = new u(8, z10);
    }

    public final boolean a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14810a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            int a10 = uVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                androidx.concurrent.futures.b.a(f14810a, this, uVar, uVar.i());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14810a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            if (uVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f14810a, this, uVar, uVar.i());
            }
        }
    }

    public final int c() {
        return ((u) f14810a.get(this)).f();
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14810a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) uVar.j();
            if (e10 != u.f14814h) {
                return e10;
            }
            androidx.concurrent.futures.b.a(f14810a, this, uVar, uVar.i());
        }
    }
}
