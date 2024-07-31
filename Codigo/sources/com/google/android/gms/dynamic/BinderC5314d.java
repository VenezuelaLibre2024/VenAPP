package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.dynamic.d */
/* loaded from: classes.dex */
public final class BinderC5314d<T> extends InterfaceC5312b.a {

    /* renamed from: a */
    private final Object f10825a;

    private BinderC5314d(Object obj) {
        this.f10825a = obj;
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: g2 */
    public static <T> T m13411g2(InterfaceC5312b interfaceC5312b) {
        if (interfaceC5312b instanceof BinderC5314d) {
            return (T) ((BinderC5314d) interfaceC5312b).f10825a;
        }
        IBinder asBinder = interfaceC5312b.asBinder();
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
        C5276s.m13324j(field);
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

    /* renamed from: h2 */
    public static <T> InterfaceC5312b m13412h2(T t10) {
        return new BinderC5314d(t10);
    }
}
