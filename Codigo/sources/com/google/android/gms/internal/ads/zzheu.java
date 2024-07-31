package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzheu extends zzgzu implements zzhbf {
    private static final zzheu zzb;
    private int zzd;
    private int zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        zzheu zzheuVar = new zzheu();
        zzb = zzheuVar;
        zzgzu.zzaU(zzheu.class, zzheuVar);
    }

    private zzheu() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzheu();
        }
        if (i11 == 4) {
            return new zzhet(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
