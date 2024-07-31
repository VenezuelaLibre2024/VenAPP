package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
final class zzkx {
    public static zzwo zza(zzty zztyVar) {
        int i10 = zzkw.zzb[zztyVar.ordinal()];
        if (i10 == 1) {
            return zzwo.NIST_P256;
        }
        if (i10 == 2) {
            return zzwo.NIST_P384;
        }
        if (i10 == 3) {
            return zzwo.NIST_P521;
        }
        throw new GeneralSecurityException("unknown curve type: " + String.valueOf(zztyVar));
    }

    public static zzwr zza(zztk zztkVar) {
        int i10 = zzkw.zzc[zztkVar.ordinal()];
        if (i10 == 1) {
            return zzwr.UNCOMPRESSED;
        }
        if (i10 == 2) {
            return zzwr.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i10 == 3) {
            return zzwr.COMPRESSED;
        }
        throw new GeneralSecurityException("unknown point format: " + String.valueOf(zztkVar));
    }

    public static String zza(zzub zzubVar) {
        int i10 = zzkw.zza[zzubVar.ordinal()];
        if (i10 == 1) {
            return "HmacSha1";
        }
        if (i10 == 2) {
            return "HmacSha224";
        }
        if (i10 == 3) {
            return "HmacSha256";
        }
        if (i10 == 4) {
            return "HmacSha384";
        }
        if (i10 == 5) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + String.valueOf(zzubVar));
    }

    public static void zza(zztq zztqVar) {
        zzwp.zza(zza(zztqVar.zzf().zzd()));
        zza(zztqVar.zzf().zze());
        if (zztqVar.zza() == zztk.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzct.zza(zztqVar.zzb().zzd());
    }
}
