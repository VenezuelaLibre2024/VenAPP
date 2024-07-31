package i4;

import android.util.Log;
import i4.a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f17073i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final String f17074j = n0.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    private final i0 f17075a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f17076b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17077c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f17078d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONArray f17079e;

    /* renamed from: f, reason: collision with root package name */
    private final u f17080f;

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f17081g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONArray f17082h;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final n0 b(i0 i0Var, HttpURLConnection httpURLConnection, Object NULL, Object obj) {
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                u a10 = u.f17105z.a(jSONObject, obj, httpURLConnection);
                if (a10 != null) {
                    Log.e(n0.f17074j, a10.toString());
                    if (a10.b() == 190) {
                        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                        if (com.facebook.internal.n0.Z(i0Var.m())) {
                            if (a10.g() != 493) {
                                i4.a.f16899w.h(null);
                            } else {
                                a.c cVar = i4.a.f16899w;
                                i4.a e10 = cVar.e();
                                if (kotlin.jvm.internal.n.a(e10 != null ? Boolean.valueOf(e10.o()) : null, Boolean.FALSE)) {
                                    cVar.d();
                                }
                            }
                        }
                    }
                    return new n0(i0Var, httpURLConnection, a10);
                }
                Object P = com.facebook.internal.n0.P(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (P instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) P;
                    return new n0(i0Var, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (P instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) P;
                    return new n0(i0Var, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                NULL = JSONObject.NULL;
                kotlin.jvm.internal.n.d(NULL, "NULL");
            }
            if (NULL == JSONObject.NULL) {
                return new n0(i0Var, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new r(kotlin.jvm.internal.n.k("Got unexpected object type in response, class: ", NULL.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[LOOP:0: B:15:0x0062->B:19:0x009b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[EDGE_INSN: B:20:0x009d->B:27:0x009d BREAK  A[LOOP:0: B:15:0x0062->B:19:0x009b], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<i4.n0> c(java.net.HttpURLConnection r9, java.util.List<i4.i0> r10, java.lang.Object r11) {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L4e
                java.lang.Object r2 = r10.get(r3)
                i4.i0 r2 = (i4.i0) r2
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
                i4.i0 r4 = (i4.i0) r4
                r6 = r5
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch: i4.r -> L7e org.json.JSONException -> L8a
                java.lang.Object r3 = r6.get(r3)     // Catch: i4.r -> L7e org.json.JSONException -> L8a
                java.lang.String r6 = "obj"
                kotlin.jvm.internal.n.d(r3, r6)     // Catch: i4.r -> L7e org.json.JSONException -> L8a
                i4.n0 r3 = r8.b(r4, r9, r3, r11)     // Catch: i4.r -> L7e org.json.JSONException -> L8a
                r1.add(r3)     // Catch: i4.r -> L7e org.json.JSONException -> L8a
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
            throw new UnsupportedOperationException("Method not decompiled: i4.n0.a.c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        public final List<n0> a(List<i0> requests, HttpURLConnection httpURLConnection, r rVar) {
            int r10;
            kotlin.jvm.internal.n.e(requests, "requests");
            List<i0> list = requests;
            r10 = dk.s.r(list, 10);
            ArrayList arrayList = new ArrayList(r10);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new n0((i0) it.next(), httpURLConnection, new u(httpURLConnection, rVar)));
            }
            return arrayList;
        }

        public final List<n0> d(InputStream inputStream, HttpURLConnection httpURLConnection, m0 requests) {
            kotlin.jvm.internal.n.e(requests, "requests");
            String t02 = com.facebook.internal.n0.t0(inputStream);
            com.facebook.internal.c0.f7719e.c(q0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(t02.length()), t02);
            return e(t02, httpURLConnection, requests);
        }

        public final List<n0> e(String responseString, HttpURLConnection httpURLConnection, m0 requests) {
            kotlin.jvm.internal.n.e(responseString, "responseString");
            kotlin.jvm.internal.n.e(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            kotlin.jvm.internal.n.d(resultObject, "resultObject");
            List<n0> c10 = c(httpURLConnection, requests, resultObject);
            com.facebook.internal.c0.f7719e.c(q0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.s(), Integer.valueOf(responseString.length()), c10);
            return c10;
        }

        public final List<n0> f(HttpURLConnection connection, m0 requests) {
            List<n0> a10;
            kotlin.jvm.internal.n.e(connection, "connection");
            kotlin.jvm.internal.n.e(requests, "requests");
            InputStream inputStream = null;
            try {
                try {
                } catch (r e10) {
                    com.facebook.internal.c0.f7719e.c(q0.REQUESTS, "Response", "Response <Error>: %s", e10);
                    a10 = a(requests, connection, e10);
                } catch (Exception e11) {
                    com.facebook.internal.c0.f7719e.c(q0.REQUESTS, "Response", "Response <Error>: %s", e11);
                    a10 = a(requests, connection, new r(e11));
                }
                if (!e0.E()) {
                    Log.e(n0.f17074j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new r("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                inputStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                a10 = d(inputStream, connection, requests);
                return a10;
            } finally {
                com.facebook.internal.n0.j(null);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(i0 request, HttpURLConnection httpURLConnection, u error) {
        this(request, httpURLConnection, null, null, null, error);
        kotlin.jvm.internal.n.e(request, "request");
        kotlin.jvm.internal.n.e(error, "error");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(i0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        kotlin.jvm.internal.n.e(request, "request");
        kotlin.jvm.internal.n.e(rawResponse, "rawResponse");
        kotlin.jvm.internal.n.e(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(i0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        kotlin.jvm.internal.n.e(request, "request");
        kotlin.jvm.internal.n.e(rawResponse, "rawResponse");
    }

    public n0(i0 request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, u uVar) {
        kotlin.jvm.internal.n.e(request, "request");
        this.f17075a = request;
        this.f17076b = httpURLConnection;
        this.f17077c = str;
        this.f17078d = jSONObject;
        this.f17079e = jSONArray;
        this.f17080f = uVar;
        this.f17081g = jSONObject;
        this.f17082h = jSONArray;
    }

    public final u b() {
        return this.f17080f;
    }

    public final JSONObject c() {
        return this.f17078d;
    }

    public final JSONObject d() {
        return this.f17081g;
    }

    public String toString() {
        String str;
        try {
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f17076b;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.n.d(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f17078d + ", error: " + this.f17080f + "}";
        kotlin.jvm.internal.n.d(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }
}
