package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzif;
import com.google.android.gms.internal.p498firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgg extends zznb<zzvo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgg() {
        super(zzvo.class, new zzgj(zzbg.class));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ zzvo zza(zzahp zzahpVar) {
        return zzvo.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzvo zzvoVar) {
        zzvo zzvoVar2 = zzvoVar;
        zzxo.zza(zzvoVar2.zza(), 0);
        if (zzgh.zza(zzvoVar2.zzd().zza().zzf())) {
            return;
        }
        throw new GeneralSecurityException("Unsupported DEK key type: " + zzvoVar2.zzd().zza().zzf() + ". Only Tink AEAD key types are supported.");
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzne<?, zzvo> zzc() {
        return new zzgi(this, zzvr.class);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.REMOTE;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }
}
