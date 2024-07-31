package p096f4;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f4.a */
/* loaded from: classes.dex */
public class C7294a {
    /* renamed from: a */
    public static String m21870a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }
}
