package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzbdd {
    private static final zzgzx zza = new zzbdb();

    public static int zza(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 1000) {
            return 0;
        }
        return AdError.NO_FILL_ERROR_CODE;
    }
}
