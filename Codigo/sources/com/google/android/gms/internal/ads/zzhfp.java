package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfp extends zzgzu implements zzhbf {
    private static final zzhfp zzb;
    private int zzd;
    private int zze;
    private zzher zzg;
    private zzhev zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private zzgzz zzj = zzgzu.zzaJ();
    private String zzk = "";
    private zzhad zzm = zzgzu.zzaN();

    static {
        zzhfp zzhfpVar = new zzhfp();
        zzb = zzhfpVar;
        zzgzu.zzaU(zzhfp.class, zzhfpVar);
    }

    private zzhfp() {
    }

    public static zzhfo zzc() {
        return (zzhfo) zzb.zzaA();
    }

    public static /* synthetic */ void zzf(zzhfp zzhfpVar, int i10) {
        zzhfpVar.zzd |= 1;
        zzhfpVar.zze = i10;
    }

    public static /* synthetic */ void zzg(zzhfp zzhfpVar, String str) {
        str.getClass();
        zzhfpVar.zzd |= 2;
        zzhfpVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzhfp zzhfpVar, zzher zzherVar) {
        zzherVar.getClass();
        zzhfpVar.zzg = zzherVar;
        zzhfpVar.zzd |= 4;
    }

    public static /* synthetic */ void zzi(zzhfp zzhfpVar, String str) {
        str.getClass();
        zzhad zzhadVar = zzhfpVar.zzm;
        if (!zzhadVar.zzc()) {
            zzhfpVar.zzm = zzgzu.zzaO(zzhadVar);
        }
        zzhfpVar.zzm.add(str);
    }

    public static /* synthetic */ void zzj(zzhfp zzhfpVar, int i10) {
        zzhfpVar.zzl = i10 - 1;
        zzhfpVar.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzhfm.zza, "zzm"});
        }
        if (i11 == 3) {
            return new zzhfp();
        }
        if (i11 == 4) {
            return new zzhfo(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String zze() {
        return this.zzf;
    }
}
