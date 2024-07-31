package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
final class zzis extends zzne<zztd, zztc> {
    private final /* synthetic */ zzin zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzis(zzin zzinVar, Class cls) {
        super(cls);
        this.zza = zzinVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzne
    public final /* synthetic */ zztd zza(zzahp zzahpVar) {
        return zztd.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzne
    public final /* synthetic */ zztc zza(zztd zztdVar) {
        return (zztc) ((zzajc) zztc.zzb().zza(zzahp.zza(zzou.zza(zztdVar.zza()))).zza(zzin.zza()).zzf());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzne
    public final /* synthetic */ void zzb(zztd zztdVar) {
        zztd zztdVar2 = zztdVar;
        if (zztdVar2.zza() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + zztdVar2.zza() + ". Valid keys must have 64 bytes.");
    }
}
