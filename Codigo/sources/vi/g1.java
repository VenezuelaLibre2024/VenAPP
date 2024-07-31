package vi;

import eb.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import vi.w0;

/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: d */
    private static final boolean f29098d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));

    /* renamed from: e */
    private static final List<g1> f29099e = g();

    /* renamed from: f */
    public static final g1 f29100f = b.OK.h();

    /* renamed from: g */
    public static final g1 f29101g = b.CANCELLED.h();

    /* renamed from: h */
    public static final g1 f29102h = b.UNKNOWN.h();

    /* renamed from: i */
    public static final g1 f29103i = b.INVALID_ARGUMENT.h();

    /* renamed from: j */
    public static final g1 f29104j = b.DEADLINE_EXCEEDED.h();

    /* renamed from: k */
    public static final g1 f29105k = b.NOT_FOUND.h();

    /* renamed from: l */
    public static final g1 f29106l = b.ALREADY_EXISTS.h();

    /* renamed from: m */
    public static final g1 f29107m = b.PERMISSION_DENIED.h();

    /* renamed from: n */
    public static final g1 f29108n = b.UNAUTHENTICATED.h();

    /* renamed from: o */
    public static final g1 f29109o = b.RESOURCE_EXHAUSTED.h();

    /* renamed from: p */
    public static final g1 f29110p = b.FAILED_PRECONDITION.h();

    /* renamed from: q */
    public static final g1 f29111q = b.ABORTED.h();

    /* renamed from: r */
    public static final g1 f29112r = b.OUT_OF_RANGE.h();

    /* renamed from: s */
    public static final g1 f29113s = b.UNIMPLEMENTED.h();

    /* renamed from: t */
    public static final g1 f29114t = b.INTERNAL.h();

    /* renamed from: u */
    public static final g1 f29115u = b.UNAVAILABLE.h();

    /* renamed from: v */
    public static final g1 f29116v = b.DATA_LOSS.h();

    /* renamed from: w */
    static final w0.g<g1> f29117w = w0.g.g("grpc-status", false, new c());

    /* renamed from: x */
    private static final w0.j<String> f29118x;

    /* renamed from: y */
    static final w0.g<String> f29119y;

    /* renamed from: a */
    private final b f29120a;

    /* renamed from: b */
    private final String f29121b;

    /* renamed from: c */
    private final Throwable f29122c;

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
            this.valueAscii = Integer.toString(i10).getBytes(eb.e.f14594a);
        }

        public byte[] l() {
            return this.valueAscii;
        }

        public g1 h() {
            return (g1) g1.f29099e.get(this.value);
        }

        public int i() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    private static final class c implements w0.j<g1> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // vi.w0.j
        /* renamed from: c */
        public g1 b(byte[] bArr) {
            return g1.j(bArr);
        }

        @Override // vi.w0.j
        /* renamed from: d */
        public byte[] a(g1 g1Var) {
            return g1Var.n().l();
        }
    }

    /* loaded from: classes3.dex */
    private static final class d implements w0.j<String> {

        /* renamed from: a */
        private static final byte[] f29123a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        private static boolean c(byte b10) {
            return b10 < 32 || b10 >= 126 || b10 == 37;
        }

        private static String e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i10 = 0;
            while (i10 < bArr.length) {
                if (bArr[i10] == 37 && i10 + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i10 + 1, 2, eb.e.f14594a), 16));
                        i10 += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i10]);
                i10++;
            }
            return new String(allocate.array(), 0, allocate.position(), eb.e.f14596c);
        }

        private static byte[] g(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[((bArr.length - i10) * 3) + i10];
            if (i10 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i10);
            }
            int i11 = i10;
            while (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (c(b10)) {
                    bArr2[i11] = 37;
                    byte[] bArr3 = f29123a;
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

        @Override // vi.w0.j
        /* renamed from: d */
        public String b(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                    return e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // vi.w0.j
        /* renamed from: f */
        public byte[] a(String str) {
            byte[] bytes = str.getBytes(eb.e.f14596c);
            for (int i10 = 0; i10 < bytes.length; i10++) {
                if (c(bytes[i10])) {
                    return g(bytes, i10);
                }
            }
            return bytes;
        }
    }

    static {
        d dVar = new d();
        f29118x = dVar;
        f29119y = w0.g.g("grpc-message", false, dVar);
    }

    private g1(b bVar) {
        this(bVar, null, null);
    }

    private g1(b bVar, String str, Throwable th2) {
        this.f29120a = (b) eb.o.p(bVar, "code");
        this.f29121b = str;
        this.f29122c = th2;
    }

    private static List<g1> g() {
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            g1 g1Var = (g1) treeMap.put(Integer.valueOf(bVar.i()), new g1(bVar));
            if (g1Var != null) {
                throw new IllegalStateException("Code value duplication between " + g1Var.n().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    public static String h(g1 g1Var) {
        if (g1Var.f29121b == null) {
            return g1Var.f29120a.toString();
        }
        return g1Var.f29120a + ": " + g1Var.f29121b;
    }

    public static g1 i(int i10) {
        if (i10 >= 0) {
            List<g1> list = f29099e;
            if (i10 <= list.size()) {
                return list.get(i10);
            }
        }
        return f29102h.r("Unknown code " + i10);
    }

    public static g1 j(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f29100f : k(bArr);
    }

    private static g1 k(byte[] bArr) {
        int i10;
        byte b10;
        int length = bArr.length;
        char c10 = 1;
        if (length != 1) {
            i10 = (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) ? 0 + ((b10 - 48) * 10) : 0;
            return f29102h.r("Unknown code " + new String(bArr, eb.e.f14594a));
        }
        c10 = 0;
        byte b11 = bArr[c10];
        if (b11 >= 48 && b11 <= 57) {
            int i11 = i10 + (b11 - 48);
            List<g1> list = f29099e;
            if (i11 < list.size()) {
                return list.get(i11);
            }
        }
        return f29102h.r("Unknown code " + new String(bArr, eb.e.f14594a));
    }

    public static g1 l(Throwable th2) {
        for (Throwable th3 = (Throwable) eb.o.p(th2, "t"); th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof h1) {
                return ((h1) th3).a();
            }
            if (th3 instanceof i1) {
                return ((i1) th3).a();
            }
        }
        return f29102h.q(th2);
    }

    public h1 c() {
        return new h1(this);
    }

    public i1 d() {
        return new i1(this);
    }

    public i1 e(w0 w0Var) {
        return new i1(this, w0Var);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public g1 f(String str) {
        if (str == null) {
            return this;
        }
        if (this.f29121b == null) {
            return new g1(this.f29120a, str, this.f29122c);
        }
        return new g1(this.f29120a, this.f29121b + "\n" + str, this.f29122c);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Throwable m() {
        return this.f29122c;
    }

    public b n() {
        return this.f29120a;
    }

    public String o() {
        return this.f29121b;
    }

    public boolean p() {
        return b.OK == this.f29120a;
    }

    public g1 q(Throwable th2) {
        return eb.k.a(this.f29122c, th2) ? this : new g1(this.f29120a, this.f29121b, th2);
    }

    public g1 r(String str) {
        return eb.k.a(this.f29121b, str) ? this : new g1(this.f29120a, str, this.f29122c);
    }

    public String toString() {
        i.b d10 = eb.i.c(this).d("code", this.f29120a.name()).d("description", this.f29121b);
        Throwable th2 = this.f29122c;
        Object obj = th2;
        if (th2 != null) {
            obj = eb.y.e(th2);
        }
        return d10.d("cause", obj).toString();
    }
}
