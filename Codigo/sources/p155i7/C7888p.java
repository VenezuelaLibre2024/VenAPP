package p155i7;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11145e;
import p363t8.C11146e0;
import p363t8.C11148f0;
import p363t8.C11172r0;
import p363t8.C11179x;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.p */
/* loaded from: classes.dex */
public final class C7888p implements InterfaceC7885m {

    /* renamed from: a */
    private final C7869d0 f19060a;

    /* renamed from: b */
    private final boolean f19061b;

    /* renamed from: c */
    private final boolean f19062c;

    /* renamed from: g */
    private long f19066g;

    /* renamed from: i */
    private String f19068i;

    /* renamed from: j */
    private InterfaceC12609b0 f19069j;

    /* renamed from: k */
    private b f19070k;

    /* renamed from: l */
    private boolean f19071l;

    /* renamed from: n */
    private boolean f19073n;

    /* renamed from: h */
    private final boolean[] f19067h = new boolean[3];

    /* renamed from: d */
    private final C7893u f19063d = new C7893u(7, RecognitionOptions.ITF);

    /* renamed from: e */
    private final C7893u f19064e = new C7893u(8, RecognitionOptions.ITF);

    /* renamed from: f */
    private final C7893u f19065f = new C7893u(6, RecognitionOptions.ITF);

    /* renamed from: m */
    private long f19072m = -9223372036854775807L;

    /* renamed from: o */
    private final C11146e0 f19074o = new C11146e0();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i7.p$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final InterfaceC12609b0 f19075a;

        /* renamed from: b */
        private final boolean f19076b;

        /* renamed from: c */
        private final boolean f19077c;

        /* renamed from: d */
        private final SparseArray<C11179x.c> f19078d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<C11179x.b> f19079e = new SparseArray<>();

        /* renamed from: f */
        private final C11148f0 f19080f;

        /* renamed from: g */
        private byte[] f19081g;

        /* renamed from: h */
        private int f19082h;

        /* renamed from: i */
        private int f19083i;

        /* renamed from: j */
        private long f19084j;

        /* renamed from: k */
        private boolean f19085k;

        /* renamed from: l */
        private long f19086l;

        /* renamed from: m */
        private a f19087m;

        /* renamed from: n */
        private a f19088n;

        /* renamed from: o */
        private boolean f19089o;

        /* renamed from: p */
        private long f19090p;

        /* renamed from: q */
        private long f19091q;

        /* renamed from: r */
        private boolean f19092r;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i7.p$b$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private boolean f19093a;

            /* renamed from: b */
            private boolean f19094b;

            /* renamed from: c */
            private C11179x.c f19095c;

            /* renamed from: d */
            private int f19096d;

            /* renamed from: e */
            private int f19097e;

            /* renamed from: f */
            private int f19098f;

            /* renamed from: g */
            private int f19099g;

            /* renamed from: h */
            private boolean f19100h;

            /* renamed from: i */
            private boolean f19101i;

            /* renamed from: j */
            private boolean f19102j;

            /* renamed from: k */
            private boolean f19103k;

            /* renamed from: l */
            private int f19104l;

            /* renamed from: m */
            private int f19105m;

            /* renamed from: n */
            private int f19106n;

            /* renamed from: o */
            private int f19107o;

