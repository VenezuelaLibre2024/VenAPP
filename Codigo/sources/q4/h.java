package q4;

import android.content.Context;
import ck.r;
import com.facebook.internal.c0;
import com.facebook.internal.n0;
import dk.k0;
import i4.q0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f23522a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<a, String> f23523b;

    /* loaded from: classes.dex */
    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    static {
        HashMap j10;
        j10 = k0.j(r.a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), r.a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));
        f23523b = j10;
    }

    private h() {
    }

    public static final JSONObject a(a activityType, com.facebook.internal.a aVar, String str, boolean z10, Context context) {
        kotlin.jvm.internal.n.e(activityType, "activityType");
        kotlin.jvm.internal.n.e(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f23523b.get(activityType));
        String d10 = com.facebook.appevents.o.f7660b.d();
        if (d10 != null) {
            jSONObject.put("app_user_id", d10);
        }
        n0.D0(jSONObject, aVar, str, z10, context);
        try {
            n0.E0(jSONObject, context);
        } catch (Exception e10) {
            c0.f7719e.c(q0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
        }
        JSONObject D = n0.D();
        if (D != null) {
            Iterator<String> keys = D.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, D.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
