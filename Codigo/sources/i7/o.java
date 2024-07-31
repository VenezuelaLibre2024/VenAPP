package i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import java.util.Arrays;
import java.util.Collections;
import t6.u1;
import t8.r0;

/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f17373l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final k0 f17374a;

    /* renamed from: b, reason: collision with root package name */
    private final t8.e0 f17375b;

    /* renamed from: e, reason: collision with root package name */
    private final u f17378e;

    /* renamed from: f, reason: collision with root package name */
    private b f17379f;

    /* renamed from: g, reason: collision with root package name */
    private long f17380g;

    /* renamed from: h, reason: collision with root package name */
    private String f17381h;

    /* renamed from: i, reason: collision with root package name */
    private y6.b0 f17382i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f17383j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f17376c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final a f17377d = new a(RecognitionOptions.ITF);

    /* renamed from: k, reason: collision with root package name */
    private long f17384k = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f17385f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f17386a;

        /* renamed from: b, reason: collision with root package name */
        private int f17387b;

        /* renamed from: c, reason: collision with root package name */
        public int f17388c;

        /* renamed from: d, reason: collision with root package name */
        public int f17389d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f17390e;

        public a(int i10) {
            this.f17390e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f17386a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f17390e;
                int length = bArr2.length;
                int i13 = this.f17388c;
                if (length < i13 + i12) {
                    this.f17390e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f17390e, this.f17388c, i12);
                this.f17388c += i12;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        
            if (r9 != 181) goto L27;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.f17387b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L4b
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L3f
                r7 = 3
                if (r0 == r4) goto L37
                r4 = 4
                if (r0 == r7) goto L2b
                if (r0 != r4) goto L25
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L1d
                if (r9 != r3) goto L53
            L1d:
                int r9 = r8.f17388c
                int r9 = r9 - r10
                r8.f17388c = r9
                r8.f17386a = r1
                return r2
            L25:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L2b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L32
                goto L41
            L32:
                int r9 = r8.f17388c
                r8.f17389d = r9
                goto L48
            L37:
                r10 = 31
                if (r9 <= r10) goto L3c
                goto L41
            L3c:
                r8.f17387b = r7
                goto L53
            L3f:
                if (r9 == r3) goto L48
            L41:
                t8.s.i(r6, r5)
                r8.c()
                goto L53
            L48:
                r8.f17387b = r4
                goto L53
            L4b:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L53
                r8.f17387b = r2
                r8.f17386a = r2
            L53:
                byte[] r9 = i7.o.a.f17385f
                int r10 = r9.length
                r8.a(r9, r1, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.o.a.b(int, int):boolean");
        }

        public void c() {
            this.f17386a = false;
            this.f17388c = 0;
            this.f17387b = 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final y6.b0 f17391a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f17392b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f17393c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f17394d;

        /* renamed from: e, reason: collision with root package name */
        private int f17395e;

        /* renamed from: f, reason: collision with root package name */
        private int f17396f;

        /* renamed from: g, reason: collision with root package name */
        private long f17397g;

        /* renamed from: h, reason: collision with root package name */
        private long f17398h;

        public b(y6.b0 b0Var) {
            this.f17391a = b0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f17393c) {
                int i12 = this.f17396f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f17396f = i12 + (i11 - i10);
                } else {
                    this.f17394d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f17393c = false;
                }
            }
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f17395e == 182 && z10 && this.f17392b) {
                long j11 = this.f17398h;
                if (j11 != -9223372036854775807L) {
                    this.f17391a.b(j11, this.f17394d ? 1 : 0, (int) (j10 - this.f17397g), i10, null);
                }
            }
            if (this.f17395e != 179) {
                this.f17397g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f17395e = i10;
            this.f17394d = false;
            this.f17392b = i10 == 182 || i10 == 179;
            this.f17393c = i10 == 182;
            this.f17396f = 0;
            this.f17398h = j10;
        }

        public void d() {
            this.f17392b = false;
            this.f17393c = false;
            this.f17394d = false;
            this.f17395e = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(k0 k0Var) {
        t8.e0 e0Var;
        this.f17374a = k0Var;
        if (k0Var != null) {
            this.f17378e = new u(178, RecognitionOptions.ITF);
            e0Var = new t8.e0();
        } else {
            e0Var = null;
            this.f17378e = null;
        }
        this.f17375b = e0Var;
    }

    private static u1 a(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f17390e, aVar.f17388c);
        t8.d0 d0Var = new t8.d0(copyOf);
        d0Var.s(i10);
        d0Var.s(4);
        d0Var.q();
        d0Var.r(8);
        if (d0Var.g()) {
            d0Var.r(4);
            d0Var.r(3);
        }
        int h10 = d0Var.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = d0Var.h(8);
            int h12 = d0Var.h(8);
            if (h12 != 0) {
                f10 = h11 / h12;
            }
            t8.s.i("H263Reader", "Invalid aspect ratio");
        } else {
            float[] fArr = f17373l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            }
            t8.s.i("H263Reader", "Invalid aspect ratio");
        }
        if (d0Var.g()) {
            d0Var.r(2);
            d0Var.r(1);
            if (d0Var.g()) {
                d0Var.r(15);
                d0Var.q();
                d0Var.r(15);
                d0Var.q();
                d0Var.r(15);
                d0Var.q();
                d0Var.r(3);
                d0Var.r(11);
                d0Var.q();
                d0Var.r(15);
                d0Var.q();
            }
        }
        if (d0Var.h(2) != 0) {
            t8.s.i("H263Reader", "Unhandled video object layer shape");
        }
        d0Var.q();
        int h13 = d0Var.h(16);
        d0Var.q();
        if (d0Var.g()) {
            if (h13 == 0) {
                t8.s.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                d0Var.r(i11);
            }
        }
        d0Var.q();
        int h14 = d0Var.h(13);
        d0Var.q();
        int h15 = d0Var.h(13);
        d0Var.q();
        d0Var.q();
        return new u1.b().U(str).g0("video/mp4v-es").n0(h14).S(h15).c0(f10).V(Collections.singletonList(copyOf)).G();
    }

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        t8.a.i(this.f17379f);
        t8.a.i(this.f17382i);
        int f10 = e0Var.f();
        int g10 = e0Var.g();
        byte[] e10 = e0Var.e();
        this.f17380g += e0Var.a();
        this.f17382i.a(e0Var, e0Var.a());
        while (true) {
            int c10 = t8.x.c(e10, f10, g10, this.f17376c);
            if (c10 == g10) {
                break;
            }
            int i10 = c10 + 3;
            int i11 = e0Var.e()[i10] & 255;
            int i12 = c10 - f10;
            int i13 = 0;
            if (!this.f17383j) {
                if (i12 > 0) {
                    this.f17377d.a(e10, f10, c10);
                }
                if (this.f17377d.b(i11, i12 < 0 ? -i12 : 0)) {
                    y6.b0 b0Var = this.f17382i;
                    a aVar = this.f17377d;
                    b0Var.c(a(aVar, aVar.f17389d, (String) t8.a.e(this.f17381h)));
                    this.f17383j = true;
                }
            }
            this.f17379f.a(e10, f10, c10);
            u uVar = this.f17378e;
            if (uVar != null) {
                if (i12 > 0) {
                    uVar.a(e10, f10, c10);
                } else {
                    i13 = -i12;
                }
                if (this.f17378e.b(i13)) {
                    u uVar2 = this.f17378e;
                    ((t8.e0) r0.j(this.f17375b)).S(this.f17378e.f17517d, t8.x.q(uVar2.f17517d, uVar2.f17518e));
                    ((k0) r0.j(this.f17374a)).a(this.f17384k, this.f17375b);
                }
                if (i11 == 178 && e0Var.e()[c10 + 2] == 1) {
                    this.f17378e.e(i11);
                }
            }
            int i14 = g10 - c10;
            this.f17379f.b(this.f17380g - i14, i14, this.f17383j);
            this.f17379f.c(i11, this.f17384k);
            f10 = i10;
        }
        if (!this.f17383j) {
            this.f17377d.a(e10, f10, g10);
        }
        this.f17379f.a(e10, f10, g10);
        u uVar3 = this.f17378e;
        if (uVar3 != null) {
            uVar3.a(e10, f10, g10);
        }
    }

    @Override // i7.m
    public void c() {
        t8.x.a(this.f17376c);
        this.f17377d.c();
        b bVar = this.f17379f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f17378e;
        if (uVar != null) {
            uVar.d();
        }
        this.f17380g = 0L;
        this.f17384k = -9223372036854775807L;
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        this.f17381h = dVar.b();
        y6.b0 d10 = mVar.d(dVar.c(), 2);
        this.f17382i = d10;
        this.f17379f = new b(d10);
        k0 k0Var = this.f17374a;
        if (k0Var != null) {
            k0Var.b(mVar, dVar);
        }
    }

    @Override // i7.m
    public void e() {
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17384k = j10;
        }
    }
}
