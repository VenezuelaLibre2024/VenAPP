package ba;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import ma.ThreadFactoryC9560b;

/* renamed from: ba.w */
/* loaded from: classes.dex */
public final class C1711w {

    /* renamed from: e */
    private static C1711w f7284e;

    /* renamed from: a */
    private final Context f7285a;

    /* renamed from: b */
    private final ScheduledExecutorService f7286b;

    /* renamed from: c */
    private ServiceConnectionC1705q f7287c = new ServiceConnectionC1705q(this, null);

    /* renamed from: d */
    private int f7288d = 1;

    C1711w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7286b = scheduledExecutorService;
        this.f7285a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized C1711w m9312b(Context context) {
        C1711w c1711w;
        synchronized (C1711w.class) {
            if (f7284e == null) {
                zze.zza();
                f7284e = new C1711w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC9560b("MessengerIpcClient"))));
            }
            c1711w = f7284e;
        }
        return c1711w;
    }

    /* renamed from: f */
    private final synchronized int m9314f() {
        int i10;
        i10 = this.f7288d;
        this.f7288d = i10 + 1;
        return i10;
    }

    /* renamed from: g */
    private final synchronized <T> Task<T> m9315g(AbstractC1708t<T> abstractC1708t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(abstractC1708t);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f7287c.m9305g(abstractC1708t)) {
            ServiceConnectionC1705q serviceConnectionC1705q = new ServiceConnectionC1705q(this, null);
            this.f7287c = serviceConnectionC1705q;
            serviceConnectionC1705q.m9305g(abstractC1708t);
        }
        return abstractC1708t.f7281b.getTask();
    }

    /* renamed from: c */
    public final Task<Void> m9316c(int i10, Bundle bundle) {
        return m9315g(new C1707s(m9314f(), 2, bundle));
    }

    /* renamed from: d */
    public final Task<Bundle> m9317d(int i10, Bundle bundle) {
        return m9315g(new C1710v(m9314f(), 1, bundle));
    }
}
