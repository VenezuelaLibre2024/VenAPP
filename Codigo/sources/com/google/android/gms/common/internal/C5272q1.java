package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.q1 */
/* loaded from: classes.dex */
public final class C5272q1 {

    /* renamed from: f */
    private static final Uri f10740f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f10741a;

    /* renamed from: b */
    private final String f10742b;

    /* renamed from: c */
    private final ComponentName f10743c;

    /* renamed from: d */
    private final int f10744d;

    /* renamed from: e */
    private final boolean f10745e;

    public C5272q1(ComponentName componentName, int i10) {
        this.f10741a = null;
        this.f10742b = null;
        C5276s.m13324j(componentName);
        this.f10743c = componentName;
        this.f10744d = 4225;
        this.f10745e = false;
    }

    public C5272q1(String str, String str2, int i10, boolean z10) {
        C5276s.m13320f(str);
        this.f10741a = str;
        C5276s.m13320f(str2);
        this.f10742b = str2;
        this.f10743c = null;
        this.f10744d = 4225;
        this.f10745e = z10;
    }

    /* renamed from: a */
    public final ComponentName m13308a() {
        return this.f10743c;
    }

    /* renamed from: b */
    public final Intent m13309b(Context context) {
        Bundle bundle;
        if (this.f10741a == null) {
            return new Intent().setComponent(this.f10743c);
        }
        if (this.f10745e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f10741a);
            try {
                bundle = context.getContentResolver().call(f10740f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f10741a)));
            }
        }
        return r2 == null ? new Intent(this.f10741a).setPackage(this.f10742b) : r2;
    }

    /* renamed from: c */
    public final String m13310c() {
        return this.f10742b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5272q1)) {
            return false;
        }
        C5272q1 c5272q1 = (C5272q1) obj;
        return C5270q.m13304b(this.f10741a, c5272q1.f10741a) && C5270q.m13304b(this.f10742b, c5272q1.f10742b) && C5270q.m13304b(this.f10743c, c5272q1.f10743c) && this.f10745e == c5272q1.f10745e;
    }

    public final int hashCode() {
        return C5270q.m13305c(this.f10741a, this.f10742b, this.f10743c, 4225, Boolean.valueOf(this.f10745e));
    }

    public final String toString() {
        String str = this.f10741a;
        if (str != null) {
            return str;
        }
        C5276s.m13324j(this.f10743c);
        return this.f10743c.flattenToString();
    }
}
