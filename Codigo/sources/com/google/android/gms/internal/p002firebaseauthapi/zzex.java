package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzel;
import com.google.android.gms.internal.p002firebaseauthapi.zzes;
import com.google.android.gms.internal.p002firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzex {
    private static final zzxt zza;
    private static final zznz<zzes, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzel, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzey, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzb2;
        zzb = zznz.zza(zzew.zza, zzes.class, zzor.class);
        zzc = zznv.zza(zzez.zza, zzb2, zzor.class);
        zzd = zzmx.zza(zzey.zza, zzel.class, zzos.class);
        zze = zzmu.zza(zzfb.zza, zzb2, zzos.class);
    }

    private static zzes.zzb zza(zzvs zzvsVar) {
        int i10 = zzfa.zza[zzvsVar.ordinal()];
        if (i10 == 1) {
            return zzes.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzes.zzb.zzb;
        }
        if (i10 == 4) {
            return zzes.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzes zzesVar) {
        zzvs zzvsVar;
        if (zzesVar.zzd() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzesVar.zzd())));
        }
        if (zzesVar.zzb() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(zzesVar.zzb())));
        }
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzsv) ((zzajc) zzsv.zzc().zza(zzesVar.zzc()).zzf())).zzi());
        zzes.zzb zzf = zzesVar.zzf();
        if (zzes.zzb.zza.equals(zzf)) {
            zzvsVar = zzvs.TINK;
        } else if (zzes.zzb.zzb.equals(zzf)) {
            zzvsVar = zzvs.CRUNCHY;
        } else {
            if (!zzes.zzb.zzc.equals(zzf)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzf));
            }
            zzvsVar = zzvs.RAW;
        }
        return zzor.zzb((zzvb) ((zzajc) zza2.zza(zzvsVar).zzf()));
    }

    public static void zza() {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    public static zzel zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzsu zza2 = zzsu.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return new zzel.zza().zza(zzes.zze().zzb(zza2.zzd().zzb()).zza(12).zzc(16).zza(zza(zzosVar.zzc())).zza()).zza(zzxu.zza(zza2.zzd().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static zzes zzb(zzor zzorVar) {
        if (!zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
        }
        try {
            zzsv zza2 = zzsv.zza(zzorVar.zza().zze(), zzaio.zza());
            if (zza2.zzb() == 0) {
                return zzes.zze().zzb(zza2.zza()).zza(12).zzc(16).zza(zza(zzorVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }
}
