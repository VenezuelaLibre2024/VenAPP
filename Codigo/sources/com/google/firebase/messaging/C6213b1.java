package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5270q;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.messaging.b1 */
/* loaded from: classes.dex */
final class C6213b1 {

    /* renamed from: d */
    private static final Pattern f13271d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f13272a;

    /* renamed from: b */
    private final String f13273b;

    /* renamed from: c */
    private final String f13274c;

    private C6213b1(String str, String str2) {
        this.f13272a = m16943d(str2, str);
        this.f13273b = str;
        this.f13274c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C6213b1 m16942a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C6213b1(split[0], split[1]);
    }

    /* renamed from: d */
    private static String m16943d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f13271d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    /* renamed from: f */
    public static C6213b1 m16944f(String str) {
        return new C6213b1("S", str);
    }

    /* renamed from: g */
    public static C6213b1 m16945g(String str) {
        return new C6213b1("U", str);
    }

    /* renamed from: b */
    public String m16946b() {
        return this.f13273b;
    }

    /* renamed from: c */
    public String m16947c() {
        return this.f13272a;
    }

    /* renamed from: e */
    public String m16948e() {
        return this.f13274c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6213b1)) {
            return false;
        }
        C6213b1 c6213b1 = (C6213b1) obj;
        return this.f13272a.equals(c6213b1.f13272a) && this.f13273b.equals(c6213b1.f13273b);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f13273b, this.f13272a);
    }
}
