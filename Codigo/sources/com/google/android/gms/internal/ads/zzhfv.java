package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfv extends zzgzu implements zzhbf {
    private static final zzhfv zzb;
    private int zzd;
    private String zze = "";
    private zzgyl zzf = zzgyl.zzb;

    static {
        zzhfv zzhfvVar = new zzhfv();
        zzb = zzhfvVar;
        zzgzu.zzaU(zzhfv.class, zzhfvVar);
    }

    private zzhfv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzhfv();
        }
        if (i11 == 4) {
            return new zzhfu(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
