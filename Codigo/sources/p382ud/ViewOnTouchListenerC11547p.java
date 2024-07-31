package p382ud;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* renamed from: ud.p */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC11547p implements View.OnTouchListener {

    /* renamed from: a */
    private int f29952a;

    /* renamed from: b */
    private int f29953b;

    /* renamed from: c */
    private int f29954c;

    /* renamed from: d */
    private long f29955d;

    /* renamed from: e */
    private View f29956e;

    /* renamed from: f */
    private e f29957f;

    /* renamed from: r */
    private int f29958r = 1;

    /* renamed from: s */
    private float f29959s;

    /* renamed from: t */
    private float f29960t;

    /* renamed from: u */
    private boolean f29961u;

    /* renamed from: v */
    private int f29962v;

    /* renamed from: w */
    private Object f29963w;

    /* renamed from: x */
    private VelocityTracker f29964x;

    /* renamed from: y */
    private float f29965y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ud.p$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewOnTouchListenerC11547p.this.m36199g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ud.p$b */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ float f29967a;

        /* renamed from: b */
        final /* synthetic */ float f29968b;

        /* renamed from: c */
        final /* synthetic */ float f29969c;

        /* renamed from: d */
        final /* synthetic */ float f29970d;

        b(float f10, float f11, float f12, float f13) {
            this.f29967a = f10;
            this.f29968b = f11;
            this.f29969c = f12;
            this.f29970d = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = this.f29967a + (valueAnimator.getAnimatedFraction() * this.f29968b);
            float animatedFraction2 = this.f29969c + (valueAnimator.getAnimatedFraction() * this.f29970d);
            ViewOnTouchListenerC11547p.this.mo36130i(animatedFraction);
            ViewOnTouchListenerC11547p.this.m36200h(animatedFraction2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ud.p$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup.LayoutParams f29972a;

        /* renamed from: b */
        final /* synthetic */ int f29973b;

        c(ViewGroup.LayoutParams layoutParams, int i10) {
            this.f29972a = layoutParams;
            this.f29973b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewOnTouchListenerC11547p.this.f29957f.mo36128b(ViewOnTouchListenerC11547p.this.f29956e, ViewOnTouchListenerC11547p.this.f29963w);
            ViewOnTouchListenerC11547p.this.f29956e.setAlpha(1.0f);
            ViewOnTouchListenerC11547p.this.f29956e.setTranslationX(0.0f);
            this.f29972a.height = this.f29973b;
            ViewOnTouchListenerC11547p.this.f29956e.setLayoutParams(this.f29972a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ud.p$d */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup.LayoutParams f29975a;

        d(ViewGroup.LayoutParams layoutParams) {
            this.f29975a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f29975a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewOnTouchListenerC11547p.this.f29956e.setLayoutParams(this.f29975a);
        }
    }

    /* renamed from: ud.p$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        boolean mo36127a(Object obj);

        /* renamed from: b */
        void mo36128b(View view, Object obj);
    }

    public ViewOnTouchListenerC11547p(View view, Object obj, e eVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f29952a = viewConfiguration.getScaledTouchSlop();
        this.f29953b = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f29954c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f29955d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f29956e = view;
        this.f29963w = obj;
        this.f29957f = eVar;
    }

    /* renamed from: e */
    private void m36198e(float f10, float f11, AnimatorListenerAdapter animatorListenerAdapter) {
        float mo36129f = mo36129f();
        float f12 = f10 - mo36129f;
        float alpha = this.f29956e.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.f29955d);
        ofFloat.addUpdateListener(new b(mo36129f, f12, alpha, f11 - alpha));
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m36199g() {
        ViewGroup.LayoutParams layoutParams = this.f29956e.getLayoutParams();
        int height = this.f29956e.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.f29955d);
        duration.addListener(new c(layoutParams, height));
        duration.addUpdateListener(new d(layoutParams));
        duration.start();
    }

    /* renamed from: f */
    protected float mo36129f() {
        return this.f29956e.getTranslationX();
    }

    /* renamed from: h */
    protected void m36200h(float f10) {
        this.f29956e.setAlpha(f10);
    }

    /* renamed from: i */
    protected void mo36130i(float f10) {
        this.f29956e.setTranslationX(f10);
    }

    /* renamed from: j */
    protected void m36201j() {
        m36198e(0.0f, 1.0f, null);
    }

    /* renamed from: k */
    protected void m36202k(boolean z10) {
        m36198e(z10 ? this.f29958r : -this.f29958r, 0.0f, new a());
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
        throw new UnsupportedOperationException("Method not decompiled: p382ud.ViewOnTouchListenerC11547p.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
