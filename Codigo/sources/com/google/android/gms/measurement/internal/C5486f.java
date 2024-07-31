package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.InvocationTargetException;
import la.C9473r;
import la.InterfaceC9461f;
import na.C9696e;

/* renamed from: com.google.android.gms.measurement.internal.f */
/* loaded from: classes2.dex */
public final class C5486f extends C5701v6 {

    /* renamed from: b */
    private Boolean f11337b;

    /* renamed from: c */
    private InterfaceC5512h f11338c;

    /* renamed from: d */
    private Boolean f11339d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5486f(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11338c = new InterfaceC5512h() { // from class: com.google.android.gms.measurement.internal.i
            @Override // com.google.android.gms.measurement.internal.InterfaceC5512h
            /* renamed from: b */
            public final String mo13917b(String str, String str2) {
                return null;
            }
        };
    }

    /* renamed from: B */
    public static long m13879B() {
        return C5474e0.f11271f.m13918a(null).longValue();
    }

    /* renamed from: H */
    public static long m13880H() {
        return C5474e0.f11217F.m13918a(null).longValue();
    }

    /* renamed from: P */
    private final Bundle m13881P() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().m14182B().m14218a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo m29074c = C9696e.m29080a(zza()).m29074c(zza().getPackageName(), RecognitionOptions.ITF);
            if (m29074c != null) {
                return m29074c.metaData;
            }
            zzj().m14182B().m14218a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            zzj().m14182B().m14219b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    /* renamed from: b */
    private final String m13882b(String str, String str2) {
        C5621p4 m14182B;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            C5276s.m13324j(str4);
            return str4;
        } catch (ClassNotFoundException e10) {
            e = e10;
            m14182B = zzj().m14182B();
            str3 = "Could not find SystemProperties class";
            m14182B.m14219b(str3, e);
            return str2;
        } catch (IllegalAccessException e11) {
            e = e11;
            m14182B = zzj().m14182B();
            str3 = "Could not access SystemProperties.get()";
            m14182B.m14219b(str3, e);
            return str2;
        } catch (NoSuchMethodException e12) {
            e = e12;
            m14182B = zzj().m14182B();
            str3 = "Could not find SystemProperties.get() method";
            m14182B.m14219b(str3, e);
            return str2;
        } catch (InvocationTargetException e13) {
            e = e13;
            m14182B = zzj().m14182B();
            str3 = "SystemProperties.get() threw an exception";
            m14182B.m14219b(str3, e);
            return str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final Boolean m13883A(String str) {
        C5276s.m13320f(str);
        Bundle m13881P = m13881P();
        if (m13881P == null) {
            zzj().m14182B().m14218a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (m13881P.containsKey(str)) {
            return Boolean.valueOf(m13881P.getBoolean(str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final String m13884C(String str) {
        return m13907u(str, C5474e0.f11233N);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> m13885D(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C5276s.m13320f(r4)
            android.os.Bundle r0 = r3.m13881P()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.n4 r4 = r3.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.m14182B()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m14218a(r0)
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
            com.google.android.gms.measurement.internal.p4 r0 = r0.m14182B()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.m14219b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5486f.m13885D(java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean m13886E(String str) {
        return m13911y(str, C5474e0.f11231M);
    }

    /* renamed from: F */
    public final boolean m13887F(String str) {
        return "1".equals(this.f11338c.mo13917b(str, "gaia_collection_enabled"));
    }

    /* renamed from: G */
    public final boolean m13888G(String str) {
        return "1".equals(this.f11338c.mo13917b(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: I */
    public final String m13889I() {
        return m13882b("debug.firebase.analytics.app", "");
    }

    /* renamed from: J */
    public final String m13890J() {
        return m13882b("debug.deferred.deeplink", "");
    }

    /* renamed from: K */
    public final boolean m13891K() {
        Boolean m13883A = m13883A("google_analytics_adid_collection_enabled");
        return m13883A == null || m13883A.booleanValue();
    }

    /* renamed from: L */
    public final boolean m13892L() {
        Boolean m13883A = m13883A("google_analytics_automatic_screen_reporting_enabled");
        return m13883A == null || m13883A.booleanValue();
    }

    /* renamed from: M */
    public final boolean m13893M() {
        Boolean m13883A = m13883A("firebase_analytics_collection_deactivated");
        return m13883A != null && m13883A.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean m13894N() {
        if (this.f11337b == null) {
            Boolean m13883A = m13883A("app_measurement_lite");
            this.f11337b = m13883A;
            if (m13883A == null) {
                this.f11337b = Boolean.FALSE;
            }
        }
        return this.f11337b.booleanValue() || !this.f11899a.m14516o();
    }

    /* renamed from: O */
    public final boolean m13895O() {
        if (this.f11339d == null) {
            synchronized (this) {
                if (this.f11339d == null) {
                    ApplicationInfo applicationInfo = zza().getApplicationInfo();
                    String m28177a = C9473r.m28177a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f11339d = Boolean.valueOf(str != null && str.equals(m28177a));
                    }
                    if (this.f11339d == null) {
                        this.f11339d = Boolean.TRUE;
                        zzj().m14182B().m14218a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f11339d.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    /* renamed from: j */
    public final double m13896j(String str, C5517h4<Double> c5517h4) {
        if (str != null) {
            String mo13917b = this.f11338c.mo13917b(str, c5517h4.m13919b());
            if (!TextUtils.isEmpty(mo13917b)) {
                try {
                    return c5517h4.m13918a(Double.valueOf(Double.parseDouble(mo13917b))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return c5517h4.m13918a(null).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final int m13897k(String str) {
        return m13898l(str, C5474e0.f11225J, 500, AdError.SERVER_ERROR_CODE);
    }

    /* renamed from: l */
    public final int m13898l(String str, C5517h4<Integer> c5517h4, int i10, int i11) {
        return Math.max(Math.min(m13902p(str, c5517h4), i11), i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m13899m(InterfaceC5512h interfaceC5512h) {
        this.f11338c = interfaceC5512h;
    }

    /* renamed from: n */
    public final boolean m13900n(C5517h4<Boolean> c5517h4) {
        return m13911y(null, c5517h4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final int m13901o(String str) {
        return (zzoo.zza() && mo13672a().m13911y(null, C5474e0.f11264b1)) ? 500 : 100;
    }

    /* renamed from: p */
    public final int m13902p(String str, C5517h4<Integer> c5517h4) {
        if (str != null) {
            String mo13917b = this.f11338c.mo13917b(str, c5517h4.m13919b());
            if (!TextUtils.isEmpty(mo13917b)) {
                try {
                    return c5517h4.m13918a(Integer.valueOf(Integer.parseInt(mo13917b))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return c5517h4.m13918a(null).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final int m13903q() {
        return (zzot.zza() && mo13672a().m13911y(null, C5474e0.f11224I0) && mo13681f().m14031W(231100000, true)) ? 35 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final int m13904r(String str) {
        return Math.max(m13901o(str), RecognitionOptions.QR_CODE);
    }

    /* renamed from: s */
    public final long m13905s(String str, C5517h4<Long> c5517h4) {
        if (str != null) {
            String mo13917b = this.f11338c.mo13917b(str, c5517h4.m13919b());
            if (!TextUtils.isEmpty(mo13917b)) {
                try {
                    return c5517h4.m13918a(Long.valueOf(Long.parseLong(mo13917b))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return c5517h4.m13918a(null).longValue();
    }

    /* renamed from: t */
    public final int m13906t(String str) {
        return m13898l(str, C5474e0.f11227K, 25, 100);
    }

    /* renamed from: u */
    public final String m13907u(String str, C5517h4<String> c5517h4) {
        return c5517h4.m13918a(str == null ? null : this.f11338c.mo13917b(str, c5517h4.m13919b()));
    }

    /* renamed from: v */
    public final int m13908v(String str) {
        return m13902p(str, C5474e0.f11293q);
    }

    /* renamed from: w */
    public final boolean m13909w(String str, C5517h4<Boolean> c5517h4) {
        return m13911y(str, c5517h4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final long m13910x(String str) {
        return m13905s(str, C5474e0.f11265c);
    }

    /* renamed from: y */
    public final boolean m13911y(String str, C5517h4<Boolean> c5517h4) {
        Boolean m13918a;
        if (str != null) {
            String mo13917b = this.f11338c.mo13917b(str, c5517h4.m13919b());
            if (!TextUtils.isEmpty(mo13917b)) {
                m13918a = c5517h4.m13918a(Boolean.valueOf("1".equals(mo13917b)));
                return m13918a.booleanValue();
            }
        }
        m13918a = c5517h4.m13918a(null);
        return m13918a.booleanValue();
    }

    /* renamed from: z */
    public final int m13912z() {
        return mo13681f().m14031W(201500000, true) ? 100 : 25;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ InterfaceC9461f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5473e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5595n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5635q5 zzl() {
        return super.zzl();
    }
}
