package p152i4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4622h0;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4636o0;
import com.facebook.internal.C4652z;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dk.C7021m;
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
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7807i0;
import p152i4.C7815m0;
import p450xk.C12512d;
import p450xk.C12524p;
import p450xk.C12525q;

/* renamed from: i4.i0 */
/* loaded from: classes.dex */
public final class C7807i0 {

    /* renamed from: n */
    public static final c f18658n = new c(null);

    /* renamed from: o */
    public static final String f18659o = C7807i0.class.getSimpleName();

    /* renamed from: p */
    private static final String f18660p;

    /* renamed from: q */
    private static String f18661q;

    /* renamed from: r */
    private static final Pattern f18662r;

    /* renamed from: s */
    private static volatile String f18663s;

    /* renamed from: a */
    private C7787a f18664a;

    /* renamed from: b */
    private String f18665b;

    /* renamed from: c */
    private JSONObject f18666c;

    /* renamed from: d */
    private String f18667d;

    /* renamed from: e */
    private String f18668e;

    /* renamed from: f */
    private boolean f18669f;

    /* renamed from: g */
    private Bundle f18670g;

    /* renamed from: h */
    private Object f18671h;

    /* renamed from: i */
    private String f18672i;

    /* renamed from: j */
    private b f18673j;

    /* renamed from: k */
    private EnumC7819o0 f18674k;

    /* renamed from: l */
    private boolean f18675l;

    /* renamed from: m */
    private String f18676m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i4.i0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final C7807i0 f18677a;

        /* renamed from: b */
        private final Object f18678b;

        public a(C7807i0 request, Object obj) {
            C9322n.m27781e(request, "request");
            this.f18677a = request;
            this.f18678b = obj;
        }

        /* renamed from: a */
        public final C7807i0 m23960a() {
            return this.f18677a;
        }

