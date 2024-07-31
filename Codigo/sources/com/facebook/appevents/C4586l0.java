package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.internal.C4634n0;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;
import p172j4.C8983d;
import p450xk.C12514f;

/* renamed from: com.facebook.appevents.l0 */
/* loaded from: classes.dex */
public final class C4586l0 {

    /* renamed from: c */
    private static SharedPreferences f8622c;

    /* renamed from: a */
    public static final C4586l0 f8620a = new C4586l0();

    /* renamed from: b */
    private static final String f8621b = C4586l0.class.getSimpleName();

    /* renamed from: d */
    private static final AtomicBoolean f8623d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final ConcurrentHashMap<String, String> f8624e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final ConcurrentHashMap<String, String> f8625f = new ConcurrentHashMap<>();

    private C4586l0() {
    }

    /* renamed from: b */
    public static final String m11017b() {
        if (C0033a.m107d(C4586l0.class)) {
            return null;
        }
        try {
            if (!f8623d.get()) {
                f8620a.m11019d();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f8624e);
            hashMap.putAll(f8620a.m11018c());
            return C4634n0.m11318m0(hashMap);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4586l0.class);
            return null;
        }
    }

    /* renamed from: c */
    private final Map<String, String> m11018c() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> m26360b = C8983d.f21522d.m26360b();
            for (String str : f8625f.keySet()) {
                if (m26360b.contains(str)) {
                    hashMap.put(str, f8625f.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: d */
    private final synchronized void m11019d() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f8623d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C7799e0.m23860l());
            C9322n.m27780d(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            f8622c = defaultSharedPreferences;
            if (defaultSharedPreferences == null) {
                C9322n.m27792p("sharedPreferences");
                throw null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = f8622c;
            if (sharedPreferences == null) {
                C9322n.m27792p("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f8624e.putAll(C4634n0.m11310i0(string));
            f8625f.putAll(C4634n0.m11310i0(string2));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: e */
    public static final void m11020e() {
        if (C0033a.m107d(C4586l0.class)) {
            return;
        }
        try {
            if (f8623d.get()) {
                return;
            }
            f8620a.m11019d();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4586l0.class);
        }
    }

    /* renamed from: f */
    private final String m11021f(String str, String str2) {
        String str3;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = C9322n.m27782f(str2.charAt(!z10 ? i10 : length), 32) <= 0;
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
            C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (C9322n.m27777a("em", str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(f8621b, "Setting email failure: this is not a valid email address");
                return "";
            }
            if (C9322n.m27777a("ph", str)) {
                return new C12514f("[^0-9]").m40970b(lowerCase, "");
            }
            if (!C9322n.m27777a("ge", str)) {
                return lowerCase;
            }
            if (!(lowerCase.length() > 0)) {
                str3 = "";
            } else {
                if (lowerCase == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                str3 = lowerCase.substring(0, 1);
                C9322n.m27780d(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            if (!C9322n.m27777a("f", str3) && !C9322n.m27777a("m", str3)) {
                Log.e(f8621b, "Setting gender failure: the supported value for gender is f or m");
                return "";
            }
            return str3;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r4 = new java.lang.String[0];
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m11022g(java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C4586l0.m11022g(java.util.Map):void");
    }

    /* renamed from: h */
    private final void m11023h(final String str, final String str2) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C7799e0.m23868t().execute(new Runnable() { // from class: com.facebook.appevents.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C4586l0.m11024i(str, str2);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m11024i(String key, String value) {
        if (C0033a.m107d(C4586l0.class)) {
            return;
        }
        try {
            C9322n.m27781e(key, "$key");
            C9322n.m27781e(value, "$value");
            if (!f8623d.get()) {
                f8620a.m11019d();
            }
            SharedPreferences sharedPreferences = f8622c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(key, value).apply();
            } else {
                C9322n.m27792p("sharedPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4586l0.class);
        }
    }
}
