package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzayc extends zzgzu implements zzhbf {
    private static final zzayc zzb;
    private int zzd;
    private zzayf zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        zzayc zzaycVar = new zzayc();
        zzb = zzaycVar;
        zzgzu.zzaU(zzayc.class, zzaycVar);
    }

    private zzayc() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
    }

    public static zzayc zzc(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzayc) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzayc();
        }
        if (i11 == 4) {
            return new zzayb(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzayf zzd() {
        zzayf zzayfVar = this.zze;
        return zzayfVar == null ? zzayf.zzg() : zzayfVar;
    }

    public final zzgyl zze() {
        return this.zzg;
    }

    public final zzgyl zzf() {
        return this.zzf;
    }
}
