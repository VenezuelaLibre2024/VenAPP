package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzheh extends zzgzu implements zzhbf {
    private static final zzheh zzb;
    private int zzd;
    private zzheg zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        zzheh zzhehVar = new zzheh();
        zzb = zzhehVar;
        zzgzu.zzaU(zzheh.class, zzhehVar);
    }

    private zzheh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzheh();
        }
        if (i11 == 4) {
            return new zzhee(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
