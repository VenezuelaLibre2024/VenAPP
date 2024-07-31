package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgwi extends zzgzu implements zzhbf {
    private static final zzgwi zzb;
    private int zzd;

    static {
        zzgwi zzgwiVar = new zzgwi();
        zzb = zzgwiVar;
        zzgzu.zzaU(zzgwi.class, zzgwiVar);
    }

    private zzgwi() {
    }

    public static zzgwi zzd() {
        return zzb;
    }

    public static zzgwi zze(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgwi) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
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
            return zzgzu.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzgwi();
        }
        if (i11 == 4) {
            return new zzgwh(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
