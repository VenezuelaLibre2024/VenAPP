package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class f extends v6 {

    /* renamed from: b */
    private Boolean f10165b;

    /* renamed from: c */
    private h f10166c;

    /* renamed from: d */
    private Boolean f10167d;

    public f(w5 w5Var) {
        super(w5Var);
        this.f10166c = i.f10244a;
    }

    public static long B() {
        return e0.f10099f.a(null).longValue();
    }

    public static long H() {
        return e0.F.a(null).longValue();
    }

    private final Bundle P() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().B().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = na.e.a(zza()).c(zza().getPackageName(), RecognitionOptions.ITF);
            if (c10 != null) {
                return c10.metaData;
            }
            zzj().B().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            zzj().B().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    private final String b(String str, String str2) {
        p4 B;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            com.google.android.gms.common.internal.s.j(str4);
            return str4;
        } catch (ClassNotFoundException e10) {
            e = e10;
            B = zzj().B();
            str3 = "Could not find SystemProperties class";
            B.b(str3, e);
            return str2;
        } catch (IllegalAccessException e11) {
            e = e11;
            B = zzj().B();
            str3 = "Could not access SystemProperties.get()";
            B.b(str3, e);
            return str2;
        } catch (NoSuchMethodException e12) {
            e = e12;
            B = zzj().B();
            str3 = "Could not find SystemProperties.get() method";
            B.b(str3, e);
            return str2;
        } catch (InvocationTargetException e13) {
            e = e13;
            B = zzj().B();
            str3 = "SystemProperties.get() threw an exception";
            B.b(str3, e);
            return str2;
        }
    }

    public final Boolean A(String str) {
        com.google.android.gms.common.internal.s.f(str);
        Bundle P = P();
        if (P == null) {
            zzj().B().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (P.containsKey(str)) {
            return Boolean.valueOf(P.getBoolean(str));
        }
        return null;
    }

    public final String C(String str) {
        return u(str, e0.N);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> D(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.s.f(r4)
            android.os.Bundle r0 = r3.P()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.n4 r4 = r3.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.B()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.zza()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.n4 r0 = r3.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.B()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.D(java.lang.String):java.util.List");
    }

    public final boolean E(String str) {
        return y(str, e0.M);
    }

    public final boolean F(String str) {
        return "1".equals(this.f10166c.b(str, "gaia_collection_enabled"));
    }

    public final boolean G(String str) {
        return "1".equals(this.f10166c.b(str, "measurement.event_sampling_enabled"));
    }

    public final String I() {
        return b("debug.firebase.analytics.app", "");
    }

    public final String J() {
        return b("debug.deferred.deeplink", "");
    }

    public final boolean K() {
        Boolean A = A("google_analytics_adid_collection_enabled");
        return A == null || A.booleanValue();
    }

    public final boolean L() {
        Boolean A = A("google_analytics_automatic_screen_reporting_enabled");
        return A == null || A.booleanValue();
    }

    public final boolean M() {
        Boolean A = A("firebase_analytics_collection_deactivated");
        return A != null && A.booleanValue();
    }

    public final boolean N() {
        if (this.f10165b == null) {
            Boolean A = A("app_measurement_lite");
            this.f10165b = A;
            if (A == null) {
                this.f10165b = Boolean.FALSE;
            }
        }
        return this.f10165b.booleanValue() || !this.f10701a.o();
    }

    public final boolean O() {
        if (this.f10167d == null) {
            synchronized (this) {
                if (this.f10167d == null) {
                    ApplicationInfo applicationInfo = zza().getApplicationInfo();
                    String a10 = la.r.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f10167d = Boolean.valueOf(str != null && str.equals(a10));
                    }
                    if (this.f10167d == null) {
                        this.f10167d = Boolean.TRUE;
                        zzj().B().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f10167d.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final double j(String str, h4<Double> h4Var) {
        if (str != null) {
            String b10 = this.f10166c.b(str, h4Var.b());
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return h4Var.a(Double.valueOf(Double.parseDouble(b10))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return h4Var.a(null).doubleValue();
    }

    public final int k(String str) {
        return l(str, e0.J, 500, AdError.SERVER_ERROR_CODE);
    }

    public final int l(String str, h4<Integer> h4Var, int i10, int i11) {
        return Math.max(Math.min(p(str, h4Var), i11), i10);
    }

    public final void m(h hVar) {
        this.f10166c = hVar;
    }

    public final boolean n(h4<Boolean> h4Var) {
        return y(null, h4Var);
    }

    public final int o(String str) {
        return (zzoo.zza() && a().y(null, e0.f10092b1)) ? 500 : 100;
    }

    public final int p(String str, h4<Integer> h4Var) {
        if (str != null) {
            String b10 = this.f10166c.b(str, h4Var.b());
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return h4Var.a(Integer.valueOf(Integer.parseInt(b10))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return h4Var.a(null).intValue();
    }

    public final int q() {
        return (zzot.zza() && a().y(null, e0.I0) && f().W(231100000, true)) ? 35 : 0;
    }

    public final int r(String str) {
        return Math.max(o(str), RecognitionOptions.QR_CODE);
    }

    public final long s(String str, h4<Long> h4Var) {
        if (str != null) {
            String b10 = this.f10166c.b(str, h4Var.b());
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return h4Var.a(Long.valueOf(Long.parseLong(b10))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return h4Var.a(null).longValue();
    }

    public final int t(String str) {
        return l(str, e0.K, 25, 100);
    }

    public final String u(String str, h4<String> h4Var) {
        return h4Var.a(str == null ? null : this.f10166c.b(str, h4Var.b()));
    }

    public final int v(String str) {
        return p(str, e0.f10121q);
    }

    public final boolean w(String str, h4<Boolean> h4Var) {
        return y(str, h4Var);
    }

    public final long x(String str) {
        return s(str, e0.f10093c);
    }

    public final boolean y(String str, h4<Boolean> h4Var) {
        Boolean a10;
        if (str != null) {
            String b10 = this.f10166c.b(str, h4Var.b());
            if (!TextUtils.isEmpty(b10)) {
                a10 = h4Var.a(Boolean.valueOf("1".equals(b10)));
                return a10.booleanValue();
            }
        }
        a10 = h4Var.a(null);
        return a10.booleanValue();
    }

    public final int z() {
        return f().W(201500000, true) ? 100 : 25;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ la.f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
