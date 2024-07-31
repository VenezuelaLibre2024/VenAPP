package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zztn;

/* loaded from: classes2.dex */
public final class zzkt {
    public static final zzvb zza;
    private static final byte[] zzb;
    private static final zzvb zzc;
    private static final zzvb zzd;

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzty zztyVar = zzty.NIST_P256;
        zzub zzubVar = zzub.SHA256;
        zztk zztkVar = zztk.UNCOMPRESSED;
        zzvb zzvbVar = zzcy.zza;
        zzvs zzvsVar = zzvs.TINK;
        zza = zza(zztyVar, zzubVar, zztkVar, zzvbVar, zzvsVar, bArr);
        zzc = zza(zztyVar, zzubVar, zztk.COMPRESSED, zzvbVar, zzvs.RAW, bArr);
        zzd = zza(zztyVar, zzubVar, zztkVar, zzcy.zzb, zzvsVar, bArr);
    }

    @Deprecated
    private static zzvb zza(zzty zztyVar, zzub zzubVar, zztk zztkVar, zzvb zzvbVar, zzvs zzvsVar, byte[] bArr) {
        zztn.zza zza2 = zztn.zza();
        zztv zztvVar = (zztv) ((zzajc) zztv.zza().zza(zztyVar).zza(zzubVar).zza(zzahp.zza(bArr)).zzf());
        return (zzvb) ((zzajc) zzvb.zza().zza(new zzji().zze()).zza(zzvsVar).zza(((zztn) ((zzajc) zza2.zza((zztq) ((zzajc) zztq.zzc().zza(zztvVar).zza((zztm) ((zzajc) zztm.zza().zza(zzvbVar).zzf())).zza(zztkVar).zzf())).zzf())).zzi()).zzf());
    }
}
