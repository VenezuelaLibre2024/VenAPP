package p397v7;

import com.facebook.ads.AdError;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10823h;
import p361t6.C11108u1;
import p361t6.C11113v1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11178w;
import p363t8.InterfaceC11151h;
import p397v7.C11732u0;
import p414w6.C12082g;
import p436x6.C12318m;
import p436x6.InterfaceC12320n;
import p436x6.InterfaceC12329u;
import p436x6.InterfaceC12330v;
import p459y6.InterfaceC12609b0;

/* renamed from: v7.u0 */
/* loaded from: classes.dex */
public class C11732u0 implements InterfaceC12609b0 {

    /* renamed from: A */
    private C11108u1 f30890A;

    /* renamed from: B */
    private C11108u1 f30891B;

    /* renamed from: C */
    private int f30892C;

    /* renamed from: D */
    private boolean f30893D;

    /* renamed from: E */
    private boolean f30894E;

    /* renamed from: F */
    private long f30895F;

    /* renamed from: G */
    private boolean f30896G;

    /* renamed from: a */
    private final C11728s0 f30897a;

    /* renamed from: d */
    private final InterfaceC12330v f30900d;

    /* renamed from: e */
    private final InterfaceC12329u.a f30901e;

    /* renamed from: f */
    private d f30902f;

    /* renamed from: g */
    private C11108u1 f30903g;

    /* renamed from: h */
    private InterfaceC12320n f30904h;

    /* renamed from: p */
    private int f30912p;

    /* renamed from: q */
    private int f30913q;

    /* renamed from: r */
    private int f30914r;

    /* renamed from: s */
    private int f30915s;

    /* renamed from: w */
    private boolean f30919w;

    /* renamed from: z */
    private boolean f30922z;

    /* renamed from: b */
    private final b f30898b = new b();

    /* renamed from: i */
    private int f30905i = AdError.NETWORK_ERROR_CODE;

    /* renamed from: j */
    private int[] f30906j = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: k */
    private long[] f30907k = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: n */
    private long[] f30910n = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: m */
    private int[] f30909m = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: l */
    private int[] f30908l = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: o */
    private InterfaceC12609b0.a[] f30911o = new InterfaceC12609b0.a[AdError.NETWORK_ERROR_CODE];

    /* renamed from: c */
    private final C11688b1<c> f30899c = new C11688b1<>(new InterfaceC11151h() { // from class: v7.t0
        @Override // p363t8.InterfaceC11151h
        public final void accept(Object obj) {
            C11732u0.m37029L((C11732u0.c) obj);
        }
    });

    /* renamed from: t */
    private long f30916t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f30917u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f30918v = Long.MIN_VALUE;

    /* renamed from: y */
    private boolean f30921y = true;

    /* renamed from: x */
    private boolean f30920x = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v7.u0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public int f30923a;

        /* renamed from: b */
        public long f30924b;

        /* renamed from: c */
        public InterfaceC12609b0.a f30925c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v7.u0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final C11108u1 f30926a;

        /* renamed from: b */
        public final InterfaceC12330v.b f30927b;

