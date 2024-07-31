package p272oc;

import com.google.android.gms.internal.p498firebaseauthapi.zzxw;
import com.google.firebase.auth.C6053c0;
import ga.C7533a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: oc.h0 */
/* loaded from: classes.dex */
public final class C9855h0 {

    /* renamed from: a */
    private static final C7533a f24326a = new C7533a("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static C6053c0 m29540a(String str) {
        Map hashMap;
        try {
            hashMap = C9861j0.m29546b(str);
        } catch (zzxw e10) {
            f24326a.m22870b("Error parsing token claims", e10, new Object[0]);
            hashMap = new HashMap();
        }
        return new C6053c0(str, hashMap);
    }
}
