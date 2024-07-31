package p397v7;

import java.io.IOException;
import java.util.ArrayList;
import p351s8.InterfaceC10811b;
import p361t6.AbstractC11018d4;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.InterfaceC11684a0;

/* renamed from: v7.e */
/* loaded from: classes.dex */
public final class C11695e extends AbstractC11706h1 {

    /* renamed from: A */
    private final boolean f30663A;

    /* renamed from: B */
    private final boolean f30664B;

    /* renamed from: C */
    private final ArrayList<C11692d> f30665C;

    /* renamed from: D */
    private final AbstractC11018d4.d f30666D;

    /* renamed from: E */
    private a f30667E;

    /* renamed from: F */
    private b f30668F;

    /* renamed from: G */
    private long f30669G;

    /* renamed from: H */
    private long f30670H;

    /* renamed from: x */
    private final long f30671x;

    /* renamed from: y */
    private final long f30672y;

    /* renamed from: z */
    private final boolean f30673z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v7.e$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC11727s {

        /* renamed from: r */
        private final long f30674r;

        /* renamed from: s */
        private final long f30675s;

        /* renamed from: t */
        private final long f30676t;

        /* renamed from: u */
        private final boolean f30677u;

        public a(AbstractC11018d4 abstractC11018d4, long j10, long j11) {
            super(abstractC11018d4);
            boolean z10 = false;
            if (abstractC11018d4.mo11858n() != 1) {
                throw new b(0);
            }
            AbstractC11018d4.d m34004s = abstractC11018d4.m34004s(0, new AbstractC11018d4.d());
            long max = Math.max(0L, j10);
            if (!m34004s.f28266w && max != 0 && !m34004s.f28262s) {
                throw new b(1);
            }
            long max2 = j11 == Long.MIN_VALUE ? m34004s.f28268y : Math.max(0L, j11);
            long j12 = m34004s.f28268y;
            if (j12 != -9223372036854775807L) {
                max2 = max2 > j12 ? j12 : max2;
                if (max > max2) {
                    throw new b(2);
                }
            }
            this.f30674r = max;
            this.f30675s = max2;
            this.f30676t = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (m34004s.f28263t && (max2 == -9223372036854775807L || (j12 != -9223372036854775807L && max2 == j12))) {
                z10 = true;
            }
            this.f30677u = z10;
        }

        @Override // p397v7.AbstractC11727s, p361t6.AbstractC11018d4
        /* renamed from: l */
        public AbstractC11018d4.b mo11857l(int i10, AbstractC11018d4.b bVar, boolean z10) {
            this.f30865f.mo11857l(0, bVar, z10);
            long m34023r = bVar.m34023r() - this.f30674r;
            long j10 = this.f30676t;
            return bVar.m34027v(bVar.f28225a, bVar.f28226b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - m34023r, m34023r);
        }

        @Override // p397v7.AbstractC11727s, p361t6.AbstractC11018d4
        /* renamed from: t */
        public AbstractC11018d4.d mo11860t(int i10, AbstractC11018d4.d dVar, long j10) {
            this.f30865f.mo11860t(0, dVar, 0L);
            long j11 = dVar.f28254B;
            long j12 = this.f30674r;
            dVar.f28254B = j11 + j12;
            dVar.f28268y = this.f30676t;
            dVar.f28263t = this.f30677u;
            long j13 = dVar.f28267x;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                dVar.f28267x = max;
                long j14 = this.f30675s;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                dVar.f28267x = max - this.f30674r;
            }
            long m34910a1 = C11172r0.m34910a1(this.f30674r);
            long j15 = dVar.f28259e;
            if (j15 != -9223372036854775807L) {
                dVar.f28259e = j15 + m34910a1;
            }
            long j16 = dVar.f28260f;
            if (j16 != -9223372036854775807L) {
                dVar.f28260f = j16 + m34910a1;
            }
            return dVar;
        }
    }

    /* renamed from: v7.e$b */
    /* loaded from: classes.dex */
    public static final class b extends IOException {

        /* renamed from: a */
        public final int f30678a;

        public b(int i10) {
            super("Illegal clipping: " + m36853a(i10));
            this.f30678a = i10;
        }

        /* renamed from: a */
        private static String m36853a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public C11695e(InterfaceC11684a0 interfaceC11684a0, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((InterfaceC11684a0) C11137a.m34603e(interfaceC11684a0));
        C11137a.m34599a(j10 >= 0);
        this.f30671x = j10;
        this.f30672y = j11;
        this.f30673z = z10;
        this.f30663A = z11;
        this.f30664B = z12;
        this.f30665C = new ArrayList<>();
        this.f30666D = new AbstractC11018d4.d();
    }

    /* renamed from: W */
    private void m36851W(AbstractC11018d4 abstractC11018d4) {
        long j10;
        long j11;
        abstractC11018d4.m34004s(0, this.f30666D);
        long m34035h = this.f30666D.m34035h();
        if (this.f30667E == null || this.f30665C.isEmpty() || this.f30663A) {
            long j12 = this.f30671x;
            long j13 = this.f30672y;
            if (this.f30664B) {
                long m34033f = this.f30666D.m34033f();
                j12 += m34033f;
                j13 += m34033f;
            }
            this.f30669G = m34035h + j12;
            this.f30670H = this.f30672y != Long.MIN_VALUE ? m34035h + j13 : Long.MIN_VALUE;
            int size = this.f30665C.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f30665C.get(i10).m36840u(this.f30669G, this.f30670H);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f30669G - m34035h;
            j11 = this.f30672y != Long.MIN_VALUE ? this.f30670H - m34035h : Long.MIN_VALUE;
            j10 = j14;
        }
        try {
            a aVar = new a(abstractC11018d4, j10, j11);
            this.f30667E = aVar;
            m36802D(aVar);
        } catch (b e10) {
            this.f30668F = e10;
            for (int i11 = 0; i11 < this.f30665C.size(); i11++) {
                this.f30665C.get(i11).m36839p(this.f30668F);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11701g, p397v7.AbstractC11683a
    /* renamed from: E */
    public void mo11834E() {
        super.mo11834E();
        this.f30668F = null;
        this.f30667E = null;
    }

    @Override // p397v7.AbstractC11706h1
    /* renamed from: T */
    protected void mo36852T(AbstractC11018d4 abstractC11018d4) {
        if (this.f30668F != null) {
            return;
        }
        m36851W(abstractC11018d4);
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: e */
    public InterfaceC11739y mo11843e(InterfaceC11684a0.b bVar, InterfaceC10811b interfaceC10811b, long j10) {
        C11692d c11692d = new C11692d(this.f30718v.mo11843e(bVar, interfaceC10811b, j10), this.f30673z, this.f30669G, this.f30670H);
        this.f30665C.add(c11692d);
        return c11692d;
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: l */
    public void mo11844l(InterfaceC11739y interfaceC11739y) {
        C11137a.m34605g(this.f30665C.remove(interfaceC11739y));
        this.f30718v.mo11844l(((C11692d) interfaceC11739y).f30639a);
        if (!this.f30665C.isEmpty() || this.f30663A) {
            return;
        }
        m36851W(((a) C11137a.m34603e(this.f30667E)).f30865f);
    }

    @Override // p397v7.AbstractC11701g, p397v7.InterfaceC11684a0
    /* renamed from: n */
    public void mo11845n() {
        b bVar = this.f30668F;
        if (bVar != null) {
            throw bVar;
        }
        super.mo11845n();
    }
}
