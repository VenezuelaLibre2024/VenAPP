package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzat;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.google.firebase.auth.f */
/* loaded from: classes.dex */
public class C6064f {

    /* renamed from: g */
    private static final zzat<String, Integer> f12886g;

    /* renamed from: a */
    private final String f12887a;

    /* renamed from: b */
    private final String f12888b;

    /* renamed from: c */
    private final String f12889c;

    /* renamed from: d */
    private final String f12890d;

    /* renamed from: e */
    private final String f12891e;

    /* renamed from: f */
    private final String f12892f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f12886g = zzat.zza(hashMap);
    }

    private C6064f(String str) {
        String m16520e = m16520e(str, "apiKey");
        String m16520e2 = m16520e(str, "oobCode");
        String m16520e3 = m16520e(str, "mode");
        if (m16520e == null || m16520e2 == null || m16520e3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f12887a = C5276s.m13320f(m16520e);
        this.f12888b = C5276s.m13320f(m16520e2);
        this.f12889c = C5276s.m13320f(m16520e3);
        this.f12890d = m16520e(str, "continueUrl");
        this.f12891e = m16520e(str, "languageCode");
        this.f12892f = m16520e(str, "tenantId");
    }

    /* renamed from: c */
    public static C6064f m16519c(String str) {
        C5276s.m13320f(str);
        try {
            return new C6064f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static String m16520e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(C5276s.m13320f(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String m16521a() {
        return this.f12888b;
    }

    /* renamed from: b */
    public int m16522b() {
        zzat<String, Integer> zzatVar = f12886g;
        if (zzatVar.containsKey(this.f12889c)) {
            return zzatVar.get(this.f12889c).intValue();
        }
        return 3;
    }

    /* renamed from: d */
    public final String m16523d() {
        return this.f12892f;
    }
}