            /* renamed from: p */
            private int f19108p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public boolean m24305c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f19093a) {
                    return false;
                }
                if (!aVar.f19093a) {
                    return true;
                }
                C11179x.c cVar = (C11179x.c) C11137a.m34607i(this.f19095c);
                C11179x.c cVar2 = (C11179x.c) C11137a.m34607i(aVar.f19095c);
                return (this.f19098f == aVar.f19098f && this.f19099g == aVar.f19099g && this.f19100h == aVar.f19100h && (!this.f19101i || !aVar.f19101i || this.f19102j == aVar.f19102j) && (((i10 = this.f19096d) == (i11 = aVar.f19096d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f29100l) != 0 || cVar2.f29100l != 0 || (this.f19105m == aVar.f19105m && this.f19106n == aVar.f19106n)) && ((i12 != 1 || cVar2.f29100l != 1 || (this.f19107o == aVar.f19107o && this.f19108p == aVar.f19108p)) && (z10 = this.f19103k) == aVar.f19103k && (!z10 || this.f19104l == aVar.f19104l))))) ? false : true;
            }

            /* renamed from: b */
            public void m24306b() {
                this.f19094b = false;
                this.f19093a = false;
            }

            /* renamed from: d */
            public boolean m24307d() {
                int i10;
                return this.f19094b && ((i10 = this.f19097e) == 7 || i10 == 2);
            }

            /* renamed from: e */
            public void m24308e(C11179x.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f19095c = cVar;
                this.f19096d = i10;
                this.f19097e = i11;
                this.f19098f = i12;
                this.f19099g = i13;
                this.f19100h = z10;
                this.f19101i = z11;
                this.f19102j = z12;
                this.f19103k = z13;
                this.f19104l = i14;
                this.f19105m = i15;
                this.f19106n = i16;
                this.f19107o = i17;
                this.f19108p = i18;
                this.f19093a = true;
                this.f19094b = true;
            }

            /* renamed from: f */
            public void m24309f(int i10) {
                this.f19097e = i10;
                this.f19094b = true;
            }
        }

        public b(InterfaceC12609b0 interfaceC12609b0, boolean z10, boolean z11) {
            this.f19075a = interfaceC12609b0;
            this.f19076b = z10;
            this.f19077c = z11;
            this.f19087m = new a();
            this.f19088n = new a();
            byte[] bArr = new byte[RecognitionOptions.ITF];
            this.f19081g = bArr;
            this.f19080f = new C11148f0(bArr, 0, 0);
            m24302g();
        }

        /* renamed from: d */
        private void m24296d(int i10) {
            long j10 = this.f19091q;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f19092r;
            this.f19075a.mo331b(j10, z10 ? 1 : 0, (int) (this.f19084j - this.f19090p), i10, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m24297a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p155i7.C7888p.b.m24297a(byte[], int, int):void");
        }

        /* renamed from: b */
        public boolean m24298b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f19083i == 9 || (this.f19077c && this.f19088n.m24305c(this.f19087m))) {
                if (z10 && this.f19089o) {
                    m24296d(i10 + ((int) (j10 - this.f19084j)));
                }
                this.f19090p = this.f19084j;
                this.f19091q = this.f19086l;
                this.f19092r = false;
                this.f19089o = true;
            }
            if (this.f19076b) {
                z11 = this.f19088n.m24307d();
            }
            boolean z13 = this.f19092r;
            int i11 = this.f19083i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f19092r = z14;
            return z14;
        }

        /* renamed from: c */
        public boolean m24299c() {
            return this.f19077c;
        }

        /* renamed from: e */
        public void m24300e(C11179x.b bVar) {
            this.f19079e.append(bVar.f29086a, bVar);
        }

        /* renamed from: f */
        public void m24301f(C11179x.c cVar) {
            this.f19078d.append(cVar.f29092d, cVar);
        }

        /* renamed from: g */
        public void m24302g() {
            this.f19085k = false;
            this.f19089o = false;
            this.f19088n.m24306b();
        }

        /* renamed from: h */
        public void m24303h(long j10, int i10, long j11) {
            this.f19083i = i10;
            this.f19086l = j11;
            this.f19084j = j10;
            if (!this.f19076b || i10 != 1) {
                if (!this.f19077c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f19087m;
            this.f19087m = this.f19088n;
            this.f19088n = aVar;
            aVar.m24306b();
            this.f19082h = 0;
            this.f19085k = true;
        }
    }

    public C7888p(C7869d0 c7869d0, boolean z10, boolean z11) {
        this.f19060a = c7869d0;
        this.f19061b = z10;
        this.f19062c = z11;
    }

    /* renamed from: a */
    private void m24292a() {
        C11137a.m34607i(this.f19069j);
        C11172r0.m34928j(this.f19070k);
    }

    /* renamed from: g */
    private void m24293g(long j10, int i10, int i11, long j11) {
        C7893u c7893u;
        if (!this.f19071l || this.f19070k.m24299c()) {
            this.f19063d.m24334b(i11);
            this.f19064e.m24334b(i11);
            if (this.f19071l) {
                if (this.f19063d.m24335c()) {
                    C7893u c7893u2 = this.f19063d;
                    this.f19070k.m24301f(C11179x.m35025l(c7893u2.f19178d, 3, c7893u2.f19179e));
                    c7893u = this.f19063d;
                } else if (this.f19064e.m24335c()) {
                    C7893u c7893u3 = this.f19064e;
                    this.f19070k.m24300e(C11179x.m35023j(c7893u3.f19178d, 3, c7893u3.f19179e));
                    c7893u = this.f19064e;
                }
            } else if (this.f19063d.m24335c() && this.f19064e.m24335c()) {
                ArrayList arrayList = new ArrayList();
                C7893u c7893u4 = this.f19063d;
                arrayList.add(Arrays.copyOf(c7893u4.f19178d, c7893u4.f19179e));
                C7893u c7893u5 = this.f19064e;
                arrayList.add(Arrays.copyOf(c7893u5.f19178d, c7893u5.f19179e));
                C7893u c7893u6 = this.f19063d;
                C11179x.c m35025l = C11179x.m35025l(c7893u6.f19178d, 3, c7893u6.f19179e);
                C7893u c7893u7 = this.f19064e;
                C11179x.b m35023j = C11179x.m35023j(c7893u7.f19178d, 3, c7893u7.f19179e);
                this.f19069j.mo332c(new C11108u1.b().m34540U(this.f19068i).m34552g0("video/avc").m34530K(C11145e.m34644a(m35025l.f29089a, m35025l.f29090b, m35025l.f29091c)).m34559n0(m35025l.f29094f).m34538S(m35025l.f29095g).m34548c0(m35025l.f29096h).m34541V(arrayList).m34526G());
                this.f19071l = true;
                this.f19070k.m24301f(m35025l);
                this.f19070k.m24300e(m35023j);
                this.f19063d.m24336d();
                c7893u = this.f19064e;
            }
            c7893u.m24336d();
        }
        if (this.f19065f.m24334b(i11)) {
            C7893u c7893u8 = this.f19065f;
            this.f19074o.m34675S(this.f19065f.f19178d, C11179x.m35030q(c7893u8.f19178d, c7893u8.f19179e));
            this.f19074o.m34677U(4);
            this.f19060a.m24194a(j11, this.f19074o);
        }
        if (this.f19070k.m24298b(j10, i10, this.f19071l, this.f19073n)) {
            this.f19073n = false;
        }
    }

    /* renamed from: h */
    private void m24294h(byte[] bArr, int i10, int i11) {
        if (!this.f19071l || this.f19070k.m24299c()) {
            this.f19063d.m24333a(bArr, i10, i11);
            this.f19064e.m24333a(bArr, i10, i11);
        }
        this.f19065f.m24333a(bArr, i10, i11);
        this.f19070k.m24297a(bArr, i10, i11);
    }

    /* renamed from: i */
    private void m24295i(long j10, int i10, long j11) {
        if (!this.f19071l || this.f19070k.m24299c()) {
            this.f19063d.m24337e(i10);
            this.f19064e.m24337e(i10);
        }
        this.f19065f.m24337e(i10);
        this.f19070k.m24303h(j10, i10, j11);
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        m24292a();
        int m34683f = c11146e0.m34683f();
        int m34684g = c11146e0.m34684g();
        byte[] m34682e = c11146e0.m34682e();
        this.f19066g += c11146e0.m34679a();
        this.f19069j.m41511a(c11146e0, c11146e0.m34679a());
        while (true) {
            int m35016c = C11179x.m35016c(m34682e, m34683f, m34684g, this.f19067h);
            if (m35016c == m34684g) {
                m24294h(m34682e, m34683f, m34684g);
                return;
            }
            int m35019f = C11179x.m35019f(m34682e, m35016c);
            int i10 = m35016c - m34683f;
            if (i10 > 0) {
                m24294h(m34682e, m34683f, m35016c);
            }
            int i11 = m34684g - m35016c;
            long j10 = this.f19066g - i11;
            m24293g(j10, i11, i10 < 0 ? -i10 : 0, this.f19072m);
            m24295i(j10, m35019f, this.f19072m);
            m34683f = m35016c + 3;
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        this.f19066g = 0L;
        this.f19073n = false;
        this.f19072m = -9223372036854775807L;
        C11179x.m35014a(this.f19067h);
        this.f19063d.m24336d();
        this.f19064e.m24336d();
        this.f19065f.m24336d();
        b bVar = this.f19070k;
        if (bVar != null) {
            bVar.m24302g();
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        this.f19068i = dVar.m24264b();
        InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(dVar.m24265c(), 2);
        this.f19069j = mo308d;
        this.f19070k = new b(mo308d, this.f19061b, this.f19062c);
        this.f19060a.m24195b(interfaceC12623m, dVar);
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f19072m = j10;
        }
        this.f19073n |= (i10 & 2) != 0;
    }
}
