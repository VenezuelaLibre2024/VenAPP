package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzxo extends zzyc implements Comparable {
    private final int zze;
    private final int zzf;

    public zzxo(int i10, zzcz zzczVar, int i11, zzxu zzxuVar, int i12) {
        super(i10, zzczVar, i11);
        this.zze = zzyg.zzo(i12, zzxuVar.zzT) ? 1 : 0;
        this.zzf = this.zzd.zza();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxo zzxoVar) {
        return Integer.compare(this.zzf, zzxoVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final /* bridge */ /* synthetic */ boolean zzc(zzyc zzycVar) {
        return false;
    }
}
