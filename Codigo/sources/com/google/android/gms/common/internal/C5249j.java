package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.j */
/* loaded from: classes.dex */
public final class C5249j {

    /* renamed from: a */
    private final String f10706a;

    /* renamed from: b */
    private final String f10707b;

    public C5249j(String str) {
        this(str, null);
    }

    public C5249j(String str, String str2) {
        C5276s.m13325k(str, "log tag cannot be null");
        C5276s.m13317c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f10706a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f10707b = null;
        } else {
            this.f10707b = str2;
        }
    }

    /* renamed from: i */
    private final String m13283i(String str) {
        String str2 = this.f10707b;
        return str2 == null ? str : str2.concat(str);
    }

    /* renamed from: a */
    public boolean m13284a(int i10) {
        return Log.isLoggable(this.f10706a, i10);
    }

    /* renamed from: b */
    public void m13285b(String str, String str2) {
        if (m13284a(3)) {
            Log.d(str, m13283i(str2));
        }
    }

    /* renamed from: c */
    public void m13286c(String str, String str2) {
        if (m13284a(6)) {
            Log.e(str, m13283i(str2));
        }
    }

    /* renamed from: d */
    public void m13287d(String str, String str2, Throwable th2) {
        if (m13284a(6)) {
            Log.e(str, m13283i(str2), th2);
        }
    }

    /* renamed from: e */
    public void m13288e(String str, String str2) {
        if (m13284a(4)) {
            Log.i(str, m13283i(str2));
        }
    }

    /* renamed from: f */
    public void m13289f(String str, String str2) {
        if (m13284a(2)) {
            Log.v(str, m13283i(str2));
        }
    }

    /* renamed from: g */
    public void m13290g(String str, String str2) {
        if (m13284a(5)) {
            Log.w(str, m13283i(str2));
        }
    }

    /* renamed from: h */
    public void m13291h(String str, String str2, Throwable th2) {
        if (m13284a(5)) {
            Log.w(str, m13283i(str2), th2);
        }
    }
}
