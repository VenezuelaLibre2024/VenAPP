package p152i4;

import android.util.Log;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4634n0;
import dk.C7033s;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import p152i4.C7787a;

/* renamed from: i4.n0 */
/* loaded from: classes.dex */
public final class C7817n0 {

    /* renamed from: i */
    public static final a f18732i = new a(null);

    /* renamed from: j */
    private static final String f18733j = C7817n0.class.getCanonicalName();

    /* renamed from: a */
    private final C7807i0 f18734a;

    /* renamed from: b */
    private final HttpURLConnection f18735b;

    /* renamed from: c */
    private final String f18736c;

    /* renamed from: d */
    private final JSONObject f18737d;

    /* renamed from: e */
    private final JSONArray f18738e;

    /* renamed from: f */
    private final C7830u f18739f;

    /* renamed from: g */
    private final JSONObject f18740g;

    /* renamed from: h */
    private final JSONArray f18741h;

    /* renamed from: i4.n0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: b */
        private final C7817n0 m24064b(C7807i0 c7807i0, HttpURLConnection httpURLConnection, Object NULL, Object obj) {
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                C7830u m24108a = C7830u.f18765z.m24108a(jSONObject, obj, httpURLConnection);
                if (m24108a != null) {
                    Log.e(C7817n0.f18733j, m24108a.toString());
                    if (m24108a.m24099b() == 190) {
                        C4634n0 c4634n0 = C4634n0.f8760a;
                        if (C4634n0.m11292Z(c7807i0.m23951m())) {
                            if (m24108a.m24104g() != 493) {
                                C7787a.f18552w.m23785h(null);
                            } else {
                                C7787a.c cVar = C7787a.f18552w;
                                C7787a m23782e = cVar.m23782e();
                                if (C9322n.m27777a(m23782e != null ? Boolean.valueOf(m23782e.m23772o()) : null, Boolean.FALSE)) {
                                    cVar.m23781d();
                                }
                            }
                        }
                    }
                    return new C7817n0(c7807i0, httpURLConnection, m24108a);
                }
                Object m11283P = C4634n0.m11283P(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (m11283P instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) m11283P;
                    return new C7817n0(c7807i0, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (m11283P instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) m11283P;
                    return new C7817n0(c7807i0, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                NULL = JSONObject.NULL;
                C9322n.m27780d(NULL, "NULL");
            }
            if (NULL == JSONObject.NULL) {
                return new C7817n0(c7807i0, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new C7824r(C9322n.m27787k("Got unexpected object type in response, class: ", NULL.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[LOOP:0: B:15:0x0062->B:19:0x009b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[EDGE_INSN: B:20:0x009d->B:27:0x009d BREAK  A[LOOP:0: B:15:0x0062->B:19:0x009b], SYNTHETIC] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<p152i4.C7817n0> m24065c(java.net.HttpURLConnection r9, java.util.List<p152i4.C7807i0> r10, java.lang.Object r11) {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L4e
                java.lang.Object r2 = r10.get(r3)
                i4.i0 r2 = (p152i4.C7807i0) r2
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                r4.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                if (r9 != 0) goto L22
                r5 = 200(0xc8, float:2.8E-43)
                goto L26
            L22:
                int r5 = r9.getResponseCode()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
            L26:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                r5.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                r5.put(r4)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                goto L4f
            L34:
                r4 = move-exception
                i4.n0 r5 = new i4.n0
                i4.u r6 = new i4.u
                r6.<init>(r9, r4)
                r5.<init>(r2, r9, r6)
                goto L4b
            L40:
                r4 = move-exception
                i4.n0 r5 = new i4.n0
                i4.u r6 = new i4.u
                r6.<init>(r9, r4)
                r5.<init>(r2, r9, r6)
            L4b:
                r1.add(r5)
            L4e:
                r5 = r11
            L4f:
                boolean r2 = r5 instanceof org.json.JSONArray
                if (r2 == 0) goto L9e
                r2 = r5
                org.json.JSONArray r2 = (org.json.JSONArray) r2
                int r4 = r2.length()
                if (r4 != r0) goto L9e
                int r0 = r2.length()
                if (r0 <= 0) goto L9d
            L62:
                int r2 = r3 + 1
                java.lang.Object r4 = r10.get(r3)
                i4.i0 r4 = (p152i4.C7807i0) r4
                r6 = r5
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch: p152i4.C7824r -> L7e org.json.JSONException -> L8a
                java.lang.Object r3 = r6.get(r3)     // Catch: p152i4.C7824r -> L7e org.json.JSONException -> L8a
                java.lang.String r6 = "obj"
                kotlin.jvm.internal.C9322n.m27780d(r3, r6)     // Catch: p152i4.C7824r -> L7e org.json.JSONException -> L8a
                i4.n0 r3 = r8.m24064b(r4, r9, r3, r11)     // Catch: p152i4.C7824r -> L7e org.json.JSONException -> L8a
                r1.add(r3)     // Catch: p152i4.C7824r -> L7e org.json.JSONException -> L8a
                goto L98
            L7e:
                r3 = move-exception
                i4.n0 r6 = new i4.n0
                i4.u r7 = new i4.u
                r7.<init>(r9, r3)
                r6.<init>(r4, r9, r7)
                goto L95
            L8a:
                r3 = move-exception
                i4.n0 r6 = new i4.n0
                i4.u r7 = new i4.u
                r7.<init>(r9, r3)
                r6.<init>(r4, r9, r7)
            L95:
                r1.add(r6)
            L98:
                if (r2 < r0) goto L9b
                goto L9d
            L9b:
                r3 = r2
                goto L62
            L9d:
                return r1
            L9e:
                i4.r r9 = new i4.r
                java.lang.String r10 = "Unexpected number of results"
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p152i4.C7817n0.a.m24065c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        /* renamed from: a */
        public final List<C7817n0> m24066a(List<C7807i0> requests, HttpURLConnection httpURLConnection, C7824r c7824r) {
            int m20590r;
            C9322n.m27781e(requests, "requests");
            List<C7807i0> list = requests;
            m20590r = C7033s.m20590r(list, 10);
            ArrayList arrayList = new ArrayList(m20590r);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C7817n0((C7807i0) it.next(), httpURLConnection, new C7830u(httpURLConnection, c7824r)));
            }
            return arrayList;
        }

        /* renamed from: d */
        public final List<C7817n0> m24067d(InputStream inputStream, HttpURLConnection httpURLConnection, C7815m0 requests) {
            C9322n.m27781e(requests, "requests");
            String m11332t0 = C4634n0.m11332t0(inputStream);
            C4612c0.f8694e.m11139c(EnumC7823q0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(m11332t0.length()), m11332t0);
            return m24068e(m11332t0, httpURLConnection, requests);
        }

        /* renamed from: e */
        public final List<C7817n0> m24068e(String responseString, HttpURLConnection httpURLConnection, C7815m0 requests) {
            C9322n.m27781e(responseString, "responseString");
            C9322n.m27781e(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            C9322n.m27780d(resultObject, "resultObject");
            List<C7817n0> m24065c = m24065c(httpURLConnection, requests, resultObject);
            C4612c0.f8694e.m11139c(EnumC7823q0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.m24051s(), Integer.valueOf(responseString.length()), m24065c);
            return m24065c;
        }

        /* renamed from: f */
        public final List<C7817n0> m24069f(HttpURLConnection connection, C7815m0 requests) {
            List<C7817n0> m24066a;
            C9322n.m27781e(connection, "connection");
            C9322n.m27781e(requests, "requests");
            InputStream inputStream = null;
            try {
                try {
                } catch (C7824r e10) {
                    C4612c0.f8694e.m11139c(EnumC7823q0.REQUESTS, "Response", "Response <Error>: %s", e10);
                    m24066a = m24066a(requests, connection, e10);
                } catch (Exception e11) {
                    C4612c0.f8694e.m11139c(EnumC7823q0.REQUESTS, "Response", "Response <Error>: %s", e11);
                    m24066a = m24066a(requests, connection, new C7824r(e11));
                }
                if (!C7799e0.m23832E()) {
                    Log.e(C7817n0.f18733j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new C7824r("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                inputStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                m24066a = m24067d(inputStream, connection, requests);
                return m24066a;
            } finally {
                C4634n0.m11311j(null);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7817n0(C7807i0 request, HttpURLConnection httpURLConnection, C7830u error) {
        this(request, httpURLConnection, null, null, null, error);
        C9322n.m27781e(request, "request");
        C9322n.m27781e(error, "error");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7817n0(C7807i0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        C9322n.m27781e(request, "request");
        C9322n.m27781e(rawResponse, "rawResponse");
        C9322n.m27781e(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7817n0(C7807i0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        C9322n.m27781e(request, "request");
        C9322n.m27781e(rawResponse, "rawResponse");
    }

    public C7817n0(C7807i0 request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, C7830u c7830u) {
        C9322n.m27781e(request, "request");
        this.f18734a = request;
        this.f18735b = httpURLConnection;
        this.f18736c = str;
        this.f18737d = jSONObject;
        this.f18738e = jSONArray;
        this.f18739f = c7830u;
        this.f18740g = jSONObject;
        this.f18741h = jSONArray;
    }

    /* renamed from: b */
    public final C7830u m24061b() {
        return this.f18739f;
    }

    /* renamed from: c */
    public final JSONObject m24062c() {
        return this.f18737d;
    }

    /* renamed from: d */
    public final JSONObject m24063d() {
        return this.f18740g;
    }

    public String toString() {
        String str;
        try {
            C9308a0 c9308a0 = C9308a0.f22565a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f18735b;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            C9322n.m27780d(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f18737d + ", error: " + this.f18739f + "}";
        C9322n.m27780d(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }
}
