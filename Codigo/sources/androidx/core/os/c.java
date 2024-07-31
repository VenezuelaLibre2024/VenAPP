package androidx.core.os;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3793a;

    /* renamed from: b, reason: collision with root package name */
    private b f3794b;

    /* renamed from: c, reason: collision with root package name */
    private Object f3795c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3796d;

    /* loaded from: classes.dex */
    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onCancel();
    }

    private void d() {
        while (this.f3796d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f3793a) {
                return;
            }
            this.f3793a = true;
            this.f3796d = true;
            b bVar = this.f3794b;
            Object obj = this.f3795c;
            if (bVar != null) {
                try {
                    bVar.onCancel();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f3796d = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.f3796d = false;
                notifyAll();
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f3793a;
        }
        return z10;
    }

    public void c(b bVar) {
        synchronized (this) {
            d();
            if (this.f3794b == bVar) {
                return;
            }
            this.f3794b = bVar;
            if (this.f3793a && bVar != null) {
                bVar.onCancel();
            }
        }
    }
}
