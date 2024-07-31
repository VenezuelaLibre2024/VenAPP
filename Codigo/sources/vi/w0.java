package vi;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f29223c = Logger.getLogger(w0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final e<byte[]> f29224d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final d<String> f29225e = new b();

    /* renamed from: f, reason: collision with root package name */
    static final fb.a f29226f = fb.a.b().l();

    /* renamed from: a, reason: collision with root package name */
    private Object[] f29227a;

    /* renamed from: b, reason: collision with root package name */
    private int f29228b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements e<byte[]> {
        a() {
        }
    }

    /* loaded from: classes3.dex */
    class b implements d<String> {
        b() {
        }

        @Override // vi.w0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(String str) {
            return str;
        }

        @Override // vi.w0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c<T> extends g<T> {

        /* renamed from: f, reason: collision with root package name */
        private final d<T> f29229f;

        private c(String str, boolean z10, d<T> dVar) {
            super(str, z10, dVar, null);
            eb.o.l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f29229f = (d) eb.o.p(dVar, "marshaller");
        }

        /* synthetic */ c(String str, boolean z10, d dVar, a aVar) {
            this(str, z10, dVar);
        }

        @Override // vi.w0.g
        T h(byte[] bArr) {
            return this.f29229f.b(new String(bArr, eb.e.f14594a));
        }

        @Override // vi.w0.g
        byte[] j(T t10) {
            return this.f29229f.a(t10).getBytes(eb.e.f14594a);
        }
    }

    /* loaded from: classes3.dex */
    public interface d<T> {
        String a(T t10);

        T b(String str);
    }

    /* loaded from: classes3.dex */
    public interface e<T> {
    }

    /* loaded from: classes3.dex */
    public interface f<T> {
        InputStream a(T t10);

        T b(InputStream inputStream);
    }

    /* loaded from: classes3.dex */
    public static abstract class g<T> {

        /* renamed from: e, reason: collision with root package name */
        private static final BitSet f29230e = b();

        /* renamed from: a, reason: collision with root package name */
        private final String f29231a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29232b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f29233c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f29234d;

        private g(String str, boolean z10, Object obj) {
            String str2 = (String) eb.o.p(str, "name");
            this.f29231a = str2;
            String k10 = k(str2.toLowerCase(Locale.ROOT), z10);
            this.f29232b = k10;
            this.f29233c = k10.getBytes(eb.e.f14594a);
            this.f29234d = obj;
        }

        /* synthetic */ g(String str, boolean z10, Object obj, a aVar) {
            this(str, z10, obj);
        }

        private static BitSet b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
                bitSet.set(c10);
            }
            for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
                bitSet.set(c11);
            }
            return bitSet;
        }

        public static <T> g<T> e(String str, d<T> dVar) {
            return f(str, false, dVar);
        }

        static <T> g<T> f(String str, boolean z10, d<T> dVar) {
            return new c(str, z10, dVar, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static <T> g<T> g(String str, boolean z10, j<T> jVar) {
            return new i(str, z10, jVar, null);
        }

        private static String k(String str, boolean z10) {
            eb.o.p(str, "name");
            eb.o.e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                w0.f29223c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (!z10 || charAt != ':' || i10 != 0) {
                    eb.o.g(f29230e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        byte[] a() {
            return this.f29233c;
        }

        final <M> M c(Class<M> cls) {
            if (cls.isInstance(this.f29234d)) {
                return cls.cast(this.f29234d);
            }
            return null;
        }

        public final String d() {
            return this.f29232b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f29232b.equals(((g) obj).f29232b);
        }

        abstract T h(byte[] bArr);

        public final int hashCode() {
            return this.f29232b.hashCode();
        }

        boolean i() {
            return false;
        }

        abstract byte[] j(T t10);

        public String toString() {
            return "Key{name='" + this.f29232b + "'}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class h<T> {

        /* renamed from: a, reason: collision with root package name */
        private final f<T> f29235a;

        /* renamed from: b, reason: collision with root package name */
        private final T f29236b;

        /* renamed from: c, reason: collision with root package name */
        private volatile byte[] f29237c;

        h(f<T> fVar, T t10) {
            this.f29235a = fVar;
            this.f29236b = t10;
        }

        static <T> h<T> a(g<T> gVar, T t10) {
            return new h<>((f) eb.o.o(b(gVar)), t10);
        }

        private static <T> f<T> b(g<T> gVar) {
            return (f) gVar.c(f.class);
        }

        byte[] c() {
            if (this.f29237c == null) {
                synchronized (this) {
                    if (this.f29237c == null) {
                        this.f29237c = w0.q(e());
                    }
                }
            }
            return this.f29237c;
        }

        <T2> T2 d(g<T2> gVar) {
            f b10;
            return (!gVar.i() || (b10 = b(gVar)) == null) ? gVar.h(c()) : (T2) b10.b(e());
        }

        InputStream e() {
            return this.f29235a.a(this.f29236b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class i<T> extends g<T> {

        /* renamed from: f, reason: collision with root package name */
        private final j<T> f29238f;

        private i(String str, boolean z10, j<T> jVar) {
            super(str, z10, jVar, null);
            eb.o.l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f29238f = (j) eb.o.p(jVar, "marshaller");
        }

        /* synthetic */ i(String str, boolean z10, j jVar, a aVar) {
            this(str, z10, jVar);
        }

        @Override // vi.w0.g
        T h(byte[] bArr) {
            return this.f29238f.b(bArr);
        }

        @Override // vi.w0.g
        byte[] j(T t10) {
            return this.f29238f.a(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface j<T> {
        byte[] a(T t10);

        T b(byte[] bArr);
    }

    public w0() {
    }

    w0(int i10, Object[] objArr) {
        this.f29228b = i10;
        this.f29227a = objArr;
    }

    w0(int i10, byte[]... bArr) {
        this(i10, (Object[]) bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    private boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private int d() {
        Object[] objArr = this.f29227a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private void f(int i10) {
        Object[] objArr = new Object[i10];
        if (!i()) {
            System.arraycopy(this.f29227a, 0, objArr, 0, j());
        }
        this.f29227a = objArr;
    }

    private boolean i() {
        return this.f29228b == 0;
    }

    private int j() {
        return this.f29228b * 2;
    }

    private void k() {
        if (j() == 0 || j() == d()) {
            f(Math.max(j() * 2, 8));
        }
    }

    private void m(int i10, byte[] bArr) {
        this.f29227a[i10 * 2] = bArr;
    }

    private byte[] n(int i10) {
        return (byte[]) this.f29227a[i10 * 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] q(InputStream inputStream) {
        try {
            return fb.b.d(inputStream);
        } catch (IOException e10) {
            throw new RuntimeException("failure reading serialized stream", e10);
        }
    }

    private Object r(int i10) {
        return this.f29227a[(i10 * 2) + 1];
    }

    private void s(int i10, Object obj) {
        if (this.f29227a instanceof byte[][]) {
            f(d());
        }
        this.f29227a[(i10 * 2) + 1] = obj;
    }

    private void t(int i10, byte[] bArr) {
        this.f29227a[(i10 * 2) + 1] = bArr;
    }

    private byte[] u(int i10) {
        Object r10 = r(i10);
        return r10 instanceof byte[] ? (byte[]) r10 : ((h) r10).c();
    }

    private <T> T v(int i10, g<T> gVar) {
        Object r10 = r(i10);
        return r10 instanceof byte[] ? gVar.h((byte[]) r10) : (T) ((h) r10).d(gVar);
    }

    public <T> void e(g<T> gVar) {
        if (i()) {
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f29228b; i11++) {
            if (!c(gVar.a(), n(i11))) {
                m(i10, n(i11));
                s(i10, r(i11));
                i10++;
            }
        }
        Arrays.fill(this.f29227a, i10 * 2, j(), (Object) null);
        this.f29228b = i10;
    }

    public <T> T g(g<T> gVar) {
        for (int i10 = this.f29228b - 1; i10 >= 0; i10--) {
            if (c(gVar.a(), n(i10))) {
                return (T) v(i10, gVar);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f29228b;
    }

    public void l(w0 w0Var) {
        if (w0Var.i()) {
            return;
        }
        int d10 = d() - j();
        if (i() || d10 < w0Var.j()) {
            f(j() + w0Var.j());
        }
        System.arraycopy(w0Var.f29227a, 0, this.f29227a, j(), w0Var.j());
        this.f29228b += w0Var.f29228b;
    }

    public <T> void o(g<T> gVar, T t10) {
        eb.o.p(gVar, Constants.KEY);
        eb.o.p(t10, "value");
        k();
        m(this.f29228b, gVar.a());
        if (gVar.i()) {
            s(this.f29228b, h.a(gVar, t10));
        } else {
            t(this.f29228b, gVar.j(t10));
        }
        this.f29228b++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[][] p() {
        byte[][] bArr = new byte[j()];
        Object[] objArr = this.f29227a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, j());
        } else {
            for (int i10 = 0; i10 < this.f29228b; i10++) {
                int i11 = i10 * 2;
                bArr[i11] = n(i10);
                bArr[i11 + 1] = u(i10);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f29228b; i10++) {
            if (i10 != 0) {
                sb2.append(',');
            }
            byte[] n10 = n(i10);
            Charset charset = eb.e.f14594a;
            String str = new String(n10, charset);
            sb2.append(str);
            sb2.append('=');
            sb2.append(str.endsWith("-bin") ? f29226f.f(u(i10)) : new String(u(i10), charset));
        }
        sb2.append(')');
        return sb2.toString();
    }
}
