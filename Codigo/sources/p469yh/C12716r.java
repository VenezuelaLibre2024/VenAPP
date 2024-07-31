package p469yh;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: yh.r */
/* loaded from: classes3.dex */
class C12716r implements InterfaceC12712n {

    /* renamed from: a */
    final String f34483a;

    /* renamed from: b */
    final int f34484b;

    /* renamed from: c */
    private HandlerThread f34485c;

    /* renamed from: d */
    private Handler f34486d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12716r(String str, int i10) {
        this.f34483a = str;
        this.f34484b = i10;
    }

    @Override // p469yh.InterfaceC12712n
    /* renamed from: a */
    public void mo41943a(C12709k c12709k) {
        this.f34486d.post(c12709k.f34463b);
    }

    @Override // p469yh.InterfaceC12712n
    /* renamed from: d */
    public void mo41945d() {
        HandlerThread handlerThread = this.f34485c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f34485c = null;
            this.f34486d = null;
        }
    }

    @Override // p469yh.InterfaceC12712n
    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f34483a, this.f34484b);
        this.f34485c = handlerThread;
        handlerThread.start();
        this.f34486d = new Handler(this.f34485c.getLooper());
    }
}
