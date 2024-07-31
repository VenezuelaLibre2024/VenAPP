package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgul extends zzgzu implements zzhbf {
    private static final zzgul zzb;
    private int zzd;
    private zzguo zze;
    private int zzf;
    private int zzg;

    static {
        zzgul zzgulVar = new zzgul();
        zzb = zzgulVar;
        zzgzu.zzaU(zzgul.class, zzgulVar);
    }

    private zzgul() {
    }

    public static zzguk zzd() {
        return (zzguk) zzb.zzaA();
    }

    public static zzgul zzf() {
        return zzb;
    }

    public static zzgul zzg(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgul) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public static /* synthetic */ void zzi(zzgul zzgulVar, zzguo zzguoVar) {
        zzguoVar.getClass();
        zzgulVar.zze = zzguoVar;
        zzgulVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzgul();
        }
        if (i11 == 4) {
            return new zzguk(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zzg;
    }

    public final zzguo zzh() {
        zzguo zzguoVar = this.zze;
        return zzguoVar == null ? zzguo.zzf() : zzguoVar;
    }
}
