package p397v7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p307q8.InterfaceC10312r;
import p351s8.C10818e0;
import p351s8.C10832l0;
import p351s8.C10833m;
import p351s8.C10835n;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10827j;
import p351s8.InterfaceC10834m0;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p361t6.C11113v1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11178w;
import p397v7.InterfaceC11705h0;
import p397v7.InterfaceC11739y;
import p414w6.C12082g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v7.z0 */
/* loaded from: classes.dex */
public final class C11742z0 implements InterfaceC11739y, C10818e0.b<c> {

    /* renamed from: a */
    private final C10835n f30979a;

    /* renamed from: b */
    private final InterfaceC10827j.a f30980b;

    /* renamed from: c */
    private final InterfaceC10834m0 f30981c;

    /* renamed from: d */
    private final InterfaceC10816d0 f30982d;

    /* renamed from: e */
    private final InterfaceC11705h0.a f30983e;

    /* renamed from: f */
    private final C11700f1 f30984f;

    /* renamed from: s */
    private final long f30986s;

    /* renamed from: u */
    final C11108u1 f30988u;

    /* renamed from: v */
    final boolean f30989v;

    /* renamed from: w */
    boolean f30990w;

    /* renamed from: x */
    byte[] f30991x;

    /* renamed from: y */
    int f30992y;

    /* renamed from: r */
    private final ArrayList<b> f30985r = new ArrayList<>();

    /* renamed from: t */
    final C10818e0 f30987t = new C10818e0("SingleSampleMediaPeriod");

    /* renamed from: v7.z0$b */
    /* loaded from: classes.dex */
    private final class b implements InterfaceC11734v0 {

        /* renamed from: a */
        private int f30993a;

        /* renamed from: b */
        private boolean f30994b;

        private b() {
        }

