package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.List;
import java.util.Map;
import wa.b0;

/* loaded from: classes.dex */
final class c implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ zzdf f11587a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(zzdf zzdfVar) {
        this.f11587a = zzdfVar;
    }

    @Override // wa.b0
    public final void a(String str, String str2, Bundle bundle) {
        this.f11587a.zza(str, str2, bundle);
    }

    @Override // wa.b0
    public final List<Bundle> b(String str, String str2) {
        return this.f11587a.zza(str, str2);
    }

    @Override // wa.b0
    public final void c(String str, String str2, Bundle bundle) {
        this.f11587a.zzb(str, str2, bundle);
    }

    @Override // wa.b0
    public final Map<String, Object> d(String str, String str2, boolean z10) {
        return this.f11587a.zza(str, str2, z10);
    }

    @Override // wa.b0
    public final int zza(String str) {
        return this.f11587a.zza(str);
    }

    @Override // wa.b0
    public final long zza() {
        return this.f11587a.zza();
    }

    @Override // wa.b0
    public final void zza(Bundle bundle) {
        this.f11587a.zza(bundle);
    }

    @Override // wa.b0
    public final void zzb(String str) {
        this.f11587a.zzb(str);
    }

    @Override // wa.b0
    public final void zzc(String str) {
        this.f11587a.zzc(str);
    }

    @Override // wa.b0
    public final String zzf() {
        return this.f11587a.zzf();
    }

    @Override // wa.b0
    public final String zzg() {
        return this.f11587a.zzg();
    }

    @Override // wa.b0
    public final String zzh() {
        return this.f11587a.zzh();
    }

    @Override // wa.b0
    public final String zzi() {
        return this.f11587a.zzi();
    }
}
