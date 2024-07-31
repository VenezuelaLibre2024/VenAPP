package ql;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f24232a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f24233b;

    public h(String scheme, Map<String, String> authParams) {
        String lowerCase;
        kotlin.jvm.internal.n.e(scheme, "scheme");
        kotlin.jvm.internal.n.e(authParams, "authParams");
        this.f24232a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                kotlin.jvm.internal.n.d(US, "US");
                lowerCase = key.toLowerCase(US);
                kotlin.jvm.internal.n.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.n.d(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f24233b = unmodifiableMap;
    }

    public final Charset a() {
        String str = this.f24233b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                kotlin.jvm.internal.n.d(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        kotlin.jvm.internal.n.d(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return this.f24233b.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM);
    }

    public final String c() {
        return this.f24232a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (kotlin.jvm.internal.n.a(hVar.f24232a, this.f24232a) && kotlin.jvm.internal.n.a(hVar.f24233b, this.f24233b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f24232a.hashCode()) * 31) + this.f24233b.hashCode();
    }

    public String toString() {
        return this.f24232a + " authParams=" + this.f24233b;
    }
}
