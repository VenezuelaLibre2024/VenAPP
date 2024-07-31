package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class x extends z3 {

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f10798b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f10799c;

    /* renamed from: d, reason: collision with root package name */
    private long f10800d;

    public x(w5 w5Var) {
        super(w5Var);
        this.f10799c = new androidx.collection.a();
        this.f10798b = new androidx.collection.a();
    }

    private final void r(long j10, p8 p8Var) {
        if (p8Var == null) {
            zzj().F().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            zzj().F().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        ib.R(p8Var, bundle, true);
        m().u0("am", "_xa", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void t(x xVar, String str, long j10) {
        xVar.i();
        com.google.android.gms.common.internal.s.f(str);
        if (xVar.f10799c.isEmpty()) {
            xVar.f10800d = j10;
        }
        Integer num = xVar.f10799c.get(str);
        if (num != null) {
            xVar.f10799c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (xVar.f10799c.size() >= 100) {
            xVar.zzj().G().a("Too many ads visible");
        } else {
            xVar.f10799c.put(str, 1);
            xVar.f10798b.put(str, Long.valueOf(j10));
        }
    }

    private final void v(String str, long j10, p8 p8Var) {
        if (p8Var == null) {
            zzj().F().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            zzj().F().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        ib.R(p8Var, bundle, true);
        m().u0("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(long j10) {
        Iterator<String> it = this.f10798b.keySet().iterator();
        while (it.hasNext()) {
            this.f10798b.put(it.next(), Long.valueOf(j10));
        }
        if (this.f10798b.isEmpty()) {
            return;
        }
        this.f10800d = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void x(x xVar, String str, long j10) {
        xVar.i();
        com.google.android.gms.common.internal.s.f(str);
        Integer num = xVar.f10799c.get(str);
        if (num == null) {
            xVar.zzj().B().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        p8 x10 = xVar.n().x(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            xVar.f10799c.put(str, Integer.valueOf(intValue));
            return;
        }
        xVar.f10799c.remove(str);
        Long l10 = xVar.f10798b.get(str);
        if (l10 == null) {
            xVar.zzj().B().a("First ad unit exposure time was never set");
        } else {
            long longValue = j10 - l10.longValue();
            xVar.f10798b.remove(str);
            xVar.v(str, longValue, x10);
        }
        if (xVar.f10799c.isEmpty()) {
            long j11 = xVar.f10800d;
            if (j11 == 0) {
                xVar.zzj().B().a("First ad exposure time was never set");
            } else {
                xVar.r(j10 - j11, x10);
                xVar.f10800d = 0L;
            }
        }
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

    public final void q(long j10) {
        p8 x10 = n().x(false);
        for (String str : this.f10798b.keySet()) {
            v(str, j10 - this.f10798b.get(str).longValue(), x10);
        }
        if (!this.f10798b.isEmpty()) {
            r(j10 - this.f10800d, x10);
        }
        w(j10);
    }

    public final void u(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().B().a("Ad unit id must be a non-empty string");
        } else {
            zzl().y(new a(this, str, j10));
        }
    }

    public final void y(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().B().a("Ad unit id must be a non-empty string");
        } else {
            zzl().y(new x1(this, str, j10));
        }
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
