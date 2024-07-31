package b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.x0;

/* loaded from: classes.dex */
public class d extends n0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6044a;

        a(View view) {
            this.f6044a = view;
        }

        @Override // b2.l.f
        public void e(l lVar) {
            a0.g(this.f6044a, 1.0f);
            a0.a(this.f6044a);
            lVar.T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final View f6046a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f6047b = false;

        b(View view) {
            this.f6046a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0.g(this.f6046a, 1.0f);
            if (this.f6047b) {
                this.f6046a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (x0.D(this.f6046a) && this.f6046a.getLayerType() == 0) {
                this.f6047b = true;
                this.f6046a.setLayerType(2, null);
            }
        }
    }

    public d(int i10) {
        o0(i10);
    }

    private Animator p0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        a0.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, a0.f6012b, f11);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    private static float q0(s sVar, float f10) {
        Float f11;
        return (sVar == null || (f11 = (Float) sVar.f6131a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // b2.n0, b2.l
    public void j(s sVar) {
        super.j(sVar);
        sVar.f6131a.put("android:fade:transitionAlpha", Float.valueOf(a0.c(sVar.f6132b)));
    }

    @Override // b2.n0
    public Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float q02 = q0(sVar, 0.0f);
        return p0(view, q02 != 1.0f ? q02 : 0.0f, 1.0f);
    }

    @Override // b2.n0
    public Animator m0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        a0.e(view);
        return p0(view, q0(sVar, 1.0f), 0.0f);
    }
}
