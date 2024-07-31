package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C1044h2;
import androidx.core.view.C1116x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.u1 */
/* loaded from: classes.dex */
public class ViewOnLongClickListenerC0376u1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: v */
    private static ViewOnLongClickListenerC0376u1 f1967v;

    /* renamed from: w */
    private static ViewOnLongClickListenerC0376u1 f1968w;

    /* renamed from: a */
    private final View f1969a;

    /* renamed from: b */
    private final CharSequence f1970b;

    /* renamed from: c */
    private final int f1971c;

    /* renamed from: d */
    private final Runnable f1972d = new Runnable() { // from class: androidx.appcompat.widget.s1
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC0376u1.this.m2019e();
        }
    };

    /* renamed from: e */
    private final Runnable f1973e = new Runnable() { // from class: androidx.appcompat.widget.t1
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC0376u1.this.m2024d();
        }
    };

    /* renamed from: f */
    private int f1974f;

    /* renamed from: r */
    private int f1975r;

    /* renamed from: s */
    private C0379v1 f1976s;

    /* renamed from: t */
    private boolean f1977t;

    /* renamed from: u */
    private boolean f1978u;

    private ViewOnLongClickListenerC0376u1(View view, CharSequence charSequence) {
        this.f1969a = view;
        this.f1970b = charSequence;
        this.f1971c = C1044h2.m4992c(ViewConfiguration.get(view.getContext()));
        m2018c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    private void m2017b() {
        this.f1969a.removeCallbacks(this.f1972d);
    }

    /* renamed from: c */
    private void m2018c() {
        this.f1978u = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m2019e() {
        m2025i(false);
    }

    /* renamed from: f */
    private void m2020f() {
        this.f1969a.postDelayed(this.f1972d, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: g */
    private static void m2021g(ViewOnLongClickListenerC0376u1 viewOnLongClickListenerC0376u1) {
        ViewOnLongClickListenerC0376u1 viewOnLongClickListenerC0376u12 = f1967v;
        if (viewOnLongClickListenerC0376u12 != null) {
            viewOnLongClickListenerC0376u12.m2017b();
        }
        f1967v = viewOnLongClickListenerC0376u1;
        if (viewOnLongClickListenerC0376u1 != null) {
            viewOnLongClickListenerC0376u1.m2020f();
        }
    }

    /* renamed from: h */
    public static void m2022h(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC0376u1 viewOnLongClickListenerC0376u1 = f1967v;
        if (viewOnLongClickListenerC0376u1 != null && viewOnLongClickListenerC0376u1.f1969a == view) {
            m2021g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0376u1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0376u1 viewOnLongClickListenerC0376u12 = f1968w;
        if (viewOnLongClickListenerC0376u12 != null && viewOnLongClickListenerC0376u12.f1969a == view) {
            viewOnLongClickListenerC0376u12.m2024d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: j */
    private boolean m2023j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f1978u && Math.abs(x10 - this.f1974f) <= this.f1971c && Math.abs(y10 - this.f1975r) <= this.f1971c) {
            return false;
        }
        this.f1974f = x10;
        this.f1975r = y10;
        this.f1978u = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m2024d() {
        if (f1968w == this) {
            f1968w = null;
            C0379v1 c0379v1 = this.f1976s;
            if (c0379v1 != null) {
                c0379v1.m2034c();
                this.f1976s = null;
                m2018c();
                this.f1969a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1967v == this) {
            m2021g(null);
        }
        this.f1969a.removeCallbacks(this.f1973e);
    }

    /* renamed from: i */
    void m2025i(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (C1116x0.m5242G(this.f1969a)) {
            m2021g(null);
            ViewOnLongClickListenerC0376u1 viewOnLongClickListenerC0376u1 = f1968w;
            if (viewOnLongClickListenerC0376u1 != null) {
                viewOnLongClickListenerC0376u1.m2024d();
            }
            f1968w = this;
            this.f1977t = z10;
            C0379v1 c0379v1 = new C0379v1(this.f1969a.getContext());
            this.f1976s = c0379v1;
            c0379v1.m2036e(this.f1969a, this.f1974f, this.f1975r, this.f1977t, this.f1970b);
            this.f1969a.addOnAttachStateChangeListener(this);
            if (this.f1977t) {
                j11 = 2500;
            } else {
                if ((C1116x0.m5237B(this.f1969a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f1969a.removeCallbacks(this.f1973e);
            this.f1969a.postDelayed(this.f1973e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1976s != null && this.f1977t) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1969a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m2018c();
                m2024d();
            }
        } else if (this.f1969a.isEnabled() && this.f1976s == null && m2023j(motionEvent)) {
            m2021g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1974f = view.getWidth() / 2;
        this.f1975r = view.getHeight() / 2;
        m2025i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2024d();
    }
}
