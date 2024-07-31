package p287p4;

import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;

/* renamed from: p4.e */
/* loaded from: classes.dex */
public final class C10058e {

    /* renamed from: b */
    private static boolean f24706b;

    /* renamed from: a */
    public static final C10058e f24705a = new C10058e();

    /* renamed from: c */
    private static Map<String, HashSet<String>> f24707c = new HashMap();

    private C10058e() {
    }

    /* renamed from: a */
    public static final void m29997a() {
        if (C0033a.m107d(C10058e.class)) {
            return;
        }
        try {
            f24705a.m29999c();
            if (!f24707c.isEmpty()) {
                f24706b = true;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10058e.class);
        }
    }

    /* renamed from: b */
    private final String m29998b(String str) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            for (String str2 : f24707c.keySet()) {
                HashSet<String> hashSet = f24707c.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: c */
    private final void m29999c() {
        int length;
        HashSet<String> m11317m;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4648v c4648v = C4648v.f8854a;
            int i10 = 0;
            C4641r m11457q = C4648v.m11457q(C7799e0.m23861m(), false);
            if (m11457q == null) {
                return;
            }
            try {
                f24707c = new HashMap();
                JSONArray m11384j = m11457q.m11384j();
                if (m11384j == null || m11384j.length() == 0 || (length = m11384j.length()) <= 0) {
                    return;
                }
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject = m11384j.getJSONObject(i10);
                    boolean has = jSONObject.has(Constants.KEY);
                    boolean has2 = jSONObject.has("value");
                    if (has && has2) {
                        String redactedString = jSONObject.getString(Constants.KEY);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (redactedString != null && (m11317m = C4634n0.m11317m(jSONArray)) != null) {
                            Map<String, HashSet<String>> map = f24707c;
                            C9322n.m27780d(redactedString, "redactedString");
                            map.put(redactedString, m11317m);
                        }
                    }
                    if (i11 >= length) {
                        return;
                    } else {
                        i10 = i11;
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: d */
    public static final String m30000d(String eventName) {
        if (C0033a.m107d(C10058e.class)) {
            return null;
        }
        try {
            C9322n.m27781e(eventName, "eventName");
            if (f24706b) {
                String m29998b = f24705a.m29998b(eventName);
                if (m29998b != null) {
                    return m29998b;
                }
            }
            return eventName;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10058e.class);
            return null;
        }
    }
}
