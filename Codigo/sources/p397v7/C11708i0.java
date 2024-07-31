package p397v7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import p307q8.InterfaceC10312r;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p361t6.C11113v1;
import p363t8.C11137a;
import p397v7.InterfaceC11739y;
import p414w6.C12082g;
import p437x7.AbstractC12340f;
import p437x7.AbstractC12348n;
import p437x7.InterfaceC12349o;

/* renamed from: v7.i0 */
/* loaded from: classes.dex */
final class C11708i0 implements InterfaceC11739y, InterfaceC11739y.a {

    /* renamed from: a */
    private final InterfaceC11739y[] f30719a;

    /* renamed from: c */
    private final InterfaceC11707i f30721c;

    /* renamed from: f */
    private InterfaceC11739y.a f30724f;

    /* renamed from: r */
    private C11700f1 f30725r;

    /* renamed from: t */
    private InterfaceC11736w0 f30727t;

    /* renamed from: d */
    private final ArrayList<InterfaceC11739y> f30722d = new ArrayList<>();

    /* renamed from: e */
    private final HashMap<C11694d1, C11694d1> f30723e = new HashMap<>();

    /* renamed from: b */
    private final IdentityHashMap<InterfaceC11734v0, Integer> f30720b = new IdentityHashMap<>();

    /* renamed from: s */
    private InterfaceC11739y[] f30726s = new InterfaceC11739y[0];

    /* renamed from: v7.i0$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC10312r {

        /* renamed from: a */
        private final InterfaceC10312r f30728a;

        /* renamed from: b */
        private final C11694d1 f30729b;

        public a(InterfaceC10312r interfaceC10312r, C11694d1 c11694d1) {
            this.f30728a = interfaceC10312r;
            this.f30729b = c11694d1;
        }

        @Override // p307q8.InterfaceC10315u
        /* renamed from: a */
        public C11108u1 mo30881a(int i10) {
            return this.f30728a.mo30881a(i10);
        }

        @Override // p307q8.InterfaceC10315u
        /* renamed from: b */
        public int mo30882b(int i10) {
            return this.f30728a.mo30882b(i10);
        }

        @Override // p307q8.InterfaceC10315u
        /* renamed from: c */
        public int mo30883c(int i10) {
            return this.f30728a.mo30883c(i10);
        }

        @Override // p307q8.InterfaceC10315u
        /* renamed from: d */
        public C11694d1 mo30884d() {
            return this.f30729b;
        }

