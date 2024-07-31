package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f12371a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<View> f12372b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f12373c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f12374d;

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f12372b = new AtomicReference<>(view);
        this.f12373c = runnable;
        this.f12374d = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.f12372b.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f12371a.post(this.f12373c);
        this.f12371a.postAtFrontOfQueue(this.f12374d);
        return true;
    }
}
