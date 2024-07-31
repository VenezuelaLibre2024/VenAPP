package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10145a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10146b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10147c;

    /* renamed from: d, reason: collision with root package name */
    private String f10148d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y4 f10149e;

    public e5(y4 y4Var, String str, String str2) {
        this.f10149e = y4Var;
        com.google.android.gms.common.internal.s.f(str);
        this.f10145a = str;
        this.f10146b = null;
    }

    public final String a() {
        if (!this.f10147c) {
            this.f10147c = true;
            this.f10148d = this.f10149e.A().getString(this.f10145a, null);
        }
        return this.f10148d;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f10149e.A().edit();
        edit.putString(this.f10145a, str);
        edit.apply();
        this.f10148d = str;
    }
}
