package b2;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g0 extends d0 {

    /* renamed from: d */
    private static boolean f6067d = true;

    /* renamed from: e */
    private static boolean f6068e = true;

    @Override // b2.m0
    public void g(View view, Matrix matrix) {
        if (f6067d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6067d = false;
            }
        }
    }

    @Override // b2.m0
    public void h(View view, Matrix matrix) {
        if (f6068e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6068e = false;
            }
        }
    }
}
