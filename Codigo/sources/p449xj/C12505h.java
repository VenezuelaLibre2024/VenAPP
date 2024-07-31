package p449xj;

import im.InterfaceC8015b;
import java.util.concurrent.atomic.AtomicInteger;
import p471yj.C12727a;

/* renamed from: xj.h */
/* loaded from: classes3.dex */
public final class C12505h {
    /* renamed from: a */
    public static void m40937a(InterfaceC8015b<?> interfaceC8015b, AtomicInteger atomicInteger, C12500c c12500c) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m40927b = c12500c.m40927b();
            if (m40927b != null) {
                interfaceC8015b.onError(m40927b);
            } else {
                interfaceC8015b.mo24632a();
            }
        }
    }

    /* renamed from: b */
    public static void m40938b(InterfaceC8015b<?> interfaceC8015b, Throwable th2, AtomicInteger atomicInteger, C12500c c12500c) {
        if (!c12500c.m40926a(th2)) {
            C12727a.m41995q(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            interfaceC8015b.onError(c12500c.m40927b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> void m40939c(InterfaceC8015b<? super T> interfaceC8015b, T t10, AtomicInteger atomicInteger, C12500c c12500c) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC8015b.mo24633c(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m40927b = c12500c.m40927b();
                if (m40927b != null) {
                    interfaceC8015b.onError(m40927b);
                } else {
                    interfaceC8015b.mo24632a();
                }
            }
        }
    }
}
