package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzvb;

/* loaded from: classes2.dex */
public final class zzcy {
    public static final zzvb zzb;
    private static final zzvb zzf;
    private static final zzvb zzg;
    private static final zzvb zzh;
    public static final zzvb zza = zza(16);
    private static final zzvb zzc = zza(32);
    private static final zzvb zzd = zza(16, 16);
    private static final zzvb zze = zza(32, 16);

    static {
        zzub zzubVar = zzub.SHA256;
        zzb = zza(16, 16, 32, 16, zzubVar);
        zzf = zza(32, 16, 32, 32, zzubVar);
        zzvb.zza zza2 = zzvb.zza().zza(new zzfu().zze());
        zzvs zzvsVar = zzvs.TINK;
        zzg = (zzvb) ((zzajc) zza2.zza(zzvsVar).zzf());
        zzh = (zzvb) ((zzajc) zzvb.zza().zza(new zzhj().zze()).zza(zzvsVar).zzf());
    }

    private static zzvb zza(int i10) {
        return (zzvb) ((zzajc) zzvb.zza().zza(((zzsv) ((zzajc) zzsv.zzc().zza(i10).zzf())).zzi()).zza(new zzeo().zze()).zza(zzvs.TINK).zzf());
    }

    private static zzvb zza(int i10, int i11) {
        return (zzvb) ((zzajc) zzvb.zza().zza(((zzsq) ((zzajc) zzsq.zzb().zza(i10).zza((zzsr) ((zzajc) zzsr.zzb().zza(16).zzf())).zzf())).zzi()).zza(new zzdz().zze()).zza(zzvs.TINK).zzf());
    }

    private static zzvb zza(int i10, int i11, int i12, int i13, zzub zzubVar) {
        zzsj zzsjVar = (zzsj) ((zzajc) zzsj.zzb().zza((zzsm) ((zzajc) zzsm.zzb().zza(16).zzf())).zza(i10).zzf());
        return (zzvb) ((zzajc) zzvb.zza().zza(((zzsf) ((zzajc) zzsf.zza().zza(zzsjVar).zza((zzug) ((zzajc) zzug.zzc().zza((zzuh) ((zzajc) zzuh.zzc().zza(zzubVar).zza(i13).zzf())).zza(32).zzf())).zzf())).zzi()).zza(new zzdi().zze()).zza(zzvs.TINK).zzf());
    }
}
