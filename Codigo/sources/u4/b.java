package u4;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.internal.n0;
import dk.k0;
import i4.e0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c */
    private static SharedPreferences f27081c;

    /* renamed from: a */
    public static final b f27079a = new b();

    /* renamed from: b */
    private static final Map<String, String> f27080b = new LinkedHashMap();

    /* renamed from: d */
    private static final AtomicBoolean f27082d = new AtomicBoolean(false);

    private b() {
    }

    public static final void a(String pathID, String predictedEvent) {
        Map s10;
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            n.e(pathID, "pathID");
            n.e(predictedEvent, "predictedEvent");
            if (!f27082d.get()) {
                f27079a.c();
            }
            Map<String, String> map = f27080b;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f27081c;
            if (sharedPreferences == null) {
                n.p("shardPreferences");
                throw null;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            n0 n0Var = n0.f7780a;
            s10 = k0.s(map);
            edit.putString("SUGGESTED_EVENTS_HISTORY", n0.m0(s10)).apply();
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    public static final String b(View view, String text) {
        if (a5.a.d(b.class)) {
            return null;
        }
        try {
            n.e(view, "view");
            n.e(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = m4.f.j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            n0 n0Var = n0.f7780a;
            return n0.G0(jSONObject.toString());
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
            return null;
        }
    }

    private final void c() {
        String str = "";
        if (a5.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f27082d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = e0.l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            n.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f27081c = sharedPreferences;
            Map<String, String> map = f27080b;
            n0 n0Var = n0.f7780a;
            SharedPreferences sharedPreferences2 = f27081c;
            if (sharedPreferences2 == null) {
                n.p("shardPreferences");
                throw null;
            }
            String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(n0.i0(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final String d(String pathID) {
        if (a5.a.d(b.class)) {
            return null;
        }
        try {
            n.e(pathID, "pathID");
            Map<String, String> map = f27080b;
            if (map.containsKey(pathID)) {
                return map.get(pathID);
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
            return null;
        }
    }
}
