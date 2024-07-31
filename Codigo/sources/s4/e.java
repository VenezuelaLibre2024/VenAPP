package s4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.internal.k;
import com.facebook.internal.n0;
import dk.r;
import f5.a;
import i4.e0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import q4.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f25137a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final String f25138b = e.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f25139c;

    /* loaded from: classes.dex */
    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        private final String eventType;

        a(String str) {
            this.eventType = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.eventType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f25140a = new CountDownLatch(1);

        /* renamed from: b, reason: collision with root package name */
        private IBinder f25141b;

        public final IBinder a() {
            this.f25140a.await(5L, TimeUnit.SECONDS);
            return this.f25141b;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            n.e(name, "name");
            this.f25140a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            n.e(name, "name");
            n.e(serviceBinder, "serviceBinder");
            this.f25141b = serviceBinder;
            this.f25140a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            n.e(name, "name");
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    private e() {
    }

    private final Intent a(Context context) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage(FbValidationUtils.FB_PACKAGE);
                if (packageManager.resolveService(intent, 0) != null && k.a(context, FbValidationUtils.FB_PACKAGE)) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (k.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final boolean b() {
        if (a5.a.d(e.class)) {
            return false;
        }
        try {
            if (f25139c == null) {
                f25139c = Boolean.valueOf(f25137a.a(e0.l()) != null);
            }
            Boolean bool = f25139c;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
            return false;
        }
    }

    public static final c c(String applicationId, List<com.facebook.appevents.d> appEvents) {
        if (a5.a.d(e.class)) {
            return null;
        }
        try {
            n.e(applicationId, "applicationId");
            n.e(appEvents, "appEvents");
            return f25137a.d(a.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
            return null;
        }
    }

    private final c d(a aVar, String str, List<com.facebook.appevents.d> list) {
        c cVar;
        String str2;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            g.b();
            Context l10 = e0.l();
            Intent a10 = a(l10);
            if (a10 == null) {
                return cVar2;
            }
            b bVar = new b();
            try {
                if (!l10.bindService(a10, bVar, 1)) {
                    return c.SERVICE_ERROR;
                }
                try {
                    IBinder a11 = bVar.a();
                    if (a11 != null) {
                        f5.a f22 = a.AbstractBinderC0238a.f2(a11);
                        Bundle a12 = d.a(aVar, str, list);
                        if (a12 != null) {
                            f22.l(a12);
                            n0 n0Var = n0.f7780a;
                            n0.k0(f25138b, n.k("Successfully sent events to the remote service: ", a12));
                        }
                        cVar2 = c.OPERATION_SUCCESS;
                    }
                    return cVar2;
                } catch (RemoteException e10) {
                    cVar = c.SERVICE_ERROR;
                    n0 n0Var2 = n0.f7780a;
                    str2 = f25138b;
                    n0.j0(str2, e10);
                    l10.unbindService(bVar);
                    n0.k0(str2, "Unbound from the remote service");
                    return cVar;
                } catch (InterruptedException e11) {
                    cVar = c.SERVICE_ERROR;
                    n0 n0Var3 = n0.f7780a;
                    str2 = f25138b;
                    n0.j0(str2, e11);
                    l10.unbindService(bVar);
                    n0.k0(str2, "Unbound from the remote service");
                    return cVar;
                }
            } finally {
                l10.unbindService(bVar);
                n0 n0Var4 = n0.f7780a;
                n0.k0(f25138b, "Unbound from the remote service");
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final c e(String applicationId) {
        List<com.facebook.appevents.d> j10;
        if (a5.a.d(e.class)) {
            return null;
        }
        try {
            n.e(applicationId, "applicationId");
            e eVar = f25137a;
            a aVar = a.MOBILE_APP_INSTALL;
            j10 = r.j();
            return eVar.d(aVar, applicationId, j10);
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
            return null;
        }
    }
}
