package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.ActivityC1263e;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* loaded from: classes.dex */
public class C5143i {

    /* renamed from: a */
    private final Object f10489a;

    public C5143i(Activity activity) {
        C5276s.m13325k(activity, "Activity must not be null");
        this.f10489a = activity;
    }

    /* renamed from: a */
    public final Activity m13070a() {
        return (Activity) this.f10489a;
    }

    /* renamed from: b */
    public final ActivityC1263e m13071b() {
        return (ActivityC1263e) this.f10489a;
    }

    /* renamed from: c */
    public final boolean m13072c() {
        return this.f10489a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean m13073d() {
        return this.f10489a instanceof ActivityC1263e;
    }
}
