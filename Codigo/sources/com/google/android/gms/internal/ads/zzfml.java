package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzfml implements zzdhz, zzdbn, zzdid {
    private final zzfmz zza;
    private final zzfmo zzb;

    public zzfml(Context context, zzfmz zzfmzVar) {
        this.zza = zzfmzVar;
        this.zzb = zzfmn.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdid
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdid
    public final void zzb() {
        if (((Boolean) zzbht.zzd.zze()).booleanValue()) {
            zzfmz zzfmzVar = this.zza;
            zzfmo zzfmoVar = this.zzb;
            zzfmoVar.zzf(true);
            zzfmzVar.zza(zzfmoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhz
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhz
    public final void zzl() {
        if (((Boolean) zzbht.zzd.zze()).booleanValue()) {
            this.zzb.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbn
    public final void zzp(c3 c3Var) {
        if (((Boolean) zzbht.zzd.zze()).booleanValue()) {
            zzfmz zzfmzVar = this.zza;
            zzfmo zzfmoVar = this.zzb;
            zzfmoVar.zzc(c3Var.u1().toString());
            zzfmoVar.zzf(false);
            zzfmzVar.zza(zzfmoVar);
        }
    }
}
