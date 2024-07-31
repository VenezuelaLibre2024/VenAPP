package com.facebook.internal;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f7886a = new z();

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f7887b;

    private z() {
    }

    public static final String a() {
        return f7887b;
    }

    public static final boolean b() {
        boolean E;
        String str = f7887b;
        Boolean bool = null;
        if (str != null) {
            E = xk.p.E(str, "Unity.", false, 2, null);
            bool = Boolean.valueOf(E);
        }
        return kotlin.jvm.internal.n.a(bool, Boolean.TRUE);
    }
}
