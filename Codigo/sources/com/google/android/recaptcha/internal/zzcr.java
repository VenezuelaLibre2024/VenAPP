package com.google.android.recaptcha.internal;

import dk.m;
import dk.r;
import dk.z;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcr {
    public static final zzcr zza = new zzcr();
    private static List zzb;

    static {
        List j10;
        j10 = r.j();
        zzb = j10;
    }

    private zzcr() {
    }

    public static final void acx(int[] iArr) {
        zzb(iArr);
    }

    public static final int zza(int[] iArr) {
        List c02;
        List R;
        List list = zzb;
        c02 = m.c0(iArr);
        R = z.R(list, c02);
        Iterator it = R.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() ^ ((Number) it.next()).intValue());
        }
        return ((Number) next).intValue();
    }

    public static final void zzb(int[] iArr) {
        List c02;
        c02 = m.c0(iArr);
        zzb = c02;
    }
}
