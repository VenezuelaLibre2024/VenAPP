package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbfk extends zzgzu implements zzhbf {
    private static final zzbfk zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbfk zzbfkVar = new zzbfk();
        zzb = zzbfkVar;
        zzgzu.zzaU(zzbfk.class, zzbfkVar);
    }

    private zzbfk() {
    }

    public static zzbfj zza() {
        return (zzbfj) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzbfk zzbfkVar, boolean z10) {
        zzbfkVar.zzd |= 1;
        zzbfkVar.zze = z10;
    }

    public static /* synthetic */ void zze(zzbfk zzbfkVar, int i10) {
        zzbfkVar.zzd |= 2;
        zzbfkVar.zzf = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzbfk();
        }
        if (i11 == 4) {
            return new zzbfj(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
