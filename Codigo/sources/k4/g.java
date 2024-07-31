package k4;

import ck.r;
import ck.u;
import ck.v;
import com.facebook.internal.c0;
import com.facebook.internal.n0;
import dk.j0;
import dk.k0;
import dk.q0;
import dk.z;
import i4.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k4.g;
import kotlin.jvm.internal.b0;
import ok.p;
import org.json.JSONArray;
import org.json.JSONObject;
import xk.q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f20337a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet<Integer> f20338b;

    /* renamed from: c, reason: collision with root package name */
    private static final HashSet<Integer> f20339c;

    /* renamed from: d, reason: collision with root package name */
    public static a f20340d;

    /* renamed from: e, reason: collision with root package name */
    public static List<Map<String, Object>> f20341e;

    /* renamed from: f, reason: collision with root package name */
    private static int f20342f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f20343a;

        /* renamed from: b, reason: collision with root package name */
        private final String f20344b;

        /* renamed from: c, reason: collision with root package name */
        private final String f20345c;

        public a(String datasetID, String cloudBridgeURL, String accessKey) {
            kotlin.jvm.internal.n.e(datasetID, "datasetID");
            kotlin.jvm.internal.n.e(cloudBridgeURL, "cloudBridgeURL");
            kotlin.jvm.internal.n.e(accessKey, "accessKey");
            this.f20343a = datasetID;
            this.f20344b = cloudBridgeURL;
            this.f20345c = accessKey;
        }

        public final String a() {
            return this.f20345c;
        }

        public final String b() {
            return this.f20344b;
        }

        public final String c() {
            return this.f20343a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.n.a(this.f20343a, aVar.f20343a) && kotlin.jvm.internal.n.a(this.f20344b, aVar.f20344b) && kotlin.jvm.internal.n.a(this.f20345c, aVar.f20345c);
        }

        public int hashCode() {
            return (((this.f20343a.hashCode() * 31) + this.f20344b.hashCode()) * 31) + this.f20345c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f20343a + ", cloudBridgeURL=" + this.f20344b + ", accessKey=" + this.f20345c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.o implements p<String, Integer, v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Map<String, Object>> f20346a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends Map<String, ? extends Object>> list) {
            super(2);
            this.f20346a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Integer num, List processedEvents) {
            boolean x10;
            kotlin.jvm.internal.n.e(processedEvents, "$processedEvents");
            x10 = z.x(g.f20338b, num);
            if (x10) {
                return;
            }
            g.f20337a.g(num, processedEvents, 5);
        }

        public final void c(String str, final Integer num) {
            n0 n0Var = n0.f7780a;
            final List<Map<String, Object>> list = this.f20346a;
            n0.C0(new Runnable() { // from class: k4.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.d(num, list);
                }
            });
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ v invoke(String str, Integer num) {
            c(str, num);
            return v.f7137a;
        }
    }

    static {
        HashSet<Integer> f10;
        HashSet<Integer> f11;
        f10 = q0.f(200, 202);
        f20338b = f10;
        f11 = q0.f(503, 504, 429);
        f20339c = f11;
    }

    private g() {
    }

    public static final void d(String datasetID, String url, String accessKey) {
        kotlin.jvm.internal.n.e(datasetID, "datasetID");
        kotlin.jvm.internal.n.e(url, "url");
        kotlin.jvm.internal.n.e(accessKey, "accessKey");
        c0.f7719e.c(i4.q0.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        g gVar = f20337a;
        gVar.i(new a(datasetID, url, accessKey));
        gVar.j(new ArrayList());
    }

    private final List<Map<String, Object>> k(i0 i0Var) {
        Map<String, ? extends Object> u10;
        JSONObject q10 = i0Var.q();
        if (q10 == null) {
            return null;
        }
        u10 = k0.u(n0.o(q10));
        Object w10 = i0Var.w();
        if (w10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        u10.put("custom_events", w10);
        StringBuilder sb2 = new StringBuilder();
        for (String str : u10.keySet()) {
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(u10.get(str));
            sb2.append(System.getProperty("line.separator"));
        }
        c0.f7719e.c(i4.q0.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb2);
        return e.f20325a.e(u10);
    }

    public static final void l(final i0 request) {
        kotlin.jvm.internal.n.e(request, "request");
        n0 n0Var = n0.f7780a;
        n0.C0(new Runnable() { // from class: k4.f
            @Override // java.lang.Runnable
            public final void run() {
                g.m(i0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(i0 request) {
        List Y;
        Map<String, String> f10;
        kotlin.jvm.internal.n.e(request, "$request");
        String r10 = request.r();
        List u02 = r10 == null ? null : q.u0(r10, new String[]{"/"}, false, 0, 6, null);
        if (u02 == null || u02.size() != 2) {
            c0.f7719e.c(i4.q0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            g gVar = f20337a;
            String str = gVar.e().b() + "/capi/" + gVar.e().c() + "/events";
            List<Map<String, Object>> k10 = gVar.k(request);
            if (k10 == null) {
                return;
            }
            gVar.c(k10);
            int min = Math.min(gVar.f().size(), 10);
            Y = z.Y(gVar.f(), new uk.f(0, min - 1));
            gVar.f().subList(0, min).clear();
            JSONArray jSONArray = new JSONArray((Collection) Y);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", gVar.e().a());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            c0.a aVar = c0.f7719e;
            i4.q0 q0Var = i4.q0.APP_EVENTS;
            String jSONObject2 = jSONObject.toString(2);
            kotlin.jvm.internal.n.d(jSONObject2, "jsonBodyStr.toString(2)");
            aVar.c(q0Var, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, jSONObject2);
            String jSONObject3 = jSONObject.toString();
            f10 = j0.f(r.a("Content-Type", "application/json"));
            gVar.h(str, "POST", jSONObject3, f10, 60000, new b(Y));
        } catch (u e10) {
            c0.f7719e.c(i4.q0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e10);
        }
    }

    public final void c(List<? extends Map<String, ? extends Object>> list) {
        List z10;
        if (list != null) {
            f().addAll(list);
        }
        int max = Math.max(0, f().size() - 1000);
        if (max > 0) {
            z10 = z.z(f(), max);
            j(b0.a(z10));
        }
    }

    public final a e() {
        a aVar = f20340d;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.n.p("credentials");
        throw null;
    }

    public final List<Map<String, Object>> f() {
        List<Map<String, Object>> list = f20341e;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.n.p("transformedEvents");
        throw null;
    }

    public final void g(Integer num, List<? extends Map<String, ? extends Object>> processedEvents, int i10) {
        boolean x10;
        kotlin.jvm.internal.n.e(processedEvents, "processedEvents");
        x10 = z.x(f20339c, num);
        if (x10) {
            if (f20342f >= i10) {
                f().clear();
                f20342f = 0;
            } else {
                f().addAll(0, processedEvents);
                f20342f++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009d A[Catch: IOException -> 0x00f9, UnknownHostException -> 0x010c, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x010c, IOException -> 0x00f9, blocks: (B:3:0x0011, B:5:0x001c, B:8:0x0047, B:10:0x0053, B:14:0x0063, B:16:0x009d, B:23:0x00b7, B:30:0x00be, B:31:0x00c1, B:33:0x00c2, B:35:0x00e5, B:39:0x0024, B:42:0x002b, B:43:0x0031, B:45:0x0037, B:47:0x00f1, B:48:0x00f8, B:18:0x00ab, B:20:0x00b1, B:22:0x00b5, B:27:0x00bc), top: B:2:0x0011, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5 A[Catch: IOException -> 0x00f9, UnknownHostException -> 0x010c, TryCatch #4 {UnknownHostException -> 0x010c, IOException -> 0x00f9, blocks: (B:3:0x0011, B:5:0x001c, B:8:0x0047, B:10:0x0053, B:14:0x0063, B:16:0x009d, B:23:0x00b7, B:30:0x00be, B:31:0x00c1, B:33:0x00c2, B:35:0x00e5, B:39:0x0024, B:42:0x002b, B:43:0x0031, B:45:0x0037, B:47:0x00f1, B:48:0x00f8, B:18:0x00ab, B:20:0x00b1, B:22:0x00b5, B:27:0x00bc), top: B:2:0x0011, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, int r12, ok.p<? super java.lang.String, ? super java.lang.Integer, ck.v> r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.g.h(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, ok.p):void");
    }

    public final void i(a aVar) {
        kotlin.jvm.internal.n.e(aVar, "<set-?>");
        f20340d = aVar;
    }

    public final void j(List<Map<String, Object>> list) {
        kotlin.jvm.internal.n.e(list, "<set-?>");
        f20341e = list;
    }
}
