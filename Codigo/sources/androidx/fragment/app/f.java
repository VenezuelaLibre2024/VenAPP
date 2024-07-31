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
import androidx.core.os.c;
import androidx.core.view.v0;
import androidx.fragment.app.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f4646a;

        a(Fragment fragment) {
            this.f4646a = fragment;
        }

        @Override // androidx.core.os.c.b
        public void onCancel() {
            if (this.f4646a.getAnimatingAway() != null) {
                View animatingAway = this.f4646a.getAnimatingAway();
                this.f4646a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f4646a.setAnimator(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f4647a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f4648b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w.g f4649c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f4650d;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f4648b.getAnimatingAway() != null) {
                    b.this.f4648b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.f4649c.a(bVar.f4648b, bVar.f4650d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, w.g gVar, androidx.core.os.c cVar) {
            this.f4647a = viewGroup;
            this.f4648b = fragment;
            this.f4649c = gVar;
            this.f4650d = cVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4647a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f4652a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4653b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f4654c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w.g f4655d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f4656e;

        c(ViewGroup viewGroup, View view, Fragment fragment, w.g gVar, androidx.core.os.c cVar) {
            this.f4652a = viewGroup;
            this.f4653b = view;
            this.f4654c = fragment;
            this.f4655d = gVar;
            this.f4656e = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4652a.endViewTransition(this.f4653b);
            Animator animator2 = this.f4654c.getAnimator();
            this.f4654c.setAnimator(null);
            if (animator2 == null || this.f4652a.indexOfChild(this.f4653b) >= 0) {
                return;
            }
            this.f4655d.a(this.f4654c, this.f4656e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f4657a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f4658b;

        d(Animator animator) {
            this.f4657a = null;
            this.f4658b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        d(Animation animation) {
            this.f4657a = animation;
            this.f4658b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f4659a;

        /* renamed from: b, reason: collision with root package name */
        private final View f4660b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4661c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4662d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4663e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4663e = true;
            this.f4659a = viewGroup;
            this.f4660b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f4663e = true;
            if (this.f4661c) {
                return !this.f4662d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f4661c = true;
                v0.a(this.f4659a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f4663e = true;
            if (this.f4661c) {
                return !this.f4662d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f4661c = true;
                v0.a(this.f4659a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4661c || !this.f4663e) {
                this.f4659a.endViewTransition(this.f4660b);
                this.f4662d = true;
            } else {
                this.f4663e = false;
                this.f4659a.post(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment, d dVar, w.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        androidx.core.os.c cVar = new androidx.core.os.c();
        cVar.c(new a(fragment));
        gVar.b(fragment, cVar);
        if (dVar.f4657a != null) {
            e eVar = new e(dVar.f4657a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, cVar));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f4658b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, cVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d c(Context context, Fragment fragment, boolean z10, boolean z11) {
        int nextTransition = fragment.getNextTransition();
        int b10 = b(fragment, z10, z11);
        boolean z12 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i10 = d1.b.f13694c;
            if (viewGroup.getTag(i10) != null) {
                fragment.mContainer.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, b10);
        if (onCreateAnimation != null) {
            return new d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, b10);
        if (onCreateAnimator != null) {
            return new d(onCreateAnimator);
        }
        if (b10 == 0 && nextTransition != 0) {
            b10 = d(nextTransition, z10);
        }
        if (b10 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b10));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b10);
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
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b10);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (equals) {
                        throw e11;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b10);
                    if (loadAnimation2 != null) {
                        return new d(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? d1.a.f13690e : d1.a.f13691f;
        }
        if (i10 == 4099) {
            return z10 ? d1.a.f13688c : d1.a.f13689d;
        }
        if (i10 != 8194) {
            return -1;
        }
        return z10 ? d1.a.f13686a : d1.a.f13687b;
    }
}
