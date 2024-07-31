package ba;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: e */
    private static w f6362e;

    /* renamed from: a */
    private final Context f6363a;

    /* renamed from: b */
    private final ScheduledExecutorService f6364b;

    /* renamed from: c */
    private q f6365c = new q(this, null);

    /* renamed from: d */
    private int f6366d = 1;

    w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f6364b = scheduledExecutorService;
        this.f6363a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(w wVar) {
        return wVar.f6363a;
    }

    public static synchronized w b(Context context) {
        w wVar;
        synchronized (w.class) {
            if (f6362e == null) {
                zze.zza();
                f6362e = new w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ma.b("MessengerIpcClient"))));
            }
            wVar = f6362e;
        }
        return wVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(w wVar) {
        return wVar.f6364b;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f6366d;
        this.f6366d = i10 + 1;
        return i10;
    }

    private final synchronized <T> Task<T> g(t<T> tVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(tVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f6365c.g(tVar)) {
            q qVar = new q(this, null);
            this.f6365c = qVar;
            qVar.g(tVar);
        }
        return tVar.f6359b.getTask();
    }

    public final Task<Void> c(int i10, Bundle bundle) {
        return g(new s(f(), 2, bundle));
    }

    public final Task<Bundle> d(int i10, Bundle bundle) {
        return g(new v(f(), 1, bundle));
    }
}
