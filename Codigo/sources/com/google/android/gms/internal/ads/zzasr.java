package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzasr extends zzgzu implements zzhbf {
    private static final zzasr zzb;
    private int zzd;
    private long zze = -1;

    static {
        zzasr zzasrVar = new zzasr();
        zzb = zzasrVar;
        zzgzu.zzaU(zzasr.class, zzasrVar);
    }

    private zzasr() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzasr();
        }
        zzasf zzasfVar = null;
        if (i11 == 4) {
            return new zzasq(zzasfVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
