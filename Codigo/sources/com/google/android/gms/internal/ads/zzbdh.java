package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbdh extends zzgzu implements zzhbf {
    private static final zzbdh zzb;
    private int zzd;
    private int zzf;
    private zzben zzh;
    private String zze = "";
    private zzgzz zzg = zzgzu.zzaJ();

    static {
        zzbdh zzbdhVar = new zzbdh();
        zzb = zzbdhVar;
        zzgzu.zzaU(zzbdh.class, zzbdhVar);
    }

    private zzbdh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbdc.zza, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzbdh();
        }
        if (i11 == 4) {
            return new zzbdg(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
