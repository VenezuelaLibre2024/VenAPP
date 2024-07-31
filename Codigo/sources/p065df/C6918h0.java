package p065df;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p485zb.C12867g;

/* renamed from: df.h0 */
/* loaded from: classes2.dex */
public final class C6918h0 implements InterfaceC6916g0 {

    /* renamed from: c */
    public static final a f15421c = new a(null);

    /* renamed from: b */
    private final C12867g f15422b;

    /* renamed from: df.h0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C6918h0(C12867g firebaseApp) {
        C9322n.m27781e(firebaseApp, "firebaseApp");
        this.f15422b = firebaseApp;
    }

    @Override // p065df.InterfaceC6916g0
    /* renamed from: a */
    public void mo20032a(Messenger callback, ServiceConnection serviceConnection) {
        C9322n.m27781e(callback, "callback");
        C9322n.m27781e(serviceConnection, "serviceConnection");
        Context applicationContext = this.f15422b.m42630m().getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", callback);
        applicationContext.bindService(intent, serviceConnection, 65);
    }
}
