package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzheq extends zzgzu implements zzhbf {
    private static final zzheq zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        zzheq zzheqVar = new zzheq();
        zzb = zzheqVar;
        zzgzu.zzaU(zzheq.class, zzheqVar);
    }

    private zzheq() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zze = zzgylVar;
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
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzheq();
        }
        if (i11 == 4) {
            return new zzhep(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
