package p109fh;

import com.google.android.gms.common.api.C5101a;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.C9263a;
import kg.C9270h;
import p066dg.C6961v;
import p067dh.C6971j;
import p067dh.EnumC6967f;
import p067dh.EnumC6969h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fh.f */
/* loaded from: classes2.dex */
public final class C7354f {

    /* renamed from: a */
    private final String f16623a;

    /* renamed from: b */
    private final boolean f16624b;

    /* renamed from: c */
    private final C9270h f16625c;

    /* renamed from: d */
    private final EnumC6967f f16626d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.f$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16627a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16628b;

        static {
            int[] iArr = new int[EnumC6969h.values().length];
            f16628b = iArr;
            try {
                iArr[EnumC6969h.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16628b[EnumC6969h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16628b[EnumC6969h.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16628b[EnumC6969h.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16628b[EnumC6969h.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.values().length];
            f16627a = iArr2;
            try {
                iArr2[d.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16627a[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16627a[d.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fh.f$b */
    /* loaded from: classes2.dex */
    public final class b {

        /* renamed from: a */
        private final EnumC6969h f16629a;

        /* renamed from: b */
        private final int f16630b;

        /* renamed from: c */
        private final int f16631c;

        /* renamed from: d */
        private final int f16632d;

        /* renamed from: e */
        private final b f16633e;

        /* renamed from: f */
        private final int f16634f;

        private b(EnumC6969h enumC6969h, int i10, int i11, int i12, b bVar, C6971j c6971j) {
            this.f16629a = enumC6969h;
            this.f16630b = i10;
            EnumC6969h enumC6969h2 = EnumC6969h.BYTE;
            int i13 = (enumC6969h == enumC6969h2 || bVar == null) ? i11 : bVar.f16631c;
            this.f16631c = i13;
            this.f16632d = i12;
            this.f16633e = bVar;
            boolean z10 = false;
            int i14 = bVar != null ? bVar.f16634f : 0;
            if ((enumC6969h == enumC6969h2 && bVar == null && i13 != 0) || (bVar != null && i13 != bVar.f16631c)) {
                z10 = true;
            }
            i14 = (bVar == null || enumC6969h != bVar.f16629a || z10) ? i14 + enumC6969h.m20154i(c6971j) + 4 : i14;
            int i15 = a.f16628b[enumC6969h.ordinal()];
            if (i15 == 1) {
                i14 += 13;
            } else if (i15 == 2) {
                i14 += i12 == 1 ? 6 : 11;
            } else if (i15 == 3) {
                i14 += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
            } else if (i15 == 4) {
                i14 += C7354f.this.f16625c.m27645c(C7354f.this.f16623a.substring(i10, i12 + i10), i11).length * 8;
                if (z10) {
                    i14 += 12;
                }
            }
            this.f16634f = i14;
        }

        /* synthetic */ b(C7354f c7354f, EnumC6969h enumC6969h, int i10, int i11, int i12, b bVar, C6971j c6971j, a aVar) {
            this(enumC6969h, i10, i11, i12, bVar, c6971j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.f$c */
    /* loaded from: classes2.dex */
    public final class c {

        /* renamed from: a */
        private final List<a> f16636a = new ArrayList();

        /* renamed from: b */
        private final C6971j f16637b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fh.f$c$a */
        /* loaded from: classes2.dex */
        public final class a {

            /* renamed from: a */
            private final EnumC6969h f16639a;

            /* renamed from: b */
            private final int f16640b;

            /* renamed from: c */
            private final int f16641c;

            /* renamed from: d */
            private final int f16642d;

            a(EnumC6969h enumC6969h, int i10, int i11, int i12) {
                this.f16639a = enumC6969h;
                this.f16640b = i10;
                this.f16641c = i11;
                this.f16642d = i12;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public void m22178d(C9263a c9263a) {
                c9263a.m27583c(this.f16639a.m20153h(), 4);
                if (this.f16642d > 0) {
                    c9263a.m27583c(m22179e(), this.f16639a.m20154i(c.this.f16637b));
                }
                if (this.f16639a == EnumC6969h.ECI) {
                    c9263a.m27583c(C7354f.this.f16625c.m27647e(this.f16641c), 8);
                } else if (this.f16642d > 0) {
                    String str = C7354f.this.f16623a;
                    int i10 = this.f16640b;
                    C7351c.m22101c(str.substring(i10, this.f16642d + i10), this.f16639a, c9263a, C7354f.this.f16625c.m27646d(this.f16641c));
                }
            }

            /* renamed from: e */
            private int m22179e() {
                if (this.f16639a != EnumC6969h.BYTE) {
                    return this.f16642d;
                }
                C9270h c9270h = C7354f.this.f16625c;
                String str = C7354f.this.f16623a;
                int i10 = this.f16640b;
                return c9270h.m27645c(str.substring(i10, this.f16642d + i10), this.f16641c).length;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public int m22180f(C6971j c6971j) {
                int i10 = 4;
                int m20154i = this.f16639a.m20154i(c6971j) + 4;
                int i11 = a.f16628b[this.f16639a.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        int i12 = this.f16642d;
                        return m20154i + ((i12 / 2) * 11) + (i12 % 2 == 1 ? 6 : 0);
                    }
                    if (i11 == 3) {
                        int i13 = this.f16642d;
                        m20154i += (i13 / 3) * 10;
                        int i14 = i13 % 3;
                        if (i14 != 1) {
                            i10 = i14 == 2 ? 7 : 0;
                        }
                    } else {
                        if (i11 != 4) {
                            return i11 != 5 ? m20154i : m20154i + 8;
                        }
                        i10 = m22179e() * 8;
                    }
                } else {
                    i10 = this.f16642d * 13;
                }
                return m20154i + i10;
            }

            /* renamed from: g */
            private String m22181g(String str) {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < str.length(); i10++) {
                    sb2.append((str.charAt(i10) < ' ' || str.charAt(i10) > '~') ? '.' : str.charAt(i10));
                }
                return sb2.toString();
            }

            public String toString() {
                String m22181g;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f16639a);
                sb2.append('(');
                if (this.f16639a == EnumC6969h.ECI) {
                    m22181g = C7354f.this.f16625c.m27646d(this.f16641c).displayName();
                } else {
                    String str = C7354f.this.f16623a;
                    int i10 = this.f16640b;
                    m22181g = m22181g(str.substring(i10, this.f16642d + i10));
                }
                sb2.append(m22181g);
                sb2.append(')');
                return sb2.toString();
            }
        }

        c(C6971j c6971j, b bVar) {
            int i10;
            int i11;
            int i12 = 0;
            boolean z10 = false;
            while (true) {
                i10 = 1;
                if (bVar == null) {
                    break;
                }
                int i13 = i12 + bVar.f16632d;
                b bVar2 = bVar.f16633e;
                boolean z11 = (bVar.f16629a == EnumC6969h.BYTE && bVar2 == null && bVar.f16631c != 0) || !(bVar2 == null || bVar.f16631c == bVar2.f16631c);
                z10 = z11 ? true : z10;
                if (bVar2 == null || bVar2.f16629a != bVar.f16629a || z11) {
                    this.f16636a.add(0, new a(bVar.f16629a, bVar.f16630b, bVar.f16631c, i13));
                    i13 = 0;
                }
                if (z11) {
                    this.f16636a.add(0, new a(EnumC6969h.ECI, bVar.f16630b, bVar.f16631c, 0));
                }
                bVar = bVar2;
                i12 = i13;
            }
            if (C7354f.this.f16624b) {
                a aVar = this.f16636a.get(0);
                if (aVar != null) {
                    EnumC6969h enumC6969h = aVar.f16639a;
                    EnumC6969h enumC6969h2 = EnumC6969h.ECI;
                    if (enumC6969h != enumC6969h2 && z10) {
                        this.f16636a.add(0, new a(enumC6969h2, 0, 0, 0));
                    }
                }
                this.f16636a.add(this.f16636a.get(0).f16639a == EnumC6969h.ECI ? 1 : 0, new a(EnumC6969h.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int m20165j = c6971j.m20165j();
            int i14 = a.f16627a[C7354f.m22155m(c6971j).ordinal()];
            if (i14 == 1) {
                i11 = 9;
            } else if (i14 != 2) {
                i10 = 27;
                i11 = 40;
            } else {
                i10 = 10;
                i11 = 26;
            }
            int m22171d = m22171d(c6971j);
            while (m20165j < i11 && !C7351c.m22120v(m22171d, C6971j.m20159i(m20165j), C7354f.this.f16626d)) {
                m20165j++;
            }
            while (m20165j > i10 && C7351c.m22120v(m22171d, C6971j.m20159i(m20165j - 1), C7354f.this.f16626d)) {
                m20165j--;
            }
            this.f16637b = C6971j.m20159i(m20165j);
        }

        /* renamed from: d */
        private int m22171d(C6971j c6971j) {
            Iterator<a> it = this.f16636a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += it.next().m22180f(c6971j);
            }
            return i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m22172b(C9263a c9263a) {
            Iterator<a> it = this.f16636a.iterator();
            while (it.hasNext()) {
                it.next().m22178d(c9263a);
            }
        }

        /* renamed from: c */
        int m22173c() {
            return m22171d(this.f16637b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public C6971j m22174e() {
            return this.f16637b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = null;
            for (a aVar2 : this.f16636a) {
                if (aVar != null) {
                    sb2.append(",");
                }
                sb2.append(aVar2.toString());
                aVar = aVar2;
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fh.f$d */
    /* loaded from: classes2.dex */
    public enum d {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");

        private final String description;

        d(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    C7354f(String str, Charset charset, boolean z10, EnumC6967f enumC6967f) {
        this.f16623a = str;
        this.f16624b = z10;
        this.f16625c = new C9270h(str, charset, -1);
        this.f16626d = enumC6967f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static c m22152i(String str, C6971j c6971j, Charset charset, boolean z10, EnumC6967f enumC6967f) {
        return new C7354f(str, charset, z10, enumC6967f).m22162h(c6971j);
    }

    /* renamed from: k */
    static int m22153k(EnumC6969h enumC6969h) {
        int i10;
        if (enumC6969h == null || (i10 = a.f16628b[enumC6969h.ordinal()]) == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode " + enumC6969h);
    }

    /* renamed from: l */
    static C6971j m22154l(d dVar) {
        int i10 = a.f16627a[dVar.ordinal()];
        return C6971j.m20159i(i10 != 1 ? i10 != 2 ? 40 : 26 : 9);
    }

    /* renamed from: m */
    static d m22155m(C6971j c6971j) {
        return c6971j.m20165j() <= 9 ? d.SMALL : c6971j.m20165j() <= 26 ? d.MEDIUM : d.LARGE;
    }

    /* renamed from: n */
    static boolean m22156n(char c10) {
        return C7351c.m22114p(c10) != -1;
    }

    /* renamed from: o */
    static boolean m22157o(char c10) {
        return C7351c.m22117s(String.valueOf(c10));
    }

    /* renamed from: p */
    static boolean m22158p(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    /* renamed from: e */
    void m22159e(b[][][] bVarArr, int i10, b bVar) {
        b[] bVarArr2 = bVarArr[i10 + bVar.f16632d][bVar.f16631c];
        int m22153k = m22153k(bVar.f16629a);
        b bVar2 = bVarArr2[m22153k];
        if (bVar2 == null || bVar2.f16634f > bVar.f16634f) {
            bVarArr2[m22153k] = bVar;
        }
    }

    /* renamed from: f */
    void m22160f(C6971j c6971j, b[][][] bVarArr, int i10, b bVar) {
        int i11;
        int m27649g = this.f16625c.m27649g();
        int m27648f = this.f16625c.m27648f();
        if (m27648f < 0 || !this.f16625c.m27643a(this.f16623a.charAt(i10), m27648f)) {
            m27648f = 0;
        } else {
            m27649g = m27648f + 1;
        }
        int i12 = m27649g;
        for (int i13 = m27648f; i13 < i12; i13++) {
            if (this.f16625c.m27643a(this.f16623a.charAt(i10), i13)) {
                m22159e(bVarArr, i10, new b(this, EnumC6969h.BYTE, i10, i13, 1, bVar, c6971j, null));
            }
        }
        EnumC6969h enumC6969h = EnumC6969h.KANJI;
        if (m22161g(enumC6969h, this.f16623a.charAt(i10))) {
            m22159e(bVarArr, i10, new b(this, enumC6969h, i10, 0, 1, bVar, c6971j, null));
        }
        int length = this.f16623a.length();
        EnumC6969h enumC6969h2 = EnumC6969h.ALPHANUMERIC;
        if (m22161g(enumC6969h2, this.f16623a.charAt(i10))) {
            int i14 = i10 + 1;
            m22159e(bVarArr, i10, new b(this, enumC6969h2, i10, 0, (i14 >= length || !m22161g(enumC6969h2, this.f16623a.charAt(i14))) ? 1 : 2, bVar, c6971j, null));
        }
        EnumC6969h enumC6969h3 = EnumC6969h.NUMERIC;
        if (m22161g(enumC6969h3, this.f16623a.charAt(i10))) {
            int i15 = 0;
            int i16 = i10 + 1;
            if (i16 >= length || !m22161g(enumC6969h3, this.f16623a.charAt(i16))) {
                i11 = 1;
            } else {
                int i17 = i10 + 2;
                i11 = (i17 >= length || !m22161g(enumC6969h3, this.f16623a.charAt(i17))) ? 2 : 3;
            }
            m22159e(bVarArr, i10, new b(this, enumC6969h3, i10, i15, i11, bVar, c6971j, null));
        }
    }

    /* renamed from: g */
    boolean m22161g(EnumC6969h enumC6969h, char c10) {
        int i10 = a.f16628b[enumC6969h.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 == 4 : m22158p(c10) : m22156n(c10) : m22157o(c10);
    }

    /* renamed from: h */
    c m22162h(C6971j c6971j) {
        if (c6971j != null) {
            c m22163j = m22163j(c6971j);
            if (C7351c.m22120v(m22163j.m22173c(), m22154l(m22155m(m22163j.m22174e())), this.f16626d)) {
                return m22163j;
            }
            throw new C6961v("Data too big for version" + c6971j);
        }
        C6971j[] c6971jArr = {m22154l(d.SMALL), m22154l(d.MEDIUM), m22154l(d.LARGE)};
        c[] cVarArr = {m22163j(c6971jArr[0]), m22163j(c6971jArr[1]), m22163j(c6971jArr[2])};
        int i10 = C5101a.e.API_PRIORITY_OTHER;
        int i11 = -1;
        for (int i12 = 0; i12 < 3; i12++) {
            int m22173c = cVarArr[i12].m22173c();
            if (C7351c.m22120v(m22173c, c6971jArr[i12], this.f16626d) && m22173c < i10) {
                i11 = i12;
                i10 = m22173c;
            }
        }
        if (i11 >= 0) {
            return cVarArr[i11];
        }
        throw new C6961v("Data too big for any version");
    }

    /* renamed from: j */
    c m22163j(C6971j c6971j) {
        int length = this.f16623a.length();
        b[][][] bVarArr = (b[][][]) Array.newInstance((Class<?>) b.class, length + 1, this.f16625c.m27649g(), 4);
        m22160f(c6971j, bVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < this.f16625c.m27649g(); i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    b bVar = bVarArr[i10][i11][i12];
                    if (bVar != null && i10 < length) {
                        m22160f(c6971j, bVarArr, i10, bVar);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < this.f16625c.m27649g(); i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                b bVar2 = bVarArr[length][i16][i17];
                if (bVar2 != null && bVar2.f16634f < i14) {
                    i14 = bVar2.f16634f;
                    i13 = i16;
                    i15 = i17;
                }
            }
        }
        if (i13 >= 0) {
            return new c(c6971j, bVarArr[length][i13][i15]);
        }
        throw new C6961v("Internal error: failed to encode \"" + this.f16623a + "\"");
    }
}
