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
import p082eb.C7149e;
import p082eb.C7159o;
import p103fb.AbstractC7323a;
import p103fb.C7324b;

/* renamed from: vi.w0 */
/* loaded from: classes3.dex */
public final class C11953w0 {

    /* renamed from: c */
    private static final Logger f31658c = Logger.getLogger(C11953w0.class.getName());

    /* renamed from: d */
    public static final e<byte[]> f31659d = new a();

    /* renamed from: e */
    public static final d<String> f31660e = new b();

    /* renamed from: f */
    static final AbstractC7323a f31661f = AbstractC7323a.m21950b().mo21960l();

    /* renamed from: a */
    private Object[] f31662a;

    /* renamed from: b */
    private int f31663b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vi.w0$a */
    /* loaded from: classes3.dex */
    public class a implements e<byte[]> {
        a() {
        }
    }

    /* renamed from: vi.w0$b */
    /* loaded from: classes3.dex */
    class b implements d<String> {
        b() {
        }

        @Override // vi.C11953w0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String mo25775b(String str) {
            return str;
        }

        @Override // vi.C11953w0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo25774a(String str) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vi.w0$c */
    /* loaded from: classes3.dex */
    public static class c<T> extends g<T> {

        /* renamed from: f */
        private final d<T> f31664f;

        private c(String str, boolean z10, d<T> dVar) {
            super(str, z10, dVar, null);
            C7159o.m21309l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f31664f = (d) C7159o.m21313p(dVar, "marshaller");
        }

        /* synthetic */ c(String str, boolean z10, d dVar, a aVar) {
            this(str, z10, dVar);
        }

        @Override // vi.C11953w0.g
        /* renamed from: h */
        T mo38317h(byte[] bArr) {
            return this.f31664f.mo25775b(new String(bArr, C7149e.f16017a));
        }

        @Override // vi.C11953w0.g
        /* renamed from: j */
        byte[] mo38318j(T t10) {
            return this.f31664f.mo25774a(t10).getBytes(C7149e.f16017a);
        }
    }

    /* renamed from: vi.w0$d */
    /* loaded from: classes3.dex */
    public interface d<T> {
        /* renamed from: a */
        String mo25774a(T t10);

        /* renamed from: b */
        T mo25775b(String str);
    }

    /* renamed from: vi.w0$e */
    /* loaded from: classes3.dex */
    public interface e<T> {
    }

    /* renamed from: vi.w0$f */
    /* loaded from: classes3.dex */
    public interface f<T> {
        /* renamed from: a */
        InputStream m38319a(T t10);

        /* renamed from: b */
        T m38320b(InputStream inputStream);
    }

    /* renamed from: vi.w0$g */
    /* loaded from: classes3.dex */
    public static abstract class g<T> {

        /* renamed from: e */
        private static final BitSet f31665e = m38321b();

        /* renamed from: a */
        private final String f31666a;

        /* renamed from: b */
        private final String f31667b;

        /* renamed from: c */
        private final byte[] f31668c;

        /* renamed from: d */
        private final Object f31669d;

        private g(String str, boolean z10, Object obj) {
            String str2 = (String) C7159o.m21313p(str, "name");
            this.f31666a = str2;
            String m38325k = m38325k(str2.toLowerCase(Locale.ROOT), z10);
            this.f31667b = m38325k;
            this.f31668c = m38325k.getBytes(C7149e.f16017a);
            this.f31669d = obj;
        }

        /* synthetic */ g(String str, boolean z10, Object obj, a aVar) {
            this(str, z10, obj);
        }

