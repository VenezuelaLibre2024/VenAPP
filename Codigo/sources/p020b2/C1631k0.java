package p020b2;

import android.os.Build;
import android.view.View;

/* renamed from: b2.k0 */
/* loaded from: classes.dex */
class C1631k0 extends C1627i0 {

    /* renamed from: g */
    private static boolean f6944g = true;

    @Override // p020b2.C1635m0
    /* renamed from: f */
    public void mo9020f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo9020f(view, i10);
        } else if (f6944g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f6944g = false;
            }
        }
    }
}
