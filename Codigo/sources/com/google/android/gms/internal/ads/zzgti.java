package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgti extends zzgzu implements zzhbf {
    private static final zzgti zzb;
    private int zzd;
    private zzgtl zze;
    private int zzf;

    static {
        zzgti zzgtiVar = new zzgti();
        zzb = zzgtiVar;
        zzgzu.zzaU(zzgti.class, zzgtiVar);
    }

    private zzgti() {
    }

    public static zzgth zzc() {
        return (zzgth) zzb.zzaA();
    }

    public static zzgti zze(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgti) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public static /* synthetic */ void zzg(zzgti zzgtiVar, zzgtl zzgtlVar) {
        zzgtlVar.getClass();
        zzgtiVar.zze = zzgtlVar;
        zzgtiVar.zzd |= 1;
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
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgti();
        }
        if (i11 == 4) {
            return new zzgth(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgtl zzf() {
        zzgtl zzgtlVar = this.zze;
        return zzgtlVar == null ? zzgtl.zze() : zzgtlVar;
    }
}
