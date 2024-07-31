package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzat;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public class f {

    /* renamed from: g */
    private static final zzat<String, Integer> f11671g;

    /* renamed from: a */
    private final String f11672a;

    /* renamed from: b */
    private final String f11673b;

    /* renamed from: c */
    private final String f11674c;

    /* renamed from: d */
    private final String f11675d;

    /* renamed from: e */
    private final String f11676e;

    /* renamed from: f */
    private final String f11677f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f11671g = zzat.zza(hashMap);
    }

    private f(String str) {
        String e10 = e(str, "apiKey");
        String e11 = e(str, "oobCode");
        String e12 = e(str, "mode");
        if (e10 == null || e11 == null || e12 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f11672a = com.google.android.gms.common.internal.s.f(e10);
        this.f11673b = com.google.android.gms.common.internal.s.f(e11);
        this.f11674c = com.google.android.gms.common.internal.s.f(e12);
        this.f11675d = e(str, "continueUrl");
        this.f11676e = e(str, "languageCode");
        this.f11677f = e(str, "tenantId");
    }

    public static f c(String str) {
        com.google.android.gms.common.internal.s.f(str);
        try {
            return new f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(com.google.android.gms.common.internal.s.f(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String a() {
        return this.f11673b;
    }

    public int b() {
        zzat<String, Integer> zzatVar = f11671g;
        if (zzatVar.containsKey(this.f11674c)) {
            return zzatVar.get(this.f11674c).intValue();
        }
        return 3;
    }

    public final String d() {
        return this.f11677f;
    }
}
