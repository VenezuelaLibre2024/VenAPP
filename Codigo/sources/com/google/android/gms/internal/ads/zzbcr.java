package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbcr extends zzgzu implements zzhbf {
    private static final zzbcr zzb;
    private int zzd;
    private String zze = "";
    private zzhad zzf = zzgzu.zzaN();
    private int zzg;

    static {
        zzbcr zzbcrVar = new zzbcr();
        zzb = zzbcrVar;
        zzgzu.zzaU(zzbcr.class, zzbcrVar);
    }

    private zzbcr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzbcp.class, "zzg", zzbdc.zza});
        }
        if (i11 == 3) {
            return new zzbcr();
        }
        if (i11 == 4) {
            return new zzbcq(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
