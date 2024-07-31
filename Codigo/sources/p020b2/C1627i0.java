package p020b2;

import android.view.View;

/* renamed from: b2.i0 */
/* loaded from: classes.dex */
class C1627i0 extends C1623g0 {

    /* renamed from: f */
    private static boolean f6940f = true;

    @Override // p020b2.C1635m0
    /* renamed from: d */
    public void mo9014d(View view, int i10, int i11, int i12, int i13) {
        if (f6940f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f6940f = false;
            }
        }
    }
}
