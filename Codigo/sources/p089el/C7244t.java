package p089el;

import androidx.concurrent.futures.C0741b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: el.t */
/* loaded from: classes3.dex */
public class C7244t<E> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f16233a = AtomicReferenceFieldUpdater.newUpdater(C7244t.class, Object.class, "_cur");
    private volatile Object _cur;

    public C7244t(boolean z10) {
        this._cur = new C7245u(8, z10);
    }

    /* renamed from: a */
    public final boolean m21660a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16233a;
        while (true) {
            C7245u c7245u = (C7245u) atomicReferenceFieldUpdater.get(this);
            int m21669a = c7245u.m21669a(e10);
            if (m21669a == 0) {
                return true;
            }
            if (m21669a == 1) {
                C0741b.m3751a(f16233a, this, c7245u, c7245u.m21673i());
            } else if (m21669a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m21661b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16233a;
        while (true) {
            C7245u c7245u = (C7245u) atomicReferenceFieldUpdater.get(this);
            if (c7245u.m21670d()) {
                return;
            } else {
                C0741b.m3751a(f16233a, this, c7245u, c7245u.m21673i());
            }
        }
    }

    /* renamed from: c */
    public final int m21662c() {
        return ((C7245u) f16233a.get(this)).m21671f();
    }

    /* renamed from: d */
    public final E m21663d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16233a;
        while (true) {
            C7245u c7245u = (C7245u) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) c7245u.m21674j();
            if (e10 != C7245u.f16237h) {
                return e10;
            }
            C0741b.m3751a(f16233a, this, c7245u, c7245u.m21673i());
        }
    }
}
