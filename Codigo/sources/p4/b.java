package p4;

import com.facebook.internal.q;
import dk.z;
import i4.e0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import r4.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final b f22760a = new b();

    /* renamed from: b */
    private static boolean f22761b;

    /* renamed from: c */
    private static boolean f22762c;

    private b() {
    }

    public static final void a() {
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            f22761b = true;
            q qVar = q.f7797a;
            f22762c = q.d("FBSDKFeatureIntegritySample", e0.m(), false);
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    private final String b(String str) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            r4.f fVar = r4.f.f24717a;
            String[] q10 = r4.f.q(f.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (q10 == null) {
                return "none";
            }
            String str2 = q10[0];
            return str2 == null ? "none" : str2;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final void c(Map<String, String> parameters) {
        List<String> f02;
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            n.e(parameters, "parameters");
            if (f22761b && !parameters.isEmpty()) {
                try {
                    f02 = z.f0(parameters.keySet());
                    JSONObject jSONObject = new JSONObject();
                    for (String str : f02) {
                        String str2 = parameters.get(str);
                        if (str2 == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        String str3 = str2;
                        b bVar = f22760a;
                        if (bVar.d(str) || bVar.d(str3)) {
                            parameters.remove(str);
                            if (!f22762c) {
                                str3 = "";
                            }
                            jSONObject.put(str, str3);
                        }
                    }
                    if (jSONObject.length() == 0) {
                        return;
                    }
                    String jSONObject2 = jSONObject.toString();
                    n.d(jSONObject2, "restrictiveParamJson.toString()");
                    parameters.put("_onDeviceParams", jSONObject2);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    private final boolean d(String str) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            return !n.a("none", b(str));
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }
}
