package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfrs extends zzgzu implements zzhbf {
    private static final zzfrs zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfro zzh;

    static {
        zzfrs zzfrsVar = new zzfrs();
        zzb = zzfrsVar;
        zzgzu.zzaU(zzfrs.class, zzfrsVar);
    }

    private zzfrs() {
    }

    public static zzfrq zza() {
        return (zzfrq) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzfrs zzfrsVar, String str) {
        str.getClass();
        zzfrsVar.zzd |= 2;
        zzfrsVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzfrs zzfrsVar, zzfro zzfroVar) {
        zzfroVar.getClass();
        zzfrsVar.zzh = zzfroVar;
        zzfrsVar.zzd |= 8;
    }

    public static /* synthetic */ void zzf(zzfrs zzfrsVar, int i10) {
        zzfrsVar.zze = 1;
        zzfrsVar.zzd = 1 | zzfrsVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfrr.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzfrs();
        }
        if (i11 == 4) {
            return new zzfrq(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
