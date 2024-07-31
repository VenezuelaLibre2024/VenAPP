package p426wj;

import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p145hj.C7747e;
import p224lj.C9513b;
import p449xj.C12501d;
import p471yj.C12727a;

/* renamed from: wj.g */
/* loaded from: classes3.dex */
public enum EnumC12224g implements InterfaceC8016c {
    CANCELLED;

    /* renamed from: b */
    public static boolean m39353b(AtomicReference<InterfaceC8016c> atomicReference) {
        InterfaceC8016c andSet;
        InterfaceC8016c interfaceC8016c = atomicReference.get();
        EnumC12224g enumC12224g = CANCELLED;
        if (interfaceC8016c == enumC12224g || (andSet = atomicReference.getAndSet(enumC12224g)) == enumC12224g) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    /* renamed from: h */
    public static void m39354h(AtomicReference<InterfaceC8016c> atomicReference, AtomicLong atomicLong, long j10) {
        InterfaceC8016c interfaceC8016c = atomicReference.get();
        if (interfaceC8016c != null) {
            interfaceC8016c.mo24634i(j10);
            return;
        }
        if (m39359p(j10)) {
            C12501d.m40928a(atomicLong, j10);
            InterfaceC8016c interfaceC8016c2 = atomicReference.get();
            if (interfaceC8016c2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC8016c2.mo24634i(andSet);
                }
            }
        }
    }

    /* renamed from: l */
    public static boolean m39355l(AtomicReference<InterfaceC8016c> atomicReference, AtomicLong atomicLong, InterfaceC8016c interfaceC8016c) {
        if (!m39358o(atomicReference, interfaceC8016c)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        interfaceC8016c.mo24634i(andSet);
        return true;
    }

    /* renamed from: m */
    public static void m39356m(long j10) {
        C12727a.m41995q(new C7747e("More produced than requested: " + j10));
    }

    /* renamed from: n */
    public static void m39357n() {
        C12727a.m41995q(new C7747e("Subscription already set!"));
    }

    /* renamed from: o */
    public static boolean m39358o(AtomicReference<InterfaceC8016c> atomicReference, InterfaceC8016c interfaceC8016c) {
        C9513b.m28324d(interfaceC8016c, "s is null");
        if (C7099c.m20926a(atomicReference, null, interfaceC8016c)) {
            return true;
        }
        interfaceC8016c.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        m39357n();
        return false;
    }

    /* renamed from: p */
    public static boolean m39359p(long j10) {
        if (j10 > 0) {
            return true;
        }
        C12727a.m41995q(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    /* renamed from: q */
    public static boolean m39360q(InterfaceC8016c interfaceC8016c, InterfaceC8016c interfaceC8016c2) {
        if (interfaceC8016c2 == null) {
            C12727a.m41995q(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC8016c == null) {
            return true;
        }
        interfaceC8016c2.cancel();
        m39357n();
        return false;
    }

    @Override // im.InterfaceC8016c
    public void cancel() {
    }

    @Override // im.InterfaceC8016c
    /* renamed from: i */
    public void mo24634i(long j10) {
    }
}
