package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzdw;
import com.google.android.gms.internal.p498firebaseauthapi.zzed;
import com.google.android.gms.internal.p498firebaseauthapi.zzsq;
import com.google.android.gms.internal.p498firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzef {
    private static final zzxt zza;
    private static final zznz<zzed, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzdw, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzek, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzb2;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzei
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                return zzef.zza((zzed) zzchVar);
            }
        }, zzed.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeh
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                zzed zzb3;
                zzb3 = zzef.zzb((zzor) zzovVar);
                return zzb3;
            }
        }, zzb2, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzek
        }, zzdw.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzej
            @Override // com.google.android.gms.internal.p498firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                zzdw zzb3;
                zzb3 = zzef.zzb((zzos) zzovVar, zzcsVar);
                return zzb3;
            }
        }, zzb2, zzos.class);
    }

    private static zzed.zzb zza(zzvs zzvsVar) {
        int i10 = zzem.zza[zzvsVar.ordinal()];
        if (i10 == 1) {
            return zzed.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzed.zzb.zzb;
        }
        if (i10 == 4) {
            return zzed.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzed zzedVar) {
        zzvs zzvsVar;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzsq.zza zzb2 = zzsq.zzb();
        if (zzedVar.zzd() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzedVar.zzd())));
        }
        zzvb.zza zza3 = zza2.zza(((zzsq) ((zzajc) zzb2.zza((zzsr) ((zzajc) zzsr.zzb().zza(zzedVar.zzb()).zzf())).zza(zzedVar.zzc()).zzf())).zzi());
        zzed.zzb zzf = zzedVar.zzf();
        if (zzed.zzb.zza.equals(zzf)) {
            zzvsVar = zzvs.TINK;
        } else if (zzed.zzb.zzb.equals(zzf)) {
            zzvsVar = zzvs.CRUNCHY;
        } else {
            if (!zzed.zzb.zzc.equals(zzf)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzf));
            }
            zzvsVar = zzvs.RAW;
        }
        return zzor.zzb((zzvb) ((zzajc) zza3.zza(zzvsVar).zzf()));
    }

    public static void zza() {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdw zzb(zzos zzosVar, zzcs zzcsVar) {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzsn zza2 = zzsn.zza(zzosVar.zzd(), zzaio.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return new zzdw.zza().zza(zzed.zze().zzb(zza2.zze().zzb()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzosVar.zzc())).zza()).zza(zzxu.zza(zza2.zze().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzed zzb(zzor zzorVar) {
        if (zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzsq zza2 = zzsq.zza(zzorVar.zza().zze(), zzaio.zza());
                return zzed.zze().zzb(zza2.zza()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzorVar.zza().zzd())).zza();
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
    }
}
