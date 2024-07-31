package df;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;

/* loaded from: classes2.dex */
public final class h0 implements g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f14067c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final zb.g f14068b;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public h0(zb.g firebaseApp) {
        kotlin.jvm.internal.n.e(firebaseApp, "firebaseApp");
        this.f14068b = firebaseApp;
    }

    @Override // df.g0
    public void a(Messenger callback, ServiceConnection serviceConnection) {
        kotlin.jvm.internal.n.e(callback, "callback");
        kotlin.jvm.internal.n.e(serviceConnection, "serviceConnection");
        Context applicationContext = this.f14068b.m().getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", callback);
        applicationContext.bindService(intent, serviceConnection, 65);
    }
}
