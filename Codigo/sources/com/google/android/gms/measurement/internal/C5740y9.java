package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import la.InterfaceC9461f;
import p041c9.C1888a;

/* renamed from: com.google.android.gms.measurement.internal.y9 */
/* loaded from: classes2.dex */
public final class C5740y9 extends AbstractC5692ua {

    /* renamed from: d */
    private final Map<String, C5728x9> f12082d;

    /* renamed from: e */
    public final C5466d5 f12083e;

    /* renamed from: f */
    public final C5466d5 f12084f;

    /* renamed from: g */
    public final C5466d5 f12085g;

    /* renamed from: h */
    public final C5466d5 f12086h;

    /* renamed from: i */
    public final C5466d5 f12087i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5740y9(C5705va c5705va) {
        super(c5705va);
        this.f12082d = new HashMap();
        C5735y4 mo13679e = mo13679e();
        mo13679e.getClass();
        this.f12083e = new C5466d5(mo13679e, "last_delete_stale", 0L);
        C5735y4 mo13679e2 = mo13679e();
        mo13679e2.getClass();
        this.f12084f = new C5466d5(mo13679e2, "backoff", 0L);
        C5735y4 mo13679e3 = mo13679e();
        mo13679e3.getClass();
        this.f12085g = new C5466d5(mo13679e3, "last_upload", 0L);
        C5735y4 mo13679e4 = mo13679e();
        mo13679e4.getClass();
        this.f12086h = new C5466d5(mo13679e4, "last_upload_attempt", 0L);
        C5735y4 mo13679e5 = mo13679e();
        mo13679e5.getClass();
        this.f12087i = new C5466d5(mo13679e5, "midnight_offset", 0L);
    }

    @Deprecated
    /* renamed from: t */
    private final Pair<String, Boolean> m14598t(String str) {
        C5728x9 c5728x9;
        C1888a.a aVar;
        mo13687i();
        long mo28131b = zzb().mo28131b();
        C5728x9 c5728x92 = this.f12082d.get(str);
        if (c5728x92 != null && mo28131b < c5728x92.f12039c) {
            return new Pair<>(c5728x92.f12037a, Boolean.valueOf(c5728x92.f12038b));
        }
        C1888a.m10033d(true);
        long m13910x = mo13672a().m13910x(str) + mo28131b;
        try {
            long m13905s = mo13672a().m13905s(str, C5474e0.f11267d);
            if (m13905s > 0) {
                try {
                    aVar = C1888a.m10031a(zza());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (c5728x92 != null && mo28131b < c5728x92.f12039c + m13905s) {
                        return new Pair<>(c5728x92.f12037a, Boolean.valueOf(c5728x92.f12038b));
                    }
                    aVar = null;
                }
            } else {
                aVar = C1888a.m10031a(zza());
            }
        } catch (Exception e10) {
            zzj().m14181A().m14219b("Unable to get advertising id", e10);
            c5728x9 = new C5728x9("", false, m13910x);
        }
        if (aVar == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String m10041a = aVar.m10041a();
        c5728x9 = m10041a != null ? new C5728x9(m10041a, aVar.m10042b(), m13910x) : new C5728x9("", aVar.m10042b(), m13910x);
        this.f12082d.put(str, c5728x9);
        C1888a.m10033d(false);
        return new Pair<>(c5728x9.f12037a, Boolean.valueOf(c5728x9.f12038b));
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

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5472db mo13764j() {
        return super.mo13764j();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5628pb mo13765k() {
        return super.mo13765k();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5577m mo13766l() {
        return super.mo13766l();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5531i5 mo13767m() {
        return super.mo13767m();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5740y9 mo13768n() {
        return super.mo13768n();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5679ta mo13769o() {
        return super.mo13769o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5692ua
    /* renamed from: s */
    protected final boolean mo13770s() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final Pair<String, Boolean> m14599u(String str, C5737y6 c5737y6) {
        return c5737y6.m14595x() ? m14598t(str) : new Pair<>("", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: v */
    public final String m14600v(String str, boolean z10) {
        mo13687i();
        String str2 = z10 ? (String) m14598t(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest m13981O0 = C5537ib.m13981O0();
        if (m13981O0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m13981O0.digest(str2.getBytes())));
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
