package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgks {
    public static final /* synthetic */ int zza = 0;
    private static final zzggd zzb = zzgnm.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgfs.class, zzgus.SYMMETRIC, zzgvu.zzg());
    private static final zzgnt zzc = new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgkq
        @Override // com.google.android.gms.internal.ads.zzgnt
        public final zzggc zza(zzggq zzggqVar, Integer num) {
            return zzgla.zza((zzglf) zzggqVar);
        }
    };
    private static final zzgoq zzd = zzgoq.zzb(new zzgoo() { // from class: com.google.android.gms.internal.ads.zzgkr
        @Override // com.google.android.gms.internal.ads.zzgoo
        public final Object zza(zzggc zzggcVar) {
            zzgla zzglaVar = (zzgla) zzggcVar;
            int i10 = zzgks.zza;
            try {
                return new zzgkp(zzguy.zze(zzghe.zzb(zzglaVar.zzb().zzb()), zzgzf.zza()), zzggo.zza(zzglaVar.zzb().zzc()).zzb());
            } catch (zzhag e10) {
                throw new GeneralSecurityException("Parsing of DEK key template failed: ", e10);
            }
        }
    }, zzgla.class, zzgfs.class);

    public static void zza(boolean z10) {
        int i10 = zzglk.zza;
        zzglk.zze(zzgoe.zzd());
        zzgnu.zzb().zzc(zzc, zzglf.class);
        zzgob.zza().zze(zzd);
        zzghb.zze(zzb, true);
    }
}
