package yh;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class r implements n {

    /* renamed from: a */
    final String f31947a;

    /* renamed from: b */
    final int f31948b;

    /* renamed from: c */
    private HandlerThread f31949c;

    /* renamed from: d */
    private Handler f31950d;

    public r(String str, int i10) {
        this.f31947a = str;
        this.f31948b = i10;
    }

    @Override // yh.n
    public void a(k kVar) {
        this.f31950d.post(kVar.f31927b);
    }

    @Override // yh.n
    public void d() {
        HandlerThread handlerThread = this.f31949c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f31949c = null;
            this.f31950d = null;
        }
    }

    @Override // yh.n
    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f31947a, this.f31948b);
        this.f31949c = handlerThread;
        handlerThread.start();
        this.f31950d = new Handler(this.f31949c.getLooper());
    }
}
