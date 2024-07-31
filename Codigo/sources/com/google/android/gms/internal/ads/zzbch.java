package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbch extends zzgzu implements zzhbf {
    private static final zzbch zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbch zzbchVar = new zzbch();
        zzb = zzbchVar;
        zzgzu.zzaU(zzbch.class, zzbchVar);
    }

    private zzbch() {
    }

    public static zzbcg zza() {
        return (zzbcg) zzb.zzaA();
    }

    public static zzbch zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzbch zzbchVar, boolean z10) {
        zzbchVar.zzd |= 1;
        zzbchVar.zze = z10;
    }

    public static /* synthetic */ void zzf(zzbch zzbchVar, int i10) {
        zzbchVar.zzd |= 2;
        zzbchVar.zzf = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzbch();
        }
        if (i11 == 4) {
            return new zzbcg(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
