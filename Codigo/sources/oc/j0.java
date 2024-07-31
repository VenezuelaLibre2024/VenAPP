package oc;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzab;
import com.google.android.gms.internal.p002firebaseauthapi.zzxw;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a */
    private static final ga.a f22401a = new ga.a("JSONParser", new String[0]);

    private static List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map<String, Object> b(String str) {
        com.google.android.gms.common.internal.s.f(str);
        List<String> zza = zzab.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            f22401a.c("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map<String, Object> d10 = d(new String(la.c.b(zza.get(1)), "UTF-8"));
            return d10 == null ? new HashMap() : d10;
        } catch (UnsupportedEncodingException e10) {
            f22401a.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    private static Map<String, Object> c(JSONObject jSONObject) {
        androidx.collection.a aVar = new androidx.collection.a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            aVar.put(next, obj);
        }
        return aVar;
    }

    public static Map<String, Object> d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzxw(e10);
        }
    }
}
