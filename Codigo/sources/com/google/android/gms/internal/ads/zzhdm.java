package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhdm extends zzgzu implements zzhbf {
    private static final zzhdm zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        zzhdm zzhdmVar = new zzhdm();
        zzb = zzhdmVar;
        zzgzu.zzaU(zzhdm.class, zzhdmVar);
    }

    private zzhdm() {
    }

    public static zzhdl zza() {
        return (zzhdl) zzb.zzaA();
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzhdm();
        }
        if (i11 == 4) {
            return new zzhdl(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
