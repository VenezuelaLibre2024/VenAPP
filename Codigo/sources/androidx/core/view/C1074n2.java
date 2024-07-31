package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.n2 */
/* loaded from: classes.dex */
public final class C1074n2 {

    /* renamed from: a */
    private final WeakReference<View> f4628a;

    /* renamed from: b */
    Runnable f4629b = null;

    /* renamed from: c */
    Runnable f4630c = null;

    /* renamed from: d */
    int f4631d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.n2$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1079o2 f4632a;

        /* renamed from: b */
        final /* synthetic */ View f4633b;

        a(InterfaceC1079o2 interfaceC1079o2, View view) {
            this.f4632a = interfaceC1079o2;
            this.f4633b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4632a.mo1574a(this.f4633b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4632a.mo1032b(this.f4633b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f4632a.mo1033c(this.f4633b);
        }
    }

    /* renamed from: androidx.core.view.n2$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static ViewPropertyAnimator m5078a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1074n2(View view) {
        this.f4628a = new WeakReference<>(view);
    }

    /* renamed from: i */
    private void m5067i(View view, InterfaceC1079o2 interfaceC1079o2) {
        if (interfaceC1079o2 != null) {
            view.animate().setListener(new a(interfaceC1079o2, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: b */
    public C1074n2 m5068b(float f10) {
        View view = this.f4628a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    /* renamed from: c */
    public void m5069c() {
        View view = this.f4628a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long m5070d() {
        View view = this.f4628a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: f */
    public C1074n2 m5071f(long j10) {
        View view = this.f4628a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    /* renamed from: g */
    public C1074n2 m5072g(Interpolator interpolator) {
        View view = this.f4628a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C1074n2 m5073h(InterfaceC1079o2 interfaceC1079o2) {
        View view = this.f4628a.get();
        if (view != null) {
            m5067i(view, interfaceC1079o2);
        }
        return this;
    }

    /* renamed from: j */
    public C1074n2 m5074j(long j10) {
        View view = this.f4628a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    /* renamed from: k */
    public C1074n2 m5075k(final InterfaceC1089q2 interfaceC1089q2) {
        final View view = this.f4628a.get();
        if (view != null) {
            b.m5078a(view.animate(), interfaceC1089q2 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.m2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    InterfaceC1089q2.this.mo1154a(view);
                }
            } : null);
        }
        return this;
    }

    /* renamed from: l */
    public void m5076l() {
        View view = this.f4628a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C1074n2 m5077m(float f10) {
        View view = this.f4628a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
