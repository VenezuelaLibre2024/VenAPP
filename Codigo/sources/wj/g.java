package wj;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public enum g implements im.c {
    CANCELLED;

    public static boolean b(AtomicReference<im.c> atomicReference) {
        im.c andSet;
        im.c cVar = atomicReference.get();
        g gVar = CANCELLED;
        if (cVar == gVar || (andSet = atomicReference.getAndSet(gVar)) == gVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void h(AtomicReference<im.c> atomicReference, AtomicLong atomicLong, long j10) {
        im.c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.i(j10);
            return;
        }
        if (p(j10)) {
            xj.d.a(atomicLong, j10);
            im.c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.i(andSet);
                }
            }
        }
    }

    public static boolean l(AtomicReference<im.c> atomicReference, AtomicLong atomicLong, im.c cVar) {
        if (!o(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        cVar.i(andSet);
        return true;
    }

    public static void m(long j10) {
        yj.a.q(new hj.e("More produced than requested: " + j10));
    }

    public static void n() {
        yj.a.q(new hj.e("Subscription already set!"));
    }

    public static boolean o(AtomicReference<im.c> atomicReference, im.c cVar) {
        lj.b.d(cVar, "s is null");
        if (e2.c.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        n();
        return false;
    }

    public static boolean p(long j10) {
        if (j10 > 0) {
            return true;
        }
        yj.a.q(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean q(im.c cVar, im.c cVar2) {
        if (cVar2 == null) {
            yj.a.q(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        n();
        return false;
    }

    @Override // im.c
    public void cancel() {
    }

    @Override // im.c
    public void i(long j10) {
    }
}
