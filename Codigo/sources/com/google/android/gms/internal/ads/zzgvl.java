package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvl extends zzgzu implements zzhbf {
    private static final zzgvl zzb;
    private int zzd;
    private zzhad zze = zzgzu.zzaN();

    static {
        zzgvl zzgvlVar = new zzgvl();
        zzb = zzgvlVar;
        zzgzu.zzaU(zzgvl.class, zzgvlVar);
    }

    private zzgvl() {
    }

    public static zzgvi zza() {
        return (zzgvi) zzb.zzaA();
    }

    public static /* synthetic */ void zze(zzgvl zzgvlVar, zzgvk zzgvkVar) {
        zzgvkVar.getClass();
        zzhad zzhadVar = zzgvlVar.zze;
        if (!zzhadVar.zzc()) {
            zzgvlVar.zze = zzgzu.zzaO(zzhadVar);
        }
        zzgvlVar.zze.add(zzgvkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgvk.class});
        }
        if (i11 == 3) {
            return new zzgvl();
        }
        if (i11 == 4) {
            return new zzgvi(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
