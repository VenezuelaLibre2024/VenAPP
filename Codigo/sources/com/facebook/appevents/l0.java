package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.internal.n0;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: c */
    private static SharedPreferences f7647c;

    /* renamed from: a */
    public static final l0 f7645a = new l0();

    /* renamed from: b */
    private static final String f7646b = l0.class.getSimpleName();

    /* renamed from: d */
    private static final AtomicBoolean f7648d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final ConcurrentHashMap<String, String> f7649e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final ConcurrentHashMap<String, String> f7650f = new ConcurrentHashMap<>();

    private l0() {
    }

    public static final String b() {
        if (a5.a.d(l0.class)) {
            return null;
        }
        try {
            if (!f7648d.get()) {
                f7645a.d();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f7649e);
            hashMap.putAll(f7645a.c());
            return n0.m0(hashMap);
        } catch (Throwable th2) {
            a5.a.b(th2, l0.class);
            return null;
        }
    }

    private final Map<String, String> c() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> b10 = j4.d.f19743d.b();
            for (String str : f7650f.keySet()) {
                if (b10.contains(str)) {
                    hashMap.put(str, f7650f.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final synchronized void d() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f7648d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(i4.e0.l());
            kotlin.jvm.internal.n.d(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            f7647c = defaultSharedPreferences;
            if (defaultSharedPreferences == null) {
                kotlin.jvm.internal.n.p("sharedPreferences");
                throw null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = f7647c;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.n.p("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f7649e.putAll(n0.i0(string));
            f7650f.putAll(n0.i0(string2));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void e() {
        if (a5.a.d(l0.class)) {
            return;
        }
        try {
            if (f7648d.get()) {
                return;
            }
            f7645a.d();
        } catch (Throwable th2) {
            a5.a.b(th2, l0.class);
        }
    }

    private final String f(String str, String str2) {
        String str3;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.n.f(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String obj = str2.subSequence(i10, length + 1).toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj.toLowerCase();
            kotlin.jvm.internal.n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (kotlin.jvm.internal.n.a("em", str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(f7646b, "Setting email failure: this is not a valid email address");
                return "";
            }
            if (kotlin.jvm.internal.n.a("ph", str)) {
                return new xk.f("[^0-9]").b(lowerCase, "");
            }
            if (!kotlin.jvm.internal.n.a("ge", str)) {
                return lowerCase;
            }
            if (!(lowerCase.length() > 0)) {
                str3 = "";
            } else {
                if (lowerCase == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                str3 = lowerCase.substring(0, 1);
                kotlin.jvm.internal.n.d(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            if (!kotlin.jvm.internal.n.a("f", str3) && !kotlin.jvm.internal.n.a("m", str3)) {
                Log.e(f7646b, "Setting gender failure: the supported value for gender is f or m");
                return "";
            }
            return str3;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r4 = new java.lang.String[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.l0.g(java.util.Map):void");
    }

    private final void h(String str, String str2) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            i4.e0.t().execute(new Runnable() { // from class: com.facebook.appevents.k0

                /* renamed from: a */
                public final /* synthetic */ String f7643a;

                /* renamed from: b */
                public final /* synthetic */ String f7644b;

                public /* synthetic */ k0(String str3, String str22) {
                    r1 = str3;
                    r2 = str22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    l0.i(r1, r2);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void i(String key, String value) {
        if (a5.a.d(l0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(key, "$key");
            kotlin.jvm.internal.n.e(value, "$value");
            if (!f7648d.get()) {
                f7645a.d();
            }
            SharedPreferences sharedPreferences = f7647c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(key, value).apply();
            } else {
                kotlin.jvm.internal.n.p("sharedPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            a5.a.b(th2, l0.class);
        }
    }
}
