package p087ej;

import dj.AbstractC6993r;
import java.util.concurrent.Callable;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;

/* renamed from: ej.a */
/* loaded from: classes3.dex */
public final class C7197a {

    /* renamed from: a */
    private static volatile InterfaceC9077e<Callable<AbstractC6993r>, AbstractC6993r> f16136a;

    /* renamed from: b */
    private static volatile InterfaceC9077e<AbstractC6993r, AbstractC6993r> f16137b;

    /* renamed from: a */
    static <T, R> R m21450a(InterfaceC9077e<T, R> interfaceC9077e, T t10) {
        try {
            return interfaceC9077e.apply(t10);
        } catch (Throwable th2) {
            throw C7744b.m23647a(th2);
        }
    }

    /* renamed from: b */
    static AbstractC6993r m21451b(InterfaceC9077e<Callable<AbstractC6993r>, AbstractC6993r> interfaceC9077e, Callable<AbstractC6993r> callable) {
        AbstractC6993r abstractC6993r = (AbstractC6993r) m21450a(interfaceC9077e, callable);
        if (abstractC6993r != null) {
            return abstractC6993r;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: c */
    static AbstractC6993r m21452c(Callable<AbstractC6993r> callable) {
        try {
            AbstractC6993r call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw C7744b.m23647a(th2);
        }
    }

    /* renamed from: d */
    public static AbstractC6993r m21453d(Callable<AbstractC6993r> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        InterfaceC9077e<Callable<AbstractC6993r>, AbstractC6993r> interfaceC9077e = f16136a;
        return interfaceC9077e == null ? m21452c(callable) : m21451b(interfaceC9077e, callable);
    }

    /* renamed from: e */
    public static AbstractC6993r m21454e(AbstractC6993r abstractC6993r) {
        if (abstractC6993r == null) {
            throw new NullPointerException("scheduler == null");
        }
        InterfaceC9077e<AbstractC6993r, AbstractC6993r> interfaceC9077e = f16137b;
        return interfaceC9077e == null ? abstractC6993r : (AbstractC6993r) m21450a(interfaceC9077e, abstractC6993r);
    }
}
