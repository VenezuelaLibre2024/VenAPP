package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfr extends zzgzu implements zzhbf {
    private static final zzhfr zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzhfr zzhfrVar = new zzhfr();
        zzb = zzhfrVar;
        zzgzu.zzaU(zzhfr.class, zzhfrVar);
    }

    private zzhfr() {
    }

    public static zzhfq zza() {
        return (zzhfq) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzhfr zzhfrVar, String str) {
        zzhfrVar.zzd |= 1;
        zzhfrVar.zze = str;
    }

    public static /* synthetic */ void zze(zzhfr zzhfrVar, long j10) {
        zzhfrVar.zzd |= 2;
        zzhfrVar.zzf = j10;
    }

    public static /* synthetic */ void zzf(zzhfr zzhfrVar, boolean z10) {
        zzhfrVar.zzd |= 4;
        zzhfrVar.zzg = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzhfs.zza, "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzhfr();
        }
        if (i11 == 4) {
            return new zzhfq(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
