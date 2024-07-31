package p436x6;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: x6.a */
/* loaded from: classes.dex */
final class C12294a {
    /* renamed from: a */
    public static byte[] m39694a(byte[] bArr) {
        return C11172r0.f29040a >= 27 ? bArr : C11172r0.m34935m0(m39696c(C11172r0.m34862D(bArr)));
    }

    /* renamed from: b */
    public static byte[] m39695b(byte[] bArr) {
        if (C11172r0.f29040a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(C11172r0.m34862D(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(m39697d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(m39697d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return C11172r0.m34935m0(sb2.toString());
        } catch (JSONException e10) {
            C11173s.m34965d("ClearKeyUtil", "Failed to adjust response data: " + C11172r0.m34862D(bArr), e10);
            return bArr;
        }
    }

    /* renamed from: c */
    private static String m39696c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: d */
    private static String m39697d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
