package p089el;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
import p427wk.C12234j;
import p427wk.C12236l;
import p427wk.InterfaceC12228d;
import p494zk.InterfaceC13068i0;

/* renamed from: el.g */
/* loaded from: classes3.dex */
public final class C7220g {

    /* renamed from: a */
    private static final Collection<InterfaceC13068i0> f16190a;

    static {
        InterfaceC12228d m39379c;
        List m39387k;
        m39379c = C12234j.m39379c(ServiceLoader.load(InterfaceC13068i0.class, InterfaceC13068i0.class.getClassLoader()).iterator());
        m39387k = C12236l.m39387k(m39379c);
        f16190a = m39387k;
    }

    /* renamed from: a */
    public static final Collection<InterfaceC13068i0> m21571a() {
        return f16190a;
    }

    /* renamed from: b */
    public static final void m21572b(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}
