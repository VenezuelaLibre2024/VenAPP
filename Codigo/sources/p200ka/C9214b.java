package p200ka;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.internal.InterfaceC5290w1;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import la.C9471p;
import na.C9696e;

/* renamed from: ka.b */
/* loaded from: classes.dex */
public class C9214b {

    /* renamed from: b */
    private static final Object f22340b = new Object();

    /* renamed from: c */
    private static volatile C9214b f22341c;

    /* renamed from: a */
    public final ConcurrentHashMap f22342a = new ConcurrentHashMap();

    private C9214b() {
    }

    /* renamed from: b */
    public static C9214b m27395b() {
        if (f22341c == null) {
            synchronized (f22340b) {
                if (f22341c == null) {
                    f22341c = new C9214b();
                }
            }
        }
        C9214b c9214b = f22341c;
        C5276s.m13324j(c9214b);
        return c9214b;
    }

    /* renamed from: e */
    private static void m27396e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m27397f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C9696e.m29080a(context).m29074c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m27398g(serviceConnection)) {
            return m27399h(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f22342a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean m27399h = m27399h(context, intent, serviceConnection, i10, executor);
            if (m27399h) {
                return m27399h;
            }
            return false;
        } finally {
            this.f22342a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: g */
    private static boolean m27398g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC5290w1);
    }

    /* renamed from: h */
    private static final boolean m27399h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        boolean bindService;
        if (!C9471p.m28174k() || executor == null) {
            return context.bindService(intent, serviceConnection, i10);
        }
        bindService = context.bindService(intent, i10, executor, serviceConnection);
        return bindService;
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: a */
    public boolean m27400a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return m27397f(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    /* renamed from: c */
    public void m27401c(Context context, ServiceConnection serviceConnection) {
        if (!m27398g(serviceConnection) || !this.f22342a.containsKey(serviceConnection)) {
            m27396e(context, serviceConnection);
            return;
        }
        try {
            m27396e(context, (ServiceConnection) this.f22342a.get(serviceConnection));
        } finally {
            this.f22342a.remove(serviceConnection);
        }
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: d */
    public final boolean m27402d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return m27397f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
