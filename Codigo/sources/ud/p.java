package ud;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class p implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private int f27629a;

    /* renamed from: b, reason: collision with root package name */
    private int f27630b;

    /* renamed from: c, reason: collision with root package name */
    private int f27631c;

    /* renamed from: d, reason: collision with root package name */
    private long f27632d;

    /* renamed from: e, reason: collision with root package name */
    private View f27633e;

    /* renamed from: f, reason: collision with root package name */
    private e f27634f;

    /* renamed from: r, reason: collision with root package name */
    private int f27635r = 1;

    /* renamed from: s, reason: collision with root package name */
    private float f27636s;

    /* renamed from: t, reason: collision with root package name */
    private float f27637t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f27638u;

    /* renamed from: v, reason: collision with root package name */
    private int f27639v;

    /* renamed from: w, reason: collision with root package name */
    private Object f27640w;

    /* renamed from: x, reason: collision with root package name */
    private VelocityTracker f27641x;

    /* renamed from: y, reason: collision with root package name */
    private float f27642y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f27644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f27645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f27646c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f27647d;

        b(float f10, float f11, float f12, float f13) {
            this.f27644a = f10;
            this.f27645b = f11;
            this.f27646c = f12;
            this.f27647d = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = this.f27644a + (valueAnimator.getAnimatedFraction() * this.f27645b);
            float animatedFraction2 = this.f27646c + (valueAnimator.getAnimatedFraction() * this.f27647d);
            p.this.i(animatedFraction);
            p.this.h(animatedFraction2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f27649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27650b;

        c(ViewGroup.LayoutParams layoutParams, int i10) {
            this.f27649a = layoutParams;
            this.f27650b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.f27634f.b(p.this.f27633e, p.this.f27640w);
            p.this.f27633e.setAlpha(1.0f);
            p.this.f27633e.setTranslationX(0.0f);
            this.f27649a.height = this.f27650b;
            p.this.f27633e.setLayoutParams(this.f27649a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f27652a;

        d(ViewGroup.LayoutParams layoutParams) {
            this.f27652a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f27652a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            p.this.f27633e.setLayoutParams(this.f27652a);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(Object obj);

        void b(View view, Object obj);
    }

    public p(View view, Object obj, e eVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f27629a = viewConfiguration.getScaledTouchSlop();
        this.f27630b = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f27631c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f27632d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f27633e = view;
        this.f27640w = obj;
        this.f27634f = eVar;
    }

    private void e(float f10, float f11, AnimatorListenerAdapter animatorListenerAdapter) {
        float f12 = f();
        float f13 = f10 - f12;
        float alpha = this.f27633e.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.f27632d);
        ofFloat.addUpdateListener(new b(f12, f13, alpha, f11 - alpha));
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ViewGroup.LayoutParams layoutParams = this.f27633e.getLayoutParams();
        int height = this.f27633e.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.f27632d);
        duration.addListener(new c(layoutParams, height));
        duration.addUpdateListener(new d(layoutParams));
        duration.start();
    }

    protected float f() {
        return this.f27633e.getTranslationX();
    }

    protected void h(float f10) {
        this.f27633e.setAlpha(f10);
    }

    protected void i(float f10) {
        this.f27633e.setTranslationX(f10);
    }

    protected void j() {
        e(0.0f, 1.0f, null);
    }

    protected void k(boolean z10) {
        e(z10 ? this.f27635r : -this.f27635r, 0.0f, new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0155, code lost:
    
        if (r11 != null) goto L17;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.p.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
