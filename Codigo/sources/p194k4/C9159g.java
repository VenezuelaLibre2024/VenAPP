package p194k4;

import ck.C2033r;
import ck.C2036u;
import ck.C2037v;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4634n0;
import dk.C7016j0;
import dk.C7018k0;
import dk.C7030q0;
import dk.C7042z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9310b0;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p152i4.C7807i0;
import p152i4.EnumC7823q0;
import p194k4.C9159g;
import p280ok.InterfaceC10002p;
import p450xk.C12525q;
import uk.C11579f;

/* renamed from: k4.g */
/* loaded from: classes.dex */
public final class C9159g {

    /* renamed from: a */
    public static final C9159g f22119a = new C9159g();

    /* renamed from: b */
    private static final HashSet<Integer> f22120b;

    /* renamed from: c */
    private static final HashSet<Integer> f22121c;

    /* renamed from: d */
    public static a f22122d;

    /* renamed from: e */
    public static List<Map<String, Object>> f22123e;

    /* renamed from: f */
    private static int f22124f;

    /* renamed from: k4.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final String f22125a;

        /* renamed from: b */
        private final String f22126b;

        /* renamed from: c */
        private final String f22127c;

        public a(String datasetID, String cloudBridgeURL, String accessKey) {
            C9322n.m27781e(datasetID, "datasetID");
            C9322n.m27781e(cloudBridgeURL, "cloudBridgeURL");
            C9322n.m27781e(accessKey, "accessKey");
            this.f22125a = datasetID;
            this.f22126b = cloudBridgeURL;
            this.f22127c = accessKey;
        }

        /* renamed from: a */
        public final String m27057a() {
            return this.f22127c;
        }

        /* renamed from: b */
        public final String m27058b() {
            return this.f22126b;
        }

        /* renamed from: c */
        public final String m27059c() {
            return this.f22125a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9322n.m27777a(this.f22125a, aVar.f22125a) && C9322n.m27777a(this.f22126b, aVar.f22126b) && C9322n.m27777a(this.f22127c, aVar.f22127c);
        }

