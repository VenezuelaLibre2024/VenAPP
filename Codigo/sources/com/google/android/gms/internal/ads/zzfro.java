package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfro extends zzgzu implements zzhbf {
    private static final zzhaa zzb = new zzfrl();
    private static final zzfro zzd;
    private int zze;
    private zzgzz zzf = zzgzu.zzaJ();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfro zzfroVar = new zzfro();
        zzd = zzfroVar;
        zzgzu.zzaU(zzfro.class, zzfroVar);
    }

    private zzfro() {
    }

    public static zzfrn zza() {
        return (zzfrn) zzd.zzaA();
    }

    public static /* synthetic */ void zzd(zzfro zzfroVar, String str) {
        str.getClass();
        zzfroVar.zze |= 1;
        zzfroVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzfro zzfroVar, int i10) {
        zzgzz zzgzzVar = zzfroVar.zzf;
        if (!zzgzzVar.zzc()) {
            zzfroVar.zzf = zzgzu.zzaK(zzgzzVar);
        }
        zzfroVar.zzf.zzh(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzfrm.zza, "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzfro();
        }
        if (i11 == 4) {
            return new zzfrn(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
