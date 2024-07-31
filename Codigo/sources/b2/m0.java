package b2;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static Field f6099a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6100b;

    public void a(View view) {
        throw null;
    }

    public float b(View view) {
        throw null;
    }

    public void c(View view) {
        throw null;
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        throw null;
    }

    public void e(View view, float f10) {
        throw null;
    }

    public void f(View view, int i10) {
        if (!f6100b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6099a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f6100b = true;
        }
        Field field = f6099a;
        if (field != null) {
            try {
                f6099a.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }
}
