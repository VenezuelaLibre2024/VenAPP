package p020b2;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: b2.g0 */
/* loaded from: classes.dex */
class C1623g0 extends C1617d0 {

    /* renamed from: d */
    private static boolean f6936d = true;

    /* renamed from: e */
    private static boolean f6937e = true;

    @Override // p020b2.C1635m0
    /* renamed from: g */
    public void mo9010g(View view, Matrix matrix) {
        if (f6936d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6936d = false;
            }
        }
    }

    @Override // p020b2.C1635m0
    /* renamed from: h */
    public void mo9011h(View view, Matrix matrix) {
        if (f6937e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6937e = false;
            }
        }
    }
}
