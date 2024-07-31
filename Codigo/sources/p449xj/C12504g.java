package p449xj;

import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p145hj.C7743a;

/* renamed from: xj.g */
/* loaded from: classes3.dex */
public final class C12504g {

    /* renamed from: a */
    public static final Throwable f33905a = new a();

    /* renamed from: xj.g$a */
    /* loaded from: classes3.dex */
    static final class a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> boolean m40933a(AtomicReference<Throwable> atomicReference, Throwable th2) {
        Throwable th3;
        do {
            th3 = atomicReference.get();
            if (th3 == f33905a) {
                return false;
            }
        } while (!C7099c.m20926a(atomicReference, th3, th3 == null ? th2 : new C7743a(th3, th2)));
        return true;
    }

    /* renamed from: b */
    public static <T> Throwable m40934b(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        Throwable th3 = f33905a;
        return th2 != th3 ? atomicReference.getAndSet(th3) : th2;
    }

    /* renamed from: c */
    public static <E extends Throwable> Exception m40935c(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        throw th2;
    }

    /* renamed from: d */
    public static RuntimeException m40936d(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2 instanceof RuntimeException ? (RuntimeException) th2 : new RuntimeException(th2);
    }
}
