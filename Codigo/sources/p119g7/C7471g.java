package p119g7;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p082eb.InterfaceC7151g;
import p119g7.AbstractC7465a;
import p250n7.C9672a;
import p250n7.C9674c;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11164n0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11179x;
import p396v6.C11635c;
import p436x6.C12318m;
import p459y6.C12608b;
import p459y6.C12610c;
import p459y6.C12632v;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: g7.g */
/* loaded from: classes.dex */
public class C7471g implements InterfaceC12621k {

    /* renamed from: I */
    public static final InterfaceC12626p f17498I = new InterfaceC12626p() { // from class: g7.f
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m22663m;
            m22663m = C7471g.m22663m();
            return m22663m;
        }
    };

    /* renamed from: J */
    private static final byte[] f17499J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K */
    private static final C11108u1 f17500K = new C11108u1.b().m34552g0("application/x-emsg").m34526G();

    /* renamed from: A */
    private int f17501A;

    /* renamed from: B */
    private int f17502B;

    /* renamed from: C */
    private int f17503C;

    /* renamed from: D */
    private boolean f17504D;

    /* renamed from: E */
    private InterfaceC12623m f17505E;

    /* renamed from: F */
    private InterfaceC12609b0[] f17506F;

    /* renamed from: G */
    private InterfaceC12609b0[] f17507G;

    /* renamed from: H */
    private boolean f17508H;

    /* renamed from: a */
    private final int f17509a;

    /* renamed from: b */
    private final C7479o f17510b;

    /* renamed from: c */
    private final List<C11108u1> f17511c;

    /* renamed from: d */
    private final SparseArray<b> f17512d;

    /* renamed from: e */
    private final C11146e0 f17513e;

    /* renamed from: f */
    private final C11146e0 f17514f;

    /* renamed from: g */
    private final C11146e0 f17515g;

    /* renamed from: h */
    private final byte[] f17516h;

    /* renamed from: i */
    private final C11146e0 f17517i;

    /* renamed from: j */
    private final C11164n0 f17518j;

    /* renamed from: k */
    private final C9674c f17519k;

    /* renamed from: l */
    private final C11146e0 f17520l;

    /* renamed from: m */
    private final ArrayDeque<AbstractC7465a.a> f17521m;

    /* renamed from: n */
    private final ArrayDeque<a> f17522n;

    /* renamed from: o */
    private final InterfaceC12609b0 f17523o;

    /* renamed from: p */
    private int f17524p;

    /* renamed from: q */
    private int f17525q;

    /* renamed from: r */
    private long f17526r;

    /* renamed from: s */
    private int f17527s;

    /* renamed from: t */
    private C11146e0 f17528t;

    /* renamed from: u */
    private long f17529u;

    /* renamed from: v */
    private int f17530v;

    /* renamed from: w */
    private long f17531w;

    /* renamed from: x */
    private long f17532x;

    /* renamed from: y */
    private long f17533y;

    /* renamed from: z */
    private b f17534z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f17535a;

        /* renamed from: b */
        public final boolean f17536b;

        /* renamed from: c */
        public final int f17537c;

        public a(long j10, boolean z10, int i10) {
            this.f17535a = j10;
            this.f17536b = z10;
            this.f17537c = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.g$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC12609b0 f17538a;

        /* renamed from: d */
        public C7482r f17541d;

        /* renamed from: e */
        public C7467c f17542e;

        /* renamed from: f */
        public int f17543f;

        /* renamed from: g */
        public int f17544g;

        /* renamed from: h */
        public int f17545h;

        /* renamed from: i */
        public int f17546i;

        /* renamed from: l */
        private boolean f17549l;

        /* renamed from: b */
        public final C7481q f17539b = new C7481q();

        /* renamed from: c */
        public final C11146e0 f17540c = new C11146e0();

        /* renamed from: j */
        private final C11146e0 f17547j = new C11146e0(1);

        /* renamed from: k */
        private final C11146e0 f17548k = new C11146e0();

        public b(InterfaceC12609b0 interfaceC12609b0, C7482r c7482r, C7467c c7467c) {
            this.f17538a = interfaceC12609b0;
            this.f17541d = c7482r;
            this.f17542e = c7467c;
            m22686j(c7482r, c7467c);
        }

        /* renamed from: c */
        public int m22679c() {
            int i10 = !this.f17549l ? this.f17541d.f17633g[this.f17543f] : this.f17539b.f17619k[this.f17543f] ? 1 : 0;
            return m22683g() != null ? i10 | 1073741824 : i10;
        }

        /* renamed from: d */
        public long m22680d() {
            return !this.f17549l ? this.f17541d.f17629c[this.f17543f] : this.f17539b.f17615g[this.f17545h];
        }

        /* renamed from: e */
        public long m22681e() {
            return !this.f17549l ? this.f17541d.f17632f[this.f17543f] : this.f17539b.m22752c(this.f17543f);
        }

        /* renamed from: f */
        public int m22682f() {
            return !this.f17549l ? this.f17541d.f17630d[this.f17543f] : this.f17539b.f17617i[this.f17543f];
        }

        /* renamed from: g */
        public C7480p m22683g() {
            if (!this.f17549l) {
                return null;
            }
            int i10 = ((C7467c) C11172r0.m34928j(this.f17539b.f17609a)).f17487a;
            C7480p c7480p = this.f17539b.f17622n;
            if (c7480p == null) {
                c7480p = this.f17541d.f17627a.m22748a(i10);
            }
            if (c7480p == null || !c7480p.f17604a) {
                return null;
            }
            return c7480p;
        }

        /* renamed from: h */
        public boolean m22684h() {
            this.f17543f++;
            if (!this.f17549l) {
                return false;
            }
            int i10 = this.f17544g + 1;
            this.f17544g = i10;
            int[] iArr = this.f17539b.f17616h;
            int i11 = this.f17545h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f17545h = i11 + 1;
            this.f17544g = 0;
            return false;
        }

        /* renamed from: i */
        public int m22685i(int i10, int i11) {
            C11146e0 c11146e0;
            C7480p m22683g = m22683g();
            if (m22683g == null) {
                return 0;
            }
            int i12 = m22683g.f17607d;
            if (i12 != 0) {
                c11146e0 = this.f17539b.f17623o;
            } else {
                byte[] bArr = (byte[]) C11172r0.m34928j(m22683g.f17608e);
                this.f17548k.m34675S(bArr, bArr.length);
                C11146e0 c11146e02 = this.f17548k;
                i12 = bArr.length;
                c11146e0 = c11146e02;
            }
            boolean m22756g = this.f17539b.m22756g(this.f17543f);
            boolean z10 = m22756g || i11 != 0;
            this.f17547j.m34682e()[0] = (byte) ((z10 ? RecognitionOptions.ITF : 0) | i12);
            this.f17547j.m34677U(0);
            this.f17538a.mo333d(this.f17547j, 1, 1);
            this.f17538a.mo333d(c11146e0, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!m22756g) {
                this.f17540c.m34673Q(8);
                byte[] m34682e = this.f17540c.m34682e();
                m34682e[0] = 0;
                m34682e[1] = 1;
                m34682e[2] = (byte) ((i11 >> 8) & 255);
                m34682e[3] = (byte) (i11 & 255);
                m34682e[4] = (byte) ((i10 >> 24) & 255);
                m34682e[5] = (byte) ((i10 >> 16) & 255);
                m34682e[6] = (byte) ((i10 >> 8) & 255);
                m34682e[7] = (byte) (i10 & 255);
                this.f17538a.mo333d(this.f17540c, 8, 1);
                return i12 + 1 + 8;
            }
            C11146e0 c11146e03 = this.f17539b.f17623o;
            int m34670N = c11146e03.m34670N();
            c11146e03.m34678V(-2);
            int i13 = (m34670N * 6) + 2;
            if (i11 != 0) {
                this.f17540c.m34673Q(i13);
                byte[] m34682e2 = this.f17540c.m34682e();
                c11146e03.m34688l(m34682e2, 0, i13);
                int i14 = (((m34682e2[2] & 255) << 8) | (m34682e2[3] & 255)) + i11;
                m34682e2[2] = (byte) ((i14 >> 8) & 255);
                m34682e2[3] = (byte) (i14 & 255);
                c11146e03 = this.f17540c;
            }
            this.f17538a.mo333d(c11146e03, i13, 1);
            return i12 + 1 + i13;
        }

        /* renamed from: j */
        public void m22686j(C7482r c7482r, C7467c c7467c) {
            this.f17541d = c7482r;
            this.f17542e = c7467c;
            this.f17538a.mo332c(c7482r.f17627a.f17598f);
            m22687k();
        }

        /* renamed from: k */
        public void m22687k() {
            this.f17539b.m22755f();
            this.f17543f = 0;
            this.f17545h = 0;
            this.f17544g = 0;
            this.f17546i = 0;
            this.f17549l = false;
        }

        /* renamed from: l */
        public void m22688l(long j10) {
            int i10 = this.f17543f;
            while (true) {
                C7481q c7481q = this.f17539b;
                if (i10 >= c7481q.f17614f || c7481q.m22752c(i10) > j10) {
                    return;
                }
                if (this.f17539b.f17619k[i10]) {
                    this.f17546i = i10;
                }
                i10++;
            }
        }

        /* renamed from: m */
        public void m22689m() {
            C7480p m22683g = m22683g();
            if (m22683g == null) {
                return;
            }
            C11146e0 c11146e0 = this.f17539b.f17623o;
            int i10 = m22683g.f17607d;
            if (i10 != 0) {
                c11146e0.m34678V(i10);
            }
            if (this.f17539b.m22756g(this.f17543f)) {
                c11146e0.m34678V(c11146e0.m34670N() * 6);
            }
        }

        /* renamed from: n */
        public void m22690n(C12318m c12318m) {
            C7480p m22748a = this.f17541d.f17627a.m22748a(((C7467c) C11172r0.m34928j(this.f17539b.f17609a)).f17487a);
            this.f17538a.mo332c(this.f17541d.f17627a.f17598f.m34488c().m34534O(c12318m.m39839c(m22748a != null ? m22748a.f17605b : null)).m34526G());
        }
    }

    public C7471g() {
        this(0);
    }

    public C7471g(int i10) {
        this(i10, null);
    }

    public C7471g(int i10, C11164n0 c11164n0) {
        this(i10, c11164n0, null, Collections.emptyList());
    }

    public C7471g(int i10, C11164n0 c11164n0, C7479o c7479o) {
        this(i10, c11164n0, c7479o, Collections.emptyList());
    }

    public C7471g(int i10, C11164n0 c11164n0, C7479o c7479o, List<C11108u1> list) {
        this(i10, c11164n0, c7479o, list, null);
    }

    public C7471g(int i10, C11164n0 c11164n0, C7479o c7479o, List<C11108u1> list, InterfaceC12609b0 interfaceC12609b0) {
        this.f17509a = i10;
        this.f17518j = c11164n0;
        this.f17510b = c7479o;
        this.f17511c = Collections.unmodifiableList(list);
        this.f17523o = interfaceC12609b0;
        this.f17519k = new C9674c();
        this.f17520l = new C11146e0(16);
        this.f17513e = new C11146e0(C11179x.f29069a);
        this.f17514f = new C11146e0(5);
        this.f17515g = new C11146e0();
        byte[] bArr = new byte[16];
        this.f17516h = bArr;
        this.f17517i = new C11146e0(bArr);
        this.f17521m = new ArrayDeque<>();
        this.f17522n = new ArrayDeque<>();
        this.f17512d = new SparseArray<>();
        this.f17532x = -9223372036854775807L;
        this.f17531w = -9223372036854775807L;
        this.f17533y = -9223372036854775807L;
        this.f17505E = InterfaceC12623m.f34302o;
        this.f17506F = new InterfaceC12609b0[0];
        this.f17507G = new InterfaceC12609b0[0];
    }

    /* renamed from: A */
    private static void m22639A(C11146e0 c11146e0, C7481q c7481q) {
        m22675z(c11146e0, 0, c7481q);
    }

    /* renamed from: B */
    private static Pair<Long, C12610c> m22640B(C11146e0 c11146e0, long j10) {
        long m34669M;
        long m34669M2;
        c11146e0.m34677U(8);
        int m22592c = AbstractC7465a.m22592c(c11146e0.m34692q());
        c11146e0.m34678V(4);
        long m34666J = c11146e0.m34666J();
        if (m22592c == 0) {
            m34669M = c11146e0.m34666J();
            m34669M2 = c11146e0.m34666J();
        } else {
            m34669M = c11146e0.m34669M();
            m34669M2 = c11146e0.m34669M();
        }
        long j11 = m34669M;
        long j12 = j10 + m34669M2;
        long m34885O0 = C11172r0.m34885O0(j11, 1000000L, m34666J);
        c11146e0.m34678V(2);
        int m34670N = c11146e0.m34670N();
        int[] iArr = new int[m34670N];
        long[] jArr = new long[m34670N];
        long[] jArr2 = new long[m34670N];
        long[] jArr3 = new long[m34670N];
        long j13 = m34885O0;
        int i10 = 0;
        long j14 = j11;
        while (i10 < m34670N) {
            int m34692q = c11146e0.m34692q();
            if ((m34692q & Integer.MIN_VALUE) != 0) {
                throw C11005b3.m33715a("Unhandled indirect reference", null);
            }
            long m34666J2 = c11146e0.m34666J();
            iArr[i10] = m34692q & C5101a.e.API_PRIORITY_OTHER;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + m34666J2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = m34670N;
            long m34885O02 = C11172r0.m34885O0(j15, 1000000L, m34666J);
            jArr4[i10] = m34885O02 - jArr5[i10];
            c11146e0.m34678V(4);
            j12 += r1[i10];
            i10++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            m34670N = i11;
            j14 = j15;
            j13 = m34885O02;
        }
        return Pair.create(Long.valueOf(m34885O0), new C12610c(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: C */
    private static long m22641C(C11146e0 c11146e0) {
        c11146e0.m34677U(8);
        return AbstractC7465a.m22592c(c11146e0.m34692q()) == 1 ? c11146e0.m34669M() : c11146e0.m34666J();
    }

    /* renamed from: D */
    private static b m22642D(C11146e0 c11146e0, SparseArray<b> sparseArray, boolean z10) {
        c11146e0.m34677U(8);
        int m22591b = AbstractC7465a.m22591b(c11146e0.m34692q());
        b valueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(c11146e0.m34692q());
        if (valueAt == null) {
            return null;
        }
        if ((m22591b & 1) != 0) {
            long m34669M = c11146e0.m34669M();
            C7481q c7481q = valueAt.f17539b;
            c7481q.f17611c = m34669M;
            c7481q.f17612d = m34669M;
        }
        C7467c c7467c = valueAt.f17542e;
        valueAt.f17539b.f17609a = new C7467c((m22591b & 2) != 0 ? c11146e0.m34692q() - 1 : c7467c.f17487a, (m22591b & 8) != 0 ? c11146e0.m34692q() : c7467c.f17488b, (m22591b & 16) != 0 ? c11146e0.m34692q() : c7467c.f17489c, (m22591b & 32) != 0 ? c11146e0.m34692q() : c7467c.f17490d);
        return valueAt;
    }

    /* renamed from: E */
    private static void m22643E(AbstractC7465a.a aVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        b m22642D = m22642D(((AbstractC7465a.b) C11137a.m34603e(aVar.m22596g(1952868452))).f17457b, sparseArray, z10);
        if (m22642D == null) {
            return;
        }
        C7481q c7481q = m22642D.f17539b;
        long j10 = c7481q.f17625q;
        boolean z11 = c7481q.f17626r;
        m22642D.m22687k();
        m22642D.f17549l = true;
        AbstractC7465a.b m22596g = aVar.m22596g(1952867444);
        if (m22596g == null || (i10 & 2) != 0) {
            c7481q.f17625q = j10;
            c7481q.f17626r = z11;
        } else {
            c7481q.f17625q = m22641C(m22596g.f17457b);
            c7481q.f17626r = true;
        }
        m22646H(aVar, m22642D, i10);
        C7480p m22748a = m22642D.f17541d.f17627a.m22748a(((C7467c) C11137a.m34603e(c7481q.f17609a)).f17487a);
        AbstractC7465a.b m22596g2 = aVar.m22596g(1935763834);
        if (m22596g2 != null) {
            m22673x((C7480p) C11137a.m34603e(m22748a), m22596g2.f17457b, c7481q);
        }
        AbstractC7465a.b m22596g3 = aVar.m22596g(1935763823);
        if (m22596g3 != null) {
            m22672w(m22596g3.f17457b, c7481q);
        }
        AbstractC7465a.b m22596g4 = aVar.m22596g(1936027235);
        if (m22596g4 != null) {
            m22639A(m22596g4.f17457b, c7481q);
        }
        m22674y(aVar, m22748a != null ? m22748a.f17605b : null, c7481q);
        int size = aVar.f17455c.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC7465a.b bVar = aVar.f17455c.get(i11);
            if (bVar.f17453a == 1970628964) {
                m22647I(bVar.f17457b, c7481q, bArr);
            }
        }
    }

    /* renamed from: F */
    private static Pair<Integer, C7467c> m22644F(C11146e0 c11146e0) {
        c11146e0.m34677U(12);
        return Pair.create(Integer.valueOf(c11146e0.m34692q()), new C7467c(c11146e0.m34692q() - 1, c11146e0.m34692q(), c11146e0.m34692q(), c11146e0.m34692q()));
    }

    /* renamed from: G */
    private static int m22645G(b bVar, int i10, int i11, C11146e0 c11146e0, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        b bVar2 = bVar;
        c11146e0.m34677U(8);
        int m22591b = AbstractC7465a.m22591b(c11146e0.m34692q());
        C7479o c7479o = bVar2.f17541d.f17627a;
        C7481q c7481q = bVar2.f17539b;
        C7467c c7467c = (C7467c) C11172r0.m34928j(c7481q.f17609a);
        c7481q.f17616h[i10] = c11146e0.m34668L();
        long[] jArr = c7481q.f17615g;
        long j10 = c7481q.f17611c;
        jArr[i10] = j10;
        if ((m22591b & 1) != 0) {
            jArr[i10] = j10 + c11146e0.m34692q();
        }
        boolean z15 = (m22591b & 4) != 0;
        int i16 = c7467c.f17490d;
        if (z15) {
            i16 = c11146e0.m34692q();
        }
        boolean z16 = (m22591b & RecognitionOptions.QR_CODE) != 0;
        boolean z17 = (m22591b & RecognitionOptions.UPC_A) != 0;
        boolean z18 = (m22591b & RecognitionOptions.UPC_E) != 0;
        boolean z19 = (m22591b & RecognitionOptions.PDF417) != 0;
        long j11 = m22662l(c7479o) ? ((long[]) C11172r0.m34928j(c7479o.f17601i))[0] : 0L;
        int[] iArr = c7481q.f17617i;
        long[] jArr2 = c7481q.f17618j;
        boolean[] zArr = c7481q.f17619k;
        int i17 = i16;
        boolean z20 = c7479o.f17594b == 2 && (i11 & 1) != 0;
        int i18 = i12 + c7481q.f17616h[i10];
        boolean z21 = z20;
        long j12 = c7479o.f17595c;
        long j13 = c7481q.f17625q;
        int i19 = i12;
        while (i19 < i18) {
            int m22656d = m22656d(z16 ? c11146e0.m34692q() : c7467c.f17488b);
            if (z17) {
                i13 = c11146e0.m34692q();
                z10 = z16;
            } else {
                z10 = z16;
                i13 = c7467c.f17489c;
            }
            int m22656d2 = m22656d(i13);
            if (z18) {
                z11 = z15;
                i14 = c11146e0.m34692q();
            } else if (i19 == 0 && z15) {
                z11 = z15;
                i14 = i17;
            } else {
                z11 = z15;
                i14 = c7467c.f17490d;
            }
            if (z19) {
                z12 = z19;
                z13 = z17;
                z14 = z18;
                i15 = c11146e0.m34692q();
            } else {
                z12 = z19;
                z13 = z17;
                z14 = z18;
                i15 = 0;
            }
            long m34885O0 = C11172r0.m34885O0((i15 + j13) - j11, 1000000L, j12);
            jArr2[i19] = m34885O0;
            if (!c7481q.f17626r) {
                jArr2[i19] = m34885O0 + bVar2.f17541d.f17634h;
            }
            iArr[i19] = m22656d2;
            zArr[i19] = ((i14 >> 16) & 1) == 0 && (!z21 || i19 == 0);
            j13 += m22656d;
            i19++;
            bVar2 = bVar;
            z16 = z10;
            z15 = z11;
            z19 = z12;
            z17 = z13;
            z18 = z14;
        }
        c7481q.f17625q = j13;
        return i18;
    }

    /* renamed from: H */
    private static void m22646H(AbstractC7465a.a aVar, b bVar, int i10) {
        List<AbstractC7465a.b> list = aVar.f17455c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC7465a.b bVar2 = list.get(i13);
            if (bVar2.f17453a == 1953658222) {
                C11146e0 c11146e0 = bVar2.f17457b;
                c11146e0.m34677U(12);
                int m34668L = c11146e0.m34668L();
                if (m34668L > 0) {
                    i12 += m34668L;
                    i11++;
                }
            }
        }
        bVar.f17545h = 0;
        bVar.f17544g = 0;
        bVar.f17543f = 0;
        bVar.f17539b.m22754e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            AbstractC7465a.b bVar3 = list.get(i16);
            if (bVar3.f17453a == 1953658222) {
                i15 = m22645G(bVar, i14, i10, bVar3.f17457b, i15);
                i14++;
            }
        }
    }

    /* renamed from: I */
    private static void m22647I(C11146e0 c11146e0, C7481q c7481q, byte[] bArr) {
        c11146e0.m34677U(8);
        c11146e0.m34688l(bArr, 0, 16);
        if (Arrays.equals(bArr, f17499J)) {
            m22675z(c11146e0, 16, c7481q);
        }
    }

    /* renamed from: J */
    private void m22648J(long j10) {
        while (!this.f17521m.isEmpty() && this.f17521m.peek().f17454b == j10) {
            m22664o(this.f17521m.pop());
        }
        m22657g();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m22649K(p459y6.InterfaceC12622l r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p119g7.C7471g.m22649K(y6.l):boolean");
    }

    /* renamed from: L */
    private void m22650L(InterfaceC12622l interfaceC12622l) {
        int i10 = ((int) this.f17526r) - this.f17527s;
        C11146e0 c11146e0 = this.f17528t;
        if (c11146e0 != null) {
            interfaceC12622l.readFully(c11146e0.m34682e(), 8, i10);
            m22666q(new AbstractC7465a.b(this.f17525q, c11146e0), interfaceC12622l.getPosition());
        } else {
            interfaceC12622l.mo41538n(i10);
        }
        m22648J(interfaceC12622l.getPosition());
    }

    /* renamed from: M */
    private void m22651M(InterfaceC12622l interfaceC12622l) {
        int size = this.f17512d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            C7481q c7481q = this.f17512d.valueAt(i10).f17539b;
            if (c7481q.f17624p) {
                long j11 = c7481q.f17612d;
                if (j11 < j10) {
                    bVar = this.f17512d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f17524p = 3;
            return;
        }
        int position = (int) (j10 - interfaceC12622l.getPosition());
        if (position < 0) {
            throw C11005b3.m33715a("Offset to encryption data was negative.", null);
        }
        interfaceC12622l.mo41538n(position);
        bVar.f17539b.m22751b(interfaceC12622l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private boolean m22652N(InterfaceC12622l interfaceC12622l) {
        int m41512f;
        int m22685i;
        b bVar = this.f17534z;
        Throwable th2 = null;
        if (bVar == null) {
            bVar = m22660j(this.f17512d);
            if (bVar == null) {
                int position = (int) (this.f17529u - interfaceC12622l.getPosition());
                if (position < 0) {
                    throw C11005b3.m33715a("Offset to end of mdat was negative.", null);
                }
                interfaceC12622l.mo41538n(position);
                m22657g();
                return false;
            }
            int m22680d = (int) (bVar.m22680d() - interfaceC12622l.getPosition());
            if (m22680d < 0) {
                C11173s.m34970i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                m22680d = 0;
            }
            interfaceC12622l.mo41538n(m22680d);
            this.f17534z = bVar;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f17524p == 3) {
            int m22682f = bVar.m22682f();
            this.f17501A = m22682f;
            if (bVar.f17543f < bVar.f17546i) {
                interfaceC12622l.mo41538n(m22682f);
                bVar.m22689m();
                if (!bVar.m22684h()) {
                    this.f17534z = null;
                }
                this.f17524p = 3;
                return true;
            }
            if (bVar.f17541d.f17627a.f17599g == 1) {
                this.f17501A = m22682f - 8;
                interfaceC12622l.mo41538n(8);
            }
            if ("audio/ac4".equals(bVar.f17541d.f17627a.f17598f.f28797w)) {
                this.f17502B = bVar.m22685i(this.f17501A, 7);
                C11635c.m36480a(this.f17501A, this.f17517i);
                bVar.f17538a.m41511a(this.f17517i, 7);
                m22685i = this.f17502B + 7;
            } else {
                m22685i = bVar.m22685i(this.f17501A, 0);
            }
            this.f17502B = m22685i;
            this.f17501A += this.f17502B;
            this.f17524p = 4;
            this.f17503C = 0;
        }
        C7479o c7479o = bVar.f17541d.f17627a;
        InterfaceC12609b0 interfaceC12609b0 = bVar.f17538a;
        long m22681e = bVar.m22681e();
        C11164n0 c11164n0 = this.f17518j;
        if (c11164n0 != null) {
            m22681e = c11164n0.m34824a(m22681e);
        }
        long j10 = m22681e;
        if (c7479o.f17602j == 0) {
            while (true) {
                int i12 = this.f17502B;
                int i13 = this.f17501A;
                if (i12 >= i13) {
                    break;
                }
                this.f17502B += interfaceC12609b0.m41512f(interfaceC12622l, i13 - i12, false);
            }
        } else {
            byte[] m34682e = this.f17514f.m34682e();
            m34682e[0] = 0;
            m34682e[1] = 0;
            m34682e[2] = 0;
            int i14 = c7479o.f17602j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.f17502B < this.f17501A) {
                int i17 = this.f17503C;
                if (i17 == 0) {
                    interfaceC12622l.readFully(m34682e, i16, i15);
                    this.f17514f.m34677U(0);
                    int m34692q = this.f17514f.m34692q();
                    if (m34692q < i11) {
                        throw C11005b3.m33715a("Invalid NAL length", th2);
                    }
                    this.f17503C = m34692q - 1;
                    this.f17513e.m34677U(0);
                    interfaceC12609b0.m41511a(this.f17513e, i10);
                    interfaceC12609b0.m41511a(this.f17514f, i11);
                    this.f17504D = (this.f17507G.length <= 0 || !C11179x.m35020g(c7479o.f17598f.f28797w, m34682e[i10])) ? 0 : i11;
                    this.f17502B += 5;
                    this.f17501A += i16;
                } else {
                    if (this.f17504D) {
                        this.f17515g.m34673Q(i17);
                        interfaceC12622l.readFully(this.f17515g.m34682e(), 0, this.f17503C);
                        interfaceC12609b0.m41511a(this.f17515g, this.f17503C);
                        m41512f = this.f17503C;
                        int m35030q = C11179x.m35030q(this.f17515g.m34682e(), this.f17515g.m34684g());
                        this.f17515g.m34677U("video/hevc".equals(c7479o.f17598f.f28797w) ? 1 : 0);
                        this.f17515g.m34676T(m35030q);
                        C12608b.m41508a(j10, this.f17515g, this.f17507G);
                    } else {
                        m41512f = interfaceC12609b0.m41512f(interfaceC12622l, i17, false);
                    }
                    this.f17502B += m41512f;
                    this.f17503C -= m41512f;
                    th2 = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int m22679c = bVar.m22679c();
        C7480p m22683g = bVar.m22683g();
        interfaceC12609b0.mo331b(j10, m22679c, this.f17501A, 0, m22683g != null ? m22683g.f17606c : null);
        m22669t(j10);
        if (!bVar.m22684h()) {
            this.f17534z = null;
        }
        this.f17524p = 3;
        return true;
    }

    /* renamed from: O */
    private static boolean m22653O(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    /* renamed from: P */
    private static boolean m22654P(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    /* renamed from: d */
    private static int m22656d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw C11005b3.m33715a("Unexpected negative value: " + i10, null);
    }

    /* renamed from: g */
    private void m22657g() {
        this.f17524p = 0;
        this.f17527s = 0;
    }

    /* renamed from: h */
    private C7467c m22658h(SparseArray<C7467c> sparseArray, int i10) {
        return (C7467c) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : C11137a.m34603e(sparseArray.get(i10)));
    }

    /* renamed from: i */
    private static C12318m m22659i(List<AbstractC7465a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC7465a.b bVar = list.get(i10);
            if (bVar.f17453a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] m34682e = bVar.f17457b.m34682e();
                UUID m22732f = C7476l.m22732f(m34682e);
                if (m22732f == null) {
                    C11173s.m34970i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C12318m.b(m22732f, "video/mp4", m34682e));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C12318m(arrayList);
    }

    /* renamed from: j */
    private static b m22660j(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f17549l || valueAt.f17543f != valueAt.f17541d.f17628b) && (!valueAt.f17549l || valueAt.f17545h != valueAt.f17539b.f17613e)) {
                long m22680d = valueAt.m22680d();
                if (m22680d < j10) {
                    bVar = valueAt;
                    j10 = m22680d;
                }
            }
        }
        return bVar;
    }

    /* renamed from: k */
    private void m22661k() {
        int i10;
        InterfaceC12609b0[] interfaceC12609b0Arr = new InterfaceC12609b0[2];
        this.f17506F = interfaceC12609b0Arr;
        InterfaceC12609b0 interfaceC12609b0 = this.f17523o;
        int i11 = 0;
        if (interfaceC12609b0 != null) {
            interfaceC12609b0Arr[0] = interfaceC12609b0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f17509a & 4) != 0) {
            interfaceC12609b0Arr[i10] = this.f17505E.mo308d(100, 5);
            i12 = 101;
            i10++;
        }
        InterfaceC12609b0[] interfaceC12609b0Arr2 = (InterfaceC12609b0[]) C11172r0.m34871H0(this.f17506F, i10);
        this.f17506F = interfaceC12609b0Arr2;
        for (InterfaceC12609b0 interfaceC12609b02 : interfaceC12609b0Arr2) {
            interfaceC12609b02.mo332c(f17500K);
        }
        this.f17507G = new InterfaceC12609b0[this.f17511c.size()];
        while (i11 < this.f17507G.length) {
            InterfaceC12609b0 mo308d = this.f17505E.mo308d(i12, 3);
            mo308d.mo332c(this.f17511c.get(i11));
            this.f17507G[i11] = mo308d;
            i11++;
            i12++;
        }
    }

    /* renamed from: l */
    private static boolean m22662l(C7479o c7479o) {
        long[] jArr;
        long[] jArr2 = c7479o.f17600h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = c7479o.f17601i) == null) {
            return false;
        }
        long j10 = jArr2[0];
        return j10 == 0 || C11172r0.m34885O0(j10 + jArr[0], 1000000L, c7479o.f17596d) >= c7479o.f17597e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ InterfaceC12621k[] m22663m() {
        return new InterfaceC12621k[]{new C7471g()};
    }

    /* renamed from: o */
    private void m22664o(AbstractC7465a.a aVar) {
        int i10 = aVar.f17453a;
        if (i10 == 1836019574) {
            m22668s(aVar);
        } else if (i10 == 1836019558) {
            m22667r(aVar);
        } else {
            if (this.f17521m.isEmpty()) {
                return;
            }
            this.f17521m.peek().m22593d(aVar);
        }
    }

    /* renamed from: p */
    private void m22665p(C11146e0 c11146e0) {
        long m34885O0;
        String str;
        long m34885O02;
        String str2;
        long m34666J;
        long j10;
        if (this.f17506F.length == 0) {
            return;
        }
        c11146e0.m34677U(8);
        int m22592c = AbstractC7465a.m22592c(c11146e0.m34692q());
        if (m22592c == 0) {
            String str3 = (String) C11137a.m34603e(c11146e0.m34658B());
            String str4 = (String) C11137a.m34603e(c11146e0.m34658B());
            long m34666J2 = c11146e0.m34666J();
            m34885O0 = C11172r0.m34885O0(c11146e0.m34666J(), 1000000L, m34666J2);
            long j11 = this.f17533y;
            long j12 = j11 != -9223372036854775807L ? j11 + m34885O0 : -9223372036854775807L;
            str = str3;
            m34885O02 = C11172r0.m34885O0(c11146e0.m34666J(), 1000L, m34666J2);
            str2 = str4;
            m34666J = c11146e0.m34666J();
            j10 = j12;
        } else {
            if (m22592c != 1) {
                C11173s.m34970i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + m22592c);
                return;
            }
            long m34666J3 = c11146e0.m34666J();
            j10 = C11172r0.m34885O0(c11146e0.m34669M(), 1000000L, m34666J3);
            long m34885O03 = C11172r0.m34885O0(c11146e0.m34666J(), 1000L, m34666J3);
            long m34666J4 = c11146e0.m34666J();
            str = (String) C11137a.m34603e(c11146e0.m34658B());
            m34885O02 = m34885O03;
            m34666J = m34666J4;
            str2 = (String) C11137a.m34603e(c11146e0.m34658B());
            m34885O0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[c11146e0.m34679a()];
        c11146e0.m34688l(bArr, 0, c11146e0.m34679a());
        C11146e0 c11146e02 = new C11146e0(this.f17519k.m28985a(new C9672a(str, str2, m34885O02, m34666J, bArr)));
        int m34679a = c11146e02.m34679a();
        for (InterfaceC12609b0 interfaceC12609b0 : this.f17506F) {
            c11146e02.m34677U(0);
            interfaceC12609b0.m41511a(c11146e02, m34679a);
        }
        if (j10 == -9223372036854775807L) {
            this.f17522n.addLast(new a(m34885O0, true, m34679a));
        } else {
            if (this.f17522n.isEmpty()) {
                C11164n0 c11164n0 = this.f17518j;
                if (c11164n0 != null) {
                    j10 = c11164n0.m34824a(j10);
                }
                for (InterfaceC12609b0 interfaceC12609b02 : this.f17506F) {
                    interfaceC12609b02.mo331b(j10, 1, m34679a, 0, null);
                }
                return;
            }
            this.f17522n.addLast(new a(j10, false, m34679a));
        }
        this.f17530v += m34679a;
    }

    /* renamed from: q */
    private void m22666q(AbstractC7465a.b bVar, long j10) {
        if (!this.f17521m.isEmpty()) {
            this.f17521m.peek().m22594e(bVar);
            return;
        }
        int i10 = bVar.f17453a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                m22665p(bVar.f17457b);
            }
        } else {
            Pair<Long, C12610c> m22640B = m22640B(bVar.f17457b, j10);
            this.f17533y = ((Long) m22640B.first).longValue();
            this.f17505E.mo323p((InterfaceC12636z) m22640B.second);
            this.f17508H = true;
        }
    }

    /* renamed from: r */
    private void m22667r(AbstractC7465a.a aVar) {
        m22671v(aVar, this.f17512d, this.f17510b != null, this.f17509a, this.f17516h);
        C12318m m22659i = m22659i(aVar.f17455c);
        if (m22659i != null) {
            int size = this.f17512d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f17512d.valueAt(i10).m22690n(m22659i);
            }
        }
        if (this.f17531w != -9223372036854775807L) {
            int size2 = this.f17512d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f17512d.valueAt(i11).m22688l(this.f17531w);
            }
            this.f17531w = -9223372036854775807L;
        }
    }

    /* renamed from: s */
    private void m22668s(AbstractC7465a.a aVar) {
        int i10 = 0;
        C11137a.m34606h(this.f17510b == null, "Unexpected moov box.");
        C12318m m22659i = m22659i(aVar.f17455c);
        AbstractC7465a.a aVar2 = (AbstractC7465a.a) C11137a.m34603e(aVar.m22595f(1836475768));
        SparseArray<C7467c> sparseArray = new SparseArray<>();
        int size = aVar2.f17455c.size();
        long j10 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC7465a.b bVar = aVar2.f17455c.get(i11);
            int i12 = bVar.f17453a;
            if (i12 == 1953654136) {
                Pair<Integer, C7467c> m22644F = m22644F(bVar.f17457b);
                sparseArray.put(((Integer) m22644F.first).intValue(), (C7467c) m22644F.second);
            } else if (i12 == 1835362404) {
                j10 = m22670u(bVar.f17457b);
            }
        }
        List<C7482r> m22597A = C7466b.m22597A(aVar, new C12632v(), j10, m22659i, (this.f17509a & 16) != 0, false, new InterfaceC7151g() { // from class: g7.e
            @Override // p082eb.InterfaceC7151g
            public final Object apply(Object obj) {
                return C7471g.this.m22676n((C7479o) obj);
            }
        });
        int size2 = m22597A.size();
        if (this.f17512d.size() != 0) {
            C11137a.m34605g(this.f17512d.size() == size2);
            while (i10 < size2) {
                C7482r c7482r = m22597A.get(i10);
                C7479o c7479o = c7482r.f17627a;
                this.f17512d.get(c7479o.f17593a).m22686j(c7482r, m22658h(sparseArray, c7479o.f17593a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            C7482r c7482r2 = m22597A.get(i10);
            C7479o c7479o2 = c7482r2.f17627a;
            this.f17512d.put(c7479o2.f17593a, new b(this.f17505E.mo308d(i10, c7479o2.f17594b), c7482r2, m22658h(sparseArray, c7479o2.f17593a)));
            this.f17532x = Math.max(this.f17532x, c7479o2.f17597e);
            i10++;
        }
        this.f17505E.mo324q();
    }

    /* renamed from: t */
    private void m22669t(long j10) {
        while (!this.f17522n.isEmpty()) {
            a removeFirst = this.f17522n.removeFirst();
            this.f17530v -= removeFirst.f17537c;
            long j11 = removeFirst.f17535a;
            if (removeFirst.f17536b) {
                j11 += j10;
            }
            C11164n0 c11164n0 = this.f17518j;
            if (c11164n0 != null) {
                j11 = c11164n0.m34824a(j11);
            }
            for (InterfaceC12609b0 interfaceC12609b0 : this.f17506F) {
                interfaceC12609b0.mo331b(j11, 1, removeFirst.f17537c, this.f17530v, null);
            }
        }
    }

    /* renamed from: u */
    private static long m22670u(C11146e0 c11146e0) {
        c11146e0.m34677U(8);
        return AbstractC7465a.m22592c(c11146e0.m34692q()) == 0 ? c11146e0.m34666J() : c11146e0.m34669M();
    }

    /* renamed from: v */
    private static void m22671v(AbstractC7465a.a aVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = aVar.f17456d.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC7465a.a aVar2 = aVar.f17456d.get(i11);
            if (aVar2.f17453a == 1953653094) {
                m22643E(aVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    /* renamed from: w */
    private static void m22672w(C11146e0 c11146e0, C7481q c7481q) {
        c11146e0.m34677U(8);
        int m34692q = c11146e0.m34692q();
        if ((AbstractC7465a.m22591b(m34692q) & 1) == 1) {
            c11146e0.m34678V(8);
        }
        int m34668L = c11146e0.m34668L();
        if (m34668L == 1) {
            c7481q.f17612d += AbstractC7465a.m22592c(m34692q) == 0 ? c11146e0.m34666J() : c11146e0.m34669M();
        } else {
            throw C11005b3.m33715a("Unexpected saio entry count: " + m34668L, null);
        }
    }

    /* renamed from: x */
    private static void m22673x(C7480p c7480p, C11146e0 c11146e0, C7481q c7481q) {
        int i10;
        int i11 = c7480p.f17607d;
        c11146e0.m34677U(8);
        if ((AbstractC7465a.m22591b(c11146e0.m34692q()) & 1) == 1) {
            c11146e0.m34678V(8);
        }
        int m34664H = c11146e0.m34664H();
        int m34668L = c11146e0.m34668L();
        if (m34668L > c7481q.f17614f) {
            throw C11005b3.m33715a("Saiz sample count " + m34668L + " is greater than fragment sample count" + c7481q.f17614f, null);
        }
        if (m34664H == 0) {
            boolean[] zArr = c7481q.f17621m;
            i10 = 0;
            for (int i12 = 0; i12 < m34668L; i12++) {
                int m34664H2 = c11146e0.m34664H();
                i10 += m34664H2;
                zArr[i12] = m34664H2 > i11;
            }
        } else {
            i10 = (m34664H * m34668L) + 0;
            Arrays.fill(c7481q.f17621m, 0, m34668L, m34664H > i11);
        }
        Arrays.fill(c7481q.f17621m, m34668L, c7481q.f17614f, false);
        if (i10 > 0) {
            c7481q.m22753d(i10);
        }
    }

    /* renamed from: y */
    private static void m22674y(AbstractC7465a.a aVar, String str, C7481q c7481q) {
        byte[] bArr = null;
        C11146e0 c11146e0 = null;
        C11146e0 c11146e02 = null;
        for (int i10 = 0; i10 < aVar.f17455c.size(); i10++) {
            AbstractC7465a.b bVar = aVar.f17455c.get(i10);
            C11146e0 c11146e03 = bVar.f17457b;
            int i11 = bVar.f17453a;
            if (i11 == 1935828848) {
                c11146e03.m34677U(12);
                if (c11146e03.m34692q() == 1936025959) {
                    c11146e0 = c11146e03;
                }
            } else if (i11 == 1936158820) {
                c11146e03.m34677U(12);
                if (c11146e03.m34692q() == 1936025959) {
                    c11146e02 = c11146e03;
                }
            }
        }
        if (c11146e0 == null || c11146e02 == null) {
            return;
        }
        c11146e0.m34677U(8);
        int m22592c = AbstractC7465a.m22592c(c11146e0.m34692q());
        c11146e0.m34678V(4);
        if (m22592c == 1) {
            c11146e0.m34678V(4);
        }
        if (c11146e0.m34692q() != 1) {
            throw C11005b3.m33719e("Entry count in sbgp != 1 (unsupported).");
        }
        c11146e02.m34677U(8);
        int m22592c2 = AbstractC7465a.m22592c(c11146e02.m34692q());
        c11146e02.m34678V(4);
        if (m22592c2 == 1) {
            if (c11146e02.m34666J() == 0) {
                throw C11005b3.m33719e("Variable length description in sgpd found (unsupported)");
            }
        } else if (m22592c2 >= 2) {
            c11146e02.m34678V(4);
        }
        if (c11146e02.m34666J() != 1) {
            throw C11005b3.m33719e("Entry count in sgpd != 1 (unsupported).");
        }
        c11146e02.m34678V(1);
        int m34664H = c11146e02.m34664H();
        int i12 = (m34664H & 240) >> 4;
        int i13 = m34664H & 15;
        boolean z10 = c11146e02.m34664H() == 1;
        if (z10) {
            int m34664H2 = c11146e02.m34664H();
            byte[] bArr2 = new byte[16];
            c11146e02.m34688l(bArr2, 0, 16);
            if (m34664H2 == 0) {
                int m34664H3 = c11146e02.m34664H();
                bArr = new byte[m34664H3];
                c11146e02.m34688l(bArr, 0, m34664H3);
            }
            c7481q.f17620l = true;
            c7481q.f17622n = new C7480p(z10, str, m34664H2, bArr2, i12, i13, bArr);
        }
    }

    /* renamed from: z */
    private static void m22675z(C11146e0 c11146e0, int i10, C7481q c7481q) {
        c11146e0.m34677U(i10 + 8);
        int m22591b = AbstractC7465a.m22591b(c11146e0.m34692q());
        if ((m22591b & 1) != 0) {
            throw C11005b3.m33719e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (m22591b & 2) != 0;
        int m34668L = c11146e0.m34668L();
        if (m34668L == 0) {
            Arrays.fill(c7481q.f17621m, 0, c7481q.f17614f, false);
            return;
        }
        if (m34668L == c7481q.f17614f) {
            Arrays.fill(c7481q.f17621m, 0, m34668L, z10);
            c7481q.m22753d(c11146e0.m34679a());
            c7481q.m22750a(c11146e0);
        } else {
            throw C11005b3.m33715a("Senc sample count " + m34668L + " is different from fragment sample count" + c7481q.f17614f, null);
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        int size = this.f17512d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17512d.valueAt(i10).m22687k();
        }
        this.f17522n.clear();
        this.f17530v = 0;
        this.f17531w = j11;
        this.f17521m.clear();
        m22657g();
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f17505E = interfaceC12623m;
        m22657g();
        m22661k();
        C7479o c7479o = this.f17510b;
        if (c7479o != null) {
            this.f17512d.put(0, new b(interfaceC12623m.mo308d(0, c7479o.f17594b), new C7482r(this.f17510b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C7467c(0, 0, 0, 0)));
            this.f17505E.mo324q();
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        return C7478n.m22745b(interfaceC12622l);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        while (true) {
            int i10 = this.f17524p;
            if (i10 != 0) {
                if (i10 == 1) {
                    m22650L(interfaceC12622l);
                } else if (i10 == 2) {
                    m22651M(interfaceC12622l);
                } else if (m22652N(interfaceC12622l)) {
                    return 0;
                }
            } else if (!m22649K(interfaceC12622l)) {
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public C7479o m22676n(C7479o c7479o) {
        return c7479o;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
