package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.internal.c0;
import com.facebook.internal.n0;
import i4.q0;
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
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f7601f = new a(null);

    /* renamed from: r, reason: collision with root package name */
    private static final HashSet<String> f7602r = new HashSet<>();
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f7603a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7604b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7605c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7606d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7607e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                kotlin.jvm.internal.n.d(forName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(forName);
                kotlin.jvm.internal.n.d(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                kotlin.jvm.internal.n.d(digest, "digest.digest()");
                return q4.g.c(digest);
            } catch (UnsupportedEncodingException e10) {
                n0.j0("Failed to generate checksum: ", e10);
                return "1";
            } catch (NoSuchAlgorithmException e11) {
                n0.j0("Failed to generate checksum: ", e11);
                return "0";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            boolean contains;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (d.f7602r) {
                        contains = d.f7602r.contains(str);
                        ck.v vVar = ck.v.f7137a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new xk.f("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").a(str)) {
                        synchronized (d.f7602r) {
                            d.f7602r.add(str);
                        }
                        return;
                    } else {
                        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                        String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
                        throw new i4.r(format);
                    }
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            kotlin.jvm.internal.a0 a0Var2 = kotlin.jvm.internal.a0.f20743a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            kotlin.jvm.internal.n.d(format2, "java.lang.String.format(locale, format, *args)");
            throw new i4.r(format2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        public static final a f7608e = new a(null);
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: a, reason: collision with root package name */
        private final String f7609a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f7610b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f7611c;

        /* renamed from: d, reason: collision with root package name */
        private final String f7612d;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(String jsonString, boolean z10, boolean z11, String str) {
            kotlin.jvm.internal.n.e(jsonString, "jsonString");
            this.f7609a = jsonString;
            this.f7610b = z10;
            this.f7611c = z11;
            this.f7612d = str;
        }

        private final Object readResolve() {
            return new d(this.f7609a, this.f7610b, this.f7611c, this.f7612d, null);
        }
    }

    public d(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid) {
        kotlin.jvm.internal.n.e(contextName, "contextName");
        kotlin.jvm.internal.n.e(eventName, "eventName");
        this.f7604b = z10;
        this.f7605c = z11;
        this.f7606d = eventName;
        this.f7603a = d(contextName, eventName, d10, bundle, uuid);
        this.f7607e = b();
    }

    private d(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f7603a = jSONObject;
        this.f7604b = z10;
        String optString = jSONObject.optString("_eventName");
        kotlin.jvm.internal.n.d(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f7606d = optString;
        this.f7607e = str2;
        this.f7605c = z11;
    }

    public /* synthetic */ d(String str, boolean z10, boolean z11, String str2, kotlin.jvm.internal.g gVar) {
        this(str, z10, z11, str2);
    }

    private final String b() {
        a aVar = f7601f;
        String jSONObject = this.f7603a.toString();
        kotlin.jvm.internal.n.d(jSONObject, "jsonObject.toString()");
        return aVar.c(jSONObject);
    }

    private final JSONObject d(String str, String str2, Double d10, Bundle bundle, UUID uuid) {
        a aVar = f7601f;
        aVar.d(str2);
        JSONObject jSONObject = new JSONObject();
        String e10 = t4.a.e(str2);
        if (kotlin.jvm.internal.n.a(e10, str2)) {
            e10 = p4.e.d(str2);
        }
        jSONObject.put("_eventName", e10);
        jSONObject.put("_eventName_md5", aVar.c(e10));
        jSONObject.put("_logTime", System.currentTimeMillis() / AdError.NETWORK_ERROR_CODE);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> i10 = i(bundle);
            for (String str3 : i10.keySet()) {
                jSONObject.put(str3, i10.get(str3));
            }
        }
        if (d10 != null) {
            jSONObject.put("_valueToSum", d10.doubleValue());
        }
        if (this.f7605c) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f7604b) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            c0.a aVar2 = com.facebook.internal.c0.f7719e;
            q0 q0Var = q0.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.n.d(jSONObject2, "eventObject.toString()");
            aVar2.c(q0Var, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    private final Map<String, String> i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String key : bundle.keySet()) {
            a aVar = f7601f;
            kotlin.jvm.internal.n.d(key, "key");
            aVar.d(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
                throw new i4.r(format);
            }
            hashMap.put(key, obj.toString());
        }
        if (!p4.d.f22767a.f(bundle)) {
            p4.f fVar = p4.f.f22775a;
            p4.f.c(hashMap, this.f7606d);
        }
        p4.b.c(hashMap);
        t4.a aVar2 = t4.a.f25778a;
        t4.a.f(hashMap, this.f7606d);
        n4.a aVar3 = n4.a.f21794a;
        n4.a.c(hashMap, this.f7606d);
        return hashMap;
    }

    private final Object writeReplace() {
        String jSONObject = this.f7603a.toString();
        kotlin.jvm.internal.n.d(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.f7604b, this.f7605c, this.f7607e);
    }

    public final boolean c() {
        return this.f7604b;
    }

    public final JSONObject e() {
        return this.f7603a;
    }

    public final String f() {
        return this.f7606d;
    }

    public final boolean g() {
        if (this.f7607e == null) {
            return true;
        }
        return kotlin.jvm.internal.n.a(b(), this.f7607e);
    }

    public final boolean h() {
        return this.f7604b;
    }

    public String toString() {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f7603a.optString("_eventName"), Boolean.valueOf(this.f7604b), this.f7603a.toString()}, 3));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
