package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzif;
import com.google.android.gms.internal.p002firebaseauthapi.zzql;
import com.google.android.gms.internal.p002firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzqg extends zznb<zzuc> {
    private static final zzod<zzqc, zzpz> zza = zzod.zza(new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqf
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final Object zza(zzbt zzbtVar) {
            return new zzrf((zzqc) zzbtVar);
        }
    }, zzqc.class, zzpz.class);
    private static final zzod<zzqc, zzce> zzb = zzod.zza(new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqi
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final Object zza(zzbt zzbtVar) {
            return zzxm.zza((zzqc) zzbtVar);
        }
    }, zzqc.class, zzce.class);
    private static final zzno<zzql> zzc = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqh
    };

    public zzqg() {
        super(zzuc.class, new zzqk(zzce.class));
    }

    public static int zza() {
        return 0;
    }

    /* renamed from: zza, reason: avoid collision after fix types in other method */
    public static void zza2(zzuc zzucVar) {
        zzxo.zza(zzucVar.zza(), 0);
        if (zzucVar.zzf().zzb() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzb(zzucVar.zze());
    }

    public static void zza(boolean z10) {
        zzct.zza((zznb) new zzqg(), true);
        zzre.zza();
        zznr.zza().zza(zza);
        zznr.zza().zza(zzb);
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzqx.zza);
        zzql.zza zzb2 = zzql.zzd().zza(32).zzb(16);
        zzql.zzb zzbVar = zzql.zzb.zzd;
        zzql.zza zza3 = zzb2.zza(zzbVar);
        zzql.zzc zzcVar = zzql.zzc.zzc;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zza3.zza(zzcVar).zza());
        zzql.zza zzb3 = zzql.zzd().zza(32).zzb(32);
        zzql.zzb zzbVar2 = zzql.zzb.zza;
        hashMap.put("HMAC_SHA256_256BITTAG", zzb3.zza(zzbVar2).zza(zzcVar).zza());
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzql.zzd().zza(32).zzb(32).zza(zzbVar).zza(zzcVar).zza());
        zzql.zza zza4 = zzql.zzd().zza(64).zzb(16).zza(zzbVar2);
        zzql.zzc zzcVar2 = zzql.zzc.zze;
        hashMap.put("HMAC_SHA512_128BITTAG", zza4.zza(zzcVar2).zza());
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzql.zzd().zza(64).zzb(16).zza(zzbVar).zza(zzcVar2).zza());
        hashMap.put("HMAC_SHA512_256BITTAG", zzql.zzd().zza(64).zzb(32).zza(zzbVar2).zza(zzcVar2).zza());
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzql.zzd().zza(64).zzb(32).zza(zzbVar).zza(zzcVar2).zza());
        hashMap.put("HMAC_SHA512_512BITTAG", zzqx.zzb);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzql.zzd().zza(64).zzb(64).zza(zzbVar).zza(zzcVar2).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznl.zza().zza(zzc, zzql.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(zzuh zzuhVar) {
        if (zzuhVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i10 = zzqm.zza[zzuhVar.zzb().ordinal()];
        if (i10 == 1) {
            if (zzuhVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 2) {
            if (zzuhVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 3) {
            if (zzuhVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 4) {
            if (zzuhVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i10 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzuhVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ zzuc zza(zzahp zzahpVar) {
        return zzuc.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* bridge */ /* synthetic */ void zza(zzuc zzucVar) {
        zza2(zzucVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzne<?, zzuc> zzc() {
        return new zzqj(this, zzug.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }
}
