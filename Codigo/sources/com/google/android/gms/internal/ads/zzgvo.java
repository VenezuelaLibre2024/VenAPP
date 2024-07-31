package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvo extends zzgzu implements zzhbf {
    private static final zzgvo zzb;
    private static volatile zzhbl zzd;
    private int zze;
    private int zzf;
    private zzgvr zzg;

    static {
        zzgvo zzgvoVar = new zzgvo();
        zzb = zzgvoVar;
        zzgzu.zzaU(zzgvo.class, zzgvoVar);
    }

    private zzgvo() {
    }

    public static zzgvn zzc() {
        return (zzgvn) zzb.zzaA();
    }

    public static zzgvo zze(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgvo) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public static zzhbl zzg() {
        return (zzhbl) zzb.zzb(7, null, null);
    }

    public static /* synthetic */ void zzh(zzgvo zzgvoVar, zzgvr zzgvrVar) {
        zzgvrVar.getClass();
        zzgvoVar.zzg = zzgvrVar;
        zzgvoVar.zze |= 1;
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
            return new zzgvo();
        }
        if (i11 == 4) {
            return new zzgvn(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzhbl zzhblVar = zzd;
        if (zzhblVar == null) {
            synchronized (zzgvo.class) {
                zzhblVar = zzd;
                if (zzhblVar == null) {
                    zzhblVar = new zzgzq(zzb);
                    zzd = zzhblVar;
                }
            }
        }
        return zzhblVar;
    }

    public final zzgvr zzf() {
        zzgvr zzgvrVar = this.zzg;
        return zzgvrVar == null ? zzgvr.zzd() : zzgvrVar;
    }
}
