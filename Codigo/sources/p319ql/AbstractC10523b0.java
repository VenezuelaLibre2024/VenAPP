package p319ql;

import dm.C7068l;
import dm.InterfaceC7058c;
import dm.InterfaceC7080x;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import p341rl.C10727d;
import p450xk.C12512d;

/* renamed from: ql.b0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10523b0 {

    /* renamed from: a */
    public static final a f26198a = new a(null);

    /* renamed from: ql.b0$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: ql.b0$a$a */
        /* loaded from: classes3.dex */
        public static final class C13235a extends AbstractC10523b0 {

            /* renamed from: b */
            final /* synthetic */ C10548w f26199b;

            /* renamed from: c */
            final /* synthetic */ File f26200c;

            C13235a(C10548w c10548w, File file) {
                this.f26199b = c10548w;
                this.f26200c = file;
            }

            @Override // p319ql.AbstractC10523b0
            /* renamed from: a */
            public long mo19705a() {
                return this.f26200c.length();
            }

            @Override // p319ql.AbstractC10523b0
            /* renamed from: b */
            public C10548w mo19706b() {
                return this.f26199b;
            }

            @Override // p319ql.AbstractC10523b0
            /* renamed from: f */
            public void mo19707f(InterfaceC7058c sink) {
                C9322n.m27781e(sink, "sink");
                InterfaceC7080x m20807f = C7068l.m20807f(this.f26200c);
                try {
                    sink.mo20693E0(m20807f);
                    C9602b.m28593a(m20807f, null);
                } finally {
                }
            }
        }

        /* renamed from: ql.b0$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC10523b0 {

            /* renamed from: b */
            final /* synthetic */ C10548w f26201b;

            /* renamed from: c */
            final /* synthetic */ int f26202c;

            /* renamed from: d */
            final /* synthetic */ byte[] f26203d;

            /* renamed from: e */
            final /* synthetic */ int f26204e;

            b(C10548w c10548w, int i10, byte[] bArr, int i11) {
                this.f26201b = c10548w;
                this.f26202c = i10;
                this.f26203d = bArr;
                this.f26204e = i11;
            }

            @Override // p319ql.AbstractC10523b0
            /* renamed from: a */
            public long mo19705a() {
                return this.f26202c;
            }

            @Override // p319ql.AbstractC10523b0
            /* renamed from: b */
            public C10548w mo19706b() {
                return this.f26201b;
            }

            @Override // p319ql.AbstractC10523b0
            /* renamed from: f */
            public void mo19707f(InterfaceC7058c sink) {
                C9322n.m27781e(sink, "sink");
                sink.write(this.f26203d, this.f26204e, this.f26202c);
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ AbstractC10523b0 m31629d(a aVar, String str, C10548w c10548w, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c10548w = null;
            }
            return aVar.m31632b(str, c10548w);
        }

        /* renamed from: e */
        public static /* synthetic */ AbstractC10523b0 m31630e(a aVar, byte[] bArr, C10548w c10548w, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                c10548w = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.m31633c(bArr, c10548w, i10, i11);
        }

        /* renamed from: a */
        public final AbstractC10523b0 m31631a(File file, C10548w c10548w) {
            C9322n.m27781e(file, "<this>");
            return new C13235a(c10548w, file);
        }

        /* renamed from: b */
        public final AbstractC10523b0 m31632b(String str, C10548w c10548w) {
            C9322n.m27781e(str, "<this>");
            Charset charset = C12512d.f33913b;
            if (c10548w != null) {
                Charset m31943d = C10548w.m31943d(c10548w, null, 1, null);
                if (m31943d == null) {
                    c10548w = C10548w.f26476e.m31949b(c10548w + "; charset=utf-8");
                } else {
                    charset = m31943d;
                }
            }
            byte[] bytes = str.getBytes(charset);
            C9322n.m27780d(bytes, "this as java.lang.String).getBytes(charset)");
            return m31633c(bytes, c10548w, 0, bytes.length);
        }

        /* renamed from: c */
        public final AbstractC10523b0 m31633c(byte[] bArr, C10548w c10548w, int i10, int i11) {
            C9322n.m27781e(bArr, "<this>");
            C10727d.m32652l(bArr.length, i10, i11);
            return new b(c10548w, i11, bArr, i10);
        }
    }

    /* renamed from: c */
    public static final AbstractC10523b0 m31626c(File file, C10548w c10548w) {
        return f26198a.m31631a(file, c10548w);
    }

    /* renamed from: a */
    public abstract long mo19705a();

    /* renamed from: b */
    public abstract C10548w mo19706b();

    /* renamed from: d */
    public boolean m31627d() {
        return false;
    }

    /* renamed from: e */
    public boolean m31628e() {
        return false;
    }

    /* renamed from: f */
    public abstract void mo19707f(InterfaceC7058c interfaceC7058c);
}
