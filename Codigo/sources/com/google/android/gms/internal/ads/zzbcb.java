package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzbcb extends zzgzu implements zzhbf {
    private static final zzbcb zzb;
    private int zzd;
    private int zze;
    private zzbcr zzg;
    private zzbct zzh;
    private zzbcv zzj;
    private zzbef zzk;
    private zzbdv zzl;
    private zzbdj zzm;
    private zzbdl zzn;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private zzhad zzi = zzgzu.zzaN();
    private zzhad zzo = zzgzu.zzaN();

    static {
        zzbcb zzbcbVar = new zzbcb();
        zzb = zzbcbVar;
        zzgzu.zzaU(zzbcb.class, zzbcbVar);
    }

    private zzbcb() {
    }

    public static zzbcb zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzbcb zzbcbVar, zzbbz zzbbzVar) {
        zzbcbVar.zze = zzbbzVar.zza();
        zzbcbVar.zzd |= 1;
    }

    public static /* synthetic */ void zzf(zzbcb zzbcbVar, zzbct zzbctVar) {
        zzbctVar.getClass();
        zzbcbVar.zzh = zzbctVar;
        zzbcbVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", zzbby.zza, "zzf", zzbdc.zza, "zzg", "zzh", "zzi", zzbcp.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzber.class});
        }
        if (i11 == 3) {
            return new zzbcb();
        }
        if (i11 == 4) {
            return new zzbca(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzbct zzd() {
        zzbct zzbctVar = this.zzh;
        return zzbctVar == null ? zzbct.zzc() : zzbctVar;
    }
}
