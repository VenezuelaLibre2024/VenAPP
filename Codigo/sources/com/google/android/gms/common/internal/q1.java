package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f9625f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f9626a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9627b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f9628c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9629d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9630e;

    public q1(ComponentName componentName, int i10) {
        this.f9626a = null;
        this.f9627b = null;
        s.j(componentName);
        this.f9628c = componentName;
        this.f9629d = 4225;
        this.f9630e = false;
    }

    public q1(String str, String str2, int i10, boolean z10) {
        s.f(str);
        this.f9626a = str;
        s.f(str2);
        this.f9627b = str2;
        this.f9628c = null;
        this.f9629d = 4225;
        this.f9630e = z10;
    }

    public final ComponentName a() {
        return this.f9628c;
    }

    public final Intent b(Context context) {
        Bundle bundle;
        if (this.f9626a == null) {
            return new Intent().setComponent(this.f9628c);
        }
        if (this.f9630e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f9626a);
            try {
                bundle = context.getContentResolver().call(f9625f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f9626a)));
            }
        }
        return r2 == null ? new Intent(this.f9626a).setPackage(this.f9627b) : r2;
    }

    public final String c() {
        return this.f9627b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return q.b(this.f9626a, q1Var.f9626a) && q.b(this.f9627b, q1Var.f9627b) && q.b(this.f9628c, q1Var.f9628c) && this.f9630e == q1Var.f9630e;
    }

    public final int hashCode() {
        return q.c(this.f9626a, this.f9627b, this.f9628c, 4225, Boolean.valueOf(this.f9630e));
    }

    public final String toString() {
        String str = this.f9626a;
        if (str != null) {
            return str;
        }
        s.j(this.f9628c);
        return this.f9628c.flattenToString();
    }
}
