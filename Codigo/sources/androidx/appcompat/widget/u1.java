package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.h2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: v, reason: collision with root package name */
    private static u1 f1673v;

    /* renamed from: w, reason: collision with root package name */
    private static u1 f1674w;

    /* renamed from: a, reason: collision with root package name */
    private final View f1675a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f1676b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1677c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f1678d = new Runnable() { // from class: androidx.appcompat.widget.s1
        @Override // java.lang.Runnable
        public final void run() {
            u1.this.e();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f1679e = new Runnable() { // from class: androidx.appcompat.widget.t1
        @Override // java.lang.Runnable
        public final void run() {
            u1.this.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private int f1680f;

    /* renamed from: r, reason: collision with root package name */
    private int f1681r;

    /* renamed from: s, reason: collision with root package name */
    private v1 f1682s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1683t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1684u;

    private u1(View view, CharSequence charSequence) {
        this.f1675a = view;
        this.f1676b = charSequence;
        this.f1677c = h2.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f1675a.removeCallbacks(this.f1678d);
    }

    private void c() {
        this.f1684u = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f1675a.postDelayed(this.f1678d, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(u1 u1Var) {
        u1 u1Var2 = f1673v;
        if (u1Var2 != null) {
            u1Var2.b();
        }
        f1673v = u1Var;
        if (u1Var != null) {
            u1Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        u1 u1Var = f1673v;
        if (u1Var != null && u1Var.f1675a == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new u1(view, charSequence);
            return;
        }
        u1 u1Var2 = f1674w;
        if (u1Var2 != null && u1Var2.f1675a == view) {
            u1Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f1684u && Math.abs(x10 - this.f1680f) <= this.f1677c && Math.abs(y10 - this.f1681r) <= this.f1677c) {
            return false;
        }
        this.f1680f = x10;
        this.f1681r = y10;
        this.f1684u = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (f1674w == this) {
            f1674w = null;
            v1 v1Var = this.f1682s;
            if (v1Var != null) {
                v1Var.c();
                this.f1682s = null;
                c();
                this.f1675a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1673v == this) {
            g(null);
        }
        this.f1675a.removeCallbacks(this.f1679e);
    }

    void i(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (androidx.core.view.x0.G(this.f1675a)) {
            g(null);
            u1 u1Var = f1674w;
            if (u1Var != null) {
                u1Var.d();
            }
            f1674w = this;
            this.f1683t = z10;
            v1 v1Var = new v1(this.f1675a.getContext());
            this.f1682s = v1Var;
            v1Var.e(this.f1675a, this.f1680f, this.f1681r, this.f1683t, this.f1676b);
            this.f1675a.addOnAttachStateChangeListener(this);
            if (this.f1683t) {
                j11 = 2500;
            } else {
                if ((androidx.core.view.x0.B(this.f1675a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f1675a.removeCallbacks(this.f1679e);
            this.f1675a.postDelayed(this.f1679e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1682s != null && this.f1683t) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1675a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f1675a.isEnabled() && this.f1682s == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1680f = view.getWidth() / 2;
        this.f1681r = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
