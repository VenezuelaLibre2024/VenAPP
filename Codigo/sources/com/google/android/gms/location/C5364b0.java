package com.google.android.gms.location;

import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.location.b0 */
/* loaded from: classes2.dex */
public final class C5364b0 {
    /* renamed from: a */
    public static int m13506a(int i10) {
        boolean z10;
        if (i10 != 100 && i10 != 102 && i10 != 104) {
            if (i10 != 105) {
                z10 = false;
                C5276s.m13317c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
                return i10;
            }
            i10 = 105;
        }
        z10 = true;
        C5276s.m13317c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    /* renamed from: b */
    public static String m13507b(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
