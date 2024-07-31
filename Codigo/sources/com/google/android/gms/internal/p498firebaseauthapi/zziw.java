package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzik;
import com.google.android.gms.internal.p498firebaseauthapi.zzir;
import com.google.android.gms.internal.p498firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zziw {
    private static final zzxt zza;
    private static final zznz<zzir, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzik, zzos> zzd;
    private static final zzmu<zzos> zze;
    private static final Map<zzir.zzb, zzvs> zzf;
    private static final Map<zzvs, zzir.zzb> zzg;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzix, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzb2;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zziv
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                return zziw.zza((zzir) zzchVar);
            }
        }, zzir.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zziy
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                zzir zzb3;
                zzb3 = zziw.zzb((zzor) zzovVar);
                return zzb3;
            }
        }, zzb2, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzix
        }, zzik.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzja
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                zzik zzb3;
                zzb3 = zziw.zzb((zzos) zzovVar, zzcsVar);
                return zzb3;
            }
        }, zzb2, zzos.class);
        HashMap hashMap = new HashMap();
        zzir.zzb zzbVar = zzir.zzb.zzc;
        zzvs zzvsVar = zzvs.RAW;
        hashMap.put(zzbVar, zzvsVar);
        zzir.zzb zzbVar2 = zzir.zzb.zza;
        zzvs zzvsVar2 = zzvs.TINK;
        hashMap.put(zzbVar2, zzvsVar2);
        zzir.zzb zzbVar3 = zzir.zzb.zzb;
        zzvs zzvsVar3 = zzvs.CRUNCHY;
        hashMap.put(zzbVar3, zzvsVar3);
        zzf = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zzvs.class);
        enumMap.put((EnumMap) zzvsVar, (zzvs) zzbVar);
        enumMap.put((EnumMap) zzvsVar2, (zzvs) zzbVar2);
        enumMap.put((EnumMap) zzvsVar3, (zzvs) zzbVar3);
        enumMap.put((EnumMap) zzvs.LEGACY, (zzvs) zzbVar3);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    private static zzir.zzb zza(zzvs zzvsVar) {
        Map<zzvs, zzir.zzb> map = zzg;
        if (map.containsKey(zzvsVar)) {
            return map.get(zzvsVar);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzir zzirVar) {
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zztd) ((zzajc) zztd.zzc().zza(zzirVar.zzb()).zzf())).zzi());
        zzir.zzb zzd2 = zzirVar.zzd();
        Map<zzir.zzb, zzvs> map = zzf;
        if (map.containsKey(zzd2)) {
            return zzor.zzb((zzvb) ((zzajc) zza2.zza(map.get(zzd2)).zzf()));
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzd2));
    }

    public static void zza() {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzik zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zztc zza2 = zztc.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return new zzik.zza().zza(zzir.zzc().zza(zza2.zzd().zzb()).zza(zza(zzosVar.zzc())).zza()).zza(zzxu.zza(zza2.zzd().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzir zzb(zzor zzorVar) {
        if (!zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + zzorVar.zza().zzf());
        }
        try {
            zztd zza2 = zztd.zza(zzorVar.zza().zze(), zzaio.zza());
            if (zza2.zzb() == 0) {
                return zzir.zzc().zza(zza2.zza()).zza(zza(zzorVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
        }
    }
}
