package i4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.c0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import i4.i0;
import i4.m0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: n */
    public static final c f17005n = new c(null);

    /* renamed from: o */
    public static final String f17006o = i0.class.getSimpleName();

    /* renamed from: p */
    private static final String f17007p;

    /* renamed from: q */
    private static String f17008q;

    /* renamed from: r */
    private static final Pattern f17009r;

    /* renamed from: s */
    private static volatile String f17010s;

    /* renamed from: a */
    private i4.a f17011a;

    /* renamed from: b */
    private String f17012b;

    /* renamed from: c */
    private JSONObject f17013c;

    /* renamed from: d */
    private String f17014d;

    /* renamed from: e */
    private String f17015e;

    /* renamed from: f */
    private boolean f17016f;

    /* renamed from: g */
    private Bundle f17017g;

    /* renamed from: h */
    private Object f17018h;

    /* renamed from: i */
    private String f17019i;

    /* renamed from: j */
    private b f17020j;

    /* renamed from: k */
    private o0 f17021k;

    /* renamed from: l */
    private boolean f17022l;

    /* renamed from: m */
    private String f17023m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final i0 f17024a;

        /* renamed from: b */
        private final Object f17025b;

        public a(i0 request, Object obj) {
            kotlin.jvm.internal.n.e(request, "request");
            this.f17024a = request;
            this.f17025b = obj;
        }

        public final i0 a() {
            return this.f17024a;
        }

        public final Object b() {
            return this.f17025b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void b(n0 n0Var);
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            kotlin.jvm.internal.n.d(format, "iso8601DateFormat.format(value)");
            return format;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void D(org.json.JSONObject r10, java.lang.String r11, i4.i0.e r12) {
            /*
                r9 = this;
                boolean r0 = r9.u(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L23
                java.lang.String r4 = ":"
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                r3 = r11
                int r0 = xk.g.U(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = xk.g.U(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L23
                r3 = -1
                if (r11 == r3) goto L21
                if (r0 >= r11) goto L23
            L21:
                r11 = r1
                goto L24
            L23:
                r11 = r2
            L24:
                java.util.Iterator r0 = r10.keys()
            L28:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L53
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L44
                java.lang.String r5 = "image"
                boolean r5 = xk.g.r(r3, r5, r1)
                if (r5 == 0) goto L44
                r5 = r1
                goto L45
            L44:
                r5 = r2
            L45:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.n.d(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.n.d(r4, r6)
                r9.E(r3, r4, r12, r5)
                goto L28
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i4.i0.c.D(org.json.JSONObject, java.lang.String, i4.i0$e):void");
        }

        private final void E(String str, Object obj, e eVar, boolean z10) {
            String obj2;
            String jSONObject;
            String str2;
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (z10) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject2.opt(next);
                        kotlin.jvm.internal.n.d(opt, "jsonObject.opt(propertyName)");
                        E(format, opt, eVar, z10);
                    }
                    return;
                }
                if (jSONObject2.has(FacebookMediationAdapter.KEY_ID)) {
                    jSONObject = jSONObject2.optString(FacebookMediationAdapter.KEY_ID);
                    str2 = "jsonObject.optString(\"id\")";
                } else if (jSONObject2.has("url")) {
                    jSONObject = jSONObject2.optString("url");
                    str2 = "jsonObject.optString(\"url\")";
                } else {
                    if (!jSONObject2.has("fbsdk:create_object")) {
                        return;
                    }
                    jSONObject = jSONObject2.toString();
                    str2 = "jsonObject.toString()";
                }
                kotlin.jvm.internal.n.d(jSONObject, str2);
                E(str, jSONObject, eVar, z10);
                return;
            }
            if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    obj2 = obj.toString();
                } else {
                    if (!Date.class.isAssignableFrom(cls)) {
                        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                        com.facebook.internal.n0.k0(i0.f17006o, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                        return;
                    }
                    obj2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    kotlin.jvm.internal.n.d(obj2, "iso8601DateFormat.format(date)");
                }
                eVar.a(str, obj2);
                return;
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                kotlin.jvm.internal.a0 a0Var2 = kotlin.jvm.internal.a0.f20743a;
                String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                kotlin.jvm.internal.n.d(format2, "java.lang.String.format(locale, format, *args)");
                Object opt2 = jSONArray.opt(i10);
                kotlin.jvm.internal.n.d(opt2, "jsonArray.opt(i)");
                E(format2, opt2, eVar, z10);
                if (i11 >= length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        private final void F(m0 m0Var, com.facebook.internal.c0 c0Var, int i10, URL url, OutputStream outputStream, boolean z10) {
            h hVar = new h(outputStream, c0Var, z10);
            if (i10 != 1) {
                String p10 = p(m0Var);
                if (p10.length() == 0) {
                    throw new r("App ID was not specified at the request or Settings.");
                }
                hVar.a("batch_app_id", p10);
                HashMap hashMap = new HashMap();
                K(hVar, m0Var, hashMap);
                if (c0Var != null) {
                    c0Var.b("  Attachments:\n");
                }
                I(hashMap, hVar);
                return;
            }
            i0 i0Var = m0Var.get(0);
            HashMap hashMap2 = new HashMap();
            for (String key : i0Var.u().keySet()) {
                Object obj = i0Var.u().get(key);
                if (v(obj)) {
                    kotlin.jvm.internal.n.d(key, "key");
                    hashMap2.put(key, new a(i0Var, obj));
                }
            }
            if (c0Var != null) {
                c0Var.b("  Parameters:\n");
            }
            J(i0Var.u(), hVar, i0Var);
            if (c0Var != null) {
                c0Var.b("  Attachments:\n");
            }
            I(hashMap2, hVar);
            JSONObject q10 = i0Var.q();
            if (q10 != null) {
                String path = url.getPath();
                kotlin.jvm.internal.n.d(path, "url.path");
                D(q10, path, hVar);
            }
        }

        public static final void H(ArrayList callbacks, m0 requests) {
            kotlin.jvm.internal.n.e(callbacks, "$callbacks");
            kotlin.jvm.internal.n.e(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                b bVar = (b) pair.first;
                Object obj = pair.second;
                kotlin.jvm.internal.n.d(obj, "pair.second");
                bVar.b((n0) obj);
            }
            Iterator<m0.a> it2 = requests.r().iterator();
            while (it2.hasNext()) {
                it2.next().b(requests);
            }
        }

        private final void I(Map<String, a> map, h hVar) {
            for (Map.Entry<String, a> entry : map.entrySet()) {
                if (i0.f17005n.v(entry.getValue().b())) {
                    hVar.j(entry.getKey(), entry.getValue().b(), entry.getValue().a());
                }
            }
        }

        private final void J(Bundle bundle, h hVar, i0 i0Var) {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (w(obj)) {
                    kotlin.jvm.internal.n.d(key, "key");
                    hVar.j(key, obj, i0Var);
                }
            }
        }

        private final void K(h hVar, Collection<i0> collection, Map<String, a> map) {
            JSONArray jSONArray = new JSONArray();
            Iterator<i0> it = collection.iterator();
            while (it.hasNext()) {
                it.next().C(jSONArray, map);
            }
            hVar.l("batch", jSONArray, collection);
        }

        private final void M(HttpURLConnection httpURLConnection, boolean z10) {
            if (!z10) {
                httpURLConnection.setRequestProperty("Content-Type", q());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        private final HttpURLConnection g(URL url) {
            URLConnection openConnection = url.openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", r());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String p(m0 m0Var) {
            String p10 = m0Var.p();
            if (p10 != null && (!m0Var.isEmpty())) {
                return p10;
            }
            Iterator<i0> it = m0Var.iterator();
            while (it.hasNext()) {
                i4.a m10 = it.next().m();
                if (m10 != null) {
                    return m10.c();
                }
            }
            String str = i0.f17008q;
            if (str != null) {
                if (str.length() > 0) {
                    return str;
                }
            }
            return e0.m();
        }

        private final String q() {
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{i0.f17007p}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
            return format;
        }

        private final String r() {
            if (i0.f17010s == null) {
                kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "17.0.0"}, 2));
                kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
                i0.f17010s = format;
                String a10 = com.facebook.internal.z.a();
                if (!com.facebook.internal.n0.d0(a10)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{i0.f17010s, a10}, 2));
                    kotlin.jvm.internal.n.d(format2, "java.lang.String.format(locale, format, *args)");
                    i0.f17010s = format2;
                }
            }
            return i0.f17010s;
        }

        private final boolean s(m0 m0Var) {
            Iterator<m0.a> it = m0Var.r().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof m0.c) {
                    return true;
                }
            }
            Iterator<i0> it2 = m0Var.iterator();
            while (it2.hasNext()) {
                if (it2.next().o() instanceof f) {
                    return true;
                }
            }
            return false;
        }

        private final boolean t(m0 m0Var) {
            Iterator<i0> it = m0Var.iterator();
            while (it.hasNext()) {
                i0 next = it.next();
                Iterator<String> it2 = next.u().keySet().iterator();
                while (it2.hasNext()) {
                    if (v(next.u().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean u(String str) {
            boolean E;
            boolean E2;
            Matcher matcher = i0.f17009r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                kotlin.jvm.internal.n.d(str, "matcher.group(1)");
            }
            E = xk.p.E(str, "me/", false, 2, null);
            if (E) {
                return true;
            }
            E2 = xk.p.E(str, "/me/", false, 2, null);
            return E2;
        }

        public final boolean v(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof g);
        }

        public final boolean w(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        public static final void z(d dVar, n0 response) {
            kotlin.jvm.internal.n.e(response, "response");
            if (dVar == null) {
                return;
            }
            dVar.a(response.c(), response);
        }

        public final i0 A(i4.a aVar, String str, JSONObject jSONObject, b bVar) {
            i0 i0Var = new i0(aVar, str, null, o0.POST, bVar, null, 32, null);
            i0Var.F(jSONObject);
            return i0Var;
        }

        public final i0 B(i4.a aVar, String str, Bundle bundle, b bVar) {
            return new i0(aVar, str, bundle, o0.POST, bVar, null, 32, null);
        }

        public final void G(m0 requests, List<n0> responses) {
            kotlin.jvm.internal.n.e(requests, "requests");
            kotlin.jvm.internal.n.e(responses, "responses");
            int size = requests.size();
            ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    i0 i0Var = requests.get(i10);
                    if (i0Var.o() != null) {
                        arrayList.add(new Pair(i0Var.o(), responses.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (arrayList.size() > 0) {
                j0 j0Var = new Runnable() { // from class: i4.j0

                    /* renamed from: a */
                    public final /* synthetic */ ArrayList f17036a;

                    /* renamed from: b */
                    public final /* synthetic */ m0 f17037b;

                    public /* synthetic */ j0(ArrayList arrayList2, m0 requests2) {
                        r1 = arrayList2;
                        r2 = requests2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        i0.c.H(r1, r2);
                    }
                };
                Handler q10 = requests2.q();
                if ((q10 == null ? null : Boolean.valueOf(q10.post(j0Var))) == null) {
                    j0Var.run();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void L(i4.m0 r14, java.net.HttpURLConnection r15) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: i4.i0.c.L(i4.m0, java.net.HttpURLConnection):void");
        }

        public final HttpURLConnection N(m0 requests) {
            kotlin.jvm.internal.n.e(requests, "requests");
            O(requests);
            try {
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = g(requests.size() == 1 ? new URL(requests.get(0).x()) : new URL(com.facebook.internal.h0.h()));
                    L(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e10) {
                    com.facebook.internal.n0.r(httpURLConnection);
                    throw new r("could not construct request body", e10);
                } catch (JSONException e11) {
                    com.facebook.internal.n0.r(httpURLConnection);
                    throw new r("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new r("could not construct URL for request", e12);
            }
        }

        public final void O(m0 requests) {
            kotlin.jvm.internal.n.e(requests, "requests");
            Iterator<i0> it = requests.iterator();
            while (it.hasNext()) {
                i0 next = it.next();
                if (o0.GET == next.t()) {
                    com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                    if (com.facebook.internal.n0.d0(next.u().getString("fields"))) {
                        c0.a aVar = com.facebook.internal.c0.f7719e;
                        q0 q0Var = q0.DEVELOPER_ERRORS;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("GET requests for /");
                        String r10 = next.r();
                        if (r10 == null) {
                            r10 = "";
                        }
                        sb2.append(r10);
                        sb2.append(" should contain an explicit \"fields\" parameter.");
                        aVar.a(q0Var, 5, "Request", sb2.toString());
                    }
                }
            }
        }

        public final n0 h(i0 request) {
            kotlin.jvm.internal.n.e(request, "request");
            List<n0> k10 = k(request);
            if (k10.size() == 1) {
                return k10.get(0);
            }
            throw new r("invalid state: expected a single response");
        }

        public final List<n0> i(m0 requests) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<n0> list;
            kotlin.jvm.internal.n.e(requests, "requests");
            com.facebook.internal.o0.i(requests, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = N(requests);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                com.facebook.internal.n0.r(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = o(httpURLConnection, requests);
                } else {
                    List<n0> a10 = n0.f17073i.a(requests.t(), null, new r(exc));
                    G(requests, a10);
                    list = a10;
                }
                com.facebook.internal.n0.r(httpURLConnection);
                return list;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                com.facebook.internal.n0.r(httpURLConnection2);
                throw th;
            }
        }

        public final List<n0> j(Collection<i0> requests) {
            kotlin.jvm.internal.n.e(requests, "requests");
            return i(new m0(requests));
        }

        public final List<n0> k(i0... requests) {
            List e02;
            kotlin.jvm.internal.n.e(requests, "requests");
            e02 = dk.m.e0(requests);
            return j(e02);
        }

        public final l0 l(m0 requests) {
            kotlin.jvm.internal.n.e(requests, "requests");
            com.facebook.internal.o0.i(requests, "requests");
            l0 l0Var = new l0(requests);
            l0Var.executeOnExecutor(e0.t(), new Void[0]);
            return l0Var;
        }

        public final l0 m(Collection<i0> requests) {
            kotlin.jvm.internal.n.e(requests, "requests");
            return l(new m0(requests));
        }

        public final l0 n(i0... requests) {
            List e02;
            kotlin.jvm.internal.n.e(requests, "requests");
            e02 = dk.m.e0(requests);
            return m(e02);
        }

        public final List<n0> o(HttpURLConnection connection, m0 requests) {
            kotlin.jvm.internal.n.e(connection, "connection");
            kotlin.jvm.internal.n.e(requests, "requests");
            List<n0> f10 = n0.f17073i.f(connection, requests);
            com.facebook.internal.n0.r(connection);
            int size = requests.size();
            if (size == f10.size()) {
                G(requests, f10);
                i4.g.f16980f.e().h();
                return f10;
            }
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(f10.size()), Integer.valueOf(size)}, 2));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(locale, format, *args)");
            throw new r(format);
        }

        public final i0 x(i4.a aVar, String str, b bVar) {
            return new i0(aVar, str, null, null, bVar, null, 32, null);
        }

        public final i0 y(i4.a aVar, d dVar) {
            return new i0(aVar, "me", null, null, new b() { // from class: i4.k0
                public /* synthetic */ k0() {
                }

                @Override // i4.i0.b
                public final void b(n0 n0Var) {
                    i0.c.z(i0.d.this, n0Var);
                }
            }, null, 32, null);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(JSONObject jSONObject, n0 n0Var);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(String str, String str2);
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        void a(long j10, long j11);
    }

    /* loaded from: classes.dex */
    public static final class g<RESOURCE extends Parcelable> implements Parcelable {

        /* renamed from: a */
        private final String f17027a;

        /* renamed from: b */
        private final RESOURCE f17028b;

        /* renamed from: c */
        public static final b f17026c = new b(null);
        public static final Parcelable.Creator<g<?>> CREATOR = new a();

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<g<?>> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g<?> createFromParcel(Parcel source) {
                kotlin.jvm.internal.n.e(source, "source");
                return new g<>(source, (kotlin.jvm.internal.g) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public g<?>[] newArray(int i10) {
                return new g[i10];
            }
        }

        /* loaded from: classes.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        private g(Parcel parcel) {
            this.f17027a = parcel.readString();
            this.f17028b = (RESOURCE) parcel.readParcelable(e0.l().getClassLoader());
        }

        public /* synthetic */ g(Parcel parcel, kotlin.jvm.internal.g gVar) {
            this(parcel);
        }

        public g(RESOURCE resource, String str) {
            this.f17027a = str;
            this.f17028b = resource;
        }

        public final String a() {
            return this.f17027a;
        }

        public final RESOURCE b() {
            return this.f17028b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i10) {
            kotlin.jvm.internal.n.e(out, "out");
            out.writeString(this.f17027a);
            out.writeParcelable(this.f17028b, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements e {

        /* renamed from: a */
        private final OutputStream f17029a;

        /* renamed from: b */
        private final com.facebook.internal.c0 f17030b;

        /* renamed from: c */
        private boolean f17031c;

        /* renamed from: d */
        private final boolean f17032d;

        public h(OutputStream outputStream, com.facebook.internal.c0 c0Var, boolean z10) {
            kotlin.jvm.internal.n.e(outputStream, "outputStream");
            this.f17029a = outputStream;
            this.f17030b = c0Var;
            this.f17031c = true;
            this.f17032d = z10;
        }

        private final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // i4.i0.e
        public void a(String key, String value) {
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(value, "value");
            f(key, null, null);
            i("%s", value);
            k();
            com.facebook.internal.c0 c0Var = this.f17030b;
            if (c0Var == null) {
                return;
            }
            c0Var.d(kotlin.jvm.internal.n.k("    ", key), value);
        }

        public final void c(String format, Object... args) {
            kotlin.jvm.internal.n.e(format, "format");
            kotlin.jvm.internal.n.e(args, "args");
            if (this.f17032d) {
                OutputStream outputStream = this.f17029a;
                kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.n.d(format2, "java.lang.String.format(locale, format, *args)");
                String encode = URLEncoder.encode(format2, "UTF-8");
                kotlin.jvm.internal.n.d(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = encode.getBytes(xk.d.f31393b);
                kotlin.jvm.internal.n.d(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f17031c) {
                OutputStream outputStream2 = this.f17029a;
                Charset charset = xk.d.f31393b;
                byte[] bytes2 = "--".getBytes(charset);
                kotlin.jvm.internal.n.d(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f17029a;
                String str = i0.f17007p;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str.getBytes(charset);
                kotlin.jvm.internal.n.d(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f17029a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                kotlin.jvm.internal.n.d(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f17031c = false;
            }
            OutputStream outputStream5 = this.f17029a;
            kotlin.jvm.internal.a0 a0Var2 = kotlin.jvm.internal.a0.f20743a;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format3 = String.format(format, Arrays.copyOf(copyOf2, copyOf2.length));
            kotlin.jvm.internal.n.d(format3, "java.lang.String.format(format, *args)");
            Charset charset2 = xk.d.f31393b;
            if (format3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes5 = format3.getBytes(charset2);
            kotlin.jvm.internal.n.d(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String key, Bitmap bitmap) {
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(bitmap, "bitmap");
            f(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f17029a);
            i("", new Object[0]);
            k();
            com.facebook.internal.c0 c0Var = this.f17030b;
            if (c0Var == null) {
                return;
            }
            c0Var.d(kotlin.jvm.internal.n.k("    ", key), "<Image>");
        }

        public final void e(String key, byte[] bytes) {
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(bytes, "bytes");
            f(key, key, "content/unknown");
            this.f17029a.write(bytes);
            i("", new Object[0]);
            k();
            com.facebook.internal.c0 c0Var = this.f17030b;
            if (c0Var == null) {
                return;
            }
            String k10 = kotlin.jvm.internal.n.k("    ", key);
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(locale, format, *args)");
            c0Var.d(k10, format);
        }

        public final void f(String str, String str2, String str3) {
            if (!this.f17032d) {
                c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    c("; filename=\"%s\"", str2);
                }
                i("", new Object[0]);
                if (str3 != null) {
                    i("%s: %s", "Content-Type", str3);
                }
                i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f17029a;
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
            Charset charset = xk.d.f31393b;
            if (format == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = format.getBytes(charset);
            kotlin.jvm.internal.n.d(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void g(String key, Uri contentUri, String str) {
            int q10;
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            if (this.f17029a instanceof v0) {
                ((v0) this.f17029a).b(com.facebook.internal.n0.A(contentUri));
                q10 = 0;
            } else {
                InputStream openInputStream = e0.l().getContentResolver().openInputStream(contentUri);
                com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                q10 = com.facebook.internal.n0.q(openInputStream, this.f17029a) + 0;
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.c0 c0Var = this.f17030b;
            if (c0Var == null) {
                return;
            }
            String k10 = kotlin.jvm.internal.n.k("    ", key);
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(q10)}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(locale, format, *args)");
            c0Var.d(k10, format);
        }

        public final void h(String key, ParcelFileDescriptor descriptor, String str) {
            int q10;
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            OutputStream outputStream = this.f17029a;
            if (outputStream instanceof v0) {
                ((v0) outputStream).b(descriptor.getStatSize());
                q10 = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                q10 = com.facebook.internal.n0.q(autoCloseInputStream, this.f17029a) + 0;
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.c0 c0Var = this.f17030b;
            if (c0Var == null) {
                return;
            }
            String k10 = kotlin.jvm.internal.n.k("    ", key);
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(q10)}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(locale, format, *args)");
            c0Var.d(k10, format);
        }

        public final void i(String format, Object... args) {
            kotlin.jvm.internal.n.e(format, "format");
            kotlin.jvm.internal.n.e(args, "args");
            c(format, Arrays.copyOf(args, args.length));
            if (this.f17032d) {
                return;
            }
            c("\r\n", new Object[0]);
        }

        public final void j(String key, Object obj, i0 i0Var) {
            kotlin.jvm.internal.n.e(key, "key");
            Closeable closeable = this.f17029a;
            if (closeable instanceof y0) {
                ((y0) closeable).a(i0Var);
            }
            c cVar = i0.f17005n;
            if (cVar.w(obj)) {
                a(key, cVar.C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                d(key, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                e(key, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                g(key, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof g)) {
                throw b();
            }
            g gVar = (g) obj;
            Parcelable b10 = gVar.b();
            String a10 = gVar.a();
            if (b10 instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) b10, a10);
            } else {
                if (!(b10 instanceof Uri)) {
                    throw b();
                }
                g(key, (Uri) b10, a10);
            }
        }

        public final void k() {
            if (!this.f17032d) {
                i("--%s", i0.f17007p);
                return;
            }
            OutputStream outputStream = this.f17029a;
            byte[] bytes = "&".getBytes(xk.d.f31393b);
            kotlin.jvm.internal.n.d(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String key, JSONArray requestJsonArray, Collection<i0> requests) {
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(requestJsonArray, "requestJsonArray");
            kotlin.jvm.internal.n.e(requests, "requests");
            Closeable closeable = this.f17029a;
            if (!(closeable instanceof y0)) {
                String jSONArray = requestJsonArray.toString();
                kotlin.jvm.internal.n.d(jSONArray, "requestJsonArray.toString()");
                a(key, jSONArray);
                return;
            }
            y0 y0Var = (y0) closeable;
            f(key, null, null);
            c("[", new Object[0]);
            int i10 = 0;
            for (i0 i0Var : requests) {
                int i11 = i10 + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i10);
                y0Var.a(i0Var);
                if (i10 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            c("]", new Object[0]);
            com.facebook.internal.c0 c0Var = this.f17030b;
            if (c0Var == null) {
                return;
            }
            String k10 = kotlin.jvm.internal.n.k("    ", key);
            String jSONArray2 = requestJsonArray.toString();
            kotlin.jvm.internal.n.d(jSONArray2, "requestJsonArray.toString()");
            c0Var.d(k10, jSONArray2);
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements e {

        /* renamed from: a */
        final /* synthetic */ ArrayList<String> f17033a;

        i(ArrayList<String> arrayList) {
            this.f17033a = arrayList;
        }

        @Override // i4.i0.e
        public void a(String key, String value) {
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(value, "value");
            ArrayList<String> arrayList = this.f17033a;
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        kotlin.jvm.internal.n.d(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i10 = 0;
            do {
                i10++;
                sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i10 < nextInt);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "buffer.toString()");
        f17007p = sb3;
        f17009r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public i0() {
        this(null, null, null, null, null, null, 63, null);
    }

    public i0(i4.a aVar, String str, Bundle bundle, o0 o0Var, b bVar, String str2) {
        this.f17016f = true;
        this.f17011a = aVar;
        this.f17012b = str;
        this.f17019i = str2;
        D(bVar);
        G(o0Var);
        this.f17017g = bundle != null ? new Bundle(bundle) : new Bundle();
        if (this.f17019i == null) {
            this.f17019i = e0.w();
        }
    }

    public /* synthetic */ i0(i4.a aVar, String str, Bundle bundle, o0 o0Var, b bVar, String str2, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? null : o0Var, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : str2);
    }

    private final boolean A() {
        if (kotlin.jvm.internal.n.a(e0.x(), "instagram.com")) {
            return !z();
        }
        return true;
    }

    public static final i0 B(i4.a aVar, d dVar) {
        return f17005n.y(aVar, dVar);
    }

    public final void C(JSONArray jSONArray, Map<String, a> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f17014d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f17016f);
        }
        String str2 = this.f17015e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String v10 = v();
        jSONObject.put("relative_url", v10);
        jSONObject.put(Constants.METHOD, this.f17021k);
        i4.a aVar = this.f17011a;
        if (aVar != null) {
            com.facebook.internal.c0.f7719e.d(aVar.m());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f17017g.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f17017g.get(it.next());
            if (f17005n.v(obj)) {
                kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{Constants.FILE, Integer.valueOf(map.size())}, 2));
                kotlin.jvm.internal.n.d(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f17013c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f17005n.D(jSONObject2, v10, new i(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private final boolean J() {
        boolean z10;
        boolean E;
        String n10 = n();
        boolean J = n10 == null ? false : xk.q.J(n10, "|", false, 2, null);
        if (n10 != null) {
            E = xk.p.E(n10, "IG", false, 2, null);
            if (E && !J) {
                z10 = true;
                if (z10 || !z()) {
                    return A() && !J;
                }
                return true;
            }
        }
        z10 = false;
        if (z10) {
        }
        if (A()) {
        }
    }

    public static final void b(b bVar, n0 response) {
        int length;
        kotlin.jvm.internal.n.e(response, "response");
        JSONObject c10 = response.c();
        JSONObject optJSONObject = c10 == null ? null : c10.optJSONObject("__debug__");
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray("messages");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                String optString = optJSONObject2 == null ? null : optJSONObject2.optString(Constants.MESSAGE);
                String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString("type");
                String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString("link");
                if (optString != null && optString2 != null) {
                    q0 q0Var = q0.GRAPH_API_DEBUG_INFO;
                    if (kotlin.jvm.internal.n.a(optString2, "warning")) {
                        q0Var = q0.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!com.facebook.internal.n0.d0(optString3)) {
                        optString = ((Object) optString) + " Link: " + ((Object) optString3);
                    }
                    c0.a aVar = com.facebook.internal.c0.f7719e;
                    String TAG = f17006o;
                    kotlin.jvm.internal.n.d(TAG, "TAG");
                    aVar.b(q0Var, TAG, optString);
                }
                if (i11 >= length) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        if (bVar == null) {
            return;
        }
        bVar.b(response);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 java.lang.String, still in use, count: 2, list:
          (r1v1 java.lang.String) from 0x0016: IF  (r1v1 java.lang.String) != (null java.lang.String)  -> B:4:0x000e A[HIDDEN]
          (r1v1 java.lang.String) from 0x000e: PHI (r1v17 java.lang.String) = (r1v1 java.lang.String) binds: [B:21:0x0016] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private final void i() {
        /*
            r3 = this;
            android.os.Bundle r0 = r3.f17017g
            boolean r1 = r3.J()
            java.lang.String r2 = "access_token"
            if (r1 == 0) goto L12
            java.lang.String r1 = r3.p()
        Le:
            r0.putString(r2, r1)
            goto L19
        L12:
            java.lang.String r1 = r3.n()
            if (r1 == 0) goto L19
            goto Le
        L19:
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto L32
            com.facebook.internal.n0 r1 = com.facebook.internal.n0.f7780a
            java.lang.String r1 = i4.e0.r()
            boolean r1 = com.facebook.internal.n0.d0(r1)
            if (r1 == 0) goto L32
            java.lang.String r1 = i4.i0.f17006o
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
        L32:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            i4.e0 r1 = i4.e0.f16948a
            i4.q0 r1 = i4.q0.GRAPH_API_DEBUG_INFO
            boolean r1 = i4.e0.H(r1)
            java.lang.String r2 = "debug"
            if (r1 == 0) goto L52
            java.lang.String r1 = "info"
        L4e:
            r0.putString(r2, r1)
            goto L5d
        L52:
            i4.q0 r1 = i4.q0.GRAPH_API_DEBUG_WARNING
            boolean r1 = i4.e0.H(r1)
            if (r1 == 0) goto L5d
            java.lang.String r1 = "warning"
            goto L4e
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.i0.i():void");
    }

    private final String j(String str, boolean z10) {
        if (!z10 && this.f17021k == o0.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f17017g.keySet()) {
            Object obj = this.f17017g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = f17005n;
            if (cVar.w(obj)) {
                buildUpon.appendQueryParameter(str2, cVar.C(obj).toString());
            } else if (this.f17021k != o0.GET) {
                kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                kotlin.jvm.internal.n.d(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        kotlin.jvm.internal.n.d(builder, "uriBuilder.toString()");
        return builder;
    }

    private final String n() {
        i4.a aVar = this.f17011a;
        if (aVar != null) {
            if (!this.f17017g.containsKey("access_token")) {
                String m10 = aVar.m();
                com.facebook.internal.c0.f7719e.d(m10);
                return m10;
            }
        } else if (!this.f17017g.containsKey("access_token")) {
            return p();
        }
        return this.f17017g.getString("access_token");
    }

    private final String p() {
        String m10 = e0.m();
        String r10 = e0.r();
        if (m10.length() > 0) {
            if (r10.length() > 0) {
                return m10 + '|' + r10;
            }
        }
        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
        com.facebook.internal.n0.k0(f17006o, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    private final String s() {
        if (f17009r.matcher(this.f17012b).matches()) {
            return this.f17012b;
        }
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f17019i, this.f17012b}, 2));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String y(String str) {
        if (!A()) {
            str = com.facebook.internal.h0.f();
        }
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, s()}, 2));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean z() {
        if (this.f17012b == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^/?");
        sb2.append(e0.m());
        sb2.append("/?.*");
        return this.f17022l || Pattern.matches(sb2.toString(), this.f17012b) || Pattern.matches("^/?app/?.*", this.f17012b);
    }

    public final void D(b bVar) {
        e0 e0Var = e0.f16948a;
        if (e0.H(q0.GRAPH_API_DEBUG_INFO) || e0.H(q0.GRAPH_API_DEBUG_WARNING)) {
            this.f17020j = new b() { // from class: i4.h0
                public /* synthetic */ h0() {
                }

                @Override // i4.i0.b
                public final void b(n0 n0Var) {
                    i0.b(i0.b.this, n0Var);
                }
            };
        } else {
            this.f17020j = bVar;
        }
    }

    public final void E(boolean z10) {
        this.f17022l = z10;
    }

    public final void F(JSONObject jSONObject) {
        this.f17013c = jSONObject;
    }

    public final void G(o0 o0Var) {
        if (this.f17023m != null && o0Var != o0.GET) {
            throw new r("Can't change HTTP method on request with overridden URL.");
        }
        if (o0Var == null) {
            o0Var = o0.GET;
        }
        this.f17021k = o0Var;
    }

    public final void H(Bundle bundle) {
        kotlin.jvm.internal.n.e(bundle, "<set-?>");
        this.f17017g = bundle;
    }

    public final void I(Object obj) {
        this.f17018h = obj;
    }

    public final n0 k() {
        return f17005n.h(this);
    }

    public final l0 l() {
        return f17005n.n(this);
    }

    public final i4.a m() {
        return this.f17011a;
    }

    public final b o() {
        return this.f17020j;
    }

    public final JSONObject q() {
        return this.f17013c;
    }

    public final String r() {
        return this.f17012b;
    }

    public final o0 t() {
        return this.f17021k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.f17011a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f17012b);
        sb2.append(", graphObject: ");
        sb2.append(this.f17013c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f17021k);
        sb2.append(", parameters: ");
        sb2.append(this.f17017g);
        sb2.append("}");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }

    public final Bundle u() {
        return this.f17017g;
    }

    public final String v() {
        if (this.f17023m != null) {
            throw new r("Can't override URL for a batch request");
        }
        String y10 = y(com.facebook.internal.h0.h());
        i();
        Uri parse = Uri.parse(j(y10, true));
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final Object w() {
        return this.f17018h;
    }

    public final String x() {
        String i10;
        boolean q10;
        String str = this.f17023m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f17012b;
        if (this.f17021k == o0.POST && str2 != null) {
            q10 = xk.p.q(str2, "/videos", false, 2, null);
            if (q10) {
                i10 = com.facebook.internal.h0.j();
                String y10 = y(i10);
                i();
                return j(y10, false);
            }
        }
        com.facebook.internal.h0 h0Var = com.facebook.internal.h0.f7758a;
        i10 = com.facebook.internal.h0.i(e0.x());
        String y102 = y(i10);
        i();
        return j(y102, false);
    }
}
