package p041c9;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c9.c */
/* loaded from: classes.dex */
public final class C1890c extends Thread {

    /* renamed from: a */
    private final WeakReference<C1888a> f7882a;

    /* renamed from: b */
    private final long f7883b;

    /* renamed from: c */
    final CountDownLatch f7884c = new CountDownLatch(1);

    /* renamed from: d */
    boolean f7885d = false;

    public C1890c(C1888a c1888a, long j10) {
        this.f7882a = new WeakReference<>(c1888a);
        this.f7883b = j10;
        start();
    }

    /* renamed from: a */
    private final void m10043a() {
        C1888a c1888a = this.f7882a.get();
        if (c1888a != null) {
            c1888a.m10038f();
            this.f7885d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f7884c.await(this.f7883b, TimeUnit.MILLISECONDS)) {
                return;
            }
            m10043a();
        } catch (InterruptedException unused) {
            m10043a();
        }
    }
}
