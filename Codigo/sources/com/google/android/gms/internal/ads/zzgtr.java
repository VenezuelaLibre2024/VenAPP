package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtr extends zzgzu implements zzhbf {
    private static final zzgtr zzb;
    private int zzd;
    private int zze;

    static {
        zzgtr zzgtrVar = new zzgtr();
        zzb = zzgtrVar;
        zzgzu.zzaU(zzgtr.class, zzgtrVar);
    }

    private zzgtr() {
    }

    public static zzgtq zzd() {
        return (zzgtq) zzb.zzaA();
    }

    public static zzgtr zzf(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgtr) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzgtr();
        }
        if (i11 == 4) {
            return new zzgtq(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zze;
    }
}
