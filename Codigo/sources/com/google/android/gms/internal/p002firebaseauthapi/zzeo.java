package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzes;
import com.google.android.gms.internal.p002firebaseauthapi.zzif;
import com.google.android.gms.internal.p002firebaseauthapi.zzuy;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzeo extends zznb<zzsu> {
    private static final zzno<zzes> zza = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzer
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeo() {
        super(zzsu.class, new zzeq(zzbg.class));
    }

    public static int zza() {
        return 0;
    }

    public static void zza(boolean z10) {
        zzct.zza((zznb) new zzeo(), true);
        zzex.zza();
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzhb.zza);
        zzes.zza zzc = zzes.zze().zza(12).zzb(16).zzc(16);
        zzes.zzb zzbVar = zzes.zzb.zzc;
        hashMap.put("AES128_GCM_RAW", zzc.zza(zzbVar).zza());
        hashMap.put("AES256_GCM", zzhb.zzb);
        hashMap.put("AES256_GCM_RAW", zzes.zze().zza(12).zzb(32).zzc(16).zza(zzbVar).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznl.zza().zza(zza, zzes.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ zzsu zza(zzahp zzahpVar) {
        return zzsu.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzsu zzsuVar) {
        zzsu zzsuVar2 = zzsuVar;
        zzxo.zza(zzsuVar2.zza(), 0);
        zzxo.zza(zzsuVar2.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzne<?, zzsu> zzc() {
        return new zzet(this, zzsv.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }
}
