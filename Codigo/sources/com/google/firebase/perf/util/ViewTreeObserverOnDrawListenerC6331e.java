package com.google.firebase.perf.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.perf.util.e */
/* loaded from: classes.dex */
public class ViewTreeObserverOnDrawListenerC6331e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    private final Handler f13596a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final AtomicReference<View> f13597b;

    /* renamed from: c */
    private final Runnable f13598c;

    /* renamed from: com.google.firebase.perf.util.e$a */
    /* loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(ViewTreeObserverOnDrawListenerC6331e.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private ViewTreeObserverOnDrawListenerC6331e(View view, Runnable runnable) {
        this.f13597b = new AtomicReference<>(view);
        this.f13598c = runnable;
    }

    /* renamed from: b */
    private static boolean m17510b(View view) {
        return view.getViewTreeObserver().isAlive() && m17511c(view);
    }

    /* renamed from: c */
    private static boolean m17511c(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m17512d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    /* renamed from: e */
    public static void m17513e(View view, Runnable runnable) {
        ViewTreeObserverOnDrawListenerC6331e viewTreeObserverOnDrawListenerC6331e = new ViewTreeObserverOnDrawListenerC6331e(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || m17510b(view)) {
            view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC6331e);
        } else {
            view.addOnAttachStateChangeListener(new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f13597b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.firebase.perf.util.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserverOnDrawListenerC6331e.this.m17512d(andSet);
            }
        });
        this.f13596a.postAtFrontOfQueue(this.f13598c);
    }
}