        /* renamed from: b */
        private static BitSet m38321b() {
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

        /* renamed from: e */
        public static <T> g<T> m38322e(String str, d<T> dVar) {
            return m38323f(str, false, dVar);
        }

        /* renamed from: f */
        static <T> g<T> m38323f(String str, boolean z10, d<T> dVar) {
            return new c(str, z10, dVar, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public static <T> g<T> m38324g(String str, boolean z10, j<T> jVar) {
            return new i(str, z10, jVar, null);
        }

        /* renamed from: k */
        private static String m38325k(String str, boolean z10) {
            C7159o.m21313p(str, "name");
            C7159o.m21302e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                C11953w0.f31658c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (!z10 || charAt != ':' || i10 != 0) {
                    C7159o.m21304g(f31665e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        /* renamed from: a */
        byte[] m38326a() {
            return this.f31668c;
        }

        /* renamed from: c */
        final <M> M m38327c(Class<M> cls) {
            if (cls.isInstance(this.f31669d)) {
                return cls.cast(this.f31669d);
            }
            return null;
        }

        /* renamed from: d */
        public final String m38328d() {
            return this.f31667b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f31667b.equals(((g) obj).f31667b);
        }

        /* renamed from: h */
        abstract T mo38317h(byte[] bArr);

        public final int hashCode() {
            return this.f31667b.hashCode();
        }

        /* renamed from: i */
        boolean m38329i() {
            return false;
        }

        /* renamed from: j */
        abstract byte[] mo38318j(T t10);

        public String toString() {
            return "Key{name='" + this.f31667b + "'}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vi.w0$h */
    /* loaded from: classes3.dex */
    public static final class h<T> {

        /* renamed from: a */
        private final f<T> f31670a;

        /* renamed from: b */
        private final T f31671b;

        /* renamed from: c */
        private volatile byte[] f31672c;

        h(f<T> fVar, T t10) {
            this.f31670a = fVar;
            this.f31671b = t10;
        }

        /* renamed from: a */
        static <T> h<T> m38330a(g<T> gVar, T t10) {
            return new h<>((f) C7159o.m21312o(m38331b(gVar)), t10);
        }

        /* renamed from: b */
        private static <T> f<T> m38331b(g<T> gVar) {
            return (f) gVar.m38327c(f.class);
        }

        /* renamed from: c */
        byte[] m38332c() {
            if (this.f31672c == null) {
                synchronized (this) {
                    if (this.f31672c == null) {
                        this.f31672c = C11953w0.m38303q(m38334e());
                    }
                }
            }
            return this.f31672c;
        }

        /* renamed from: d */
        <T2> T2 m38333d(g<T2> gVar) {
            f m38331b;
            return (!gVar.m38329i() || (m38331b = m38331b(gVar)) == null) ? gVar.mo38317h(m38332c()) : (T2) m38331b.m38320b(m38334e());
        }

        /* renamed from: e */
        InputStream m38334e() {
            return this.f31670a.m38319a(this.f31671b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vi.w0$i */
    /* loaded from: classes3.dex */
    public static final class i<T> extends g<T> {

        /* renamed from: f */
        private final j<T> f31673f;

        private i(String str, boolean z10, j<T> jVar) {
            super(str, z10, jVar, null);
            C7159o.m21309l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f31673f = (j) C7159o.m21313p(jVar, "marshaller");
        }

        /* synthetic */ i(String str, boolean z10, j jVar, a aVar) {
            this(str, z10, jVar);
        }

        @Override // vi.C11953w0.g
        /* renamed from: h */
        T mo38317h(byte[] bArr) {
            return this.f31673f.mo25766b(bArr);
        }

        @Override // vi.C11953w0.g
        /* renamed from: j */
        byte[] mo38318j(T t10) {
            return this.f31673f.mo25765a(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vi.w0$j */
    /* loaded from: classes3.dex */
    public interface j<T> {
        /* renamed from: a */
        byte[] mo25765a(T t10);

        /* renamed from: b */
        T mo25766b(byte[] bArr);
    }

    public C11953w0() {
    }

    C11953w0(int i10, Object[] objArr) {
        this.f31663b = i10;
        this.f31662a = objArr;
    }

    C11953w0(int i10, byte[]... bArr) {
        this(i10, (Object[]) bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11953w0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* renamed from: c */
    private boolean m38295c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: d */
    private int m38296d() {
        Object[] objArr = this.f31662a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: f */
    private void m38297f(int i10) {
        Object[] objArr = new Object[i10];
        if (!m38298i()) {
            System.arraycopy(this.f31662a, 0, objArr, 0, m38299j());
        }
        this.f31662a = objArr;
    }

    /* renamed from: i */
    private boolean m38298i() {
        return this.f31663b == 0;
    }

    /* renamed from: j */
    private int m38299j() {
        return this.f31663b * 2;
    }

    /* renamed from: k */
    private void m38300k() {
        if (m38299j() == 0 || m38299j() == m38296d()) {
            m38297f(Math.max(m38299j() * 2, 8));
        }
    }

    /* renamed from: m */
    private void m38301m(int i10, byte[] bArr) {
        this.f31662a[i10 * 2] = bArr;
    }

    /* renamed from: n */
    private byte[] m38302n(int i10) {
        return (byte[]) this.f31662a[i10 * 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static byte[] m38303q(InputStream inputStream) {
        try {
            return C7324b.m21978d(inputStream);
        } catch (IOException e10) {
            throw new RuntimeException("failure reading serialized stream", e10);
        }
    }

    /* renamed from: r */
    private Object m38304r(int i10) {
        return this.f31662a[(i10 * 2) + 1];
    }

    /* renamed from: s */
    private void m38305s(int i10, Object obj) {
        if (this.f31662a instanceof byte[][]) {
            m38297f(m38296d());
        }
        this.f31662a[(i10 * 2) + 1] = obj;
    }

    /* renamed from: t */
    private void m38306t(int i10, byte[] bArr) {
        this.f31662a[(i10 * 2) + 1] = bArr;
    }

    /* renamed from: u */
    private byte[] m38307u(int i10) {
        Object m38304r = m38304r(i10);
        return m38304r instanceof byte[] ? (byte[]) m38304r : ((h) m38304r).m38332c();
    }

    /* renamed from: v */
    private <T> T m38308v(int i10, g<T> gVar) {
        Object m38304r = m38304r(i10);
        return m38304r instanceof byte[] ? gVar.mo38317h((byte[]) m38304r) : (T) ((h) m38304r).m38333d(gVar);
    }

    /* renamed from: e */
    public <T> void m38309e(g<T> gVar) {
        if (m38298i()) {
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f31663b; i11++) {
            if (!m38295c(gVar.m38326a(), m38302n(i11))) {
                m38301m(i10, m38302n(i11));
                m38305s(i10, m38304r(i11));
                i10++;
            }
        }
        Arrays.fill(this.f31662a, i10 * 2, m38299j(), (Object) null);
        this.f31663b = i10;
    }

    /* renamed from: g */
    public <T> T m38310g(g<T> gVar) {
        for (int i10 = this.f31663b - 1; i10 >= 0; i10--) {
            if (m38295c(gVar.m38326a(), m38302n(i10))) {
                return (T) m38308v(i10, gVar);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m38311h() {
        return this.f31663b;
    }

    /* renamed from: l */
    public void m38312l(C11953w0 c11953w0) {
        if (c11953w0.m38298i()) {
            return;
        }
        int m38296d = m38296d() - m38299j();
        if (m38298i() || m38296d < c11953w0.m38299j()) {
            m38297f(m38299j() + c11953w0.m38299j());
        }
        System.arraycopy(c11953w0.f31662a, 0, this.f31662a, m38299j(), c11953w0.m38299j());
        this.f31663b += c11953w0.f31663b;
    }

    /* renamed from: o */
    public <T> void m38313o(g<T> gVar, T t10) {
        C7159o.m21313p(gVar, Constants.KEY);
        C7159o.m21313p(t10, "value");
        m38300k();
        m38301m(this.f31663b, gVar.m38326a());
        if (gVar.m38329i()) {
            m38305s(this.f31663b, h.m38330a(gVar, t10));
        } else {
            m38306t(this.f31663b, gVar.mo38318j(t10));
        }
        this.f31663b++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public byte[][] m38314p() {
        byte[][] bArr = new byte[m38299j()];
        Object[] objArr = this.f31662a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, m38299j());
        } else {
            for (int i10 = 0; i10 < this.f31663b; i10++) {
                int i11 = i10 * 2;
                bArr[i11] = m38302n(i10);
                bArr[i11 + 1] = m38307u(i10);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f31663b; i10++) {
            if (i10 != 0) {
                sb2.append(',');
            }
            byte[] m38302n = m38302n(i10);
            Charset charset = C7149e.f16017a;
            String str = new String(m38302n, charset);
            sb2.append(str);
            sb2.append('=');
            sb2.append(str.endsWith("-bin") ? f31661f.m21955f(m38307u(i10)) : new String(m38307u(i10), charset));
        }
        sb2.append(')');
        return sb2.toString();
    }
}
