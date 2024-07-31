package com.google.firebase.auth;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import p272oc.C9875o;

/* renamed from: com.google.firebase.auth.x0 */
/* loaded from: classes.dex */
public final class C6140x0 {
    /* renamed from: a */
    public static Task<InterfaceC6146z0> m16625a(AbstractC6092l0 abstractC6092l0) {
        C5276s.m13324j(abstractC6092l0);
        C9875o c9875o = (C9875o) abstractC6092l0;
        return FirebaseAuth.getInstance(c9875o.m29567u1().mo16447Q1()).m16383X(c9875o);
    }

    /* renamed from: b */
    public static C6136w0 m16626b(InterfaceC6146z0 interfaceC6146z0, String str) {
        return new C6136w0((String) C5276s.m13324j(str), (InterfaceC6146z0) C5276s.m13324j(interfaceC6146z0), null);
    }

    /* renamed from: c */
    public static C6136w0 m16627c(String str, String str2) {
        return new C6136w0((String) C5276s.m13324j(str2), null, (String) C5276s.m13324j(str));
    }
}
