package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzbey extends zzgzu implements zzhbf {
    private static final zzbey zzb;
    private int zzd;
    private zzbep zze;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private zzbew zzg;
    private zzben zzh;

    static {
        zzbey zzbeyVar = new zzbey();
        zzb = zzbeyVar;
        zzgzu.zzaU(zzbey.class, zzbeyVar);
    }

    private zzbey() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzbdc.zza, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzbey();
        }
        if (i11 == 4) {
            return new zzbex(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
