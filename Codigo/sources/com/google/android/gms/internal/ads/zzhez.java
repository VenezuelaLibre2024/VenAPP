package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhez extends zzgzu implements zzhbf {
    private static final zzhez zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzhez zzhezVar = new zzhez();
        zzb = zzhezVar;
        zzgzu.zzaU(zzhez.class, zzhezVar);
    }

    private zzhez() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgzy zzgzyVar = zzhex.zza;
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zzgzyVar, "zzf", "zzg", zzgzyVar});
        }
        if (i11 == 3) {
            return new zzhez();
        }
        zzhdp zzhdpVar = null;
        if (i11 == 4) {
            return new zzhey(zzhdpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
