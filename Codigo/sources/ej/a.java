package ej;

import dj.r;
import hj.b;
import java.util.concurrent.Callable;
import jj.e;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e<Callable<r>, r> f14713a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile e<r, r> f14714b;

    static <T, R> R a(e<T, R> eVar, T t10) {
        try {
            return eVar.apply(t10);
        } catch (Throwable th2) {
            throw b.a(th2);
        }
    }

    static r b(e<Callable<r>, r> eVar, Callable<r> callable) {
        r rVar = (r) a(eVar, callable);
        if (rVar != null) {
            return rVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static r c(Callable<r> callable) {
        try {
            r call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw b.a(th2);
        }
    }

    public static r d(Callable<r> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        e<Callable<r>, r> eVar = f14713a;
        return eVar == null ? c(callable) : b(eVar, callable);
    }

    public static r e(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        e<r, r> eVar = f14714b;
        return eVar == null ? rVar : (r) a(eVar, rVar);
    }
}
