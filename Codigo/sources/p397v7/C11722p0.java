package p397v7;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p216l7.C9400a;
import p290p7.C10109b;
import p307q8.InterfaceC10312r;
import p351s8.C10818e0;
import p351s8.C10832l0;
import p351s8.C10833m;
import p351s8.C10835n;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10823h;
import p351s8.InterfaceC10827j;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p361t6.C11113v1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11149g;
import p363t8.C11172r0;
import p363t8.C11178w;
import p397v7.C11729t;
import p397v7.C11732u0;
import p397v7.InterfaceC11705h0;
import p397v7.InterfaceC11739y;
import p414w6.C12082g;
import p436x6.InterfaceC12329u;
import p436x6.InterfaceC12330v;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12636z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v7.p0 */
/* loaded from: classes.dex */
public final class C11722p0 implements InterfaceC11739y, InterfaceC12623m, C10818e0.b<a>, C10818e0.f, C11732u0.d {

    /* renamed from: X */
    private static final Map<String, String> f30765X = m36930K();

    /* renamed from: Y */
    private static final C11108u1 f30766Y = new C11108u1.b().m34540U("icy").m34552g0("application/x-icy").m34526G();

    /* renamed from: B */
    private InterfaceC11739y.a f30768B;

    /* renamed from: C */
    private C10109b f30769C;

    /* renamed from: F */
    private boolean f30772F;

    /* renamed from: G */
    private boolean f30773G;

    /* renamed from: H */
    private boolean f30774H;

    /* renamed from: I */
    private e f30775I;

    /* renamed from: J */
    private InterfaceC12636z f30776J;

    /* renamed from: L */
    private boolean f30778L;

    /* renamed from: N */
    private boolean f30780N;

    /* renamed from: O */
    private boolean f30781O;

    /* renamed from: P */
    private int f30782P;

    /* renamed from: Q */
    private boolean f30783Q;

    /* renamed from: R */
    private long f30784R;

    /* renamed from: T */
    private boolean f30786T;

    /* renamed from: U */
    private int f30787U;

    /* renamed from: V */
    private boolean f30788V;

    /* renamed from: W */
    private boolean f30789W;

    /* renamed from: a */
    private final Uri f30790a;

    /* renamed from: b */
    private final InterfaceC10827j f30791b;

    /* renamed from: c */
    private final InterfaceC12330v f30792c;

    /* renamed from: d */
    private final InterfaceC10816d0 f30793d;

    /* renamed from: e */
    private final InterfaceC11705h0.a f30794e;

    /* renamed from: f */
    private final InterfaceC12329u.a f30795f;

    /* renamed from: r */
    private final b f30796r;

    /* renamed from: s */
    private final InterfaceC10811b f30797s;

    /* renamed from: t */
    private final String f30798t;

    /* renamed from: u */
    private final long f30799u;

    /* renamed from: w */
    private final InterfaceC11712k0 f30801w;

    /* renamed from: v */
    private final C10818e0 f30800v = new C10818e0("ProgressiveMediaPeriod");

    /* renamed from: x */
    private final C11149g f30802x = new C11149g();

    /* renamed from: y */
    private final Runnable f30803y = new Runnable() { // from class: v7.l0
        @Override // java.lang.Runnable
        public final void run() {
            C11722p0.this.m36937T();
        }
    };

    /* renamed from: z */
    private final Runnable f30804z = new Runnable() { // from class: v7.m0
        @Override // java.lang.Runnable
        public final void run() {
            C11722p0.this.m36934Q();
        }
    };

    /* renamed from: A */
    private final Handler f30767A = C11172r0.m34954w();

    /* renamed from: E */
    private d[] f30771E = new d[0];

    /* renamed from: D */
    private C11732u0[] f30770D = new C11732u0[0];

    /* renamed from: S */
    private long f30785S = -9223372036854775807L;

    /* renamed from: K */
    private long f30777K = -9223372036854775807L;

    /* renamed from: M */
    private int f30779M = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v7.p0$a */
    /* loaded from: classes.dex */
    public final class a implements C10818e0.e, C11729t.a {

        /* renamed from: b */
        private final Uri f30806b;

        /* renamed from: c */
        private final C10832l0 f30807c;

        /* renamed from: d */
        private final InterfaceC11712k0 f30808d;

        /* renamed from: e */
        private final InterfaceC12623m f30809e;

        /* renamed from: f */
        private final C11149g f30810f;

