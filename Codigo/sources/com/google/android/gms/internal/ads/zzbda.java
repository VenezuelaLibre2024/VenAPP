package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbda extends zzgzu implements zzhbf {
    private static final zzbda zzb;
    private int zzd;
    private int zze;
    private zzbep zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzbda zzbdaVar = new zzbda();
        zzb = zzbdaVar;
        zzgzu.zzaU(zzbda.class, zzbdaVar);
    }

    private zzbda() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", zzbcz.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzbda();
        }
        if (i11 == 4) {
            return new zzbcy(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
