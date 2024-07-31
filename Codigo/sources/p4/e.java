package p4;

import com.facebook.internal.n0;
import com.facebook.internal.r;
import com.facebook.internal.v;
import i4.e0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b */
    private static boolean f22773b;

    /* renamed from: a */
    public static final e f22772a = new e();

    /* renamed from: c */
    private static Map<String, HashSet<String>> f22774c = new HashMap();

    private e() {
    }

    public static final void a() {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            f22772a.c();
            if (!f22774c.isEmpty()) {
                f22773b = true;
            }
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    private final String b(String str) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            for (String str2 : f22774c.keySet()) {
                HashSet<String> hashSet = f22774c.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final void c() {
        int length;
        HashSet<String> m10;
        if (a5.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f7874a;
            int i10 = 0;
            r q10 = v.q(e0.m(), false);
            if (q10 == null) {
                return;
            }
            try {
                f22774c = new HashMap();
                JSONArray j10 = q10.j();
                if (j10 == null || j10.length() == 0 || (length = j10.length()) <= 0) {
                    return;
                }
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject = j10.getJSONObject(i10);
                    boolean has = jSONObject.has(Constants.KEY);
                    boolean has2 = jSONObject.has("value");
                    if (has && has2) {
                        String redactedString = jSONObject.getString(Constants.KEY);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (redactedString != null && (m10 = n0.m(jSONArray)) != null) {
                            Map<String, HashSet<String>> map = f22774c;
                            n.d(redactedString, "redactedString");
                            map.put(redactedString, m10);
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
            a5.a.b(th2, this);
        }
    }

    public static final String d(String eventName) {
        if (a5.a.d(e.class)) {
            return null;
        }
        try {
            n.e(eventName, "eventName");
            if (f22773b) {
                String b10 = f22772a.b(eventName);
                if (b10 != null) {
                    return b10;
                }
            }
            return eventName;
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
            return null;
        }
    }
}
