package c9;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: a */
    private final WeakReference<a> f6933a;

    /* renamed from: b */
    private final long f6934b;

    /* renamed from: c */
    final CountDownLatch f6935c = new CountDownLatch(1);

    /* renamed from: d */
    boolean f6936d = false;

    public c(a aVar, long j10) {
        this.f6933a = new WeakReference<>(aVar);
        this.f6934b = j10;
        start();
    }

    private final void a() {
        a aVar = this.f6933a.get();
        if (aVar != null) {
            aVar.f();
            this.f6936d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f6935c.await(this.f6934b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
