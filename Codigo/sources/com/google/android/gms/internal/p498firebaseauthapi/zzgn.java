package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgn {
    private static final zzxt zza;
    private static final zznz<zzgk, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzgl, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzgo, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzb2;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgm
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                zzor zzb3;
                zzb3 = zzor.zzb((zzvb) ((zzajc) zzvb.zza().zza("type.googleapis.com/google.crypto.tink.KmsAeadKey").zza(((zzvn) ((zzajc) zzvn.zza().zza(((zzgk) zzchVar).zzb()).zzf())).zzi()).zza(zzvs.RAW).zzf()));
                return zzb3;
            }
        }, zzgk.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgp
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                zzgk zzb3;
                zzb3 = zzgn.zzb((zzor) zzovVar);
                return zzb3;
            }
        }, zzb2, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgo
        }, zzgl.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgr
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                zzgl zzb3;
                zzb3 = zzgn.zzb((zzos) zzovVar, zzcsVar);
                return zzb3;
            }
        }, zzb2, zzos.class);
    }

    public static void zza() {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgk zzb(zzor zzorVar) {
        if (!zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
        }
        try {
            zzvn zza2 = zzvn.zza(zzorVar.zza().zze(), zzaio.zza());
            if (zzorVar.zza().zzd() == zzvs.RAW) {
                return zzgk.zza(zza2.zzd());
            }
            throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + String.valueOf(zzorVar.zza().zzd()) + " with format " + String.valueOf(zza2));
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgl zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        if (zzosVar.zzc() != zzvs.RAW) {
            throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got " + String.valueOf(zzosVar.zzc()));
        }
        try {
            zzvk zza2 = zzvk.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() == 0) {
                return zzgl.zza(zzgk.zza(zza2.zzd().zzd()));
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zza2));
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }
}
