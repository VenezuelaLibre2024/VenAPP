package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
/* loaded from: classes2.dex */
public final class C5453c5 {

    /* renamed from: a */
    private final String f11144a;

    /* renamed from: b */
    private final String f11145b;

    /* renamed from: c */
    private final String f11146c;

    /* renamed from: d */
    private final long f11147d;

    /* renamed from: e */
    private final /* synthetic */ C5735y4 f11148e;

    private C5453c5(C5735y4 c5735y4, String str, long j10) {
        this.f11148e = c5735y4;
        C5276s.m13320f(str);
        C5276s.m13315a(j10 > 0);
        this.f11144a = str + ":start";
        this.f11145b = str + ":count";
        this.f11146c = str + ":value";
        this.f11147d = j10;
    }

    /* renamed from: c */
    private final long m13715c() {
        return this.f11148e.m14549A().getLong(this.f11144a, 0L);
    }

    /* renamed from: d */
    private final void m13716d() {
        this.f11148e.mo13687i();
        long mo28130a = this.f11148e.zzb().mo28130a();
        SharedPreferences.Editor edit = this.f11148e.m14549A().edit();
        edit.remove(this.f11145b);
        edit.remove(this.f11146c);
        edit.putLong(this.f11144a, mo28130a);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair<String, Long> m13717a() {
        long abs;
        this.f11148e.mo13687i();
        this.f11148e.mo13687i();
        long m13715c = m13715c();
        if (m13715c == 0) {
            m13716d();
            abs = 0;
        } else {
            abs = Math.abs(m13715c - this.f11148e.zzb().mo28130a());
        }
        long j10 = this.f11147d;
        if (abs < j10) {
            return null;
        }
        if (abs > (j10 << 1)) {
            m13716d();
            return null;
        }
        String string = this.f11148e.m14549A().getString(this.f11146c, null);
        long j11 = this.f11148e.m14549A().getLong(this.f11145b, 0L);
        m13716d();
        return (string == null || j11 <= 0) ? C5735y4.f12051z : new Pair<>(string, Long.valueOf(j11));
    }

    /* renamed from: b */
    public final void m13718b(String str, long j10) {
        this.f11148e.mo13687i();
        if (m13715c() == 0) {
            m13716d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f11148e.m14549A().getLong(this.f11145b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f11148e.m14549A().edit();
            edit.putString(this.f11146c, str);
            edit.putLong(this.f11145b, 1L);
            edit.apply();
            return;
        }
        long j12 = j11 + 1;
        boolean z10 = (this.f11148e.mo13681f().m14026P0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = this.f11148e.m14549A().edit();
        if (z10) {
            edit2.putString(this.f11146c, str);
        }
        edit2.putLong(this.f11145b, j12);
        edit2.apply();
    }
}
