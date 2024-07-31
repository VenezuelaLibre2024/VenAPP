package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzph;
import com.google.android.gms.internal.p002firebaseauthapi.zzpo;
import com.google.android.gms.internal.p002firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpt {
    private static final zzxt zza;
    private static final zznz<zzpo, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzph, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzpu, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzb2;
        zzb = zznz.zza(zzps.zza, zzpo.class, zzor.class);
        zzc = zznv.zza(zzpv.zza, zzb2, zzor.class);
        zzd = zzmx.zza(zzpu.zza, zzph.class, zzos.class);
        zze = zzmu.zza(zzpx.zza, zzb2, zzos.class);
    }

    public static /* synthetic */ zzor zza(zzpo zzpoVar) {
        zzvs zzvsVar;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzsa) ((zzajc) zzsa.zzb().zza((zzsb) ((zzajc) zzsb.zzb().zza(zzpoVar.zzb()).zzf())).zza(zzpoVar.zzc()).zzf())).zzi());
        zzpo.zzb zze2 = zzpoVar.zze();
        if (zzpo.zzb.zza.equals(zze2)) {
            zzvsVar = zzvs.TINK;
        } else if (zzpo.zzb.zzb.equals(zze2)) {
            zzvsVar = zzvs.CRUNCHY;
        } else if (zzpo.zzb.zzd.equals(zze2)) {
            zzvsVar = zzvs.RAW;
        } else {
            if (!zzpo.zzb.zzc.equals(zze2)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zze2));
            }
            zzvsVar = zzvs.LEGACY;
        }
        return zzor.zzb((zzvb) ((zzajc) zza2.zza(zzvsVar).zzf()));
    }

    private static zzpo.zzb zza(zzvs zzvsVar) {
        int i10 = zzpw.zza[zzvsVar.ordinal()];
        if (i10 == 1) {
            return zzpo.zzb.zza;
        }
        if (i10 == 2) {
            return zzpo.zzb.zzb;
        }
        if (i10 == 3) {
            return zzpo.zzb.zzc;
        }
        if (i10 == 4) {
            return zzpo.zzb.zzd;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static void zza() {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    public static zzph zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzrw zza2 = zzrw.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return new zzph.zza().zza(zzpo.zzd().zza(zza2.zze().zzb()).zzb(zza2.zzd().zza()).zza(zza(zzosVar.zzc())).zza()).zza(zzxu.zza(zza2.zze().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static zzpo zzb(zzor zzorVar) {
        if (zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzsa zza2 = zzsa.zza(zzorVar.zza().zze(), zzaio.zza());
                return zzpo.zzd().zza(zza2.zza()).zzb(zza2.zzd().zza()).zza(zza(zzorVar.zza().zzd())).zza();
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
    }
}
