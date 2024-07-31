package ql;

import java.util.ArrayList;
import java.util.List;
import ql.b0;
import ql.t;
import ql.w;

/* loaded from: classes3.dex */
public final class x extends b0 {

    /* renamed from: g, reason: collision with root package name */
    public static final b f24389g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final w f24390h;

    /* renamed from: i, reason: collision with root package name */
    public static final w f24391i;

    /* renamed from: j, reason: collision with root package name */
    public static final w f24392j;

    /* renamed from: k, reason: collision with root package name */
    public static final w f24393k;

    /* renamed from: l, reason: collision with root package name */
    public static final w f24394l;

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f24395m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f24396n;

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f24397o;

    /* renamed from: b, reason: collision with root package name */
    private final dm.e f24398b;

    /* renamed from: c, reason: collision with root package name */
    private final w f24399c;

    /* renamed from: d, reason: collision with root package name */
    private final List<c> f24400d;

    /* renamed from: e, reason: collision with root package name */
    private final w f24401e;

    /* renamed from: f, reason: collision with root package name */
    private long f24402f;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final dm.e f24403a;

        /* renamed from: b, reason: collision with root package name */
        private w f24404b;

        /* renamed from: c, reason: collision with root package name */
        private final List<c> f24405c;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(String boundary) {
            kotlin.jvm.internal.n.e(boundary, "boundary");
            this.f24403a = dm.e.f14291d.c(boundary);
            this.f24404b = x.f24390h;
            this.f24405c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ a(java.lang.String r1, int r2, kotlin.jvm.internal.g r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.n.d(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.x.a.<init>(java.lang.String, int, kotlin.jvm.internal.g):void");
        }

        public final a a(String name, String value) {
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(value, "value");
            c(c.f24406c.b(name, value));
            return this;
        }

        public final a b(String name, String str, b0 body) {
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(body, "body");
            c(c.f24406c.c(name, str, body));
            return this;
        }

        public final a c(c part) {
            kotlin.jvm.internal.n.e(part, "part");
            this.f24405c.add(part);
            return this;
        }

        public final x d() {
            if (!this.f24405c.isEmpty()) {
                return new x(this.f24403a, this.f24404b, rl.d.S(this.f24405c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final a e(w type) {
            kotlin.jvm.internal.n.e(type, "type");
            if (!kotlin.jvm.internal.n.a(type.g(), "multipart")) {
                throw new IllegalArgumentException(kotlin.jvm.internal.n.k("multipart != ", type).toString());
            }
            this.f24404b = type;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(StringBuilder sb2, String key) {
            String str;
            kotlin.jvm.internal.n.e(sb2, "<this>");
            kotlin.jvm.internal.n.e(key, "key");
            sb2.append('\"');
            int length = key.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char charAt = key.charAt(i10);
                if (charAt == '\n') {
                    str = "%0A";
                } else if (charAt == '\r') {
                    str = "%0D";
                } else if (charAt == '\"') {
                    str = "%22";
                } else {
                    sb2.append(charAt);
                    i10 = i11;
                }
                sb2.append(str);
                i10 = i11;
            }
            sb2.append('\"');
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f24406c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final t f24407a;

        /* renamed from: b, reason: collision with root package name */
        private final b0 f24408b;

        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final c a(t tVar, b0 body) {
                kotlin.jvm.internal.n.e(body, "body");
                kotlin.jvm.internal.g gVar = null;
                if (!((tVar == null ? null : tVar.c("Content-Type")) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((tVar == null ? null : tVar.c("Content-Length")) == null) {
                    return new c(tVar, body, gVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            public final c b(String name, String value) {
                kotlin.jvm.internal.n.e(name, "name");
                kotlin.jvm.internal.n.e(value, "value");
                return c(name, null, b0.a.d(b0.f24156a, value, null, 1, null));
            }

            public final c c(String name, String str, b0 body) {
                kotlin.jvm.internal.n.e(name, "name");
                kotlin.jvm.internal.n.e(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = x.f24389g;
                bVar.a(sb2, name);
                if (str != null) {
                    sb2.append("; filename=");
                    bVar.a(sb2, str);
                }
                String sb3 = sb2.toString();
                kotlin.jvm.internal.n.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return a(new t.a().d("Content-Disposition", sb3).e(), body);
            }
        }

        private c(t tVar, b0 b0Var) {
            this.f24407a = tVar;
            this.f24408b = b0Var;
        }

        public /* synthetic */ c(t tVar, b0 b0Var, kotlin.jvm.internal.g gVar) {
            this(tVar, b0Var);
        }

        public final b0 a() {
            return this.f24408b;
        }

        public final t b() {
            return this.f24407a;
        }
    }

    static {
        w.a aVar = w.f24382e;
        f24390h = aVar.a("multipart/mixed");
        f24391i = aVar.a("multipart/alternative");
        f24392j = aVar.a("multipart/digest");
        f24393k = aVar.a("multipart/parallel");
        f24394l = aVar.a("multipart/form-data");
        f24395m = new byte[]{58, 32};
        f24396n = new byte[]{13, 10};
        f24397o = new byte[]{45, 45};
    }

    public x(dm.e boundaryByteString, w type, List<c> parts) {
        kotlin.jvm.internal.n.e(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.n.e(type, "type");
        kotlin.jvm.internal.n.e(parts, "parts");
        this.f24398b = boundaryByteString;
        this.f24399c = type;
        this.f24400d = parts;
        this.f24401e = w.f24382e.a(type + "; boundary=" + g());
        this.f24402f = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long h(dm.c cVar, boolean z10) {
        dm.b bVar;
        if (z10) {
            cVar = new dm.b();
            bVar = cVar;
        } else {
            bVar = 0;
        }
        int size = this.f24400d.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            c cVar2 = this.f24400d.get(i10);
            t b10 = cVar2.b();
            b0 a10 = cVar2.a();
            kotlin.jvm.internal.n.b(cVar);
            cVar.write(f24397o);
            cVar.b0(this.f24398b);
            cVar.write(f24396n);
            if (b10 != null) {
                int size2 = b10.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    cVar.T(b10.d(i12)).write(f24395m).T(b10.l(i12)).write(f24396n);
                }
            }
            w b11 = a10.b();
            if (b11 != null) {
                cVar.T("Content-Type: ").T(b11.toString()).write(f24396n);
            }
            long a11 = a10.a();
            if (a11 != -1) {
                cVar.T("Content-Length: ").s0(a11).write(f24396n);
            } else if (z10) {
                kotlin.jvm.internal.n.b(bVar);
                bVar.b();
                return -1L;
            }
            byte[] bArr = f24396n;
            cVar.write(bArr);
            if (z10) {
                j10 += a11;
            } else {
                a10.f(cVar);
            }
            cVar.write(bArr);
            i10 = i11;
        }
        kotlin.jvm.internal.n.b(cVar);
        byte[] bArr2 = f24397o;
        cVar.write(bArr2);
        cVar.b0(this.f24398b);
        cVar.write(bArr2);
        cVar.write(f24396n);
        if (!z10) {
            return j10;
        }
        kotlin.jvm.internal.n.b(bVar);
        long size3 = j10 + bVar.size();
        bVar.b();
        return size3;
    }

    @Override // ql.b0
    public long a() {
        long j10 = this.f24402f;
        if (j10 != -1) {
            return j10;
        }
        long h10 = h(null, true);
        this.f24402f = h10;
        return h10;
    }

    @Override // ql.b0
    public w b() {
        return this.f24401e;
    }

    @Override // ql.b0
    public void f(dm.c sink) {
        kotlin.jvm.internal.n.e(sink, "sink");
        h(sink, false);
    }

    public final String g() {
        return this.f24398b.F();
    }
}
