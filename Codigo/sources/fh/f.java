package fh;

import com.google.android.gms.common.api.a;
import dg.v;
import dh.j;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.h;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    private final String f15200a;

    /* renamed from: b */
    private final boolean f15201b;

    /* renamed from: c */
    private final h f15202c;

    /* renamed from: d */
    private final dh.f f15203d;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15204a;

        /* renamed from: b */
        static final /* synthetic */ int[] f15205b;

        static {
            int[] iArr = new int[dh.h.values().length];
            f15205b = iArr;
            try {
                iArr[dh.h.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15205b[dh.h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15205b[dh.h.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15205b[dh.h.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15205b[dh.h.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.values().length];
            f15204a = iArr2;
            try {
                iArr2[d.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15204a[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15204a[d.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class b {

        /* renamed from: a */
        private final dh.h f15206a;

        /* renamed from: b */
        private final int f15207b;

        /* renamed from: c */
        private final int f15208c;

        /* renamed from: d */
        private final int f15209d;

        /* renamed from: e */
        private final b f15210e;

        /* renamed from: f */
        private final int f15211f;

        private b(dh.h hVar, int i10, int i11, int i12, b bVar, j jVar) {
            this.f15206a = hVar;
            this.f15207b = i10;
            dh.h hVar2 = dh.h.BYTE;
            int i13 = (hVar == hVar2 || bVar == null) ? i11 : bVar.f15208c;
            this.f15208c = i13;
            this.f15209d = i12;
            this.f15210e = bVar;
            boolean z10 = false;
            int i14 = bVar != null ? bVar.f15211f : 0;
            if ((hVar == hVar2 && bVar == null && i13 != 0) || (bVar != null && i13 != bVar.f15208c)) {
                z10 = true;
            }
            i14 = (bVar == null || hVar != bVar.f15206a || z10) ? i14 + hVar.i(jVar) + 4 : i14;
            int i15 = a.f15205b[hVar.ordinal()];
            if (i15 == 1) {
                i14 += 13;
            } else if (i15 == 2) {
                i14 += i12 == 1 ? 6 : 11;
            } else if (i15 == 3) {
                i14 += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
            } else if (i15 == 4) {
                i14 += f.this.f15202c.c(f.this.f15200a.substring(i10, i12 + i10), i11).length * 8;
                if (z10) {
                    i14 += 12;
                }
            }
            this.f15211f = i14;
        }

        /* synthetic */ b(f fVar, dh.h hVar, int i10, int i11, int i12, b bVar, j jVar, a aVar) {
            this(hVar, i10, i11, i12, bVar, jVar);
        }
    }

    /* loaded from: classes2.dex */
    public final class c {

        /* renamed from: a */
        private final List<a> f15213a = new ArrayList();

        /* renamed from: b */
        private final j f15214b;

        /* loaded from: classes2.dex */
        public final class a {

            /* renamed from: a */
            private final dh.h f15216a;

            /* renamed from: b */
            private final int f15217b;

            /* renamed from: c */
            private final int f15218c;

            /* renamed from: d */
            private final int f15219d;

            a(dh.h hVar, int i10, int i11, int i12) {
                this.f15216a = hVar;
                this.f15217b = i10;
                this.f15218c = i11;
                this.f15219d = i12;
            }

            public void d(kg.a aVar) {
                aVar.c(this.f15216a.h(), 4);
                if (this.f15219d > 0) {
                    aVar.c(e(), this.f15216a.i(c.this.f15214b));
                }
                if (this.f15216a == dh.h.ECI) {
                    aVar.c(f.this.f15202c.e(this.f15218c), 8);
                } else if (this.f15219d > 0) {
                    String str = f.this.f15200a;
                    int i10 = this.f15217b;
                    fh.c.c(str.substring(i10, this.f15219d + i10), this.f15216a, aVar, f.this.f15202c.d(this.f15218c));
                }
            }

            private int e() {
                if (this.f15216a != dh.h.BYTE) {
                    return this.f15219d;
                }
                h hVar = f.this.f15202c;
                String str = f.this.f15200a;
                int i10 = this.f15217b;
                return hVar.c(str.substring(i10, this.f15219d + i10), this.f15218c).length;
            }

            public int f(j jVar) {
                int i10 = 4;
                int i11 = this.f15216a.i(jVar) + 4;
                int i12 = a.f15205b[this.f15216a.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = this.f15219d;
                        return i11 + ((i13 / 2) * 11) + (i13 % 2 == 1 ? 6 : 0);
                    }
                    if (i12 == 3) {
                        int i14 = this.f15219d;
                        i11 += (i14 / 3) * 10;
                        int i15 = i14 % 3;
                        if (i15 != 1) {
                            i10 = i15 == 2 ? 7 : 0;
                        }
                    } else {
                        if (i12 != 4) {
                            return i12 != 5 ? i11 : i11 + 8;
                        }
                        i10 = e() * 8;
                    }
                } else {
                    i10 = this.f15219d * 13;
                }
                return i11 + i10;
            }

            private String g(String str) {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < str.length(); i10++) {
                    sb2.append((str.charAt(i10) < ' ' || str.charAt(i10) > '~') ? '.' : str.charAt(i10));
                }
                return sb2.toString();
            }

            public String toString() {
                String g10;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f15216a);
                sb2.append('(');
                if (this.f15216a == dh.h.ECI) {
                    g10 = f.this.f15202c.d(this.f15218c).displayName();
                } else {
                    String str = f.this.f15200a;
                    int i10 = this.f15217b;
                    g10 = g(str.substring(i10, this.f15219d + i10));
                }
                sb2.append(g10);
                sb2.append(')');
                return sb2.toString();
            }
        }

        c(j jVar, b bVar) {
            int i10;
            int i11;
            int i12 = 0;
            boolean z10 = false;
            while (true) {
                i10 = 1;
                if (bVar == null) {
                    break;
                }
                int i13 = i12 + bVar.f15209d;
                b bVar2 = bVar.f15210e;
                boolean z11 = (bVar.f15206a == dh.h.BYTE && bVar2 == null && bVar.f15208c != 0) || !(bVar2 == null || bVar.f15208c == bVar2.f15208c);
                z10 = z11 ? true : z10;
                if (bVar2 == null || bVar2.f15206a != bVar.f15206a || z11) {
                    this.f15213a.add(0, new a(bVar.f15206a, bVar.f15207b, bVar.f15208c, i13));
                    i13 = 0;
                }
                if (z11) {
                    this.f15213a.add(0, new a(dh.h.ECI, bVar.f15207b, bVar.f15208c, 0));
                }
                bVar = bVar2;
                i12 = i13;
            }
            if (f.this.f15201b) {
                a aVar = this.f15213a.get(0);
                if (aVar != null) {
                    dh.h hVar = aVar.f15216a;
                    dh.h hVar2 = dh.h.ECI;
                    if (hVar != hVar2 && z10) {
                        this.f15213a.add(0, new a(hVar2, 0, 0, 0));
                    }
                }
                this.f15213a.add(this.f15213a.get(0).f15216a == dh.h.ECI ? 1 : 0, new a(dh.h.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int j10 = jVar.j();
            int i14 = a.f15204a[f.m(jVar).ordinal()];
            if (i14 == 1) {
                i11 = 9;
            } else if (i14 != 2) {
                i10 = 27;
                i11 = 40;
            } else {
                i10 = 10;
                i11 = 26;
            }
            int d10 = d(jVar);
            while (j10 < i11 && !fh.c.v(d10, j.i(j10), f.this.f15203d)) {
                j10++;
            }
            while (j10 > i10 && fh.c.v(d10, j.i(j10 - 1), f.this.f15203d)) {
                j10--;
            }
            this.f15214b = j.i(j10);
        }

        private int d(j jVar) {
            Iterator<a> it = this.f15213a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += it.next().f(jVar);
            }
            return i10;
        }

        public void b(kg.a aVar) {
            Iterator<a> it = this.f15213a.iterator();
            while (it.hasNext()) {
                it.next().d(aVar);
            }
        }

        int c() {
            return d(this.f15214b);
        }

        public j e() {
            return this.f15214b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = null;
            for (a aVar2 : this.f15213a) {
                if (aVar != null) {
                    sb2.append(",");
                }
                sb2.append(aVar2.toString());
                aVar = aVar2;
            }
            return sb2.toString();
        }
    }

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

    f(String str, Charset charset, boolean z10, dh.f fVar) {
        this.f15200a = str;
        this.f15201b = z10;
        this.f15202c = new h(str, charset, -1);
        this.f15203d = fVar;
    }

    public static c i(String str, j jVar, Charset charset, boolean z10, dh.f fVar) {
        return new f(str, charset, z10, fVar).h(jVar);
    }

    static int k(dh.h hVar) {
        int i10;
        if (hVar == null || (i10 = a.f15205b[hVar.ordinal()]) == 1) {
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
        throw new IllegalStateException("Illegal mode " + hVar);
    }

    static j l(d dVar) {
        int i10 = a.f15204a[dVar.ordinal()];
        return j.i(i10 != 1 ? i10 != 2 ? 40 : 26 : 9);
    }

    static d m(j jVar) {
        return jVar.j() <= 9 ? d.SMALL : jVar.j() <= 26 ? d.MEDIUM : d.LARGE;
    }

    static boolean n(char c10) {
        return fh.c.p(c10) != -1;
    }

    static boolean o(char c10) {
        return fh.c.s(String.valueOf(c10));
    }

    static boolean p(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    void e(b[][][] bVarArr, int i10, b bVar) {
        b[] bVarArr2 = bVarArr[i10 + bVar.f15209d][bVar.f15208c];
        int k10 = k(bVar.f15206a);
        b bVar2 = bVarArr2[k10];
        if (bVar2 == null || bVar2.f15211f > bVar.f15211f) {
            bVarArr2[k10] = bVar;
        }
    }

    void f(j jVar, b[][][] bVarArr, int i10, b bVar) {
        int i11;
        int g10 = this.f15202c.g();
        int f10 = this.f15202c.f();
        if (f10 < 0 || !this.f15202c.a(this.f15200a.charAt(i10), f10)) {
            f10 = 0;
        } else {
            g10 = f10 + 1;
        }
        int i12 = g10;
        for (int i13 = f10; i13 < i12; i13++) {
            if (this.f15202c.a(this.f15200a.charAt(i10), i13)) {
                e(bVarArr, i10, new b(this, dh.h.BYTE, i10, i13, 1, bVar, jVar, null));
            }
        }
        dh.h hVar = dh.h.KANJI;
        if (g(hVar, this.f15200a.charAt(i10))) {
            e(bVarArr, i10, new b(this, hVar, i10, 0, 1, bVar, jVar, null));
        }
        int length = this.f15200a.length();
        dh.h hVar2 = dh.h.ALPHANUMERIC;
        if (g(hVar2, this.f15200a.charAt(i10))) {
            int i14 = i10 + 1;
            e(bVarArr, i10, new b(this, hVar2, i10, 0, (i14 >= length || !g(hVar2, this.f15200a.charAt(i14))) ? 1 : 2, bVar, jVar, null));
        }
        dh.h hVar3 = dh.h.NUMERIC;
        if (g(hVar3, this.f15200a.charAt(i10))) {
            int i15 = i10 + 1;
            if (i15 >= length || !g(hVar3, this.f15200a.charAt(i15))) {
                i11 = 1;
            } else {
                int i16 = i10 + 2;
                i11 = (i16 >= length || !g(hVar3, this.f15200a.charAt(i16))) ? 2 : 3;
            }
            e(bVarArr, i10, new b(this, hVar3, i10, 0, i11, bVar, jVar, null));
        }
    }

    boolean g(dh.h hVar, char c10) {
        int i10 = a.f15205b[hVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 == 4 : p(c10) : n(c10) : o(c10);
    }

    c h(j jVar) {
        if (jVar != null) {
            c j10 = j(jVar);
            if (fh.c.v(j10.c(), l(m(j10.e())), this.f15203d)) {
                return j10;
            }
            throw new v("Data too big for version" + jVar);
        }
        j[] jVarArr = {l(d.SMALL), l(d.MEDIUM), l(d.LARGE)};
        c[] cVarArr = {j(jVarArr[0]), j(jVarArr[1]), j(jVarArr[2])};
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = -1;
        for (int i12 = 0; i12 < 3; i12++) {
            int c10 = cVarArr[i12].c();
            if (fh.c.v(c10, jVarArr[i12], this.f15203d) && c10 < i10) {
                i11 = i12;
                i10 = c10;
            }
        }
        if (i11 >= 0) {
            return cVarArr[i11];
        }
        throw new v("Data too big for any version");
    }

    c j(j jVar) {
        int length = this.f15200a.length();
        b[][][] bVarArr = (b[][][]) Array.newInstance((Class<?>) b.class, length + 1, this.f15202c.g(), 4);
        f(jVar, bVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < this.f15202c.g(); i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    b bVar = bVarArr[i10][i11][i12];
                    if (bVar != null && i10 < length) {
                        f(jVar, bVarArr, i10, bVar);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < this.f15202c.g(); i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                b bVar2 = bVarArr[length][i16][i17];
                if (bVar2 != null && bVar2.f15211f < i14) {
                    i14 = bVar2.f15211f;
                    i13 = i16;
                    i15 = i17;
                }
            }
        }
        if (i13 >= 0) {
            return new c(jVar, bVarArr[length][i13][i15]);
        }
        throw new v("Internal error: failed to encode \"" + this.f15200a + "\"");
    }
}
