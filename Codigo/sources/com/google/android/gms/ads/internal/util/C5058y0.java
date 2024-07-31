package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzfgr;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.util.y0 */
/* loaded from: classes.dex */
public final class C5058y0 {

    /* renamed from: a */
    public static final InterfaceC5055x0 f10179a = new C5052w0();

    /* renamed from: a */
    public static Bundle m12766a(JSONObject jSONObject) {
        String valueOf;
        String str;
        String format;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else {
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (jSONArray.length() != 0) {
                            int length = jSONArray.length();
                            int i10 = 0;
                            Object obj = null;
                            for (int i11 = 0; obj == null && i11 < length; i11++) {
                                obj = !jSONArray.isNull(i11) ? jSONArray.opt(i11) : null;
                            }
                            if (obj == null) {
                                valueOf = String.valueOf(next);
                                str = "Expected JSONArray with at least 1 non-null element for key:";
                                format = str.concat(valueOf);
                            } else if (obj instanceof JSONObject) {
                                Bundle[] bundleArr = new Bundle[length];
                                while (i10 < length) {
                                    bundleArr[i10] = !jSONArray.isNull(i10) ? m12766a(jSONArray.optJSONObject(i10)) : null;
                                    i10++;
                                }
                                bundle.putParcelableArray(next, bundleArr);
                            } else if (obj instanceof Number) {
                                double[] dArr = new double[jSONArray.length()];
                                while (i10 < length) {
                                    dArr[i10] = jSONArray.optDouble(i10);
                                    i10++;
                                }
                                bundle.putDoubleArray(next, dArr);
                            } else if (obj instanceof CharSequence) {
                                String[] strArr = new String[length];
                                while (i10 < length) {
                                    strArr[i10] = !jSONArray.isNull(i10) ? jSONArray.optString(i10) : null;
                                    i10++;
                                }
                                bundle.putStringArray(next, strArr);
                            } else if (obj instanceof Boolean) {
                                boolean[] zArr = new boolean[length];
                                while (i10 < length) {
                                    zArr[i10] = jSONArray.optBoolean(i10);
                                    i10++;
                                }
                                bundle.putBooleanArray(next, zArr);
                            } else {
                                format = String.format("JSONArray with unsupported type %s for key:%s", obj.getClass().getCanonicalName(), next);
                            }
                        }
                    } else if (opt instanceof JSONObject) {
                        bundle.putBundle(next, m12766a((JSONObject) opt));
                    } else {
                        valueOf = String.valueOf(next);
                        str = "Unsupported type for key:";
                        format = str.concat(valueOf);
                    }
                    zzcec.zzj(format);
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static String m12767b(String str, JSONObject jSONObject, String... strArr) {
        JSONObject m12778m = m12778m(jSONObject, strArr);
        return m12778m == null ? "" : m12778m.optString(strArr[0], "");
    }

    /* renamed from: c */
    public static List m12768c(JSONArray jSONArray, List list) {
        if (list == null) {
            list = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                list.add(jSONArray.getString(i10));
            }
        }
        return list;
    }

    /* renamed from: d */
    public static List m12769d(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: e */
    public static JSONArray m12770e(JsonReader jsonReader) {
        Object m12770e;
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                m12770e = m12770e(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                m12770e = m12773h(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                m12770e = jsonReader.nextString();
            }
            jSONArray.put(m12770e);
        }
        jsonReader.endArray();
        return jSONArray;
    }

    /* renamed from: f */
    public static JSONObject m12771f(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    /* renamed from: g */
    public static JSONObject m12772g(JSONObject jSONObject, String... strArr) {
        JSONObject m12778m = m12778m(jSONObject, strArr);
        if (m12778m == null) {
            return null;
        }
        return m12778m.optJSONObject(strArr[1]);
    }

    /* renamed from: h */
    public static JSONObject m12773h(JsonReader jsonReader) {
        Object m12770e;
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                m12770e = m12770e(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                m12770e = m12773h(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                m12770e = jsonReader.nextString();
            }
            jSONObject.put(nextName, m12770e);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    /* renamed from: i */
    public static void m12774i(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object obj = jSONArray.get(i10);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    m12775j(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    m12774i(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    /* renamed from: j */
    public static void m12775j(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    m12775j(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    m12774i(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    /* renamed from: k */
    public static boolean m12776k(boolean z10, JSONObject jSONObject, String... strArr) {
        JSONObject m12778m = m12778m(jSONObject, strArr);
        if (m12778m == null) {
            return false;
        }
        return m12778m.optBoolean(strArr[strArr.length - 1], false);
    }

    /* renamed from: l */
    public static String m12777l(zzfgr zzfgrVar) {
        if (zzfgrVar == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            m12779n(jsonWriter, zzfgrVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e10) {
            zzcec.zzh("Error when writing JSON.", e10);
            return null;
        }
    }

    /* renamed from: m */
    private static JSONObject m12778m(JSONObject jSONObject, String[] strArr) {
        for (int i10 = 0; i10 < strArr.length - 1; i10++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i10]);
        }
        return jSONObject;
    }

    /* renamed from: n */
    private static void m12779n(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof zzfgr) {
            m12775j(jsonWriter, ((zzfgr) obj).zzd);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m12779n(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                m12779n(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }
}
