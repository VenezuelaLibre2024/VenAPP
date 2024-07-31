package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzasy extends zzgzu implements zzhbf {
    private static final zzasy zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = AdError.NETWORK_ERROR_CODE;

    static {
        zzasy zzasyVar = new zzasy();
        zzb = zzasyVar;
        zzgzu.zzaU(zzasy.class, zzasyVar);
    }

    private zzasy() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzatj.zza});
        }
        if (i11 == 3) {
            return new zzasy();
        }
        zzasf zzasfVar = null;
        if (i11 == 4) {
            return new zzasx(zzasfVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
