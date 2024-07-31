package p387uj;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: uj.f */
/* loaded from: classes3.dex */
public final class ThreadFactoryC11568f extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: a */
    final String f30065a;

    /* renamed from: b */
    final int f30066b;

    /* renamed from: c */
    final boolean f30067c;

    /* renamed from: uj.f$a */
    /* loaded from: classes3.dex */
    static final class a extends Thread {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public ThreadFactoryC11568f(String str) {
        this(str, 5, false);
    }

    public ThreadFactoryC11568f(String str, int i10) {
        this(str, i10, false);
    }

    public ThreadFactoryC11568f(String str, int i10, boolean z10) {
        this.f30065a = str;
        this.f30066b = i10;
        this.f30067c = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f30065a + '-' + incrementAndGet();
        Thread aVar = this.f30067c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f30066b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f30065a + "]";
    }
}
