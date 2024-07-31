package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzif;
import com.google.android.gms.internal.p002firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzfu extends zznb<zztg> {
    public zzfu() {
        super(zztg.class, new zzft(zzbg.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ zztg zza(zzahp zzahpVar) {
        return zztg.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ void zza(zztg zztgVar) {
        zztg zztgVar2 = zztgVar;
        zzxo.zza(zztgVar2.zza(), 0);
        if (zztgVar2.zzd().zzb() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzne<?, zztg> zzc() {
        return new zzfw(this, zzth.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }
}
