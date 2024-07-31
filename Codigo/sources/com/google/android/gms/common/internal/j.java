package com.google.android.gms.common.internal;

import android.util.Log;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f9591a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9592b;

    public j(String str) {
        this(str, null);
    }

    public j(String str, String str2) {
        s.k(str, "log tag cannot be null");
        s.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f9591a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f9592b = null;
        } else {
            this.f9592b = str2;
        }
    }

    private final String i(String str) {
        String str2 = this.f9592b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f9591a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, i(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, i(str2));
        }
    }

    public void d(String str, String str2, Throwable th2) {
        if (a(6)) {
            Log.e(str, i(str2), th2);
        }
    }

    public void e(String str, String str2) {
        if (a(4)) {
            Log.i(str, i(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(2)) {
            Log.v(str, i(str2));
        }
    }

    public void g(String str, String str2) {
        if (a(5)) {
            Log.w(str, i(str2));
        }
    }

    public void h(String str, String str2, Throwable th2) {
        if (a(5)) {
            Log.w(str, i(str2), th2);
        }
    }
}
