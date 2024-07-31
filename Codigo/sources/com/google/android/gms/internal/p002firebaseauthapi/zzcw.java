package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzed;
import com.google.android.gms.internal.p002firebaseauthapi.zzfv;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzcw {
    public static final String zza = new zzdi().zze();
    public static final String zzb = new zzeo().zze();
    private static final String zzc = new zzfg().zze();
    private static final String zzd = new zzdz().zze();
    private static final String zze = new zzgc().zze();
    private static final String zzf = new zzgg().zze();
    private static final String zzg = new zzfu().zze();
    private static final String zzh = new zzhj().zze();

    @Deprecated
    private static final zzvt zzi;

    @Deprecated
    private static final zzvt zzj;

    @Deprecated
    private static final zzvt zzk;

    static {
        zzvt zzb2 = zzvt.zzb();
        zzi = zzb2;
        zzj = zzb2;
        zzk = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() {
        zzda.zzc();
        zzqo.zza();
        zzdi.zza(true);
        zzeo.zza(true);
        if (zzif.zzb()) {
            return;
        }
        zzct.zza((zznb) new zzdz(), true);
        zzef.zza();
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzhb.zzc);
        zzed.zza zzc2 = zzed.zze().zza(16).zzb(16).zzc(16);
        zzed.zzb zzbVar = zzed.zzb.zzc;
        hashMap.put("AES128_EAX_RAW", zzc2.zza(zzbVar).zza());
        hashMap.put("AES256_EAX", zzhb.zzd);
        hashMap.put("AES256_EAX_RAW", zzed.zze().zza(16).zzb(32).zzc(16).zza(zzbVar).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zzfg.zza(true);
        zzct.zza((zznb) new zzfu(), true);
        zzfx.zza();
        zzns zza3 = zzns.zza();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("CHACHA20_POLY1305", zzfv.zza(zzfv.zza.zza));
        hashMap2.put("CHACHA20_POLY1305_RAW", zzfv.zza(zzfv.zza.zzc));
        zza3.zza(Collections.unmodifiableMap(hashMap2));
        zzct.zza((zznb) new zzgc(), true);
        zzgn.zza();
        zzct.zza((zznb) new zzgg(), true);
        zzgu.zza();
        zzhj.zza(true);
    }
}