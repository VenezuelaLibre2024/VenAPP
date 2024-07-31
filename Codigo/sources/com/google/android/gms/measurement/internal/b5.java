package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f9978a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9979b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9980c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9981d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y4 f9982e;

    public b5(y4 y4Var, String str, boolean z10) {
        this.f9982e = y4Var;
        com.google.android.gms.common.internal.s.f(str);
        this.f9978a = str;
        this.f9979b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f9982e.A().edit();
        edit.putBoolean(this.f9978a, z10);
        edit.apply();
        this.f9981d = z10;
    }

    public final boolean b() {
        if (!this.f9980c) {
            this.f9980c = true;
            this.f9981d = this.f9982e.A().getBoolean(this.f9978a, this.f9979b);
        }
        return this.f9981d;
    }
}
