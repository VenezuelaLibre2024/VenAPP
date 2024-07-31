package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.q */
/* loaded from: classes.dex */
public class C0912q extends C0911p {
    @Override // androidx.core.graphics.C0911p
    /* renamed from: i */
    protected Typeface mo4631i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4409g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4415m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.C0911p
    /* renamed from: u */
    protected Method mo4635u(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
