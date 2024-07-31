package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes2.dex */
public final class zzah {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException("at index " + i11);
            }
        }
        return objArr;
    }
}
