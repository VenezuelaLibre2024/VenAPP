package g7;

import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.w;
import g7.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l7.a;
import t6.b3;
import t6.u1;
import t8.e0;
import t8.r0;
import t8.s;
import y6.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private static final byte[] f15876a = r0.m0("OpusHead");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f15877a;

        /* renamed from: b */
        public int f15878b;

        /* renamed from: c */
        public int f15879c;

        /* renamed from: d */
        public long f15880d;

        /* renamed from: e */
        private final boolean f15881e;

        /* renamed from: f */
        private final e0 f15882f;

        /* renamed from: g */
        private final e0 f15883g;

        /* renamed from: h */
        private int f15884h;

        /* renamed from: i */
        private int f15885i;

        public a(e0 e0Var, e0 e0Var2, boolean z10) {
            this.f15883g = e0Var;
            this.f15882f = e0Var2;
            this.f15881e = z10;
            e0Var2.U(12);
            this.f15877a = e0Var2.L();
            e0Var.U(12);
            this.f15885i = e0Var.L();
            y6.n.a(e0Var.q() == 1, "first_chunk must be 1");
            this.f15878b = -1;
        }

        public boolean a() {
            int i10 = this.f15878b + 1;
            this.f15878b = i10;
            if (i10 == this.f15877a) {
                return false;
            }
            this.f15880d = this.f15881e ? this.f15882f.M() : this.f15882f.J();
            if (this.f15878b == this.f15884h) {
                this.f15879c = this.f15883g.L();
                this.f15883g.V(4);
                int i11 = this.f15885i - 1;
                this.f15885i = i11;
                this.f15884h = i11 > 0 ? this.f15883g.L() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: g7.b$b */
    /* loaded from: classes.dex */
    public static final class C0261b {

        /* renamed from: a */
        private final String f15886a;

        /* renamed from: b */
        private final byte[] f15887b;

        /* renamed from: c */
        private final long f15888c;

        /* renamed from: d */
        private final long f15889d;

        public C0261b(String str, byte[] bArr, long j10, long j11) {
            this.f15886a = str;
            this.f15887b = bArr;
            this.f15888c = j10;
            this.f15889d = j11;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a();

        int b();

        int c();
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final p[] f15890a;

        /* renamed from: b */
        public u1 f15891b;

        /* renamed from: c */
        public int f15892c;

        /* renamed from: d */
        public int f15893d = 0;

        public d(int i10) {
            this.f15890a = new p[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: a */
        private final int f15894a;

        /* renamed from: b */
        private final int f15895b;

        /* renamed from: c */
        private final e0 f15896c;

        public e(a.b bVar, u1 u1Var) {
            e0 e0Var = bVar.f15875b;
            this.f15896c = e0Var;
            e0Var.U(12);
            int L = e0Var.L();
            if ("audio/raw".equals(u1Var.f26517w)) {
                int e02 = r0.e0(u1Var.L, u1Var.J);
                if (L == 0 || L % e02 != 0) {
                    s.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + e02 + ", stsz sample size: " + L);
                    L = e02;
                }
            }
            this.f15894a = L == 0 ? -1 : L;
            this.f15895b = e0Var.L();
        }

        @Override // g7.b.c
        public int a() {
            int i10 = this.f15894a;
            return i10 == -1 ? this.f15896c.L() : i10;
        }

        @Override // g7.b.c
        public int b() {
            return this.f15894a;
        }

        @Override // g7.b.c
        public int c() {
            return this.f15895b;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements c {

        /* renamed from: a */
        private final e0 f15897a;

        /* renamed from: b */
        private final int f15898b;

        /* renamed from: c */
        private final int f15899c;

        /* renamed from: d */
        private int f15900d;

        /* renamed from: e */
        private int f15901e;

        public f(a.b bVar) {
            e0 e0Var = bVar.f15875b;
            this.f15897a = e0Var;
            e0Var.U(12);
            this.f15899c = e0Var.L() & 255;
            this.f15898b = e0Var.L();
        }

        @Override // g7.b.c
        public int a() {
            int i10 = this.f15899c;
            if (i10 == 8) {
                return this.f15897a.H();
            }
            if (i10 == 16) {
                return this.f15897a.N();
            }
            int i11 = this.f15900d;
            this.f15900d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f15901e & 15;
            }
            int H = this.f15897a.H();
            this.f15901e = H;
            return (H & 240) >> 4;
        }

        @Override // g7.b.c
        public int b() {
            return -1;
        }

        @Override // g7.b.c
        public int c() {
            return this.f15898b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        private final int f15902a;

        /* renamed from: b */
        private final long f15903b;

        /* renamed from: c */
        private final int f15904c;

        public g(int i10, long j10, int i11) {
            this.f15902a = i10;
            this.f15903b = j10;
            this.f15904c = i11;
        }
    }

    public static List<r> A(a.C0260a c0260a, v vVar, long j10, x6.m mVar, boolean z10, boolean z11, eb.g<o, o> gVar) {
        o apply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0260a.f15874d.size(); i10++) {
            a.C0260a c0260a2 = c0260a.f15874d.get(i10);
            if (c0260a2.f15871a == 1953653099 && (apply = gVar.apply(z(c0260a2, (a.b) t8.a.e(c0260a.g(1836476516)), j10, mVar, z10, z11))) != null) {
                arrayList.add(v(apply, (a.C0260a) t8.a.e(((a.C0260a) t8.a.e(((a.C0260a) t8.a.e(c0260a2.f(1835297121))).f(1835626086))).f(1937007212)), vVar));
            }
        }
        return arrayList;
    }

    public static Pair<l7.a, l7.a> B(a.b bVar) {
        e0 e0Var = bVar.f15875b;
        e0Var.U(8);
        l7.a aVar = null;
        l7.a aVar2 = null;
        while (e0Var.a() >= 8) {
            int f10 = e0Var.f();
            int q10 = e0Var.q();
            int q11 = e0Var.q();
            if (q11 == 1835365473) {
                e0Var.U(f10);
                aVar = C(e0Var, f10 + q10);
            } else if (q11 == 1936553057) {
                e0Var.U(f10);
                aVar2 = u(e0Var, f10 + q10);
            }
            e0Var.U(f10 + q10);
        }
        return Pair.create(aVar, aVar2);
    }

    private static l7.a C(e0 e0Var, int i10) {
        e0Var.V(8);
        e(e0Var);
        while (e0Var.f() < i10) {
            int f10 = e0Var.f();
            int q10 = e0Var.q();
            if (e0Var.q() == 1768715124) {
                e0Var.U(f10);
                return l(e0Var, f10 + q10);
            }
            e0Var.U(f10 + q10);
        }
        return null;
    }

    private static void D(e0 e0Var, int i10, int i11, int i12, int i13, int i14, x6.m mVar, d dVar, int i15) {
        String str;
        x6.m mVar2;
        int i16;
        int i17;
        float f10;
        List<byte[]> list;
        int i18;
        int i19;
        int i20;
        String str2;
        int i21 = i11;
        int i22 = i12;
        x6.m mVar3 = mVar;
        d dVar2 = dVar;
        e0Var.U(i21 + 8 + 8);
        e0Var.V(16);
        int N = e0Var.N();
        int N2 = e0Var.N();
        e0Var.V(50);
        int f11 = e0Var.f();
        int i23 = i10;
        if (i23 == 1701733238) {
            Pair<Integer, p> s10 = s(e0Var, i21, i22);
            if (s10 != null) {
                i23 = ((Integer) s10.first).intValue();
                mVar3 = mVar3 == null ? null : mVar3.c(((p) s10.second).f16012b);
                dVar2.f15890a[i15] = (p) s10.second;
            }
            e0Var.U(f11);
        }
        String str3 = "video/3gpp";
        String str4 = i23 == 1831958048 ? "video/mpeg" : i23 == 1211250227 ? "video/3gpp" : null;
        float f12 = 1.0f;
        String str5 = null;
        List<byte[]> list2 = null;
        byte[] bArr = null;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        ByteBuffer byteBuffer = null;
        C0261b c0261b = null;
        boolean z10 = false;
        while (f11 - i21 < i22) {
            e0Var.U(f11);
            int f13 = e0Var.f();
            int q10 = e0Var.q();
            if (q10 == 0) {
                str = str3;
                if (e0Var.f() - i21 == i22) {
                    break;
                }
            } else {
                str = str3;
            }
            y6.n.a(q10 > 0, "childAtomSize must be positive");
            int q11 = e0Var.q();
            if (q11 == 1635148611) {
                y6.n.a(str4 == null, null);
                e0Var.U(f13 + 8);
                u8.a b10 = u8.a.b(e0Var);
                list2 = b10.f27334a;
                dVar2.f15892c = b10.f27335b;
                if (!z10) {
                    f12 = b10.f27338e;
                }
                str5 = b10.f27339f;
                str2 = "video/avc";
            } else {
                if (q11 == 1752589123) {
                    y6.n.a(str4 == null, null);
                    e0Var.U(f13 + 8);
                    u8.f a10 = u8.f.a(e0Var);
                    list2 = a10.f27378a;
                    dVar2.f15892c = a10.f27379b;
                    if (!z10) {
                        f12 = a10.f27382e;
                    }
                    str5 = a10.f27386i;
                    int i28 = a10.f27383f;
                    int i29 = a10.f27384g;
                    i27 = a10.f27385h;
                    mVar2 = mVar3;
                    i16 = N2;
                    i25 = i28;
                    i17 = i23;
                    i26 = i29;
                    str4 = "video/hevc";
                } else {
                    if (q11 == 1685480259 || q11 == 1685485123) {
                        mVar2 = mVar3;
                        i16 = N2;
                        i17 = i23;
                        f10 = f12;
                        list = list2;
                        i18 = i25;
                        i19 = i26;
                        i20 = i27;
                        u8.d a11 = u8.d.a(e0Var);
                        if (a11 != null) {
                            str5 = a11.f27363c;
                            str4 = "video/dolby-vision";
                        }
                    } else if (q11 == 1987076931) {
                        y6.n.a(str4 == null, null);
                        str2 = i23 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        e0Var.U(f13 + 12);
                        e0Var.V(2);
                        boolean z11 = (e0Var.H() & 1) != 0;
                        int H = e0Var.H();
                        int H2 = e0Var.H();
                        i25 = u8.c.c(H);
                        i26 = z11 ? 1 : 2;
                        i27 = u8.c.d(H2);
                    } else if (q11 == 1635135811) {
                        y6.n.a(str4 == null, null);
                        str2 = "video/av01";
                    } else if (q11 == 1668050025) {
                        ByteBuffer a12 = byteBuffer == null ? a() : byteBuffer;
                        a12.position(21);
                        a12.putShort(e0Var.D());
                        a12.putShort(e0Var.D());
                        byteBuffer = a12;
                        mVar2 = mVar3;
                        i16 = N2;
                        i17 = i23;
                    } else if (q11 == 1835295606) {
                        ByteBuffer a13 = byteBuffer == null ? a() : byteBuffer;
                        short D = e0Var.D();
                        short D2 = e0Var.D();
                        short D3 = e0Var.D();
                        i17 = i23;
                        short D4 = e0Var.D();
                        short D5 = e0Var.D();
                        mVar2 = mVar3;
                        short D6 = e0Var.D();
                        List<byte[]> list3 = list2;
                        short D7 = e0Var.D();
                        float f14 = f12;
                        short D8 = e0Var.D();
                        long J = e0Var.J();
                        long J2 = e0Var.J();
                        i16 = N2;
                        a13.position(1);
                        a13.putShort(D5);
                        a13.putShort(D6);
                        a13.putShort(D);
                        a13.putShort(D2);
                        a13.putShort(D3);
                        a13.putShort(D4);
                        a13.putShort(D7);
                        a13.putShort(D8);
                        a13.putShort((short) (J / 10000));
                        a13.putShort((short) (J2 / 10000));
                        byteBuffer = a13;
                        list2 = list3;
                        f12 = f14;
                    } else {
                        mVar2 = mVar3;
                        i16 = N2;
                        i17 = i23;
                        f10 = f12;
                        list = list2;
                        if (q11 == 1681012275) {
                            y6.n.a(str4 == null, null);
                            str4 = str;
                        } else if (q11 == 1702061171) {
                            y6.n.a(str4 == null, null);
                            c0261b = i(e0Var, f13);
                            String str6 = c0261b.f15886a;
                            byte[] bArr2 = c0261b.f15887b;
                            list2 = bArr2 != null ? w.w(bArr2) : list;
                            str4 = str6;
                            f12 = f10;
                            f11 += q10;
                            i21 = i11;
                            i22 = i12;
                            dVar2 = dVar;
                            str3 = str;
                            i23 = i17;
                            mVar3 = mVar2;
                            N2 = i16;
                        } else if (q11 == 1885434736) {
                            f12 = q(e0Var, f13);
                            list2 = list;
                            z10 = true;
                            f11 += q10;
                            i21 = i11;
                            i22 = i12;
                            dVar2 = dVar;
                            str3 = str;
                            i23 = i17;
                            mVar3 = mVar2;
                            N2 = i16;
                        } else if (q11 == 1937126244) {
                            bArr = r(e0Var, f13, q10);
                        } else if (q11 == 1936995172) {
                            int H3 = e0Var.H();
                            e0Var.V(3);
                            if (H3 == 0) {
                                int H4 = e0Var.H();
                                if (H4 == 0) {
                                    i24 = 0;
                                } else if (H4 == 1) {
                                    i24 = 1;
                                } else if (H4 == 2) {
                                    i24 = 2;
                                } else if (H4 == 3) {
                                    i24 = 3;
                                }
                            }
                        } else {
                            i18 = i25;
                            if (q11 == 1668246642) {
                                i19 = i26;
                                if (i18 == -1) {
                                    i20 = i27;
                                    if (i19 == -1 && i20 == -1) {
                                        int q12 = e0Var.q();
                                        if (q12 == 1852009592 || q12 == 1852009571) {
                                            int N3 = e0Var.N();
                                            int N4 = e0Var.N();
                                            e0Var.V(2);
                                            boolean z12 = q10 == 19 && (e0Var.H() & RecognitionOptions.ITF) != 0;
                                            i25 = u8.c.c(N3);
                                            i26 = z12 ? 1 : 2;
                                            i27 = u8.c.d(N4);
                                        } else {
                                            s.i("AtomParsers", "Unsupported color type: " + g7.a.a(q12));
                                        }
                                    }
                                }
                            } else {
                                i19 = i26;
                            }
                            i20 = i27;
                        }
                        list2 = list;
                        f12 = f10;
                        f11 += q10;
                        i21 = i11;
                        i22 = i12;
                        dVar2 = dVar;
                        str3 = str;
                        i23 = i17;
                        mVar3 = mVar2;
                        N2 = i16;
                    }
                    i26 = i19;
                    i27 = i20;
                    i25 = i18;
                    list2 = list;
                    f12 = f10;
                    f11 += q10;
                    i21 = i11;
                    i22 = i12;
                    dVar2 = dVar;
                    str3 = str;
                    i23 = i17;
                    mVar3 = mVar2;
                    N2 = i16;
                }
                f11 += q10;
                i21 = i11;
                i22 = i12;
                dVar2 = dVar;
                str3 = str;
                i23 = i17;
                mVar3 = mVar2;
                N2 = i16;
            }
            str4 = str2;
            mVar2 = mVar3;
            i16 = N2;
            i17 = i23;
            f11 += q10;
            i21 = i11;
            i22 = i12;
            dVar2 = dVar;
            str3 = str;
            i23 = i17;
            mVar3 = mVar2;
            N2 = i16;
        }
        x6.m mVar4 = mVar3;
        int i30 = N2;
        float f15 = f12;
        List<byte[]> list4 = list2;
        int i31 = i25;
        int i32 = i26;
        int i33 = i27;
        if (str4 == null) {
            return;
        }
        u1.b O = new u1.b().T(i13).g0(str4).K(str5).n0(N).S(i30).c0(f15).f0(i14).d0(bArr).j0(i24).V(list4).O(mVar4);
        if (i31 != -1 || i32 != -1 || i33 != -1 || byteBuffer != null) {
            O.L(new u8.c(i31, i32, i33, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (c0261b != null) {
            O.I(hb.e.k(c0261b.f15888c)).b0(hb.e.k(c0261b.f15889d));
        }
        dVar.f15891b = O.G();
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[r0.q(4, 0, length)] && jArr[r0.q(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(e0 e0Var, int i10, int i11, int i12) {
        int f10 = e0Var.f();
        y6.n.a(f10 >= i11, null);
        while (f10 - i11 < i12) {
            e0Var.U(f10);
            int q10 = e0Var.q();
            y6.n.a(q10 > 0, "childAtomSize must be positive");
            if (e0Var.q() == i10) {
                return f10;
            }
            f10 += q10;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(e0 e0Var) {
        int f10 = e0Var.f();
        e0Var.V(4);
        if (e0Var.q() != 1751411826) {
            f10 += 4;
        }
        e0Var.U(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(t8.e0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, x6.m r29, g7.b.d r30, int r31) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.b.f(t8.e0, int, int, int, int, java.lang.String, boolean, x6.m, g7.b$d, int):void");
    }

    static Pair<Integer, p> g(e0 e0Var, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer num = null;
        while (i12 - i10 < i11) {
            e0Var.U(i12);
            int q10 = e0Var.q();
            int q11 = e0Var.q();
            if (q11 == 1718775137) {
                num = Integer.valueOf(e0Var.q());
            } else if (q11 == 1935894637) {
                e0Var.V(4);
                str = e0Var.E(4);
            } else if (q11 == 1935894633) {
                i13 = i12;
                i14 = q10;
            }
            i12 += q10;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        y6.n.a(num != null, "frma atom is mandatory");
        y6.n.a(i13 != -1, "schi atom is mandatory");
        p t10 = t(e0Var, i13, i14, str);
        y6.n.a(t10 != null, "tenc atom is mandatory");
        return Pair.create(num, (p) r0.j(t10));
    }

    private static Pair<long[], long[]> h(a.C0260a c0260a) {
        a.b g10 = c0260a.g(1701606260);
        if (g10 == null) {
            return null;
        }
        e0 e0Var = g10.f15875b;
        e0Var.U(8);
        int c10 = g7.a.c(e0Var.q());
        int L = e0Var.L();
        long[] jArr = new long[L];
        long[] jArr2 = new long[L];
        for (int i10 = 0; i10 < L; i10++) {
            jArr[i10] = c10 == 1 ? e0Var.M() : e0Var.J();
            jArr2[i10] = c10 == 1 ? e0Var.A() : e0Var.q();
            if (e0Var.D() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            e0Var.V(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0261b i(e0 e0Var, int i10) {
        e0Var.U(i10 + 8 + 4);
        e0Var.V(1);
        j(e0Var);
        e0Var.V(2);
        int H = e0Var.H();
        if ((H & RecognitionOptions.ITF) != 0) {
            e0Var.V(2);
        }
        if ((H & 64) != 0) {
            e0Var.V(e0Var.H());
        }
        if ((H & 32) != 0) {
            e0Var.V(2);
        }
        e0Var.V(1);
        j(e0Var);
        String h10 = t8.w.h(e0Var.H());
        if ("audio/mpeg".equals(h10) || "audio/vnd.dts".equals(h10) || "audio/vnd.dts.hd".equals(h10)) {
            return new C0261b(h10, null, -1L, -1L);
        }
        e0Var.V(4);
        long J = e0Var.J();
        long J2 = e0Var.J();
        e0Var.V(1);
        int j10 = j(e0Var);
        byte[] bArr = new byte[j10];
        e0Var.l(bArr, 0, j10);
        return new C0261b(h10, bArr, J2 > 0 ? J2 : -1L, J > 0 ? J : -1L);
    }

    private static int j(e0 e0Var) {
        int H = e0Var.H();
        int i10 = H & 127;
        while ((H & RecognitionOptions.ITF) == 128) {
            H = e0Var.H();
            i10 = (i10 << 7) | (H & 127);
        }
        return i10;
    }

    private static int k(e0 e0Var) {
        e0Var.U(16);
        return e0Var.q();
    }

    private static l7.a l(e0 e0Var, int i10) {
        e0Var.V(8);
        ArrayList arrayList = new ArrayList();
        while (e0Var.f() < i10) {
            a.b c10 = h.c(e0Var);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new l7.a(arrayList);
    }

    private static Pair<Long, String> m(e0 e0Var) {
        e0Var.U(8);
        int c10 = g7.a.c(e0Var.q());
        e0Var.V(c10 == 0 ? 8 : 16);
        long J = e0Var.J();
        e0Var.V(c10 == 0 ? 4 : 8);
        int N = e0Var.N();
        return Pair.create(Long.valueOf(J), "" + ((char) (((N >> 10) & 31) + 96)) + ((char) (((N >> 5) & 31) + 96)) + ((char) ((N & 31) + 96)));
    }

    public static l7.a n(a.C0260a c0260a) {
        a.b g10 = c0260a.g(1751411826);
        a.b g11 = c0260a.g(1801812339);
        a.b g12 = c0260a.g(1768715124);
        if (g10 == null || g11 == null || g12 == null || k(g10.f15875b) != 1835299937) {
            return null;
        }
        e0 e0Var = g11.f15875b;
        e0Var.U(12);
        int q10 = e0Var.q();
        String[] strArr = new String[q10];
        for (int i10 = 0; i10 < q10; i10++) {
            int q11 = e0Var.q();
            e0Var.V(4);
            strArr[i10] = e0Var.E(q11 - 8);
        }
        e0 e0Var2 = g12.f15875b;
        e0Var2.U(8);
        ArrayList arrayList = new ArrayList();
        while (e0Var2.a() > 8) {
            int f10 = e0Var2.f();
            int q12 = e0Var2.q();
            int q13 = e0Var2.q() - 1;
            if (q13 < 0 || q13 >= q10) {
                s.i("AtomParsers", "Skipped metadata with unknown key index: " + q13);
            } else {
                r7.a f11 = h.f(e0Var2, f10 + q12, strArr[q13]);
                if (f11 != null) {
                    arrayList.add(f11);
                }
            }
            e0Var2.U(f10 + q12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new l7.a(arrayList);
    }

    private static void o(e0 e0Var, int i10, int i11, int i12, d dVar) {
        e0Var.U(i11 + 8 + 8);
        if (i10 == 1835365492) {
            e0Var.B();
            String B = e0Var.B();
            if (B != null) {
                dVar.f15891b = new u1.b().T(i12).g0(B).G();
            }
        }
    }

    private static long p(e0 e0Var) {
        e0Var.U(8);
        e0Var.V(g7.a.c(e0Var.q()) != 0 ? 16 : 8);
        return e0Var.J();
    }

    private static float q(e0 e0Var, int i10) {
        e0Var.U(i10 + 8);
        return e0Var.L() / e0Var.L();
    }

    private static byte[] r(e0 e0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            e0Var.U(i12);
            int q10 = e0Var.q();
            if (e0Var.q() == 1886547818) {
                return Arrays.copyOfRange(e0Var.e(), i12, q10 + i12);
            }
            i12 += q10;
        }
        return null;
    }

    private static Pair<Integer, p> s(e0 e0Var, int i10, int i11) {
        Pair<Integer, p> g10;
        int f10 = e0Var.f();
        while (f10 - i10 < i11) {
            e0Var.U(f10);
            int q10 = e0Var.q();
            y6.n.a(q10 > 0, "childAtomSize must be positive");
            if (e0Var.q() == 1936289382 && (g10 = g(e0Var, f10, q10)) != null) {
                return g10;
            }
            f10 += q10;
        }
        return null;
    }

    private static p t(e0 e0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            e0Var.U(i14);
            int q10 = e0Var.q();
            if (e0Var.q() == 1952804451) {
                int c10 = g7.a.c(e0Var.q());
                e0Var.V(1);
                if (c10 == 0) {
                    e0Var.V(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int H = e0Var.H();
                    i12 = H & 15;
                    i13 = (H & 240) >> 4;
                }
                boolean z10 = e0Var.H() == 1;
                int H2 = e0Var.H();
                byte[] bArr2 = new byte[16];
                e0Var.l(bArr2, 0, 16);
                if (z10 && H2 == 0) {
                    int H3 = e0Var.H();
                    bArr = new byte[H3];
                    e0Var.l(bArr, 0, H3);
                }
                return new p(z10, str, H2, bArr2, i13, i12, bArr);
            }
            i14 += q10;
        }
    }

    private static l7.a u(e0 e0Var, int i10) {
        e0Var.V(12);
        while (e0Var.f() < i10) {
            int f10 = e0Var.f();
            int q10 = e0Var.q();
            if (e0Var.q() == 1935766900) {
                if (q10 < 14) {
                    return null;
                }
                e0Var.V(5);
                int H = e0Var.H();
                if (H != 12 && H != 13) {
                    return null;
                }
                float f11 = H == 12 ? 240.0f : 120.0f;
                e0Var.V(1);
                return new l7.a(new r7.e(f11, e0Var.H()));
            }
            e0Var.U(f10 + q10);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0426 A[EDGE_INSN: B:97:0x0426->B:98:0x0426 BREAK  A[LOOP:2: B:76:0x03c5->B:92:0x041f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static g7.r v(g7.o r38, g7.a.C0260a r39, y6.v r40) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.b.v(g7.o, g7.a$a, y6.v):g7.r");
    }

    private static d w(e0 e0Var, int i10, int i11, String str, x6.m mVar, boolean z10) {
        int i12;
        e0Var.U(12);
        int q10 = e0Var.q();
        d dVar = new d(q10);
        for (int i13 = 0; i13 < q10; i13++) {
            int f10 = e0Var.f();
            int q11 = e0Var.q();
            y6.n.a(q11 > 0, "childAtomSize must be positive");
            int q12 = e0Var.q();
            if (q12 == 1635148593 || q12 == 1635148595 || q12 == 1701733238 || q12 == 1831958048 || q12 == 1836070006 || q12 == 1752589105 || q12 == 1751479857 || q12 == 1932670515 || q12 == 1211250227 || q12 == 1987063864 || q12 == 1987063865 || q12 == 1635135537 || q12 == 1685479798 || q12 == 1685479729 || q12 == 1685481573 || q12 == 1685481521) {
                i12 = f10;
                D(e0Var, q12, i12, q11, i10, i11, mVar, dVar, i13);
            } else if (q12 == 1836069985 || q12 == 1701733217 || q12 == 1633889587 || q12 == 1700998451 || q12 == 1633889588 || q12 == 1835823201 || q12 == 1685353315 || q12 == 1685353317 || q12 == 1685353320 || q12 == 1685353324 || q12 == 1685353336 || q12 == 1935764850 || q12 == 1935767394 || q12 == 1819304813 || q12 == 1936684916 || q12 == 1953984371 || q12 == 778924082 || q12 == 778924083 || q12 == 1835557169 || q12 == 1835560241 || q12 == 1634492771 || q12 == 1634492791 || q12 == 1970037111 || q12 == 1332770163 || q12 == 1716281667) {
                i12 = f10;
                f(e0Var, q12, f10, q11, i10, str, z10, mVar, dVar, i13);
            } else {
                if (q12 == 1414810956 || q12 == 1954034535 || q12 == 2004251764 || q12 == 1937010800 || q12 == 1664495672) {
                    x(e0Var, q12, f10, q11, i10, str, dVar);
                } else if (q12 == 1835365492) {
                    o(e0Var, q12, f10, i10, dVar);
                } else if (q12 == 1667329389) {
                    dVar.f15891b = new u1.b().T(i10).g0("application/x-camera-motion").G();
                }
                i12 = f10;
            }
            e0Var.U(i12 + q11);
        }
        return dVar;
    }

    private static void x(e0 e0Var, int i10, int i11, int i12, int i13, String str, d dVar) {
        e0Var.U(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        w wVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                e0Var.l(bArr, 0, i14);
                wVar = w.w(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.f15893d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.f15891b = new u1.b().T(i13).g0(str2).X(str).k0(j10).V(wVar).G();
    }

    private static g y(e0 e0Var) {
        boolean z10;
        e0Var.U(8);
        int c10 = g7.a.c(e0Var.q());
        e0Var.V(c10 == 0 ? 8 : 16);
        int q10 = e0Var.q();
        e0Var.V(4);
        int f10 = e0Var.f();
        int i10 = c10 == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            }
            if (e0Var.e()[f10 + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            e0Var.V(i10);
        } else {
            long J = c10 == 0 ? e0Var.J() : e0Var.M();
            if (J != 0) {
                j10 = J;
            }
        }
        e0Var.V(16);
        int q11 = e0Var.q();
        int q12 = e0Var.q();
        e0Var.V(4);
        int q13 = e0Var.q();
        int q14 = e0Var.q();
        if (q11 == 0 && q12 == 65536 && q13 == -65536 && q14 == 0) {
            i11 = 90;
        } else if (q11 == 0 && q12 == -65536 && q13 == 65536 && q14 == 0) {
            i11 = 270;
        } else if (q11 == -65536 && q12 == 0 && q13 == 0 && q14 == -65536) {
            i11 = 180;
        }
        return new g(q10, j10, i11);
    }

    private static o z(a.C0260a c0260a, a.b bVar, long j10, x6.m mVar, boolean z10, boolean z11) {
        a.b bVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        a.C0260a f10;
        Pair<long[], long[]> h10;
        a.C0260a c0260a2 = (a.C0260a) t8.a.e(c0260a.f(1835297121));
        int d10 = d(k(((a.b) t8.a.e(c0260a2.g(1751411826))).f15875b));
        if (d10 == -1) {
            return null;
        }
        g y10 = y(((a.b) t8.a.e(c0260a.g(1953196132))).f15875b);
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = y10.f15903b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long p10 = p(bVar2.f15875b);
        long O0 = j11 != -9223372036854775807L ? r0.O0(j11, 1000000L, p10) : -9223372036854775807L;
        a.C0260a c0260a3 = (a.C0260a) t8.a.e(((a.C0260a) t8.a.e(c0260a2.f(1835626086))).f(1937007212));
        Pair<Long, String> m10 = m(((a.b) t8.a.e(c0260a2.g(1835296868))).f15875b);
        a.b g10 = c0260a3.g(1937011556);
        if (g10 == null) {
            throw b3.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        d w10 = w(g10.f15875b, y10.f15902a, y10.f15904c, (String) m10.second, mVar, z11);
        if (z10 || (f10 = c0260a.f(1701082227)) == null || (h10 = h(f10)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) h10.first;
            jArr2 = (long[]) h10.second;
            jArr = jArr3;
        }
        if (w10.f15891b == null) {
            return null;
        }
        return new o(y10.f15902a, d10, ((Long) m10.first).longValue(), p10, O0, w10.f15891b, w10.f15893d, w10.f15890a, w10.f15892c, jArr, jArr2);
    }
}
