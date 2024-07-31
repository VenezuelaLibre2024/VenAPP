package p184jh;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jh.k */
/* loaded from: classes3.dex */
public class C9060k {

    /* renamed from: e */
    private static C9060k f21736e;

    /* renamed from: a */
    private Handler f21737a;

    /* renamed from: b */
    private HandlerThread f21738b;

    /* renamed from: c */
    private int f21739c = 0;

    /* renamed from: d */
    private final Object f21740d = new Object();

    private C9060k() {
    }

    /* renamed from: a */
    private void m26653a() {
        synchronized (this.f21740d) {
            if (this.f21737a == null) {
                if (this.f21739c <= 0) {
                    throw new IllegalStateException("CameraThread is not open");
                }
                HandlerThread handlerThread = new HandlerThread("CameraThread");
                this.f21738b = handlerThread;
                handlerThread.start();
                this.f21737a = new Handler(this.f21738b.getLooper());
            }
        }
    }

    /* renamed from: d */
    public static C9060k m26654d() {
        if (f21736e == null) {
            f21736e = new C9060k();
        }
        return f21736e;
    }

    /* renamed from: f */
    private void m26655f() {
        synchronized (this.f21740d) {
            this.f21738b.quit();
            this.f21738b = null;
            this.f21737a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m26656b() {
        synchronized (this.f21740d) {
            int i10 = this.f21739c - 1;
            this.f21739c = i10;
            if (i10 == 0) {
                m26655f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m26657c(Runnable runnable) {
        synchronized (this.f21740d) {
            m26653a();
            this.f21737a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m26658e(Runnable runnable) {
        synchronized (this.f21740d) {
            this.f21739c++;
            m26657c(runnable);
        }
    }
}
