package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10024a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10025b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10026c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10027d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y4 f10028e;

    private c5(y4 y4Var, String str, long j10) {
        this.f10028e = y4Var;
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.a(j10 > 0);
        this.f10024a = str + ":start";
        this.f10025b = str + ":count";
        this.f10026c = str + ":value";
        this.f10027d = j10;
    }

    private final long c() {
        return this.f10028e.A().getLong(this.f10024a, 0L);
    }

    private final void d() {
        this.f10028e.i();
        long a10 = this.f10028e.zzb().a();
        SharedPreferences.Editor edit = this.f10028e.A().edit();
        edit.remove(this.f10025b);
        edit.remove(this.f10026c);
        edit.putLong(this.f10024a, a10);
        edit.apply();
    }

    public final Pair<String, Long> a() {
        long abs;
        this.f10028e.i();
        this.f10028e.i();
        long c10 = c();
        if (c10 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c10 - this.f10028e.zzb().a());
        }
        long j10 = this.f10027d;
        if (abs < j10) {
            return null;
        }
        if (abs > (j10 << 1)) {
            d();
            return null;
        }
        String string = this.f10028e.A().getString(this.f10026c, null);
        long j11 = this.f10028e.A().getLong(this.f10025b, 0L);
        d();
        return (string == null || j11 <= 0) ? y4.f10836z : new Pair<>(string, Long.valueOf(j11));
    }

    public final void b(String str, long j10) {
        this.f10028e.i();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f10028e.A().getLong(this.f10025b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f10028e.A().edit();
            edit.putString(this.f10026c, str);
            edit.putLong(this.f10025b, 1L);
            edit.apply();
            return;
        }
        long j12 = j11 + 1;
        boolean z10 = (this.f10028e.f().P0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = this.f10028e.A().edit();
        if (z10) {
            edit2.putString(this.f10026c, str);
        }
        edit2.putLong(this.f10025b, j12);
        edit2.apply();
    }
}
