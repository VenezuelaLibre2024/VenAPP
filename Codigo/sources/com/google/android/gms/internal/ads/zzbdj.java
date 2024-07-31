package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbdj extends zzgzu implements zzhbf {
    private static final zzbdj zzb;
    private int zzd;
    private int zze;
    private zzgzz zzf = zzgzu.zzaJ();

    static {
        zzbdj zzbdjVar = new zzbdj();
        zzb = zzbdjVar;
        zzgzu.zzaU(zzbdj.class, zzbdjVar);
    }

    private zzbdj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzd", "zze", zzbdc.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzbdj();
        }
        if (i11 == 4) {
            return new zzbdi(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
