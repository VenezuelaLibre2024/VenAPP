package b2;

import android.view.View;

/* loaded from: classes.dex */
class i0 extends g0 {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f6071f = true;

    @Override // b2.m0
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f6071f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f6071f = false;
            }
        }
    }
}
