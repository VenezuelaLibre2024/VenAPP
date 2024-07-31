package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhdv extends zzgzu implements zzhbf {
    private static final zzhdv zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private zzgyl zzg = zzgyl.zzb;

    static {
        zzhdv zzhdvVar = new zzhdv();
        zzb = zzhdvVar;
        zzgzu.zzaU(zzhdv.class, zzhdvVar);
    }

    private zzhdv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", zzhdu.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzhdv();
        }
        if (i11 == 4) {
            return new zzhdt(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
