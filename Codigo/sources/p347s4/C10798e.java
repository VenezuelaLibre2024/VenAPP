package p347s4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.appevents.C4569d;
import com.facebook.internal.C4627k;
import com.facebook.internal.C4634n0;
import dk.C7031r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p097f5.InterfaceC7296a;
import p152i4.C7799e0;
import p303q4.C10267g;

/* renamed from: s4.e */
/* loaded from: classes.dex */
public final class C10798e {

    /* renamed from: a */
    public static final C10798e f27256a = new C10798e();

    /* renamed from: b */
    private static final String f27257b = C10798e.class.getSimpleName();

    /* renamed from: c */
    private static Boolean f27258c;

    /* renamed from: s4.e$a */
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
    /* renamed from: s4.e$b */
    /* loaded from: classes.dex */
    public static final class b implements ServiceConnection {

        /* renamed from: a */
        private final CountDownLatch f27259a = new CountDownLatch(1);

        /* renamed from: b */
        private IBinder f27260b;

        /* renamed from: a */
        public final IBinder m32907a() {
            this.f27259a.await(5L, TimeUnit.SECONDS);
            return this.f27260b;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            C9322n.m27781e(name, "name");
            this.f27259a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(serviceBinder, "serviceBinder");
            this.f27260b = serviceBinder;
            this.f27259a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            C9322n.m27781e(name, "name");
        }
    }

    /* renamed from: s4.e$c */
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

    private C10798e() {
    }

    /* renamed from: a */
    private final Intent m32901a(Context context) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage(FbValidationUtils.FB_PACKAGE);
                if (packageManager.resolveService(intent, 0) != null && C4627k.m11242a(context, FbValidationUtils.FB_PACKAGE)) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (C4627k.m11242a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m32902b() {
        if (C0033a.m107d(C10798e.class)) {
            return false;
        }
        try {
            if (f27258c == null) {
                f27258c = Boolean.valueOf(f27256a.m32901a(C7799e0.m23860l()) != null);
            }
            Boolean bool = f27258c;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10798e.class);
            return false;
        }
    }

    /* renamed from: c */
    public static final c m32903c(String applicationId, List<C4569d> appEvents) {
        if (C0033a.m107d(C10798e.class)) {
            return null;
        }
        try {
            C9322n.m27781e(applicationId, "applicationId");
            C9322n.m27781e(appEvents, "appEvents");
            return f27256a.m32904d(a.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10798e.class);
            return null;
        }
    }

    /* renamed from: d */
    private final c m32904d(a aVar, String str, List<C4569d> list) {
        c cVar;
        String str2;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            C10267g.m30745b();
            Context m23860l = C7799e0.m23860l();
            Intent m32901a = m32901a(m23860l);
            if (m32901a == null) {
                return cVar2;
            }
            b bVar = new b();
            try {
                if (!m23860l.bindService(m32901a, bVar, 1)) {
                    return c.SERVICE_ERROR;
                }
                try {
                    IBinder m32907a = bVar.m32907a();
                    if (m32907a != null) {
                        InterfaceC7296a m21873f2 = InterfaceC7296a.a.m21873f2(m32907a);
                        Bundle m32898a = C10797d.m32898a(aVar, str, list);
                        if (m32898a != null) {
                            m21873f2.mo21872l(m32898a);
                            C4634n0 c4634n0 = C4634n0.f8760a;
                            C4634n0.m11314k0(f27257b, C9322n.m27787k("Successfully sent events to the remote service: ", m32898a));
                        }
                        cVar2 = c.OPERATION_SUCCESS;
                    }
                    return cVar2;
                } catch (RemoteException e10) {
                    cVar = c.SERVICE_ERROR;
                    C4634n0 c4634n02 = C4634n0.f8760a;
                    str2 = f27257b;
                    C4634n0.m11312j0(str2, e10);
                    m23860l.unbindService(bVar);
                    C4634n0.m11314k0(str2, "Unbound from the remote service");
                    return cVar;
                } catch (InterruptedException e11) {
                    cVar = c.SERVICE_ERROR;
                    C4634n0 c4634n03 = C4634n0.f8760a;
                    str2 = f27257b;
                    C4634n0.m11312j0(str2, e11);
                    m23860l.unbindService(bVar);
                    C4634n0.m11314k0(str2, "Unbound from the remote service");
                    return cVar;
                }
            } finally {
                m23860l.unbindService(bVar);
                C4634n0 c4634n04 = C4634n0.f8760a;
                C4634n0.m11314k0(f27257b, "Unbound from the remote service");
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: e */
    public static final c m32905e(String applicationId) {
        List<C4569d> m20582j;
        if (C0033a.m107d(C10798e.class)) {
            return null;
        }
        try {
            C9322n.m27781e(applicationId, "applicationId");
            C10798e c10798e = f27256a;
            a aVar = a.MOBILE_APP_INSTALL;
            m20582j = C7031r.m20582j();
            return c10798e.m32904d(aVar, applicationId, m20582j);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10798e.class);
            return null;
        }
    }
}
