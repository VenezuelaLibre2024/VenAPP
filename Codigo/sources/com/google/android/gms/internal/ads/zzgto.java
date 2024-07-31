package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgto extends zzgzu implements zzhbf {
    private static final zzgto zzb;
    private static volatile zzhbl zzd;
    private int zze;
    private zzgyl zzf = zzgyl.zzb;

    static {
        zzgto zzgtoVar = new zzgto();
        zzb = zzgtoVar;
        zzgzu.zzaU(zzgto.class, zzgtoVar);
    }

    private zzgto() {
    }

    public static zzgtn zzc() {
        return (zzgtn) zzb.zzaA();
    }

    public static zzgto zze(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgto) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public static zzhbl zzg() {
        return (zzhbl) zzb.zzb(7, null, null);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgto();
        }
        if (i11 == 4) {
            return new zzgtn(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzhbl zzhblVar = zzd;
        if (zzhblVar == null) {
            synchronized (zzgto.class) {
                zzhblVar = zzd;
                if (zzhblVar == null) {
                    zzhblVar = new zzgzq(zzb);
                    zzd = zzhblVar;
                }
            }
        }
        return zzhblVar;
    }

    public final zzgyl zzf() {
        return this.zzf;
    }
}
