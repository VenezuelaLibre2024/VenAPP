package androidx.fragment.app;

import androidx.collection.C0738h;
import androidx.fragment.app.Fragment;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public class C1268j {

    /* renamed from: a */
    private static final C0738h<ClassLoader, C0738h<String, Class<?>>> f5407a = new C0738h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m6965b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m6966c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m6966c(ClassLoader classLoader, String str) {
        C0738h<ClassLoader, C0738h<String, Class<?>>> c0738h = f5407a;
        C0738h<String, Class<?>> c0738h2 = c0738h.get(classLoader);
        if (c0738h2 == null) {
            c0738h2 = new C0738h<>();
            c0738h.put(classLoader, c0738h2);
        }
        Class<?> cls = c0738h2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0738h2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m6967d(ClassLoader classLoader, String str) {
        try {
            return m6966c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.C1251j("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.C1251j("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    /* renamed from: a */
    public Fragment mo6968a(ClassLoader classLoader, String str) {
        throw null;
    }
}
