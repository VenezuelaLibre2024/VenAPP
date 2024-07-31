package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfc;
import com.google.android.gms.internal.p002firebaseauthapi.zzfj;
import com.google.android.gms.internal.p002firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfl {
    private static final zzxt zza;
    private static final zznz<zzfj, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzfc, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzfq, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzb2;
        zzb = zznz.zza(zzfo.zza, zzfj.class, zzor.class);
        zzc = zznv.zza(zzfn.zza, zzb2, zzor.class);
        zzd = zzmx.zza(zzfq.zza, zzfc.class, zzos.class);
        zze = zzmu.zza(zzfp.zza, zzb2, zzos.class);
    }

    private static zzfj.zzb zza(zzvs zzvsVar) {
        int i10 = zzfs.zza[zzvsVar.ordinal()];
        if (i10 == 1) {
            return zzfj.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzfj.zzb.zzb;
        }
        if (i10 == 4) {
            return zzfj.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzfj zzfjVar) {
        zzvs zzvsVar;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey").zza(((zzsz) ((zzajc) zzsz.zzc().zza(zzfjVar.zzb()).zzf())).zzi());
        zzfj.zzb zzd2 = zzfjVar.zzd();
        if (zzfj.zzb.zza.equals(zzd2)) {
            zzvsVar = zzvs.TINK;
        } else if (zzfj.zzb.zzb.equals(zzd2)) {
            zzvsVar = zzvs.CRUNCHY;
        } else {
            if (!zzfj.zzb.zzc.equals(zzd2)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzd2));
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

    public static zzfc zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzsy zza2 = zzsy.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return new zzfc.zza().zza(zzfj.zzc().zza(zza2.zzd().zzb()).zza(zza(zzosVar.zzc())).zza()).zza(zzxu.zza(zza2.zzd().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static zzfj zzb(zzor zzorVar) {
        if (!zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
        }
        try {
            zzsz zza2 = zzsz.zza(zzorVar.zza().zze(), zzaio.zza());
            if (zza2.zzb() == 0) {
                return zzfj.zzc().zza(zza2.zza()).zza(zza(zzorVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }
}
