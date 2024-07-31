package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import ca.C1912k;
import la.C9460e;
import la.C9474s;

/* renamed from: com.google.android.gms.ads.internal.util.n1 */
/* loaded from: classes.dex */
public final class C5020n1 {

    /* renamed from: b */
    private static C5020n1 f10118b;

    /* renamed from: a */
    String f10119a;

    private C5020n1() {
    }

    /* renamed from: a */
    public static C5020n1 m12701a() {
        if (f10118b == null) {
            f10118b = new C5020n1();
        }
        return f10118b;
    }

    /* renamed from: b */
    public final void m12702b(Context context) {
        C5047u1.m12726a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f10119a)) {
            Context m10098d = C1912k.m10098d(context);
            if (!C9460e.m28129a()) {
                if (m10098d == null) {
                    m10098d = null;
                }
                this.f10119a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (m10098d == null) {
                putString.apply();
            } else {
                C9474s.m28178a(context, putString, "admob_user_agent");
            }
            this.f10119a = defaultUserAgent;
        }
        C5047u1.m12726a("User agent is updated.");
    }
}
