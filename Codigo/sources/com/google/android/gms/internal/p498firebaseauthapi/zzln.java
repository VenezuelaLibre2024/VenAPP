package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzif;
import com.google.android.gms.internal.p498firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzln extends zzop<zzuu, zzuv> {
    public zzln() {
        super(zzuu.class, zzuv.class, new zzlm(zzbo.class));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ zzakn zza(zzahp zzahpVar) {
        return zzuu.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzakn zzaknVar) {
        zzuu zzuuVar = (zzuu) zzaknVar;
        if (zzuuVar.zze().zze()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!zzuuVar.zzf()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        zzxo.zza(zzuuVar.zza(), 0);
        zzlt.zza(zzuuVar.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzop
    public final /* synthetic */ zzuv zzb(zzuu zzuuVar) {
        return zzuuVar.zzd();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzne<zzuq, zzuu> zzc() {
        return new zzlp(this, zzuq.class);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }
}
