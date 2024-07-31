package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes2.dex */
public final class zzgvb extends zzgzu implements zzhbf {
    private static final zzgvb zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        zzgvb zzgvbVar = new zzgvb();
        zzb = zzgvbVar;
        zzgzu.zzaU(zzgvb.class, zzgvbVar);
    }

    private zzgvb() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzgvb();
        }
        zzguz zzguzVar = null;
        if (i11 == 4) {
            return new zzgva(zzguzVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
