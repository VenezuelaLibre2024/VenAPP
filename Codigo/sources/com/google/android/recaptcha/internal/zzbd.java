package com.google.android.recaptcha.internal;

import ck.v;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public abstract class zzbd implements InvocationHandler {
    private final Object zza;

    public zzbd(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (n.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (n.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (n.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z10 = false;
            if (objArr != null && objArr.length != 0 && objArr[0].hashCode() == obj.hashCode()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        if (!zza(obj, method, objArr)) {
            return v.f7137a;
        }
        if ((this.zza == null && n.a(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && n.a(zzeg.zza(obj2.getClass()), zzeg.zza(method.getReturnType())))) {
            Object obj3 = this.zza;
            return obj3 == null ? v.f7137a : obj3;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
