package p287p4;

import com.facebook.internal.C4639q;
import dk.C7042z;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;
import p325r4.C10618f;

/* renamed from: p4.b */
/* loaded from: classes.dex */
public final class C10055b {

    /* renamed from: a */
    public static final C10055b f24693a = new C10055b();

    /* renamed from: b */
    private static boolean f24694b;

    /* renamed from: c */
    private static boolean f24695c;

    private C10055b() {
    }

    /* renamed from: a */
    public static final void m29976a() {
        if (C0033a.m107d(C10055b.class)) {
            return;
        }
        try {
            f24694b = true;
            C4639q c4639q = C4639q.f8777a;
            f24695c = C4639q.m11365d("FBSDKFeatureIntegritySample", C7799e0.m23861m(), false);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10055b.class);
        }
    }

    /* renamed from: b */
    private final String m29977b(String str) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            C10618f c10618f = C10618f.f26831a;
            String[] m32337q = C10618f.m32337q(C10618f.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (m32337q == null) {
                return "none";
            }
            String str2 = m32337q[0];
            return str2 == null ? "none" : str2;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: c */
    public static final void m29978c(Map<String, String> parameters) {
        List<String> m20630f0;
        if (C0033a.m107d(C10055b.class)) {
            return;
        }
        try {
            C9322n.m27781e(parameters, "parameters");
            if (f24694b && !parameters.isEmpty()) {
                try {
                    m20630f0 = C7042z.m20630f0(parameters.keySet());
                    JSONObject jSONObject = new JSONObject();
                    for (String str : m20630f0) {
                        String str2 = parameters.get(str);
                        if (str2 == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        String str3 = str2;
                        C10055b c10055b = f24693a;
                        if (c10055b.m29979d(str) || c10055b.m29979d(str3)) {
                            parameters.remove(str);
                            if (!f24695c) {
                                str3 = "";
                            }
                            jSONObject.put(str, str3);
                        }
                    }
                    if (jSONObject.length() == 0) {
                        return;
                    }
                    String jSONObject2 = jSONObject.toString();
                    C9322n.m27780d(jSONObject2, "restrictiveParamJson.toString()");
                    parameters.put("_onDeviceParams", jSONObject2);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10055b.class);
        }
    }

    /* renamed from: d */
    private final boolean m29979d(String str) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            return !C9322n.m27777a("none", m29977b(str));
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }
}
