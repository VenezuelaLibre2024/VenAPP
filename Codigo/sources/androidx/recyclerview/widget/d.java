package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.x0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends RecyclerView.m implements RecyclerView.r {
    private static final int[] D = {R.attr.state_pressed};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.s C;

    /* renamed from: a, reason: collision with root package name */
    private final int f5366a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5367b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f5368c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f5369d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5370e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5371f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f5372g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f5373h;

    /* renamed from: i, reason: collision with root package name */
    private final int f5374i;

    /* renamed from: j, reason: collision with root package name */
    private final int f5375j;

    /* renamed from: k, reason: collision with root package name */
    int f5376k;

    /* renamed from: l, reason: collision with root package name */
    int f5377l;

    /* renamed from: m, reason: collision with root package name */
    float f5378m;

    /* renamed from: n, reason: collision with root package name */
    int f5379n;

    /* renamed from: o, reason: collision with root package name */
    int f5380o;

    /* renamed from: p, reason: collision with root package name */
    float f5381p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f5384s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f5391z;

    /* renamed from: q, reason: collision with root package name */
    private int f5382q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f5383r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f5385t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f5386u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f5387v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f5388w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f5389x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f5390y = new int[2];

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.o(500);
        }
    }

    /* loaded from: classes.dex */
    class b extends RecyclerView.s {
        b() {
        }
    }

    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f5394a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5394a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5394a) {
                this.f5394a = false;
                return;
            }
            if (((Float) d.this.f5391z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.w(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.t();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0082d implements ValueAnimator.AnimatorUpdateListener {
        C0082d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f5368c.setAlpha(floatValue);
            d.this.f5369d.setAlpha(floatValue);
            d.this.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5391z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f5368c = stateListDrawable;
        this.f5369d = drawable;
        this.f5372g = stateListDrawable2;
        this.f5373h = drawable2;
        this.f5370e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f5371f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f5374i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f5375j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f5366a = i11;
        this.f5367b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0082d());
        h(recyclerView);
    }

    private void i() {
        this.f5384s.removeCallbacks(this.B);
    }

    private void j() {
        this.f5384s.p0(this);
        this.f5384s.q0(this);
        this.f5384s.r0(this.C);
        i();
    }

    private void k(Canvas canvas) {
        int i10 = this.f5383r;
        int i11 = this.f5374i;
        int i12 = this.f5380o;
        int i13 = this.f5379n;
        this.f5372g.setBounds(0, 0, i13, i11);
        this.f5373h.setBounds(0, 0, this.f5382q, this.f5375j);
        canvas.translate(0.0f, i10 - i11);
        this.f5373h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f5372g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void l(Canvas canvas) {
        int i10 = this.f5382q;
        int i11 = this.f5370e;
        int i12 = i10 - i11;
        int i13 = this.f5377l;
        int i14 = this.f5376k;
        int i15 = i13 - (i14 / 2);
        this.f5368c.setBounds(0, 0, i11, i14);
        this.f5369d.setBounds(0, 0, this.f5371f, this.f5383r);
        if (q()) {
            this.f5369d.draw(canvas);
            canvas.translate(this.f5370e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f5368c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            i12 = this.f5370e;
        } else {
            canvas.translate(i12, 0.0f);
            this.f5369d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f5368c.draw(canvas);
        }
        canvas.translate(-i12, -i15);
    }

    private int[] m() {
        int[] iArr = this.f5390y;
        int i10 = this.f5367b;
        iArr[0] = i10;
        iArr[1] = this.f5382q - i10;
        return iArr;
    }

    private int[] n() {
        int[] iArr = this.f5389x;
        int i10 = this.f5367b;
        iArr[0] = i10;
        iArr[1] = this.f5383r - i10;
        return iArr;
    }

    private void p(float f10) {
        int[] m10 = m();
        float max = Math.max(m10[0], Math.min(m10[1], f10));
        if (Math.abs(this.f5380o - max) < 2.0f) {
            return;
        }
        int v10 = v(this.f5381p, max, m10, this.f5384s.computeHorizontalScrollRange(), this.f5384s.computeHorizontalScrollOffset(), this.f5382q);
        if (v10 != 0) {
            this.f5384s.scrollBy(v10, 0);
        }
        this.f5381p = max;
    }

    private boolean q() {
        return x0.u(this.f5384s) == 1;
    }

    private void u(int i10) {
        i();
        this.f5384s.postDelayed(this.B, i10);
    }

    private int v(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void x() {
        this.f5384s.d(this);
        this.f5384s.f(this);
        this.f5384s.g(this.C);
    }

    private void z(float f10) {
        int[] n10 = n();
        float max = Math.max(n10[0], Math.min(n10[1], f10));
        if (Math.abs(this.f5377l - max) < 2.0f) {
            return;
        }
        int v10 = v(this.f5378m, max, n10, this.f5384s.computeVerticalScrollRange(), this.f5384s.computeVerticalScrollOffset(), this.f5383r);
        if (v10 != 0) {
            this.f5384s.scrollBy(0, v10);
        }
        this.f5378m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5387v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean s10 = s(motionEvent.getX(), motionEvent.getY());
            boolean r10 = r(motionEvent.getX(), motionEvent.getY());
            if (s10 || r10) {
                if (r10) {
                    this.f5388w = 1;
                    this.f5381p = (int) motionEvent.getX();
                } else if (s10) {
                    this.f5388w = 2;
                    this.f5378m = (int) motionEvent.getY();
                }
                w(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f5387v == 2) {
            this.f5378m = 0.0f;
            this.f5381p = 0.0f;
            w(1);
            this.f5388w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f5387v == 2) {
            y();
            if (this.f5388w == 1) {
                p(motionEvent.getX());
            }
            if (this.f5388w == 2) {
                z(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f5387v;
        if (i10 == 1) {
            boolean s10 = s(motionEvent.getX(), motionEvent.getY());
            boolean r10 = r(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!s10 && !r10) {
                return false;
            }
            if (r10) {
                this.f5388w = 1;
                this.f5381p = (int) motionEvent.getX();
            } else if (s10) {
                this.f5388w = 2;
                this.f5378m = (int) motionEvent.getY();
            }
            w(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        if (this.f5382q != this.f5384s.getWidth() || this.f5383r != this.f5384s.getHeight()) {
            this.f5382q = this.f5384s.getWidth();
            this.f5383r = this.f5384s.getHeight();
            w(0);
        } else if (this.A != 0) {
            if (this.f5385t) {
                l(canvas);
            }
            if (this.f5386u) {
                k(canvas);
            }
        }
    }

    public void h(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5384s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            j();
        }
        this.f5384s = recyclerView;
        if (recyclerView != null) {
            x();
        }
    }

    void o(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f5391z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f5391z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f5391z.setDuration(i10);
        this.f5391z.start();
    }

    boolean r(float f10, float f11) {
        if (f11 >= this.f5383r - this.f5374i) {
            int i10 = this.f5380o;
            int i11 = this.f5379n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean s(float f10, float f11) {
        if (!q() ? f10 >= this.f5382q - this.f5370e : f10 <= this.f5370e) {
            int i10 = this.f5377l;
            int i11 = this.f5376k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    void t() {
        this.f5384s.invalidate();
    }

    void w(int i10) {
        int i11;
        if (i10 == 2 && this.f5387v != 2) {
            this.f5368c.setState(D);
            i();
        }
        if (i10 == 0) {
            t();
        } else {
            y();
        }
        if (this.f5387v != 2 || i10 == 2) {
            i11 = i10 == 1 ? 1500 : 1200;
            this.f5387v = i10;
        }
        this.f5368c.setState(E);
        u(i11);
        this.f5387v = i10;
    }

    public void y() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f5391z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f5391z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f5391z.setDuration(500L);
        this.f5391z.setStartDelay(0L);
        this.f5391z.start();
    }
}
