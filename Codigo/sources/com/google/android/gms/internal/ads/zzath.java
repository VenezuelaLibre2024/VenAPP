package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzath extends zzgzu implements zzhbf {
    private static final zzath zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private zzgyl zzg;
    private zzgyl zzh;

    static {
        zzath zzathVar = new zzath();
        zzb = zzathVar;
        zzgzu.zzaU(zzath.class, zzathVar);
    }

    private zzath() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zze = zzgylVar;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    public static zzatg zza() {
        return (zzatg) zzb.zzaA();
    }

    public static zzath zzd(byte[] bArr, zzgzf zzgzfVar) {
        return (zzath) zzgzu.zzaI(zzb, bArr, zzgzfVar);
    }

    public static /* synthetic */ void zzi(zzath zzathVar, zzgyl zzgylVar) {
        zzathVar.zzd |= 1;
        zzathVar.zze = zzgylVar;
    }

    public static /* synthetic */ void zzj(zzath zzathVar, zzgyl zzgylVar) {
        zzathVar.zzd |= 2;
        zzathVar.zzf = zzgylVar;
    }

    public static /* synthetic */ void zzk(zzath zzathVar, zzgyl zzgylVar) {
        zzathVar.zzd |= 4;
        zzathVar.zzg = zzgylVar;
    }

    public static /* synthetic */ void zzl(zzath zzathVar, zzgyl zzgylVar) {
        zzathVar.zzd |= 8;
        zzathVar.zzh = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzath();
        }
        if (i11 == 4) {
            return new zzatg(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgyl zze() {
        return this.zze;
    }

    public final zzgyl zzf() {
        return this.zzf;
    }

    public final zzgyl zzg() {
        return this.zzh;
    }

    public final zzgyl zzh() {
        return this.zzg;
    }
}
