package com.google.android.recaptcha.internal;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzgb extends zzga {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final int zza(Map.Entry entry) {
        return ((zzgl) entry.getKey()).zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final zzge zzb(Object obj) {
        return ((zzgk) obj).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final zzge zzc(Object obj) {
        return ((zzgk) obj).zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final Object zzd(zzfz zzfzVar, zzhy zzhyVar, int i10) {
        return zzfzVar.zza(zzhyVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    @Override // com.google.android.recaptcha.internal.zzga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(java.lang.Object r2, com.google.android.recaptcha.internal.zzik r3, java.lang.Object r4, com.google.android.recaptcha.internal.zzfz r5, com.google.android.recaptcha.internal.zzge r6, java.lang.Object r7, com.google.android.recaptcha.internal.zzjf r8) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgb.zze(java.lang.Object, com.google.android.recaptcha.internal.zzik, java.lang.Object, com.google.android.recaptcha.internal.zzfz, com.google.android.recaptcha.internal.zzge, java.lang.Object, com.google.android.recaptcha.internal.zzjf):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzf(Object obj) {
        ((zzgk) obj).zzb.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzg(zzik zzikVar, Object obj, zzfz zzfzVar, zzge zzgeVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzh(zzez zzezVar, Object obj, zzfz zzfzVar, zzge zzgeVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzi(zzjx zzjxVar, Map.Entry entry) {
        zzgl zzglVar = (zzgl) entry.getKey();
        zzjv zzjvVar = zzjv.zza;
        switch (zzglVar.zzb.ordinal()) {
            case 0:
                zzjxVar.zzf(zzglVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzjxVar.zzo(zzglVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzjxVar.zzt(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzjxVar.zzK(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzjxVar.zzr(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzjxVar.zzm(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzjxVar.zzk(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzjxVar.zzb(zzglVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzjxVar.zzG(zzglVar.zza, (String) entry.getValue());
                return;
            case 9:
                zzjxVar.zzq(zzglVar.zza, entry.getValue(), zzih.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzjxVar.zzv(zzglVar.zza, entry.getValue(), zzih.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzjxVar.zzd(zzglVar.zza, (zzez) entry.getValue());
                return;
            case 12:
                zzjxVar.zzI(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzjxVar.zzr(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzjxVar.zzx(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzjxVar.zzz(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzjxVar.zzB(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzjxVar.zzD(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final boolean zzj(zzhy zzhyVar) {
        return zzhyVar instanceof zzgk;
    }
}
