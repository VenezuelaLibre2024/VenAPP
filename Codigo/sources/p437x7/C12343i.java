package p437x7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p351s8.C10818e0;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10816d0;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p361t6.C11113v1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.C11731u;
import p397v7.C11732u0;
import p397v7.InterfaceC11705h0;
import p397v7.InterfaceC11734v0;
import p397v7.InterfaceC11736w0;
import p414w6.C12082g;
import p436x6.InterfaceC12329u;
import p436x6.InterfaceC12330v;
import p437x7.InterfaceC12344j;

/* renamed from: x7.i */
/* loaded from: classes.dex */
public class C12343i<T extends InterfaceC12344j> implements InterfaceC11734v0, InterfaceC11736w0, C10818e0.b<AbstractC12340f>, C10818e0.f {

    /* renamed from: A */
    private AbstractC12340f f33124A;

    /* renamed from: B */
    private C11108u1 f33125B;

    /* renamed from: C */
    private b<T> f33126C;

    /* renamed from: D */
    private long f33127D;

    /* renamed from: E */
    private long f33128E;

    /* renamed from: F */
    private int f33129F;

    /* renamed from: G */
    private AbstractC12335a f33130G;

    /* renamed from: H */
    boolean f33131H;

    /* renamed from: a */
    public final int f33132a;

    /* renamed from: b */
    private final int[] f33133b;

    /* renamed from: c */
    private final C11108u1[] f33134c;

    /* renamed from: d */
    private final boolean[] f33135d;

    /* renamed from: e */
    private final T f33136e;

    /* renamed from: f */
    private final InterfaceC11736w0.a<C12343i<T>> f33137f;

    /* renamed from: r */
    private final InterfaceC11705h0.a f33138r;

    /* renamed from: s */
    private final InterfaceC10816d0 f33139s;

    /* renamed from: t */
    private final C10818e0 f33140t;

    /* renamed from: u */
    private final C12342h f33141u;

    /* renamed from: v */
    private final ArrayList<AbstractC12335a> f33142v;

    /* renamed from: w */
    private final List<AbstractC12335a> f33143w;

    /* renamed from: x */
    private final C11732u0 f33144x;

    /* renamed from: y */
    private final C11732u0[] f33145y;

    /* renamed from: z */
    private final C12337c f33146z;

    /* renamed from: x7.i$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC11734v0 {

        /* renamed from: a */
        public final C12343i<T> f33147a;

        /* renamed from: b */
        private final C11732u0 f33148b;

        /* renamed from: c */
        private final int f33149c;

        /* renamed from: d */
        private boolean f33150d;

        public a(C12343i<T> c12343i, C11732u0 c11732u0, int i10) {
            this.f33147a = c12343i;
            this.f33148b = c11732u0;
            this.f33149c = i10;
        }

