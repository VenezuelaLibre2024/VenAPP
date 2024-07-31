package p205kj;

import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p123gj.InterfaceC7578b;
import p145hj.C7747e;
import p224lj.C9513b;
import p471yj.C12727a;

/* renamed from: kj.b */
/* loaded from: classes3.dex */
public enum EnumC9284b implements InterfaceC7578b {
    DISPOSED;

    /* renamed from: b */
    public static boolean m27692b(AtomicReference<InterfaceC7578b> atomicReference) {
        InterfaceC7578b andSet;
        InterfaceC7578b interfaceC7578b = atomicReference.get();
        EnumC9284b enumC9284b = DISPOSED;
        if (interfaceC7578b == enumC9284b || (andSet = atomicReference.getAndSet(enumC9284b)) == enumC9284b) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    /* renamed from: i */
    public static boolean m27693i(InterfaceC7578b interfaceC7578b) {
        return interfaceC7578b == DISPOSED;
    }

    /* renamed from: l */
    public static boolean m27694l(AtomicReference<InterfaceC7578b> atomicReference, InterfaceC7578b interfaceC7578b) {
        InterfaceC7578b interfaceC7578b2;
        do {
            interfaceC7578b2 = atomicReference.get();
            if (interfaceC7578b2 == DISPOSED) {
                if (interfaceC7578b == null) {
                    return false;
                }
                interfaceC7578b.dispose();
                return false;
            }
        } while (!C7099c.m20926a(atomicReference, interfaceC7578b2, interfaceC7578b));
        return true;
    }

    /* renamed from: m */
    public static void m27695m() {
        C12727a.m41995q(new C7747e("Disposable already set!"));
    }

    /* renamed from: n */
    public static boolean m27696n(AtomicReference<InterfaceC7578b> atomicReference, InterfaceC7578b interfaceC7578b) {
        InterfaceC7578b interfaceC7578b2;
        do {
            interfaceC7578b2 = atomicReference.get();
            if (interfaceC7578b2 == DISPOSED) {
                if (interfaceC7578b == null) {
                    return false;
                }
                interfaceC7578b.dispose();
                return false;
            }
        } while (!C7099c.m20926a(atomicReference, interfaceC7578b2, interfaceC7578b));
        if (interfaceC7578b2 == null) {
            return true;
        }
        interfaceC7578b2.dispose();
        return true;
    }

    /* renamed from: o */
    public static boolean m27697o(AtomicReference<InterfaceC7578b> atomicReference, InterfaceC7578b interfaceC7578b) {
        C9513b.m28324d(interfaceC7578b, "d is null");
        if (C7099c.m20926a(atomicReference, null, interfaceC7578b)) {
            return true;
        }
        interfaceC7578b.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m27695m();
        return false;
    }

    /* renamed from: p */
    public static boolean m27698p(InterfaceC7578b interfaceC7578b, InterfaceC7578b interfaceC7578b2) {
        if (interfaceC7578b2 == null) {
            C12727a.m41995q(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC7578b == null) {
            return true;
        }
        interfaceC7578b2.dispose();
        m27695m();
        return false;
    }

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        return true;
    }
}
