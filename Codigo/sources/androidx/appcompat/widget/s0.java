package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class s0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f1618a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1619b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1620c;

    /* renamed from: d, reason: collision with root package name */
    final View f1621d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f1622e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f1623f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1624r;

    /* renamed from: s, reason: collision with root package name */
    private int f1625s;

    /* renamed from: t, reason: collision with root package name */
    private final int[] f1626t = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = s0.this.f1621d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.this.e();
        }
    }

    public s0(View view) {
        this.f1621d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1618a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1619b = tapTimeout;
        this.f1620c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1623f;
        if (runnable != null) {
            this.f1621d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1622e;
        if (runnable2 != null) {
            this.f1621d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        q0 q0Var;
        View view = this.f1621d;
        androidx.appcompat.view.menu.p b10 = b();
        if (b10 == null || !b10.a() || (q0Var = (q0) b10.r()) == null || !q0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(q0Var, obtainNoHistory);
        boolean e10 = q0Var.e(obtainNoHistory, this.f1625s);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e10 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1621d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1625s
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1618a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1625s = r6
            java.lang.Runnable r6 = r5.f1622e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.s0$a r6 = new androidx.appcompat.widget.s0$a
            r6.<init>()
            r5.f1622e = r6
        L52:
            java.lang.Runnable r6 = r5.f1622e
            int r1 = r5.f1619b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1623f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.s0$b r6 = new androidx.appcompat.widget.s0$b
            r6.<init>()
            r5.f1623f = r6
        L65:
            java.lang.Runnable r6 = r5.f1623f
            int r1 = r5.f1620c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1626t);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1626t);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.p b();

    protected abstract boolean c();

    protected boolean d() {
        androidx.appcompat.view.menu.p b10 = b();
        if (b10 == null || !b10.a()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1621d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1624r = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1624r;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1621d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1624r = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1624r = false;
        this.f1625s = -1;
        Runnable runnable = this.f1622e;
        if (runnable != null) {
            this.f1621d.removeCallbacks(runnable);
        }
    }
}
