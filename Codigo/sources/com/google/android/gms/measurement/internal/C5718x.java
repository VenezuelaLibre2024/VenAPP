package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.C0731a;
import com.google.android.gms.common.internal.C5276s;
import java.util.Iterator;
import java.util.Map;
import la.InterfaceC9461f;

/* renamed from: com.google.android.gms.measurement.internal.x */
/* loaded from: classes2.dex */
public final class C5718x extends C5746z3 {

    /* renamed from: b */
    private final Map<String, Long> f12013b;

    /* renamed from: c */
    private final Map<String, Integer> f12014c;

    /* renamed from: d */
    private long f12015d;

    public C5718x(C5712w5 c5712w5) {
        super(c5712w5);
        this.f12014c = new C0731a();
        this.f12013b = new C0731a();
    }

    /* renamed from: r */
    private final void m14529r(long j10, C5625p8 c5625p8) {
        if (c5625p8 == null) {
            zzj().m14186F().m14218a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            zzj().m14186F().m14219b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        C5537ib.m13982R(c5625p8, bundle, true);
        mo13695m().m13703u0("am", "_xa", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static /* synthetic */ void m14531t(C5718x c5718x, String str, long j10) {
        c5718x.mo13687i();
        C5276s.m13320f(str);
        if (c5718x.f12014c.isEmpty()) {
            c5718x.f12015d = j10;
        }
        Integer num = c5718x.f12014c.get(str);
        if (num != null) {
            c5718x.f12014c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c5718x.f12014c.size() >= 100) {
            c5718x.zzj().m14187G().m14218a("Too many ads visible");
        } else {
            c5718x.f12014c.put(str, 1);
            c5718x.f12013b.put(str, Long.valueOf(j10));
        }
    }

    /* renamed from: v */
    private final void m14532v(String str, long j10, C5625p8 c5625p8) {
        if (c5625p8 == null) {
            zzj().m14186F().m14218a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            zzj().m14186F().m14219b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        C5537ib.m13982R(c5625p8, bundle, true);
        mo13695m().m13703u0("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final void m14533w(long j10) {
        Iterator<String> it = this.f12013b.keySet().iterator();
        while (it.hasNext()) {
            this.f12013b.put(it.next(), Long.valueOf(j10));
        }
        if (this.f12013b.isEmpty()) {
            return;
        }
        this.f12015d = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static /* synthetic */ void m14534x(C5718x c5718x, String str, long j10) {
        c5718x.mo13687i();
        C5276s.m13320f(str);
        Integer num = c5718x.f12014c.get(str);
        if (num == null) {
            c5718x.zzj().m14182B().m14219b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C5625p8 m14213x = c5718x.mo13697n().m14213x(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            c5718x.f12014c.put(str, Integer.valueOf(intValue));
            return;
        }
        c5718x.f12014c.remove(str);
        Long l10 = c5718x.f12013b.get(str);
        if (l10 == null) {
            c5718x.zzj().m14182B().m14218a("First ad unit exposure time was never set");
        } else {
            long longValue = j10 - l10.longValue();
            c5718x.f12013b.remove(str);
            c5718x.m14532v(str, longValue, m14213x);
        }
        if (c5718x.f12014c.isEmpty()) {
            long j11 = c5718x.f12015d;
            if (j11 == 0) {
                c5718x.zzj().m14182B().m14218a("First ad exposure time was never set");
            } else {
                c5718x.m14529r(j10 - j11, m14213x);
                c5718x.f12015d = 0L;
            }
        }
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

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5718x mo13689j() {
        return super.mo13689j();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5530i4 mo13691k() {
        return super.mo13691k();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5569l4 mo13693l() {
        return super.mo13693l();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5442b7 mo13695m() {
        return super.mo13695m();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5612o8 mo13697n() {
        return super.mo13697n();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5703v8 mo13698o() {
        return super.mo13698o();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C5471da mo13699p() {
        return super.mo13699p();
    }

    /* renamed from: q */
    public final void m14535q(long j10) {
        C5625p8 m14213x = mo13697n().m14213x(false);
        for (String str : this.f12013b.keySet()) {
            m14532v(str, j10 - this.f12013b.get(str).longValue(), m14213x);
        }
        if (!this.f12013b.isEmpty()) {
            m14529r(j10 - this.f12015d, m14213x);
        }
        m14533w(j10);
    }

    /* renamed from: u */
    public final void m14536u(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().m14182B().m14218a("Ad unit id must be a non-empty string");
        } else {
            zzl().m14248y(new RunnableC5421a(this, str, j10));
        }
    }

    /* renamed from: y */
    public final void m14537y(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().m14182B().m14218a("Ad unit id must be a non-empty string");
        } else {
            zzl().m14248y(new RunnableC5720x1(this, str, j10));
        }
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
