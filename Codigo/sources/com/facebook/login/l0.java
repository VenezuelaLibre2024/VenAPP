package com.facebook.login;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f7960a = new l0();

    private l0() {
    }

    public static final boolean a(String str) {
        int T;
        if (str == null || str.length() == 0) {
            return false;
        }
        T = xk.q.T(str, ' ', 0, false, 6, null);
        return !(T >= 0);
    }
}
