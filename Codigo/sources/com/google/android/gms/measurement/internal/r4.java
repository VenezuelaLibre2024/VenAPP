package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public String f10569a;

    /* renamed from: b, reason: collision with root package name */
    private String f10570b;

    /* renamed from: c, reason: collision with root package name */
    private long f10571c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f10572d;

    private r4(String str, String str2, Bundle bundle, long j10) {
        this.f10569a = str;
        this.f10570b = str2;
        this.f10572d = bundle == null ? new Bundle() : bundle;
        this.f10571c = j10;
    }

    public static r4 b(d0 d0Var) {
        return new r4(d0Var.f10054a, d0Var.f10056c, d0Var.f10055b.w1(), d0Var.f10057d);
    }

    public final d0 a() {
        return new d0(this.f10569a, new z(new Bundle(this.f10572d)), this.f10570b, this.f10571c);
    }

    public final String toString() {
        return "origin=" + this.f10570b + ",name=" + this.f10569a + ",params=" + String.valueOf(this.f10572d);
    }
}
