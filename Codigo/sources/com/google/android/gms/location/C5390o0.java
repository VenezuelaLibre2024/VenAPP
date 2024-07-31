package com.google.android.gms.location;

import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.location.o0 */
/* loaded from: classes2.dex */
public final class C5390o0 {
    /* renamed from: a */
    public static int m13532a(int i10) {
        boolean z10;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                z10 = false;
                C5276s.m13317c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
                return i10;
            }
            i10 = 2;
        }
        z10 = true;
        C5276s.m13317c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    /* renamed from: b */
    public static String m13533b(int i10) {
        if (i10 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i10 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i10 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
