package b2;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
class k0 extends i0 {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f6075g = true;

    @Override // b2.m0
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f6075g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f6075g = false;
            }
        }
    }
}
