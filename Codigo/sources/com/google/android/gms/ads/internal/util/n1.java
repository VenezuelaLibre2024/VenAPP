package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: b, reason: collision with root package name */
    private static n1 f9019b;

    /* renamed from: a, reason: collision with root package name */
    String f9020a;

    private n1() {
    }

    public static n1 a() {
        if (f9019b == null) {
            f9019b = new n1();
        }
        return f9019b;
    }

    public final void b(Context context) {
        u1.a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f9020a)) {
            Context d10 = ca.k.d(context);
            if (!la.e.a()) {
                if (d10 == null) {
                    d10 = null;
                }
                this.f9020a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (d10 == null) {
                putString.apply();
            } else {
                la.s.a(context, putString, "admob_user_agent");
            }
            this.f9020a = defaultUserAgent;
        }
        u1.a("User agent is updated.");
    }
}
