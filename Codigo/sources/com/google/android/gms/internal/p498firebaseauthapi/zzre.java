package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzql;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzre {
    private static final zzxt zza;
    private static final zzmi<zzvs, zzql.zzb> zzb;
    private static final zzmi<zzub, zzql.zzc> zzc;
    private static final zznz<zzql, zzor> zzd;
    private static final zznv<zzor> zze;
    private static final zzmx<zzqc, zzos> zzf;
    private static final zzmu<zzos> zzg;

    /* JADX WARN: Type inference failed for: r1v17, types: [com.google.android.gms.internal.firebase-auth-api.zzrj, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzb2;
        zzb = zzmi.zza().zza(zzvs.RAW, zzql.zzb.zzd).zza(zzvs.TINK, zzql.zzb.zza).zza(zzvs.LEGACY, zzql.zzb.zzc).zza(zzvs.CRUNCHY, zzql.zzb.zzb).zza();
        zzc = zzmi.zza().zza(zzub.SHA1, zzql.zzc.zza).zza(zzub.SHA224, zzql.zzc.zzb).zza(zzub.SHA256, zzql.zzc.zzc).zza(zzub.SHA384, zzql.zzc.zzd).zza(zzub.SHA512, zzql.zzc.zze).zza();
        zzd = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrh
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                zzor zzb3;
                zzb3 = zzor.zzb((zzvb) ((zzajc) zzvb.zza().zza("type.googleapis.com/google.crypto.tink.HmacKey").zza(((zzug) ((zzajc) zzug.zzc().zza((zzuh) ((zzajc) zzuh.zzc().zza(r1.zzb()).zza(zzre.zzc.zza((zzmi<zzub, zzql.zzc>) r1.zze())).zzf())).zza(r1.zzc()).zzf())).zzi()).zza(zzre.zzb.zza((zzmi<zzvs, zzql.zzb>) ((zzql) zzchVar).zzf())).zzf()));
                return zzb3;
            }
        }, zzql.class, zzor.class);
        zze = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrg
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                zzql zzb3;
                zzb3 = zzre.zzb((zzor) zzovVar);
                return zzb3;
            }
        }, zzb2, zzor.class);
        zzf = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrj
        }, zzqc.class, zzos.class);
        zzg = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzri
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                zzqc zzb3;
                zzb3 = zzre.zzb((zzos) zzovVar, zzcsVar);
                return zzb3;
            }
        }, zzb2, zzos.class);
    }

    public static void zza() {
        zznu zza2 = zznu.zza();
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqc zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzuc zza2 = zzuc.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqc.zzc().zza(zzql.zzd().zza(zza2.zzf().zzb()).zzb(zza2.zze().zza()).zza(zzc.zza((zzmi<zzub, zzql.zzc>) zza2.zze().zzb())).zza(zzb.zza((zzmi<zzvs, zzql.zzb>) zzosVar.zzc())).zza()).zza(zzxu.zza(zza2.zzf().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzql zzb(zzor zzorVar) {
        if (!zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
        }
        try {
            zzug zza2 = zzug.zza(zzorVar.zza().zze(), zzaio.zza());
            if (zza2.zzb() == 0) {
                return zzql.zzd().zza(zza2.zza()).zzb(zza2.zzf().zza()).zza(zzc.zza((zzmi<zzub, zzql.zzc>) zza2.zzf().zzb())).zza(zzb.zza((zzmi<zzvs, zzql.zzb>) zzorVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zza2.zzb());
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }
}
