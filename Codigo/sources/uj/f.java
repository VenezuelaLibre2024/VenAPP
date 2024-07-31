package uj;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class f extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: a, reason: collision with root package name */
    final String f27742a;

    /* renamed from: b, reason: collision with root package name */
    final int f27743b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f27744c;

    /* loaded from: classes3.dex */
    static final class a extends Thread {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public f(String str) {
        this(str, 5, false);
    }

    public f(String str, int i10) {
        this(str, i10, false);
    }

    public f(String str, int i10, boolean z10) {
        this.f27742a = str;
        this.f27743b = i10;
        this.f27744c = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f27742a + '-' + incrementAndGet();
        Thread aVar = this.f27744c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f27743b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f27742a + "]";
    }
}
