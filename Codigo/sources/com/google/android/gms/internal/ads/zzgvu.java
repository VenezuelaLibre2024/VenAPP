package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvu extends zzgzu implements zzhbf {
    private static final zzgvu zzb;
    private static volatile zzhbl zzd;
    private int zze;
    private int zzf;
    private zzgvx zzg;

    static {
        zzgvu zzgvuVar = new zzgvu();
        zzb = zzgvuVar;
        zzgzu.zzaU(zzgvu.class, zzgvuVar);
    }

    private zzgvu() {
    }

    public static zzgvt zzc() {
        return (zzgvt) zzb.zzaA();
    }

    public static zzgvu zze(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgvu) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public static zzhbl zzg() {
        return (zzhbl) zzb.zzb(7, null, null);
    }

    public static /* synthetic */ void zzh(zzgvu zzgvuVar, zzgvx zzgvxVar) {
        zzgvxVar.getClass();
        zzgvuVar.zzg = zzgvxVar;
        zzgvuVar.zze |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzgvu();
        }
        if (i11 == 4) {
            return new zzgvt(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzhbl zzhblVar = zzd;
        if (zzhblVar == null) {
            synchronized (zzgvu.class) {
                zzhblVar = zzd;
                if (zzhblVar == null) {
                    zzhblVar = new zzgzq(zzb);
                    zzd = zzhblVar;
                }
            }
        }
        return zzhblVar;
    }

    public final zzgvx zzf() {
        zzgvx zzgvxVar = this.zzg;
        return zzgvxVar == null ? zzgvx.zze() : zzgvxVar;
    }
}
