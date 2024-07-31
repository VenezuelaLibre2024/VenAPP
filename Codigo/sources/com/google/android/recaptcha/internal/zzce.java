package com.google.android.recaptcha.internal;

import dk.m;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzce implements zzby {
    public static final zzce zza = new zzce();

    private zzce() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        List e02;
        int length = objArr.length;
        if (length < 2) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Method)) {
            obj = null;
        }
        Method method = (Method) obj;
        if (method == null) {
            throw new zzt(4, 5, null);
        }
        Object obj2 = objArr[1];
        e02 = m.e0(objArr);
        Object[] array = e02.subList(2, length).toArray(new Object[0]);
        try {
            zzblVar.zzc().zzf(i10, method.invoke(obj2, Arrays.copyOf(array, array.length)));
        } catch (Exception e10) {
            throw new zzt(6, 15, e10);
        }
    }
}
