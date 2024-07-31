package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
final class zzhdi implements zzgzy {
    static final zzgzy zza = new zzhdi();

    private zzhdi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final boolean zza(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 1999) {
            switch (i10) {
                case AdError.NETWORK_ERROR_CODE /* 1000 */:
                case AdError.NO_FILL_ERROR_CODE /* 1001 */:
                case AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE /* 1002 */:
                case 1003:
                case 1004:
                case 1005:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
