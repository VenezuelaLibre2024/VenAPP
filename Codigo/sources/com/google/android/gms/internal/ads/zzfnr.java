package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfnr extends zzgzu implements zzhbf {
    private static final zzfnr zzb;
    private zzhad zzd = zzgzu.zzaN();

    static {
        zzfnr zzfnrVar = new zzfnr();
        zzb = zzfnrVar;
        zzgzu.zzaU(zzfnr.class, zzfnrVar);
    }

    private zzfnr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfno.class});
        }
        if (i11 == 3) {
            return new zzfnr();
        }
        if (i11 == 4) {
            return new zzfnq(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
