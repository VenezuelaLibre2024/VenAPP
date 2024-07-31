package p020b2;

import android.view.View;

/* renamed from: b2.d0 */
/* loaded from: classes.dex */
class C1617d0 extends C1635m0 {

    /* renamed from: c */
    private static boolean f6917c = true;

    @Override // p020b2.C1635m0
    /* renamed from: a */
    public void mo9000a(View view) {
    }

    @Override // p020b2.C1635m0
    /* renamed from: b */
    public float mo9001b(View view) {
        float transitionAlpha;
        if (f6917c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f6917c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p020b2.C1635m0
    /* renamed from: c */
    public void mo9002c(View view) {
    }

    @Override // p020b2.C1635m0
    /* renamed from: e */
    public void mo9003e(View view, float f10) {
        if (f6917c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f6917c = false;
            }
        }
        view.setAlpha(f10);
    }
}