        private c(C11108u1 c11108u1, InterfaceC12330v.b bVar) {
            this.f30926a = c11108u1;
            this.f30927b = bVar;
        }
    }

    /* renamed from: v7.u0$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo304a(C11108u1 c11108u1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C11732u0(InterfaceC10811b interfaceC10811b, InterfaceC12330v interfaceC12330v, InterfaceC12329u.a aVar) {
        this.f30900d = interfaceC12330v;
        this.f30901e = aVar;
        this.f30897a = new C11728s0(interfaceC10811b);
    }

    /* renamed from: B */
    private long m37026B(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int m37027D = m37027D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f30910n[m37027D]);
            if ((this.f30909m[m37027D] & 1) != 0) {
                break;
            }
            m37027D--;
            if (m37027D == -1) {
                m37027D = this.f30905i - 1;
            }
        }
        return j10;
    }

    /* renamed from: D */
    private int m37027D(int i10) {
        int i11 = this.f30914r + i10;
        int i12 = this.f30905i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    /* renamed from: H */
    private boolean m37028H() {
        return this.f30915s != this.f30912p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ void m37029L(c cVar) {
        cVar.f30927b.release();
    }

    /* renamed from: M */
    private boolean m37030M(int i10) {
        InterfaceC12320n interfaceC12320n = this.f30904h;
        return interfaceC12320n == null || interfaceC12320n.getState() == 4 || ((this.f30909m[i10] & 1073741824) == 0 && this.f30904h.mo39701e());
    }

    /* renamed from: O */
    private void m37031O(C11108u1 c11108u1, C11113v1 c11113v1) {
        C11108u1 c11108u12 = this.f30903g;
        boolean z10 = c11108u12 == null;
        C12318m c12318m = z10 ? null : c11108u12.f28800z;
        this.f30903g = c11108u1;
        C12318m c12318m2 = c11108u1.f28800z;
        InterfaceC12330v interfaceC12330v = this.f30900d;
        c11113v1.f28853b = interfaceC12330v != null ? c11108u1.m34489d(interfaceC12330v.mo39795d(c11108u1)) : c11108u1;
        c11113v1.f28852a = this.f30904h;
        if (this.f30900d == null) {
            return;
        }
        if (z10 || !C11172r0.m34914c(c12318m, c12318m2)) {
            InterfaceC12320n interfaceC12320n = this.f30904h;
            InterfaceC12320n mo39794c = this.f30900d.mo39794c(this.f30901e, c11108u1);
            this.f30904h = mo39794c;
            c11113v1.f28852a = mo39794c;
            if (interfaceC12320n != null) {
                interfaceC12320n.mo39700d(this.f30901e);
            }
        }
    }

    /* renamed from: P */
    private synchronized int m37032P(C11113v1 c11113v1, C12082g c12082g, boolean z10, boolean z11, b bVar) {
        c12082g.f32143d = false;
        if (!m37028H()) {
            if (!z11 && !this.f30919w) {
                C11108u1 c11108u1 = this.f30891B;
                if (c11108u1 == null || (!z10 && c11108u1 == this.f30903g)) {
                    return -3;
                }
                m37031O((C11108u1) C11137a.m34603e(c11108u1), c11113v1);
                return -5;
            }
            c12082g.m38798w(4);
            return -4;
        }
        C11108u1 c11108u12 = this.f30899c.m36827e(m37048C()).f30926a;
        if (!z10 && c11108u12 == this.f30903g) {
            int m37027D = m37027D(this.f30915s);
            if (!m37030M(m37027D)) {
                c12082g.f32143d = true;
                return -3;
            }
            c12082g.m38798w(this.f30909m[m37027D]);
            if (this.f30915s == this.f30912p - 1 && (z11 || this.f30919w)) {
                c12082g.m38789m(536870912);
            }
            long j10 = this.f30910n[m37027D];
            c12082g.f32144e = j10;
            if (j10 < this.f30916t) {
                c12082g.m38789m(Integer.MIN_VALUE);
            }
            bVar.f30923a = this.f30908l[m37027D];
            bVar.f30924b = this.f30907k[m37027D];
            bVar.f30925c = this.f30911o[m37027D];
            return -4;
        }
        m37031O(c11108u12, c11113v1);
        return -5;
    }

    /* renamed from: U */
    private void m37033U() {
        InterfaceC12320n interfaceC12320n = this.f30904h;
        if (interfaceC12320n != null) {
            interfaceC12320n.mo39700d(this.f30901e);
            this.f30904h = null;
            this.f30903g = null;
        }
    }

    /* renamed from: X */
    private synchronized void m37034X() {
        this.f30915s = 0;
        this.f30897a.m37017o();
    }

    /* renamed from: c0 */
    private synchronized boolean m37035c0(C11108u1 c11108u1) {
        this.f30921y = false;
        if (C11172r0.m34914c(c11108u1, this.f30891B)) {
            return false;
        }
        if (!this.f30899c.m36829g() && this.f30899c.m36828f().f30926a.equals(c11108u1)) {
            c11108u1 = this.f30899c.m36828f().f30926a;
        }
        this.f30891B = c11108u1;
        C11108u1 c11108u12 = this.f30891B;
        this.f30893D = C11178w.m34993a(c11108u12.f28797w, c11108u12.f28794t);
        this.f30894E = false;
        return true;
    }

    /* renamed from: h */
    private synchronized boolean m37037h(long j10) {
        if (this.f30912p == 0) {
            return j10 > this.f30917u;
        }
        if (m37047A() >= j10) {
            return false;
        }
        m37045t(this.f30913q + m37039j(j10));
        return true;
    }

    /* renamed from: i */
    private synchronized void m37038i(long j10, int i10, long j11, int i11, InterfaceC12609b0.a aVar) {
        int i12 = this.f30912p;
        if (i12 > 0) {
            int m37027D = m37027D(i12 - 1);
            C11137a.m34599a(this.f30907k[m37027D] + ((long) this.f30908l[m37027D]) <= j11);
        }
        this.f30919w = (536870912 & i10) != 0;
        this.f30918v = Math.max(this.f30918v, j10);
        int m37027D2 = m37027D(this.f30912p);
        this.f30910n[m37027D2] = j10;
        this.f30907k[m37027D2] = j11;
        this.f30908l[m37027D2] = i11;
        this.f30909m[m37027D2] = i10;
        this.f30911o[m37027D2] = aVar;
        this.f30906j[m37027D2] = this.f30892C;
        if (this.f30899c.m36829g() || !this.f30899c.m36828f().f30926a.equals(this.f30891B)) {
            InterfaceC12330v interfaceC12330v = this.f30900d;
            this.f30899c.m36823a(m37051G(), new c((C11108u1) C11137a.m34603e(this.f30891B), interfaceC12330v != null ? interfaceC12330v.mo39796e(this.f30901e, this.f30891B) : InterfaceC12330v.b.f33085a));
        }
        int i13 = this.f30912p + 1;
        this.f30912p = i13;
        int i14 = this.f30905i;
        if (i13 == i14) {
            int i15 = i14 + AdError.NETWORK_ERROR_CODE;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            InterfaceC12609b0.a[] aVarArr = new InterfaceC12609b0.a[i15];
            int i16 = this.f30914r;
            int i17 = i14 - i16;
            System.arraycopy(this.f30907k, i16, jArr, 0, i17);
            System.arraycopy(this.f30910n, this.f30914r, jArr2, 0, i17);
            System.arraycopy(this.f30909m, this.f30914r, iArr2, 0, i17);
            System.arraycopy(this.f30908l, this.f30914r, iArr3, 0, i17);
            System.arraycopy(this.f30911o, this.f30914r, aVarArr, 0, i17);
            System.arraycopy(this.f30906j, this.f30914r, iArr, 0, i17);
            int i18 = this.f30914r;
            System.arraycopy(this.f30907k, 0, jArr, i17, i18);
            System.arraycopy(this.f30910n, 0, jArr2, i17, i18);
            System.arraycopy(this.f30909m, 0, iArr2, i17, i18);
            System.arraycopy(this.f30908l, 0, iArr3, i17, i18);
            System.arraycopy(this.f30911o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f30906j, 0, iArr, i17, i18);
            this.f30907k = jArr;
            this.f30910n = jArr2;
            this.f30909m = iArr2;
            this.f30908l = iArr3;
            this.f30911o = aVarArr;
            this.f30906j = iArr;
            this.f30914r = 0;
            this.f30905i = i15;
        }
    }

    /* renamed from: j */
    private int m37039j(long j10) {
        int i10 = this.f30912p;
        int m37027D = m37027D(i10 - 1);
        while (i10 > this.f30915s && this.f30910n[m37027D] >= j10) {
            i10--;
            m37027D--;
            if (m37027D == -1) {
                m37027D = this.f30905i - 1;
            }
        }
        return i10;
    }

    /* renamed from: k */
    public static C11732u0 m37040k(InterfaceC10811b interfaceC10811b, InterfaceC12330v interfaceC12330v, InterfaceC12329u.a aVar) {
        return new C11732u0(interfaceC10811b, (InterfaceC12330v) C11137a.m34603e(interfaceC12330v), (InterfaceC12329u.a) C11137a.m34603e(aVar));
    }

    /* renamed from: l */
    public static C11732u0 m37041l(InterfaceC10811b interfaceC10811b) {
        return new C11732u0(interfaceC10811b, null, null);
    }

    /* renamed from: m */
    private synchronized long m37042m(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f30912p;
        if (i11 != 0) {
            long[] jArr = this.f30910n;
            int i12 = this.f30914r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f30915s) != i11) {
                    i11 = i10 + 1;
                }
                int m37046v = m37046v(i12, i11, j10, z10);
                if (m37046v == -1) {
                    return -1L;
                }
                return m37044p(m37046v);
            }
        }
        return -1L;
    }

    /* renamed from: n */
    private synchronized long m37043n() {
        int i10 = this.f30912p;
        if (i10 == 0) {
            return -1L;
        }
        return m37044p(i10);
    }

    /* renamed from: p */
    private long m37044p(int i10) {
        this.f30917u = Math.max(this.f30917u, m37026B(i10));
        this.f30912p -= i10;
        int i11 = this.f30913q + i10;
        this.f30913q = i11;
        int i12 = this.f30914r + i10;
        this.f30914r = i12;
        int i13 = this.f30905i;
        if (i12 >= i13) {
            this.f30914r = i12 - i13;
        }
        int i14 = this.f30915s - i10;
        this.f30915s = i14;
        if (i14 < 0) {
            this.f30915s = 0;
        }
        this.f30899c.m36826d(i11);
        if (this.f30912p != 0) {
            return this.f30907k[this.f30914r];
        }
        int i15 = this.f30914r;
        if (i15 == 0) {
            i15 = this.f30905i;
        }
        return this.f30907k[i15 - 1] + this.f30908l[r6];
    }

    /* renamed from: t */
    private long m37045t(int i10) {
        int m37051G = m37051G() - i10;
        boolean z10 = false;
        C11137a.m34599a(m37051G >= 0 && m37051G <= this.f30912p - this.f30915s);
        int i11 = this.f30912p - m37051G;
        this.f30912p = i11;
        this.f30918v = Math.max(this.f30917u, m37026B(i11));
        if (m37051G == 0 && this.f30919w) {
            z10 = true;
        }
        this.f30919w = z10;
        this.f30899c.m36825c(i10);
        int i12 = this.f30912p;
        if (i12 == 0) {
            return 0L;
        }
        return this.f30907k[m37027D(i12 - 1)] + this.f30908l[r9];
    }

    /* renamed from: v */
    private int m37046v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f30910n[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f30909m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f30905i) {
                i10 = 0;
            }
        }
        return i12;
    }

    /* renamed from: A */
    public final synchronized long m37047A() {
        return Math.max(this.f30917u, m37026B(this.f30915s));
    }

    /* renamed from: C */
    public final int m37048C() {
        return this.f30913q + this.f30915s;
    }

    /* renamed from: E */
    public final synchronized int m37049E(long j10, boolean z10) {
        int m37027D = m37027D(this.f30915s);
        if (m37028H() && j10 >= this.f30910n[m37027D]) {
            if (j10 > this.f30918v && z10) {
                return this.f30912p - this.f30915s;
            }
            int m37046v = m37046v(m37027D, this.f30912p - this.f30915s, j10, true);
            if (m37046v == -1) {
                return 0;
            }
            return m37046v;
        }
        return 0;
    }

    /* renamed from: F */
    public final synchronized C11108u1 m37050F() {
        return this.f30921y ? null : this.f30891B;
    }

    /* renamed from: G */
    public final int m37051G() {
        return this.f30913q + this.f30912p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final void m37052I() {
        this.f30922z = true;
    }

    /* renamed from: J */
    public final synchronized boolean m37053J() {
        return this.f30919w;
    }

    /* renamed from: K */
    public synchronized boolean m37054K(boolean z10) {
        C11108u1 c11108u1;
        boolean z11 = true;
        if (m37028H()) {
            if (this.f30899c.m36827e(m37048C()).f30926a != this.f30903g) {
                return true;
            }
            return m37030M(m37027D(this.f30915s));
        }
        if (!z10 && !this.f30919w && ((c11108u1 = this.f30891B) == null || c11108u1 == this.f30903g)) {
            z11 = false;
        }
        return z11;
    }

    /* renamed from: N */
    public void m37055N() {
        InterfaceC12320n interfaceC12320n = this.f30904h;
        if (interfaceC12320n != null && interfaceC12320n.getState() == 1) {
            throw ((InterfaceC12320n.a) C11137a.m34603e(this.f30904h.mo39698a()));
        }
    }

    /* renamed from: Q */
    public final synchronized int m37056Q() {
        return m37028H() ? this.f30906j[m37027D(this.f30915s)] : this.f30892C;
    }

    /* renamed from: R */
    public void m37057R() {
        m37072r();
        m37033U();
    }

    /* renamed from: S */
    public int m37058S(C11113v1 c11113v1, C12082g c12082g, int i10, boolean z10) {
        int m37032P = m37032P(c11113v1, c12082g, (i10 & 2) != 0, z10, this.f30898b);
        if (m37032P == -4 && !c12082g.m38794s()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                C11728s0 c11728s0 = this.f30897a;
                b bVar = this.f30898b;
                if (z11) {
                    c11728s0.m37014f(c12082g, bVar);
                } else {
                    c11728s0.m37015m(c12082g, bVar);
                }
            }
            if (!z11) {
                this.f30915s++;
            }
        }
        return m37032P;
    }

    /* renamed from: T */
    public void m37059T() {
        m37061W(true);
        m37033U();
    }

    /* renamed from: V */
    public final void m37060V() {
        m37061W(false);
    }

    /* renamed from: W */
    public void m37061W(boolean z10) {
        this.f30897a.m37016n();
        this.f30912p = 0;
        this.f30913q = 0;
        this.f30914r = 0;
        this.f30915s = 0;
        this.f30920x = true;
        this.f30916t = Long.MIN_VALUE;
        this.f30917u = Long.MIN_VALUE;
        this.f30918v = Long.MIN_VALUE;
        this.f30919w = false;
        this.f30899c.m36824b();
        if (z10) {
            this.f30890A = null;
            this.f30891B = null;
            this.f30921y = true;
        }
    }

    /* renamed from: Y */
    public final synchronized boolean m37062Y(int i10) {
        m37034X();
        int i11 = this.f30913q;
        if (i10 >= i11 && i10 <= this.f30912p + i11) {
            this.f30916t = Long.MIN_VALUE;
            this.f30915s = i10 - i11;
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final synchronized boolean m37063Z(long j10, boolean z10) {
        m37034X();
        int m37027D = m37027D(this.f30915s);
        if (m37028H() && j10 >= this.f30910n[m37027D] && (j10 <= this.f30918v || z10)) {
            int m37046v = m37046v(m37027D, this.f30912p - this.f30915s, j10, true);
            if (m37046v == -1) {
                return false;
            }
            this.f30916t = j10;
            this.f30915s += m37046v;
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public final void m37064a0(long j10) {
        if (this.f30895F != j10) {
            this.f30895F = j10;
            m37052I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // p459y6.InterfaceC12609b0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo331b(long r12, int r14, int r15, int r16, p459y6.InterfaceC12609b0.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f30922z
            if (r0 == 0) goto L10
            t6.u1 r0 = r8.f30890A
            java.lang.Object r0 = p363t8.C11137a.m34607i(r0)
            t6.u1 r0 = (p361t6.C11108u1) r0
            r11.mo332c(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f30920x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f30920x = r1
        L22:
            long r4 = r8.f30895F
            long r4 = r4 + r12
            boolean r6 = r8.f30893D
            if (r6 == 0) goto L54
            long r6 = r8.f30916t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.f30894E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            t6.u1 r6 = r8.f30891B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            p363t8.C11173s.m34970i(r6, r0)
            r8.f30894E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.f30896G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.m37037h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.f30896G = r1
            goto L66
        L65:
            return
        L66:
            v7.s0 r0 = r8.f30897a
            long r0 = r0.m37013e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.m37038i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p397v7.C11732u0.mo331b(long, int, int, int, y6.b0$a):void");
    }

    /* renamed from: b0 */
    public final void m37065b0(long j10) {
        this.f30916t = j10;
    }

    @Override // p459y6.InterfaceC12609b0
    /* renamed from: c */
    public final void mo332c(C11108u1 c11108u1) {
        C11108u1 mo338w = mo338w(c11108u1);
        this.f30922z = false;
        this.f30890A = c11108u1;
        boolean m37035c0 = m37035c0(mo338w);
        d dVar = this.f30902f;
        if (dVar == null || !m37035c0) {
            return;
        }
        dVar.mo304a(mo338w);
    }

    @Override // p459y6.InterfaceC12609b0
    /* renamed from: d */
    public final void mo333d(C11146e0 c11146e0, int i10, int i11) {
        this.f30897a.m37019q(c11146e0, i10);
    }

    /* renamed from: d0 */
    public final void m37066d0(d dVar) {
        this.f30902f = dVar;
    }

    @Override // p459y6.InterfaceC12609b0
    /* renamed from: e */
    public final int mo334e(InterfaceC10823h interfaceC10823h, int i10, boolean z10, int i11) {
        return this.f30897a.m37018p(interfaceC10823h, i10, z10);
    }

    /* renamed from: e0 */
    public final synchronized void m37067e0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f30915s + i10 <= this.f30912p) {
                    z10 = true;
                    C11137a.m34599a(z10);
                    this.f30915s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        C11137a.m34599a(z10);
        this.f30915s += i10;
    }

    /* renamed from: f0 */
    public final void m37068f0(int i10) {
        this.f30892C = i10;
    }

    /* renamed from: g0 */
    public final void m37069g0() {
        this.f30896G = true;
    }

    /* renamed from: o */
    public synchronized long m37070o() {
        int i10 = this.f30915s;
        if (i10 == 0) {
            return -1L;
        }
        return m37044p(i10);
    }

    /* renamed from: q */
    public final void m37071q(long j10, boolean z10, boolean z11) {
        this.f30897a.m37011b(m37042m(j10, z10, z11));
    }

    /* renamed from: r */
    public final void m37072r() {
        this.f30897a.m37011b(m37043n());
    }

    /* renamed from: s */
    public final void m37073s() {
        this.f30897a.m37011b(m37070o());
    }

    /* renamed from: u */
    public final void m37074u(int i10) {
        this.f30897a.m37012c(m37045t(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public C11108u1 mo338w(C11108u1 c11108u1) {
        return (this.f30895F == 0 || c11108u1.f28767A == Long.MAX_VALUE) ? c11108u1 : c11108u1.m34488c().m34556k0(c11108u1.f28767A + this.f30895F).m34526G();
    }

    /* renamed from: x */
    public final int m37075x() {
        return this.f30913q;
    }

    /* renamed from: y */
    public final synchronized long m37076y() {
        return this.f30912p == 0 ? Long.MIN_VALUE : this.f30910n[this.f30914r];
    }

    /* renamed from: z */
    public final synchronized long m37077z() {
        return this.f30918v;
    }
}
