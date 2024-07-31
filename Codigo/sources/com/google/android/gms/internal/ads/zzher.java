package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzher extends zzgzu implements zzhbf {
    private static final zzher zzb;
    private int zzd;
    private zzheq zze;
    private zzgyl zzg;
    private zzgyl zzh;
    private int zzi;
    private byte zzj = 2;
    private zzhad zzf = zzgzu.zzaN();

    static {
        zzher zzherVar = new zzher();
        zzb = zzherVar;
        zzgzu.zzaU(zzher.class, zzherVar);
    }

    private zzher() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    public static zzheo zza() {
        return (zzheo) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzher zzherVar, zzhen zzhenVar) {
        zzhenVar.getClass();
        zzhad zzhadVar = zzherVar.zzf;
        if (!zzhadVar.zzc()) {
            zzherVar.zzf = zzgzu.zzaO(zzhadVar);
        }
        zzherVar.zzf.add(zzhenVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzhen.class, "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzher();
        }
        if (i11 == 4) {
            return new zzheo(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
