package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzqj extends zzne<zzug, zzuc> {
    private final /* synthetic */ zzqg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqj(zzqg zzqgVar, Class cls) {
        super(cls);
        this.zza = zzqgVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzne
    public final /* synthetic */ zzug zza(zzahp zzahpVar) {
        return zzug.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzne
    public final /* synthetic */ zzuc zza(zzug zzugVar) {
        zzug zzugVar2 = zzugVar;
        return (zzuc) ((zzajc) zzuc.zzb().zza(zzqg.zza()).zza(zzugVar2.zzf()).zza(zzahp.zza(zzou.zza(zzugVar2.zza()))).zzf());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzne
    public final /* synthetic */ void zzb(zzug zzugVar) {
        zzug zzugVar2 = zzugVar;
        if (zzugVar2.zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzqg.zzb(zzugVar2.zzf());
    }
}
