package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zznh {
    public static final zzrr zza = new zznj();

    public static <P> zzrq zza(zzcg<P> zzcgVar) {
        zzbv zzbvVar;
        zzrt zzrtVar = new zzrt();
        zzrtVar.zza(zzcgVar.zzb());
        Iterator<List<zzcl<P>>> it = zzcgVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzcl<P> zzclVar : it.next()) {
                int i10 = zznk.zza[zzclVar.zzc().ordinal()];
                if (i10 == 1) {
                    zzbvVar = zzbv.zza;
                } else if (i10 == 2) {
                    zzbvVar = zzbv.zzb;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzbvVar = zzbv.zzc;
                }
                int zza2 = zzclVar.zza();
                String zzg = zzclVar.zzg();
                if (zzg.startsWith("type.googleapis.com/google.crypto.")) {
                    zzg = zzg.substring(34);
                }
                zzrtVar.zza(zzbvVar, zza2, zzg, zzclVar.zzd().name());
            }
        }
        if (zzcgVar.zza() != null) {
            zzrtVar.zza(zzcgVar.zza().zza());
        }
        try {
            return zzrtVar.zza();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
