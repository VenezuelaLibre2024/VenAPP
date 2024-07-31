package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzheg extends zzgzu implements zzhbf {
    private static final zzheg zzb;
    private int zzd;
    private zzgyl zze = zzgyl.zzb;

    static {
        zzheg zzhegVar = new zzheg();
        zzb = zzhegVar;
        zzgzu.zzaU(zzheg.class, zzhegVar);
    }

    private zzheg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzheg();
        }
        if (i11 == 4) {
            return new zzhef(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