        @Override // p307q8.InterfaceC10315u
        /* renamed from: e */
        public int mo30885e(C11108u1 c11108u1) {
            return this.f30728a.mo30885e(c11108u1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30728a.equals(aVar.f30728a) && this.f30729b.equals(aVar.f30729b);
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: f */
        public void mo30860f() {
            this.f30728a.mo30860f();
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: g */
        public void mo209g(long j10, long j11, long j12, List<? extends AbstractC12348n> list, InterfaceC12349o[] interfaceC12349oArr) {
            this.f30728a.mo209g(j10, j11, j12, list, interfaceC12349oArr);
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: h */
        public int mo210h() {
            return this.f30728a.mo210h();
        }

        public int hashCode() {
            return ((527 + this.f30729b.hashCode()) * 31) + this.f30728a.hashCode();
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: i */
        public boolean mo30886i(int i10, long j10) {
            return this.f30728a.mo30886i(i10, j10);
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: j */
        public boolean mo30887j(int i10, long j10) {
            return this.f30728a.mo30887j(i10, j10);
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: k */
        public boolean mo31033k(long j10, AbstractC12340f abstractC12340f, List<? extends AbstractC12348n> list) {
            return this.f30728a.mo31033k(j10, abstractC12340f, list);
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: l */
        public void mo30861l(float f10) {
            this.f30728a.mo30861l(f10);
        }

        @Override // p307q8.InterfaceC10315u
        public int length() {
            return this.f30728a.length();
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: m */
        public Object mo211m() {
            return this.f30728a.mo211m();
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: n */
        public void mo31034n() {
            this.f30728a.mo31034n();
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: o */
        public void mo31035o(boolean z10) {
            this.f30728a.mo31035o(z10);
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: p */
        public void mo30862p() {
            this.f30728a.mo30862p();
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: q */
        public int mo30863q(long j10, List<? extends AbstractC12348n> list) {
            return this.f30728a.mo30863q(j10, list);
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: r */
        public int mo30888r() {
            return this.f30728a.mo30888r();
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: s */
        public C11108u1 mo30889s() {
            return this.f30728a.mo30889s();
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: t */
        public int mo212t() {
            return this.f30728a.mo212t();
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: u */
        public void mo31036u() {
            this.f30728a.mo31036u();
        }
    }

    /* renamed from: v7.i0$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC11739y, InterfaceC11739y.a {

        /* renamed from: a */
        private final InterfaceC11739y f30730a;

        /* renamed from: b */
        private final long f30731b;

        /* renamed from: c */
        private InterfaceC11739y.a f30732c;

        public b(InterfaceC11739y interfaceC11739y, long j10) {
            this.f30730a = interfaceC11739y;
            this.f30731b = j10;
        }

        @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
        /* renamed from: b */
        public long mo245b() {
            long mo245b = this.f30730a.mo245b();
            if (mo245b == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f30731b + mo245b;
        }

        @Override // p397v7.InterfaceC11739y
        /* renamed from: c */
        public long mo246c(long j10, C11110u3 c11110u3) {
            return this.f30730a.mo246c(j10 - this.f30731b, c11110u3) + this.f30731b;
        }

        @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
        /* renamed from: e */
        public boolean mo248e(long j10) {
            return this.f30730a.mo248e(j10 - this.f30731b);
        }

        @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
        /* renamed from: f */
        public long mo249f() {
            long mo249f = this.f30730a.mo249f();
            if (mo249f == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f30731b + mo249f;
        }

        @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
        /* renamed from: g */
        public void mo250g(long j10) {
            this.f30730a.mo250g(j10 - this.f30731b);
        }

        @Override // p397v7.InterfaceC11739y.a
        /* renamed from: h */
        public void mo34427h(InterfaceC11739y interfaceC11739y) {
            ((InterfaceC11739y.a) C11137a.m34603e(this.f30732c)).mo34427h(this);
        }

        @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
        public boolean isLoading() {
            return this.f30730a.isLoading();
        }

        @Override // p397v7.InterfaceC11739y
        /* renamed from: j */
        public long mo251j(long j10) {
            return this.f30730a.mo251j(j10 - this.f30731b) + this.f30731b;
        }

        @Override // p397v7.InterfaceC11739y
        /* renamed from: k */
        public void mo252k(InterfaceC11739y.a aVar, long j10) {
            this.f30732c = aVar;
            this.f30730a.mo252k(this, j10 - this.f30731b);
        }

        @Override // p397v7.InterfaceC11739y
        /* renamed from: l */
        public long mo253l() {
            long mo253l = this.f30730a.mo253l();
            if (mo253l == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f30731b + mo253l;
        }

        @Override // p397v7.InterfaceC11736w0.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo258a(InterfaceC11739y interfaceC11739y) {
            ((InterfaceC11739y.a) C11137a.m34603e(this.f30732c)).mo258a(this);
        }

        @Override // p397v7.InterfaceC11739y
        /* renamed from: o */
        public void mo254o() {
            this.f30730a.mo254o();
        }

        @Override // p397v7.InterfaceC11739y
        /* renamed from: r */
        public C11700f1 mo255r() {
            return this.f30730a.mo255r();
        }

        @Override // p397v7.InterfaceC11739y
        /* renamed from: s */
        public void mo256s(long j10, boolean z10) {
            this.f30730a.mo256s(j10 - this.f30731b, z10);
        }

        @Override // p397v7.InterfaceC11739y
        /* renamed from: t */
        public long mo257t(InterfaceC10312r[] interfaceC10312rArr, boolean[] zArr, InterfaceC11734v0[] interfaceC11734v0Arr, boolean[] zArr2, long j10) {
            InterfaceC11734v0[] interfaceC11734v0Arr2 = new InterfaceC11734v0[interfaceC11734v0Arr.length];
            int i10 = 0;
            while (true) {
                InterfaceC11734v0 interfaceC11734v0 = null;
                if (i10 >= interfaceC11734v0Arr.length) {
                    break;
                }
                c cVar = (c) interfaceC11734v0Arr[i10];
                if (cVar != null) {
                    interfaceC11734v0 = cVar.m36914b();
                }
                interfaceC11734v0Arr2[i10] = interfaceC11734v0;
                i10++;
            }
            long mo257t = this.f30730a.mo257t(interfaceC10312rArr, zArr, interfaceC11734v0Arr2, zArr2, j10 - this.f30731b);
            for (int i11 = 0; i11 < interfaceC11734v0Arr.length; i11++) {
                InterfaceC11734v0 interfaceC11734v02 = interfaceC11734v0Arr2[i11];
                if (interfaceC11734v02 == null) {
                    interfaceC11734v0Arr[i11] = null;
                } else {
                    InterfaceC11734v0 interfaceC11734v03 = interfaceC11734v0Arr[i11];
                    if (interfaceC11734v03 == null || ((c) interfaceC11734v03).m36914b() != interfaceC11734v02) {
                        interfaceC11734v0Arr[i11] = new c(interfaceC11734v02, this.f30731b);
                    }
                }
            }
            return mo257t + this.f30731b;
        }
    }

    /* renamed from: v7.i0$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC11734v0 {

        /* renamed from: a */
        private final InterfaceC11734v0 f30733a;

        /* renamed from: b */
        private final long f30734b;

        public c(InterfaceC11734v0 interfaceC11734v0, long j10) {
            this.f30733a = interfaceC11734v0;
            this.f30734b = j10;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: a */
        public void mo262a() {
            this.f30733a.mo262a();
        }

        /* renamed from: b */
        public InterfaceC11734v0 m36914b() {
            return this.f30733a;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: d */
        public boolean mo264d() {
            return this.f30733a.mo264d();
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: p */
        public int mo266p(long j10) {
            return this.f30733a.mo266p(j10 - this.f30734b);
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: q */
        public int mo267q(C11113v1 c11113v1, C12082g c12082g, int i10) {
            int mo267q = this.f30733a.mo267q(c11113v1, c12082g, i10);
            if (mo267q == -4) {
                c12082g.f32144e = Math.max(0L, c12082g.f32144e + this.f30734b);
            }
            return mo267q;
        }
    }

    public C11708i0(InterfaceC11707i interfaceC11707i, long[] jArr, InterfaceC11739y... interfaceC11739yArr) {
        this.f30721c = interfaceC11707i;
        this.f30719a = interfaceC11739yArr;
        this.f30727t = interfaceC11707i.mo36909a(new InterfaceC11736w0[0]);
        for (int i10 = 0; i10 < interfaceC11739yArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f30719a[i10] = new b(interfaceC11739yArr[i10], j10);
            }
        }
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        return this.f30727t.mo245b();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: c */
    public long mo246c(long j10, C11110u3 c11110u3) {
        InterfaceC11739y[] interfaceC11739yArr = this.f30726s;
        return (interfaceC11739yArr.length > 0 ? interfaceC11739yArr[0] : this.f30719a[0]).mo246c(j10, c11110u3);
    }

    /* renamed from: d */
    public InterfaceC11739y m36910d(int i10) {
        InterfaceC11739y interfaceC11739y = this.f30719a[i10];
        return interfaceC11739y instanceof b ? ((b) interfaceC11739y).f30730a : interfaceC11739y;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        if (this.f30722d.isEmpty()) {
            return this.f30727t.mo248e(j10);
        }
        int size = this.f30722d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f30722d.get(i10).mo248e(j10);
        }
        return false;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        return this.f30727t.mo249f();
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
        this.f30727t.mo250g(j10);
    }

    @Override // p397v7.InterfaceC11739y.a
    /* renamed from: h */
    public void mo34427h(InterfaceC11739y interfaceC11739y) {
        this.f30722d.remove(interfaceC11739y);
        if (!this.f30722d.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (InterfaceC11739y interfaceC11739y2 : this.f30719a) {
            i10 += interfaceC11739y2.mo255r().f30692a;
        }
        C11694d1[] c11694d1Arr = new C11694d1[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            InterfaceC11739y[] interfaceC11739yArr = this.f30719a;
            if (i11 >= interfaceC11739yArr.length) {
                this.f30725r = new C11700f1(c11694d1Arr);
                ((InterfaceC11739y.a) C11137a.m34603e(this.f30724f)).mo34427h(this);
                return;
            }
            C11700f1 mo255r = interfaceC11739yArr[i11].mo255r();
            int i13 = mo255r.f30692a;
            int i14 = 0;
            while (i14 < i13) {
                C11694d1 m36857c = mo255r.m36857c(i14);
                C11694d1 m36848c = m36857c.m36848c(i11 + ":" + m36857c.f30659b);
                this.f30723e.put(m36848c, m36857c);
                c11694d1Arr[i12] = m36848c;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    public boolean isLoading() {
        return this.f30727t.isLoading();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: j */
    public long mo251j(long j10) {
        long mo251j = this.f30726s[0].mo251j(j10);
        int i10 = 1;
        while (true) {
            InterfaceC11739y[] interfaceC11739yArr = this.f30726s;
            if (i10 >= interfaceC11739yArr.length) {
                return mo251j;
            }
            if (interfaceC11739yArr[i10].mo251j(mo251j) != mo251j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: k */
    public void mo252k(InterfaceC11739y.a aVar, long j10) {
        this.f30724f = aVar;
        Collections.addAll(this.f30722d, this.f30719a);
        for (InterfaceC11739y interfaceC11739y : this.f30719a) {
            interfaceC11739y.mo252k(this, j10);
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: l */
    public long mo253l() {
        long j10 = -9223372036854775807L;
        for (InterfaceC11739y interfaceC11739y : this.f30726s) {
            long mo253l = interfaceC11739y.mo253l();
            if (mo253l != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (InterfaceC11739y interfaceC11739y2 : this.f30726s) {
                        if (interfaceC11739y2 == interfaceC11739y) {
                            break;
                        }
                        if (interfaceC11739y2.mo251j(mo253l) != mo253l) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = mo253l;
                } else if (mo253l != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && interfaceC11739y.mo251j(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // p397v7.InterfaceC11736w0.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo258a(InterfaceC11739y interfaceC11739y) {
        ((InterfaceC11739y.a) C11137a.m34603e(this.f30724f)).mo258a(this);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: o */
    public void mo254o() {
        for (InterfaceC11739y interfaceC11739y : this.f30719a) {
            interfaceC11739y.mo254o();
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: r */
    public C11700f1 mo255r() {
        return (C11700f1) C11137a.m34603e(this.f30725r);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: s */
    public void mo256s(long j10, boolean z10) {
        for (InterfaceC11739y interfaceC11739y : this.f30726s) {
            interfaceC11739y.mo256s(j10, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // p397v7.InterfaceC11739y
    /* renamed from: t */
    public long mo257t(InterfaceC10312r[] interfaceC10312rArr, boolean[] zArr, InterfaceC11734v0[] interfaceC11734v0Arr, boolean[] zArr2, long j10) {
        InterfaceC11734v0 interfaceC11734v0;
        int[] iArr = new int[interfaceC10312rArr.length];
        int[] iArr2 = new int[interfaceC10312rArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            interfaceC11734v0 = null;
            if (i11 >= interfaceC10312rArr.length) {
                break;
            }
            InterfaceC11734v0 interfaceC11734v02 = interfaceC11734v0Arr[i11];
            Integer num = interfaceC11734v02 != null ? this.f30720b.get(interfaceC11734v02) : null;
            iArr[i11] = num == null ? -1 : num.intValue();
            InterfaceC10312r interfaceC10312r = interfaceC10312rArr[i11];
            if (interfaceC10312r != null) {
                String str = interfaceC10312r.mo30884d().f30659b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.f30720b.clear();
        int length = interfaceC10312rArr.length;
        InterfaceC11734v0[] interfaceC11734v0Arr2 = new InterfaceC11734v0[length];
        InterfaceC11734v0[] interfaceC11734v0Arr3 = new InterfaceC11734v0[interfaceC10312rArr.length];
        InterfaceC10312r[] interfaceC10312rArr2 = new InterfaceC10312r[interfaceC10312rArr.length];
        ArrayList arrayList = new ArrayList(this.f30719a.length);
        long j11 = j10;
        int i12 = 0;
        InterfaceC10312r[] interfaceC10312rArr3 = interfaceC10312rArr2;
        while (i12 < this.f30719a.length) {
            for (int i13 = i10; i13 < interfaceC10312rArr.length; i13++) {
                interfaceC11734v0Arr3[i13] = iArr[i13] == i12 ? interfaceC11734v0Arr[i13] : interfaceC11734v0;
                if (iArr2[i13] == i12) {
                    InterfaceC10312r interfaceC10312r2 = (InterfaceC10312r) C11137a.m34603e(interfaceC10312rArr[i13]);
                    interfaceC10312rArr3[i13] = new a(interfaceC10312r2, (C11694d1) C11137a.m34603e(this.f30723e.get(interfaceC10312r2.mo30884d())));
                } else {
                    interfaceC10312rArr3[i13] = interfaceC11734v0;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            InterfaceC10312r[] interfaceC10312rArr4 = interfaceC10312rArr3;
            long mo257t = this.f30719a[i12].mo257t(interfaceC10312rArr3, zArr, interfaceC11734v0Arr3, zArr2, j11);
            if (i14 == 0) {
                j11 = mo257t;
            } else if (mo257t != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < interfaceC10312rArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    InterfaceC11734v0 interfaceC11734v03 = (InterfaceC11734v0) C11137a.m34603e(interfaceC11734v0Arr3[i15]);
                    interfaceC11734v0Arr2[i15] = interfaceC11734v0Arr3[i15];
                    this.f30720b.put(interfaceC11734v03, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    C11137a.m34605g(interfaceC11734v0Arr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f30719a[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            interfaceC10312rArr3 = interfaceC10312rArr4;
            i10 = 0;
            interfaceC11734v0 = null;
        }
        int i16 = i10;
        System.arraycopy(interfaceC11734v0Arr2, i16, interfaceC11734v0Arr, i16, length);
        InterfaceC11739y[] interfaceC11739yArr = (InterfaceC11739y[]) arrayList.toArray(new InterfaceC11739y[i16]);
        this.f30726s = interfaceC11739yArr;
        this.f30727t = this.f30721c.mo36909a(interfaceC11739yArr);
        return j11;
    }
}
