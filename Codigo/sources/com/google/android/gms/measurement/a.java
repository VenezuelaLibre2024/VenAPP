package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.b7;
import com.google.android.gms.measurement.internal.w5;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    private final w5 f9922a;

    /* renamed from: b, reason: collision with root package name */
    private final b7 f9923b;

    public a(w5 w5Var) {
        super();
        s.j(w5Var);
        this.f9922a = w5Var;
        this.f9923b = w5Var.C();
    }

    @Override // wa.b0
    public final void a(String str, String str2, Bundle bundle) {
        this.f9922a.C().Q(str, str2, bundle);
    }

    @Override // wa.b0
    public final List<Bundle> b(String str, String str2) {
        return this.f9923b.x(str, str2);
    }

    @Override // wa.b0
    public final void c(String str, String str2, Bundle bundle) {
        this.f9923b.s0(str, str2, bundle);
    }

    @Override // wa.b0
    public final Map<String, Object> d(String str, String str2, boolean z10) {
        return this.f9923b.y(str, str2, z10);
    }

    @Override // wa.b0
    public final int zza(String str) {
        s.f(str);
        return 25;
    }

    @Override // wa.b0
    public final long zza() {
        return this.f9922a.G().K0();
    }

    @Override // wa.b0
    public final void zza(Bundle bundle) {
        this.f9923b.p0(bundle);
    }

    @Override // wa.b0
    public final void zzb(String str) {
        this.f9922a.t().u(str, this.f9922a.zzb().b());
    }

    @Override // wa.b0
    public final void zzc(String str) {
        this.f9922a.t().y(str, this.f9922a.zzb().b());
    }

    @Override // wa.b0
    public final String zzf() {
        return this.f9923b.d0();
    }

    @Override // wa.b0
    public final String zzg() {
        return this.f9923b.e0();
    }

    @Override // wa.b0
    public final String zzh() {
        return this.f9923b.f0();
    }

    @Override // wa.b0
    public final String zzi() {
        return this.f9923b.d0();
    }
}
