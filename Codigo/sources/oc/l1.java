package oc;

import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.firebase.auth.d2;

/* loaded from: classes.dex */
public final class l1 {
    public static zzagt a(com.google.firebase.auth.h hVar, String str) {
        com.google.android.gms.common.internal.s.j(hVar);
        if (com.google.firebase.auth.f0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.f0.x1((com.google.firebase.auth.f0) hVar, str);
        }
        if (com.google.firebase.auth.l.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.l.x1((com.google.firebase.auth.l) hVar, str);
        }
        if (com.google.firebase.auth.a1.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.a1.x1((com.google.firebase.auth.a1) hVar, str);
        }
        if (com.google.firebase.auth.d0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.d0.x1((com.google.firebase.auth.d0) hVar, str);
        }
        if (com.google.firebase.auth.u0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.u0.x1((com.google.firebase.auth.u0) hVar, str);
        }
        if (d2.class.isAssignableFrom(hVar.getClass())) {
            return d2.A1((d2) hVar, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
