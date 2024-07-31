package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.api.C5101a;

/* loaded from: classes2.dex */
public class zzam<E> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            i12 = Integer.highestOneBit(i11 - 1) << 1;
        }
        return i12 < 0 ? C5101a.e.API_PRIORITY_OTHER : i12;
    }
}
