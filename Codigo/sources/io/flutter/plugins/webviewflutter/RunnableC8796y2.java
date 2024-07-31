package io.flutter.plugins.webviewflutter;

/* renamed from: io.flutter.plugins.webviewflutter.y2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8796y2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InstanceManager f20191a;

    public /* synthetic */ RunnableC8796y2(InstanceManager instanceManager) {
        this.f20191a = instanceManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20191a.releaseAllFinalizedInstances();
    }
}
