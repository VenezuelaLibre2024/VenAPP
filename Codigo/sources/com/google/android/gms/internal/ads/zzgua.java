package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgua extends zzgzu implements zzhbf {
    private static final zzgua zzb;
    private static volatile zzhbl zzd;
    private int zze;
    private zzgyl zzf = zzgyl.zzb;

    static {
        zzgua zzguaVar = new zzgua();
        zzb = zzguaVar;
        zzgzu.zzaU(zzgua.class, zzguaVar);
    }

    private zzgua() {
    }

    public static zzgtz zzc() {
        return (zzgtz) zzb.zzaA();
    }

    public static zzgua zze(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgua) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
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
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgua();
        }
        if (i11 == 4) {
            return new zzgtz(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzhbl zzhblVar = zzd;
        if (zzhblVar == null) {
            synchronized (zzgua.class) {
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
