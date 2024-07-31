package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgjd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoq zzb = zzgoq.zzb(new zzgoo() { // from class: com.google.android.gms.internal.ads.zzgja
        @Override // com.google.android.gms.internal.ads.zzgoo
        public final Object zza(zzggc zzggcVar) {
            return zzgwo.zzb((zzgiz) zzggcVar);
        }
    }, zzgiz.class, zzgfs.class);
    private static final zzggd zzc = zzgnm.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgfs.class, zzgus.SYMMETRIC, zzgto.zzg());
    private static final zzgnv zzd = new zzgnv() { // from class: com.google.android.gms.internal.ads.zzgjb
    };
    private static final zzgnt zze = new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgjc
        @Override // com.google.android.gms.internal.ads.zzgnt
        public final zzggc zza(zzggq zzggqVar, Integer num) {
            zzgji zzgjiVar = (zzgji) zzggqVar;
            int i10 = zzgjd.zza;
            if (zzgjiVar.zzb() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzgix zzgixVar = new zzgix(null);
            zzgixVar.zzc(zzgjiVar);
            zzgixVar.zza(null);
            zzgixVar.zzb(zzgxr.zzc(zzgjiVar.zzb()));
            return zzgixVar.zzd();
        }
    };

    public static void zza(boolean z10) {
        int i10 = zzgmd.zza;
        zzgmd.zze(zzgoe.zzd());
        zzgob.zza().zze(zzb);
        zzgoa zzb2 = zzgoa.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzglr.zza);
        zzgjf zzgjfVar = new zzgjf(null);
        zzgjfVar.zza(12);
        zzgjfVar.zzb(16);
        zzgjfVar.zzc(16);
        zzgjg zzgjgVar = zzgjg.zzc;
        zzgjfVar.zzd(zzgjgVar);
        hashMap.put("AES128_GCM_RAW", zzgjfVar.zze());
        hashMap.put("AES256_GCM", zzglr.zzb);
        zzgjf zzgjfVar2 = new zzgjf(null);
        zzgjfVar2.zza(12);
        zzgjfVar2.zzb(32);
        zzgjfVar2.zzc(16);
        zzgjfVar2.zzd(zzgjgVar);
        hashMap.put("AES256_GCM_RAW", zzgjfVar2.zze());
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzgnw.zza().zzb(zzd, zzgji.class);
        zzgnu.zzb().zzc(zze, zzgji.class);
        zzgnd.zzc().zzf(zzc, 2, true);
    }
}
