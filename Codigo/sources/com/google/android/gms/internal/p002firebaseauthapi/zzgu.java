package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzgs;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgu {
    private static final zzxt zza;
    private static final zznz<zzgs, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzgq, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzmz, com.google.android.gms.internal.firebase-auth-api.zzgz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza = zzb2;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                zzor zzb3;
                zzb3 = zzor.zzb((zzvb) ((zzajc) zzvb.zza().zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zza(zzgu.zzb((zzgs) zzchVar).zzi()).zza(zzvs.RAW).zzf()));
                return zzb3;
            }
        }, zzgs.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                zzgs zzb3;
                zzb3 = zzgu.zzb((zzor) zzovVar);
                return zzb3;
            }
        }, zzb2, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgz
        }, zzgq.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                zzgq zzb3;
                zzb3 = zzgu.zzb((zzos) zzovVar, zzcsVar);
                return zzb3;
            }
        }, zzb2, zzos.class);
    }

    private static zzgs zza(zzvr zzvrVar) {
        zzgs.zzb zzbVar;
        zzch zza2 = zzcu.zza(((zzvb) ((zzajc) zzvb.zza().zza(zzvrVar.zza().zzf()).zza(zzvrVar.zza().zze()).zza(zzvs.RAW).zzf())).zzj());
        if (zza2 instanceof zzes) {
            zzbVar = zzgs.zzb.zza;
        } else if (zza2 instanceof zzfv) {
            zzbVar = zzgs.zzb.zzc;
        } else if (zza2 instanceof zzhm) {
            zzbVar = zzgs.zzb.zzb;
        } else if (zza2 instanceof zzdl) {
            zzbVar = zzgs.zzb.zzd;
        } else if (zza2 instanceof zzed) {
            zzbVar = zzgs.zzb.zze;
        } else {
            if (!(zza2 instanceof zzfj)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + String.valueOf(zza2));
            }
            zzbVar = zzgs.zzb.zzf;
        }
        return new zzgs.zza().zza(zzvrVar.zze()).zza((zzdb) zza2).zza(zzbVar).zza();
    }

    public static void zza() {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgq zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzvo zza2 = zzvo.zza(zzosVar.zzd(), zzaio.zza());
            if (zzosVar.zzc() != zzvs.RAW) {
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with OutputPrefixType RAW, got " + String.valueOf(zza2));
            }
            if (zza2.zza() == 0) {
                return zzgq.zza(zza(zza2.zzd()));
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(zza2));
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgs zzb(zzor zzorVar) {
        if (zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zza(zzvr.zza(zzorVar.zza().zze(), zzaio.zza()));
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
    }

    private static zzvr zzb(zzgs zzgsVar) {
        try {
            return (zzvr) ((zzajc) zzvr.zzb().zza(zzgsVar.zzc()).zza(zzvb.zza(zzcu.zza(zzgsVar.zzb()), zzaio.zza())).zzf());
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }
}
