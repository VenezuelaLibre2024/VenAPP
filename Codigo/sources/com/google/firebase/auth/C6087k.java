package com.google.firebase.auth;

import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.firebase.auth.k */
/* loaded from: classes.dex */
public class C6087k {
    /* renamed from: a */
    public static AbstractC6072h m16557a(String str, String str2) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        return new C6083j(str, str2);
    }

    /* renamed from: b */
    public static AbstractC6072h m16558b(String str, String str2) {
        if (C6083j.m16550y1(str2)) {
            return new C6083j(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
