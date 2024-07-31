package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
/* loaded from: classes2.dex */
public final class C5466d5 {

    /* renamed from: a */
    private final String f11182a;

    /* renamed from: b */
    private final long f11183b;

    /* renamed from: c */
    private boolean f11184c;

    /* renamed from: d */
    private long f11185d;

    /* renamed from: e */
    private final /* synthetic */ C5735y4 f11186e;

    public C5466d5(C5735y4 c5735y4, String str, long j10) {
        this.f11186e = c5735y4;
        C5276s.m13320f(str);
        this.f11182a = str;
        this.f11183b = j10;
    }

    /* renamed from: a */
    public final long m13720a() {
        if (!this.f11184c) {
            this.f11184c = true;
            this.f11185d = this.f11186e.m14549A().getLong(this.f11182a, this.f11183b);
        }
        return this.f11185d;
    }

    /* renamed from: b */
    public final void m13721b(long j10) {
        SharedPreferences.Editor edit = this.f11186e.m14549A().edit();
        edit.putLong(this.f11182a, j10);
        edit.apply();
        this.f11185d = j10;
    }
}
