package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
final class zzxn extends zzyc implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxu zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Multi-variable type inference failed */
    public zzxn(int i10, zzcz zzczVar, int i11, zzxu zzxuVar, int i12, boolean z10, zzfxf zzfxfVar, int i13) {
        super(i10, zzczVar, i11);
        int i14;
        int i15;
        int i16;
        boolean z11;
        this.zzh = zzxuVar;
        int i17 = 1;
        int i18 = true != zzxuVar.zzR ? 16 : 24;
        this.zzg = zzyg.zzh(this.zzd.zzd);
        this.zzi = zzyg.zzo(i12, false);
        int i19 = 0;
        while (true) {
            int size = zzxuVar.zzq.size();
            i14 = a.e.API_PRIORITY_OTHER;
            if (i19 >= size) {
                i15 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            } else {
                i15 = zzyg.zzb(this.zzd, (String) zzxuVar.zzq.get(i19), false);
                if (i15 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.zzk = i19;
        this.zzj = i15;
        this.zzl = zzyg.zza(this.zzd.zzf, 0);
        zzam zzamVar = this.zzd;
        int i20 = zzamVar.zzf;
        this.zzm = i20 == 0 || (i20 & 1) != 0;
        this.zzp = 1 == (zzamVar.zze & 1);
        this.zzq = zzamVar.zzz;
        this.zzr = zzamVar.zzA;
        this.zzs = zzamVar.zzi;
        this.zzf = zzfxfVar.zza(zzamVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = zzfy.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i21 = 0; i21 < split.length; i21++) {
            split[i21] = zzfy.zzC(split[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 >= split.length) {
                i16 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            } else {
                i16 = zzyg.zzb(this.zzd, split[i22], false);
                if (i16 > 0) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.zzn = i22;
        this.zzo = i16;
        int i23 = 0;
        while (true) {
            if (i23 >= zzxuVar.zzu.size()) {
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzxuVar.zzu.get(i23))) {
                i14 = i23;
                break;
            }
            i23++;
        }
        this.zzt = i14;
        this.zzu = (i12 & 384) == 128;
        this.zzv = (i12 & 64) == 64;
        zzxu zzxuVar2 = this.zzh;
        if (!zzyg.zzo(i12, zzxuVar2.zzT) || (!(z11 = this.zzf) && !zzxuVar2.zzM)) {
            i17 = 0;
        } else if (zzyg.zzo(i12, false) && z11 && this.zzd.zzi != -1 && ((zzxuVar2.zzV || !z10) && (i18 & i12) != 0)) {
            i17 = 2;
        }
        this.zze = i17;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxn zzxnVar) {
        zzgbj zzgbjVar;
        zzgbj zza;
        zzgbj zzgbjVar2;
        if (this.zzf && this.zzi) {
            zza = zzyg.zzc;
        } else {
            zzgbjVar = zzyg.zzc;
            zza = zzgbjVar.zza();
        }
        zzfzp zzd = zzfzp.zzk().zze(this.zzi, zzxnVar.zzi).zzd(Integer.valueOf(this.zzk), Integer.valueOf(zzxnVar.zzk), zzgbj.zzc().zza()).zzb(this.zzj, zzxnVar.zzj).zzb(this.zzl, zzxnVar.zzl).zze(this.zzp, zzxnVar.zzp).zze(this.zzm, zzxnVar.zzm).zzd(Integer.valueOf(this.zzn), Integer.valueOf(zzxnVar.zzn), zzgbj.zzc().zza()).zzb(this.zzo, zzxnVar.zzo).zze(this.zzf, zzxnVar.zzf).zzd(Integer.valueOf(this.zzt), Integer.valueOf(zzxnVar.zzt), zzgbj.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzxnVar.zzs);
        boolean z10 = this.zzh.zzB;
        zzgbjVar2 = zzyg.zzd;
        zzfzp zzd2 = zzd.zzd(valueOf, valueOf2, zzgbjVar2).zze(this.zzu, zzxnVar.zzu).zze(this.zzv, zzxnVar.zzv).zzd(Integer.valueOf(this.zzq), Integer.valueOf(zzxnVar.zzq), zza).zzd(Integer.valueOf(this.zzr), Integer.valueOf(zzxnVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzxnVar.zzs);
        if (!zzfy.zzF(this.zzg, zzxnVar.zzg)) {
            zza = zzyg.zzd;
        }
        return zzd2.zzd(valueOf3, valueOf4, zza).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final /* bridge */ /* synthetic */ boolean zzc(zzyc zzycVar) {
        String str;
        zzxn zzxnVar = (zzxn) zzycVar;
        boolean z10 = this.zzh.zzP;
        zzam zzamVar = this.zzd;
        int i10 = zzamVar.zzz;
        if (i10 == -1) {
            return false;
        }
        zzam zzamVar2 = zzxnVar.zzd;
        if (i10 != zzamVar2.zzz || (str = zzamVar.zzm) == null || !TextUtils.equals(str, zzamVar2.zzm)) {
            return false;
        }
        boolean z11 = this.zzh.zzO;
        int i11 = this.zzd.zzA;
        return i11 != -1 && i11 == zzxnVar.zzd.zzA && this.zzu == zzxnVar.zzu && this.zzv == zzxnVar.zzv;
    }
}
