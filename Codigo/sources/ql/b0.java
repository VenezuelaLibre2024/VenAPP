package ql;

import java.io.File;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class b0 {

    /* renamed from: a */
    public static final a f24156a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: ql.b0$a$a */
        /* loaded from: classes3.dex */
        public static final class C0400a extends b0 {

            /* renamed from: b */
            final /* synthetic */ w f24157b;

            /* renamed from: c */
            final /* synthetic */ File f24158c;

            C0400a(w wVar, File file) {
                this.f24157b = wVar;
                this.f24158c = file;
            }

            @Override // ql.b0
            public long a() {
                return this.f24158c.length();
            }

            @Override // ql.b0
            public w b() {
                return this.f24157b;
            }

            @Override // ql.b0
            public void f(dm.c sink) {
                kotlin.jvm.internal.n.e(sink, "sink");
                dm.x f10 = dm.l.f(this.f24158c);
                try {
                    sink.E0(f10);
                    mk.b.a(f10, null);
                } finally {
                }
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends b0 {

            /* renamed from: b */
            final /* synthetic */ w f24159b;

            /* renamed from: c */
            final /* synthetic */ int f24160c;

            /* renamed from: d */
            final /* synthetic */ byte[] f24161d;

            /* renamed from: e */
            final /* synthetic */ int f24162e;

            b(w wVar, int i10, byte[] bArr, int i11) {
                this.f24159b = wVar;
                this.f24160c = i10;
                this.f24161d = bArr;
                this.f24162e = i11;
            }

            @Override // ql.b0
            public long a() {
                return this.f24160c;
            }

            @Override // ql.b0
            public w b() {
                return this.f24159b;
            }

            @Override // ql.b0
            public void f(dm.c sink) {
                kotlin.jvm.internal.n.e(sink, "sink");
                sink.write(this.f24161d, this.f24162e, this.f24160c);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static /* synthetic */ b0 d(a aVar, String str, w wVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                wVar = null;
            }
            return aVar.b(str, wVar);
        }

        public static /* synthetic */ b0 e(a aVar, byte[] bArr, w wVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                wVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.c(bArr, wVar, i10, i11);
        }

        public final b0 a(File file, w wVar) {
            kotlin.jvm.internal.n.e(file, "<this>");
            return new C0400a(wVar, file);
        }

        public final b0 b(String str, w wVar) {
            kotlin.jvm.internal.n.e(str, "<this>");
            Charset charset = xk.d.f31393b;
            if (wVar != null) {
                Charset d10 = w.d(wVar, null, 1, null);
                if (d10 == null) {
                    wVar = w.f24382e.b(wVar + "; charset=utf-8");
                } else {
                    charset = d10;
                }
            }
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.n.d(bytes, "this as java.lang.String).getBytes(charset)");
            return c(bytes, wVar, 0, bytes.length);
        }

        public final b0 c(byte[] bArr, w wVar, int i10, int i11) {
            kotlin.jvm.internal.n.e(bArr, "<this>");
            rl.d.l(bArr.length, i10, i11);
            return new b(wVar, i11, bArr, i10);
        }
    }

    public static final b0 c(File file, w wVar) {
        return f24156a.a(file, wVar);
    }

    public abstract long a();

    public abstract w b();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public abstract void f(dm.c cVar);
}
