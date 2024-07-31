package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzasp extends zzgzu implements zzhbf {
    private static final zzasp zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private int zzg = AdError.NETWORK_ERROR_CODE;

    static {
        zzasp zzaspVar = new zzasp();
        zzb = zzaspVar;
        zzgzu.zzaU(zzasp.class, zzaspVar);
    }

    private zzasp() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgzy zzgzyVar = zzatj.zza;
            return zzgzu.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", zzgzyVar, "zzg", zzgzyVar});
        }
        if (i11 == 3) {
            return new zzasp();
        }
        zzasf zzasfVar = null;
        if (i11 == 4) {
            return new zzaso(zzasfVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
