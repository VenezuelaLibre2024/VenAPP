package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class v0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f3997a;

    /* renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f3998b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f3999c;

    private v0(View view, Runnable runnable) {
        this.f3997a = view;
        this.f3998b = view.getViewTreeObserver();
        this.f3999c = runnable;
    }

    public static v0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        v0 v0Var = new v0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(v0Var);
        view.addOnAttachStateChangeListener(v0Var);
        return v0Var;
    }

    public void b() {
        (this.f3998b.isAlive() ? this.f3998b : this.f3997a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f3997a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f3999c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3998b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
