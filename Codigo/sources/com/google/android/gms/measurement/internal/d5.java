package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10062a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10063b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10064c;

    /* renamed from: d, reason: collision with root package name */
    private long f10065d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y4 f10066e;

    public d5(y4 y4Var, String str, long j10) {
        this.f10066e = y4Var;
        com.google.android.gms.common.internal.s.f(str);
        this.f10062a = str;
        this.f10063b = j10;
    }

    public final long a() {
        if (!this.f10064c) {
            this.f10064c = true;
            this.f10065d = this.f10066e.A().getLong(this.f10062a, this.f10063b);
        }
        return this.f10065d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f10066e.A().edit();
        edit.putLong(this.f10062a, j10);
        edit.apply();
        this.f10065d = j10;
    }
}
