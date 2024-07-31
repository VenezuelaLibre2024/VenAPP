package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzjl;
import com.google.android.gms.internal.p498firebaseauthapi.zztv;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes2.dex */
final class zzjt {
    private static final zzxt zza;
    private static final zzxt zzb;
    private static final zznz<zzjl, zzor> zzc;
    private static final zznv<zzor> zzd;
    private static final zzmx<zzjy, zzos> zze;
    private static final zzmu<zzos> zzf;
    private static final zzmx<zzjq, zzos> zzg;
    private static final zzmu<zzos> zzh;
    private static final zzmi<zzvs, zzjl.zzd> zzi;
    private static final zzmi<zzub, zzjl.zzb> zzj;
    private static final zzmi<zzty, zzjl.zzc> zzk;
    private static final zzmi<zztk, zzjl.zze> zzl;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.firebase-auth-api.zzjw, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.firebase-auth-api.zzju, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzb2;
        zzxt zzb3 = zzpf.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzb3;
        zzc = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjs
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                zzor zzb4;
                zzb4 = zzor.zzb((zzvb) ((zzajc) zzvb.zza().zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zza(((zztn) ((zzajc) zztn.zza().zza(zzjt.zzb(r1)).zzf())).zzi()).zza(zzjt.zzi.zza((zzmi<zzvs, zzjl.zzd>) ((zzjl) zzchVar).zzg())).zzf()));
                return zzb4;
            }
        }, zzjl.class, zzor.class);
        zzd = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjv
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                zzjl zzb4;
                zzb4 = zzjt.zzb((zzor) zzovVar);
                return zzb4;
            }
        }, zzb2, zzor.class);
        zze = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzju
        }, zzjy.class, zzos.class);
        zzf = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjx
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                zzjy zzd2;
                zzd2 = zzjt.zzd((zzos) zzovVar, zzcsVar);
                return zzd2;
            }
        }, zzb3, zzos.class);
        zzg = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjw
        }, zzjq.class, zzos.class);
        zzh = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjz
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                zzjq zzc2;
                zzc2 = zzjt.zzc((zzos) zzovVar, zzcsVar);
                return zzc2;
            }
        }, zzb2, zzos.class);
        zzml zza2 = zzmi.zza().zza(zzvs.RAW, zzjl.zzd.zzc).zza(zzvs.TINK, zzjl.zzd.zza);
        zzvs zzvsVar = zzvs.LEGACY;
        zzjl.zzd zzdVar = zzjl.zzd.zzb;
        zzi = zza2.zza(zzvsVar, zzdVar).zza(zzvs.CRUNCHY, zzdVar).zza();
        zzj = zzmi.zza().zza(zzub.SHA1, zzjl.zzb.zza).zza(zzub.SHA224, zzjl.zzb.zzb).zza(zzub.SHA256, zzjl.zzb.zzc).zza(zzub.SHA384, zzjl.zzb.zzd).zza(zzub.SHA512, zzjl.zzb.zze).zza();
        zzk = zzmi.zza().zza(zzty.NIST_P256, zzjl.zzc.zza).zza(zzty.NIST_P384, zzjl.zzc.zzb).zza(zzty.NIST_P521, zzjl.zzc.zzc).zza(zzty.CURVE25519, zzjl.zzc.zzd).zza();
        zzl = zzmi.zza().zza(zztk.UNCOMPRESSED, zzjl.zze.zzb).zza(zztk.COMPRESSED, zzjl.zze.zza).zza(zztk.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzjl.zze.zzc).zza();
    }

    private static zzjl zza(zzvs zzvsVar, zztq zztqVar) {
        zzjl.zza zza2 = zzjl.zzc().zza(zzi.zza((zzmi<zzvs, zzjl.zzd>) zzvsVar)).zza(zzk.zza((zzmi<zzty, zzjl.zzc>) zztqVar.zzf().zzd())).zza(zzj.zza((zzmi<zzub, zzjl.zzb>) zztqVar.zzf().zze())).zza(zzcu.zza(((zzvb) ((zzajc) zzvb.zza().zza(zztqVar.zzb().zzd().zzf()).zza(zzvs.RAW).zza(zztqVar.zzb().zzd().zze()).zzf())).zzj())).zza(zzxt.zza(zztqVar.zzf().zzf().zzg()));
        if (!zztqVar.zzf().zzd().equals(zzty.CURVE25519)) {
            zza2.zza(zzl.zza((zzmi<zztk, zzjl.zze>) zztqVar.zza()));
        } else if (!zztqVar.zza().equals(zztk.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zza2.zza();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjl zzb(zzor zzorVar) {
        if (zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                return zza(zzorVar.zza().zzd(), zztn.zza(zzorVar.zza().zze(), zzaio.zza()).zzc());
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing EciesParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
    }

    private static zztq zzb(zzjl zzjlVar) {
        zztv.zza zza2 = zztv.zza().zza(zzk.zza((zzmi<zzty, zzjl.zzc>) zzjlVar.zzd())).zza(zzj.zza((zzmi<zzub, zzjl.zzb>) zzjlVar.zze()));
        if (zzjlVar.zzh() != null && zzjlVar.zzh().zza() > 0) {
            zza2.zza(zzahp.zza(zzjlVar.zzh().zzb()));
        }
        zztv zztvVar = (zztv) ((zzajc) zza2.zzf());
        try {
            zzvb zza3 = zzvb.zza(zzcu.zza(zzjlVar.zzb()), zzaio.zza());
            zztm zztmVar = (zztm) ((zzajc) zztm.zza().zza((zzvb) ((zzajc) zzvb.zza().zza(zza3.zzf()).zza(zzvs.TINK).zza(zza3.zze()).zzf())).zzf());
            zzjl.zze zzf2 = zzjlVar.zzf();
            if (zzf2 == null) {
                zzf2 = zzjl.zze.zza;
            }
            return (zztq) ((zzajc) zztq.zzc().zza(zztvVar).zza(zztmVar).zza(zzl.zza((zzmi<zztk, zzjl.zze>) zzf2)).zzf());
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjq zzc(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + zzosVar.zzf());
        }
        try {
            zztr zza2 = zztr.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zztu zzd2 = zza2.zzd();
            zzjl zza3 = zza(zzosVar.zzc(), zzd2.zzb());
            return zza3.zzd().equals(zzjl.zzc.zzd) ? zzjq.zza(zzjy.zza(zza3, zzxt.zza(zzd2.zzf().zzg()), zzosVar.zze()), zzxu.zza(zza2.zze().zzg(), zzcs.zza(zzcsVar))) : zzjq.zza(zzjy.zza(zza3, new ECPoint(zzme.zza(zzd2.zzf().zzg()), zzme.zza(zzd2.zzg().zzg())), zzosVar.zze()), zzxs.zza(zzme.zza(zza2.zze().zzg()), zzcs.zza(zzcsVar)));
        } catch (zzaji | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjy zzd(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + zzosVar.zzf());
        }
        try {
            zztu zza2 = zztu.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzjl zza3 = zza(zzosVar.zzc(), zza2.zzb());
            if (!zza3.zzd().equals(zzjl.zzc.zzd)) {
                return zzjy.zza(zza3, new ECPoint(zzme.zza(zza2.zzf().zzg()), zzme.zza(zza2.zzg().zzg())), zzosVar.zze());
            }
            if (zza2.zzg().zze()) {
                return zzjy.zza(zza3, zzxt.zza(zza2.zzf().zzg()), zzosVar.zze());
            }
            throw new GeneralSecurityException("Y must be empty for X25519 points");
        } catch (zzaji | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }
}
