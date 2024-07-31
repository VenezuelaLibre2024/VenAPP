package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzi {
    public static final zzi zza;
    public static final zzi zzb;
    public static final zzi zzc;
    private final boolean zzd;
    private final boolean zze = false;
    private final zzar zzf;

    static {
        zzf zzfVar = null;
        zzg zzgVar = new zzg(zzfVar);
        zzgVar.zzb();
        zza = zzgVar.zzd();
        zzg zzgVar2 = new zzg(zzfVar);
        zzgVar2.zzb();
        zzgVar2.zza(new zze());
        zzb = zzgVar2.zzd();
        zzg zzgVar3 = new zzg(zzfVar);
        zzgVar3.zzc();
        zzc = zzgVar3.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzi(boolean z10, boolean z11, zzar zzarVar, zzh zzhVar) {
        this.zzd = z10;
        this.zzf = zzarVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zza(zzi zziVar) {
        boolean z10 = zziVar.zze;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zzc(zzi zziVar, Context context, zzr zzrVar) {
        zzar zzarVar = zziVar.zzf;
        int size = zzarVar.size();
        int i10 = 0;
        while (i10 < size) {
            int zza2 = ((zzs) zzarVar.get(i10)).zza(context, zzrVar, zziVar.zzd) - 1;
            i10++;
            if (zza2 == 1) {
                return 2;
            }
        }
        return 3;
    }
}
