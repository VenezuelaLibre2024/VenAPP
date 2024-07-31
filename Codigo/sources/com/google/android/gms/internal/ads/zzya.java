package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
final class zzya extends zzyc implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /* JADX WARN: Multi-variable type inference failed */
    public zzya(int i10, zzcz zzczVar, int i11, zzxu zzxuVar, int i12, String str) {
        super(i10, zzczVar, i11);
        int i13;
        int i14 = 0;
        this.zzf = zzyg.zzo(i12, false);
        int i15 = this.zzd.zze;
        int i16 = zzxuVar.zzy;
        this.zzg = 1 == (i15 & 1);
        this.zzh = (i15 & 2) != 0;
        zzgaa zzm = zzxuVar.zzw.isEmpty() ? zzgaa.zzm("") : zzxuVar.zzw;
        int i17 = 0;
        while (true) {
            if (i17 >= zzm.size()) {
                i17 = a.e.API_PRIORITY_OTHER;
                i13 = 0;
                break;
            } else {
                i13 = zzyg.zzb(this.zzd, (String) zzm.get(i17), false);
                if (i13 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.zzi = i17;
        this.zzj = i13;
        int zza = zzyg.zza(this.zzd.zzf, zzxuVar.zzx);
        this.zzk = zza;
        this.zzm = (this.zzd.zzf & 1088) != 0;
        int zzb = zzyg.zzb(this.zzd, str, zzyg.zzh(str) == null);
        this.zzl = zzb;
        boolean z10 = i13 > 0 || (zzxuVar.zzw.isEmpty() && zza > 0) || this.zzg || (this.zzh && zzb > 0);
        if (zzyg.zzo(i12, zzxuVar.zzT) && z10) {
            i14 = 1;
        }
        this.zze = i14;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzya zzyaVar) {
        zzfzp zzb = zzfzp.zzk().zze(this.zzf, zzyaVar.zzf).zzd(Integer.valueOf(this.zzi), Integer.valueOf(zzyaVar.zzi), zzgbj.zzc().zza()).zzb(this.zzj, zzyaVar.zzj).zzb(this.zzk, zzyaVar.zzk).zze(this.zzg, zzyaVar.zzg).zzd(Boolean.valueOf(this.zzh), Boolean.valueOf(zzyaVar.zzh), this.zzj == 0 ? zzgbj.zzc() : zzgbj.zzc().zza()).zzb(this.zzl, zzyaVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zzf(this.zzm, zzyaVar.zzm);
        }
        return zzb.zza();
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
