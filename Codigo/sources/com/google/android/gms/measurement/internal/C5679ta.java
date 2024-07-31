package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzqd;
import java.util.HashMap;
import la.InterfaceC9461f;

/* renamed from: com.google.android.gms.measurement.internal.ta */
/* loaded from: classes2.dex */
public final class C5679ta extends C5653ra {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5679ta(C5705va c5705va) {
        super(c5705va);
    }

    /* renamed from: q */
    private final String m14345q(String str) {
        String m13950L = mo13767m().m13950L(str);
        if (TextUtils.isEmpty(m13950L)) {
            return C5474e0.f11297s.m13918a(null);
        }
        Uri parse = Uri.parse(C5474e0.f11297s.m13918a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.authority(m13950L + "." + parse.getAuthority());
        return buildUpon.build().toString();
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

    /* renamed from: p */
    public final C5717wa m14346p(String str) {
        if (zzqd.zza() && mo13672a().m13900n(C5474e0.f11208A0)) {
            zzj().m14186F().m14218a("sgtm feature flag enabled.");
            C5648r5 m14160y0 = mo13766l().m14160y0(str);
            if (m14160y0 == null) {
                return new C5717wa(m14345q(str));
            }
            C5717wa c5717wa = null;
            if (m14160y0.m14324t()) {
                zzj().m14186F().m14218a("sgtm upload enabled in manifest.");
                zzfc.zzd m13945G = mo13767m().m13945G(m14160y0.m14325t0());
                if (m13945G != null) {
                    String zzj = m13945G.zzj();
                    if (!TextUtils.isEmpty(zzj)) {
                        String zzi = m13945G.zzi();
                        zzj().m14186F().m14220c("sgtm configured with upload_url, server_info", zzj, TextUtils.isEmpty(zzi) ? "Y" : "N");
                        if (TextUtils.isEmpty(zzi)) {
                            c5717wa = new C5717wa(zzj);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", zzi);
                            c5717wa = new C5717wa(zzj, hashMap);
                        }
                    }
                }
            }
            if (c5717wa != null) {
                return c5717wa;
            }
        }
        return new C5717wa(m14345q(str));
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
