package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgud extends zzgzu implements zzhbf {
    private static final zzgud zzb;

    static {
        zzgud zzgudVar = new zzgud();
        zzb = zzgudVar;
        zzgzu.zzaU(zzgud.class, zzgudVar);
    }

    private zzgud() {
    }

    public static zzgud zzc() {
        return zzb;
    }

    public static zzgud zzd(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgud) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0000", null);
        }
        if (i11 == 3) {
            return new zzgud();
        }
        if (i11 == 4) {
            return new zzguc(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
