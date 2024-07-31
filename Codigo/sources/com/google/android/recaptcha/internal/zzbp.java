package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbp implements zzby {
    public static final zzbp zza = new zzbp();

    private zzbp() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
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
        try {
            zzblVar.zzc().zzf(i10, obj instanceof String ? String.valueOf(((String) obj).charAt(intValue)) : obj instanceof List ? ((List) obj).get(intValue) : Array.get(obj, intValue));
        } catch (Exception e10) {
            if (!(e10 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzt(4, 23, e10);
            }
            throw new zzt(4, 22, e10);
        }
    }
}
