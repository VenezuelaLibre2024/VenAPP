package p319ql;

import dm.C7056b;
import dm.C7061e;
import dm.InterfaceC7058c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10523b0;
import p319ql.C10545t;
import p319ql.C10548w;
import p341rl.C10727d;

/* renamed from: ql.x */
/* loaded from: classes3.dex */
public final class C10549x extends AbstractC10523b0 {

    /* renamed from: g */
    public static final b f26483g = new b(null);

    /* renamed from: h */
    public static final C10548w f26484h;

    /* renamed from: i */
    public static final C10548w f26485i;

    /* renamed from: j */
    public static final C10548w f26486j;

    /* renamed from: k */
    public static final C10548w f26487k;

    /* renamed from: l */
    public static final C10548w f26488l;

    /* renamed from: m */
    private static final byte[] f26489m;

    /* renamed from: n */
    private static final byte[] f26490n;

    /* renamed from: o */
    private static final byte[] f26491o;

    /* renamed from: b */
    private final C7061e f26492b;

    /* renamed from: c */
    private final C10548w f26493c;

    /* renamed from: d */
    private final List<c> f26494d;

    /* renamed from: e */
    private final C10548w f26495e;

    /* renamed from: f */
    private long f26496f;

    /* renamed from: ql.x$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final C7061e f26497a;

        /* renamed from: b */
        private C10548w f26498b;

        /* renamed from: c */
        private final List<c> f26499c;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(String boundary) {
            C9322n.m27781e(boundary, "boundary");
            this.f26497a = C7061e.f15649d.m20781c(boundary);
            this.f26498b = C10549x.f26484h;
            this.f26499c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ a(java.lang.String r1, int r2, kotlin.jvm.internal.C9315g r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.C9322n.m27780d(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p319ql.C10549x.a.<init>(java.lang.String, int, kotlin.jvm.internal.g):void");
        }

        /* renamed from: a */
        public final a m31952a(String name, String value) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(value, "value");
            m31954c(c.f26500c.m31961b(name, value));
            return this;
        }

        /* renamed from: b */
        public final a m31953b(String name, String str, AbstractC10523b0 body) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(body, "body");
            m31954c(c.f26500c.m31962c(name, str, body));
            return this;
        }

        /* renamed from: c */
        public final a m31954c(c part) {
            C9322n.m27781e(part, "part");
            this.f26499c.add(part);
            return this;
        }

