package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatf extends zzgzu implements zzhbf {
    private static final zzatf zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzgzz zzh = zzgzu.zzaJ();
    private long zzi;

    static {
        zzatf zzatfVar = new zzatf();
        zzb = zzatfVar;
        zzgzu.zzaU(zzatf.class, zzatfVar);
    }

    private zzatf() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzatf();
        }
        zzasf zzasfVar = null;
        if (i11 == 4) {
            return new zzate(zzasfVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
