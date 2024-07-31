package p020b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1116x0;

/* renamed from: b2.d */
/* loaded from: classes.dex */
public class C1616d extends AbstractC1637n0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b2.d$a */
    /* loaded from: classes.dex */
    public class a extends C1634m {

        /* renamed from: a */
        final /* synthetic */ View f6913a;

        a(View view) {
            this.f6913a = view;
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: e */
        public void mo8991e(AbstractC1632l abstractC1632l) {
            C1611a0.m8960g(this.f6913a, 1.0f);
            C1611a0.m8954a(this.f6913a);
            abstractC1632l.mo9042T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b2.d$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f6915a;

        /* renamed from: b */
        private boolean f6916b = false;

        b(View view) {
            this.f6915a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1611a0.m8960g(this.f6915a, 1.0f);
            if (this.f6916b) {
                this.f6915a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C1116x0.m5239D(this.f6915a) && this.f6915a.getLayerType() == 0) {
                this.f6916b = true;
                this.f6915a.setLayerType(2, null);
            }
        }
    }

    public C1616d(int i10) {
        m9079o0(i10);
    }

    /* renamed from: p0 */
    private Animator m8996p0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        C1611a0.m8960g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1611a0.f6874b, f11);
        ofFloat.addListener(new b(view));
        mo9048a(new a(view));
        return ofFloat;
    }

    /* renamed from: q0 */
    private static float m8997q0(C1644s c1644s, float f10) {
        Float f11;
        return (c1644s == null || (f11 = (Float) c1644s.f7026a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // p020b2.AbstractC1637n0, p020b2.AbstractC1632l
    /* renamed from: j */
    public void mo8974j(C1644s c1644s) {
        super.mo8974j(c1644s);
        c1644s.f7026a.put("android:fade:transitionAlpha", Float.valueOf(C1611a0.m8956c(c1644s.f7027b)));
    }

    @Override // p020b2.AbstractC1637n0
    /* renamed from: k0 */
    public Animator mo8998k0(ViewGroup viewGroup, View view, C1644s c1644s, C1644s c1644s2) {
        float m8997q0 = m8997q0(c1644s, 0.0f);
        return m8996p0(view, m8997q0 != 1.0f ? m8997q0 : 0.0f, 1.0f);
    }

    @Override // p020b2.AbstractC1637n0
    /* renamed from: m0 */
    public Animator mo8999m0(ViewGroup viewGroup, View view, C1644s c1644s, C1644s c1644s2) {
        C1611a0.m8958e(view);
        return m8996p0(view, m8997q0(c1644s, 1.0f), 0.0f);
    }
}
