package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbcv extends zzgzu implements zzhbf {
    private static final zzbcv zzb;
    private int zzd;
    private int zze;
    private zzben zzf;
    private zzben zzg;
    private zzben zzh;
    private zzhad zzi = zzgzu.zzaN();
    private int zzj;

    static {
        zzbcv zzbcvVar = new zzbcv();
        zzb = zzbcvVar;
        zzgzu.zzaU(zzbcv.class, zzbcvVar);
    }

    private zzbcv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzben.class, "zzj"});
        }
        if (i11 == 3) {
            return new zzbcv();
        }
        if (i11 == 4) {
            return new zzbcu(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
