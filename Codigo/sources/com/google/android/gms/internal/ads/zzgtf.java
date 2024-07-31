package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtf extends zzgzu implements zzhbf {
    private static final zzgtf zzb;
    private static volatile zzhbl zzd;
    private int zze;
    private int zzf;
    private zzgtl zzg;
    private zzgyl zzh = zzgyl.zzb;

    static {
        zzgtf zzgtfVar = new zzgtf();
        zzb = zzgtfVar;
        zzgzu.zzaU(zzgtf.class, zzgtfVar);
    }

    private zzgtf() {
    }

    public static zzgte zzc() {
        return (zzgte) zzb.zzaA();
    }

    public static zzgtf zze(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgtf) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public static zzhbl zzh() {
        return (zzhbl) zzb.zzb(7, null, null);
    }

    public static /* synthetic */ void zzi(zzgtf zzgtfVar, zzgtl zzgtlVar) {
        zzgtlVar.getClass();
        zzgtfVar.zzg = zzgtlVar;
        zzgtfVar.zze |= 1;
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
            return zzgzu.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzgtf();
        }
        if (i11 == 4) {
            return new zzgte(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzhbl zzhblVar = zzd;
        if (zzhblVar == null) {
            synchronized (zzgtf.class) {
                zzhblVar = zzd;
                if (zzhblVar == null) {
                    zzhblVar = new zzgzq(zzb);
                    zzd = zzhblVar;
                }
            }
        }
        return zzhblVar;
    }

    public final zzgtl zzf() {
        zzgtl zzgtlVar = this.zzg;
        return zzgtlVar == null ? zzgtl.zze() : zzgtlVar;
    }

    public final zzgyl zzg() {
        return this.zzh;
    }
}
