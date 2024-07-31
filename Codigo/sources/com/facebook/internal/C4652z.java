package com.facebook.internal;

import kotlin.jvm.internal.C9322n;
import p450xk.C12524p;

/* renamed from: com.facebook.internal.z */
/* loaded from: classes.dex */
public final class C4652z {

    /* renamed from: a */
    public static final C4652z f8866a = new C4652z();

    /* renamed from: b */
    private static volatile String f8867b;

    private C4652z() {
    }

    /* renamed from: a */
    public static final String m11468a() {
        return f8867b;
    }

    /* renamed from: b */
    public static final boolean m11469b() {
        boolean m41031E;
        String str = f8867b;
        Boolean bool = null;
        if (str != null) {
            m41031E = C12524p.m41031E(str, "Unity.", false, 2, null);
            bool = Boolean.valueOf(m41031E);
        }
        return C9322n.m27777a(bool, Boolean.TRUE);
    }
}
