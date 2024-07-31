package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzbct extends zzgzu implements zzhbf {
    private static final zzbct zzb;
    private int zzd;
    private String zze = "";
    private zzhad zzf = zzgzu.zzaN();
    private int zzg = AdError.NETWORK_ERROR_CODE;
    private int zzh = AdError.NETWORK_ERROR_CODE;
    private int zzi = AdError.NETWORK_ERROR_CODE;

    static {
        zzbct zzbctVar = new zzbct();
        zzb = zzbctVar;
        zzgzu.zzaU(zzbct.class, zzbctVar);
    }

    private zzbct() {
    }

    public static zzbct zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzbct zzbctVar, String str) {
        str.getClass();
        zzbctVar.zzd |= 1;
        zzbctVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgzy zzgzyVar = zzbdc.zza;
            return zzgzu.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", zzbcp.class, "zzg", zzgzyVar, "zzh", zzgzyVar, "zzi", zzgzyVar});
        }
        if (i11 == 3) {
            return new zzbct();
        }
        if (i11 == 4) {
            return new zzbcs(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
