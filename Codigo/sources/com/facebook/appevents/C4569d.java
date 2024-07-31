package com.facebook.appevents;

import android.os.Bundle;
import ck.C2037v;
import com.facebook.ads.AdError;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4634n0;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONObject;
import p152i4.C7824r;
import p152i4.EnumC7823q0;
import p247n4.C9661a;
import p287p4.C10055b;
import p287p4.C10057d;
import p287p4.C10058e;
import p287p4.C10059f;
import p303q4.C10267g;
import p359t4.C10986a;
import p450xk.C12514f;

/* renamed from: com.facebook.appevents.d */
/* loaded from: classes.dex */
public final class C4569d implements Serializable {

    /* renamed from: f */
    public static final a f8576f = new a(null);

    /* renamed from: r */
    private static final HashSet<String> f8577r = new HashSet<>();
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final JSONObject f8578a;

    /* renamed from: b */
    private final boolean f8579b;

    /* renamed from: c */
    private final boolean f8580c;

    /* renamed from: d */
    private final String f8581d;

    /* renamed from: e */
    private final String f8582e;

    /* renamed from: com.facebook.appevents.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final String m10952c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                C9322n.m27780d(forName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(forName);
                C9322n.m27780d(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                C9322n.m27780d(digest, "digest.digest()");
                return C10267g.m30746c(digest);
            } catch (UnsupportedEncodingException e10) {
                C4634n0.m11312j0("Failed to generate checksum: ", e10);
                return "1";
            } catch (NoSuchAlgorithmException e11) {
                C4634n0.m11312j0("Failed to generate checksum: ", e11);
                return "0";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m10953d(String str) {
            boolean contains;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (C4569d.f8577r) {
                        contains = C4569d.f8577r.contains(str);
                        C2037v c2037v = C2037v.f8089a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new C12514f("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").m40969a(str)) {
                        synchronized (C4569d.f8577r) {
                            C4569d.f8577r.add(str);
                        }
                        return;
                    } else {
                        C9308a0 c9308a0 = C9308a0.f22565a;
                        String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
                        throw new C7824r(format);
                    }
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            C9308a0 c9308a02 = C9308a0.f22565a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            C9322n.m27780d(format2, "java.lang.String.format(locale, format, *args)");
            throw new C7824r(format2);
        }
    }

    /* renamed from: com.facebook.appevents.d$b */
    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: e */
        public static final a f8583e = new a(null);
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: a */
        private final String f8584a;

        /* renamed from: b */
        private final boolean f8585b;

        /* renamed from: c */
        private final boolean f8586c;

        /* renamed from: d */
        private final String f8587d;

        /* renamed from: com.facebook.appevents.d$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }
        }

        public b(String jsonString, boolean z10, boolean z11, String str) {
            C9322n.m27781e(jsonString, "jsonString");
            this.f8584a = jsonString;
            this.f8585b = z10;
            this.f8586c = z11;
            this.f8587d = str;
        }

        private final Object readResolve() {
            return new C4569d(this.f8584a, this.f8585b, this.f8586c, this.f8587d, null);
        }
    }

    public C4569d(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid) {
        C9322n.m27781e(contextName, "contextName");
        C9322n.m27781e(eventName, "eventName");
        this.f8579b = z10;
        this.f8580c = z11;
        this.f8581d = eventName;
        this.f8578a = m10943d(contextName, eventName, d10, bundle, uuid);
        this.f8582e = m10942b();
    }

    private C4569d(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f8578a = jSONObject;
        this.f8579b = z10;
        String optString = jSONObject.optString("_eventName");
        C9322n.m27780d(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f8581d = optString;
        this.f8582e = str2;
        this.f8580c = z11;
    }

    public /* synthetic */ C4569d(String str, boolean z10, boolean z11, String str2, C9315g c9315g) {
        this(str, z10, z11, str2);
    }

    /* renamed from: b */
    private final String m10942b() {
        a aVar = f8576f;
        String jSONObject = this.f8578a.toString();
        C9322n.m27780d(jSONObject, "jsonObject.toString()");
        return aVar.m10952c(jSONObject);
    }

    /* renamed from: d */
    private final JSONObject m10943d(String str, String str2, Double d10, Bundle bundle, UUID uuid) {
        a aVar = f8576f;
        aVar.m10953d(str2);
        JSONObject jSONObject = new JSONObject();
        String m33542e = C10986a.m33542e(str2);
        if (C9322n.m27777a(m33542e, str2)) {
            m33542e = C10058e.m30000d(str2);
        }
        jSONObject.put("_eventName", m33542e);
        jSONObject.put("_eventName_md5", aVar.m10952c(m33542e));
        jSONObject.put("_logTime", System.currentTimeMillis() / AdError.NETWORK_ERROR_CODE);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> m10944i = m10944i(bundle);
            for (String str3 : m10944i.keySet()) {
                jSONObject.put(str3, m10944i.get(str3));
            }
        }
        if (d10 != null) {
            jSONObject.put("_valueToSum", d10.doubleValue());
        }
        if (this.f8580c) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f8579b) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C4612c0.a aVar2 = C4612c0.f8694e;
            EnumC7823q0 enumC7823q0 = EnumC7823q0.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            C9322n.m27780d(jSONObject2, "eventObject.toString()");
            aVar2.m11139c(enumC7823q0, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final Map<String, String> m10944i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String key : bundle.keySet()) {
            a aVar = f8576f;
            C9322n.m27780d(key, "key");
            aVar.m10953d(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                C9308a0 c9308a0 = C9308a0.f22565a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                C9322n.m27780d(format, "java.lang.String.format(format, *args)");
                throw new C7824r(format);
            }
            hashMap.put(key, obj.toString());
        }
        if (!C10057d.f24700a.m29995f(bundle)) {
            C10059f c10059f = C10059f.f24708a;
            C10059f.m30003c(hashMap, this.f8581d);
        }
        C10055b.m29978c(hashMap);
        C10986a c10986a = C10986a.f27922a;
        C10986a.m33543f(hashMap, this.f8581d);
        C9661a c9661a = C9661a.f23727a;
        C9661a.m28958c(hashMap, this.f8581d);
        return hashMap;
    }

    private final Object writeReplace() {
        String jSONObject = this.f8578a.toString();
        C9322n.m27780d(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.f8579b, this.f8580c, this.f8582e);
    }

    /* renamed from: c */
    public final boolean m10945c() {
        return this.f8579b;
    }

    /* renamed from: e */
    public final JSONObject m10946e() {
        return this.f8578a;
    }

    /* renamed from: f */
    public final String m10947f() {
        return this.f8581d;
    }

    /* renamed from: g */
    public final boolean m10948g() {
        if (this.f8582e == null) {
            return true;
        }
        return C9322n.m27777a(m10942b(), this.f8582e);
    }

    /* renamed from: h */
    public final boolean m10949h() {
        return this.f8579b;
    }

    public String toString() {
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f8578a.optString("_eventName"), Boolean.valueOf(this.f8579b), this.f8578a.toString()}, 3));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
