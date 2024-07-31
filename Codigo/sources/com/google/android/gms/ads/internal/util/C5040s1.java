package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.internal.ads.zzcfc;

/* renamed from: com.google.android.gms.ads.internal.util.s1 */
/* loaded from: classes.dex */
public final class C5040s1 {

    /* renamed from: a */
    private final View f10151a;

    /* renamed from: b */
    private Activity f10152b;

    /* renamed from: c */
    private boolean f10153c;

    /* renamed from: d */
    private boolean f10154d;

    /* renamed from: e */
    private boolean f10155e;

    /* renamed from: f */
    private final ViewTreeObserver.OnGlobalLayoutListener f10156f;

    public C5040s1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f10152b = activity;
        this.f10151a = view;
        this.f10156f = onGlobalLayoutListener;
    }

    /* renamed from: f */
    private static ViewTreeObserver m12717f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: g */
    private final void m12718g() {
        if (this.f10153c) {
            return;
        }
        Activity activity = this.f10152b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f10156f;
            ViewTreeObserver m12717f = m12717f(activity);
            if (m12717f != null) {
                m12717f.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f10151a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f10156f;
        C4965t.m12589z();
        zzcfc.zza(view, onGlobalLayoutListener2);
        this.f10153c = true;
    }

    /* renamed from: h */
    private final void m12719h() {
        Activity activity = this.f10152b;
        if (activity != null && this.f10153c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f10156f;
            ViewTreeObserver m12717f = m12717f(activity);
            if (m12717f != null) {
                m12717f.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f10153c = false;
        }
    }

    /* renamed from: a */
    public final void m12720a() {
        this.f10155e = false;
        m12719h();
    }

    /* renamed from: b */
    public final void m12721b() {
        this.f10155e = true;
        if (this.f10154d) {
            m12718g();
        }
    }

    /* renamed from: c */
    public final void m12722c() {
        this.f10154d = true;
        if (this.f10155e) {
            m12718g();
        }
    }

    /* renamed from: d */
    public final void m12723d() {
        this.f10154d = false;
        m12719h();
    }

    /* renamed from: e */
    public final void m12724e(Activity activity) {
        this.f10152b = activity;
    }
}
