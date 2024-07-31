package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzif;
import com.google.android.gms.internal.p498firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzlr extends zznb<zzuv> {
    public zzlr() {
        super(zzuv.class, new zzlq(zzbr.class));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ zzuv zza(zzahp zzahpVar) {
        return zzuv.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzuv zzuvVar) {
        zzuv zzuvVar2 = zzuvVar;
        zzxo.zza(zzuvVar2.zza(), 0);
        if (!zzuvVar2.zzg()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        zzlt.zza(zzuvVar2.zzb());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }
}
