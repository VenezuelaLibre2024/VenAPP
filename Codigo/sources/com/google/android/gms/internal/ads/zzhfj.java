package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfj extends zzgzu implements zzhbf {
    private static final zzhfj zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgyl zzg;
    private zzgyl zzh;

    static {
        zzhfj zzhfjVar = new zzhfj();
        zzb = zzhfjVar;
        zzgzu.zzaU(zzhfj.class, zzhfjVar);
    }

    private zzhfj() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    public static zzhfh zza() {
        return (zzhfh) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzhfj zzhfjVar, String str) {
        zzhfjVar.zzd |= 2;
        zzhfjVar.zzf = "image/png";
    }

    public static /* synthetic */ void zze(zzhfj zzhfjVar, zzgyl zzgylVar) {
        zzgylVar.getClass();
        zzhfjVar.zzd |= 4;
        zzhfjVar.zzg = zzgylVar;
    }

    public static /* synthetic */ void zzf(zzhfj zzhfjVar, int i10) {
        zzhfjVar.zze = 1;
        zzhfjVar.zzd = 1 | zzhfjVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzhfi.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzhfj();
        }
        if (i11 == 4) {
            return new zzhfh(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
