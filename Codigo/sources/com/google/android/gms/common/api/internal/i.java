package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    private final Object f9375a;

    public i(Activity activity) {
        com.google.android.gms.common.internal.s.k(activity, "Activity must not be null");
        this.f9375a = activity;
    }

    public final Activity a() {
        return (Activity) this.f9375a;
    }

    public final androidx.fragment.app.e b() {
        return (androidx.fragment.app.e) this.f9375a;
    }

    public final boolean c() {
        return this.f9375a instanceof Activity;
    }

    public final boolean d() {
        return this.f9375a instanceof androidx.fragment.app.e;
    }
}
