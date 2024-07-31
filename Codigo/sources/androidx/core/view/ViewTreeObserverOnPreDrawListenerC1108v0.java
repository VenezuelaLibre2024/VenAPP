package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.core.view.v0 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1108v0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final View f4689a;

    /* renamed from: b */
    private ViewTreeObserver f4690b;

    /* renamed from: c */
    private final Runnable f4691c;

    private ViewTreeObserverOnPreDrawListenerC1108v0(View view, Runnable runnable) {
        this.f4689a = view;
        this.f4690b = view.getViewTreeObserver();
        this.f4691c = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC1108v0 m5218a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC1108v0 viewTreeObserverOnPreDrawListenerC1108v0 = new ViewTreeObserverOnPreDrawListenerC1108v0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1108v0);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1108v0);
        return viewTreeObserverOnPreDrawListenerC1108v0;
    }

    /* renamed from: b */
    public void m5219b() {
        (this.f4690b.isAlive() ? this.f4690b : this.f4689a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f4689a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m5219b();
        this.f4691c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f4690b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m5219b();
    }
}
