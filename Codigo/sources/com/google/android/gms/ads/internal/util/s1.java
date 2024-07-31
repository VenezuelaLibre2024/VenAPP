package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcfc;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    private final View f9052a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f9053b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9054c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9055d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9056e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f9057f;

    public s1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f9053b = activity;
        this.f9052a = view;
        this.f9057f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        if (this.f9054c) {
            return;
        }
        Activity activity = this.f9053b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f9057f;
            ViewTreeObserver f10 = f(activity);
            if (f10 != null) {
                f10.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f9052a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f9057f;
        com.google.android.gms.ads.internal.t.z();
        zzcfc.zza(view, onGlobalLayoutListener2);
        this.f9054c = true;
    }

    private final void h() {
        Activity activity = this.f9053b;
        if (activity != null && this.f9054c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f9057f;
            ViewTreeObserver f10 = f(activity);
            if (f10 != null) {
                f10.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f9054c = false;
        }
    }

    public final void a() {
        this.f9056e = false;
        h();
    }

    public final void b() {
        this.f9056e = true;
        if (this.f9055d) {
            g();
        }
    }

    public final void c() {
        this.f9055d = true;
        if (this.f9056e) {
            g();
        }
    }

    public final void d() {
        this.f9055d = false;
        h();
    }

    public final void e(Activity activity) {
        this.f9053b = activity;
    }
}
