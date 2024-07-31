package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzhm;
import com.google.android.gms.internal.p002firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzho {
    private static final zzxt zza;
    private static final zznz<zzhm, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzhg, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzhp, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zznz.zza(zzhn.zza, zzhm.class, zzor.class);
        zzc = zznv.zza(zzhq.zza, zzb2, zzor.class);
        zzd = zzmx.zza(zzhp.zza, zzhg.class, zzos.class);
        zze = zzmu.zza(zzhs.zza, zzb2, zzos.class);
    }

    private static zzhm.zza zza(zzvs zzvsVar) {
        int i10 = zzhr.zza[zzvsVar.ordinal()];
        if (i10 == 1) {
            return zzhm.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzhm.zza.zzb;
        }
        if (i10 == 4) {
            return zzhm.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzhm zzhmVar) {
        zzvs zzvsVar;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(zzvy.zzc().zzi());
        zzhm.zza zzb2 = zzhmVar.zzb();
        if (zzhm.zza.zza.equals(zzb2)) {
            zzvsVar = zzvs.TINK;
        } else if (zzhm.zza.zzb.equals(zzb2)) {
            zzvsVar = zzvs.CRUNCHY;
        } else {
            if (!zzhm.zza.zzc.equals(zzb2)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzb2));
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

    public static zzhg zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzvx zza2 = zzvx.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() == 0) {
                return zzhg.zza(zza(zzosVar.zzc()), zzxu.zza(zza2.zzd().zzg(), zzcs.zza(zzcsVar)), zzosVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static zzhm zzb(zzor zzorVar) {
        if (!zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
        }
        try {
            if (zzvy.zza(zzorVar.zza().zze(), zzaio.zza()).zza() == 0) {
                return zzhm.zza(zza(zzorVar.zza().zzd()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
        }
    }
}
