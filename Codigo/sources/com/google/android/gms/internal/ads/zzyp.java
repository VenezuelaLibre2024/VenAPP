package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzyp {
    public final int zza;
    public final zzmi[] zzb;
    public final zzyi[] zzc;
    public final zzdk zzd;
    public final Object zze;

    public zzyp(zzmi[] zzmiVarArr, zzyi[] zzyiVarArr, zzdk zzdkVar, Object obj) {
        this.zzb = zzmiVarArr;
        this.zzc = (zzyi[]) zzyiVarArr.clone();
        this.zzd = zzdkVar;
        this.zze = obj;
        this.zza = zzmiVarArr.length;
    }

    public final boolean zza(zzyp zzypVar, int i10) {
        return zzypVar != null && zzfy.zzF(this.zzb[i10], zzypVar.zzb[i10]) && zzfy.zzF(this.zzc[i10], zzypVar.zzc[i10]);
    }

    public final boolean zzb(int i10) {
        return this.zzb[i10] != null;
    }
}