        public int hashCode() {
            return (((this.f22125a.hashCode() * 31) + this.f22126b.hashCode()) * 31) + this.f22127c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f22125a + ", cloudBridgeURL=" + this.f22126b + ", accessKey=" + this.f22127c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k4.g$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC9323o implements InterfaceC10002p<String, Integer, C2037v> {

        /* renamed from: a */
        final /* synthetic */ List<Map<String, Object>> f22128a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends Map<String, ? extends Object>> list) {
            super(2);
            this.f22128a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m27061d(Integer num, List processedEvents) {
            boolean m20638x;
            C9322n.m27781e(processedEvents, "$processedEvents");
            m20638x = C7042z.m20638x(C9159g.f22120b, num);
            if (m20638x) {
                return;
            }
            C9159g.f22119a.m27053g(num, processedEvents, 5);
        }

        /* renamed from: c */
        public final void m27062c(String str, final Integer num) {
            C4634n0 c4634n0 = C4634n0.f8760a;
            final List<Map<String, Object>> list = this.f22128a;
            C4634n0.m11266C0(new Runnable() { // from class: k4.h
                @Override // java.lang.Runnable
                public final void run() {
                    C9159g.b.m27061d(num, list);
                }
            });
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ C2037v invoke(String str, Integer num) {
            m27062c(str, num);
            return C2037v.f8089a;
        }
    }

    static {
        HashSet<Integer> m20574f;
        HashSet<Integer> m20574f2;
        m20574f = C7030q0.m20574f(200, 202);
        f22120b = m20574f;
        m20574f2 = C7030q0.m20574f(503, 504, 429);
        f22121c = m20574f2;
    }

    private C9159g() {
    }

    /* renamed from: d */
    public static final void m27046d(String datasetID, String url, String accessKey) {
        C9322n.m27781e(datasetID, "datasetID");
        C9322n.m27781e(url, "url");
        C9322n.m27781e(accessKey, "accessKey");
        C4612c0.f8694e.m11139c(EnumC7823q0.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        C9159g c9159g = f22119a;
        c9159g.m27055i(new a(datasetID, url, accessKey));
        c9159g.m27056j(new ArrayList());
    }

    /* renamed from: k */
    private final List<Map<String, Object>> m27047k(C7807i0 c7807i0) {
        Map<String, ? extends Object> m20434u;
        JSONObject m23953q = c7807i0.m23953q();
        if (m23953q == null) {
            return null;
        }
        m20434u = C7018k0.m20434u(C4634n0.m11321o(m23953q));
        Object m23958w = c7807i0.m23958w();
        if (m23958w == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        m20434u.put("custom_events", m23958w);
        StringBuilder sb2 = new StringBuilder();
        for (String str : m20434u.keySet()) {
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(m20434u.get(str));
            sb2.append(System.getProperty("line.separator"));
        }
        C4612c0.f8694e.m11139c(EnumC7823q0.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb2);
        return C9157e.f22107a.m27033e(m20434u);
    }

    /* renamed from: l */
    public static final void m27048l(final C7807i0 request) {
        C9322n.m27781e(request, "request");
        C4634n0 c4634n0 = C4634n0.f8760a;
        C4634n0.m11266C0(new Runnable() { // from class: k4.f
            @Override // java.lang.Runnable
            public final void run() {
                C9159g.m27049m(C7807i0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m27049m(C7807i0 request) {
        List m20623Y;
        Map<String, String> m20419f;
        C9322n.m27781e(request, "$request");
        String m23954r = request.m23954r();
        List m41098u0 = m23954r == null ? null : C12525q.m41098u0(m23954r, new String[]{"/"}, false, 0, 6, null);
        if (m41098u0 == null || m41098u0.size() != 2) {
            C4612c0.f8694e.m11139c(EnumC7823q0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            C9159g c9159g = f22119a;
            String str = c9159g.m27051e().m27058b() + "/capi/" + c9159g.m27051e().m27059c() + "/events";
            List<Map<String, Object>> m27047k = c9159g.m27047k(request);
            if (m27047k == null) {
                return;
            }
            c9159g.m27050c(m27047k);
            int min = Math.min(c9159g.m27052f().size(), 10);
            m20623Y = C7042z.m20623Y(c9159g.m27052f(), new C11579f(0, min - 1));
            c9159g.m27052f().subList(0, min).clear();
            JSONArray jSONArray = new JSONArray((Collection) m20623Y);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", c9159g.m27051e().m27057a());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            C4612c0.a aVar = C4612c0.f8694e;
            EnumC7823q0 enumC7823q0 = EnumC7823q0.APP_EVENTS;
            String jSONObject2 = jSONObject.toString(2);
            C9322n.m27780d(jSONObject2, "jsonBodyStr.toString(2)");
            aVar.m11139c(enumC7823q0, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, jSONObject2);
            String jSONObject3 = jSONObject.toString();
            m20419f = C7016j0.m20419f(C2033r.m10353a("Content-Type", "application/json"));
            c9159g.m27054h(str, "POST", jSONObject3, m20419f, 60000, new b(m20623Y));
        } catch (C2036u e10) {
            C4612c0.f8694e.m11139c(EnumC7823q0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e10);
        }
    }

    /* renamed from: c */
    public final void m27050c(List<? extends Map<String, ? extends Object>> list) {
        List m20640z;
        if (list != null) {
            m27052f().addAll(list);
        }
        int max = Math.max(0, m27052f().size() - 1000);
        if (max > 0) {
            m20640z = C7042z.m20640z(m27052f(), max);
            m27056j(C9310b0.m27757a(m20640z));
        }
    }

    /* renamed from: e */
    public final a m27051e() {
        a aVar = f22122d;
        if (aVar != null) {
            return aVar;
        }
        C9322n.m27792p("credentials");
        throw null;
    }

    /* renamed from: f */
    public final List<Map<String, Object>> m27052f() {
        List<Map<String, Object>> list = f22123e;
        if (list != null) {
            return list;
        }
        C9322n.m27792p("transformedEvents");
        throw null;
    }

    /* renamed from: g */
    public final void m27053g(Integer num, List<? extends Map<String, ? extends Object>> processedEvents, int i10) {
        boolean m20638x;
        C9322n.m27781e(processedEvents, "processedEvents");
        m20638x = C7042z.m20638x(f22121c, num);
        if (m20638x) {
            if (f22124f >= i10) {
                m27052f().clear();
                f22124f = 0;
            } else {
                m27052f().addAll(0, processedEvents);
                f22124f++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009d A[Catch: IOException -> 0x00f9, UnknownHostException -> 0x010c, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x010c, IOException -> 0x00f9, blocks: (B:3:0x0011, B:5:0x001c, B:8:0x0047, B:10:0x0053, B:14:0x0063, B:16:0x009d, B:23:0x00b7, B:30:0x00be, B:31:0x00c1, B:33:0x00c2, B:35:0x00e5, B:39:0x0024, B:42:0x002b, B:43:0x0031, B:45:0x0037, B:47:0x00f1, B:48:0x00f8, B:18:0x00ab, B:20:0x00b1, B:22:0x00b5, B:27:0x00bc), top: B:2:0x0011, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5 A[Catch: IOException -> 0x00f9, UnknownHostException -> 0x010c, TryCatch #4 {UnknownHostException -> 0x010c, IOException -> 0x00f9, blocks: (B:3:0x0011, B:5:0x001c, B:8:0x0047, B:10:0x0053, B:14:0x0063, B:16:0x009d, B:23:0x00b7, B:30:0x00be, B:31:0x00c1, B:33:0x00c2, B:35:0x00e5, B:39:0x0024, B:42:0x002b, B:43:0x0031, B:45:0x0037, B:47:0x00f1, B:48:0x00f8, B:18:0x00ab, B:20:0x00b1, B:22:0x00b5, B:27:0x00bc), top: B:2:0x0011, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m27054h(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, int r12, p280ok.InterfaceC10002p<? super java.lang.String, ? super java.lang.Integer, ck.C2037v> r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p194k4.C9159g.m27054h(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, ok.p):void");
    }

    /* renamed from: i */
    public final void m27055i(a aVar) {
        C9322n.m27781e(aVar, "<set-?>");
        f22122d = aVar;
    }

    /* renamed from: j */
    public final void m27056j(List<Map<String, Object>> list) {
        C9322n.m27781e(list, "<set-?>");
        f22123e = list;
    }
}
