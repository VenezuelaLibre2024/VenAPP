package p145hj;

import p449xj.C12504g;

/* renamed from: hj.b */
/* loaded from: classes3.dex */
public final class C7744b {
    /* renamed from: a */
    public static RuntimeException m23647a(Throwable th2) {
        throw C12504g.m40936d(th2);
    }

    /* renamed from: b */
    public static void m23648b(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }
}
