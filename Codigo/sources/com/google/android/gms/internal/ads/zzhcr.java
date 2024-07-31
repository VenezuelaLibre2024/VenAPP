package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhcr extends zzhcp {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final /* synthetic */ int zza(Object obj) {
        return ((zzhcq) obj).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzhcq) obj).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgzu zzgzuVar = (zzgzu) obj;
        zzhcq zzhcqVar = zzgzuVar.zzc;
        if (zzhcqVar != zzhcq.zzc()) {
            return zzhcqVar;
        }
        zzhcq zzf = zzhcq.zzf();
        zzgzuVar.zzc = zzf;
        return zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzgzu) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzhcq.zzc().equals(obj2)) {
            return obj;
        }
        zzhcq zzhcqVar = (zzhcq) obj2;
        if (zzhcq.zzc().equals(obj)) {
            return zzhcq.zze((zzhcq) obj, zzhcqVar);
        }
        ((zzhcq) obj).zzd(zzhcqVar);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    final /* synthetic */ Object zzf() {
        return zzhcq.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    final /* synthetic */ Object zzg(Object obj) {
        ((zzhcq) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, int i11) {
        ((zzhcq) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i10, long j10) {
        ((zzhcq) obj).zzj((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i10, Object obj2) {
        ((zzhcq) obj).zzj((i10 << 3) | 3, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i10, zzgyl zzgylVar) {
        ((zzhcq) obj).zzj((i10 << 3) | 2, zzgylVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i10, long j10) {
        ((zzhcq) obj).zzj(i10 << 3, Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final void zzm(Object obj) {
        ((zzgzu) obj).zzc.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgzu) obj).zzc = (zzhcq) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgzu) obj).zzc = (zzhcq) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final boolean zzq(zzhbq zzhbqVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcp
    public final /* synthetic */ void zzr(Object obj, zzgzb zzgzbVar) {
        ((zzhcq) obj).zzk(zzgzbVar);
    }
}
