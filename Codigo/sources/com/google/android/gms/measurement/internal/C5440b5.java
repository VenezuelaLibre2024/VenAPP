package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
/* loaded from: classes2.dex */
public final class C5440b5 {

    /* renamed from: a */
    private final String f11098a;

    /* renamed from: b */
    private final boolean f11099b;

    /* renamed from: c */
    private boolean f11100c;

    /* renamed from: d */
    private boolean f11101d;

    /* renamed from: e */
    private final /* synthetic */ C5735y4 f11102e;

    public C5440b5(C5735y4 c5735y4, String str, boolean z10) {
        this.f11102e = c5735y4;
        C5276s.m13320f(str);
        this.f11098a = str;
        this.f11099b = z10;
    }

    /* renamed from: a */
    public final void m13639a(boolean z10) {
        SharedPreferences.Editor edit = this.f11102e.m14549A().edit();
        edit.putBoolean(this.f11098a, z10);
        edit.apply();
        this.f11101d = z10;
    }

    /* renamed from: b */
    public final boolean m13640b() {
        if (!this.f11100c) {
            this.f11100c = true;
            this.f11101d = this.f11102e.m14549A().getBoolean(this.f11098a, this.f11099b);
        }
        return this.f11101d;
    }
}
