package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.r4 */
/* loaded from: classes2.dex */
public final class C5647r4 {

    /* renamed from: a */
    public String f11756a;

    /* renamed from: b */
    private String f11757b;

    /* renamed from: c */
    private long f11758c;

    /* renamed from: d */
    public Bundle f11759d;

    private C5647r4(String str, String str2, Bundle bundle, long j10) {
        this.f11756a = str;
        this.f11757b = str2;
        this.f11759d = bundle == null ? new Bundle() : bundle;
        this.f11758c = j10;
    }

    /* renamed from: b */
    public static C5647r4 m14258b(C5461d0 c5461d0) {
        return new C5647r4(c5461d0.f11174a, c5461d0.f11176c, c5461d0.f11175b.m14603w1(), c5461d0.f11177d);
    }

    /* renamed from: a */
    public final C5461d0 m14259a() {
        return new C5461d0(this.f11756a, new C5742z(new Bundle(this.f11759d)), this.f11757b, this.f11758c);
    }

    public final String toString() {
        return "origin=" + this.f11757b + ",name=" + this.f11756a + ",params=" + String.valueOf(this.f11759d);
    }
}