        /* renamed from: d */
        public final C10549x m31955d() {
            if (!this.f26499c.isEmpty()) {
                return new C10549x(this.f26497a, this.f26498b, C10727d.m32633S(this.f26499c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* renamed from: e */
        public final a m31956e(C10548w type) {
            C9322n.m27781e(type, "type");
            if (!C9322n.m27777a(type.m31947g(), "multipart")) {
                throw new IllegalArgumentException(C9322n.m27787k("multipart != ", type).toString());
            }
            this.f26498b = type;
            return this;
        }
    }

    /* renamed from: ql.x$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final void m31957a(StringBuilder sb2, String key) {
            String str;
            C9322n.m27781e(sb2, "<this>");
            C9322n.m27781e(key, "key");
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

    /* renamed from: ql.x$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: c */
        public static final a f26500c = new a(null);

        /* renamed from: a */
        private final C10545t f26501a;

        /* renamed from: b */
        private final AbstractC10523b0 f26502b;

        /* renamed from: ql.x$c$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final c m31960a(C10545t c10545t, AbstractC10523b0 body) {
                C9322n.m27781e(body, "body");
                C9315g c9315g = null;
                if (!((c10545t == null ? null : c10545t.m31845c("Content-Type")) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((c10545t == null ? null : c10545t.m31845c("Content-Length")) == null) {
                    return new c(c10545t, body, c9315g);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            /* renamed from: b */
            public final c m31961b(String name, String value) {
                C9322n.m27781e(name, "name");
                C9322n.m27781e(value, "value");
                return m31962c(name, null, AbstractC10523b0.a.m31629d(AbstractC10523b0.f26198a, value, null, 1, null));
            }

            /* renamed from: c */
            public final c m31962c(String name, String str, AbstractC10523b0 body) {
                C9322n.m27781e(name, "name");
                C9322n.m27781e(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = C10549x.f26483g;
                bVar.m31957a(sb2, name);
                if (str != null) {
                    sb2.append("; filename=");
                    bVar.m31957a(sb2, str);
                }
                String sb3 = sb2.toString();
                C9322n.m27780d(sb3, "StringBuilder().apply(builderAction).toString()");
                return m31960a(new C10545t.a().m31854d("Content-Disposition", sb3).m31855e(), body);
            }
        }

        private c(C10545t c10545t, AbstractC10523b0 abstractC10523b0) {
            this.f26501a = c10545t;
            this.f26502b = abstractC10523b0;
        }

        public /* synthetic */ c(C10545t c10545t, AbstractC10523b0 abstractC10523b0, C9315g c9315g) {
            this(c10545t, abstractC10523b0);
        }

        /* renamed from: a */
        public final AbstractC10523b0 m31958a() {
            return this.f26502b;
        }

        /* renamed from: b */
        public final C10545t m31959b() {
            return this.f26501a;
        }
    }

    static {
        C10548w.a aVar = C10548w.f26476e;
        f26484h = aVar.m31948a("multipart/mixed");
        f26485i = aVar.m31948a("multipart/alternative");
        f26486j = aVar.m31948a("multipart/digest");
        f26487k = aVar.m31948a("multipart/parallel");
        f26488l = aVar.m31948a("multipart/form-data");
        f26489m = new byte[]{58, 32};
        f26490n = new byte[]{13, 10};
        f26491o = new byte[]{45, 45};
    }

    public C10549x(C7061e boundaryByteString, C10548w type, List<c> parts) {
        C9322n.m27781e(boundaryByteString, "boundaryByteString");
        C9322n.m27781e(type, "type");
        C9322n.m27781e(parts, "parts");
        this.f26492b = boundaryByteString;
        this.f26493c = type;
        this.f26494d = parts;
        this.f26495e = C10548w.f26476e.m31948a(type + "; boundary=" + m31951g());
        this.f26496f = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private final long m31950h(InterfaceC7058c interfaceC7058c, boolean z10) {
        C7056b c7056b;
        if (z10) {
            interfaceC7058c = new C7056b();
            c7056b = interfaceC7058c;
        } else {
            c7056b = 0;
        }
        int size = this.f26494d.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            c cVar = this.f26494d.get(i10);
            C10545t m31959b = cVar.m31959b();
            AbstractC10523b0 m31958a = cVar.m31958a();
            C9322n.m27778b(interfaceC7058c);
            interfaceC7058c.write(f26491o);
            interfaceC7058c.mo20715b0(this.f26492b);
            interfaceC7058c.write(f26490n);
            if (m31959b != null) {
                int size2 = m31959b.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    interfaceC7058c.mo20705T(m31959b.m31846d(i12)).write(f26489m).mo20705T(m31959b.m31849l(i12)).write(f26490n);
                }
            }
            C10548w mo19706b = m31958a.mo19706b();
            if (mo19706b != null) {
                interfaceC7058c.mo20705T("Content-Type: ").mo20705T(mo19706b.toString()).write(f26490n);
            }
            long mo19705a = m31958a.mo19705a();
            if (mo19705a != -1) {
                interfaceC7058c.mo20705T("Content-Length: ").mo20736s0(mo19705a).write(f26490n);
            } else if (z10) {
                C9322n.m27778b(c7056b);
                c7056b.m20714b();
                return -1L;
            }
            byte[] bArr = f26490n;
            interfaceC7058c.write(bArr);
            if (z10) {
                j10 += mo19705a;
            } else {
                m31958a.mo19707f(interfaceC7058c);
            }
            interfaceC7058c.write(bArr);
            i10 = i11;
        }
        C9322n.m27778b(interfaceC7058c);
        byte[] bArr2 = f26491o;
        interfaceC7058c.write(bArr2);
        interfaceC7058c.mo20715b0(this.f26492b);
        interfaceC7058c.write(bArr2);
        interfaceC7058c.write(f26490n);
        if (!z10) {
            return j10;
        }
        C9322n.m27778b(c7056b);
        long size3 = j10 + c7056b.size();
        c7056b.m20714b();
        return size3;
    }

    @Override // p319ql.AbstractC10523b0
    /* renamed from: a */
    public long mo19705a() {
        long j10 = this.f26496f;
        if (j10 != -1) {
            return j10;
        }
        long m31950h = m31950h(null, true);
        this.f26496f = m31950h;
        return m31950h;
    }

    @Override // p319ql.AbstractC10523b0
    /* renamed from: b */
    public C10548w mo19706b() {
        return this.f26495e;
    }

    @Override // p319ql.AbstractC10523b0
    /* renamed from: f */
    public void mo19707f(InterfaceC7058c sink) {
        C9322n.m27781e(sink, "sink");
        m31950h(sink, false);
    }

    /* renamed from: g */
    public final String m31951g() {
        return this.f26492b.m20760F();
    }
}
