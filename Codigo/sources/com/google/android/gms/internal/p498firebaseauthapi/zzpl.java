package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzif;
import com.google.android.gms.internal.p498firebaseauthapi.zzpo;
import com.google.android.gms.internal.p498firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzpl extends zznb<zzrw> {
    private static final zzod<zzph, zzpz> zza = zzod.zza(new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpk
        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzof
        public final Object zza(zzbt zzbtVar) {
            return new zzrc((zzph) zzbtVar);
        }
    }, zzph.class, zzpz.class);
    private static final zzod<zzph, zzce> zzb = zzod.zza(new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpn
        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzof
        public final Object zza(zzbt zzbtVar) {
            return zzxm.zza((zzph) zzbtVar);
        }
    }, zzph.class, zzce.class);

    zzpl() {
        super(zzrw.class, new zzpm(zzce.class));
    }

    public static void zza(boolean z10) {
        zzct.zza((zznb) new zzpl(), true);
        zzpt.zza();
        zznr.zza().zza(zza);
        zznr.zza().zza(zzb);
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        zzpo zzpoVar = zzqx.zzc;
        hashMap.put("AES_CMAC", zzpoVar);
        hashMap.put("AES256_CMAC", zzpoVar);
        hashMap.put("AES256_CMAC_RAW", zzpo.zzd().zza(32).zzb(16).zza(zzpo.zzb.zzd).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(int i10) {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(zzsb zzsbVar) {
        if (zzsbVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzsbVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ zzrw zza(zzahp zzahpVar) {
        return zzrw.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzrw zzrwVar) {
        zzrw zzrwVar2 = zzrwVar;
        zzxo.zza(zzrwVar2.zza(), 0);
        zzb(zzrwVar2.zze().zzb());
        zzb(zzrwVar2.zzd());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzne<?, zzrw> zzc() {
        return new zzpp(this, zzsa.class);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }
}
