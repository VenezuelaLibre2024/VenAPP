package vi;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class x0<ReqT, RespT> {

    /* renamed from: a */
    private final d f29243a;

    /* renamed from: b */
    private final String f29244b;

    /* renamed from: c */
    private final String f29245c;

    /* renamed from: d */
    private final c<ReqT> f29246d;

    /* renamed from: e */
    private final c<RespT> f29247e;

    /* renamed from: f */
    private final Object f29248f;

    /* renamed from: g */
    private final boolean f29249g;

    /* renamed from: h */
    private final boolean f29250h;

    /* renamed from: i */
    private final boolean f29251i;

    /* renamed from: j */
    private final AtomicReferenceArray<Object> f29252j;

    /* loaded from: classes3.dex */
    public static final class b<ReqT, RespT> {

        /* renamed from: a */
        private c<ReqT> f29253a;

        /* renamed from: b */
        private c<RespT> f29254b;

        /* renamed from: c */
        private d f29255c;

        /* renamed from: d */
        private String f29256d;

        /* renamed from: e */
        private boolean f29257e;

        /* renamed from: f */
        private boolean f29258f;

        /* renamed from: g */
        private Object f29259g;

        /* renamed from: h */
        private boolean f29260h;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public x0<ReqT, RespT> a() {
            return new x0<>(this.f29255c, this.f29256d, this.f29253a, this.f29254b, this.f29259g, this.f29257e, this.f29258f, this.f29260h);
        }

        public b<ReqT, RespT> b(String str) {
            this.f29256d = str;
            return this;
        }

        public b<ReqT, RespT> c(c<ReqT> cVar) {
            this.f29253a = cVar;
            return this;
        }

        public b<ReqT, RespT> d(c<RespT> cVar) {
            this.f29254b = cVar;
            return this;
        }

        public b<ReqT, RespT> e(boolean z10) {
            this.f29260h = z10;
            return this;
        }

        public b<ReqT, RespT> f(d dVar) {
            this.f29255c = dVar;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface c<T> {
        InputStream a(T t10);

        T b(InputStream inputStream);
    }

    /* loaded from: classes3.dex */
    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean b() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    private x0(d dVar, String str, c<ReqT> cVar, c<RespT> cVar2, Object obj, boolean z10, boolean z11, boolean z12) {
        this.f29252j = new AtomicReferenceArray<>(2);
        this.f29243a = (d) eb.o.p(dVar, "type");
        this.f29244b = (String) eb.o.p(str, "fullMethodName");
        this.f29245c = a(str);
        this.f29246d = (c) eb.o.p(cVar, "requestMarshaller");
        this.f29247e = (c) eb.o.p(cVar2, "responseMarshaller");
        this.f29248f = obj;
        this.f29249g = z10;
        this.f29250h = z11;
        this.f29251i = z12;
    }

    /* synthetic */ x0(d dVar, String str, c cVar, c cVar2, Object obj, boolean z10, boolean z11, boolean z12, a aVar) {
        this(dVar, str, cVar, cVar2, obj, z10, z11, z12);
    }

    public static String a(String str) {
        int lastIndexOf = ((String) eb.o.p(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public static String b(String str, String str2) {
        return ((String) eb.o.p(str, "fullServiceName")) + "/" + ((String) eb.o.p(str2, "methodName"));
    }

    public static <ReqT, RespT> b<ReqT, RespT> g() {
        return h(null, null);
    }

    public static <ReqT, RespT> b<ReqT, RespT> h(c<ReqT> cVar, c<RespT> cVar2) {
        return new b().c(cVar).d(cVar2);
    }

    public String c() {
        return this.f29244b;
    }

    public String d() {
        return this.f29245c;
    }

    public d e() {
        return this.f29243a;
    }

    public boolean f() {
        return this.f29250h;
    }

    public RespT i(InputStream inputStream) {
        return this.f29247e.b(inputStream);
    }

    public InputStream j(ReqT reqt) {
        return this.f29246d.a(reqt);
    }

    public String toString() {
        return eb.i.c(this).d("fullMethodName", this.f29244b).d("type", this.f29243a).e("idempotent", this.f29249g).e("safe", this.f29250h).e("sampledToLocalTracing", this.f29251i).d("requestMarshaller", this.f29246d).d("responseMarshaller", this.f29247e).d("schemaDescriptor", this.f29248f).m().toString();
    }
}