        /* renamed from: b */
        private void m39933b() {
            if (this.f33150d) {
                return;
            }
            C12343i.this.f33138r.m36888i(C12343i.this.f33133b[this.f33149c], C12343i.this.f33134c[this.f33149c], 0, null, C12343i.this.f33128E);
            this.f33150d = true;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: a */
        public void mo262a() {
        }

        /* renamed from: c */
        public void m39934c() {
            C11137a.m34605g(C12343i.this.f33135d[this.f33149c]);
            C12343i.this.f33135d[this.f33149c] = false;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: d */
        public boolean mo264d() {
            return !C12343i.this.m39923H() && this.f33148b.m37054K(C12343i.this.f33131H);
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: p */
        public int mo266p(long j10) {
            if (C12343i.this.m39923H()) {
                return 0;
            }
            int m37049E = this.f33148b.m37049E(j10, C12343i.this.f33131H);
            if (C12343i.this.f33130G != null) {
                m37049E = Math.min(m37049E, C12343i.this.f33130G.m39883i(this.f33149c + 1) - this.f33148b.m37048C());
            }
            this.f33148b.m37067e0(m37049E);
            if (m37049E > 0) {
                m39933b();
            }
            return m37049E;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: q */
        public int mo267q(C11113v1 c11113v1, C12082g c12082g, int i10) {
            if (C12343i.this.m39923H()) {
                return -3;
            }
            if (C12343i.this.f33130G != null && C12343i.this.f33130G.m39883i(this.f33149c + 1) <= this.f33148b.m37048C()) {
                return -3;
            }
            m39933b();
            return this.f33148b.m37058S(c11113v1, c12082g, i10, C12343i.this.f33131H);
        }
    }

    /* renamed from: x7.i$b */
    /* loaded from: classes.dex */
    public interface b<T extends InterfaceC12344j> {
        /* renamed from: d */
        void mo11898d(C12343i<T> c12343i);
    }

    public C12343i(int i10, int[] iArr, C11108u1[] c11108u1Arr, T t10, InterfaceC11736w0.a<C12343i<T>> aVar, InterfaceC10811b interfaceC10811b, long j10, InterfaceC12330v interfaceC12330v, InterfaceC12329u.a aVar2, InterfaceC10816d0 interfaceC10816d0, InterfaceC11705h0.a aVar3) {
        this.f33132a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f33133b = iArr;
        this.f33134c = c11108u1Arr == null ? new C11108u1[0] : c11108u1Arr;
        this.f33136e = t10;
        this.f33137f = aVar;
        this.f33138r = aVar3;
        this.f33139s = interfaceC10816d0;
        this.f33140t = new C10818e0("ChunkSampleStream");
        this.f33141u = new C12342h();
        ArrayList<AbstractC12335a> arrayList = new ArrayList<>();
        this.f33142v = arrayList;
        this.f33143w = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f33145y = new C11732u0[length];
        this.f33135d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        C11732u0[] c11732u0Arr = new C11732u0[i12];
        C11732u0 m37040k = C11732u0.m37040k(interfaceC10811b, interfaceC12330v, aVar2);
        this.f33144x = m37040k;
        iArr2[0] = i10;
        c11732u0Arr[0] = m37040k;
        while (i11 < length) {
            C11732u0 m37041l = C11732u0.m37041l(interfaceC10811b);
            this.f33145y[i11] = m37041l;
            int i13 = i11 + 1;
            c11732u0Arr[i13] = m37041l;
            iArr2[i13] = this.f33133b[i11];
            i11 = i13;
        }
        this.f33146z = new C12337c(iArr2, c11732u0Arr);
        this.f33127D = j10;
        this.f33128E = j10;
    }

    /* renamed from: A */
    private void m39906A(int i10) {
        int min = Math.min(m39914N(i10, 0), this.f33129F);
        if (min > 0) {
            C11172r0.m34883N0(this.f33142v, 0, min);
            this.f33129F -= min;
        }
    }

    /* renamed from: B */
    private void m39907B(int i10) {
        C11137a.m34605g(!this.f33140t.m32980j());
        int size = this.f33142v.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!m39910F(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = m39909E().f33120h;
        AbstractC12335a m39908C = m39908C(i10);
        if (this.f33142v.isEmpty()) {
            this.f33127D = this.f33128E;
        }
        this.f33131H = false;
        this.f33138r.m36884D(this.f33132a, m39908C.f33119g, j10);
    }

    /* renamed from: C */
    private AbstractC12335a m39908C(int i10) {
        AbstractC12335a abstractC12335a = this.f33142v.get(i10);
        ArrayList<AbstractC12335a> arrayList = this.f33142v;
        C11172r0.m34883N0(arrayList, i10, arrayList.size());
        this.f33129F = Math.max(this.f33129F, this.f33142v.size());
        C11732u0 c11732u0 = this.f33144x;
        int i11 = 0;
        while (true) {
            c11732u0.m37074u(abstractC12335a.m39883i(i11));
            C11732u0[] c11732u0Arr = this.f33145y;
            if (i11 >= c11732u0Arr.length) {
                return abstractC12335a;
            }
            c11732u0 = c11732u0Arr[i11];
            i11++;
        }
    }

    /* renamed from: E */
    private AbstractC12335a m39909E() {
        return this.f33142v.get(r0.size() - 1);
    }

    /* renamed from: F */
    private boolean m39910F(int i10) {
        int m37048C;
        AbstractC12335a abstractC12335a = this.f33142v.get(i10);
        if (this.f33144x.m37048C() > abstractC12335a.m39883i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            C11732u0[] c11732u0Arr = this.f33145y;
            if (i11 >= c11732u0Arr.length) {
                return false;
            }
            m37048C = c11732u0Arr[i11].m37048C();
            i11++;
        } while (m37048C <= abstractC12335a.m39883i(i11));
        return true;
    }

    /* renamed from: G */
    private boolean m39911G(AbstractC12340f abstractC12340f) {
        return abstractC12340f instanceof AbstractC12335a;
    }

    /* renamed from: I */
    private void m39912I() {
        int m39914N = m39914N(this.f33144x.m37048C(), this.f33129F - 1);
        while (true) {
            int i10 = this.f33129F;
            if (i10 > m39914N) {
                return;
            }
            this.f33129F = i10 + 1;
            m39913J(i10);
        }
    }

    /* renamed from: J */
    private void m39913J(int i10) {
        AbstractC12335a abstractC12335a = this.f33142v.get(i10);
        C11108u1 c11108u1 = abstractC12335a.f33116d;
        if (!c11108u1.equals(this.f33125B)) {
            this.f33138r.m36888i(this.f33132a, c11108u1, abstractC12335a.f33117e, abstractC12335a.f33118f, abstractC12335a.f33119g);
        }
        this.f33125B = c11108u1;
    }

    /* renamed from: N */
    private int m39914N(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f33142v.size()) {
                return this.f33142v.size() - 1;
            }
        } while (this.f33142v.get(i11).m39883i(0) <= i10);
        return i11 - 1;
    }

    /* renamed from: Q */
    private void m39915Q() {
        this.f33144x.m37060V();
        for (C11732u0 c11732u0 : this.f33145y) {
            c11732u0.m37060V();
        }
    }

    /* renamed from: D */
    public T m39922D() {
        return this.f33136e;
    }

    /* renamed from: H */
    boolean m39923H() {
        return this.f33127D != -9223372036854775807L;
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo313i(AbstractC12340f abstractC12340f, long j10, long j11, boolean z10) {
        this.f33124A = null;
        this.f33130G = null;
        C11731u c11731u = new C11731u(abstractC12340f.f33113a, abstractC12340f.f33114b, abstractC12340f.m39904f(), abstractC12340f.m39903e(), j10, j11, abstractC12340f.m39901a());
        this.f33139s.m32954c(abstractC12340f.f33113a);
        this.f33138r.m36891r(c11731u, abstractC12340f.f33115c, this.f33132a, abstractC12340f.f33116d, abstractC12340f.f33117e, abstractC12340f.f33118f, abstractC12340f.f33119g, abstractC12340f.f33120h);
        if (z10) {
            return;
        }
        if (m39923H()) {
            m39915Q();
        } else if (m39911G(abstractC12340f)) {
            m39908C(this.f33142v.size() - 1);
            if (this.f33142v.isEmpty()) {
                this.f33127D = this.f33128E;
            }
        }
        this.f33137f.mo258a(this);
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo317m(AbstractC12340f abstractC12340f, long j10, long j11) {
        this.f33124A = null;
        this.f33136e.mo11914i(abstractC12340f);
        C11731u c11731u = new C11731u(abstractC12340f.f33113a, abstractC12340f.f33114b, abstractC12340f.m39904f(), abstractC12340f.m39903e(), j10, j11, abstractC12340f.m39901a());
        this.f33139s.m32954c(abstractC12340f.f33113a);
        this.f33138r.m36894u(c11731u, abstractC12340f.f33115c, this.f33132a, abstractC12340f.f33116d, abstractC12340f.f33117e, abstractC12340f.f33118f, abstractC12340f.f33119g, abstractC12340f.f33120h);
        this.f33137f.mo258a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    @Override // p351s8.C10818e0.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p351s8.C10818e0.c mo311h(p437x7.AbstractC12340f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p437x7.C12343i.mo311h(x7.f, long, long, java.io.IOException, int):s8.e0$c");
    }

    /* renamed from: O */
    public void m39927O() {
        m39928P(null);
    }

    /* renamed from: P */
    public void m39928P(b<T> bVar) {
        this.f33126C = bVar;
        this.f33144x.m37057R();
        for (C11732u0 c11732u0 : this.f33145y) {
            c11732u0.m37057R();
        }
        this.f33140t.m32983m(this);
    }

    /* renamed from: R */
    public void m39929R(long j10) {
        AbstractC12335a abstractC12335a;
        this.f33128E = j10;
        if (m39923H()) {
            this.f33127D = j10;
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f33142v.size(); i11++) {
            abstractC12335a = this.f33142v.get(i11);
            long j11 = abstractC12335a.f33119g;
            if (j11 == j10 && abstractC12335a.f33086k == -9223372036854775807L) {
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        abstractC12335a = null;
        if (abstractC12335a != null ? this.f33144x.m37062Y(abstractC12335a.m39883i(0)) : this.f33144x.m37063Z(j10, j10 < mo245b())) {
            this.f33129F = m39914N(this.f33144x.m37048C(), 0);
            C11732u0[] c11732u0Arr = this.f33145y;
            int length = c11732u0Arr.length;
            while (i10 < length) {
                c11732u0Arr[i10].m37063Z(j10, true);
                i10++;
            }
            return;
        }
        this.f33127D = j10;
        this.f33131H = false;
        this.f33142v.clear();
        this.f33129F = 0;
        if (!this.f33140t.m32980j()) {
            this.f33140t.m32978g();
            m39915Q();
            return;
        }
        this.f33144x.m37072r();
        C11732u0[] c11732u0Arr2 = this.f33145y;
        int length2 = c11732u0Arr2.length;
        while (i10 < length2) {
            c11732u0Arr2[i10].m37072r();
            i10++;
        }
        this.f33140t.m32977f();
    }

    /* renamed from: S */
    public C12343i<T>.a m39930S(long j10, int i10) {
        for (int i11 = 0; i11 < this.f33145y.length; i11++) {
            if (this.f33133b[i11] == i10) {
                C11137a.m34605g(!this.f33135d[i11]);
                this.f33135d[i11] = true;
                this.f33145y[i11].m37063Z(j10, true);
                return new a(this, this.f33145y[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: a */
    public void mo262a() {
        this.f33140t.mo11869a();
        this.f33144x.m37055N();
        if (this.f33140t.m32980j()) {
            return;
        }
        this.f33136e.mo11909a();
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        if (m39923H()) {
            return this.f33127D;
        }
        if (this.f33131H) {
            return Long.MIN_VALUE;
        }
        return m39909E().f33120h;
    }

    /* renamed from: c */
    public long m39931c(long j10, C11110u3 c11110u3) {
        return this.f33136e.mo11910c(j10, c11110u3);
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: d */
    public boolean mo264d() {
        return !m39923H() && this.f33144x.m37054K(this.f33131H);
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        List<AbstractC12335a> list;
        long j11;
        if (this.f33131H || this.f33140t.m32980j() || this.f33140t.m32979i()) {
            return false;
        }
        boolean m39923H = m39923H();
        if (m39923H) {
            list = Collections.emptyList();
            j11 = this.f33127D;
        } else {
            list = this.f33143w;
            j11 = m39909E().f33120h;
        }
        this.f33136e.mo11915j(j10, j11, list, this.f33141u);
        C12342h c12342h = this.f33141u;
        boolean z10 = c12342h.f33123b;
        AbstractC12340f abstractC12340f = c12342h.f33122a;
        c12342h.m39905a();
        if (z10) {
            this.f33127D = -9223372036854775807L;
            this.f33131H = true;
            return true;
        }
        if (abstractC12340f == null) {
            return false;
        }
        this.f33124A = abstractC12340f;
        if (m39911G(abstractC12340f)) {
            AbstractC12335a abstractC12335a = (AbstractC12335a) abstractC12340f;
            if (m39923H) {
                long j12 = abstractC12335a.f33119g;
                long j13 = this.f33127D;
                if (j12 != j13) {
                    this.f33144x.m37065b0(j13);
                    for (C11732u0 c11732u0 : this.f33145y) {
                        c11732u0.m37065b0(this.f33127D);
                    }
                }
                this.f33127D = -9223372036854775807L;
            }
            abstractC12335a.m39885k(this.f33146z);
            this.f33142v.add(abstractC12335a);
        } else if (abstractC12340f instanceof C12347m) {
            ((C12347m) abstractC12340f).m39939g(this.f33146z);
        }
        this.f33138r.m36881A(new C11731u(abstractC12340f.f33113a, abstractC12340f.f33114b, this.f33140t.m32984n(abstractC12340f, this, this.f33139s.mo32952a(abstractC12340f.f33115c))), abstractC12340f.f33115c, this.f33132a, abstractC12340f.f33116d, abstractC12340f.f33117e, abstractC12340f.f33118f, abstractC12340f.f33119g, abstractC12340f.f33120h);
        return true;
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        if (this.f33131H) {
            return Long.MIN_VALUE;
        }
        if (m39923H()) {
            return this.f33127D;
        }
        long j10 = this.f33128E;
        AbstractC12335a m39909E = m39909E();
        if (!m39909E.mo225h()) {
            if (this.f33142v.size() > 1) {
                m39909E = this.f33142v.get(r2.size() - 2);
            } else {
                m39909E = null;
            }
        }
        if (m39909E != null) {
            j10 = Math.max(j10, m39909E.f33120h);
        }
        return Math.max(j10, this.f33144x.m37077z());
    }

    @Override // p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
        if (this.f33140t.m32979i() || m39923H()) {
            return;
        }
        if (!this.f33140t.m32980j()) {
            int mo11913h = this.f33136e.mo11913h(j10, this.f33143w);
            if (mo11913h < this.f33142v.size()) {
                m39907B(mo11913h);
                return;
            }
            return;
        }
        AbstractC12340f abstractC12340f = (AbstractC12340f) C11137a.m34603e(this.f33124A);
        if (!(m39911G(abstractC12340f) && m39910F(this.f33142v.size() - 1)) && this.f33136e.mo11911d(j10, abstractC12340f, this.f33143w)) {
            this.f33140t.m32977f();
            if (m39911G(abstractC12340f)) {
                this.f33130G = (AbstractC12335a) abstractC12340f;
            }
        }
    }

    @Override // p397v7.InterfaceC11736w0
    public boolean isLoading() {
        return this.f33140t.m32980j();
    }

    @Override // p351s8.C10818e0.f
    /* renamed from: n */
    public void mo319n() {
        this.f33144x.m37059T();
        for (C11732u0 c11732u0 : this.f33145y) {
            c11732u0.m37059T();
        }
        this.f33136e.release();
        b<T> bVar = this.f33126C;
        if (bVar != null) {
            bVar.mo11898d(this);
        }
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: p */
    public int mo266p(long j10) {
        if (m39923H()) {
            return 0;
        }
        int m37049E = this.f33144x.m37049E(j10, this.f33131H);
        AbstractC12335a abstractC12335a = this.f33130G;
        if (abstractC12335a != null) {
            m37049E = Math.min(m37049E, abstractC12335a.m39883i(0) - this.f33144x.m37048C());
        }
        this.f33144x.m37067e0(m37049E);
        m39912I();
        return m37049E;
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: q */
    public int mo267q(C11113v1 c11113v1, C12082g c12082g, int i10) {
        if (m39923H()) {
            return -3;
        }
        AbstractC12335a abstractC12335a = this.f33130G;
        if (abstractC12335a != null && abstractC12335a.m39883i(0) <= this.f33144x.m37048C()) {
            return -3;
        }
        m39912I();
        return this.f33144x.m37058S(c11113v1, c12082g, i10, this.f33131H);
    }

    /* renamed from: s */
    public void m39932s(long j10, boolean z10) {
        if (m39923H()) {
            return;
        }
        int m37075x = this.f33144x.m37075x();
        this.f33144x.m37071q(j10, z10, true);
        int m37075x2 = this.f33144x.m37075x();
        if (m37075x2 > m37075x) {
            long m37076y = this.f33144x.m37076y();
            int i10 = 0;
            while (true) {
                C11732u0[] c11732u0Arr = this.f33145y;
                if (i10 >= c11732u0Arr.length) {
                    break;
                }
                c11732u0Arr[i10].m37071q(m37076y, z10, this.f33135d[i10]);
                i10++;
            }
        }
        m39906A(m37075x2);
    }
}
