package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgsw extends zzgzu implements zzhbf {
    private static final zzgsw zzb;
    private int zzd;
    private int zze;
    private zzgtc zzf;
    private zzgyl zzg = zzgyl.zzb;

    static {
        zzgsw zzgswVar = new zzgsw();
        zzb = zzgswVar;
        zzgzu.zzaU(zzgsw.class, zzgswVar);
    }

    private zzgsw() {
    }

    public static zzgsv zzc() {
        return (zzgsv) zzb.zzaA();
    }

    public static zzgsw zze() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgsw zzgswVar, zzgtc zzgtcVar) {
        zzgtcVar.getClass();
        zzgswVar.zzf = zzgtcVar;
        zzgswVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzgsw();
        }
        zzgsu zzgsuVar = null;
        if (i11 == 4) {
            return new zzgsv(zzgsuVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgtc zzf() {
        zzgtc zzgtcVar = this.zzf;
        return zzgtcVar == null ? zzgtc.zze() : zzgtcVar;
    }

    public final zzgyl zzg() {
        return this.zzg;
    }
}
