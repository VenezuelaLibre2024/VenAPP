package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.C0944c;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1108v0;
import androidx.fragment.app.C1281w;
import p052d1.C6815a;
import p052d1.C6816b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public class C1264f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: classes.dex */
    public class a implements C0944c.b {

        /* renamed from: a */
        final /* synthetic */ Fragment f5384a;

        a(Fragment fragment) {
            this.f5384a = fragment;
        }

        @Override // androidx.core.os.C0944c.b
        public void onCancel() {
            if (this.f5384a.getAnimatingAway() != null) {
                View animatingAway = this.f5384a.getAnimatingAway();
                this.f5384a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f5384a.setAnimator(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$b */
    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5385a;

        /* renamed from: b */
        final /* synthetic */ Fragment f5386b;

        /* renamed from: c */
        final /* synthetic */ C1281w.g f5387c;

        /* renamed from: d */
        final /* synthetic */ C0944c f5388d;

        /* renamed from: androidx.fragment.app.f$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f5386b.getAnimatingAway() != null) {
                    b.this.f5386b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.f5387c.mo7115a(bVar.f5386b, bVar.f5388d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, C1281w.g gVar, C0944c c0944c) {
            this.f5385a = viewGroup;
            this.f5386b = fragment;
            this.f5387c = gVar;
            this.f5388d = c0944c;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f5385a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5390a;

        /* renamed from: b */
        final /* synthetic */ View f5391b;

        /* renamed from: c */
        final /* synthetic */ Fragment f5392c;

        /* renamed from: d */
        final /* synthetic */ C1281w.g f5393d;

        /* renamed from: e */
        final /* synthetic */ C0944c f5394e;

        c(ViewGroup viewGroup, View view, Fragment fragment, C1281w.g gVar, C0944c c0944c) {
            this.f5390a = viewGroup;
            this.f5391b = view;
            this.f5392c = fragment;
            this.f5393d = gVar;
            this.f5394e = c0944c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5390a.endViewTransition(this.f5391b);
            Animator animator2 = this.f5392c.getAnimator();
            this.f5392c.setAnimator(null);
            if (animator2 == null || this.f5390a.indexOfChild(this.f5391b) >= 0) {
                return;
            }
            this.f5393d.mo7115a(this.f5392c, this.f5394e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final Animation f5395a;

        /* renamed from: b */
        public final Animator f5396b;

        d(Animator animator) {
            this.f5395a = null;
            this.f5396b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        d(Animation animation) {
            this.f5395a = animation;
            this.f5396b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$e */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f5397a;

        /* renamed from: b */
        private final View f5398b;

        /* renamed from: c */
        private boolean f5399c;

        /* renamed from: d */
        private boolean f5400d;

        /* renamed from: e */
        private boolean f5401e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f5401e = true;
            this.f5397a = viewGroup;
            this.f5398b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f5401e = true;
            if (this.f5399c) {
                return !this.f5400d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f5399c = true;
                ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(this.f5397a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f5401e = true;
            if (this.f5399c) {
                return !this.f5400d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f5399c = true;
                ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(this.f5397a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5399c || !this.f5401e) {
                this.f5397a.endViewTransition(this.f5398b);
                this.f5400d = true;
            } else {
                this.f5401e = false;
                this.f5397a.post(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6935a(Fragment fragment, d dVar, C1281w.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        C0944c c0944c = new C0944c();
        c0944c.m4705c(new a(fragment));
        gVar.mo7116b(fragment, c0944c);
        if (dVar.f5395a != null) {
            e eVar = new e(dVar.f5395a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, c0944c));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f5396b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, c0944c));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* renamed from: b */
    private static int m6936b(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static d m6937c(Context context, Fragment fragment, boolean z10, boolean z11) {
        int nextTransition = fragment.getNextTransition();
        int m6936b = m6936b(fragment, z10, z11);
        boolean z12 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i10 = C6816b.f15048c;
            if (viewGroup.getTag(i10) != null) {
                fragment.mContainer.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, m6936b);
        if (onCreateAnimation != null) {
            return new d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, m6936b);
        if (onCreateAnimator != null) {
            return new d(onCreateAnimator);
        }
        if (m6936b == 0 && nextTransition != 0) {
            m6936b = m6938d(nextTransition, z10);
        }
        if (m6936b != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(m6936b));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, m6936b);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, m6936b);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (equals) {
                        throw e11;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m6936b);
                    if (loadAnimation2 != null) {
                        return new d(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m6938d(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? C6815a.f15044e : C6815a.f15045f;
        }
        if (i10 == 4099) {
            return z10 ? C6815a.f15042c : C6815a.f15043d;
        }
        if (i10 != 8194) {
            return -1;
        }
        return z10 ? C6815a.f15040a : C6815a.f15041b;
    }
}
