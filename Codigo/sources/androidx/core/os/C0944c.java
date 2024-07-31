package androidx.core.os;

import android.os.CancellationSignal;

/* renamed from: androidx.core.os.c */
/* loaded from: classes.dex */
public final class C0944c {

    /* renamed from: a */
    private boolean f4465a;

    /* renamed from: b */
    private b f4466b;

    /* renamed from: c */
    private Object f4467c;

    /* renamed from: d */
    private boolean f4468d;

    /* renamed from: androidx.core.os.c$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m4706a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        static CancellationSignal m4707b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: androidx.core.os.c$b */
    /* loaded from: classes.dex */
    public interface b {
        void onCancel();
    }

    /* renamed from: d */
    private void m4702d() {
        while (this.f4468d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m4703a() {
        synchronized (this) {
            if (this.f4465a) {
                return;
            }
            this.f4465a = true;
            this.f4468d = true;
            b bVar = this.f4466b;
            Object obj = this.f4467c;
            if (bVar != null) {
                try {
                    bVar.onCancel();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f4468d = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            if (obj != null) {
                a.m4706a(obj);
            }
            synchronized (this) {
                this.f4468d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public boolean m4704b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f4465a;
        }
        return z10;
    }

    /* renamed from: c */
    public void m4705c(b bVar) {
        synchronized (this) {
            m4702d();
            if (this.f4466b == bVar) {
                return;
            }
            this.f4466b = bVar;
            if (this.f4465a && bVar != null) {
                bVar.onCancel();
            }
        }
    }
}
