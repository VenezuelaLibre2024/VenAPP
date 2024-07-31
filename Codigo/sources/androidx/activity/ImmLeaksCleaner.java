package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.f;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.i {

    /* renamed from: b, reason: collision with root package name */
    private static int f614b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f615c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f616d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f617e;

    /* renamed from: a, reason: collision with root package name */
    private Activity f618a;

    private static void a() {
        try {
            f614b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f616d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f617e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f615c = declaredField3;
            declaredField3.setAccessible(true);
            f614b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.i
    public void onStateChanged(androidx.lifecycle.k kVar, f.a aVar) {
        if (aVar != f.a.ON_DESTROY) {
            return;
        }
        if (f614b == 0) {
            a();
        }
        if (f614b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f618a.getSystemService("input_method");
            try {
                Object obj = f615c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f616d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f617e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
