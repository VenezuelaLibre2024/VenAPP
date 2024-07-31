package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzase extends zzgzu implements zzhbf {
    private static final zzase zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzase zzaseVar = new zzase();
        zzb = zzaseVar;
        zzgzu.zzaU(zzase.class, zzaseVar);
    }

    private zzase() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzase();
        }
        zzarx zzarxVar = null;
        if (i11 == 4) {
            return new zzasd(zzarxVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
