package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzbcx extends zzgzu implements zzhbf {
    private static final zzbcx zzb;
    private int zzd;
    private zzben zzf;
    private int zzg;
    private zzbep zzh;
    private int zzi;
    private String zze = "";
    private int zzj = AdError.NETWORK_ERROR_CODE;
    private int zzk = AdError.NETWORK_ERROR_CODE;
    private int zzl = AdError.NETWORK_ERROR_CODE;

    static {
        zzbcx zzbcxVar = new zzbcx();
        zzb = zzbcxVar;
        zzgzu.zzaU(zzbcx.class, zzbcxVar);
    }

    private zzbcx() {
    }

    public static zzbcx zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzbcx zzbcxVar, String str) {
        zzbcxVar.zzd |= 1;
        zzbcxVar.zze = str;
    }

    public static /* synthetic */ void zze(zzbcx zzbcxVar, zzbep zzbepVar) {
        zzbepVar.getClass();
        zzbcxVar.zzh = zzbepVar;
        zzbcxVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgzy zzgzyVar = zzbdc.zza;
            return zzgzu.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgzyVar, "zzk", zzgzyVar, "zzl", zzgzyVar});
        }
        if (i11 == 3) {
            return new zzbcx();
        }
        if (i11 == 4) {
            return new zzbcw(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
