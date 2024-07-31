package b2;

import android.view.View;

/* loaded from: classes.dex */
class d0 extends m0 {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6048c = true;

    @Override // b2.m0
    public void a(View view) {
    }

    @Override // b2.m0
    public float b(View view) {
        float transitionAlpha;
        if (f6048c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f6048c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // b2.m0
    public void c(View view) {
    }

    @Override // b2.m0
    public void e(View view, float f10) {
        if (f6048c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f6048c = false;
            }
        }
        view.setAlpha(f10);
    }
}
