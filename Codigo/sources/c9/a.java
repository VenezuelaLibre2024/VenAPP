package c9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ca.g;
import ca.h;
import ca.k;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    ca.a f6923a;

    /* renamed from: b, reason: collision with root package name */
    zzf f6924b;

    /* renamed from: c, reason: collision with root package name */
    boolean f6925c;

    /* renamed from: d, reason: collision with root package name */
    final Object f6926d;

    /* renamed from: e, reason: collision with root package name */
    c f6927e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f6928f;

    /* renamed from: g, reason: collision with root package name */
    final long f6929g;

    /* renamed from: c9.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0117a {

        /* renamed from: a, reason: collision with root package name */
        private final String f6930a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6931b;

        @Deprecated
        public C0117a(String str, boolean z10) {
            this.f6930a = str;
            this.f6931b = z10;
        }

        public String a() {
            return this.f6930a;
        }

        public boolean b() {
            return this.f6931b;
        }

        public String toString() {
            String str = this.f6930a;
            boolean z10 = this.f6931b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public a(Context context) {
        this(context, 30000L, false, false);
    }

    public a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        this.f6926d = new Object();
        s.j(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f6928f = context;
        this.f6925c = false;
        this.f6929g = j10;
    }

    public static C0117a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.g(false);
            C0117a i10 = aVar.i(-1);
            aVar.h(i10, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return i10;
        } finally {
        }
    }

    public static boolean c(Context context) {
        boolean zzd;
        a aVar = new a(context, -1L, false, false);
        try {
            aVar.g(false);
            s.i("Calling this from your main thread can lead to deadlock");
            synchronized (aVar) {
                if (!aVar.f6925c) {
                    synchronized (aVar.f6926d) {
                        c cVar = aVar.f6927e;
                        if (cVar == null || !cVar.f6936d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        aVar.g(false);
                        if (!aVar.f6925c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                s.j(aVar.f6923a);
                s.j(aVar.f6924b);
                try {
                    zzd = aVar.f6924b.zzd();
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            }
            aVar.j();
            return zzd;
        } finally {
            aVar.f();
        }
    }

    public static void d(boolean z10) {
    }

    private final C0117a i(int i10) {
        C0117a c0117a;
        s.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f6925c) {
                synchronized (this.f6926d) {
                    c cVar = this.f6927e;
                    if (cVar == null || !cVar.f6936d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    g(false);
                    if (!this.f6925c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            s.j(this.f6923a);
            s.j(this.f6924b);
            try {
                c0117a = new C0117a(this.f6924b.zzc(), this.f6924b.zze(true));
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        j();
        return c0117a;
    }

    private final void j() {
        synchronized (this.f6926d) {
            c cVar = this.f6927e;
            if (cVar != null) {
                cVar.f6935c.countDown();
                try {
                    this.f6927e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f6929g;
            if (j10 > 0) {
                this.f6927e = new c(this, j10);
            }
        }
    }

    public C0117a b() {
        return i(-1);
    }

    public void e() {
        g(true);
    }

    public final void f() {
        s.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f6928f == null || this.f6923a == null) {
                return;
            }
            try {
                if (this.f6925c) {
                    ka.b.b().c(this.f6928f, this.f6923a);
                }
            } catch (Throwable th2) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
            }
            this.f6925c = false;
            this.f6924b = null;
            this.f6923a = null;
        }
    }

    protected final void finalize() {
        f();
        super.finalize();
    }

    protected final void g(boolean z10) {
        s.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f6925c) {
                f();
            }
            Context context = this.f6928f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h10 = g.f().h(context, k.f6983a);
                if (h10 != 0 && h10 != 2) {
                    throw new IOException("Google Play services not available");
                }
                ca.a aVar = new ca.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!ka.b.b().a(context, intent, aVar, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.f6923a = aVar;
                    try {
                        this.f6924b = zze.zza(aVar.b(10000L, TimeUnit.MILLISECONDS));
                        this.f6925c = true;
                        if (z10) {
                            j();
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
                throw new h(9);
            }
        }
    }

    final boolean h(C0117a c0117a, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (c0117a != null) {
            hashMap.put("limit_ad_tracking", true != c0117a.b() ? "0" : "1");
            String a10 = c0117a.a();
            if (a10 != null) {
                hashMap.put("ad_id_size", Integer.toString(a10.length()));
            }
        }
        if (th2 != null) {
            hashMap.put("error", th2.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new b(this, hashMap).start();
        return true;
    }
}
