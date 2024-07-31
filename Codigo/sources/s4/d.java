package s4;

import android.os.Bundle;
import com.facebook.internal.n0;
import com.facebook.internal.r;
import com.facebook.internal.v;
import dk.z;
import java.util.List;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import s4.e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f25135a = new d();

    /* renamed from: b */
    private static final String f25136b = e.class.getSimpleName();

    private d() {
    }

    public static final Bundle a(e.a eventType, String applicationId, List<com.facebook.appevents.d> appEvents) {
        if (a5.a.d(d.class)) {
            return null;
        }
        try {
            n.e(eventType, "eventType");
            n.e(applicationId, "applicationId");
            n.e(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", applicationId);
            if (e.a.CUSTOM_APP_EVENTS == eventType) {
                JSONArray b10 = f25135a.b(appEvents, applicationId);
                if (b10.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b10.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            a5.a.b(th2, d.class);
            return null;
        }
    }

    private final JSONArray b(List<com.facebook.appevents.d> list, String str) {
        List<com.facebook.appevents.d> h02;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            h02 = z.h0(list);
            n4.a.d(h02);
            boolean c10 = c(str);
            for (com.facebook.appevents.d dVar : h02) {
                if (!dVar.g()) {
                    n0 n0Var = n0.f7780a;
                    n0.k0(f25136b, n.k("Event with invalid checksum: ", dVar));
                } else if ((!dVar.h()) || (dVar.h() && c10)) {
                    jSONArray.put(dVar.e());
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final boolean c(String str) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            r q10 = v.q(str, false);
            if (q10 != null) {
                return q10.q();
            }
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }
}
