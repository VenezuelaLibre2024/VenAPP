package p160ic;

import android.text.TextUtils;
import android.util.Base64;
import androidx.collection.C0731a;
import com.google.android.gms.common.internal.C5276s;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ic.c */
/* loaded from: classes.dex */
public class C7959c {
    /* renamed from: a */
    private static Map<String, Object> m24449a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m24452d(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            C7958b.m24444f().m24445b("Failed to parse JSONObject into Map:\n" + e10);
            return Collections.emptyMap();
        }
    }

    /* renamed from: b */
    public static Map<String, Object> m24450b(String str) {
        C7958b m24444f;
        StringBuilder sb2;
        C5276s.m13320f(str);
        String[] split = str.split("\\.", -1);
        if (split.length < 2) {
            m24444f = C7958b.m24444f();
            sb2 = new StringBuilder();
            sb2.append("Invalid token (too few subsections):\n");
            sb2.append(str);
        } else {
            try {
                Map<String, Object> m24449a = m24449a(new String(Base64.decode(split[1], 11), "UTF-8"));
                return m24449a == null ? Collections.emptyMap() : m24449a;
            } catch (UnsupportedEncodingException e10) {
                m24444f = C7958b.m24444f();
                sb2 = new StringBuilder();
                sb2.append("Unable to decode token (charset unknown):\n");
                sb2.append(e10);
            }
        }
        m24444f.m24447d(sb2.toString());
        return Collections.emptyMap();
    }

    /* renamed from: c */
    private static List<Object> m24451c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = m24451c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m24452d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: d */
    private static Map<String, Object> m24452d(JSONObject jSONObject) {
        C0731a c0731a = new C0731a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m24451c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m24452d((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            c0731a.put(next, obj);
        }
        return c0731a;
    }
}
