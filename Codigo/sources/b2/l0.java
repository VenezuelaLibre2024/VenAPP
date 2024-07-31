package b2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class l0 extends k0 {
    @Override // b2.d0, b2.m0
    public float b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // b2.i0, b2.m0
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // b2.d0, b2.m0
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // b2.k0, b2.m0
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // b2.g0, b2.m0
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // b2.g0, b2.m0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
