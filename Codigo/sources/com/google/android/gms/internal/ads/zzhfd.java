package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfd extends zzgzu implements zzhbf {
    private static final zzhfd zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        zzhfd zzhfdVar = new zzhfd();
        zzb = zzhfdVar;
        zzgzu.zzaU(zzhfd.class, zzhfdVar);
    }

    private zzhfd() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzhfc.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzhfd();
        }
        zzhdp zzhdpVar = null;
        if (i11 == 4) {
            return new zzhfb(zzhdpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
