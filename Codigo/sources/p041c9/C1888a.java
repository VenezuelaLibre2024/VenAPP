package p041c9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ca.C1904g;
import ca.C1906h;
import ca.C1912k;
import ca.ServiceConnectionC1892a;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p200ka.C9214b;

/* renamed from: c9.a */
/* loaded from: classes.dex */
public class C1888a {

    /* renamed from: a */
    ServiceConnectionC1892a f7872a;

    /* renamed from: b */
    zzf f7873b;

    /* renamed from: c */
    boolean f7874c;

    /* renamed from: d */
    final Object f7875d;

    /* renamed from: e */
    C1890c f7876e;

    /* renamed from: f */
    private final Context f7877f;

    /* renamed from: g */
    final long f7878g;

    /* renamed from: c9.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final String f7879a;

        /* renamed from: b */
        private final boolean f7880b;

        @Deprecated
        public a(String str, boolean z10) {
            this.f7879a = str;
            this.f7880b = z10;
        }

        /* renamed from: a */
        public String m10041a() {
            return this.f7879a;
        }

        /* renamed from: b */
        public boolean m10042b() {
            return this.f7880b;
        }

        public String toString() {
            String str = this.f7879a;
            boolean z10 = this.f7880b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public C1888a(Context context) {
        this(context, 30000L, false, false);
    }

    public C1888a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        this.f7875d = new Object();
        C5276s.m13324j(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f7877f = context;
        this.f7874c = false;
        this.f7878g = j10;
    }

    /* renamed from: a */
    public static a m10031a(Context context) {
        C1888a c1888a = new C1888a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c1888a.m10039g(false);
            a m10034i = c1888a.m10034i(-1);
            c1888a.m10040h(m10034i, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return m10034i;
        } finally {
        }
    }

    /* renamed from: c */
    public static boolean m10032c(Context context) {
        boolean zzd;
        C1888a c1888a = new C1888a(context, -1L, false, false);
        try {
            c1888a.m10039g(false);
            C5276s.m13323i("Calling this from your main thread can lead to deadlock");
            synchronized (c1888a) {
                if (!c1888a.f7874c) {
                    synchronized (c1888a.f7875d) {
                        C1890c c1890c = c1888a.f7876e;
                        if (c1890c == null || !c1890c.f7885d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c1888a.m10039g(false);
                        if (!c1888a.f7874c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                C5276s.m13324j(c1888a.f7872a);
                C5276s.m13324j(c1888a.f7873b);
                try {
                    zzd = c1888a.f7873b.zzd();
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            }
            c1888a.m10035j();
            return zzd;
        } finally {
            c1888a.m10038f();
        }
    }

    /* renamed from: d */
    public static void m10033d(boolean z10) {
    }

    /* renamed from: i */
    private final a m10034i(int i10) {
        a aVar;
        C5276s.m13323i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f7874c) {
                synchronized (this.f7875d) {
                    C1890c c1890c = this.f7876e;
                    if (c1890c == null || !c1890c.f7885d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m10039g(false);
                    if (!this.f7874c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            C5276s.m13324j(this.f7872a);
            C5276s.m13324j(this.f7873b);
            try {
                aVar = new a(this.f7873b.zzc(), this.f7873b.zze(true));
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        m10035j();
        return aVar;
    }

    /* renamed from: j */
    private final void m10035j() {
        synchronized (this.f7875d) {
            C1890c c1890c = this.f7876e;
            if (c1890c != null) {
                c1890c.f7884c.countDown();
                try {
                    this.f7876e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f7878g;
            if (j10 > 0) {
                this.f7876e = new C1890c(this, j10);
            }
        }
    }

    /* renamed from: b */
    public a m10036b() {
        return m10034i(-1);
    }

    /* renamed from: e */
    public void m10037e() {
        m10039g(true);
    }

    /* renamed from: f */
    public final void m10038f() {
        C5276s.m13323i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f7877f == null || this.f7872a == null) {
                return;
            }
            try {
                if (this.f7874c) {
                    C9214b.m27395b().m27401c(this.f7877f, this.f7872a);
                }
            } catch (Throwable th2) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
            }
            this.f7874c = false;
            this.f7873b = null;
            this.f7872a = null;
        }
    }

    protected final void finalize() {
        m10038f();
        super.finalize();
    }

    /* renamed from: g */
    protected final void m10039g(boolean z10) {
        C5276s.m13323i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f7874c) {
                m10038f();
            }
            Context context = this.f7877f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int mo10072h = C1904g.m10086f().mo10072h(context, C1912k.f7932a);
                if (mo10072h != 0 && mo10072h != 2) {
                    throw new IOException("Google Play services not available");
                }
                ServiceConnectionC1892a serviceConnectionC1892a = new ServiceConnectionC1892a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!C9214b.m27395b().m27400a(context, intent, serviceConnectionC1892a, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.f7872a = serviceConnectionC1892a;
                    try {
                        this.f7873b = zze.zza(serviceConnectionC1892a.m10046b(10000L, TimeUnit.MILLISECONDS));
                        this.f7874c = true;
                        if (z10) {
                            m10035j();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } finally {
                    IOException iOException = new IOException(th2);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new C1906h(9);
            }
        }
    }

    /* renamed from: h */
    final boolean m10040h(a aVar, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (aVar != null) {
            hashMap.put("limit_ad_tracking", true != aVar.m10042b() ? "0" : "1");
            String m10041a = aVar.m10041a();
            if (m10041a != null) {
                hashMap.put("ad_id_size", Integer.toString(m10041a.length()));
            }
        }
        if (th2 != null) {
            hashMap.put("error", th2.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new C1889b(this, hashMap).start();
        return true;
    }
}
