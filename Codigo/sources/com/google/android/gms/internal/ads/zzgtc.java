package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtc extends zzgzu implements zzhbf {
    private static final zzgtc zzb;
    private int zzd;

    static {
        zzgtc zzgtcVar = new zzgtc();
        zzb = zzgtcVar;
        zzgzu.zzaU(zzgtc.class, zzgtcVar);
    }

    private zzgtc() {
    }

    public static zzgtb zzc() {
        return (zzgtb) zzb.zzaA();
    }

    public static zzgtc zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzgtc();
        }
        if (i11 == 4) {
            return new zzgtb(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
