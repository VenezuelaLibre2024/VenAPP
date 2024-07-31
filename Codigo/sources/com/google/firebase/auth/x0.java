package com.google.firebase.auth;

import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class x0 {
    public static Task<z0> a(l0 l0Var) {
        com.google.android.gms.common.internal.s.j(l0Var);
        oc.o oVar = (oc.o) l0Var;
        return FirebaseAuth.getInstance(oVar.u1().Q1()).X(oVar);
    }

    public static w0 b(z0 z0Var, String str) {
        return new w0((String) com.google.android.gms.common.internal.s.j(str), (z0) com.google.android.gms.common.internal.s.j(z0Var), null);
    }

    public static w0 c(String str, String str2) {
        return new w0((String) com.google.android.gms.common.internal.s.j(str2), null, (String) com.google.android.gms.common.internal.s.j(str));
    }
}
