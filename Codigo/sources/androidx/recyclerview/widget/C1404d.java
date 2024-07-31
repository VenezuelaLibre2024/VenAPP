package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C1116x0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C1404d extends RecyclerView.AbstractC1381m implements RecyclerView.InterfaceC1386r {

    /* renamed from: D */
    private static final int[] f6186D = {R.attr.state_pressed};

    /* renamed from: E */
    private static final int[] f6187E = new int[0];

    /* renamed from: A */
    int f6188A;

    /* renamed from: B */
    private final Runnable f6189B;

    /* renamed from: C */
    private final RecyclerView.AbstractC1387s f6190C;

    /* renamed from: a */
    private final int f6191a;

    /* renamed from: b */
    private final int f6192b;

    /* renamed from: c */
    final StateListDrawable f6193c;

    /* renamed from: d */
    final Drawable f6194d;

    /* renamed from: e */
    private final int f6195e;

    /* renamed from: f */
    private final int f6196f;

    /* renamed from: g */
    private final StateListDrawable f6197g;

    /* renamed from: h */
    private final Drawable f6198h;

    /* renamed from: i */
    private final int f6199i;

    /* renamed from: j */
    private final int f6200j;

    /* renamed from: k */
    int f6201k;

    /* renamed from: l */
    int f6202l;

    /* renamed from: m */
    float f6203m;

    /* renamed from: n */
    int f6204n;

    /* renamed from: o */
    int f6205o;

    /* renamed from: p */
    float f6206p;

    /* renamed from: s */
    private RecyclerView f6209s;

    /* renamed from: z */
    final ValueAnimator f6216z;

    /* renamed from: q */
    private int f6207q = 0;

    /* renamed from: r */
    private int f6208r = 0;

    /* renamed from: t */
    private boolean f6210t = false;

    /* renamed from: u */
    private boolean f6211u = false;

    /* renamed from: v */
    private int f6212v = 0;

    /* renamed from: w */
    private int f6213w = 0;

    /* renamed from: x */
    private final int[] f6214x = new int[2];

    /* renamed from: y */
    private final int[] f6215y = new int[2];

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1404d.this.m8033o(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    class b extends RecyclerView.AbstractC1387s {
        b() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f6219a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6219a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6219a) {
                this.f6219a = false;
                return;
            }
            if (((Float) C1404d.this.f6216z.getAnimatedValue()).floatValue() == 0.0f) {
                C1404d c1404d = C1404d.this;
                c1404d.f6188A = 0;
                c1404d.m8037w(0);
            } else {
                C1404d c1404d2 = C1404d.this;
                c1404d2.f6188A = 2;
                c1404d2.m8036t();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1404d.this.f6193c.setAlpha(floatValue);
            C1404d.this.f6194d.setAlpha(floatValue);
            C1404d.this.m8036t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1404d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6216z = ofFloat;
        this.f6188A = 0;
        this.f6189B = new a();
        this.f6190C = new b();
        this.f6193c = stateListDrawable;
        this.f6194d = drawable;
        this.f6197g = stateListDrawable2;
        this.f6198h = drawable2;
        this.f6195e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f6196f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f6199i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f6200j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f6191a = i11;
        this.f6192b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        m8032h(recyclerView);
    }

    /* renamed from: i */
    private void m8020i() {
        this.f6209s.removeCallbacks(this.f6189B);
    }

    /* renamed from: j */
    private void m8021j() {
        this.f6209s.m7709p0(this);
        this.f6209s.m7710q0(this);
        this.f6209s.m7712r0(this.f6190C);
        m8020i();
    }

    /* renamed from: k */
    private void m8022k(Canvas canvas) {
        int i10 = this.f6208r;
        int i11 = this.f6199i;
        int i12 = this.f6205o;
        int i13 = this.f6204n;
        this.f6197g.setBounds(0, 0, i13, i11);
        this.f6198h.setBounds(0, 0, this.f6207q, this.f6200j);
        canvas.translate(0.0f, i10 - i11);
        this.f6198h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f6197g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: l */
    private void m8023l(Canvas canvas) {
        int i10 = this.f6207q;
        int i11 = this.f6195e;
        int i12 = i10 - i11;
        int i13 = this.f6202l;
        int i14 = this.f6201k;
        int i15 = i13 - (i14 / 2);
        this.f6193c.setBounds(0, 0, i11, i14);
        this.f6194d.setBounds(0, 0, this.f6196f, this.f6208r);
        if (m8027q()) {
            this.f6194d.draw(canvas);
            canvas.translate(this.f6195e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f6193c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            i12 = this.f6195e;
        } else {
            canvas.translate(i12, 0.0f);
            this.f6194d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f6193c.draw(canvas);
        }
        canvas.translate(-i12, -i15);
    }

    /* renamed from: m */
    private int[] m8024m() {
        int[] iArr = this.f6215y;
        int i10 = this.f6192b;
        iArr[0] = i10;
        iArr[1] = this.f6207q - i10;
        return iArr;
    }

    /* renamed from: n */
    private int[] m8025n() {
        int[] iArr = this.f6214x;
        int i10 = this.f6192b;
        iArr[0] = i10;
        iArr[1] = this.f6208r - i10;
        return iArr;
    }

    /* renamed from: p */
    private void m8026p(float f10) {
        int[] m8024m = m8024m();
        float max = Math.max(m8024m[0], Math.min(m8024m[1], f10));
        if (Math.abs(this.f6205o - max) < 2.0f) {
            return;
        }
        int m8029v = m8029v(this.f6206p, max, m8024m, this.f6209s.computeHorizontalScrollRange(), this.f6209s.computeHorizontalScrollOffset(), this.f6207q);
        if (m8029v != 0) {
            this.f6209s.scrollBy(m8029v, 0);
        }
        this.f6206p = max;
    }

    /* renamed from: q */
    private boolean m8027q() {
        return C1116x0.m5296u(this.f6209s) == 1;
    }

    /* renamed from: u */
    private void m8028u(int i10) {
        m8020i();
        this.f6209s.postDelayed(this.f6189B, i10);
    }

    /* renamed from: v */
    private int m8029v(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
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

    /* renamed from: x */
    private void m8030x() {
        this.f6209s.m7692d(this);
        this.f6209s.m7696f(this);
        this.f6209s.m7697g(this.f6190C);
    }

    /* renamed from: z */
    private void m8031z(float f10) {
        int[] m8025n = m8025n();
        float max = Math.max(m8025n[0], Math.min(m8025n[1], f10));
        if (Math.abs(this.f6202l - max) < 2.0f) {
            return;
        }
        int m8029v = m8029v(this.f6203m, max, m8025n, this.f6209s.computeVerticalScrollRange(), this.f6209s.computeVerticalScrollOffset(), this.f6208r);
        if (m8029v != 0) {
            this.f6209s.scrollBy(0, m8029v);
        }
        this.f6203m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1386r
    /* renamed from: a */
    public void mo7874a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f6212v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m8035s = m8035s(motionEvent.getX(), motionEvent.getY());
            boolean m8034r = m8034r(motionEvent.getX(), motionEvent.getY());
            if (m8035s || m8034r) {
                if (m8034r) {
                    this.f6213w = 1;
                    this.f6206p = (int) motionEvent.getX();
                } else if (m8035s) {
                    this.f6213w = 2;
                    this.f6203m = (int) motionEvent.getY();
                }
                m8037w(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f6212v == 2) {
            this.f6203m = 0.0f;
            this.f6206p = 0.0f;
            m8037w(1);
            this.f6213w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f6212v == 2) {
            m8038y();
            if (this.f6213w == 1) {
                m8026p(motionEvent.getX());
            }
            if (this.f6213w == 2) {
                m8031z(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1386r
    /* renamed from: b */
    public boolean mo7875b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f6212v;
        if (i10 == 1) {
            boolean m8035s = m8035s(motionEvent.getX(), motionEvent.getY());
            boolean m8034r = m8034r(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m8035s && !m8034r) {
                return false;
            }
            if (m8034r) {
                this.f6213w = 1;
                this.f6206p = (int) motionEvent.getX();
            } else if (m8035s) {
                this.f6213w = 2;
                this.f6203m = (int) motionEvent.getY();
            }
            m8037w(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1386r
    /* renamed from: c */
    public void mo7876c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1381m
    /* renamed from: g */
    public void mo7807g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1393y c1393y) {
        if (this.f6207q != this.f6209s.getWidth() || this.f6208r != this.f6209s.getHeight()) {
            this.f6207q = this.f6209s.getWidth();
            this.f6208r = this.f6209s.getHeight();
            m8037w(0);
        } else if (this.f6188A != 0) {
            if (this.f6210t) {
                m8023l(canvas);
            }
            if (this.f6211u) {
                m8022k(canvas);
            }
        }
    }

    /* renamed from: h */
    public void m8032h(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6209s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m8021j();
        }
        this.f6209s = recyclerView;
        if (recyclerView != null) {
            m8030x();
        }
    }

    /* renamed from: o */
    void m8033o(int i10) {
        int i11 = this.f6188A;
        if (i11 == 1) {
            this.f6216z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f6188A = 3;
        ValueAnimator valueAnimator = this.f6216z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f6216z.setDuration(i10);
        this.f6216z.start();
    }

    /* renamed from: r */
    boolean m8034r(float f10, float f11) {
        if (f11 >= this.f6208r - this.f6199i) {
            int i10 = this.f6205o;
            int i11 = this.f6204n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    boolean m8035s(float f10, float f11) {
        if (!m8027q() ? f10 >= this.f6207q - this.f6195e : f10 <= this.f6195e) {
            int i10 = this.f6202l;
            int i11 = this.f6201k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    void m8036t() {
        this.f6209s.invalidate();
    }

    /* renamed from: w */
    void m8037w(int i10) {
        int i11;
        if (i10 == 2 && this.f6212v != 2) {
            this.f6193c.setState(f6186D);
            m8020i();
        }
        if (i10 == 0) {
            m8036t();
        } else {
            m8038y();
        }
        if (this.f6212v != 2 || i10 == 2) {
            i11 = i10 == 1 ? 1500 : 1200;
            this.f6212v = i10;
        }
        this.f6193c.setState(f6187E);
        m8028u(i11);
        this.f6212v = i10;
    }

    /* renamed from: y */
    public void m8038y() {
        int i10 = this.f6188A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f6216z.cancel();
            }
        }
        this.f6188A = 1;
        ValueAnimator valueAnimator = this.f6216z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f6216z.setDuration(500L);
        this.f6216z.setStartDelay(0L);
        this.f6216z.start();
    }
}
