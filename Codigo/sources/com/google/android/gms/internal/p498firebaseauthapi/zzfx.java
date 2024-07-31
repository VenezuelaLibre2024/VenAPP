package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzfv;
import com.google.android.gms.internal.p498firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfx {
    private static final zzxt zza;
    private static final zznz<zzfv, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzfr, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzgb, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfz
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                return zzfx.zza((zzfv) zzchVar);
            }
        }, zzfv.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfy
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                zzfv zzb3;
                zzb3 = zzfx.zzb((zzor) zzovVar);
                return zzb3;
            }
        }, zzb2, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgb
        }, zzfr.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzga
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                zzfr zzb3;
                zzb3 = zzfx.zzb((zzos) zzovVar, zzcsVar);
                return zzb3;
            }
        }, zzb2, zzos.class);
    }

    private static zzfv.zza zza(zzvs zzvsVar) {
        int i10 = zzgd.zza[zzvsVar.ordinal()];
        if (i10 == 1) {
            return zzfv.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzfv.zza.zzb;
        }
        if (i10 == 4) {
            return zzfv.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzfv zzfvVar) {
        zzvs zzvsVar;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(zzth.zzb().zzi());
        zzfv.zza zzb2 = zzfvVar.zzb();
        if (zzfv.zza.zza.equals(zzb2)) {
            zzvsVar = zzvs.TINK;
        } else if (zzfv.zza.zzb.equals(zzb2)) {
            zzvsVar = zzvs.CRUNCHY;
        } else {
            if (!zzfv.zza.zzc.equals(zzb2)) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfr zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zztg zza2 = zztg.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() == 0) {
                return zzfr.zza(zza(zzosVar.zzc()), zzxu.zza(zza2.zzd().zzg(), zzcs.zza(zzcsVar)), zzosVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfv zzb(zzor zzorVar) {
        if (zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzth.zza(zzorVar.zza().zze(), zzaio.zza());
                return zzfv.zza(zza(zzorVar.zza().zzd()));
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
    }
}