        /* renamed from: b */
        public final Object m23961b() {
            return this.f18678b;
        }
    }

    /* renamed from: i4.i0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: b */
        void mo9121b(C7817n0 c7817n0);
    }

    /* renamed from: i4.i0$c */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final String m23962C(Object obj) {
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
            C9322n.m27780d(format, "iso8601DateFormat.format(value)");
            return format;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /* renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m23963D(org.json.JSONObject r10, java.lang.String r11, p152i4.C7807i0.e r12) {
            /*
                r9 = this;
                boolean r0 = r9.m23983u(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L23
                java.lang.String r4 = ":"
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                r3 = r11
                int r0 = p450xk.C12515g.m40989U(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = p450xk.C12515g.m40989U(r3, r4, r5, r6, r7, r8)
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
                boolean r5 = p450xk.C12515g.m41005r(r3, r5, r1)
                if (r5 == 0) goto L44
                r5 = r1
                goto L45
            L44:
                r5 = r2
            L45:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.C9322n.m27780d(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.C9322n.m27780d(r4, r6)
                r9.m23964E(r3, r4, r12, r5)
                goto L28
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p152i4.C7807i0.c.m23963D(org.json.JSONObject, java.lang.String, i4.i0$e):void");
        }

        /* renamed from: E */
        private final void m23964E(String str, Object obj, e eVar, boolean z10) {
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
                        C9308a0 c9308a0 = C9308a0.f22565a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject2.opt(next);
                        C9322n.m27780d(opt, "jsonObject.opt(propertyName)");
                        m23964E(format, opt, eVar, z10);
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
                C9322n.m27780d(jSONObject, str2);
                m23964E(str, jSONObject, eVar, z10);
                return;
            }
            if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    obj2 = obj.toString();
                } else {
                    if (!Date.class.isAssignableFrom(cls)) {
                        C4634n0 c4634n0 = C4634n0.f8760a;
                        C4634n0.m11314k0(C7807i0.f18659o, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                        return;
                    }
                    obj2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    C9322n.m27780d(obj2, "iso8601DateFormat.format(date)");
                }
                eVar.mo24004a(str, obj2);
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
                C9308a0 c9308a02 = C9308a0.f22565a;
                String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                C9322n.m27780d(format2, "java.lang.String.format(locale, format, *args)");
                Object opt2 = jSONArray.opt(i10);
                C9322n.m27780d(opt2, "jsonArray.opt(i)");
                m23964E(format2, opt2, eVar, z10);
                if (i11 >= length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        /* renamed from: F */
        private final void m23965F(C7815m0 c7815m0, C4612c0 c4612c0, int i10, URL url, OutputStream outputStream, boolean z10) {
            h hVar = new h(outputStream, c4612c0, z10);
            if (i10 != 1) {
                String m23978p = m23978p(c7815m0);
                if (m23978p.length() == 0) {
                    throw new C7824r("App ID was not specified at the request or Settings.");
                }
                hVar.mo24004a("batch_app_id", m23978p);
                HashMap hashMap = new HashMap();
                m23969K(hVar, c7815m0, hashMap);
                if (c4612c0 != null) {
                    c4612c0.m11131b("  Attachments:\n");
                }
                m23967I(hashMap, hVar);
                return;
            }
            C7807i0 c7807i0 = c7815m0.get(0);
            HashMap hashMap2 = new HashMap();
            for (String key : c7807i0.m23956u().keySet()) {
                Object obj = c7807i0.m23956u().get(key);
                if (m23984v(obj)) {
                    C9322n.m27780d(key, "key");
                    hashMap2.put(key, new a(c7807i0, obj));
                }
            }
            if (c4612c0 != null) {
                c4612c0.m11131b("  Parameters:\n");
            }
            m23968J(c7807i0.m23956u(), hVar, c7807i0);
            if (c4612c0 != null) {
                c4612c0.m11131b("  Attachments:\n");
            }
            m23967I(hashMap2, hVar);
            JSONObject m23953q = c7807i0.m23953q();
            if (m23953q != null) {
                String path = url.getPath();
                C9322n.m27780d(path, "url.path");
                m23963D(m23953q, path, hVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public static final void m23966H(ArrayList callbacks, C7815m0 requests) {
            C9322n.m27781e(callbacks, "$callbacks");
            C9322n.m27781e(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                b bVar = (b) pair.first;
                Object obj = pair.second;
                C9322n.m27780d(obj, "pair.second");
                bVar.mo9121b((C7817n0) obj);
            }
            Iterator<C7815m0.a> it2 = requests.m24050r().iterator();
            while (it2.hasNext()) {
                it2.next().mo23876b(requests);
            }
        }

        /* renamed from: I */
        private final void m23967I(Map<String, a> map, h hVar) {
            for (Map.Entry<String, a> entry : map.entrySet()) {
                if (C7807i0.f18658n.m23984v(entry.getValue().m23961b())) {
                    hVar.m24018j(entry.getKey(), entry.getValue().m23961b(), entry.getValue().m23960a());
                }
            }
        }

        /* renamed from: J */
        private final void m23968J(Bundle bundle, h hVar, C7807i0 c7807i0) {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (m23985w(obj)) {
                    C9322n.m27780d(key, "key");
                    hVar.m24018j(key, obj, c7807i0);
                }
            }
        }

        /* renamed from: K */
        private final void m23969K(h hVar, Collection<C7807i0> collection, Map<String, a> map) {
            JSONArray jSONArray = new JSONArray();
            Iterator<C7807i0> it = collection.iterator();
            while (it.hasNext()) {
                it.next().m23926C(jSONArray, map);
            }
            hVar.m24020l("batch", jSONArray, collection);
        }

        /* renamed from: M */
        private final void m23970M(HttpURLConnection httpURLConnection, boolean z10) {
            if (!z10) {
                httpURLConnection.setRequestProperty("Content-Type", m23979q());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        /* renamed from: g */
        private final HttpURLConnection m23977g(URL url) {
            URLConnection openConnection = url.openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", m23980r());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        /* renamed from: p */
        private final String m23978p(C7815m0 c7815m0) {
            String m24048p = c7815m0.m24048p();
            if (m24048p != null && (!c7815m0.isEmpty())) {
                return m24048p;
            }
            Iterator<C7807i0> it = c7815m0.iterator();
            while (it.hasNext()) {
                C7787a m23951m = it.next().m23951m();
                if (m23951m != null) {
                    return m23951m.m23761c();
                }
            }
            String str = C7807i0.f18661q;
            if (str != null) {
                if (str.length() > 0) {
                    return str;
                }
            }
            return C7799e0.m23861m();
        }

        /* renamed from: q */
        private final String m23979q() {
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{C7807i0.f18660p}, 1));
            C9322n.m27780d(format, "java.lang.String.format(format, *args)");
            return format;
        }

        /* renamed from: r */
        private final String m23980r() {
            if (C7807i0.f18663s == null) {
                C9308a0 c9308a0 = C9308a0.f22565a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "17.0.0"}, 2));
                C9322n.m27780d(format, "java.lang.String.format(format, *args)");
                C7807i0.f18663s = format;
                String m11468a = C4652z.m11468a();
                if (!C4634n0.m11300d0(m11468a)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{C7807i0.f18663s, m11468a}, 2));
                    C9322n.m27780d(format2, "java.lang.String.format(locale, format, *args)");
                    C7807i0.f18663s = format2;
                }
            }
            return C7807i0.f18663s;
        }

        /* renamed from: s */
        private final boolean m23981s(C7815m0 c7815m0) {
            Iterator<C7815m0.a> it = c7815m0.m24050r().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C7815m0.c) {
                    return true;
                }
            }
            Iterator<C7807i0> it2 = c7815m0.iterator();
            while (it2.hasNext()) {
                if (it2.next().m23952o() instanceof f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: t */
        private final boolean m23982t(C7815m0 c7815m0) {
            Iterator<C7807i0> it = c7815m0.iterator();
            while (it.hasNext()) {
                C7807i0 next = it.next();
                Iterator<String> it2 = next.m23956u().keySet().iterator();
                while (it2.hasNext()) {
                    if (m23984v(next.m23956u().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: u */
        private final boolean m23983u(String str) {
            boolean m41031E;
            boolean m41031E2;
            Matcher matcher = C7807i0.f18662r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                C9322n.m27780d(str, "matcher.group(1)");
            }
            m41031E = C12524p.m41031E(str, "me/", false, 2, null);
            if (m41031E) {
                return true;
            }
            m41031E2 = C12524p.m41031E(str, "/me/", false, 2, null);
            return m41031E2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public final boolean m23984v(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public final boolean m23985w(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static final void m23986z(d dVar, C7817n0 response) {
            C9322n.m27781e(response, "response");
            if (dVar == null) {
                return;
            }
            dVar.mo24003a(response.m24062c(), response);
        }

        /* renamed from: A */
        public final C7807i0 m23987A(C7787a c7787a, String str, JSONObject jSONObject, b bVar) {
            C7807i0 c7807i0 = new C7807i0(c7787a, str, null, EnumC7819o0.POST, bVar, null, 32, null);
            c7807i0.m23945F(jSONObject);
            return c7807i0;
        }

        /* renamed from: B */
        public final C7807i0 m23988B(C7787a c7787a, String str, Bundle bundle, b bVar) {
            return new C7807i0(c7787a, str, bundle, EnumC7819o0.POST, bVar, null, 32, null);
        }

        /* renamed from: G */
        public final void m23989G(final C7815m0 requests, List<C7817n0> responses) {
            C9322n.m27781e(requests, "requests");
            C9322n.m27781e(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    C7807i0 c7807i0 = requests.get(i10);
                    if (c7807i0.m23952o() != null) {
                        arrayList.add(new Pair(c7807i0.m23952o(), responses.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: i4.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7807i0.c.m23966H(arrayList, requests);
                    }
                };
                Handler m24049q = requests.m24049q();
                if ((m24049q == null ? null : Boolean.valueOf(m24049q.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
        /* renamed from: L */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m23990L(p152i4.C7815m0 r14, java.net.HttpURLConnection r15) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p152i4.C7807i0.c.m23990L(i4.m0, java.net.HttpURLConnection):void");
        }

        /* renamed from: N */
        public final HttpURLConnection m23991N(C7815m0 requests) {
            C9322n.m27781e(requests, "requests");
            m23992O(requests);
            try {
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = m23977g(requests.size() == 1 ? new URL(requests.get(0).m23959x()) : new URL(C4622h0.m11217h()));
                    m23990L(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e10) {
                    C4634n0.m11327r(httpURLConnection);
                    throw new C7824r("could not construct request body", e10);
                } catch (JSONException e11) {
                    C4634n0.m11327r(httpURLConnection);
                    throw new C7824r("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new C7824r("could not construct URL for request", e12);
            }
        }

        /* renamed from: O */
        public final void m23992O(C7815m0 requests) {
            C9322n.m27781e(requests, "requests");
            Iterator<C7807i0> it = requests.iterator();
            while (it.hasNext()) {
                C7807i0 next = it.next();
                if (EnumC7819o0.GET == next.m23955t()) {
                    C4634n0 c4634n0 = C4634n0.f8760a;
                    if (C4634n0.m11300d0(next.m23956u().getString("fields"))) {
                        C4612c0.a aVar = C4612c0.f8694e;
                        EnumC7823q0 enumC7823q0 = EnumC7823q0.DEVELOPER_ERRORS;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("GET requests for /");
                        String m23954r = next.m23954r();
                        if (m23954r == null) {
                            m23954r = "";
                        }
                        sb2.append(m23954r);
                        sb2.append(" should contain an explicit \"fields\" parameter.");
                        aVar.m11137a(enumC7823q0, 5, "Request", sb2.toString());
                    }
                }
            }
        }

        /* renamed from: h */
        public final C7817n0 m23993h(C7807i0 request) {
            C9322n.m27781e(request, "request");
            List<C7817n0> m23996k = m23996k(request);
            if (m23996k.size() == 1) {
                return m23996k.get(0);
            }
            throw new C7824r("invalid state: expected a single response");
        }

        /* renamed from: i */
        public final List<C7817n0> m23994i(C7815m0 requests) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<C7817n0> list;
            C9322n.m27781e(requests, "requests");
            C4636o0.m11358i(requests, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = m23991N(requests);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                C4634n0.m11327r(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = m24000o(httpURLConnection, requests);
                } else {
                    List<C7817n0> m24066a = C7817n0.f18732i.m24066a(requests.m24052t(), null, new C7824r(exc));
                    m23989G(requests, m24066a);
                    list = m24066a;
                }
                C4634n0.m11327r(httpURLConnection);
                return list;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                C4634n0.m11327r(httpURLConnection2);
                throw th;
            }
        }

        /* renamed from: j */
        public final List<C7817n0> m23995j(Collection<C7807i0> requests) {
            C9322n.m27781e(requests, "requests");
            return m23994i(new C7815m0(requests));
        }

        /* renamed from: k */
        public final List<C7817n0> m23996k(C7807i0... requests) {
            List m20478e0;
            C9322n.m27781e(requests, "requests");
            m20478e0 = C7021m.m20478e0(requests);
            return m23995j(m20478e0);
        }

        /* renamed from: l */
        public final AsyncTaskC7813l0 m23997l(C7815m0 requests) {
            C9322n.m27781e(requests, "requests");
            C4636o0.m11358i(requests, "requests");
            AsyncTaskC7813l0 asyncTaskC7813l0 = new AsyncTaskC7813l0(requests);
            asyncTaskC7813l0.executeOnExecutor(C7799e0.m23868t(), new Void[0]);
            return asyncTaskC7813l0;
        }

        /* renamed from: m */
        public final AsyncTaskC7813l0 m23998m(Collection<C7807i0> requests) {
            C9322n.m27781e(requests, "requests");
            return m23997l(new C7815m0(requests));
        }

        /* renamed from: n */
        public final AsyncTaskC7813l0 m23999n(C7807i0... requests) {
            List m20478e0;
            C9322n.m27781e(requests, "requests");
            m20478e0 = C7021m.m20478e0(requests);
            return m23998m(m20478e0);
        }

        /* renamed from: o */
        public final List<C7817n0> m24000o(HttpURLConnection connection, C7815m0 requests) {
            C9322n.m27781e(connection, "connection");
            C9322n.m27781e(requests, "requests");
            List<C7817n0> m24069f = C7817n0.f18732i.m24069f(connection, requests);
            C4634n0.m11327r(connection);
            int size = requests.size();
            if (size == m24069f.size()) {
                m23989G(requests, m24069f);
                C7802g.f18633f.m23903e().m23893h();
                return m24069f;
            }
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(m24069f.size()), Integer.valueOf(size)}, 2));
            C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
            throw new C7824r(format);
        }

        /* renamed from: x */
        public final C7807i0 m24001x(C7787a c7787a, String str, b bVar) {
            return new C7807i0(c7787a, str, null, null, bVar, null, 32, null);
        }

        /* renamed from: y */
        public final C7807i0 m24002y(C7787a c7787a, final d dVar) {
            return new C7807i0(c7787a, "me", null, null, new b() { // from class: i4.k0
                @Override // p152i4.C7807i0.b
                /* renamed from: b */
                public final void mo9121b(C7817n0 c7817n0) {
                    C7807i0.c.m23986z(C7807i0.d.this, c7817n0);
                }
            }, null, 32, null);
        }
    }

    /* renamed from: i4.i0$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo24003a(JSONObject jSONObject, C7817n0 c7817n0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i4.i0$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo24004a(String str, String str2);
    }

    /* renamed from: i4.i0$f */
    /* loaded from: classes.dex */
    public interface f extends b {
        /* renamed from: a */
        void m24005a(long j10, long j11);
    }

    /* renamed from: i4.i0$g */
    /* loaded from: classes.dex */
    public static final class g<RESOURCE extends Parcelable> implements Parcelable {

        /* renamed from: a */
        private final String f18680a;

        /* renamed from: b */
        private final RESOURCE f18681b;

        /* renamed from: c */
        public static final b f18679c = new b(null);
        public static final Parcelable.Creator<g<?>> CREATOR = new a();

        /* renamed from: i4.i0$g$a */
        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<g<?>> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g<?> createFromParcel(Parcel source) {
                C9322n.m27781e(source, "source");
                return new g<>(source, (C9315g) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g<?>[] newArray(int i10) {
                return new g[i10];
            }
        }

        /* renamed from: i4.i0$g$b */
        /* loaded from: classes.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(C9315g c9315g) {
                this();
            }
        }

        private g(Parcel parcel) {
            this.f18680a = parcel.readString();
            this.f18681b = (RESOURCE) parcel.readParcelable(C7799e0.m23860l().getClassLoader());
        }

        public /* synthetic */ g(Parcel parcel, C9315g c9315g) {
            this(parcel);
        }

        public g(RESOURCE resource, String str) {
            this.f18680a = str;
            this.f18681b = resource;
        }

        /* renamed from: a */
        public final String m24006a() {
            return this.f18680a;
        }

        /* renamed from: b */
        public final RESOURCE m24007b() {
            return this.f18681b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i10) {
            C9322n.m27781e(out, "out");
            out.writeString(this.f18680a);
            out.writeParcelable(this.f18681b, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i4.i0$h */
    /* loaded from: classes.dex */
    public static final class h implements e {

        /* renamed from: a */
        private final OutputStream f18682a;

        /* renamed from: b */
        private final C4612c0 f18683b;

        /* renamed from: c */
        private boolean f18684c;

        /* renamed from: d */
        private final boolean f18685d;

        public h(OutputStream outputStream, C4612c0 c4612c0, boolean z10) {
            C9322n.m27781e(outputStream, "outputStream");
            this.f18682a = outputStream;
            this.f18683b = c4612c0;
            this.f18684c = true;
            this.f18685d = z10;
        }

        /* renamed from: b */
        private final RuntimeException m24010b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // p152i4.C7807i0.e
        /* renamed from: a */
        public void mo24004a(String key, String value) {
            C9322n.m27781e(key, "key");
            C9322n.m27781e(value, "value");
            m24014f(key, null, null);
            m24017i("%s", value);
            m24019k();
            C4612c0 c4612c0 = this.f18683b;
            if (c4612c0 == null) {
                return;
            }
            c4612c0.m11133d(C9322n.m27787k("    ", key), value);
        }

        /* renamed from: c */
        public final void m24011c(String format, Object... args) {
            C9322n.m27781e(format, "format");
            C9322n.m27781e(args, "args");
            if (this.f18685d) {
                OutputStream outputStream = this.f18682a;
                C9308a0 c9308a0 = C9308a0.f22565a;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
                C9322n.m27780d(format2, "java.lang.String.format(locale, format, *args)");
                String encode = URLEncoder.encode(format2, "UTF-8");
                C9322n.m27780d(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = encode.getBytes(C12512d.f33913b);
                C9322n.m27780d(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f18684c) {
                OutputStream outputStream2 = this.f18682a;
                Charset charset = C12512d.f33913b;
                byte[] bytes2 = "--".getBytes(charset);
                C9322n.m27780d(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f18682a;
                String str = C7807i0.f18660p;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str.getBytes(charset);
                C9322n.m27780d(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f18682a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                C9322n.m27780d(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f18684c = false;
            }
            OutputStream outputStream5 = this.f18682a;
            C9308a0 c9308a02 = C9308a0.f22565a;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format3 = String.format(format, Arrays.copyOf(copyOf2, copyOf2.length));
            C9322n.m27780d(format3, "java.lang.String.format(format, *args)");
            Charset charset2 = C12512d.f33913b;
            if (format3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes5 = format3.getBytes(charset2);
            C9322n.m27780d(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        /* renamed from: d */
        public final void m24012d(String key, Bitmap bitmap) {
            C9322n.m27781e(key, "key");
            C9322n.m27781e(bitmap, "bitmap");
            m24014f(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f18682a);
            m24017i("", new Object[0]);
            m24019k();
            C4612c0 c4612c0 = this.f18683b;
            if (c4612c0 == null) {
                return;
            }
            c4612c0.m11133d(C9322n.m27787k("    ", key), "<Image>");
        }

        /* renamed from: e */
        public final void m24013e(String key, byte[] bytes) {
            C9322n.m27781e(key, "key");
            C9322n.m27781e(bytes, "bytes");
            m24014f(key, key, "content/unknown");
            this.f18682a.write(bytes);
            m24017i("", new Object[0]);
            m24019k();
            C4612c0 c4612c0 = this.f18683b;
            if (c4612c0 == null) {
                return;
            }
            String m27787k = C9322n.m27787k("    ", key);
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
            C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
            c4612c0.m11133d(m27787k, format);
        }

        /* renamed from: f */
        public final void m24014f(String str, String str2, String str3) {
            if (!this.f18685d) {
                m24011c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    m24011c("; filename=\"%s\"", str2);
                }
                m24017i("", new Object[0]);
                if (str3 != null) {
                    m24017i("%s: %s", "Content-Type", str3);
                }
                m24017i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f18682a;
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            C9322n.m27780d(format, "java.lang.String.format(format, *args)");
            Charset charset = C12512d.f33913b;
            if (format == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = format.getBytes(charset);
            C9322n.m27780d(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: g */
        public final void m24015g(String key, Uri contentUri, String str) {
            int m11325q;
            C9322n.m27781e(key, "key");
            C9322n.m27781e(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            m24014f(key, key, str);
            if (this.f18682a instanceof C7833v0) {
                ((C7833v0) this.f18682a).m24121b(C4634n0.m11261A(contentUri));
                m11325q = 0;
            } else {
                InputStream openInputStream = C7799e0.m23860l().getContentResolver().openInputStream(contentUri);
                C4634n0 c4634n0 = C4634n0.f8760a;
                m11325q = C4634n0.m11325q(openInputStream, this.f18682a) + 0;
            }
            m24017i("", new Object[0]);
            m24019k();
            C4612c0 c4612c0 = this.f18683b;
            if (c4612c0 == null) {
                return;
            }
            String m27787k = C9322n.m27787k("    ", key);
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(m11325q)}, 1));
            C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
            c4612c0.m11133d(m27787k, format);
        }

        /* renamed from: h */
        public final void m24016h(String key, ParcelFileDescriptor descriptor, String str) {
            int m11325q;
            C9322n.m27781e(key, "key");
            C9322n.m27781e(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            m24014f(key, key, str);
            OutputStream outputStream = this.f18682a;
            if (outputStream instanceof C7833v0) {
                ((C7833v0) outputStream).m24121b(descriptor.getStatSize());
                m11325q = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                C4634n0 c4634n0 = C4634n0.f8760a;
                m11325q = C4634n0.m11325q(autoCloseInputStream, this.f18682a) + 0;
            }
            m24017i("", new Object[0]);
            m24019k();
            C4612c0 c4612c0 = this.f18683b;
            if (c4612c0 == null) {
                return;
            }
            String m27787k = C9322n.m27787k("    ", key);
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(m11325q)}, 1));
            C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
            c4612c0.m11133d(m27787k, format);
        }

        /* renamed from: i */
        public final void m24017i(String format, Object... args) {
            C9322n.m27781e(format, "format");
            C9322n.m27781e(args, "args");
            m24011c(format, Arrays.copyOf(args, args.length));
            if (this.f18685d) {
                return;
            }
            m24011c("\r\n", new Object[0]);
        }

        /* renamed from: j */
        public final void m24018j(String key, Object obj, C7807i0 c7807i0) {
            C9322n.m27781e(key, "key");
            Closeable closeable = this.f18682a;
            if (closeable instanceof InterfaceC7839y0) {
                ((InterfaceC7839y0) closeable).mo24120a(c7807i0);
            }
            c cVar = C7807i0.f18658n;
            if (cVar.m23985w(obj)) {
                mo24004a(key, cVar.m23962C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                m24012d(key, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                m24013e(key, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                m24015g(key, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                m24016h(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof g)) {
                throw m24010b();
            }
            g gVar = (g) obj;
            Parcelable m24007b = gVar.m24007b();
            String m24006a = gVar.m24006a();
            if (m24007b instanceof ParcelFileDescriptor) {
                m24016h(key, (ParcelFileDescriptor) m24007b, m24006a);
            } else {
                if (!(m24007b instanceof Uri)) {
                    throw m24010b();
                }
                m24015g(key, (Uri) m24007b, m24006a);
            }
        }

        /* renamed from: k */
        public final void m24019k() {
            if (!this.f18685d) {
                m24017i("--%s", C7807i0.f18660p);
                return;
            }
            OutputStream outputStream = this.f18682a;
            byte[] bytes = "&".getBytes(C12512d.f33913b);
            C9322n.m27780d(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: l */
        public final void m24020l(String key, JSONArray requestJsonArray, Collection<C7807i0> requests) {
            C9322n.m27781e(key, "key");
            C9322n.m27781e(requestJsonArray, "requestJsonArray");
            C9322n.m27781e(requests, "requests");
            Closeable closeable = this.f18682a;
            if (!(closeable instanceof InterfaceC7839y0)) {
                String jSONArray = requestJsonArray.toString();
                C9322n.m27780d(jSONArray, "requestJsonArray.toString()");
                mo24004a(key, jSONArray);
                return;
            }
            InterfaceC7839y0 interfaceC7839y0 = (InterfaceC7839y0) closeable;
            m24014f(key, null, null);
            m24011c("[", new Object[0]);
            int i10 = 0;
            for (C7807i0 c7807i0 : requests) {
                int i11 = i10 + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i10);
                interfaceC7839y0.mo24120a(c7807i0);
                if (i10 > 0) {
                    m24011c(",%s", jSONObject.toString());
                } else {
                    m24011c("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            m24011c("]", new Object[0]);
            C4612c0 c4612c0 = this.f18683b;
            if (c4612c0 == null) {
                return;
            }
            String m27787k = C9322n.m27787k("    ", key);
            String jSONArray2 = requestJsonArray.toString();
            C9322n.m27780d(jSONArray2, "requestJsonArray.toString()");
            c4612c0.m11133d(m27787k, jSONArray2);
        }
    }

    /* renamed from: i4.i0$i */
    /* loaded from: classes.dex */
    public static final class i implements e {

        /* renamed from: a */
        final /* synthetic */ ArrayList<String> f18686a;

        i(ArrayList<String> arrayList) {
            this.f18686a = arrayList;
        }

        @Override // p152i4.C7807i0.e
        /* renamed from: a */
        public void mo24004a(String key, String value) {
            C9322n.m27781e(key, "key");
            C9322n.m27781e(value, "value");
            ArrayList<String> arrayList = this.f18686a;
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
            C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        C9322n.m27780d(charArray, "(this as java.lang.String).toCharArray()");
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
        C9322n.m27780d(sb3, "buffer.toString()");
        f18660p = sb3;
        f18662r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public C7807i0() {
        this(null, null, null, null, null, null, 63, null);
    }

    public C7807i0(C7787a c7787a, String str, Bundle bundle, EnumC7819o0 enumC7819o0, b bVar, String str2) {
        this.f18669f = true;
        this.f18664a = c7787a;
        this.f18665b = str;
        this.f18672i = str2;
        m23943D(bVar);
        m23946G(enumC7819o0);
        this.f18670g = bundle != null ? new Bundle(bundle) : new Bundle();
        if (this.f18672i == null) {
            this.f18672i = C7799e0.m23871w();
        }
    }

    public /* synthetic */ C7807i0(C7787a c7787a, String str, Bundle bundle, EnumC7819o0 enumC7819o0, b bVar, String str2, int i10, C9315g c9315g) {
        this((i10 & 1) != 0 ? null : c7787a, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? null : enumC7819o0, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : str2);
    }

    /* renamed from: A */
    private final boolean m23924A() {
        if (C9322n.m27777a(C7799e0.m23872x(), "instagram.com")) {
            return !m23942z();
        }
        return true;
    }

    /* renamed from: B */
    public static final C7807i0 m23925B(C7787a c7787a, d dVar) {
        return f18658n.m24002y(c7787a, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m23926C(JSONArray jSONArray, Map<String, a> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f18667d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f18669f);
        }
        String str2 = this.f18668e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String m23957v = m23957v();
        jSONObject.put("relative_url", m23957v);
        jSONObject.put(Constants.METHOD, this.f18674k);
        C7787a c7787a = this.f18664a;
        if (c7787a != null) {
            C4612c0.f8694e.m11140d(c7787a.m23770m());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f18670g.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f18670g.get(it.next());
            if (f18658n.m23984v(obj)) {
                C9308a0 c9308a0 = C9308a0.f22565a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{Constants.FILE, Integer.valueOf(map.size())}, 2));
                C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f18666c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f18658n.m23963D(jSONObject2, m23957v, new i(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: J */
    private final boolean m23927J() {
        boolean z10;
        boolean m41031E;
        String m23938n = m23938n();
        boolean m41059J = m23938n == null ? false : C12525q.m41059J(m23938n, "|", false, 2, null);
        if (m23938n != null) {
            m41031E = C12524p.m41031E(m23938n, "IG", false, 2, null);
            if (m41031E && !m41059J) {
                z10 = true;
                if (z10 || !m23942z()) {
                    return m23924A() && !m41059J;
                }
                return true;
            }
        }
        z10 = false;
        if (z10) {
        }
        if (m23924A()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m23929b(b bVar, C7817n0 response) {
        int length;
        C9322n.m27781e(response, "response");
        JSONObject m24062c = response.m24062c();
        JSONObject optJSONObject = m24062c == null ? null : m24062c.optJSONObject("__debug__");
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
                    EnumC7823q0 enumC7823q0 = EnumC7823q0.GRAPH_API_DEBUG_INFO;
                    if (C9322n.m27777a(optString2, "warning")) {
                        enumC7823q0 = EnumC7823q0.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!C4634n0.m11300d0(optString3)) {
                        optString = ((Object) optString) + " Link: " + ((Object) optString3);
                    }
                    C4612c0.a aVar = C4612c0.f8694e;
                    String TAG = f18659o;
                    C9322n.m27780d(TAG, "TAG");
                    aVar.m11138b(enumC7823q0, TAG, optString);
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
        bVar.mo9121b(response);
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
    /* renamed from: i */
    private final void m23936i() {
        /*
            r3 = this;
            android.os.Bundle r0 = r3.f18670g
            boolean r1 = r3.m23927J()
            java.lang.String r2 = "access_token"
            if (r1 == 0) goto L12
            java.lang.String r1 = r3.m23939p()
        Le:
            r0.putString(r2, r1)
            goto L19
        L12:
            java.lang.String r1 = r3.m23938n()
            if (r1 == 0) goto L19
            goto Le
        L19:
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto L32
            com.facebook.internal.n0 r1 = com.facebook.internal.C4634n0.f8760a
            java.lang.String r1 = p152i4.C7799e0.m23866r()
            boolean r1 = com.facebook.internal.C4634n0.m11300d0(r1)
            if (r1 == 0) goto L32
            java.lang.String r1 = p152i4.C7807i0.f18659o
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
        L32:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            i4.e0 r1 = p152i4.C7799e0.f18601a
            i4.q0 r1 = p152i4.EnumC7823q0.GRAPH_API_DEBUG_INFO
            boolean r1 = p152i4.C7799e0.m23835H(r1)
            java.lang.String r2 = "debug"
            if (r1 == 0) goto L52
            java.lang.String r1 = "info"
        L4e:
            r0.putString(r2, r1)
            goto L5d
        L52:
            i4.q0 r1 = p152i4.EnumC7823q0.GRAPH_API_DEBUG_WARNING
            boolean r1 = p152i4.C7799e0.m23835H(r1)
            if (r1 == 0) goto L5d
            java.lang.String r1 = "warning"
            goto L4e
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p152i4.C7807i0.m23936i():void");
    }

    /* renamed from: j */
    private final String m23937j(String str, boolean z10) {
        if (!z10 && this.f18674k == EnumC7819o0.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f18670g.keySet()) {
            Object obj = this.f18670g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = f18658n;
            if (cVar.m23985w(obj)) {
                buildUpon.appendQueryParameter(str2, cVar.m23962C(obj).toString());
            } else if (this.f18674k != EnumC7819o0.GET) {
                C9308a0 c9308a0 = C9308a0.f22565a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        C9322n.m27780d(builder, "uriBuilder.toString()");
        return builder;
    }

    /* renamed from: n */
    private final String m23938n() {
        C7787a c7787a = this.f18664a;
        if (c7787a != null) {
            if (!this.f18670g.containsKey("access_token")) {
                String m23770m = c7787a.m23770m();
                C4612c0.f8694e.m11140d(m23770m);
                return m23770m;
            }
        } else if (!this.f18670g.containsKey("access_token")) {
            return m23939p();
        }
        return this.f18670g.getString("access_token");
    }

    /* renamed from: p */
    private final String m23939p() {
        String m23861m = C7799e0.m23861m();
        String m23866r = C7799e0.m23866r();
        if (m23861m.length() > 0) {
            if (m23866r.length() > 0) {
                return m23861m + '|' + m23866r;
            }
        }
        C4634n0 c4634n0 = C4634n0.f8760a;
        C4634n0.m11314k0(f18659o, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    /* renamed from: s */
    private final String m23940s() {
        if (f18662r.matcher(this.f18665b).matches()) {
            return this.f18665b;
        }
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f18672i, this.f18665b}, 2));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: y */
    private final String m23941y(String str) {
        if (!m23924A()) {
            str = C4622h0.m11215f();
        }
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, m23940s()}, 2));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: z */
    private final boolean m23942z() {
        if (this.f18665b == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^/?");
        sb2.append(C7799e0.m23861m());
        sb2.append("/?.*");
        return this.f18675l || Pattern.matches(sb2.toString(), this.f18665b) || Pattern.matches("^/?app/?.*", this.f18665b);
    }

    /* renamed from: D */
    public final void m23943D(final b bVar) {
        C7799e0 c7799e0 = C7799e0.f18601a;
        if (C7799e0.m23835H(EnumC7823q0.GRAPH_API_DEBUG_INFO) || C7799e0.m23835H(EnumC7823q0.GRAPH_API_DEBUG_WARNING)) {
            this.f18673j = new b() { // from class: i4.h0
                @Override // p152i4.C7807i0.b
                /* renamed from: b */
                public final void mo9121b(C7817n0 c7817n0) {
                    C7807i0.m23929b(C7807i0.b.this, c7817n0);
                }
            };
        } else {
            this.f18673j = bVar;
        }
    }

    /* renamed from: E */
    public final void m23944E(boolean z10) {
        this.f18675l = z10;
    }

    /* renamed from: F */
    public final void m23945F(JSONObject jSONObject) {
        this.f18666c = jSONObject;
    }

    /* renamed from: G */
    public final void m23946G(EnumC7819o0 enumC7819o0) {
        if (this.f18676m != null && enumC7819o0 != EnumC7819o0.GET) {
            throw new C7824r("Can't change HTTP method on request with overridden URL.");
        }
        if (enumC7819o0 == null) {
            enumC7819o0 = EnumC7819o0.GET;
        }
        this.f18674k = enumC7819o0;
    }

    /* renamed from: H */
    public final void m23947H(Bundle bundle) {
        C9322n.m27781e(bundle, "<set-?>");
        this.f18670g = bundle;
    }

    /* renamed from: I */
    public final void m23948I(Object obj) {
        this.f18671h = obj;
    }

    /* renamed from: k */
    public final C7817n0 m23949k() {
        return f18658n.m23993h(this);
    }

    /* renamed from: l */
    public final AsyncTaskC7813l0 m23950l() {
        return f18658n.m23999n(this);
    }

    /* renamed from: m */
    public final C7787a m23951m() {
        return this.f18664a;
    }

    /* renamed from: o */
    public final b m23952o() {
        return this.f18673j;
    }

    /* renamed from: q */
    public final JSONObject m23953q() {
        return this.f18666c;
    }

    /* renamed from: r */
    public final String m23954r() {
        return this.f18665b;
    }

    /* renamed from: t */
    public final EnumC7819o0 m23955t() {
        return this.f18674k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.f18664a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f18665b);
        sb2.append(", graphObject: ");
        sb2.append(this.f18666c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f18674k);
        sb2.append(", parameters: ");
        sb2.append(this.f18670g);
        sb2.append("}");
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }

    /* renamed from: u */
    public final Bundle m23956u() {
        return this.f18670g;
    }

    /* renamed from: v */
    public final String m23957v() {
        if (this.f18676m != null) {
            throw new C7824r("Can't override URL for a batch request");
        }
        String m23941y = m23941y(C4622h0.m11217h());
        m23936i();
        Uri parse = Uri.parse(m23937j(m23941y, true));
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: w */
    public final Object m23958w() {
        return this.f18671h;
    }

    /* renamed from: x */
    public final String m23959x() {
        String m11218i;
        boolean m41036q;
        String str = this.f18676m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f18665b;
        if (this.f18674k == EnumC7819o0.POST && str2 != null) {
            m41036q = C12524p.m41036q(str2, "/videos", false, 2, null);
            if (m41036q) {
                m11218i = C4622h0.m11219j();
                String m23941y = m23941y(m11218i);
                m23936i();
                return m23937j(m23941y, false);
            }
        }
        C4622h0 c4622h0 = C4622h0.f8733a;
        m11218i = C4622h0.m11218i(C7799e0.m23872x());
        String m23941y2 = m23941y(m11218i);
        m23936i();
        return m23937j(m23941y2, false);
    }
}
