package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamic.b;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class d<T> extends b.a {

    /* renamed from: a */
    private final Object f9710a;

    private d(Object obj) {
        this.f9710a = obj;
    }

    @ResultIgnorabilityUnspecified
    public static <T> T g2(b bVar) {
        if (bVar instanceof d) {
            return (T) ((d) bVar).f9710a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        s.j(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    public static <T> b h2(T t10) {
        return new d(t10);
    }
}
