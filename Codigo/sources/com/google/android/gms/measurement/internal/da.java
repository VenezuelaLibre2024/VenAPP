package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcp;

/* loaded from: classes2.dex */
public final class da extends y2 {

    /* renamed from: c */
    private Handler f10081c;

    /* renamed from: d */
    private boolean f10082d;

    /* renamed from: e */
    protected final la f10083e;

    /* renamed from: f */
    protected final ja f10084f;

    /* renamed from: g */
    private final ia f10085g;

    public da(w5 w5Var) {
        super(w5Var);
        this.f10082d = true;
        this.f10083e = new la(this);
        this.f10084f = new ja(this);
        this.f10085g = new ia(this);
    }

    public final void B() {
        i();
        if (this.f10081c == null) {
            this.f10081c = new zzcp(Looper.getMainLooper());
        }
    }

    public static /* synthetic */ void D(da daVar, long j10) {
        daVar.i();
        daVar.B();
        daVar.zzj().F().b("Activity resumed, time", Long.valueOf(j10));
        if (!daVar.a().n(e0.Q0) ? daVar.a().L() || daVar.e().f10853s.b() : daVar.a().L() || daVar.f10082d) {
            daVar.f10084f.f(j10);
        }
        daVar.f10085g.a();
        la laVar = daVar.f10083e;
        laVar.f10365a.i();
        if (laVar.f10365a.f10701a.k()) {
            laVar.b(laVar.f10365a.zzb().a(), false);
        }
    }

    public static /* synthetic */ void x(da daVar, long j10) {
        daVar.i();
        daVar.B();
        daVar.zzj().F().b("Activity paused, time", Long.valueOf(j10));
        daVar.f10085g.b(j10);
        if (daVar.a().L()) {
            daVar.f10084f.e(j10);
        }
    }

    public final boolean A() {
        i();
        return this.f10082d;
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

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ x j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ i4 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ l4 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ b7 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ o8 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ v8 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ da p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean v() {
        return false;
    }

    public final void y(boolean z10) {
        i();
        this.f10082d = z10;
    }

    public final boolean z(boolean z10, boolean z11, long j10) {
        return this.f10084f.d(z10, z11, j10);
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
