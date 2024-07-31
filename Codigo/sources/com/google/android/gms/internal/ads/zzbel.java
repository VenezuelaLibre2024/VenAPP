package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbel extends zzgzu implements zzhbf {
    private static final zzbel zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private zzben zzg;

    static {
        zzbel zzbelVar = new zzbel();
        zzb = zzbelVar;
        zzgzu.zzaU(zzbel.class, zzbelVar);
    }

    private zzbel() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbdc.zza, "zzg"});
        }
        if (i11 == 3) {
            return new zzbel();
        }
        if (i11 == 4) {
            return new zzbek(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
