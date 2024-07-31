package p020b2;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: b2.m0 */
/* loaded from: classes.dex */
class C1635m0 {

    /* renamed from: a */
    private static Field f6987a;

    /* renamed from: b */
    private static boolean f6988b;

    /* renamed from: a */
    public void mo9000a(View view) {
        throw null;
    }

    /* renamed from: b */
    public float mo9001b(View view) {
        throw null;
    }

    /* renamed from: c */
    public void mo9002c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo9014d(View view, int i10, int i11, int i12, int i13) {
        throw null;
    }

    /* renamed from: e */
    public void mo9003e(View view, float f10) {
        throw null;
    }

    /* renamed from: f */
    public void mo9020f(View view, int i10) {
        if (!f6988b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6987a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f6988b = true;
        }
        Field field = f6987a;
        if (field != null) {
            try {
                f6987a.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: g */
    public void mo9010g(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: h */
    public void mo9011h(View view, Matrix matrix) {
        throw null;
    }
}
