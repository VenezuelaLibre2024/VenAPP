package yh;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f31930a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31931b;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f31932c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f31933d;

    /* renamed from: e, reason: collision with root package name */
    protected Runnable f31934e;

    /* renamed from: f, reason: collision with root package name */
    private k f31935f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str, int i10) {
        this.f31930a = str;
        this.f31931b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        k kVar = this.f31935f;
        return kVar != null && kVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer d() {
        k kVar = this.f31935f;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(final k kVar) {
        this.f31933d.post(new Runnable() { // from class: yh.l
            @Override // java.lang.Runnable
            public final void run() {
                m.this.c(kVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void f() {
        HandlerThread handlerThread = this.f31932c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f31932c = null;
            this.f31933d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f31930a, this.f31931b);
        this.f31932c = handlerThread;
        handlerThread.start();
        this.f31933d = new Handler(this.f31932c.getLooper());
        this.f31934e = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(k kVar) {
        kVar.f31927b.run();
        this.f31935f = kVar;
        this.f31934e.run();
    }
}
