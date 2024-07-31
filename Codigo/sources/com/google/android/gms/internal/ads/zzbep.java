package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbep extends zzgzu implements zzhbf {
    private static final zzbep zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbep zzbepVar = new zzbep();
        zzb = zzbepVar;
        zzgzu.zzaU(zzbep.class, zzbepVar);
    }

    private zzbep() {
    }

    public static zzbeo zza() {
        return (zzbeo) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzbep zzbepVar, int i10) {
        zzbepVar.zzd |= 1;
        zzbepVar.zze = i10;
    }

    public static /* synthetic */ void zze(zzbep zzbepVar, int i10) {
        zzbepVar.zzd |= 2;
        zzbepVar.zzf = i10;
    }

    public static /* synthetic */ void zzf(zzbep zzbepVar, int i10) {
        zzbepVar.zzd |= 4;
        zzbepVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzbep();
        }
        if (i11 == 4) {
            return new zzbeo(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
