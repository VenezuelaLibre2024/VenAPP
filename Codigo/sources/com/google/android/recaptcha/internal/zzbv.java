package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public final class zzbv implements zzby {
    public static final zzbv zza = new zzbv();

    private zzbv() {
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
            if (obj instanceof String) {
                obj = zzbx.zza(this, (String) obj, zzblVar.zza());
            }
            zzblVar.zzc().zzf(i10, Array.newInstance((Class<?>) zzbk.zza(obj), intValue));
        } catch (Exception e10) {
            throw new zzt(6, 21, e10);
        }
    }
}
