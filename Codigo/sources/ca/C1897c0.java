package ca;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC5226b1;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.internal.InterfaceC5230c1;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import la.C9456a;
import la.C9466k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ca.c0 */
/* loaded from: classes.dex */
public final class C1897c0 {

    /* renamed from: e */
    private static volatile InterfaceC5230c1 f7903e;

    /* renamed from: g */
    private static Context f7905g;

    /* renamed from: a */
    static final AbstractBinderC1893a0 f7899a = new BinderC1926u(AbstractBinderC1930y.m10124g2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    static final AbstractBinderC1893a0 f7900b = new BinderC1927v(AbstractBinderC1930y.m10124g2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    static final AbstractBinderC1893a0 f7901c = new BinderC1928w(AbstractBinderC1930y.m10124g2("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    static final AbstractBinderC1893a0 f7902d = new BinderC1929x(AbstractBinderC1930y.m10124g2("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    private static final Object f7904f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1917m0 m10056a(String str, AbstractBinderC1930y abstractBinderC1930y, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m10061f(str, abstractBinderC1930y, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1917m0 m10057b(String str, boolean z10, boolean z11, boolean z12) {
        return m10062g(str, z10, false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ String m10058c(boolean z10, String str, AbstractBinderC1930y abstractBinderC1930y) {
        String str2 = true != (!z10 && m10061f(str, abstractBinderC1930y, true, false).f7943a) ? "not allowed" : "debug cert rejected";
        MessageDigest m28114b = C9456a.m28114b("SHA-256");
        C5276s.m13324j(m28114b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, C9466k.m28153a(m28114b.digest(abstractBinderC1930y.mo10047h2())), Boolean.valueOf(z10), "12451000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static synchronized void m10059d(Context context) {
        synchronized (C1897c0.class) {
            if (f7905g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f7905g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m10060e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m10063h();
                return f7903e.zzi();
            } catch (RemoteException | DynamiteModule.C5324a e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: f */
    private static C1917m0 m10061f(final String str, final AbstractBinderC1930y abstractBinderC1930y, final boolean z10, boolean z11) {
        try {
            m10063h();
            C5276s.m13324j(f7905g);
            try {
                return f7903e.mo13223f(new C1907h0(str, abstractBinderC1930y, z10, z11), BinderC5314d.m13412h2(f7905g.getPackageManager())) ? C1917m0.m10114b() : new C1913k0(new Callable() { // from class: ca.t
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C1897c0.m10058c(z10, str, abstractBinderC1930y);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C1917m0.m10116d("module call", e10);
            }
        } catch (DynamiteModule.C5324a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return C1917m0.m10116d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.dynamic.b, android.os.IBinder] */
    /* renamed from: g */
    private static C1917m0 m10062g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        String concat;
        C1917m0 m10116d;
        C1899d0 c1899d0;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C5276s.m13324j(f7905g);
            try {
                m10063h();
                c1899d0 = new C1899d0(str, z10, false, BinderC5314d.m13412h2(f7905g), false, true);
            } catch (DynamiteModule.C5324a e10) {
                e = e10;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                concat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            try {
                C1903f0 mo13225v = z13 ? f7903e.mo13225v(c1899d0) : f7903e.mo13224k(c1899d0);
                if (mo13225v.zzb()) {
                    m10116d = C1917m0.m10117f(mo13225v.zzc());
                } else {
                    String zza = mo13225v.zza();
                    PackageManager.NameNotFoundException nameNotFoundException = mo13225v.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (zza == null) {
                        zza = "error checking package certificate";
                    }
                    m10116d = C1917m0.m10118g(mo13225v.zzc(), mo13225v.zzd(), zza, nameNotFoundException);
                }
            } catch (RemoteException e11) {
                e = e11;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                concat = "module call";
                m10116d = C1917m0.m10116d(concat, e);
                return m10116d;
            }
            return m10116d;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: h */
    private static void m10063h() {
        if (f7903e != null) {
            return;
        }
        C5276s.m13324j(f7905g);
        synchronized (f7904f) {
            if (f7903e == null) {
                f7903e = AbstractBinderC5226b1.m13227f2(DynamiteModule.m13418e(f7905g, DynamiteModule.f10837f, "com.google.android.gms.googlecertificates").m13427d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
