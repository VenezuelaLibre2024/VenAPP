package p347s4;

import android.os.Bundle;
import com.facebook.appevents.C4569d;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import dk.C7042z;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import p007a5.C0033a;
import p247n4.C9661a;
import p347s4.C10798e;

/* renamed from: s4.d */
/* loaded from: classes.dex */
public final class C10797d {

    /* renamed from: a */
    public static final C10797d f27254a = new C10797d();

    /* renamed from: b */
    private static final String f27255b = C10798e.class.getSimpleName();

    private C10797d() {
    }

    /* renamed from: a */
    public static final Bundle m32898a(C10798e.a eventType, String applicationId, List<C4569d> appEvents) {
        if (C0033a.m107d(C10797d.class)) {
            return null;
        }
        try {
            C9322n.m27781e(eventType, "eventType");
            C9322n.m27781e(applicationId, "applicationId");
            C9322n.m27781e(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", applicationId);
            if (C10798e.a.CUSTOM_APP_EVENTS == eventType) {
                JSONArray m32899b = f27254a.m32899b(appEvents, applicationId);
                if (m32899b.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", m32899b.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10797d.class);
            return null;
        }
    }

    /* renamed from: b */
    private final JSONArray m32899b(List<C4569d> list, String str) {
        List<C4569d> m20632h0;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            m20632h0 = C7042z.m20632h0(list);
            C9661a.m28959d(m20632h0);
            boolean m32900c = m32900c(str);
            for (C4569d c4569d : m20632h0) {
                if (!c4569d.m10948g()) {
                    C4634n0 c4634n0 = C4634n0.f8760a;
                    C4634n0.m11314k0(f27255b, C9322n.m27787k("Event with invalid checksum: ", c4569d));
                } else if ((!c4569d.m10949h()) || (c4569d.m10949h() && m32900c)) {
                    jSONArray.put(c4569d.m10946e());
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: c */
    private final boolean m32900c(String str) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            C4641r m11457q = C4648v.m11457q(str, false);
            if (m11457q != null) {
                return m11457q.m11391q();
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }
}
