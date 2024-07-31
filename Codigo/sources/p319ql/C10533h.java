package p319ql;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C9322n;

/* renamed from: ql.h */
/* loaded from: classes3.dex */
public final class C10533h {

    /* renamed from: a */
    private final String f26274a;

    /* renamed from: b */
    private final Map<String, String> f26275b;

    public C10533h(String scheme, Map<String, String> authParams) {
        String lowerCase;
        C9322n.m27781e(scheme, "scheme");
        C9322n.m27781e(authParams, "authParams");
        this.f26274a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                C9322n.m27780d(US, "US");
                lowerCase = key.toLowerCase(US);
                C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C9322n.m27780d(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f26275b = unmodifiableMap;
    }

    /* renamed from: a */
    public final Charset m31736a() {
        String str = this.f26275b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C9322n.m27780d(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        C9322n.m27780d(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    /* renamed from: b */
    public final String m31737b() {
        return this.f26275b.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM);
    }

    /* renamed from: c */
    public final String m31738c() {
        return this.f26274a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10533h) {
            C10533h c10533h = (C10533h) obj;
            if (C9322n.m27777a(c10533h.f26274a, this.f26274a) && C9322n.m27777a(c10533h.f26275b, this.f26275b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f26274a.hashCode()) * 31) + this.f26275b.hashCode();
    }

    public String toString() {
        return this.f26274a + " authParams=" + this.f26275b;
    }
}
