package p469yh;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yh.m */
/* loaded from: classes3.dex */
public class C12711m {

    /* renamed from: a */
    private final String f34466a;

    /* renamed from: b */
    private final int f34467b;

    /* renamed from: c */
    private HandlerThread f34468c;

    /* renamed from: d */
    private Handler f34469d;

    /* renamed from: e */
    protected Runnable f34470e;

    /* renamed from: f */
    private C12709k f34471f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12711m(String str, int i10) {
        this.f34466a = str;
        this.f34467b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m41936b() {
        C12709k c12709k = this.f34471f;
        return c12709k != null && c12709k.m41933b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Integer m41937d() {
        C12709k c12709k = this.f34471f;
        if (c12709k != null) {
            return c12709k.m41932a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m41938e(final C12709k c12709k) {
        this.f34469d.post(new Runnable() { // from class: yh.l
            @Override // java.lang.Runnable
            public final void run() {
                C12711m.this.m41935c(c12709k);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void m41939f() {
        HandlerThread handlerThread = this.f34468c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f34468c = null;
            this.f34469d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void m41940g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f34466a, this.f34467b);
        this.f34468c = handlerThread;
        handlerThread.start();
        this.f34469d = new Handler(this.f34468c.getLooper());
        this.f34470e = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m41935c(C12709k c12709k) {
        c12709k.f34463b.run();
        this.f34471f = c12709k;
        this.f34470e.run();
    }
}
