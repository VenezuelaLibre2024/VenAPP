package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhgb extends zzgzu implements zzhbf {
    private static final zzhgb zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzhgb zzhgbVar = new zzhgb();
        zzb = zzhgbVar;
        zzgzu.zzaU(zzhgb.class, zzhgbVar);
    }

    private zzhgb() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzhgb();
        }
        zzhdp zzhdpVar = null;
        if (i11 == 4) {
            return new zzhga(zzhdpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
