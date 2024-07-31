package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class n extends Service implements k {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f4961a = new f0(this);

    @Override // androidx.lifecycle.k
    public f getLifecycle() {
        return this.f4961a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        kotlin.jvm.internal.n.e(intent, "intent");
        this.f4961a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f4961a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f4961a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f4961a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
