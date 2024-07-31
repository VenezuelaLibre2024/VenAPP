package y6;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t6.b3;
import t8.r0;

/* loaded from: classes.dex */
public final class e0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f31724a;

        /* renamed from: b */
        public final int f31725b;

        /* renamed from: c */
        public final long[] f31726c;

        /* renamed from: d */
        public final int f31727d;

        /* renamed from: e */
        public final boolean f31728e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f31724a = i10;
            this.f31725b = i11;
            this.f31726c = jArr;
            this.f31727d = i12;
            this.f31728e = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f31729a;

        /* renamed from: b */
        public final String[] f31730b;

        /* renamed from: c */
        public final int f31731c;

        public b(String str, String[] strArr, int i10) {
            this.f31729a = str;
            this.f31730b = strArr;
            this.f31731c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final boolean f31732a;

        /* renamed from: b */
        public final int f31733b;

        /* renamed from: c */
        public final int f31734c;

        /* renamed from: d */
        public final int f31735d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f31732a = z10;
            this.f31733b = i10;
            this.f31734c = i11;
            this.f31735d = i12;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final int f31736a;

        /* renamed from: b */
        public final int f31737b;

        /* renamed from: c */
        public final int f31738c;

        /* renamed from: d */
        public final int f31739d;

        /* renamed from: e */
        public final int f31740e;

        /* renamed from: f */
        public final int f31741f;

        /* renamed from: g */
        public final int f31742g;

        /* renamed from: h */
        public final int f31743h;

        /* renamed from: i */
        public final boolean f31744i;

        /* renamed from: j */
        public final byte[] f31745j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f31736a = i10;
            this.f31737b = i11;
            this.f31738c = i12;
            this.f31739d = i13;
            this.f31740e = i14;
            this.f31741f = i15;
            this.f31742g = i16;
            this.f31743h = i17;
            this.f31744i = z10;
            this.f31745j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static l7.a c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] S0 = r0.S0(str, "=");
            if (S0.length != 2) {
                t8.s.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (S0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(o7.a.a(new t8.e0(Base64.decode(S0[1], 0))));
                } catch (RuntimeException e10) {
                    t8.s.j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new t7.a(S0[0], S0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new l7.a(arrayList);
    }

    private static a d(d0 d0Var) {
        if (d0Var.d(24) != 5653314) {
            throw b3.a("expected code book to start with [0x56, 0x43, 0x42] at " + d0Var.b(), null);
        }
        int d10 = d0Var.d(16);
        int d11 = d0Var.d(24);
        long[] jArr = new long[d11];
        boolean c10 = d0Var.c();
        long j10 = 0;
        if (c10) {
            int d12 = d0Var.d(5) + 1;
            int i10 = 0;
            while (i10 < d11) {
                int d13 = d0Var.d(a(d11 - i10));
                for (int i11 = 0; i11 < d13 && i10 < d11; i11++) {
                    jArr[i10] = d12;
                    i10++;
                }
                d12++;
            }
        } else {
            boolean c11 = d0Var.c();
            for (int i12 = 0; i12 < d11; i12++) {
                if (!c11) {
                    jArr[i12] = d0Var.d(5) + 1;
                } else if (d0Var.c()) {
                    jArr[i12] = d0Var.d(5) + 1;
                } else {
                    jArr[i12] = 0;
                }
            }
        }
        int d14 = d0Var.d(4);
        if (d14 > 2) {
            throw b3.a("lookup type greater than 2 not decodable: " + d14, null);
        }
        if (d14 == 1 || d14 == 2) {
            d0Var.e(32);
            d0Var.e(32);
            int d15 = d0Var.d(4) + 1;
            d0Var.e(1);
            if (d14 != 1) {
                j10 = d11 * d10;
            } else if (d10 != 0) {
                j10 = b(d11, d10);
            }
            d0Var.e((int) (j10 * d15));
        }
        return new a(d10, d11, jArr, d14, c10);
    }

    private static void e(d0 d0Var) {
        int d10 = d0Var.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            int d11 = d0Var.d(16);
            if (d11 == 0) {
                d0Var.e(8);
                d0Var.e(16);
                d0Var.e(16);
                d0Var.e(6);
                d0Var.e(8);
                int d12 = d0Var.d(4) + 1;
                for (int i11 = 0; i11 < d12; i11++) {
                    d0Var.e(8);
                }
            } else {
                if (d11 != 1) {
                    throw b3.a("floor type greater than 1 not decodable: " + d11, null);
                }
                int d13 = d0Var.d(5);
                int[] iArr = new int[d13];
                int i12 = -1;
                for (int i13 = 0; i13 < d13; i13++) {
                    int d14 = d0Var.d(4);
                    iArr[i13] = d14;
                    if (d14 > i12) {
                        i12 = d14;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = d0Var.d(3) + 1;
                    int d15 = d0Var.d(2);
                    if (d15 > 0) {
                        d0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << d15); i16++) {
                        d0Var.e(8);
                    }
                }
                d0Var.e(2);
                int d16 = d0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < d13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        d0Var.e(d16);
                        i18++;
                    }
                }
            }
        }
    }

    private static void f(int i10, d0 d0Var) {
        int d10 = d0Var.d(6) + 1;
        for (int i11 = 0; i11 < d10; i11++) {
            int d11 = d0Var.d(16);
            if (d11 != 0) {
                t8.s.c("VorbisUtil", "mapping type other than 0 not supported: " + d11);
            } else {
                int d12 = d0Var.c() ? d0Var.d(4) + 1 : 1;
                if (d0Var.c()) {
                    int d13 = d0Var.d(8) + 1;
                    for (int i12 = 0; i12 < d13; i12++) {
                        int i13 = i10 - 1;
                        d0Var.e(a(i13));
                        d0Var.e(a(i13));
                    }
                }
                if (d0Var.d(2) != 0) {
                    throw b3.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (d12 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        d0Var.e(4);
                    }
                }
                for (int i15 = 0; i15 < d12; i15++) {
                    d0Var.e(8);
                    d0Var.e(8);
                    d0Var.e(8);
                }
            }
        }
    }

    private static c[] g(d0 d0Var) {
        int d10 = d0Var.d(6) + 1;
        c[] cVarArr = new c[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            cVarArr[i10] = new c(d0Var.c(), d0Var.d(16), d0Var.d(16), d0Var.d(8));
        }
        return cVarArr;
    }

    private static void h(d0 d0Var) {
        int d10 = d0Var.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            if (d0Var.d(16) > 2) {
                throw b3.a("residueType greater than 2 is not decodable", null);
            }
            d0Var.e(24);
            d0Var.e(24);
            d0Var.e(24);
            int d11 = d0Var.d(6) + 1;
            d0Var.e(8);
            int[] iArr = new int[d11];
            for (int i11 = 0; i11 < d11; i11++) {
                iArr[i11] = ((d0Var.c() ? d0Var.d(5) : 0) * 8) + d0Var.d(3);
            }
            for (int i12 = 0; i12 < d11; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        d0Var.e(8);
                    }
                }
            }
        }
    }

    public static b i(t8.e0 e0Var) {
        return j(e0Var, true, true);
    }

    public static b j(t8.e0 e0Var, boolean z10, boolean z11) {
        if (z10) {
            m(3, e0Var, false);
        }
        String E = e0Var.E((int) e0Var.x());
        int length = 11 + E.length();
        long x10 = e0Var.x();
        String[] strArr = new String[(int) x10];
        int i10 = length + 4;
        for (int i11 = 0; i11 < x10; i11++) {
            String E2 = e0Var.E((int) e0Var.x());
            strArr[i11] = E2;
            i10 = i10 + 4 + E2.length();
        }
        if (z11 && (e0Var.H() & 1) == 0) {
            throw b3.a("framing bit expected to be set", null);
        }
        return new b(E, strArr, i10 + 1);
    }

    public static d k(t8.e0 e0Var) {
        m(1, e0Var, false);
        int y10 = e0Var.y();
        int H = e0Var.H();
        int y11 = e0Var.y();
        int u10 = e0Var.u();
        if (u10 <= 0) {
            u10 = -1;
        }
        int u11 = e0Var.u();
        if (u11 <= 0) {
            u11 = -1;
        }
        int u12 = e0Var.u();
        if (u12 <= 0) {
            u12 = -1;
        }
        int H2 = e0Var.H();
        return new d(y10, H, y11, u10, u11, u12, (int) Math.pow(2.0d, H2 & 15), (int) Math.pow(2.0d, (H2 & 240) >> 4), (e0Var.H() & 1) > 0, Arrays.copyOf(e0Var.e(), e0Var.g()));
    }

    public static c[] l(t8.e0 e0Var, int i10) {
        m(5, e0Var, false);
        int H = e0Var.H() + 1;
        d0 d0Var = new d0(e0Var.e());
        d0Var.e(e0Var.f() * 8);
        for (int i11 = 0; i11 < H; i11++) {
            d(d0Var);
        }
        int d10 = d0Var.d(6) + 1;
        for (int i12 = 0; i12 < d10; i12++) {
            if (d0Var.d(16) != 0) {
                throw b3.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        e(d0Var);
        h(d0Var);
        f(i10, d0Var);
        c[] g10 = g(d0Var);
        if (d0Var.c()) {
            return g10;
        }
        throw b3.a("framing bit after modes not set as expected", null);
    }

    public static boolean m(int i10, t8.e0 e0Var, boolean z10) {
        if (e0Var.a() < 7) {
            if (z10) {
                return false;
            }
            throw b3.a("too short header: " + e0Var.a(), null);
        }
        if (e0Var.H() != i10) {
            if (z10) {
                return false;
            }
            throw b3.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (e0Var.H() == 118 && e0Var.H() == 111 && e0Var.H() == 114 && e0Var.H() == 98 && e0Var.H() == 105 && e0Var.H() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw b3.a("expected characters 'vorbis'", null);
    }
}
