package io.flutter.plugins.webviewflutter;

/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InstanceManager f18498a;

    public /* synthetic */ y2(InstanceManager instanceManager) {
        this.f18498a = instanceManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18498a.releaseAllFinalizedInstances();
    }
}
