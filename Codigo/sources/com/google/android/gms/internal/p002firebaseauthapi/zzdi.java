package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdl;
import com.google.android.gms.internal.p002firebaseauthapi.zzif;
import com.google.android.gms.internal.p002firebaseauthapi.zzuy;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzdi extends zznb<zzse> {
    private static final zzno<zzdl> zza = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdh
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdi() {
        super(zzse.class, new zzdk(zzbg.class));
    }

    public static int zza() {
        return 0;
    }

    public static void zza(boolean z10) {
        zzct.zza((zznb) new zzdi(), true);
        zzdp.zza();
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzhb.zze);
        zzdl.zza zzc = zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16);
        zzdl.zzb zzbVar = zzdl.zzb.zzc;
        zzdl.zza zza3 = zzc.zza(zzbVar);
        zzdl.zzc zzcVar = zzdl.zzc.zzc;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zza3.zza(zzcVar).zza());
        hashMap.put("AES256_CTR_HMAC_SHA256", zzhb.zzf);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzdl.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzbVar).zza(zzcVar).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznl.zza().zza(zza, zzdl.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ zzse zza(zzahp zzahpVar) {
        return zzse.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzse zzseVar) {
        zzse zzseVar2 = zzseVar;
        zzxo.zza(zzseVar2.zza(), 0);
        new zzdv();
        zzdv.zza2(zzseVar2.zzd());
        new zzqg();
        zzqg.zza2(zzseVar2.zze());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzne<?, zzse> zzc() {
        return new zzdj(this, zzsf.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }
}
