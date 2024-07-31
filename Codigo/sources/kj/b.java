package kj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public enum b implements gj.b {
    DISPOSED;

    public static boolean b(AtomicReference<gj.b> atomicReference) {
        gj.b andSet;
        gj.b bVar = atomicReference.get();
        b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean i(gj.b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean l(AtomicReference<gj.b> atomicReference, gj.b bVar) {
        gj.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!e2.c.a(atomicReference, bVar2, bVar));
        return true;
    }

    public static void m() {
        yj.a.q(new hj.e("Disposable already set!"));
    }

    public static boolean n(AtomicReference<gj.b> atomicReference, gj.b bVar) {
        gj.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!e2.c.a(atomicReference, bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    public static boolean o(AtomicReference<gj.b> atomicReference, gj.b bVar) {
        lj.b.d(bVar, "d is null");
        if (e2.c.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m();
        return false;
    }

    public static boolean p(gj.b bVar, gj.b bVar2) {
        if (bVar2 == null) {
            yj.a.q(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        m();
        return false;
    }

    @Override // gj.b
    public void dispose() {
    }

    @Override // gj.b
    public boolean h() {
        return true;
    }
}