        /* renamed from: b */
        private void m37112b() {
            if (this.f30994b) {
                return;
            }
            C11742z0.this.f30983e.m36888i(C11178w.m35003k(C11742z0.this.f30988u.f28797w), C11742z0.this.f30988u, 0, null, 0L);
            this.f30994b = true;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: a */
        public void mo262a() {
            C11742z0 c11742z0 = C11742z0.this;
            if (c11742z0.f30989v) {
                return;
            }
            c11742z0.f30987t.mo11869a();
        }

        /* renamed from: c */
        public void m37113c() {
            if (this.f30993a == 2) {
                this.f30993a = 1;
            }
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: d */
        public boolean mo264d() {
            return C11742z0.this.f30990w;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: p */
        public int mo266p(long j10) {
            m37112b();
            if (j10 <= 0 || this.f30993a == 2) {
                return 0;
            }
            this.f30993a = 2;
            return 1;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: q */
        public int mo267q(C11113v1 c11113v1, C12082g c12082g, int i10) {
            m37112b();
            C11742z0 c11742z0 = C11742z0.this;
            boolean z10 = c11742z0.f30990w;
            if (z10 && c11742z0.f30991x == null) {
                this.f30993a = 2;
            }
            int i11 = this.f30993a;
            if (i11 == 2) {
                c12082g.m38789m(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                c11113v1.f28853b = c11742z0.f30988u;
                this.f30993a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            C11137a.m34603e(c11742z0.f30991x);
            c12082g.m38789m(1);
            c12082g.f32144e = 0L;
            if ((i10 & 4) == 0) {
                c12082g.m38811y(C11742z0.this.f30992y);
                ByteBuffer byteBuffer = c12082g.f32142c;
                C11742z0 c11742z02 = C11742z0.this;
                byteBuffer.put(c11742z02.f30991x, 0, c11742z02.f30992y);
            }
            if ((i10 & 1) == 0) {
                this.f30993a = 2;
            }
            return -4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v7.z0$c */
    /* loaded from: classes.dex */
    public static final class c implements C10818e0.e {

        /* renamed from: a */
        public final long f30996a = C11731u.m37025a();

        /* renamed from: b */
        public final C10835n f30997b;

        /* renamed from: c */
        private final C10832l0 f30998c;

        /* renamed from: d */
        private byte[] f30999d;

        public c(C10835n c10835n, InterfaceC10827j interfaceC10827j) {
            this.f30997b = c10835n;
            this.f30998c = new C10832l0(interfaceC10827j);
        }

        @Override // p351s8.C10818e0.e
        /* renamed from: b */
        public void mo223b() {
            this.f30998c.m33018t();
            try {
                this.f30998c.mo162o(this.f30997b);
                int i10 = 0;
                while (i10 != -1) {
                    int m33015h = (int) this.f30998c.m33015h();
                    byte[] bArr = this.f30999d;
                    if (bArr == null) {
                        this.f30999d = new byte[RecognitionOptions.UPC_E];
                    } else if (m33015h == bArr.length) {
                        this.f30999d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    C10832l0 c10832l0 = this.f30998c;
                    byte[] bArr2 = this.f30999d;
                    i10 = c10832l0.read(bArr2, m33015h, bArr2.length - m33015h);
                }
            } finally {
                C10833m.m33019a(this.f30998c);
            }
        }

        @Override // p351s8.C10818e0.e
        /* renamed from: c */
        public void mo224c() {
        }
    }

    public C11742z0(C10835n c10835n, InterfaceC10827j.a aVar, InterfaceC10834m0 interfaceC10834m0, C11108u1 c11108u1, long j10, InterfaceC10816d0 interfaceC10816d0, InterfaceC11705h0.a aVar2, boolean z10) {
        this.f30979a = c10835n;
        this.f30980b = aVar;
        this.f30981c = interfaceC10834m0;
        this.f30988u = c11108u1;
        this.f30986s = j10;
        this.f30982d = interfaceC10816d0;
        this.f30983e = aVar2;
        this.f30989v = z10;
        this.f30984f = new C11700f1(new C11694d1(c11108u1));
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        return (this.f30990w || this.f30987t.m32980j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: c */
    public long mo246c(long j10, C11110u3 c11110u3) {
        return j10;
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo313i(c cVar, long j10, long j11, boolean z10) {
        C10832l0 c10832l0 = cVar.f30998c;
        C11731u c11731u = new C11731u(cVar.f30996a, cVar.f30997b, c10832l0.m33016r(), c10832l0.m33017s(), j10, j11, c10832l0.m33015h());
        this.f30982d.m32954c(cVar.f30996a);
        this.f30983e.m36891r(c11731u, 1, -1, null, 0, null, 0L, this.f30986s);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        if (this.f30990w || this.f30987t.m32980j() || this.f30987t.m32979i()) {
            return false;
        }
        InterfaceC10827j mo33002a = this.f30980b.mo33002a();
        InterfaceC10834m0 interfaceC10834m0 = this.f30981c;
        if (interfaceC10834m0 != null) {
            mo33002a.mo161l(interfaceC10834m0);
        }
        c cVar = new c(this.f30979a, mo33002a);
        this.f30983e.m36881A(new C11731u(cVar.f30996a, this.f30979a, this.f30987t.m32984n(cVar, this, this.f30982d.mo32952a(1))), 1, -1, this.f30988u, 0, null, 0L, this.f30986s);
        return true;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        return this.f30990w ? Long.MIN_VALUE : 0L;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    public boolean isLoading() {
        return this.f30987t.m32980j();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: j */
    public long mo251j(long j10) {
        for (int i10 = 0; i10 < this.f30985r.size(); i10++) {
            this.f30985r.get(i10).m37113c();
        }
        return j10;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: k */
    public void mo252k(InterfaceC11739y.a aVar, long j10) {
        aVar.mo34427h(this);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: l */
    public long mo253l() {
        return -9223372036854775807L;
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo317m(c cVar, long j10, long j11) {
        this.f30992y = (int) cVar.f30998c.m33015h();
        this.f30991x = (byte[]) C11137a.m34603e(cVar.f30999d);
        this.f30990w = true;
        C10832l0 c10832l0 = cVar.f30998c;
        C11731u c11731u = new C11731u(cVar.f30996a, cVar.f30997b, c10832l0.m33016r(), c10832l0.m33017s(), j10, j11, this.f30992y);
        this.f30982d.m32954c(cVar.f30996a);
        this.f30983e.m36894u(c11731u, 1, -1, this.f30988u, 0, null, 0L, this.f30986s);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: o */
    public void mo254o() {
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C10818e0.c mo311h(c cVar, long j10, long j11, IOException iOException, int i10) {
        C10818e0.c m32976h;
        C10832l0 c10832l0 = cVar.f30998c;
        C11731u c11731u = new C11731u(cVar.f30996a, cVar.f30997b, c10832l0.m33016r(), c10832l0.m33017s(), j10, j11, c10832l0.m33015h());
        long mo32955d = this.f30982d.mo32955d(new InterfaceC10816d0.c(c11731u, new C11737x(1, -1, this.f30988u, 0, null, 0L, C11172r0.m34910a1(this.f30986s)), iOException, i10));
        boolean z10 = mo32955d == -9223372036854775807L || i10 >= this.f30982d.mo32952a(1);
        if (this.f30989v && z10) {
            C11173s.m34971j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f30990w = true;
            m32976h = C10818e0.f27339f;
        } else {
            m32976h = mo32955d != -9223372036854775807L ? C10818e0.m32976h(false, mo32955d) : C10818e0.f27340g;
        }
        C10818e0.c cVar2 = m32976h;
        boolean z11 = !cVar2.m32987c();
        this.f30983e.m36896w(c11731u, 1, -1, this.f30988u, 0, null, 0L, this.f30986s, iOException, z11);
        if (z11) {
            this.f30982d.m32954c(cVar.f30996a);
        }
        return cVar2;
    }

    /* renamed from: q */
    public void m37111q() {
        this.f30987t.m32982l();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: r */
    public C11700f1 mo255r() {
        return this.f30984f;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: s */
    public void mo256s(long j10, boolean z10) {
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: t */
    public long mo257t(InterfaceC10312r[] interfaceC10312rArr, boolean[] zArr, InterfaceC11734v0[] interfaceC11734v0Arr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < interfaceC10312rArr.length; i10++) {
            InterfaceC11734v0 interfaceC11734v0 = interfaceC11734v0Arr[i10];
            if (interfaceC11734v0 != null && (interfaceC10312rArr[i10] == null || !zArr[i10])) {
                this.f30985r.remove(interfaceC11734v0);
                interfaceC11734v0Arr[i10] = null;
            }
            if (interfaceC11734v0Arr[i10] == null && interfaceC10312rArr[i10] != null) {
                b bVar = new b();
                this.f30985r.add(bVar);
                interfaceC11734v0Arr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }
}
