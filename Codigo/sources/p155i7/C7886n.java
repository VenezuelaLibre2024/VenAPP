package p155i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import p155i7.InterfaceC7879i0;
import p363t8.C11146e0;
import p363t8.C11179x;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.n */
/* loaded from: classes.dex */
public final class C7886n implements InterfaceC7885m {

    /* renamed from: q */
    private static final double[] f19012q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f19013a;

    /* renamed from: b */
    private InterfaceC12609b0 f19014b;

    /* renamed from: c */
    private final C7883k0 f19015c;

    /* renamed from: d */
    private final C11146e0 f19016d;

    /* renamed from: e */
    private final C7893u f19017e;

    /* renamed from: f */
    private final boolean[] f19018f;

    /* renamed from: g */
    private final a f19019g;

    /* renamed from: h */
    private long f19020h;

    /* renamed from: i */
    private boolean f19021i;

    /* renamed from: j */
    private boolean f19022j;

    /* renamed from: k */
    private long f19023k;

    /* renamed from: l */
    private long f19024l;

    /* renamed from: m */
    private long f19025m;

    /* renamed from: n */
    private long f19026n;

    /* renamed from: o */
    private boolean f19027o;

    /* renamed from: p */
    private boolean f19028p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i7.n$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e */
        private static final byte[] f19029e = {0, 0, 1};

        /* renamed from: a */
        private boolean f19030a;

        /* renamed from: b */
        public int f19031b;

        /* renamed from: c */
        public int f19032c;

        /* renamed from: d */
        public byte[] f19033d;

        public a(int i10) {
            this.f19033d = new byte[i10];
        }

        /* renamed from: a */
        public void m24281a(byte[] bArr, int i10, int i11) {
            if (this.f19030a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f19033d;
                int length = bArr2.length;
                int i13 = this.f19031b;
                if (length < i13 + i12) {
                    this.f19033d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f19033d, this.f19031b, i12);
                this.f19031b += i12;
            }
        }

        /* renamed from: b */
        public boolean m24282b(int i10, int i11) {
            if (this.f19030a) {
                int i12 = this.f19031b - i11;
                this.f19031b = i12;
                if (this.f19032c != 0 || i10 != 181) {
                    this.f19030a = false;
                    return true;
                }
                this.f19032c = i12;
            } else if (i10 == 179) {
                this.f19030a = true;
            }
            byte[] bArr = f19029e;
            m24281a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m24283c() {
            this.f19030a = false;
            this.f19031b = 0;
            this.f19032c = 0;
        }
    }

    public C7886n() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7886n(C7883k0 c7883k0) {
        C11146e0 c11146e0;
        this.f19015c = c7883k0;
        this.f19018f = new boolean[4];
        this.f19019g = new a(RecognitionOptions.ITF);
        if (c7883k0 != null) {
            this.f19017e = new C7893u(178, RecognitionOptions.ITF);
            c11146e0 = new C11146e0();
        } else {
            c11146e0 = null;
            this.f19017e = null;
        }
        this.f19016d = c11146e0;
        this.f19024l = -9223372036854775807L;
        this.f19026n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<p361t6.C11108u1, java.lang.Long> m24280a(p155i7.C7886n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f19033d
            int r1 = r8.f19031b
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
            t6.u1$b r9 = r6.m34540U(r9)
            java.lang.String r6 = "video/mpeg2"
            t6.u1$b r9 = r9.m34552g0(r6)
            t6.u1$b r9 = r9.m34559n0(r2)
            t6.u1$b r9 = r9.m34538S(r4)
            t6.u1$b r9 = r9.m34548c0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            t6.u1$b r9 = r9.m34541V(r1)
            t6.u1 r9 = r9.m34526G()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = p155i7.C7886n.f19012q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f19032c
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
        throw new UnsupportedOperationException("Method not decompiled: p155i7.C7886n.m24280a(i7.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo24186b(p363t8.C11146e0 r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p155i7.C7886n.mo24186b(t8.e0):void");
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        C11179x.m35014a(this.f19018f);
        this.f19019g.m24283c();
        C7893u c7893u = this.f19017e;
        if (c7893u != null) {
            c7893u.m24336d();
        }
        this.f19020h = 0L;
        this.f19021i = false;
        this.f19024l = -9223372036854775807L;
        this.f19026n = -9223372036854775807L;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        this.f19013a = dVar.m24264b();
        this.f19014b = interfaceC12623m.mo308d(dVar.m24265c(), 2);
        C7883k0 c7883k0 = this.f19015c;
        if (c7883k0 != null) {
            c7883k0.m24278b(interfaceC12623m, dVar);
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        this.f19024l = j10;
    }
}
