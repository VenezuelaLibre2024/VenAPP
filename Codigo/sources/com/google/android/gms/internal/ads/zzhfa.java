package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes2.dex */
public final class zzhfa extends zzgzu implements zzhbf {
    private static final zzhfa zzb;
    private int zzd;
    private int zze;
    private zzhez zzf;
    private zzhez zzg;

    static {
        zzhfa zzhfaVar = new zzhfa();
        zzb = zzhfaVar;
        zzgzu.zzaU(zzhfa.class, zzhfaVar);
    }

    private zzhfa() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzhex.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzhfa();
        }
        if (i11 == 4) {
            return new zzhew(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
