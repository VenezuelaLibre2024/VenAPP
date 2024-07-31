package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcp;
import la.InterfaceC9461f;

/* renamed from: com.google.android.gms.measurement.internal.da */
/* loaded from: classes2.dex */
public final class C5471da extends AbstractC5733y2 {

    /* renamed from: c */
    private Handler f11201c;

    /* renamed from: d */
    private boolean f11202d;

    /* renamed from: e */
    protected final C5575la f11203e;

    /* renamed from: f */
    protected final C5549ja f11204f;

    /* renamed from: g */
    private final C5536ia f11205g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5471da(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11202d = true;
        this.f11203e = new C5575la(this);
        this.f11204f = new C5549ja(this);
        this.f11205g = new C5536ia(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m13722B() {
        mo13687i();
        if (this.f11201c == null) {
            this.f11201c = new zzcp(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static /* synthetic */ void m13724D(C5471da c5471da, long j10) {
        c5471da.mo13687i();
        c5471da.m13722B();
        c5471da.zzj().m14186F().m14219b("Activity resumed, time", Long.valueOf(j10));
        if (!c5471da.mo13672a().m13900n(C5474e0.f11240Q0) ? c5471da.mo13672a().m13892L() || c5471da.mo13679e().f12068s.m13640b() : c5471da.mo13672a().m13892L() || c5471da.f11202d) {
            c5471da.f11204f.m14062f(j10);
        }
        c5471da.f11205g.m13968a();
        C5575la c5575la = c5471da.f11203e;
        c5575la.f11537a.mo13687i();
        if (c5575la.f11537a.f11899a.m14512k()) {
            c5575la.m14085b(c5575la.f11537a.zzb().mo28130a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static /* synthetic */ void m13726x(C5471da c5471da, long j10) {
        c5471da.mo13687i();
        c5471da.m13722B();
        c5471da.zzj().m14186F().m14219b("Activity paused, time", Long.valueOf(j10));
        c5471da.f11205g.m13969b(j10);
        if (c5471da.mo13672a().m13892L()) {
            c5471da.f11204f.m14061e(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean m13727A() {
        mo13687i();
        return this.f11202d;
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

    @Override // com.google.android.gms.measurement.internal.AbstractC5733y2
    /* renamed from: v */
    protected final boolean mo13704v() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final void m13728y(boolean z10) {
        mo13687i();
        this.f11202d = z10;
    }

    /* renamed from: z */
    public final boolean m13729z(boolean z10, boolean z11, long j10) {
        return this.f11204f.m14060d(z10, z11, j10);
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
