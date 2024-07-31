package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
public abstract class zzfzu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(int i10, int i11) {
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int highestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = highestOneBit + highestOneBit;
        }
        return i12 < 0 ? a.e.API_PRIORITY_OTHER : i12;
    }

    public abstract zzfzu zzb(Object obj);
}
