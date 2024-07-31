package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzka;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzke {
    private static final zzxt zza;
    private static final zzxt zzb;
    private static final zznz<zzka, zzor> zzc;
    private static final zznv<zzor> zzd;
    private static final zzmx<zzkn, zzos> zze;
    private static final zzmu<zzos> zzf;
    private static final zzmx<zzkf, zzos> zzg;
    private static final zzmu<zzos> zzh;
    private static final zzmi<zzvs, zzka.zzf> zzi;
    private static final zzmi<zzuo, zzka.zzd> zzj;
    private static final zzmi<zzum, zzka.zze> zzk;
    private static final zzmi<zzuk, zzka.zza> zzl;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.firebase-auth-api.zzmz, com.google.android.gms.internal.firebase-auth-api.zzkl] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.firebase-auth-api.zzkj, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zza = zzb2;
        zzxt zzb3 = zzpf.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzb = zzb3;
        zzc = zznz.zza(zzkh.zza, zzka.class, zzor.class);
        zzd = zznv.zza(zzkg.zza, zzb2, zzor.class);
        zze = zzmx.zza(zzkj.zza, zzkn.class, zzos.class);
        zzf = zzmu.zza(zzki.zza, zzb3, zzos.class);
        zzg = zzmx.zza(zzkl.zza, zzkf.class, zzos.class);
        zzh = zzmu.zza(zzkk.zza, zzb2, zzos.class);
        zzml zza2 = zzmi.zza().zza(zzvs.RAW, zzka.zzf.zzc).zza(zzvs.TINK, zzka.zzf.zza);
        zzvs zzvsVar = zzvs.LEGACY;
        zzka.zzf zzfVar = zzka.zzf.zzb;
        zzi = zza2.zza(zzvsVar, zzfVar).zza(zzvs.CRUNCHY, zzfVar).zza();
        zzj = zzmi.zza().zza(zzuo.DHKEM_P256_HKDF_SHA256, zzka.zzd.zza).zza(zzuo.DHKEM_P384_HKDF_SHA384, zzka.zzd.zzb).zza(zzuo.DHKEM_P521_HKDF_SHA512, zzka.zzd.zzc).zza(zzuo.DHKEM_X25519_HKDF_SHA256, zzka.zzd.zzd).zza();
        zzk = zzmi.zza().zza(zzum.HKDF_SHA256, zzka.zze.zza).zza(zzum.HKDF_SHA384, zzka.zze.zzb).zza(zzum.HKDF_SHA512, zzka.zze.zzc).zza();
        zzl = zzmi.zza().zza(zzuk.AES_128_GCM, zzka.zza.zza).zza(zzuk.AES_256_GCM, zzka.zza.zzb).zza(zzuk.CHACHA20_POLY1305, zzka.zza.zzc).zza();
    }

    private static zzka zza(zzvs zzvsVar, zzur zzurVar) {
        return zzka.zzc().zza(zzi.zza((zzmi<zzvs, zzka.zzf>) zzvsVar)).zza(zzj.zza((zzmi<zzuo, zzka.zzd>) zzurVar.zzc())).zza(zzk.zza((zzmi<zzum, zzka.zze>) zzurVar.zzb())).zza(zzl.zza((zzmi<zzuk, zzka.zza>) zzurVar.zza())).zza();
    }

    private static zzxt zza(zzuo zzuoVar, byte[] bArr) {
        return zzxt.zza(zzme.zza(zzme.zza(bArr), zzlt.zzb(zzuoVar)));
    }

    public static void zza() {
        zznu zza2 = zznu.zza();
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
        zza2.zza(zzh);
    }

    public static zzka zzb(zzor zzorVar) {
        if (zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                return zza(zzorVar.zza().zzd(), zzuq.zza(zzorVar.zza().zze(), zzaio.zza()).zzc());
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
    }

    public static zzkf zzc(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: " + zzosVar.zzf());
        }
        try {
            zzuu zza2 = zzuu.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzuv zzd2 = zza2.zzd();
            return zzkf.zza(zzkn.zza(zza(zzosVar.zzc(), zzd2.zzb()), zza(zzd2.zzb().zzc(), zzd2.zzf().zzg()), zzosVar.zze()), zzxu.zza(zzme.zza(zzme.zza(zza2.zze().zzg()), zzlt.zza(zzd2.zzb().zzc())), zzcs.zza(zzcsVar)));
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
        }
    }

    public static zzkn zzd(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: " + zzosVar.zzf());
        }
        try {
            zzuv zza2 = zzuv.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() == 0) {
                return zzkn.zza(zza(zzosVar.zzc(), zza2.zzb()), zza(zza2.zzb().zzc(), zza2.zzf().zzg()), zzosVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing HpkePublicKey failed");
        }
    }
}
