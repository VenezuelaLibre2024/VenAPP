package p459y6;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p216l7.C9400a;
import p267o7.C9817a;
import p361t6.C11005b3;
import p362t7.C11136a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: y6.e0 */
/* loaded from: classes.dex */
public final class C12615e0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y6.e0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f34260a;

        /* renamed from: b */
        public final int f34261b;

        /* renamed from: c */
        public final long[] f34262c;

        /* renamed from: d */
        public final int f34263d;

        /* renamed from: e */
        public final boolean f34264e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f34260a = i10;
            this.f34261b = i11;
            this.f34262c = jArr;
            this.f34263d = i12;
            this.f34264e = z10;
        }
    }

    /* renamed from: y6.e0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f34265a;

        /* renamed from: b */
        public final String[] f34266b;

        /* renamed from: c */
        public final int f34267c;

        public b(String str, String[] strArr, int i10) {
            this.f34265a = str;
            this.f34266b = strArr;
            this.f34267c = i10;
        }
    }

    /* renamed from: y6.e0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final boolean f34268a;

        /* renamed from: b */
        public final int f34269b;

        /* renamed from: c */
        public final int f34270c;

        /* renamed from: d */
        public final int f34271d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f34268a = z10;
            this.f34269b = i10;
            this.f34270c = i11;
            this.f34271d = i12;
        }
    }

    /* renamed from: y6.e0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final int f34272a;

        /* renamed from: b */
        public final int f34273b;

        /* renamed from: c */
        public final int f34274c;

        /* renamed from: d */
        public final int f34275d;

        /* renamed from: e */
        public final int f34276e;

        /* renamed from: f */
        public final int f34277f;

        /* renamed from: g */
        public final int f34278g;

        /* renamed from: h */
        public final int f34279h;

        /* renamed from: i */
        public final boolean f34280i;

        /* renamed from: j */
        public final byte[] f34281j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f34272a = i10;
            this.f34273b = i11;
            this.f34274c = i12;
            this.f34275d = i13;
            this.f34276e = i14;
            this.f34277f = i15;
            this.f34278g = i16;
            this.f34279h = i17;
            this.f34280i = z10;
            this.f34281j = bArr;
        }
    }

    /* renamed from: a */
    public static int m41542a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    /* renamed from: b */
    private static long m41543b(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    /* renamed from: c */
    public static C9400a m41544c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] m34893S0 = C11172r0.m34893S0(str, "=");
            if (m34893S0.length != 2) {
                C11173s.m34970i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (m34893S0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C9817a.m29486a(new C11146e0(Base64.decode(m34893S0[1], 0))));
                } catch (RuntimeException e10) {
                    C11173s.m34971j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new C11136a(m34893S0[0], m34893S0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C9400a(arrayList);
    }

    /* renamed from: d */
    private static a m41545d(C12613d0 c12613d0) {
        if (c12613d0.m41524d(24) != 5653314) {
            throw C11005b3.m33715a("expected code book to start with [0x56, 0x43, 0x42] at " + c12613d0.m41522b(), null);
        }
        int m41524d = c12613d0.m41524d(16);
        int m41524d2 = c12613d0.m41524d(24);
        long[] jArr = new long[m41524d2];
        boolean m41523c = c12613d0.m41523c();
        long j10 = 0;
        if (m41523c) {
            int m41524d3 = c12613d0.m41524d(5) + 1;
            int i10 = 0;
            while (i10 < m41524d2) {
                int m41524d4 = c12613d0.m41524d(m41542a(m41524d2 - i10));
                for (int i11 = 0; i11 < m41524d4 && i10 < m41524d2; i11++) {
                    jArr[i10] = m41524d3;
                    i10++;
                }
                m41524d3++;
            }
        } else {
            boolean m41523c2 = c12613d0.m41523c();
            for (int i12 = 0; i12 < m41524d2; i12++) {
                if (!m41523c2) {
                    jArr[i12] = c12613d0.m41524d(5) + 1;
                } else if (c12613d0.m41523c()) {
                    jArr[i12] = c12613d0.m41524d(5) + 1;
                } else {
                    jArr[i12] = 0;
                }
            }
        }
        int m41524d5 = c12613d0.m41524d(4);
        if (m41524d5 > 2) {
            throw C11005b3.m33715a("lookup type greater than 2 not decodable: " + m41524d5, null);
        }
        if (m41524d5 == 1 || m41524d5 == 2) {
            c12613d0.m41525e(32);
            c12613d0.m41525e(32);
            int m41524d6 = c12613d0.m41524d(4) + 1;
            c12613d0.m41525e(1);
            if (m41524d5 != 1) {
                j10 = m41524d2 * m41524d;
            } else if (m41524d != 0) {
                j10 = m41543b(m41524d2, m41524d);
            }
            c12613d0.m41525e((int) (j10 * m41524d6));
        }
        return new a(m41524d, m41524d2, jArr, m41524d5, m41523c);
    }

    /* renamed from: e */
    private static void m41546e(C12613d0 c12613d0) {
        int m41524d = c12613d0.m41524d(6) + 1;
        for (int i10 = 0; i10 < m41524d; i10++) {
            int m41524d2 = c12613d0.m41524d(16);
            if (m41524d2 == 0) {
                c12613d0.m41525e(8);
                c12613d0.m41525e(16);
                c12613d0.m41525e(16);
                c12613d0.m41525e(6);
                c12613d0.m41525e(8);
                int m41524d3 = c12613d0.m41524d(4) + 1;
                for (int i11 = 0; i11 < m41524d3; i11++) {
                    c12613d0.m41525e(8);
                }
            } else {
                if (m41524d2 != 1) {
                    throw C11005b3.m33715a("floor type greater than 1 not decodable: " + m41524d2, null);
                }
                int m41524d4 = c12613d0.m41524d(5);
                int[] iArr = new int[m41524d4];
                int i12 = -1;
                for (int i13 = 0; i13 < m41524d4; i13++) {
                    int m41524d5 = c12613d0.m41524d(4);
                    iArr[i13] = m41524d5;
                    if (m41524d5 > i12) {
                        i12 = m41524d5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = c12613d0.m41524d(3) + 1;
                    int m41524d6 = c12613d0.m41524d(2);
                    if (m41524d6 > 0) {
                        c12613d0.m41525e(8);
                    }
                    for (int i16 = 0; i16 < (1 << m41524d6); i16++) {
                        c12613d0.m41525e(8);
                    }
                }
                c12613d0.m41525e(2);
                int m41524d7 = c12613d0.m41524d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < m41524d4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        c12613d0.m41525e(m41524d7);
                        i18++;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private static void m41547f(int i10, C12613d0 c12613d0) {
        int m41524d = c12613d0.m41524d(6) + 1;
        for (int i11 = 0; i11 < m41524d; i11++) {
            int m41524d2 = c12613d0.m41524d(16);
            if (m41524d2 != 0) {
                C11173s.m34964c("VorbisUtil", "mapping type other than 0 not supported: " + m41524d2);
            } else {
                int m41524d3 = c12613d0.m41523c() ? c12613d0.m41524d(4) + 1 : 1;
                if (c12613d0.m41523c()) {
                    int m41524d4 = c12613d0.m41524d(8) + 1;
                    for (int i12 = 0; i12 < m41524d4; i12++) {
                        int i13 = i10 - 1;
                        c12613d0.m41525e(m41542a(i13));
                        c12613d0.m41525e(m41542a(i13));
                    }
                }
                if (c12613d0.m41524d(2) != 0) {
                    throw C11005b3.m33715a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (m41524d3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        c12613d0.m41525e(4);
                    }
                }
                for (int i15 = 0; i15 < m41524d3; i15++) {
                    c12613d0.m41525e(8);
                    c12613d0.m41525e(8);
                    c12613d0.m41525e(8);
                }
            }
        }
    }

    /* renamed from: g */
    private static c[] m41548g(C12613d0 c12613d0) {
        int m41524d = c12613d0.m41524d(6) + 1;
        c[] cVarArr = new c[m41524d];
        for (int i10 = 0; i10 < m41524d; i10++) {
            cVarArr[i10] = new c(c12613d0.m41523c(), c12613d0.m41524d(16), c12613d0.m41524d(16), c12613d0.m41524d(8));
        }
        return cVarArr;
    }

    /* renamed from: h */
    private static void m41549h(C12613d0 c12613d0) {
        int m41524d = c12613d0.m41524d(6) + 1;
        for (int i10 = 0; i10 < m41524d; i10++) {
            if (c12613d0.m41524d(16) > 2) {
                throw C11005b3.m33715a("residueType greater than 2 is not decodable", null);
            }
            c12613d0.m41525e(24);
            c12613d0.m41525e(24);
            c12613d0.m41525e(24);
            int m41524d2 = c12613d0.m41524d(6) + 1;
            c12613d0.m41525e(8);
            int[] iArr = new int[m41524d2];
            for (int i11 = 0; i11 < m41524d2; i11++) {
                iArr[i11] = ((c12613d0.m41523c() ? c12613d0.m41524d(5) : 0) * 8) + c12613d0.m41524d(3);
            }
            for (int i12 = 0; i12 < m41524d2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        c12613d0.m41525e(8);
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public static b m41550i(C11146e0 c11146e0) {
        return m41551j(c11146e0, true, true);
    }

    /* renamed from: j */
    public static b m41551j(C11146e0 c11146e0, boolean z10, boolean z11) {
        if (z10) {
            m41554m(3, c11146e0, false);
        }
        String m34661E = c11146e0.m34661E((int) c11146e0.m34699x());
        int length = 11 + m34661E.length();
        long m34699x = c11146e0.m34699x();
        String[] strArr = new String[(int) m34699x];
        int i10 = length + 4;
        for (int i11 = 0; i11 < m34699x; i11++) {
            String m34661E2 = c11146e0.m34661E((int) c11146e0.m34699x());
            strArr[i11] = m34661E2;
            i10 = i10 + 4 + m34661E2.length();
        }
        if (z11 && (c11146e0.m34664H() & 1) == 0) {
            throw C11005b3.m33715a("framing bit expected to be set", null);
        }
        return new b(m34661E, strArr, i10 + 1);
    }

    /* renamed from: k */
    public static d m41552k(C11146e0 c11146e0) {
        m41554m(1, c11146e0, false);
        int m34700y = c11146e0.m34700y();
        int m34664H = c11146e0.m34664H();
        int m34700y2 = c11146e0.m34700y();
        int m34696u = c11146e0.m34696u();
        if (m34696u <= 0) {
            m34696u = -1;
        }
        int m34696u2 = c11146e0.m34696u();
        if (m34696u2 <= 0) {
            m34696u2 = -1;
        }
        int m34696u3 = c11146e0.m34696u();
        if (m34696u3 <= 0) {
            m34696u3 = -1;
        }
        int m34664H2 = c11146e0.m34664H();
        return new d(m34700y, m34664H, m34700y2, m34696u, m34696u2, m34696u3, (int) Math.pow(2.0d, m34664H2 & 15), (int) Math.pow(2.0d, (m34664H2 & 240) >> 4), (c11146e0.m34664H() & 1) > 0, Arrays.copyOf(c11146e0.m34682e(), c11146e0.m34684g()));
    }

    /* renamed from: l */
    public static c[] m41553l(C11146e0 c11146e0, int i10) {
        m41554m(5, c11146e0, false);
        int m34664H = c11146e0.m34664H() + 1;
        C12613d0 c12613d0 = new C12613d0(c11146e0.m34682e());
        c12613d0.m41525e(c11146e0.m34683f() * 8);
        for (int i11 = 0; i11 < m34664H; i11++) {
            m41545d(c12613d0);
        }
        int m41524d = c12613d0.m41524d(6) + 1;
        for (int i12 = 0; i12 < m41524d; i12++) {
            if (c12613d0.m41524d(16) != 0) {
                throw C11005b3.m33715a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        m41546e(c12613d0);
        m41549h(c12613d0);
        m41547f(i10, c12613d0);
        c[] m41548g = m41548g(c12613d0);
        if (c12613d0.m41523c()) {
            return m41548g;
        }
        throw C11005b3.m33715a("framing bit after modes not set as expected", null);
    }

    /* renamed from: m */
    public static boolean m41554m(int i10, C11146e0 c11146e0, boolean z10) {
        if (c11146e0.m34679a() < 7) {
            if (z10) {
                return false;
            }
            throw C11005b3.m33715a("too short header: " + c11146e0.m34679a(), null);
        }
        if (c11146e0.m34664H() != i10) {
            if (z10) {
                return false;
            }
            throw C11005b3.m33715a("expected header type " + Integer.toHexString(i10), null);
        }
        if (c11146e0.m34664H() == 118 && c11146e0.m34664H() == 111 && c11146e0.m34664H() == 114 && c11146e0.m34664H() == 98 && c11146e0.m34664H() == 105 && c11146e0.m34664H() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw C11005b3.m33715a("expected characters 'vorbis'", null);
    }
}
