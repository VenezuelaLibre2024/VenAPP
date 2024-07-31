package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzif;
import com.google.android.gms.internal.p498firebaseauthapi.zzir;
import com.google.android.gms.internal.p498firebaseauthapi.zzuy;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzin extends zznb<zztc> {
    private static final zzno<zzir> zza = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zziq
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzin() {
        super(zztc.class, new zzip(zzbp.class));
    }

    public static int zza() {
        return 0;
    }

    public static void zza(boolean z10) {
        zzct.zza((zznb) new zzin(), true);
        zziw.zza();
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES256_SIV", zzjg.zza);
        hashMap.put("AES256_SIV_RAW", zzir.zzc().zza(64).zza(zzir.zzb.zzc).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznl.zza().zza(zza, zzir.class);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ zztc zza(zzahp zzahpVar) {
        return zztc.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ void zza(zztc zztcVar) {
        zztc zztcVar2 = zztcVar;
        zzxo.zza(zztcVar2.zza(), 0);
        if (zztcVar2.zzd().zzb() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + zztcVar2.zzd().zzb() + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzne<?, zztc> zzc() {
        return new zzis(this, zztd.class);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }
}
