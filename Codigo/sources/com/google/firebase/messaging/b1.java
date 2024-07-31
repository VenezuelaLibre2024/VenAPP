package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class b1 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f12056d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f12057a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12058b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12059c;

    private b1(String str, String str2) {
        this.f12057a = d(str2, str);
        this.f12058b = str;
        this.f12059c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b1 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new b1(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f12056d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static b1 f(String str) {
        return new b1("S", str);
    }

    public static b1 g(String str) {
        return new b1("U", str);
    }

    public String b() {
        return this.f12058b;
    }

    public String c() {
        return this.f12057a;
    }

    public String e() {
        return this.f12059c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f12057a.equals(b1Var.f12057a) && this.f12058b.equals(b1Var.f12058b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f12058b, this.f12057a);
    }
}
