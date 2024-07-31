package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzde;
import com.google.android.gms.internal.p002firebaseauthapi.zzdl;
import com.google.android.gms.internal.p002firebaseauthapi.zzsf;
import com.google.android.gms.internal.p002firebaseauthapi.zzug;
import com.google.android.gms.internal.p002firebaseauthapi.zzuh;
import com.google.android.gms.internal.p002firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdp {
    private static final zzxt zza;
    private static final zznz<zzdl, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzde, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzdq, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza = zzb2;
        zzb = zznz.zza(zzdo.zza, zzdl.class, zzor.class);
        zzc = zznv.zza(zzdr.zza, zzb2, zzor.class);
        zzd = zzmx.zza(zzdq.zza, zzde.class, zzos.class);
        zze = zzmu.zza(zzdt.zza, zzb2, zzos.class);
    }

    private static zzdl.zzb zza(zzub zzubVar) {
        int i10 = zzds.zzb[zzubVar.ordinal()];
        if (i10 == 1) {
            return zzdl.zzb.zza;
        }
        if (i10 == 2) {
            return zzdl.zzb.zzb;
        }
        if (i10 == 3) {
            return zzdl.zzb.zzc;
        }
        if (i10 == 4) {
            return zzdl.zzb.zzd;
        }
        if (i10 == 5) {
            return zzdl.zzb.zze;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzubVar.zza());
    }

    private static zzdl.zzc zza(zzvs zzvsVar) {
        int i10 = zzds.zza[zzvsVar.ordinal()];
        if (i10 == 1) {
            return zzdl.zzc.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzdl.zzc.zzb;
        }
        if (i10 == 4) {
            return zzdl.zzc.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzdl zzdlVar) {
        zzub zzubVar;
        zzvs zzvsVar;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzsf.zza zza3 = zzsf.zza().zza((zzsj) ((zzajc) zzsj.zzb().zza((zzsm) ((zzajc) zzsm.zzb().zza(zzdlVar.zzd()).zzf())).zza(zzdlVar.zzb()).zzf()));
        zzug.zza zzc2 = zzug.zzc();
        zzuh.zza zza4 = zzuh.zzc().zza(zzdlVar.zze());
        zzdl.zzb zzg = zzdlVar.zzg();
        if (zzdl.zzb.zza.equals(zzg)) {
            zzubVar = zzub.SHA1;
        } else if (zzdl.zzb.zzb.equals(zzg)) {
            zzubVar = zzub.SHA224;
        } else if (zzdl.zzb.zzc.equals(zzg)) {
            zzubVar = zzub.SHA256;
        } else if (zzdl.zzb.zzd.equals(zzg)) {
            zzubVar = zzub.SHA384;
        } else {
            if (!zzdl.zzb.zze.equals(zzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + String.valueOf(zzg));
            }
            zzubVar = zzub.SHA512;
        }
        zzvb.zza zza5 = zza2.zza(((zzsf) ((zzajc) zza3.zza((zzug) ((zzajc) zzc2.zza((zzuh) ((zzajc) zza4.zza(zzubVar).zzf())).zza(zzdlVar.zzc()).zzf())).zzf())).zzi());
        zzdl.zzc zzh = zzdlVar.zzh();
        if (zzdl.zzc.zza.equals(zzh)) {
            zzvsVar = zzvs.TINK;
        } else if (zzdl.zzc.zzb.equals(zzh)) {
            zzvsVar = zzvs.CRUNCHY;
        } else {
            if (!zzdl.zzc.zzc.equals(zzh)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzh));
            }
            zzvsVar = zzvs.RAW;
        }
        return zzor.zzb((zzvb) ((zzajc) zza5.zza(zzvsVar).zzf()));
    }

    public static void zza() {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    public static zzde zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzse zza2 = zzse.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zza2.zzd().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zza2.zze().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return new zzde.zza().zza(zzdl.zzf().zza(zza2.zzd().zzf().zzb()).zzb(zza2.zze().zzf().zzb()).zzc(zza2.zzd().zze().zza()).zzd(zza2.zze().zze().zza()).zza(zza(zza2.zze().zze().zzb())).zza(zza(zzosVar.zzc())).zza()).zza(zzxu.zza(zza2.zzd().zzf().zzg(), zzcs.zza(zzcsVar))).zzb(zzxu.zza(zza2.zze().zzf().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static zzdl zzb(zzor zzorVar) {
        if (!zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
        }
        try {
            zzsf zza2 = zzsf.zza(zzorVar.zza().zze(), zzaio.zza());
            if (zza2.zzd().zzb() == 0) {
                return zzdl.zzf().zza(zza2.zzc().zza()).zzb(zza2.zzd().zza()).zzc(zza2.zzc().zze().zza()).zzd(zza2.zzd().zzf().zza()).zza(zza(zza2.zzd().zzf().zzb())).zza(zza(zzorVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }
}
