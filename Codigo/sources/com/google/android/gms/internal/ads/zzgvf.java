package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvf extends zzgzu implements zzhbf {
    private static final zzgvf zzb;
    private int zzd;
    private zzgut zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgvf zzgvfVar = new zzgvf();
        zzb = zzgvfVar;
        zzgzu.zzaU(zzgvf.class, zzgvfVar);
    }

    private zzgvf() {
    }

    public static zzgve zzd() {
        return (zzgve) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzgvf zzgvfVar, zzgut zzgutVar) {
        zzgutVar.getClass();
        zzgvfVar.zze = zzgutVar;
        zzgvfVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzgvf();
        }
        if (i11 == 4) {
            return new zzgve(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgut zzc() {
        zzgut zzgutVar = this.zze;
        return zzgutVar == null ? zzgut.zze() : zzgutVar;
    }

    public final zzgvz zzf() {
        zzgvz zzb2 = zzgvz.zzb(this.zzh);
        return zzb2 == null ? zzgvz.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return (this.zzd & 1) != 0;
    }

    public final int zzk() {
        int i10 = this.zzf;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
