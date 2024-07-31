package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public final class zzbq implements zzby {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        if (objArr.length != 3) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Object)) {
            obj = null;
        }
        if (obj == null) {
            throw new zzt(4, 5, null);
        }
        Object obj2 = objArr[1];
        if (true != (obj2 instanceof Integer)) {
            obj2 = null;
        }
        Integer num = (Integer) obj2;
        if (num == null) {
            throw new zzt(4, 5, null);
        }
        int intValue = num.intValue();
        Object obj3 = objArr[2];
        if (true != (obj3 instanceof Object)) {
            obj3 = null;
        }
        if (obj3 == null) {
            throw new zzt(4, 5, null);
        }
        try {
            Array.set(obj, intValue, obj3);
        } catch (Exception e10) {
            if (!(e10 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzt(4, 25, e10);
            }
            throw new zzt(4, 22, e10);
        }
    }
}
