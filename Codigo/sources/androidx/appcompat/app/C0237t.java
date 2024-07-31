package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.app.t */
/* loaded from: classes.dex */
class C0237t {

    /* renamed from: a */
    private static Field f997a;

    /* renamed from: b */
    private static boolean f998b;

    /* renamed from: c */
    private static Class<?> f999c;

    /* renamed from: d */
    private static boolean f1000d;

    /* renamed from: e */
    private static Field f1001e;

    /* renamed from: f */
    private static boolean f1002f;

    /* renamed from: g */
    private static Field f1003g;

    /* renamed from: h */
    private static boolean f1004h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.t$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m1117a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1114a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        m1115b(resources);
    }

    /* renamed from: b */
    private static void m1115b(Resources resources) {
        Object obj;
        if (!f1004h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1003g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f1004h = true;
        }
        Field field = f1003g;
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
        if (!f998b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f997a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f998b = true;
        }
        Field field2 = f997a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            m1116c(obj2);
        }
    }

    /* renamed from: c */
    private static void m1116c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1000d) {
            try {
                f999c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f1000d = true;
        }
        Class<?> cls = f999c;
        if (cls == null) {
            return;
        }
        if (!f1002f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1001e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f1002f = true;
        }
        Field field = f1001e;
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
            a.m1117a(longSparseArray);
        }
    }
}
