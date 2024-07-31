package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzben extends zzgzu implements zzhbf {
    private static final zzben zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzben zzbenVar = new zzben();
        zzb = zzbenVar;
        zzgzu.zzaU(zzben.class, zzbenVar);
    }

    private zzben() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzben();
        }
        zzbbw zzbbwVar = null;
        if (i11 == 4) {
            return new zzbem(zzbbwVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
