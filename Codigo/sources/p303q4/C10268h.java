package p303q4;

import android.content.Context;
import ck.C2033r;
import com.facebook.appevents.C4589o;
import com.facebook.internal.C4607a;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4634n0;
import dk.C7018k0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import org.json.JSONObject;
import p152i4.EnumC7823q0;

/* renamed from: q4.h */
/* loaded from: classes.dex */
public final class C10268h {

    /* renamed from: a */
    public static final C10268h f25490a = new C10268h();

    /* renamed from: b */
    private static final Map<a, String> f25491b;

    /* renamed from: q4.h$a */
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
        HashMap m20423j;
        m20423j = C7018k0.m20423j(C2033r.m10353a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), C2033r.m10353a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));
        f25491b = m20423j;
    }

    private C10268h() {
    }

    /* renamed from: a */
    public static final JSONObject m30751a(a activityType, C4607a c4607a, String str, boolean z10, Context context) {
        C9322n.m27781e(activityType, "activityType");
        C9322n.m27781e(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f25491b.get(activityType));
        String m11053d = C4589o.f8635b.m11053d();
        if (m11053d != null) {
            jSONObject.put("app_user_id", m11053d);
        }
        C4634n0.m11268D0(jSONObject, c4607a, str, z10, context);
        try {
            C4634n0.m11269E0(jSONObject, context);
        } catch (Exception e10) {
            C4612c0.f8694e.m11139c(EnumC7823q0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
        }
        JSONObject m11267D = C4634n0.m11267D();
        if (m11267D != null) {
            Iterator<String> keys = m11267D.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, m11267D.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
