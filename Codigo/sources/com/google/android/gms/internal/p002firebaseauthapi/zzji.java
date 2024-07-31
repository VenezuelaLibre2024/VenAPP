package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzif;
import com.google.android.gms.internal.p002firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzji extends zzop<zztr, zztu> {
    public zzji() {
        super(zztr.class, zztu.class, new zzjh(zzbo.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ zzakn zza(zzahp zzahpVar) {
        return zztr.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzakn zzaknVar) {
        zztr zztrVar = (zztr) zzaknVar;
        if (zztrVar.zze().zze()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzxo.zza(zztrVar.zza(), 0);
        zzkx.zza(zztrVar.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
    public final /* synthetic */ zztu zzb(zztr zztrVar) {
        return zztrVar.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzne<zztn, zztr> zzc() {
        return new zzjk(this, zztn.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }
}
