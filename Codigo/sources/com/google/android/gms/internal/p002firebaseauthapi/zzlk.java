package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzlk {
    public static zzld zza(zzur zzurVar) {
        if (zzurVar.zza() == zzuk.AES_128_GCM) {
            return new zzky(16);
        }
        if (zzurVar.zza() == zzuk.AES_256_GCM) {
            return new zzky(32);
        }
        if (zzurVar.zza() == zzuk.CHACHA20_POLY1305) {
            return new zzlb();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static zzlg zzb(zzur zzurVar) {
        if (zzurVar.zzb() == zzum.HKDF_SHA256) {
            return new zzla("HmacSha256");
        }
        if (zzurVar.zzb() == zzum.HKDF_SHA384) {
            return new zzla("HmacSha384");
        }
        if (zzurVar.zzb() == zzum.HKDF_SHA512) {
            return new zzla("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static zzlj zzc(zzur zzurVar) {
        if (zzurVar.zzc() == zzuo.DHKEM_X25519_HKDF_SHA256) {
            return new zzlw(new zzla("HmacSha256"));
        }
        if (zzurVar.zzc() == zzuo.DHKEM_P256_HKDF_SHA256) {
            return zzlv.zza(zzwo.NIST_P256);
        }
        if (zzurVar.zzc() == zzuo.DHKEM_P384_HKDF_SHA384) {
            return zzlv.zza(zzwo.NIST_P384);
        }
        if (zzurVar.zzc() == zzuo.DHKEM_P521_HKDF_SHA512) {
            return zzlv.zza(zzwo.NIST_P521);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
