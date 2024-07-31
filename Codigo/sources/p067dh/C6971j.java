package p067dh;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import kg.C9264b;
import p066dg.C6947h;

/* renamed from: dh.j */
/* loaded from: classes2.dex */
public final class C6971j {

    /* renamed from: e */
    private static final int[] f15528e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C6971j[] f15529f = m20156b();

    /* renamed from: a */
    private final int f15530a;

    /* renamed from: b */
    private final int[] f15531b;

    /* renamed from: c */
    private final b[] f15532c;

    /* renamed from: d */
    private final int f15533d;

    /* renamed from: dh.j$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final int f15534a;

        /* renamed from: b */
        private final int f15535b;

        a(int i10, int i11) {
            this.f15534a = i10;
            this.f15535b = i11;
        }

        /* renamed from: a */
        public int m20166a() {
            return this.f15534a;
        }

        /* renamed from: b */
        public int m20167b() {
            return this.f15535b;
        }
    }

    /* renamed from: dh.j$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final int f15536a;

        /* renamed from: b */
        private final a[] f15537b;

        b(int i10, a... aVarArr) {
            this.f15536a = i10;
            this.f15537b = aVarArr;
        }

        /* renamed from: a */
        public a[] m20168a() {
            return this.f15537b;
        }

        /* renamed from: b */
        public int m20169b() {
            return this.f15536a;
        }

        /* renamed from: c */
        public int m20170c() {
            int i10 = 0;
            for (a aVar : this.f15537b) {
                i10 += aVar.m20166a();
            }
            return i10;
        }

        /* renamed from: d */
        public int m20171d() {
            return this.f15536a * m20170c();
        }
    }

    private C6971j(int i10, int[] iArr, b... bVarArr) {
        this.f15530a = i10;
        this.f15531b = iArr;
        this.f15532c = bVarArr;
        int m20169b = bVarArr[0].m20169b();
        int i11 = 0;
        for (a aVar : bVarArr[0].m20168a()) {
            i11 += aVar.m20166a() * (aVar.m20167b() + m20169b);
        }
        this.f15533d = i11;
    }

    /* renamed from: b */
    private static C6971j[] m20156b() {
        return new C6971j[]{new C6971j(1, new int[0], new b(7, new a(1, 19)), new b(10, new a(1, 16)), new b(13, new a(1, 13)), new b(17, new a(1, 9))), new C6971j(2, new int[]{6, 18}, new b(10, new a(1, 34)), new b(16, new a(1, 28)), new b(22, new a(1, 22)), new b(28, new a(1, 16))), new C6971j(3, new int[]{6, 22}, new b(15, new a(1, 55)), new b(26, new a(1, 44)), new b(18, new a(2, 17)), new b(22, new a(2, 13))), new C6971j(4, new int[]{6, 26}, new b(20, new a(1, 80)), new b(18, new a(2, 32)), new b(26, new a(2, 24)), new b(16, new a(4, 9))), new C6971j(5, new int[]{6, 30}, new b(26, new a(1, 108)), new b(24, new a(2, 43)), new b(18, new a(2, 15), new a(2, 16)), new b(22, new a(2, 11), new a(2, 12))), new C6971j(6, new int[]{6, 34}, new b(18, new a(2, 68)), new b(16, new a(4, 27)), new b(24, new a(4, 19)), new b(28, new a(4, 15))), new C6971j(7, new int[]{6, 22, 38}, new b(20, new a(2, 78)), new b(18, new a(4, 31)), new b(18, new a(2, 14), new a(4, 15)), new b(26, new a(4, 13), new a(1, 14))), new C6971j(8, new int[]{6, 24, 42}, new b(24, new a(2, 97)), new b(22, new a(2, 38), new a(2, 39)), new b(22, new a(4, 18), new a(2, 19)), new b(26, new a(4, 14), new a(2, 15))), new C6971j(9, new int[]{6, 26, 46}, new b(30, new a(2, 116)), new b(22, new a(3, 36), new a(2, 37)), new b(20, new a(4, 16), new a(4, 17)), new b(24, new a(4, 12), new a(4, 13))), new C6971j(10, new int[]{6, 28, 50}, new b(18, new a(2, 68), new a(2, 69)), new b(26, new a(4, 43), new a(1, 44)), new b(24, new a(6, 19), new a(2, 20)), new b(28, new a(6, 15), new a(2, 16))), new C6971j(11, new int[]{6, 30, 54}, new b(20, new a(4, 81)), new b(30, new a(1, 50), new a(4, 51)), new b(28, new a(4, 22), new a(4, 23)), new b(24, new a(3, 12), new a(8, 13))), new C6971j(12, new int[]{6, 32, 58}, new b(24, new a(2, 92), new a(2, 93)), new b(22, new a(6, 36), new a(2, 37)), new b(26, new a(4, 20), new a(6, 21)), new b(28, new a(7, 14), new a(4, 15))), new C6971j(13, new int[]{6, 34, 62}, new b(26, new a(4, 107)), new b(22, new a(8, 37), new a(1, 38)), new b(24, new a(8, 20), new a(4, 21)), new b(22, new a(12, 11), new a(4, 12))), new C6971j(14, new int[]{6, 26, 46, 66}, new b(30, new a(3, 115), new a(1, 116)), new b(24, new a(4, 40), new a(5, 41)), new b(20, new a(11, 16), new a(5, 17)), new b(24, new a(11, 12), new a(5, 13))), new C6971j(15, new int[]{6, 26, 48, 70}, new b(22, new a(5, 87), new a(1, 88)), new b(24, new a(5, 41), new a(5, 42)), new b(30, new a(5, 24), new a(7, 25)), new b(24, new a(11, 12), new a(7, 13))), new C6971j(16, new int[]{6, 26, 50, 74}, new b(24, new a(5, 98), new a(1, 99)), new b(28, new a(7, 45), new a(3, 46)), new b(24, new a(15, 19), new a(2, 20)), new b(30, new a(3, 15), new a(13, 16))), new C6971j(17, new int[]{6, 30, 54, 78}, new b(28, new a(1, 107), new a(5, 108)), new b(28, new a(10, 46), new a(1, 47)), new b(28, new a(1, 22), new a(15, 23)), new b(28, new a(2, 14), new a(17, 15))), new C6971j(18, new int[]{6, 30, 56, 82}, new b(30, new a(5, 120), new a(1, 121)), new b(26, new a(9, 43), new a(4, 44)), new b(28, new a(17, 22), new a(1, 23)), new b(28, new a(2, 14), new a(19, 15))), new C6971j(19, new int[]{6, 30, 58, 86}, new b(28, new a(3, 113), new a(4, 114)), new b(26, new a(3, 44), new a(11, 45)), new b(26, new a(17, 21), new a(4, 22)), new b(26, new a(9, 13), new a(16, 14))), new C6971j(20, new int[]{6, 34, 62, 90}, new b(28, new a(3, 107), new a(5, 108)), new b(26, new a(3, 41), new a(13, 42)), new b(30, new a(15, 24), new a(5, 25)), new b(28, new a(15, 15), new a(10, 16))), new C6971j(21, new int[]{6, 28, 50, 72, 94}, new b(28, new a(4, 116), new a(4, 117)), new b(26, new a(17, 42)), new b(28, new a(17, 22), new a(6, 23)), new b(30, new a(19, 16), new a(6, 17))), new C6971j(22, new int[]{6, 26, 50, 74, 98}, new b(28, new a(2, 111), new a(7, 112)), new b(28, new a(17, 46)), new b(30, new a(7, 24), new a(16, 25)), new b(24, new a(34, 13))), new C6971j(23, new int[]{6, 30, 54, 78, 102}, new b(30, new a(4, 121), new a(5, 122)), new b(28, new a(4, 47), new a(14, 48)), new b(30, new a(11, 24), new a(14, 25)), new b(30, new a(16, 15), new a(14, 16))), new C6971j(24, new int[]{6, 28, 54, 80, 106}, new b(30, new a(6, 117), new a(4, 118)), new b(28, new a(6, 45), new a(14, 46)), new b(30, new a(11, 24), new a(16, 25)), new b(30, new a(30, 16), new a(2, 17))), new C6971j(25, new int[]{6, 32, 58, 84, 110}, new b(26, new a(8, 106), new a(4, 107)), new b(28, new a(8, 47), new a(13, 48)), new b(30, new a(7, 24), new a(22, 25)), new b(30, new a(22, 15), new a(13, 16))), new C6971j(26, new int[]{6, 30, 58, 86, 114}, new b(28, new a(10, 114), new a(2, 115)), new b(28, new a(19, 46), new a(4, 47)), new b(28, new a(28, 22), new a(6, 23)), new b(30, new a(33, 16), new a(4, 17))), new C6971j(27, new int[]{6, 34, 62, 90, 118}, new b(30, new a(8, 122), new a(4, 123)), new b(28, new a(22, 45), new a(3, 46)), new b(30, new a(8, 23), new a(26, 24)), new b(30, new a(12, 15), new a(28, 16))), new C6971j(28, new int[]{6, 26, 50, 74, 98, 122}, new b(30, new a(3, 117), new a(10, 118)), new b(28, new a(3, 45), new a(23, 46)), new b(30, new a(4, 24), new a(31, 25)), new b(30, new a(11, 15), new a(31, 16))), new C6971j(29, new int[]{6, 30, 54, 78, 102, 126}, new b(30, new a(7, 116), new a(7, 117)), new b(28, new a(21, 45), new a(7, 46)), new b(30, new a(1, 23), new a(37, 24)), new b(30, new a(19, 15), new a(26, 16))), new C6971j(30, new int[]{6, 26, 52, 78, 104, 130}, new b(30, new a(5, 115), new a(10, 116)), new b(28, new a(19, 47), new a(10, 48)), new b(30, new a(15, 24), new a(25, 25)), new b(30, new a(23, 15), new a(25, 16))), new C6971j(31, new int[]{6, 30, 56, 82, 108, 134}, new b(30, new a(13, 115), new a(3, 116)), new b(28, new a(2, 46), new a(29, 47)), new b(30, new a(42, 24), new a(1, 25)), new b(30, new a(23, 15), new a(28, 16))), new C6971j(32, new int[]{6, 34, 60, 86, 112, 138}, new b(30, new a(17, 115)), new b(28, new a(10, 46), new a(23, 47)), new b(30, new a(10, 24), new a(35, 25)), new b(30, new a(19, 15), new a(35, 16))), new C6971j(33, new int[]{6, 30, 58, 86, 114, 142}, new b(30, new a(17, 115), new a(1, 116)), new b(28, new a(14, 46), new a(21, 47)), new b(30, new a(29, 24), new a(19, 25)), new b(30, new a(11, 15), new a(46, 16))), new C6971j(34, new int[]{6, 34, 62, 90, 118, 146}, new b(30, new a(13, 115), new a(6, 116)), new b(28, new a(14, 46), new a(23, 47)), new b(30, new a(44, 24), new a(7, 25)), new b(30, new a(59, 16), new a(1, 17))), new C6971j(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new b(30, new a(12, 121), new a(7, 122)), new b(28, new a(12, 47), new a(26, 48)), new b(30, new a(39, 24), new a(14, 25)), new b(30, new a(22, 15), new a(41, 16))), new C6971j(36, new int[]{6, 24, 50, 76, 102, RecognitionOptions.ITF, 154}, new b(30, new a(6, 121), new a(14, 122)), new b(28, new a(6, 47), new a(34, 48)), new b(30, new a(46, 24), new a(10, 25)), new b(30, new a(2, 15), new a(64, 16))), new C6971j(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new b(30, new a(17, 122), new a(4, 123)), new b(28, new a(29, 46), new a(14, 47)), new b(30, new a(49, 24), new a(10, 25)), new b(30, new a(24, 15), new a(46, 16))), new C6971j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new b(30, new a(4, 122), new a(18, 123)), new b(28, new a(13, 46), new a(32, 47)), new b(30, new a(48, 24), new a(14, 25)), new b(30, new a(42, 15), new a(32, 16))), new C6971j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new b(30, new a(20, 117), new a(4, 118)), new b(28, new a(40, 47), new a(7, 48)), new b(30, new a(43, 24), new a(22, 25)), new b(30, new a(10, 15), new a(67, 16))), new C6971j(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new b(30, new a(19, 118), new a(6, 119)), new b(28, new a(18, 47), new a(31, 48)), new b(30, new a(34, 24), new a(34, 25)), new b(30, new a(20, 15), new a(61, 16)))};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C6971j m20157c(int i10) {
        int i11 = C5101a.e.API_PRIORITY_OTHER;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = f15528e;
            if (i12 >= iArr.length) {
                if (i11 <= 3) {
                    return m20159i(i13);
                }
                return null;
            }
            int i14 = iArr[i12];
            if (i14 == i10) {
                return m20159i(i12 + 7);
            }
            int m20149e = C6968g.m20149e(i10, i14);
            if (m20149e < i11) {
                i13 = i12 + 7;
                i11 = m20149e;
            }
            i12++;
        }
    }

    /* renamed from: g */
    public static C6971j m20158g(int i10) {
        if (i10 % 4 != 1) {
            throw C6947h.m20094a();
        }
        try {
            return m20159i((i10 - 17) / 4);
        } catch (IllegalArgumentException unused) {
            throw C6947h.m20094a();
        }
    }

    /* renamed from: i */
    public static C6971j m20159i(int i10) {
        if (i10 < 1 || i10 > 40) {
            throw new IllegalArgumentException();
        }
        return f15529f[i10 - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C9264b m20160a() {
        int m20162e = m20162e();
        C9264b c9264b = new C9264b(m20162e);
        c9264b.m27613s(0, 0, 9, 9);
        int i10 = m20162e - 8;
        c9264b.m27613s(i10, 0, 8, 9);
        c9264b.m27613s(0, i10, 9, 8);
        int length = this.f15531b.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = this.f15531b[i11] - 2;
            for (int i13 = 0; i13 < length; i13++) {
                if ((i11 != 0 || (i13 != 0 && i13 != length - 1)) && (i11 != length - 1 || i13 != 0)) {
                    c9264b.m27613s(this.f15531b[i13] - 2, i12, 5, 5);
                }
            }
        }
        int i14 = m20162e - 17;
        c9264b.m27613s(6, 9, 1, i14);
        c9264b.m27613s(9, 6, i14, 1);
        if (this.f15530a > 6) {
            int i15 = m20162e - 11;
            c9264b.m27613s(i15, 0, 3, 6);
            c9264b.m27613s(0, i15, 6, 3);
        }
        return c9264b;
    }

    /* renamed from: d */
    public int[] m20161d() {
        return this.f15531b;
    }

    /* renamed from: e */
    public int m20162e() {
        return (this.f15530a * 4) + 17;
    }

    /* renamed from: f */
    public b m20163f(EnumC6967f enumC6967f) {
        return this.f15532c[enumC6967f.ordinal()];
    }

    /* renamed from: h */
    public int m20164h() {
        return this.f15533d;
    }

    /* renamed from: j */
    public int m20165j() {
        return this.f15530a;
    }

    public String toString() {
        return String.valueOf(this.f15530a);
    }
}
