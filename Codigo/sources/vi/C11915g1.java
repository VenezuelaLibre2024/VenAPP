package vi;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import p082eb.C7149e;
import p082eb.C7153i;
import p082eb.C7155k;
import p082eb.C7159o;
import p082eb.C7169y;
import vi.C11953w0;

/* renamed from: vi.g1 */
/* loaded from: classes3.dex */
public final class C11915g1 {

    /* renamed from: d */
    private static final boolean f31532d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));

    /* renamed from: e */
    private static final List<C11915g1> f31533e = m38132g();

    /* renamed from: f */
    public static final C11915g1 f31534f = b.OK.m38150h();

    /* renamed from: g */
    public static final C11915g1 f31535g = b.CANCELLED.m38150h();

    /* renamed from: h */
    public static final C11915g1 f31536h = b.UNKNOWN.m38150h();

    /* renamed from: i */
    public static final C11915g1 f31537i = b.INVALID_ARGUMENT.m38150h();

    /* renamed from: j */
    public static final C11915g1 f31538j = b.DEADLINE_EXCEEDED.m38150h();

    /* renamed from: k */
    public static final C11915g1 f31539k = b.NOT_FOUND.m38150h();

    /* renamed from: l */
    public static final C11915g1 f31540l = b.ALREADY_EXISTS.m38150h();

    /* renamed from: m */
    public static final C11915g1 f31541m = b.PERMISSION_DENIED.m38150h();

    /* renamed from: n */
    public static final C11915g1 f31542n = b.UNAUTHENTICATED.m38150h();

    /* renamed from: o */
    public static final C11915g1 f31543o = b.RESOURCE_EXHAUSTED.m38150h();

    /* renamed from: p */
    public static final C11915g1 f31544p = b.FAILED_PRECONDITION.m38150h();

    /* renamed from: q */
    public static final C11915g1 f31545q = b.ABORTED.m38150h();

    /* renamed from: r */
    public static final C11915g1 f31546r = b.OUT_OF_RANGE.m38150h();

    /* renamed from: s */
    public static final C11915g1 f31547s = b.UNIMPLEMENTED.m38150h();

    /* renamed from: t */
    public static final C11915g1 f31548t = b.INTERNAL.m38150h();

    /* renamed from: u */
    public static final C11915g1 f31549u = b.UNAVAILABLE.m38150h();

    /* renamed from: v */
    public static final C11915g1 f31550v = b.DATA_LOSS.m38150h();

    /* renamed from: w */
    static final C11953w0.g<C11915g1> f31551w;

    /* renamed from: x */
    private static final C11953w0.j<String> f31552x;

    /* renamed from: y */
    static final C11953w0.g<String> f31553y;

    /* renamed from: a */
    private final b f31554a;

    /* renamed from: b */
    private final String f31555b;

    /* renamed from: c */
    private final Throwable f31556c;

    /* renamed from: vi.g1$b */
    /* loaded from: classes3.dex */
    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        private final int value;
        private final byte[] valueAscii;

        b(int i10) {
            this.value = i10;
            this.valueAscii = Integer.toString(i10).getBytes(C7149e.f16017a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public byte[] m38149l() {
            return this.valueAscii;
        }

        /* renamed from: h */
        public C11915g1 m38150h() {
            return (C11915g1) C11915g1.f31533e.get(this.value);
        }

        /* renamed from: i */
        public int m38151i() {
            return this.value;
        }
    }

    /* renamed from: vi.g1$c */
    /* loaded from: classes3.dex */
    private static final class c implements C11953w0.j<C11915g1> {
        private c() {
        }

        @Override // vi.C11953w0.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C11915g1 mo25766b(byte[] bArr) {
            return C11915g1.m38135j(bArr);
        }

        @Override // vi.C11953w0.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] mo25765a(C11915g1 c11915g1) {
            return c11915g1.m38143n().m38149l();
        }
    }

    /* renamed from: vi.g1$d */
    /* loaded from: classes3.dex */
    private static final class d implements C11953w0.j<String> {

        /* renamed from: a */
        private static final byte[] f31558a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        /* renamed from: c */
        private static boolean m38154c(byte b10) {
            return b10 < 32 || b10 >= 126 || b10 == 37;
        }

        /* renamed from: e */
        private static String m38155e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i10 = 0;
            while (i10 < bArr.length) {
                if (bArr[i10] == 37 && i10 + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i10 + 1, 2, C7149e.f16017a), 16));
                        i10 += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i10]);
                i10++;
            }
            return new String(allocate.array(), 0, allocate.position(), C7149e.f16019c);
        }

        /* renamed from: g */
        private static byte[] m38156g(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[((bArr.length - i10) * 3) + i10];
            if (i10 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i10);
            }
            int i11 = i10;
            while (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (m38154c(b10)) {
                    bArr2[i11] = 37;
                    byte[] bArr3 = f31558a;
                    bArr2[i11 + 1] = bArr3[(b10 >> 4) & 15];
                    bArr2[i11 + 2] = bArr3[b10 & 15];
                    i11 += 3;
                } else {
                    bArr2[i11] = b10;
                    i11++;
                }
                i10++;
            }
            return Arrays.copyOf(bArr2, i11);
        }

        @Override // vi.C11953w0.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo25766b(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                    return m38155e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // vi.C11953w0.j
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] mo25765a(String str) {
            byte[] bytes = str.getBytes(C7149e.f16019c);
            for (int i10 = 0; i10 < bytes.length; i10++) {
                if (m38154c(bytes[i10])) {
                    return m38156g(bytes, i10);
                }
            }
            return bytes;
        }
    }

    static {
        f31551w = C11953w0.g.m38324g("grpc-status", false, new c());
        d dVar = new d();
        f31552x = dVar;
        f31553y = C11953w0.g.m38324g("grpc-message", false, dVar);
    }

    private C11915g1(b bVar) {
        this(bVar, null, null);
    }

    private C11915g1(b bVar, String str, Throwable th2) {
        this.f31554a = (b) C7159o.m21313p(bVar, "code");
        this.f31555b = str;
        this.f31556c = th2;
    }

    /* renamed from: g */
    private static List<C11915g1> m38132g() {
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            C11915g1 c11915g1 = (C11915g1) treeMap.put(Integer.valueOf(bVar.m38151i()), new C11915g1(bVar));
            if (c11915g1 != null) {
                throw new IllegalStateException("Code value duplication between " + c11915g1.m38143n().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static String m38133h(C11915g1 c11915g1) {
        if (c11915g1.f31555b == null) {
            return c11915g1.f31554a.toString();
        }
        return c11915g1.f31554a + ": " + c11915g1.f31555b;
    }

    /* renamed from: i */
    public static C11915g1 m38134i(int i10) {
        if (i10 >= 0) {
            List<C11915g1> list = f31533e;
            if (i10 <= list.size()) {
                return list.get(i10);
            }
        }
        return f31536h.m38147r("Unknown code " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static C11915g1 m38135j(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f31534f : m38136k(bArr);
    }

    /* renamed from: k */
    private static C11915g1 m38136k(byte[] bArr) {
        int i10;
        byte b10;
        int length = bArr.length;
        char c10 = 1;
        if (length != 1) {
            i10 = (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) ? 0 + ((b10 - 48) * 10) : 0;
            return f31536h.m38147r("Unknown code " + new String(bArr, C7149e.f16017a));
        }
        c10 = 0;
        byte b11 = bArr[c10];
        if (b11 >= 48 && b11 <= 57) {
            int i11 = i10 + (b11 - 48);
            List<C11915g1> list = f31533e;
            if (i11 < list.size()) {
                return list.get(i11);
            }
        }
        return f31536h.m38147r("Unknown code " + new String(bArr, C7149e.f16017a));
    }

    /* renamed from: l */
    public static C11915g1 m38137l(Throwable th2) {
        for (Throwable th3 = (Throwable) C7159o.m21313p(th2, "t"); th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof C11918h1) {
                return ((C11918h1) th3).m38159a();
            }
            if (th3 instanceof C11921i1) {
                return ((C11921i1) th3).m38167a();
            }
        }
        return f31536h.m38146q(th2);
    }

    /* renamed from: c */
    public C11918h1 m38138c() {
        return new C11918h1(this);
    }

    /* renamed from: d */
    public C11921i1 m38139d() {
        return new C11921i1(this);
    }

    /* renamed from: e */
    public C11921i1 m38140e(C11953w0 c11953w0) {
        return new C11921i1(this, c11953w0);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public C11915g1 m38141f(String str) {
        if (str == null) {
            return this;
        }
        if (this.f31555b == null) {
            return new C11915g1(this.f31554a, str, this.f31556c);
        }
        return new C11915g1(this.f31554a, this.f31555b + "\n" + str, this.f31556c);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: m */
    public Throwable m38142m() {
        return this.f31556c;
    }

    /* renamed from: n */
    public b m38143n() {
        return this.f31554a;
    }

    /* renamed from: o */
    public String m38144o() {
        return this.f31555b;
    }

    /* renamed from: p */
    public boolean m38145p() {
        return b.OK == this.f31554a;
    }

    /* renamed from: q */
    public C11915g1 m38146q(Throwable th2) {
        return C7155k.m21289a(this.f31556c, th2) ? this : new C11915g1(this.f31554a, this.f31555b, th2);
    }

    /* renamed from: r */
    public C11915g1 m38147r(String str) {
        return C7155k.m21289a(this.f31555b, str) ? this : new C11915g1(this.f31554a, str, this.f31556c);
    }

    public String toString() {
        C7153i.b m21284d = C7153i.m21274c(this).m21284d("code", this.f31554a.name()).m21284d("description", this.f31555b);
        Throwable th2 = this.f31556c;
        Object obj = th2;
        if (th2 != null) {
            obj = C7169y.m21361e(th2);
        }
        return m21284d.m21284d("cause", obj).toString();
    }
}
