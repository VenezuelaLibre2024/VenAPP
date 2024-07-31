package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzbfg extends zzgzu implements zzhbf {
    private static final zzbfg zzb;
    private int zzd;
    private int zze = AdError.NETWORK_ERROR_CODE;
    private zzbew zzf;
    private zzben zzg;

    static {
        zzbfg zzbfgVar = new zzbfg();
        zzb = zzbfgVar;
        zzgzu.zzaU(zzbfg.class, zzbfgVar);
    }

    private zzbfg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzbdc.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzbfg();
        }
        if (i11 == 4) {
            return new zzbff(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
