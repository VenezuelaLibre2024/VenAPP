package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzbfa extends zzgzu implements zzhbf {
    private static final zzbfa zzb;
    private int zzd;
    private int zze = AdError.NETWORK_ERROR_CODE;
    private zzbew zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzbfa zzbfaVar = new zzbfa();
        zzb = zzbfaVar;
        zzgzu.zzaU(zzbfa.class, zzbfaVar);
    }

    private zzbfa() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", zzbdc.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzbfa();
        }
        if (i11 == 4) {
            return new zzbez(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
