package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbcj extends zzgzu implements zzhbf {
    private static final zzbcj zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbcj zzbcjVar = new zzbcj();
        zzb = zzbcjVar;
        zzgzu.zzaU(zzbcj.class, zzbcjVar);
    }

    private zzbcj() {
    }

    public static zzbci zza() {
        return (zzbci) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzbcj zzbcjVar, boolean z10) {
        zzbcjVar.zzd |= 1;
        zzbcjVar.zze = z10;
    }

    public static /* synthetic */ void zze(zzbcj zzbcjVar, boolean z10) {
        zzbcjVar.zzd |= 2;
        zzbcjVar.zzf = z10;
    }

    public static /* synthetic */ void zzf(zzbcj zzbcjVar, int i10) {
        zzbcjVar.zzd |= 4;
        zzbcjVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzbcj();
        }
        if (i11 == 4) {
            return new zzbci(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
