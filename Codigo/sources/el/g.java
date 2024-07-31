package el;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Collection<zk.i0> f14767a;

    static {
        wk.d c10;
        List k10;
        c10 = wk.j.c(ServiceLoader.load(zk.i0.class, zk.i0.class.getClassLoader()).iterator());
        k10 = wk.l.k(c10);
        f14767a = k10;
    }

    public static final Collection<zk.i0> a() {
        return f14767a;
    }

    public static final void b(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}
