package androidx.lifecycle;

import android.app.Application;
import dk.C7021m;
import dk.C7029q;
import dk.C7031r;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.lifecycle.e0 */
/* loaded from: classes.dex */
public final class C1299e0 {

    /* renamed from: a */
    private static final List<Class<?>> f5673a;

    /* renamed from: b */
    private static final List<Class<?>> f5674b;

    static {
        List<Class<?>> m20584l;
        List<Class<?>> m20572e;
        m20584l = C7031r.m20584l(Application.class, C1328z.class);
        f5673a = m20584l;
        m20572e = C7029q.m20572e(C1328z.class);
        f5674b = m20572e;
    }

    /* renamed from: c */
    public static final <T> Constructor<T> m7312c(Class<T> modelClass, List<? extends Class<?>> signature) {
        List m20478e0;
        C9322n.m27781e(modelClass, "modelClass");
        C9322n.m27781e(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        C9322n.m27780d(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C9322n.m27780d(parameterTypes, "constructor.parameterTypes");
            m20478e0 = C7021m.m20478e0(parameterTypes);
            if (C9322n.m27777a(signature, m20478e0)) {
                C9322n.m27779c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == m20478e0.size() && m20478e0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends AbstractC1303g0> T m7313d(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        C9322n.m27781e(modelClass, "modelClass");
        C9322n.m27781e(constructor, "constructor");
        C9322n.m27781e(params, "params");
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
