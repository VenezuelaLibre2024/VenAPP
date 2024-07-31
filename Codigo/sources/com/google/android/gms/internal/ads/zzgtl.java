package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtl extends zzgzu implements zzhbf {
    private static final zzgtl zzb;
    private int zzd;

    static {
        zzgtl zzgtlVar = new zzgtl();
        zzb = zzgtlVar;
        zzgzu.zzaU(zzgtl.class, zzgtlVar);
    }

    private zzgtl() {
    }

    public static zzgtk zzc() {
        return (zzgtk) zzb.zzaA();
    }

    public static zzgtl zze() {
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
            return new zzgtl();
        }
        if (i11 == 4) {
            return new zzgtk(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
