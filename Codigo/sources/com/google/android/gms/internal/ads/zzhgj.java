package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhgj extends zzgzu implements zzhbf {
    private static final zzhgj zzb;
    private int zzd;
    private boolean zzk;
    private double zzl;
    private int zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private String zze = "";
    private String zzf = "";
    private int zzg = 4;
    private zzhad zzh = zzgzu.zzaN();
    private String zzi = "";
    private String zzj = "";
    private zzhad zzm = zzgzu.zzaN();

    static {
        zzhgj zzhgjVar = new zzhgj();
        zzb = zzhgjVar;
        zzgzu.zzaU(zzhgj.class, zzhgjVar);
    }

    private zzhgj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzd", "zze", "zzg", zzhgi.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzhgh.class, "zzf", "zzn", zzhgf.zza, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i11 == 3) {
            return new zzhgj();
        }
        if (i11 == 4) {
            return new zzhge(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
