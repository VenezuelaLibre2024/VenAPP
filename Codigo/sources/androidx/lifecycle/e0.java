package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<Class<?>> f4919a;

    /* renamed from: b, reason: collision with root package name */
    private static final List<Class<?>> f4920b;

    static {
        List<Class<?>> l10;
        List<Class<?>> e10;
        l10 = dk.r.l(Application.class, z.class);
        f4919a = l10;
        e10 = dk.q.e(z.class);
        f4920b = e10;
    }

    public static final <T> Constructor<T> c(Class<T> modelClass, List<? extends Class<?>> signature) {
        List e02;
        kotlin.jvm.internal.n.e(modelClass, "modelClass");
        kotlin.jvm.internal.n.e(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.n.d(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.n.d(parameterTypes, "constructor.parameterTypes");
            e02 = dk.m.e0(parameterTypes);
            if (kotlin.jvm.internal.n.a(signature, e02)) {
                kotlin.jvm.internal.n.c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == e02.size() && e02.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends g0> T d(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        kotlin.jvm.internal.n.e(modelClass, "modelClass");
        kotlin.jvm.internal.n.e(constructor, "constructor");
        kotlin.jvm.internal.n.e(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
