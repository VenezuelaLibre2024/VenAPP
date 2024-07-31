package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhaw implements zzhbz {
    private static final zzhbc zza = new zzhau();
    private final zzhbc zzb;

    public zzhaw() {
        zzhbc zzhbcVar;
        zzhbc[] zzhbcVarArr = new zzhbc[2];
        zzhbcVarArr[0] = zzgzo.zza();
        try {
            zzhbcVar = (zzhbc) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzhbcVar = zza;
        }
        zzhbcVarArr[1] = zzhbcVar;
        zzhav zzhavVar = new zzhav(zzhbcVarArr);
        byte[] bArr = zzhae.zzd;
        this.zzb = zzhavVar;
    }

    private static boolean zzb(zzhbb zzhbbVar) {
        return zzhbbVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhbz
    public final zzhby zza(Class cls) {
        zzhbj zza2;
        zzhas zzd;
        zzhcp zzm;
        zzgzg zza3;
        zzhaz zza4;
        zzhcp zzm2;
        zzgzg zza5;
        zzhca.zzr(cls);
        zzhbb zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzgzu.class.isAssignableFrom(cls)) {
                zzm2 = zzhca.zzn();
                zza5 = zzgzi.zzb();
            } else {
                zzm2 = zzhca.zzm();
                zza5 = zzgzi.zza();
            }
            return zzhbi.zzc(zzm2, zza5, zzb.zza());
        }
        if (zzgzu.class.isAssignableFrom(cls)) {
            boolean zzb2 = zzb(zzb);
            zza2 = zzhbk.zzb();
            zzd = zzhas.zze();
            zzm = zzhca.zzn();
            zza3 = zzb2 ? zzgzi.zzb() : null;
            zza4 = zzhba.zzb();
        } else {
            boolean zzb3 = zzb(zzb);
            zza2 = zzhbk.zza();
            zzd = zzhas.zzd();
            zzm = zzhca.zzm();
            zza3 = zzb3 ? zzgzi.zza() : null;
            zza4 = zzhba.zza();
        }
        return zzhbh.zzl(cls, zzb, zza2, zzd, zzm, zza3, zza4);
    }
}
