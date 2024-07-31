package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;
import wa.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f9924a;

    public c(b0 b0Var) {
        super();
        s.j(b0Var);
        this.f9924a = b0Var;
    }

    @Override // wa.b0
    public final void a(String str, String str2, Bundle bundle) {
        this.f9924a.a(str, str2, bundle);
    }

    @Override // wa.b0
    public final List<Bundle> b(String str, String str2) {
        return this.f9924a.b(str, str2);
    }

    @Override // wa.b0
    public final void c(String str, String str2, Bundle bundle) {
        this.f9924a.c(str, str2, bundle);
    }

    @Override // wa.b0
    public final Map<String, Object> d(String str, String str2, boolean z10) {
        return this.f9924a.d(str, str2, z10);
    }

    @Override // wa.b0
    public final int zza(String str) {
        return this.f9924a.zza(str);
    }

    @Override // wa.b0
    public final long zza() {
        return this.f9924a.zza();
    }

    @Override // wa.b0
    public final void zza(Bundle bundle) {
        this.f9924a.zza(bundle);
    }

    @Override // wa.b0
    public final void zzb(String str) {
        this.f9924a.zzb(str);
    }

    @Override // wa.b0
    public final void zzc(String str) {
        this.f9924a.zzc(str);
    }

    @Override // wa.b0
    public final String zzf() {
        return this.f9924a.zzf();
    }

    @Override // wa.b0
    public final String zzg() {
        return this.f9924a.zzg();
    }

    @Override // wa.b0
    public final String zzh() {
        return this.f9924a.zzh();
    }

    @Override // wa.b0
    public final String zzi() {
        return this.f9924a.zzi();
    }
}
