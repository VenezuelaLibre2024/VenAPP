package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f3936a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f3937b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f3938c = null;

    /* renamed from: d, reason: collision with root package name */
    int f3939d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o2 f3940a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3941b;

        a(o2 o2Var, View view) {
            this.f3940a = o2Var;
            this.f3941b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3940a.a(this.f3941b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3940a.b(this.f3941b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3940a.c(this.f3941b);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n2(View view) {
        this.f3936a = new WeakReference<>(view);
    }

    private void i(View view, o2 o2Var) {
        if (o2Var != null) {
            view.animate().setListener(new a(o2Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public n2 b(float f10) {
        View view = this.f3936a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f3936a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f3936a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public n2 f(long j10) {
        View view = this.f3936a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public n2 g(Interpolator interpolator) {
        View view = this.f3936a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public n2 h(o2 o2Var) {
        View view = this.f3936a.get();
        if (view != null) {
            i(view, o2Var);
        }
        return this;
    }

    public n2 j(long j10) {
        View view = this.f3936a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public n2 k(final q2 q2Var) {
        final View view = this.f3936a.get();
        if (view != null) {
            b.a(view.animate(), q2Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.m2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    q2.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.f3936a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public n2 m(float f10) {
        View view = this.f3936a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