        /* renamed from: h */
        private volatile boolean f30812h;

        /* renamed from: j */
        private long f30814j;

        /* renamed from: l */
        private InterfaceC12609b0 f30816l;

        /* renamed from: m */
        private boolean f30817m;

        /* renamed from: g */
        private final C12635y f30811g = new C12635y();

        /* renamed from: i */
        private boolean f30813i = true;

        /* renamed from: a */
        private final long f30805a = C11731u.m37025a();

        /* renamed from: k */
        private C10835n f30815k = m36967i(0);

        public a(Uri uri, InterfaceC10827j interfaceC10827j, InterfaceC11712k0 interfaceC11712k0, InterfaceC12623m interfaceC12623m, C11149g c11149g) {
            this.f30806b = uri;
            this.f30807c = new C10832l0(interfaceC10827j);
            this.f30808d = interfaceC11712k0;
            this.f30809e = interfaceC12623m;
            this.f30810f = c11149g;
        }

        /* renamed from: i */
        private C10835n m36967i(long j10) {
            return new C10835n.b().m33038i(this.f30806b).m33037h(j10).m33035f(C11722p0.this.f30798t).m33031b(6).m33034e(C11722p0.f30765X).m33030a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m36968j(long j10, long j11) {
            this.f30811g.f34331a = j10;
            this.f30814j = j11;
            this.f30813i = true;
            this.f30817m = false;
        }

        @Override // p397v7.C11729t.a
        /* renamed from: a */
        public void mo36969a(C11146e0 c11146e0) {
            long max = !this.f30817m ? this.f30814j : Math.max(C11722p0.this.m36932M(true), this.f30814j);
            int m34679a = c11146e0.m34679a();
            InterfaceC12609b0 interfaceC12609b0 = (InterfaceC12609b0) C11137a.m34603e(this.f30816l);
            interfaceC12609b0.m41511a(c11146e0, m34679a);
            interfaceC12609b0.mo331b(max, 1, m34679a, 0, null);
            this.f30817m = true;
        }

        @Override // p351s8.C10818e0.e
        /* renamed from: b */
        public void mo223b() {
            int i10 = 0;
            while (i10 == 0 && !this.f30812h) {
                try {
                    long j10 = this.f30811g.f34331a;
                    C10835n m36967i = m36967i(j10);
                    this.f30815k = m36967i;
                    long mo162o = this.f30807c.mo162o(m36967i);
                    if (mo162o != -1) {
                        mo162o += j10;
                        C11722p0.this.m36940Y();
                    }
                    long j11 = mo162o;
                    C11722p0.this.f30769C = C10109b.m30148a(this.f30807c.mo159e());
                    InterfaceC10823h interfaceC10823h = this.f30807c;
                    if (C11722p0.this.f30769C != null && C11722p0.this.f30769C.f24799f != -1) {
                        interfaceC10823h = new C11729t(this.f30807c, C11722p0.this.f30769C.f24799f, this);
                        InterfaceC12609b0 m36952N = C11722p0.this.m36952N();
                        this.f30816l = m36952N;
                        m36952N.mo332c(C11722p0.f30766Y);
                    }
                    long j12 = j10;
                    this.f30808d.mo36834e(interfaceC10823h, this.f30806b, this.f30807c.mo159e(), j10, j11, this.f30809e);
                    if (C11722p0.this.f30769C != null) {
                        this.f30808d.mo36831b();
                    }
                    if (this.f30813i) {
                        this.f30808d.mo36830a(j12, this.f30814j);
                        this.f30813i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f30812h) {
                            try {
                                this.f30810f.m34717a();
                                i10 = this.f30808d.mo36832c(this.f30811g);
                                j12 = this.f30808d.mo36833d();
                                if (j12 > C11722p0.this.f30799u + j13) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f30810f.m34719c();
                        C11722p0.this.f30767A.post(C11722p0.this.f30804z);
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f30808d.mo36833d() != -1) {
                        this.f30811g.f34331a = this.f30808d.mo36833d();
                    }
                    C10833m.m33019a(this.f30807c);
                } catch (Throwable th2) {
                    if (i10 != 1 && this.f30808d.mo36833d() != -1) {
                        this.f30811g.f34331a = this.f30808d.mo36833d();
                    }
                    C10833m.m33019a(this.f30807c);
                    throw th2;
                }
            }
        }

        @Override // p351s8.C10818e0.e
        /* renamed from: c */
        public void mo224c() {
            this.f30812h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v7.p0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: k */
        void mo36970k(long j10, boolean z10, boolean z11);
    }

    /* renamed from: v7.p0$c */
    /* loaded from: classes.dex */
    private final class c implements InterfaceC11734v0 {

        /* renamed from: a */
        private final int f30819a;

        public c(int i10) {
            this.f30819a = i10;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: a */
        public void mo262a() {
            C11722p0.this.m36955X(this.f30819a);
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: d */
        public boolean mo264d() {
            return C11722p0.this.m36953P(this.f30819a);
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: p */
        public int mo266p(long j10) {
            return C11722p0.this.m36961h0(this.f30819a, j10);
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: q */
        public int mo267q(C11113v1 c11113v1, C12082g c12082g, int i10) {
            return C11722p0.this.m36959d0(this.f30819a, c11113v1, c12082g, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v7.p0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final int f30821a;

        /* renamed from: b */
        public final boolean f30822b;

        public d(int i10, boolean z10) {
            this.f30821a = i10;
            this.f30822b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f30821a == dVar.f30821a && this.f30822b == dVar.f30822b;
        }

        public int hashCode() {
            return (this.f30821a * 31) + (this.f30822b ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v7.p0$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final C11700f1 f30823a;

        /* renamed from: b */
        public final boolean[] f30824b;

        /* renamed from: c */
        public final boolean[] f30825c;

        /* renamed from: d */
        public final boolean[] f30826d;

        public e(C11700f1 c11700f1, boolean[] zArr) {
            this.f30823a = c11700f1;
            this.f30824b = zArr;
            int i10 = c11700f1.f30692a;
            this.f30825c = new boolean[i10];
            this.f30826d = new boolean[i10];
        }
    }

    public C11722p0(Uri uri, InterfaceC10827j interfaceC10827j, InterfaceC11712k0 interfaceC11712k0, InterfaceC12330v interfaceC12330v, InterfaceC12329u.a aVar, InterfaceC10816d0 interfaceC10816d0, InterfaceC11705h0.a aVar2, b bVar, InterfaceC10811b interfaceC10811b, String str, int i10) {
        this.f30790a = uri;
        this.f30791b = interfaceC10827j;
        this.f30792c = interfaceC12330v;
        this.f30795f = aVar;
        this.f30793d = interfaceC10816d0;
        this.f30794e = aVar2;
        this.f30796r = bVar;
        this.f30797s = interfaceC10811b;
        this.f30798t = str;
        this.f30799u = i10;
        this.f30801w = interfaceC11712k0;
    }

    /* renamed from: I */
    private void m36928I() {
        C11137a.m34605g(this.f30773G);
        C11137a.m34603e(this.f30775I);
        C11137a.m34603e(this.f30776J);
    }

    /* renamed from: J */
    private boolean m36929J(a aVar, int i10) {
        InterfaceC12636z interfaceC12636z;
        if (this.f30783Q || !((interfaceC12636z = this.f30776J) == null || interfaceC12636z.mo127i() == -9223372036854775807L)) {
            this.f30787U = i10;
            return true;
        }
        if (this.f30773G && !m36945j0()) {
            this.f30786T = true;
            return false;
        }
        this.f30781O = this.f30773G;
        this.f30784R = 0L;
        this.f30787U = 0;
        for (C11732u0 c11732u0 : this.f30770D) {
            c11732u0.m37060V();
        }
        aVar.m36968j(0L, 0L);
        return true;
    }

    /* renamed from: K */
    private static Map<String, String> m36930K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: L */
    private int m36931L() {
        int i10 = 0;
        for (C11732u0 c11732u0 : this.f30770D) {
            i10 += c11732u0.m37051G();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public long m36932M(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f30770D.length; i10++) {
            if (z10 || ((e) C11137a.m34603e(this.f30775I)).f30825c[i10]) {
                j10 = Math.max(j10, this.f30770D[i10].m37077z());
            }
        }
        return j10;
    }

    /* renamed from: O */
    private boolean m36933O() {
        return this.f30785S != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m36934Q() {
        if (this.f30789W) {
            return;
        }
        ((InterfaceC11739y.a) C11137a.m34603e(this.f30768B)).mo258a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m36935R() {
        this.f30783Q = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m36937T() {
        if (this.f30789W || this.f30773G || !this.f30772F || this.f30776J == null) {
            return;
        }
        for (C11732u0 c11732u0 : this.f30770D) {
            if (c11732u0.m37050F() == null) {
                return;
            }
        }
        this.f30802x.m34719c();
        int length = this.f30770D.length;
        C11694d1[] c11694d1Arr = new C11694d1[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            C11108u1 c11108u1 = (C11108u1) C11137a.m34603e(this.f30770D[i10].m37050F());
            String str = c11108u1.f28797w;
            boolean m35007o = C11178w.m35007o(str);
            boolean z10 = m35007o || C11178w.m35011s(str);
            zArr[i10] = z10;
            this.f30774H = z10 | this.f30774H;
            C10109b c10109b = this.f30769C;
            if (c10109b != null) {
                if (m35007o || this.f30771E[i10].f30822b) {
                    C9400a c9400a = c11108u1.f28795u;
                    c11108u1 = c11108u1.m34488c().m34545Z(c9400a == null ? new C9400a(c10109b) : c9400a.m27995a(c10109b)).m34526G();
                }
                if (m35007o && c11108u1.f28791f == -1 && c11108u1.f28792r == -1 && c10109b.f24794a != -1) {
                    c11108u1 = c11108u1.m34488c().m34528I(c10109b.f24794a).m34526G();
                }
            }
            c11694d1Arr[i10] = new C11694d1(Integer.toString(i10), c11108u1.m34489d(this.f30792c.mo39795d(c11108u1)));
        }
        this.f30775I = new e(new C11700f1(c11694d1Arr), zArr);
        this.f30773G = true;
        ((InterfaceC11739y.a) C11137a.m34603e(this.f30768B)).mo34427h(this);
    }

    /* renamed from: U */
    private void m36938U(int i10) {
        m36928I();
        e eVar = this.f30775I;
        boolean[] zArr = eVar.f30826d;
        if (zArr[i10]) {
            return;
        }
        C11108u1 m36849d = eVar.f30823a.m36857c(i10).m36849d(0);
        this.f30794e.m36888i(C11178w.m35003k(m36849d.f28797w), m36849d, 0, null, this.f30784R);
        zArr[i10] = true;
    }

    /* renamed from: V */
    private void m36939V(int i10) {
        m36928I();
        boolean[] zArr = this.f30775I.f30824b;
        if (this.f30786T && zArr[i10]) {
            if (this.f30770D[i10].m37054K(false)) {
                return;
            }
            this.f30785S = 0L;
            this.f30786T = false;
            this.f30781O = true;
            this.f30784R = 0L;
            this.f30787U = 0;
            for (C11732u0 c11732u0 : this.f30770D) {
                c11732u0.m37060V();
            }
            ((InterfaceC11739y.a) C11137a.m34603e(this.f30768B)).mo258a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m36940Y() {
        this.f30767A.post(new Runnable() { // from class: v7.n0
            @Override // java.lang.Runnable
            public final void run() {
                C11722p0.this.m36935R();
            }
        });
    }

    /* renamed from: c0 */
    private InterfaceC12609b0 m36941c0(d dVar) {
        int length = this.f30770D.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f30771E[i10])) {
                return this.f30770D[i10];
            }
        }
        C11732u0 m37040k = C11732u0.m37040k(this.f30797s, this.f30792c, this.f30795f);
        m37040k.m37066d0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f30771E, i11);
        dVarArr[length] = dVar;
        this.f30771E = (d[]) C11172r0.m34930k(dVarArr);
        C11732u0[] c11732u0Arr = (C11732u0[]) Arrays.copyOf(this.f30770D, i11);
        c11732u0Arr[length] = m37040k;
        this.f30770D = (C11732u0[]) C11172r0.m34930k(c11732u0Arr);
        return m37040k;
    }

    /* renamed from: f0 */
    private boolean m36942f0(boolean[] zArr, long j10) {
        int length = this.f30770D.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f30770D[i10].m37063Z(j10, false) && (zArr[i10] || !this.f30774H)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void m36936S(InterfaceC12636z interfaceC12636z) {
        this.f30776J = this.f30769C == null ? interfaceC12636z : new InterfaceC12636z.b(-9223372036854775807L);
        this.f30777K = interfaceC12636z.mo127i();
        boolean z10 = !this.f30783Q && interfaceC12636z.mo127i() == -9223372036854775807L;
        this.f30778L = z10;
        this.f30779M = z10 ? 7 : 1;
        this.f30796r.mo36970k(this.f30777K, interfaceC12636z.mo126h(), this.f30778L);
        if (this.f30773G) {
            return;
        }
        m36937T();
    }

    /* renamed from: i0 */
    private void m36944i0() {
        a aVar = new a(this.f30790a, this.f30791b, this.f30801w, this, this.f30802x);
        if (this.f30773G) {
            C11137a.m34605g(m36933O());
            long j10 = this.f30777K;
            if (j10 != -9223372036854775807L && this.f30785S > j10) {
                this.f30788V = true;
                this.f30785S = -9223372036854775807L;
                return;
            }
            aVar.m36968j(((InterfaceC12636z) C11137a.m34603e(this.f30776J)).mo125d(this.f30785S).f34332a.f34224b, this.f30785S);
            for (C11732u0 c11732u0 : this.f30770D) {
                c11732u0.m37065b0(this.f30785S);
            }
            this.f30785S = -9223372036854775807L;
        }
        this.f30787U = m36931L();
        this.f30794e.m36881A(new C11731u(aVar.f30805a, aVar.f30815k, this.f30800v.m32984n(aVar, this, this.f30793d.mo32952a(this.f30779M))), 1, -1, null, 0, null, aVar.f30814j, this.f30777K);
    }

    /* renamed from: j0 */
    private boolean m36945j0() {
        return this.f30781O || m36933O();
    }

    /* renamed from: N */
    InterfaceC12609b0 m36952N() {
        return m36941c0(new d(0, true));
    }

    /* renamed from: P */
    boolean m36953P(int i10) {
        return !m36945j0() && this.f30770D[i10].m37054K(this.f30788V);
    }

    /* renamed from: W */
    void m36954W() {
        this.f30800v.m32981k(this.f30793d.mo32952a(this.f30779M));
    }

    /* renamed from: X */
    void m36955X(int i10) {
        this.f30770D[i10].m37055N();
        m36954W();
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void mo313i(a aVar, long j10, long j11, boolean z10) {
        C10832l0 c10832l0 = aVar.f30807c;
        C11731u c11731u = new C11731u(aVar.f30805a, aVar.f30815k, c10832l0.m33016r(), c10832l0.m33017s(), j10, j11, c10832l0.m33015h());
        this.f30793d.m32954c(aVar.f30805a);
        this.f30794e.m36891r(c11731u, 1, -1, null, 0, null, aVar.f30814j, this.f30777K);
        if (z10) {
            return;
        }
        for (C11732u0 c11732u0 : this.f30770D) {
            c11732u0.m37060V();
        }
        if (this.f30782P > 0) {
            ((InterfaceC11739y.a) C11137a.m34603e(this.f30768B)).mo258a(this);
        }
    }

    @Override // p397v7.C11732u0.d
    /* renamed from: a */
    public void mo304a(C11108u1 c11108u1) {
        this.f30767A.post(this.f30803y);
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void mo317m(a aVar, long j10, long j11) {
        InterfaceC12636z interfaceC12636z;
        if (this.f30777K == -9223372036854775807L && (interfaceC12636z = this.f30776J) != null) {
            boolean mo126h = interfaceC12636z.mo126h();
            long m36932M = m36932M(true);
            long j12 = m36932M == Long.MIN_VALUE ? 0L : m36932M + 10000;
            this.f30777K = j12;
            this.f30796r.mo36970k(j12, mo126h, this.f30778L);
        }
        C10832l0 c10832l0 = aVar.f30807c;
        C11731u c11731u = new C11731u(aVar.f30805a, aVar.f30815k, c10832l0.m33016r(), c10832l0.m33017s(), j10, j11, c10832l0.m33015h());
        this.f30793d.m32954c(aVar.f30805a);
        this.f30794e.m36894u(c11731u, 1, -1, null, 0, null, aVar.f30814j, this.f30777K);
        this.f30788V = true;
        ((InterfaceC11739y.a) C11137a.m34603e(this.f30768B)).mo258a(this);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        return mo249f();
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public C10818e0.c mo311h(a aVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        a aVar2;
        C10818e0.c m32976h;
        C10832l0 c10832l0 = aVar.f30807c;
        C11731u c11731u = new C11731u(aVar.f30805a, aVar.f30815k, c10832l0.m33016r(), c10832l0.m33017s(), j10, j11, c10832l0.m33015h());
        long mo32955d = this.f30793d.mo32955d(new InterfaceC10816d0.c(c11731u, new C11737x(1, -1, null, 0, null, C11172r0.m34910a1(aVar.f30814j), C11172r0.m34910a1(this.f30777K)), iOException, i10));
        if (mo32955d == -9223372036854775807L) {
            m32976h = C10818e0.f27340g;
        } else {
            int m36931L = m36931L();
            if (m36931L > this.f30787U) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            m32976h = m36929J(aVar2, m36931L) ? C10818e0.m32976h(z10, mo32955d) : C10818e0.f27339f;
        }
        boolean z11 = !m32976h.m32987c();
        this.f30794e.m36896w(c11731u, 1, -1, null, 0, null, aVar.f30814j, this.f30777K, iOException, z11);
        if (z11) {
            this.f30793d.m32954c(aVar.f30805a);
        }
        return m32976h;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: c */
    public long mo246c(long j10, C11110u3 c11110u3) {
        m36928I();
        if (!this.f30776J.mo126h()) {
            return 0L;
        }
        InterfaceC12636z.a mo125d = this.f30776J.mo125d(j10);
        return c11110u3.m34560a(j10, mo125d.f34332a.f34223a, mo125d.f34333b.f34223a);
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: d */
    public InterfaceC12609b0 mo308d(int i10, int i11) {
        return m36941c0(new d(i10, false));
    }

    /* renamed from: d0 */
    int m36959d0(int i10, C11113v1 c11113v1, C12082g c12082g, int i11) {
        if (m36945j0()) {
            return -3;
        }
        m36938U(i10);
        int m37058S = this.f30770D[i10].m37058S(c11113v1, c12082g, i11, this.f30788V);
        if (m37058S == -3) {
            m36939V(i10);
        }
        return m37058S;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        if (this.f30788V || this.f30800v.m32979i() || this.f30786T) {
            return false;
        }
        if (this.f30773G && this.f30782P == 0) {
            return false;
        }
        boolean m34721e = this.f30802x.m34721e();
        if (this.f30800v.m32980j()) {
            return m34721e;
        }
        m36944i0();
        return true;
    }

    /* renamed from: e0 */
    public void m36960e0() {
        if (this.f30773G) {
            for (C11732u0 c11732u0 : this.f30770D) {
                c11732u0.m37057R();
            }
        }
        this.f30800v.m32983m(this);
        this.f30767A.removeCallbacksAndMessages(null);
        this.f30768B = null;
        this.f30789W = true;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        long j10;
        m36928I();
        if (this.f30788V || this.f30782P == 0) {
            return Long.MIN_VALUE;
        }
        if (m36933O()) {
            return this.f30785S;
        }
        if (this.f30774H) {
            int length = this.f30770D.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.f30775I;
                if (eVar.f30824b[i10] && eVar.f30825c[i10] && !this.f30770D[i10].m37053J()) {
                    j10 = Math.min(j10, this.f30770D[i10].m37077z());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = m36932M(false);
        }
        return j10 == Long.MIN_VALUE ? this.f30784R : j10;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
    }

    /* renamed from: h0 */
    int m36961h0(int i10, long j10) {
        if (m36945j0()) {
            return 0;
        }
        m36938U(i10);
        C11732u0 c11732u0 = this.f30770D[i10];
        int m37049E = c11732u0.m37049E(j10, this.f30788V);
        c11732u0.m37067e0(m37049E);
        if (m37049E == 0) {
            m36939V(i10);
        }
        return m37049E;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    public boolean isLoading() {
        return this.f30800v.m32980j() && this.f30802x.m34720d();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: j */
    public long mo251j(long j10) {
        m36928I();
        boolean[] zArr = this.f30775I.f30824b;
        if (!this.f30776J.mo126h()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f30781O = false;
        this.f30784R = j10;
        if (m36933O()) {
            this.f30785S = j10;
            return j10;
        }
        if (this.f30779M != 7 && m36942f0(zArr, j10)) {
            return j10;
        }
        this.f30786T = false;
        this.f30785S = j10;
        this.f30788V = false;
        if (this.f30800v.m32980j()) {
            C11732u0[] c11732u0Arr = this.f30770D;
            int length = c11732u0Arr.length;
            while (i10 < length) {
                c11732u0Arr[i10].m37072r();
                i10++;
            }
            this.f30800v.m32977f();
        } else {
            this.f30800v.m32978g();
            C11732u0[] c11732u0Arr2 = this.f30770D;
            int length2 = c11732u0Arr2.length;
            while (i10 < length2) {
                c11732u0Arr2[i10].m37060V();
                i10++;
            }
        }
        return j10;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: k */
    public void mo252k(InterfaceC11739y.a aVar, long j10) {
        this.f30768B = aVar;
        this.f30802x.m34721e();
        m36944i0();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: l */
    public long mo253l() {
        if (!this.f30781O) {
            return -9223372036854775807L;
        }
        if (!this.f30788V && m36931L() <= this.f30787U) {
            return -9223372036854775807L;
        }
        this.f30781O = false;
        return this.f30784R;
    }

    @Override // p351s8.C10818e0.f
    /* renamed from: n */
    public void mo319n() {
        for (C11732u0 c11732u0 : this.f30770D) {
            c11732u0.m37059T();
        }
        this.f30801w.release();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: o */
    public void mo254o() {
        m36954W();
        if (this.f30788V && !this.f30773G) {
            throw C11005b3.m33715a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: p */
    public void mo323p(final InterfaceC12636z interfaceC12636z) {
        this.f30767A.post(new Runnable() { // from class: v7.o0
            @Override // java.lang.Runnable
            public final void run() {
                C11722p0.this.m36936S(interfaceC12636z);
            }
        });
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: q */
    public void mo324q() {
        this.f30772F = true;
        this.f30767A.post(this.f30803y);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: r */
    public C11700f1 mo255r() {
        m36928I();
        return this.f30775I.f30823a;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: s */
    public void mo256s(long j10, boolean z10) {
        m36928I();
        if (m36933O()) {
            return;
        }
        boolean[] zArr = this.f30775I.f30825c;
        int length = this.f30770D.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f30770D[i10].m37071q(j10, z10, zArr[i10]);
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: t */
    public long mo257t(InterfaceC10312r[] interfaceC10312rArr, boolean[] zArr, InterfaceC11734v0[] interfaceC11734v0Arr, boolean[] zArr2, long j10) {
        InterfaceC10312r interfaceC10312r;
        m36928I();
        e eVar = this.f30775I;
        C11700f1 c11700f1 = eVar.f30823a;
        boolean[] zArr3 = eVar.f30825c;
        int i10 = this.f30782P;
        int i11 = 0;
        for (int i12 = 0; i12 < interfaceC10312rArr.length; i12++) {
            InterfaceC11734v0 interfaceC11734v0 = interfaceC11734v0Arr[i12];
            if (interfaceC11734v0 != null && (interfaceC10312rArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) interfaceC11734v0).f30819a;
                C11137a.m34605g(zArr3[i13]);
                this.f30782P--;
                zArr3[i13] = false;
                interfaceC11734v0Arr[i12] = null;
            }
        }
        boolean z10 = !this.f30780N ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < interfaceC10312rArr.length; i14++) {
            if (interfaceC11734v0Arr[i14] == null && (interfaceC10312r = interfaceC10312rArr[i14]) != null) {
                C11137a.m34605g(interfaceC10312r.length() == 1);
                C11137a.m34605g(interfaceC10312r.mo30882b(0) == 0);
                int m36858d = c11700f1.m36858d(interfaceC10312r.mo30884d());
                C11137a.m34605g(!zArr3[m36858d]);
                this.f30782P++;
                zArr3[m36858d] = true;
                interfaceC11734v0Arr[i14] = new c(m36858d);
                zArr2[i14] = true;
                if (!z10) {
                    C11732u0 c11732u0 = this.f30770D[m36858d];
                    z10 = (c11732u0.m37063Z(j10, true) || c11732u0.m37048C() == 0) ? false : true;
                }
            }
        }
        if (this.f30782P == 0) {
            this.f30786T = false;
            this.f30781O = false;
            if (this.f30800v.m32980j()) {
                C11732u0[] c11732u0Arr = this.f30770D;
                int length = c11732u0Arr.length;
                while (i11 < length) {
                    c11732u0Arr[i11].m37072r();
                    i11++;
                }
                this.f30800v.m32977f();
            } else {
                C11732u0[] c11732u0Arr2 = this.f30770D;
                int length2 = c11732u0Arr2.length;
                while (i11 < length2) {
                    c11732u0Arr2[i11].m37060V();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = mo251j(j10);
            while (i11 < interfaceC11734v0Arr.length) {
                if (interfaceC11734v0Arr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f30780N = true;
        return j10;
    }
}
