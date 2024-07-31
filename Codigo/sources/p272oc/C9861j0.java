package p272oc;

import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C0731a;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzab;
import com.google.android.gms.internal.p498firebaseauthapi.zzxw;
import ga.C7533a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import la.C9458c;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: oc.j0 */
/* loaded from: classes.dex */
final class C9861j0 {

    /* renamed from: a */
    private static final C7533a f24334a = new C7533a("JSONParser", new String[0]);

    /* renamed from: a */
    private static List<Object> m29545a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = m29545a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m29547c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map<String, Object> m29546b(String str) {
        C5276s.m13320f(str);
        List<String> zza = zzab.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            f24334a.m22871c("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map<String, Object> m29548d = m29548d(new String(C9458c.m28125b(zza.get(1)), "UTF-8"));
            return m29548d == null ? new HashMap() : m29548d;
        } catch (UnsupportedEncodingException e10) {
            f24334a.m22870b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    /* renamed from: c */
    private static Map<String, Object> m29547c(JSONObject jSONObject) {
        C0731a c0731a = new C0731a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m29545a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m29547c((JSONObject) obj);
            }
            c0731a.put(next, obj);
        }
        return c0731a;
    }

    /* renamed from: d */
    public static Map<String, Object> m29548d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m29547c(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzxw(e10);
        }
    }
}
