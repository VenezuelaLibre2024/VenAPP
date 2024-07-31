package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class t {

    /* renamed from: a, reason: collision with root package name */
    private static Field f872a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f873b;

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f874c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f875d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f876e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f877f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f878g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f879h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f879h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f878g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f879h = true;
        }
        Field field = f878g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f873b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f872a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f873b = true;
        }
        Field field2 = f872a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f875d) {
            try {
                f874c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f875d = true;
        }
        Class<?> cls = f874c;
        if (cls == null) {
            return;
        }
        if (!f877f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f876e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f877f = true;
        }
        Field field = f876e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
