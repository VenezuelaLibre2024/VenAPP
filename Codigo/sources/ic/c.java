package ic;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.s;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static Map<String, Object> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            b.f().b("Failed to parse JSONObject into Map:\n" + e10);
            return Collections.emptyMap();
        }
    }

    public static Map<String, Object> b(String str) {
        b f10;
        StringBuilder sb2;
        s.f(str);
        String[] split = str.split("\\.", -1);
        if (split.length < 2) {
            f10 = b.f();
            sb2 = new StringBuilder();
            sb2.append("Invalid token (too few subsections):\n");
            sb2.append(str);
        } else {
            try {
                Map<String, Object> a10 = a(new String(Base64.decode(split[1], 11), "UTF-8"));
                return a10 == null ? Collections.emptyMap() : a10;
            } catch (UnsupportedEncodingException e10) {
                f10 = b.f();
                sb2 = new StringBuilder();
                sb2.append("Unable to decode token (charset unknown):\n");
                sb2.append(e10);
            }
        }
        f10.d(sb2.toString());
        return Collections.emptyMap();
    }

    private static List<Object> c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    private static Map<String, Object> d(JSONObject jSONObject) {
        androidx.collection.a aVar = new androidx.collection.a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            aVar.put(next, obj);
        }
        return aVar;
    }
}
