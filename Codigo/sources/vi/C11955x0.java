package vi;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p082eb.C7153i;
import p082eb.C7159o;

/* renamed from: vi.x0 */
/* loaded from: classes3.dex */
public final class C11955x0<ReqT, RespT> {

    /* renamed from: a */
    private final d f31678a;

    /* renamed from: b */
    private final String f31679b;

    /* renamed from: c */
    private final String f31680c;

    /* renamed from: d */
    private final c<ReqT> f31681d;

    /* renamed from: e */
    private final c<RespT> f31682e;

    /* renamed from: f */
    private final Object f31683f;

    /* renamed from: g */
    private final boolean f31684g;

    /* renamed from: h */
    private final boolean f31685h;

    /* renamed from: i */
    private final boolean f31686i;

    /* renamed from: j */
    private final AtomicReferenceArray<Object> f31687j;

    /* renamed from: vi.x0$b */
    /* loaded from: classes3.dex */
    public static final class b<ReqT, RespT> {

        /* renamed from: a */
        private c<ReqT> f31688a;

        /* renamed from: b */
        private c<RespT> f31689b;

        /* renamed from: c */
        private d f31690c;

        /* renamed from: d */
        private String f31691d;

        /* renamed from: e */
        private boolean f31692e;

        /* renamed from: f */
        private boolean f31693f;

        /* renamed from: g */
        private Object f31694g;

        /* renamed from: h */
        private boolean f31695h;

        private b() {
        }

        /* renamed from: a */
        public C11955x0<ReqT, RespT> m38347a() {
            return new C11955x0<>(this.f31690c, this.f31691d, this.f31688a, this.f31689b, this.f31694g, this.f31692e, this.f31693f, this.f31695h);
        }

        /* renamed from: b */
        public b<ReqT, RespT> m38348b(String str) {
            this.f31691d = str;
            return this;
        }

        /* renamed from: c */
        public b<ReqT, RespT> m38349c(c<ReqT> cVar) {
            this.f31688a = cVar;
            return this;
        }

        /* renamed from: d */
        public b<ReqT, RespT> m38350d(c<RespT> cVar) {
            this.f31689b = cVar;
            return this;
        }

        /* renamed from: e */
        public b<ReqT, RespT> m38351e(boolean z10) {
            this.f31695h = z10;
            return this;
        }

        /* renamed from: f */
        public b<ReqT, RespT> m38352f(d dVar) {
            this.f31690c = dVar;
            return this;
        }
    }

    /* renamed from: vi.x0$c */
    /* loaded from: classes3.dex */
    public interface c<T> {
        /* renamed from: a */
        InputStream mo38353a(T t10);

        /* renamed from: b */
        T mo38354b(InputStream inputStream);
    }

    /* renamed from: vi.x0$d */
    /* loaded from: classes3.dex */
    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        /* renamed from: b */
        public final boolean m38355b() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    private C11955x0(d dVar, String str, c<ReqT> cVar, c<RespT> cVar2, Object obj, boolean z10, boolean z11, boolean z12) {
        this.f31687j = new AtomicReferenceArray<>(2);
        this.f31678a = (d) C7159o.m21313p(dVar, "type");
        this.f31679b = (String) C7159o.m21313p(str, "fullMethodName");
        this.f31680c = m38337a(str);
        this.f31681d = (c) C7159o.m21313p(cVar, "requestMarshaller");
        this.f31682e = (c) C7159o.m21313p(cVar2, "responseMarshaller");
        this.f31683f = obj;
        this.f31684g = z10;
        this.f31685h = z11;
        this.f31686i = z12;
    }

    /* renamed from: a */
    public static String m38337a(String str) {
        int lastIndexOf = ((String) C7159o.m21313p(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    public static String m38338b(String str, String str2) {
        return ((String) C7159o.m21313p(str, "fullServiceName")) + "/" + ((String) C7159o.m21313p(str2, "methodName"));
    }

    /* renamed from: g */
    public static <ReqT, RespT> b<ReqT, RespT> m38339g() {
        return m38340h(null, null);
    }

    /* renamed from: h */
    public static <ReqT, RespT> b<ReqT, RespT> m38340h(c<ReqT> cVar, c<RespT> cVar2) {
        return new b().m38349c(cVar).m38350d(cVar2);
    }

    /* renamed from: c */
    public String m38341c() {
        return this.f31679b;
    }

    /* renamed from: d */
    public String m38342d() {
        return this.f31680c;
    }

    /* renamed from: e */
    public d m38343e() {
        return this.f31678a;
    }

    /* renamed from: f */
    public boolean m38344f() {
        return this.f31685h;
    }

    /* renamed from: i */
    public RespT m38345i(InputStream inputStream) {
        return this.f31682e.mo38354b(inputStream);
    }

    /* renamed from: j */
    public InputStream m38346j(ReqT reqt) {
        return this.f31681d.mo38353a(reqt);
    }

    public String toString() {
        return C7153i.m21274c(this).m21284d("fullMethodName", this.f31679b).m21284d("type", this.f31678a).m21285e("idempotent", this.f31684g).m21285e("safe", this.f31685h).m21285e("sampledToLocalTracing", this.f31686i).m21284d("requestMarshaller", this.f31681d).m21284d("responseMarshaller", this.f31682e).m21284d("schemaDescriptor", this.f31683f).m21287m().toString();
    }
}
