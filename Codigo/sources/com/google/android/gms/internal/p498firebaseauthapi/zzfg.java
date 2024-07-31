package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzfj;
import com.google.android.gms.internal.p498firebaseauthapi.zzif;
import com.google.android.gms.internal.p498firebaseauthapi.zzuy;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes2.dex */
public final class zzfg extends zznb<zzsy> {
    private static final zzno<zzfj> zza = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzff
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfg() {
        super(zzsy.class, new zzfi(zzbg.class));
    }

    public static int zza() {
        return 0;
    }

    public static void zza(boolean z10) {
        if (zzi()) {
            zzct.zza((zznb) new zzfg(), true);
            zzfl.zza();
            zzns zza2 = zzns.zza();
            HashMap hashMap = new HashMap();
            zzfj.zza zza3 = zzfj.zzc().zza(16);
            zzfj.zzb zzbVar = zzfj.zzb.zza;
            hashMap.put("AES128_GCM_SIV", zza3.zza(zzbVar).zza());
            zzfj.zza zza4 = zzfj.zzc().zza(16);
            zzfj.zzb zzbVar2 = zzfj.zzb.zzc;
            hashMap.put("AES128_GCM_SIV_RAW", zza4.zza(zzbVar2).zza());
            hashMap.put("AES256_GCM_SIV", zzfj.zzc().zza(32).zza(zzbVar).zza());
            hashMap.put("AES256_GCM_SIV_RAW", zzfj.zzc().zza(32).zza(zzbVar2).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zznl.zza().zza(zza, zzfj.class);
        }
    }

    private static boolean zzi() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ zzsy zza(zzahp zzahpVar) {
        return zzsy.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzsy zzsyVar) {
        zzsy zzsyVar2 = zzsyVar;
        zzxo.zza(zzsyVar2.zza(), 0);
        zzxo.zza(zzsyVar2.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzne<?, zzsy> zzc() {
        return new zzfh(this, zzsz.class);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }
}
