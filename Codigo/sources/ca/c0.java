package ca;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.b1;
import com.google.android.gms.common.internal.c1;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: e */
    private static volatile c1 f6954e;

    /* renamed from: g */
    private static Context f6956g;

    /* renamed from: a */
    static final a0 f6950a = new u(y.g2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    static final a0 f6951b = new v(y.g2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    static final a0 f6952c = new w(y.g2("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    static final a0 f6953d = new x(y.g2("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    private static final Object f6955f = new Object();

    public static m0 a(String str, y yVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, yVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static m0 b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    public static /* synthetic */ String c(boolean z10, String str, y yVar) {
        String str2 = true != (!z10 && f(str, yVar, true, false).f6994a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = la.a.b("SHA-256");
        com.google.android.gms.common.internal.s.j(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, la.k.a(b10.digest(yVar.h2())), Boolean.valueOf(z10), "12451000.false");
    }

    public static synchronized void d(Context context) {
        synchronized (c0.class) {
            if (f6956g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f6956g = context.getApplicationContext();
            }
        }
    }

    public static boolean e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                return f6954e.zzi();
            } catch (RemoteException | DynamiteModule.a e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static m0 f(String str, y yVar, boolean z10, boolean z11) {
        try {
            h();
            com.google.android.gms.common.internal.s.j(f6956g);
            try {
                return f6954e.f(new h0(str, yVar, z10, z11), com.google.android.gms.dynamic.d.h2(f6956g.getPackageManager())) ? m0.b() : new k0(new Callable() { // from class: ca.t

                    /* renamed from: a */
                    public final /* synthetic */ boolean f7001a;

                    /* renamed from: b */
                    public final /* synthetic */ String f7002b;

                    /* renamed from: c */
                    public final /* synthetic */ y f7003c;

                    public /* synthetic */ t(boolean z102, String str2, y yVar2) {
                        r1 = z102;
                        r2 = str2;
                        r3 = yVar2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return c0.c(r1, r2, r3);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return m0.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return m0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.dynamic.b, android.os.IBinder] */
    private static m0 g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        String concat;
        m0 d10;
        d0 d0Var;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.s.j(f6956g);
            try {
                h();
                d0Var = new d0(str, z10, false, com.google.android.gms.dynamic.d.h2(f6956g), false, true);
            } catch (DynamiteModule.a e10) {
                e = e10;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                concat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            try {
                f0 v10 = z13 ? f6954e.v(d0Var) : f6954e.k(d0Var);
                if (v10.zzb()) {
                    d10 = m0.f(v10.zzc());
                } else {
                    String zza = v10.zza();
                    PackageManager.NameNotFoundException nameNotFoundException = v10.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (zza == null) {
                        zza = "error checking package certificate";
                    }
                    d10 = m0.g(v10.zzc(), v10.zzd(), zza, nameNotFoundException);
                }
            } catch (RemoteException e11) {
                e = e11;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                concat = "module call";
                d10 = m0.d(concat, e);
                return d10;
            }
            return d10;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void h() {
        if (f6954e != null) {
            return;
        }
        com.google.android.gms.common.internal.s.j(f6956g);
        synchronized (f6955f) {
            if (f6954e == null) {
                f6954e = b1.f2(DynamiteModule.e(f6956g, DynamiteModule.f9722f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
