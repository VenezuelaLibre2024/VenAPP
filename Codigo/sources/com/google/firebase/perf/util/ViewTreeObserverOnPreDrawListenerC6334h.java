package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.perf.util.h */
/* loaded from: classes.dex */
public class ViewTreeObserverOnPreDrawListenerC6334h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final Handler f13603a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final AtomicReference<View> f13604b;

    /* renamed from: c */
    private final Runnable f13605c;

    /* renamed from: d */
    private final Runnable f13606d;

    private ViewTreeObserverOnPreDrawListenerC6334h(View view, Runnable runnable, Runnable runnable2) {
        this.f13604b = new AtomicReference<>(view);
        this.f13605c = runnable;
        this.f13606d = runnable2;
    }

    /* renamed from: a */
    public static void m17524a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC6334h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.f13604b.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f13603a.post(this.f13605c);
        this.f13603a.postAtFrontOfQueue(this.f13606d);
        return true;
    }
}
