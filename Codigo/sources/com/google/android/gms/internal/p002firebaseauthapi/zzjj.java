package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzif;
import com.google.android.gms.internal.p002firebaseauthapi.zzuy;

/* loaded from: classes2.dex */
final class zzjj extends zznb<zztu> {
    public zzjj() {
        super(zztu.class, new zzjm(zzbr.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ zztu zza(zzahp zzahpVar) {
        return zztu.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ void zza(zztu zztuVar) {
        zztu zztuVar2 = zztuVar;
        zzxo.zza(zztuVar2.zza(), 0);
        zzkx.zza(zztuVar2.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }
}
