package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzdq extends zzdp {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final int zza(Map.Entry entry) {
        return ((zzea) entry.getKey()).zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final zzdt zzb(Object obj) {
        return ((zzdz) obj).zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final zzdt zzc(Object obj) {
        return ((zzdz) obj).zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final Object zzd(zzdo zzdoVar, zzfo zzfoVar, int i10) {
        return zzdoVar.zzb(zzfoVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final void zze(Object obj) {
        ((zzdz) obj).zza.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final void zzf(zzhq zzhqVar, Map.Entry entry) {
        zzea zzeaVar = (zzea) entry.getKey();
        zzho zzhoVar = zzho.zza;
        switch (zzeaVar.zzb.ordinal()) {
            case 0:
                zzhqVar.zzf(zzeaVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzhqVar.zzo(zzeaVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzhqVar.zzt(zzeaVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzhqVar.zzK(zzeaVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzhqVar.zzr(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzhqVar.zzm(zzeaVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzhqVar.zzk(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzhqVar.zzb(zzeaVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzhqVar.zzG(zzeaVar.zza, (String) entry.getValue());
                return;
            case 9:
                zzhqVar.zzq(zzeaVar.zza, entry.getValue(), zzfx.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzhqVar.zzv(zzeaVar.zza, entry.getValue(), zzfx.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzhqVar.zzd(zzeaVar.zza, (zzdb) entry.getValue());
                return;
            case 12:
                zzhqVar.zzI(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzhqVar.zzr(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzhqVar.zzx(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzhqVar.zzz(zzeaVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzhqVar.zzB(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzhqVar.zzD(zzeaVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final boolean zzg(zzfo zzfoVar) {
        return zzfoVar instanceof zzdz;
    }
}
