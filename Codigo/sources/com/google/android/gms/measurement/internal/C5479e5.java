package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.measurement.internal.e5 */
/* loaded from: classes2.dex */
public final class C5479e5 {

    /* renamed from: a */
    private final String f11317a;

    /* renamed from: b */
    private final String f11318b;

    /* renamed from: c */
    private boolean f11319c;

    /* renamed from: d */
    private String f11320d;

    /* renamed from: e */
    private final /* synthetic */ C5735y4 f11321e;

    public C5479e5(C5735y4 c5735y4, String str, String str2) {
        this.f11321e = c5735y4;
        C5276s.m13320f(str);
        this.f11317a = str;
        this.f11318b = null;
    }

    /* renamed from: a */
    public final String m13877a() {
        if (!this.f11319c) {
            this.f11319c = true;
            this.f11320d = this.f11321e.m14549A().getString(this.f11317a, null);
        }
        return this.f11320d;
    }

    /* renamed from: b */
    public final void m13878b(String str) {
        SharedPreferences.Editor edit = this.f11321e.m14549A().edit();
        edit.putString(this.f11317a, str);
        edit.apply();
        this.f11320d = str;
    }
}
