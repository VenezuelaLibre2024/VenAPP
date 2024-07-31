package com.google.android.recaptcha.internal;

import dk.m;
import dk.z;
import java.util.Collection;
import xk.d;

/* loaded from: classes2.dex */
public final class zzbt implements zzby {
    public static final zzbt zza = new zzbt();

    private zzbt() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        String M;
        String str;
        if (objArr.length != 1) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Object)) {
            obj = null;
        }
        if (obj == null) {
            throw new zzt(4, 5, null);
        }
        if (obj instanceof int[]) {
            M = m.P((int[]) obj, ",", "[", "]", 0, null, null, 56, null);
        } else {
            if (obj instanceof byte[]) {
                str = new String((byte[]) obj, d.f31393b);
            } else if (obj instanceof long[]) {
                M = m.Q((long[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof short[]) {
                M = m.S((short[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof float[]) {
                M = m.O((float[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof double[]) {
                M = m.N((double[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof char[]) {
                str = new String((char[]) obj);
            } else if (obj instanceof Object[]) {
                M = m.R((Object[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else {
                if (!(obj instanceof Collection)) {
                    throw new zzt(4, 5, null);
                }
                M = z.M((Iterable) obj, ",", "[", "]", 0, null, null, 56, null);
            }
            M = str;
        }
        zzblVar.zzc().zzf(i10, M);
    }
}
