package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbck extends zzgzu implements zzhbf {
    private static final zzbck zzb;
    private zzhad zzd = zzgzu.zzaN();

    static {
        zzbck zzbckVar = new zzbck();
        zzb = zzbckVar;
        zzgzu.zzaU(zzbck.class, zzbckVar);
    }

    private zzbck() {
    }

    public static zzbce zza() {
        return (zzbce) zzb.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzbck zzbckVar, zzbcd zzbcdVar) {
        zzbcdVar.getClass();
        zzhad zzhadVar = zzbckVar.zzd;
        if (!zzhadVar.zzc()) {
            zzbckVar.zzd = zzgzu.zzaO(zzhadVar);
        }
        zzbckVar.zzd.add(zzbcdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzbcd.class});
        }
        if (i11 == 3) {
            return new zzbck();
        }
        zzbbw zzbbwVar = null;
        if (i11 == 4) {
            return new zzbce(zzbbwVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
