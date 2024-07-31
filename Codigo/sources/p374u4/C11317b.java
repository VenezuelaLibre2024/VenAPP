package p374u4;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.internal.C4634n0;
import dk.C7018k0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;
import p232m4.C9545f;

/* renamed from: u4.b */
/* loaded from: classes.dex */
public final class C11317b {

    /* renamed from: c */
    private static SharedPreferences f29383c;

    /* renamed from: a */
    public static final C11317b f29381a = new C11317b();

    /* renamed from: b */
    private static final Map<String, String> f29382b = new LinkedHashMap();

    /* renamed from: d */
    private static final AtomicBoolean f29384d = new AtomicBoolean(false);

    private C11317b() {
    }

    /* renamed from: a */
    public static final void m35373a(String pathID, String predictedEvent) {
        Map m20432s;
        if (C0033a.m107d(C11317b.class)) {
            return;
        }
        try {
            C9322n.m27781e(pathID, "pathID");
            C9322n.m27781e(predictedEvent, "predictedEvent");
            if (!f29384d.get()) {
                f29381a.m35375c();
            }
            Map<String, String> map = f29382b;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f29383c;
            if (sharedPreferences == null) {
                C9322n.m27792p("shardPreferences");
                throw null;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            C4634n0 c4634n0 = C4634n0.f8760a;
            m20432s = C7018k0.m20432s(map);
            edit.putString("SUGGESTED_EVENTS_HISTORY", C4634n0.m11318m0(m20432s)).apply();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11317b.class);
        }
    }

    /* renamed from: b */
    public static final String m35374b(View view, String text) {
        if (C0033a.m107d(C11317b.class)) {
            return null;
        }
        try {
            C9322n.m27781e(view, "view");
            C9322n.m27781e(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = C9545f.m28423j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            C4634n0 c4634n0 = C4634n0.f8760a;
            return C4634n0.m11273G0(jSONObject.toString());
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11317b.class);
            return null;
        }
    }

    /* renamed from: c */
    private final void m35375c() {
        String str = "";
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f29384d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = C7799e0.m23860l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            C9322n.m27780d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f29383c = sharedPreferences;
            Map<String, String> map = f29382b;
            C4634n0 c4634n0 = C4634n0.f8760a;
            SharedPreferences sharedPreferences2 = f29383c;
            if (sharedPreferences2 == null) {
                C9322n.m27792p("shardPreferences");
                throw null;
            }
            String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(C4634n0.m11310i0(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: d */
    public static final String m35376d(String pathID) {
        if (C0033a.m107d(C11317b.class)) {
            return null;
        }
        try {
            C9322n.m27781e(pathID, "pathID");
            Map<String, String> map = f29382b;
            if (map.containsKey(pathID)) {
                return map.get(pathID);
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11317b.class);
            return null;
        }
    }
}
