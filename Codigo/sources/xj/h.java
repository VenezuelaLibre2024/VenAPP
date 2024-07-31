package xj;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class h {
    public static void a(im.b<?> bVar, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable b10 = cVar.b();
            if (b10 != null) {
                bVar.onError(b10);
            } else {
                bVar.a();
            }
        }
    }

    public static void b(im.b<?> bVar, Throwable th2, AtomicInteger atomicInteger, c cVar) {
        if (!cVar.a(th2)) {
            yj.a.q(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bVar.onError(cVar.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void c(im.b<? super T> bVar, T t10, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.c(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable b10 = cVar.b();
                if (b10 != null) {
                    bVar.onError(b10);
                } else {
                    bVar.a();
                }
            }
        }
    }
}
