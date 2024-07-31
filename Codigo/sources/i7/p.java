package i7;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import java.util.ArrayList;
import java.util.Arrays;
import t6.u1;
import t8.r0;
import t8.x;

/* loaded from: classes.dex */
public final class p implements m {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f17399a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17400b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17401c;

    /* renamed from: g, reason: collision with root package name */
    private long f17405g;

    /* renamed from: i, reason: collision with root package name */
    private String f17407i;

    /* renamed from: j, reason: collision with root package name */
    private y6.b0 f17408j;

    /* renamed from: k, reason: collision with root package name */
    private b f17409k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17410l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f17412n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f17406h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final u f17402d = new u(7, RecognitionOptions.ITF);

    /* renamed from: e, reason: collision with root package name */
    private final u f17403e = new u(8, RecognitionOptions.ITF);

    /* renamed from: f, reason: collision with root package name */
    private final u f17404f = new u(6, RecognitionOptions.ITF);

    /* renamed from: m, reason: collision with root package name */
    private long f17411m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final t8.e0 f17413o = new t8.e0();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final y6.b0 f17414a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f17415b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f17416c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<x.c> f17417d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<x.b> f17418e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        private final t8.f0 f17419f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f17420g;

        /* renamed from: h, reason: collision with root package name */
        private int f17421h;

        /* renamed from: i, reason: collision with root package name */
        private int f17422i;

        /* renamed from: j, reason: collision with root package name */
        private long f17423j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f17424k;

        /* renamed from: l, reason: collision with root package name */
        private long f17425l;

        /* renamed from: m, reason: collision with root package name */
        private a f17426m;

        /* renamed from: n, reason: collision with root package name */
        private a f17427n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f17428o;

        /* renamed from: p, reason: collision with root package name */
        private long f17429p;

        /* renamed from: q, reason: collision with root package name */
        private long f17430q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f17431r;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f17432a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f17433b;

            /* renamed from: c, reason: collision with root package name */
            private x.c f17434c;

            /* renamed from: d, reason: collision with root package name */
            private int f17435d;

            /* renamed from: e, reason: collision with root package name */
            private int f17436e;

            /* renamed from: f, reason: collision with root package name */
            private int f17437f;

            /* renamed from: g, reason: collision with root package name */
            private int f17438g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f17439h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f17440i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f17441j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f17442k;

            /* renamed from: l, reason: collision with root package name */
            private int f17443l;

            /* renamed from: m, reason: collision with root package name */
            private int f17444m;

            /* renamed from: n, reason: collision with root package name */
            private int f17445n;

            /* renamed from: o, reason: collision with root package name */
            private int f17446o;

