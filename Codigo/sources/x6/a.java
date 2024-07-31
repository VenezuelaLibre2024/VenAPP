package x6;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t8.r0;

/* loaded from: classes.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return r0.f26744a >= 27 ? bArr : r0.m0(c(r0.D(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (r0.f26744a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(r0.D(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return r0.m0(sb2.toString());
        } catch (JSONException e10) {
            t8.s.d("ClearKeyUtil", "Failed to adjust response data: " + r0.D(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
