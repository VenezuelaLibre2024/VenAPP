package com.google.android.recaptcha.internal;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbo implements zzby {
    public static final zzbo zza = new zzbo();

    private zzbo() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        Object array;
        if (objArr.length != 2) {
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
        if (obj instanceof Integer) {
            array = Integer.valueOf(((Number) obj).intValue() + intValue);
        } else {
            if (!(obj instanceof int[])) {
                throw new zzt(4, 5, null);
            }
            int[] iArr = (int[]) obj;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList.add(Integer.valueOf(i11 + intValue));
            }
            array = arrayList.toArray(new Integer[0]);
        }
        zzblVar.zzc().zzf(i10, array);
    }
}
