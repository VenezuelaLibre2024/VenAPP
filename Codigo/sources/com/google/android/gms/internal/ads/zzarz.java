package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzarz extends zzgzu implements zzhbf {
    private static final zzarz zzb;
    private int zzd;
    private zzasb zze;
    private zzase zzf;

    static {
        zzarz zzarzVar = new zzarz();
        zzb = zzarzVar;
        zzgzu.zzaU(zzarz.class, zzarzVar);
    }

    private zzarz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzarz();
        }
        if (i11 == 4) {
            return new zzary(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
