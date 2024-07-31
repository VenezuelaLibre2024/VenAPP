package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzeb extends zzne<zzsq, zzsn> {
    private final /* synthetic */ zzdz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzdz zzdzVar, Class cls) {
        super(cls);
        this.zza = zzdzVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzne
    public final /* synthetic */ zzsq zza(zzahp zzahpVar) {
        return zzsq.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzne
    public final /* synthetic */ zzsn zza(zzsq zzsqVar) {
        zzsq zzsqVar2 = zzsqVar;
        return (zzsn) ((zzajc) zzsn.zzb().zza(zzahp.zza(zzou.zza(zzsqVar2.zza()))).zza(zzsqVar2.zzd()).zza(0).zzf());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzne
    public final /* synthetic */ void zzb(zzsq zzsqVar) {
        zzsq zzsqVar2 = zzsqVar;
        zzxo.zza(zzsqVar2.zza());
        if (zzsqVar2.zzd().zza() != 12 && zzsqVar2.zzd().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
