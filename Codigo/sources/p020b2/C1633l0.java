package p020b2;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: b2.l0 */
/* loaded from: classes.dex */
class C1633l0 extends C1631k0 {
    @Override // p020b2.C1617d0, p020b2.C1635m0
    /* renamed from: b */
    public float mo9001b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // p020b2.C1627i0, p020b2.C1635m0
    /* renamed from: d */
    public void mo9014d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // p020b2.C1617d0, p020b2.C1635m0
    /* renamed from: e */
    public void mo9003e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // p020b2.C1631k0, p020b2.C1635m0
    /* renamed from: f */
    public void mo9020f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // p020b2.C1623g0, p020b2.C1635m0
    /* renamed from: g */
    public void mo9010g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p020b2.C1623g0, p020b2.C1635m0
    /* renamed from: h */
    public void mo9011h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
