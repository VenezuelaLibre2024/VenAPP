package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.InterfaceC0269p;

/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0369s0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final float f1893a;

    /* renamed from: b */
    private final int f1894b;

    /* renamed from: c */
    private final int f1895c;

    /* renamed from: d */
    final View f1896d;

    /* renamed from: e */
    private Runnable f1897e;

    /* renamed from: f */
    private Runnable f1898f;

    /* renamed from: r */
    private boolean f1899r;

    /* renamed from: s */
    private int f1900s;

    /* renamed from: t */
    private final int[] f1901t = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.s0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0369s0.this.f1896d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.s0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0369s0.this.m1964e();
        }
    }

    public AbstractViewOnTouchListenerC0369s0(View view) {
        this.f1896d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1893a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1894b = tapTimeout;
        this.f1895c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m1958a() {
        Runnable runnable = this.f1898f;
        if (runnable != null) {
            this.f1896d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1897e;
        if (runnable2 != null) {
            this.f1896d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m1959f(MotionEvent motionEvent) {
        C0363q0 c0363q0;
        View view = this.f1896d;
        InterfaceC0269p mo1224b = mo1224b();
        if (mo1224b == null || !mo1224b.mo1269a() || (c0363q0 = (C0363q0) mo1224b.mo1276r()) == null || !c0363q0.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1962i(view, obtainNoHistory);
        m1963j(c0363q0, obtainNoHistory);
        boolean mo1935e = c0363q0.mo1935e(obtainNoHistory, this.f1900s);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return mo1935e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m1960g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1896d
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
            int r1 = r5.f1900s
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1893a
            boolean r6 = m1961h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m1958a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m1958a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1900s = r6
            java.lang.Runnable r6 = r5.f1897e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.s0$a r6 = new androidx.appcompat.widget.s0$a
            r6.<init>()
            r5.f1897e = r6
        L52:
            java.lang.Runnable r6 = r5.f1897e
            int r1 = r5.f1894b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1898f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.s0$b r6 = new androidx.appcompat.widget.s0$b
            r6.<init>()
            r5.f1898f = r6
        L65:
            java.lang.Runnable r6 = r5.f1898f
            int r1 = r5.f1895c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractViewOnTouchListenerC0369s0.m1960g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m1961h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    /* renamed from: i */
    private boolean m1962i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1901t);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m1963j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1901t);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* renamed from: b */
    public abstract InterfaceC0269p mo1224b();

    /* renamed from: c */
    protected abstract boolean mo1225c();

    /* renamed from: d */
    protected boolean mo1634d() {
        InterfaceC0269p mo1224b = mo1224b();
        if (mo1224b == null || !mo1224b.mo1269a()) {
            return true;
        }
        mo1224b.dismiss();
        return true;
    }

    /* renamed from: e */
    void m1964e() {
        m1958a();
        View view = this.f1896d;
        if (view.isEnabled() && !view.isLongClickable() && mo1225c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1899r = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1899r;
        if (z11) {
            z10 = m1959f(motionEvent) || !mo1634d();
        } else {
            z10 = m1960g(motionEvent) && mo1225c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1896d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1899r = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1899r = false;
        this.f1900s = -1;
        Runnable runnable = this.f1897e;
        if (runnable != null) {
            this.f1896d.removeCallbacks(runnable);
        }
    }
}
