package i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f17351q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f17352a;

    /* renamed from: b, reason: collision with root package name */
    private y6.b0 f17353b;

    /* renamed from: c, reason: collision with root package name */
    private final k0 f17354c;

    /* renamed from: d, reason: collision with root package name */
    private final t8.e0 f17355d;

    /* renamed from: e, reason: collision with root package name */
    private final u f17356e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f17357f;

    /* renamed from: g, reason: collision with root package name */
    private final a f17358g;

    /* renamed from: h, reason: collision with root package name */
    private long f17359h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17360i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f17361j;

    /* renamed from: k, reason: collision with root package name */
    private long f17362k;

    /* renamed from: l, reason: collision with root package name */
    private long f17363l;

    /* renamed from: m, reason: collision with root package name */
    private long f17364m;

    /* renamed from: n, reason: collision with root package name */
    private long f17365n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17366o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17367p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f17368e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f17369a;

        /* renamed from: b, reason: collision with root package name */
        public int f17370b;

        /* renamed from: c, reason: collision with root package name */
        public int f17371c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f17372d;

        public a(int i10) {
            this.f17372d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f17369a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f17372d;
                int length = bArr2.length;
                int i13 = this.f17370b;
                if (length < i13 + i12) {
                    this.f17372d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f17372d, this.f17370b, i12);
                this.f17370b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f17369a) {
                int i12 = this.f17370b - i11;
                this.f17370b = i12;
                if (this.f17371c != 0 || i10 != 181) {
                    this.f17369a = false;
                    return true;
                }
                this.f17371c = i12;
            } else if (i10 == 179) {
                this.f17369a = true;
            }
            byte[] bArr = f17368e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f17369a = false;
            this.f17370b = 0;
            this.f17371c = 0;
        }
    }

    public n() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(k0 k0Var) {
        t8.e0 e0Var;
        this.f17354c = k0Var;
        this.f17357f = new boolean[4];
        this.f17358g = new a(RecognitionOptions.ITF);
        if (k0Var != null) {
            this.f17356e = new u(178, RecognitionOptions.ITF);
            e0Var = new t8.e0();
        } else {
            e0Var = null;
            this.f17356e = null;
        }
        this.f17355d = e0Var;
        this.f17363l = -9223372036854775807L;
        this.f17365n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<t6.u1, java.lang.Long> a(i7.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f17372d
            int r1 = r8.f17370b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            t6.u1$b r6 = new t6.u1$b
            r6.<init>()
            t6.u1$b r9 = r6.U(r9)
            java.lang.String r6 = "video/mpeg2"
            t6.u1$b r9 = r9.g0(r6)
            t6.u1$b r9 = r9.n0(r2)
            t6.u1$b r9 = r9.S(r4)
            t6.u1$b r9 = r9.c0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            t6.u1$b r9 = r9.V(r1)
            t6.u1 r9 = r9.G()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = i7.n.f17351q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f17371c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.n.a(i7.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    @Override // i7.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(t8.e0 r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.n.b(t8.e0):void");
    }

    @Override // i7.m
    public void c() {
        t8.x.a(this.f17357f);
        this.f17358g.c();
        u uVar = this.f17356e;
        if (uVar != null) {
            uVar.d();
        }
        this.f17359h = 0L;
        this.f17360i = false;
        this.f17363l = -9223372036854775807L;
        this.f17365n = -9223372036854775807L;
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        this.f17352a = dVar.b();
        this.f17353b = mVar.d(dVar.c(), 2);
        k0 k0Var = this.f17354c;
        if (k0Var != null) {
            k0Var.b(mVar, dVar);
        }
    }

    @Override // i7.m
    public void e() {
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        this.f17363l = j10;
    }
}
