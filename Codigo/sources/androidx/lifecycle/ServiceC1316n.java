package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.lifecycle.n */
/* loaded from: classes.dex */
public class ServiceC1316n extends Service implements InterfaceC1310k {

    /* renamed from: a */
    private final C1301f0 f5715a = new C1301f0(this);

    @Override // androidx.lifecycle.InterfaceC1310k
    public AbstractC1300f getLifecycle() {
        return this.f5715a.m7327a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C9322n.m27781e(intent, "intent");
        this.f5715a.m7328b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f5715a.m7329c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f5715a.m7330d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f5715a.m7331e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
