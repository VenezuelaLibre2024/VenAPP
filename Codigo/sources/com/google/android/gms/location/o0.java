package com.google.android.gms.location;

/* loaded from: classes2.dex */
public final class o0 {
    public static int a(int i10) {
        boolean z10;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                z10 = false;
                com.google.android.gms.common.internal.s.c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
                return i10;
            }
            i10 = 2;
        }
        z10 = true;
        com.google.android.gms.common.internal.s.c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    public static String b(int i10) {
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
