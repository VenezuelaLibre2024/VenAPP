package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbsk extends zzclb {
    private final va.a zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsk(va.a aVar) {
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final int zzb(String str) {
        return this.zza.l(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final long zzc() {
        return this.zza.d();
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final Bundle zzd(Bundle bundle) {
        return this.zza.p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final String zze() {
        return this.zza.e();
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final String zzf() {
        return this.zza.f();
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final String zzg() {
        return this.zza.h();
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final String zzh() {
        return this.zza.i();
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final String zzi() {
        return this.zza.j();
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final List zzj(String str, String str2) {
        return this.zza.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final Map zzk(String str, String str2, boolean z10) {
        return this.zza.m(str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final void zzl(String str) {
        this.zza.a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final void zzm(String str, String str2, Bundle bundle) {
        this.zza.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final void zzn(String str) {
        this.zza.c(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final void zzo(String str, String str2, Bundle bundle) {
        this.zza.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final void zzp(Bundle bundle) {
        this.zza.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final void zzq(Bundle bundle) {
        this.zza.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final void zzr(Bundle bundle) {
        this.zza.s(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final void zzs(com.google.android.gms.dynamic.b bVar, String str, String str2) {
        this.zza.t(bVar != null ? (Activity) com.google.android.gms.dynamic.d.g2(bVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzclc
    public final void zzt(String str, String str2, com.google.android.gms.dynamic.b bVar) {
        this.zza.u(str, str2, bVar != null ? com.google.android.gms.dynamic.d.g2(bVar) : null);
    }
}
