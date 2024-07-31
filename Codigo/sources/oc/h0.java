package oc;

import com.google.android.gms.internal.p002firebaseauthapi.zzxw;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ga.a f22393a = new ga.a("GetTokenResultFactory", new String[0]);

    public static com.google.firebase.auth.c0 a(String str) {
        Map hashMap;
        try {
            hashMap = j0.b(str);
        } catch (zzxw e10) {
            f22393a.b("Error parsing token claims", e10, new Object[0]);
            hashMap = new HashMap();
        }
        return new com.google.firebase.auth.c0(str, hashMap);
    }
}
