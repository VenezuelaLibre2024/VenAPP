package jh;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: e, reason: collision with root package name */
    private static k f19957e;

    /* renamed from: a, reason: collision with root package name */
    private Handler f19958a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f19959b;

    /* renamed from: c, reason: collision with root package name */
    private int f19960c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f19961d = new Object();

    private k() {
    }

    private void a() {
        synchronized (this.f19961d) {
            if (this.f19958a == null) {
                if (this.f19960c <= 0) {
                    throw new IllegalStateException("CameraThread is not open");
                }
                HandlerThread handlerThread = new HandlerThread("CameraThread");
                this.f19959b = handlerThread;
                handlerThread.start();
                this.f19958a = new Handler(this.f19959b.getLooper());
            }
        }
    }

    public static k d() {
        if (f19957e == null) {
            f19957e = new k();
        }
        return f19957e;
    }

    private void f() {
        synchronized (this.f19961d) {
            this.f19959b.quit();
            this.f19959b = null;
            this.f19958a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        synchronized (this.f19961d) {
            int i10 = this.f19960c - 1;
            this.f19960c = i10;
            if (i10 == 0) {
                f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(Runnable runnable) {
        synchronized (this.f19961d) {
            a();
            this.f19958a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(Runnable runnable) {
        synchronized (this.f19961d) {
            this.f19960c++;
            c(runnable);
        }
    }
}