            /* renamed from: p, reason: collision with root package name */
            private int f17447p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f17432a) {
                    return false;
                }
                if (!aVar.f17432a) {
                    return true;
                }
                x.c cVar = (x.c) t8.a.i(this.f17434c);
                x.c cVar2 = (x.c) t8.a.i(aVar.f17434c);
                return (this.f17437f == aVar.f17437f && this.f17438g == aVar.f17438g && this.f17439h == aVar.f17439h && (!this.f17440i || !aVar.f17440i || this.f17441j == aVar.f17441j) && (((i10 = this.f17435d) == (i11 = aVar.f17435d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f26804l) != 0 || cVar2.f26804l != 0 || (this.f17444m == aVar.f17444m && this.f17445n == aVar.f17445n)) && ((i12 != 1 || cVar2.f26804l != 1 || (this.f17446o == aVar.f17446o && this.f17447p == aVar.f17447p)) && (z10 = this.f17442k) == aVar.f17442k && (!z10 || this.f17443l == aVar.f17443l))))) ? false : true;
            }

            public void b() {
                this.f17433b = false;
                this.f17432a = false;
            }

            public boolean d() {
                int i10;
                return this.f17433b && ((i10 = this.f17436e) == 7 || i10 == 2);
            }

            public void e(x.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f17434c = cVar;
                this.f17435d = i10;
                this.f17436e = i11;
                this.f17437f = i12;
                this.f17438g = i13;
                this.f17439h = z10;
                this.f17440i = z11;
                this.f17441j = z12;
                this.f17442k = z13;
                this.f17443l = i14;
                this.f17444m = i15;
                this.f17445n = i16;
                this.f17446o = i17;
                this.f17447p = i18;
                this.f17432a = true;
                this.f17433b = true;
            }

            public void f(int i10) {
                this.f17436e = i10;
                this.f17433b = true;
            }
        }

        public b(y6.b0 b0Var, boolean z10, boolean z11) {
            this.f17414a = b0Var;
            this.f17415b = z10;
            this.f17416c = z11;
            this.f17426m = new a();
            this.f17427n = new a();
            byte[] bArr = new byte[RecognitionOptions.ITF];
            this.f17420g = bArr;
            this.f17419f = new t8.f0(bArr, 0, 0);
            g();
        }

        private void d(int i10) {
            long j10 = this.f17430q;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f17431r;
            this.f17414a.b(j10, z10 ? 1 : 0, (int) (this.f17423j - this.f17429p), i10, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f17422i == 9 || (this.f17416c && this.f17427n.c(this.f17426m))) {
                if (z10 && this.f17428o) {
                    d(i10 + ((int) (j10 - this.f17423j)));
                }
                this.f17429p = this.f17423j;
                this.f17430q = this.f17425l;
                this.f17431r = false;
                this.f17428o = true;
            }
            if (this.f17415b) {
                z11 = this.f17427n.d();
            }
            boolean z13 = this.f17431r;
            int i11 = this.f17422i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f17431r = z14;
            return z14;
        }

        public boolean c() {
            return this.f17416c;
        }

        public void e(x.b bVar) {
            this.f17418e.append(bVar.f26790a, bVar);
        }

        public void f(x.c cVar) {
            this.f17417d.append(cVar.f26796d, cVar);
        }

        public void g() {
            this.f17424k = false;
            this.f17428o = false;
            this.f17427n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f17422i = i10;
            this.f17425l = j11;
            this.f17423j = j10;
            if (!this.f17415b || i10 != 1) {
                if (!this.f17416c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f17426m;
            this.f17426m = this.f17427n;
            this.f17427n = aVar;
            aVar.b();
            this.f17421h = 0;
            this.f17424k = true;
        }
    }

    public p(d0 d0Var, boolean z10, boolean z11) {
        this.f17399a = d0Var;
        this.f17400b = z10;
        this.f17401c = z11;
    }

    private void a() {
        t8.a.i(this.f17408j);
        r0.j(this.f17409k);
    }

    private void g(long j10, int i10, int i11, long j11) {
        u uVar;
        if (!this.f17410l || this.f17409k.c()) {
            this.f17402d.b(i11);
            this.f17403e.b(i11);
            if (this.f17410l) {
                if (this.f17402d.c()) {
                    u uVar2 = this.f17402d;
                    this.f17409k.f(t8.x.l(uVar2.f17517d, 3, uVar2.f17518e));
                    uVar = this.f17402d;
                } else if (this.f17403e.c()) {
                    u uVar3 = this.f17403e;
                    this.f17409k.e(t8.x.j(uVar3.f17517d, 3, uVar3.f17518e));
                    uVar = this.f17403e;
                }
            } else if (this.f17402d.c() && this.f17403e.c()) {
                ArrayList arrayList = new ArrayList();
                u uVar4 = this.f17402d;
                arrayList.add(Arrays.copyOf(uVar4.f17517d, uVar4.f17518e));
                u uVar5 = this.f17403e;
                arrayList.add(Arrays.copyOf(uVar5.f17517d, uVar5.f17518e));
                u uVar6 = this.f17402d;
                x.c l10 = t8.x.l(uVar6.f17517d, 3, uVar6.f17518e);
                u uVar7 = this.f17403e;
                x.b j12 = t8.x.j(uVar7.f17517d, 3, uVar7.f17518e);
                this.f17408j.c(new u1.b().U(this.f17407i).g0("video/avc").K(t8.e.a(l10.f26793a, l10.f26794b, l10.f26795c)).n0(l10.f26798f).S(l10.f26799g).c0(l10.f26800h).V(arrayList).G());
                this.f17410l = true;
                this.f17409k.f(l10);
                this.f17409k.e(j12);
                this.f17402d.d();
                uVar = this.f17403e;
            }
            uVar.d();
        }
        if (this.f17404f.b(i11)) {
            u uVar8 = this.f17404f;
            this.f17413o.S(this.f17404f.f17517d, t8.x.q(uVar8.f17517d, uVar8.f17518e));
            this.f17413o.U(4);
            this.f17399a.a(j11, this.f17413o);
        }
        if (this.f17409k.b(j10, i10, this.f17410l, this.f17412n)) {
            this.f17412n = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f17410l || this.f17409k.c()) {
            this.f17402d.a(bArr, i10, i11);
            this.f17403e.a(bArr, i10, i11);
        }
        this.f17404f.a(bArr, i10, i11);
        this.f17409k.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f17410l || this.f17409k.c()) {
            this.f17402d.e(i10);
            this.f17403e.e(i10);
        }
        this.f17404f.e(i10);
        this.f17409k.h(j10, i10, j11);
    }

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        a();
        int f10 = e0Var.f();
        int g10 = e0Var.g();
        byte[] e10 = e0Var.e();
        this.f17405g += e0Var.a();
        this.f17408j.a(e0Var, e0Var.a());
        while (true) {
            int c10 = t8.x.c(e10, f10, g10, this.f17406h);
            if (c10 == g10) {
                h(e10, f10, g10);
                return;
            }
            int f11 = t8.x.f(e10, c10);
            int i10 = c10 - f10;
            if (i10 > 0) {
                h(e10, f10, c10);
            }
            int i11 = g10 - c10;
            long j10 = this.f17405g - i11;
            g(j10, i11, i10 < 0 ? -i10 : 0, this.f17411m);
            i(j10, f11, this.f17411m);
            f10 = c10 + 3;
        }
    }

    @Override // i7.m
    public void c() {
        this.f17405g = 0L;
        this.f17412n = false;
        this.f17411m = -9223372036854775807L;
        t8.x.a(this.f17406h);
        this.f17402d.d();
        this.f17403e.d();
        this.f17404f.d();
        b bVar = this.f17409k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        this.f17407i = dVar.b();
        y6.b0 d10 = mVar.d(dVar.c(), 2);
        this.f17408j = d10;
        this.f17409k = new b(d10, this.f17400b, this.f17401c);
        this.f17399a.b(mVar, dVar);
    }

    @Override // i7.m
    public void e() {
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17411m = j10;
        }
        this.f17412n |= (i10 & 2) != 0;
    }
}
