package p314qg;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kg.C9276n;

/* renamed from: qg.k */
/* loaded from: classes2.dex */
public final class C10486k {

    /* renamed from: a */
    static final char[] f26039a = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg.k$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26040a;

        /* renamed from: b */
        static final /* synthetic */ int[] f26041b;

        static {
            int[] iArr = new int[EnumC10488m.values().length];
            f26041b = iArr;
            try {
                iArr[EnumC10488m.FORCE_SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26041b[EnumC10488m.FORCE_RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[d.values().length];
            f26040a = iArr2;
            try {
                iArr2[d.ASCII.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26040a[d.B256.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26040a[d.C40.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26040a[d.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26040a[d.X12.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26040a[d.EDF.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qg.k$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: g */
        private static final int[] f26042g = {3, 5, 8, 10, 12, 16, 18, 22, 30, 32, 36, 44, 49, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};

        /* renamed from: h */
        private static final int[] f26043h = {3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};

        /* renamed from: i */
        private static final int[] f26044i = {5, 10, 16, 33, 32, 49};

        /* renamed from: a */
        private final c f26045a;

        /* renamed from: b */
        private final d f26046b;

        /* renamed from: c */
        private final int f26047c;

        /* renamed from: d */
        private final int f26048d;

        /* renamed from: e */
        private final b f26049e;

        /* renamed from: f */
        private final int f26050f;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r0 != p314qg.C10486k.d.X12) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        
            if (r0 == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
        
            if (r0 != p314qg.C10486k.d.X12) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b6, code lost:
        
            if (r0 != p314qg.C10486k.d.X12) goto L69;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private b(p314qg.C10486k.c r6, p314qg.C10486k.d r7, int r8, int r9, p314qg.C10486k.b r10) {
            /*
                r5 = this;
                r5.<init>()
                r5.f26045a = r6
                r5.f26046b = r7
                r5.f26047c = r8
                r5.f26048d = r9
                r5.f26049e = r10
                r9 = 0
                if (r10 == 0) goto L13
                int r10 = r10.f26050f
                goto L14
            L13:
                r10 = r9
            L14:
                qg.k$d r0 = r5.m31523t()
                int[] r1 = p314qg.C10486k.a.f26040a
                int r2 = r7.ordinal()
                r1 = r1[r2]
                switch(r1) {
                    case 1: goto L94;
                    case 2: goto L70;
                    case 3: goto L44;
                    case 4: goto L44;
                    case 5: goto L44;
                    case 6: goto L25;
                    default: goto L23;
                }
            L23:
                goto Lb9
            L25:
                int r10 = r10 + 3
                qg.k$d r6 = p314qg.C10486k.d.ASCII
                if (r0 == r6) goto L40
                qg.k$d r6 = p314qg.C10486k.d.B256
                if (r0 != r6) goto L30
                goto L40
            L30:
                qg.k$d r6 = p314qg.C10486k.d.C40
                if (r0 == r6) goto L3c
                qg.k$d r6 = p314qg.C10486k.d.TEXT
                if (r0 == r6) goto L3c
                qg.k$d r6 = p314qg.C10486k.d.X12
                if (r0 != r6) goto Lb9
            L3c:
                int r10 = r10 + 2
                goto Lb9
            L40:
                int r10 = r10 + 1
                goto Lb9
            L44:
                qg.k$d r1 = p314qg.C10486k.d.X12
                if (r7 != r1) goto L4b
                int r10 = r10 + 2
                goto L5a
            L4b:
                r2 = 1
                int[] r3 = new int[r2]
                qg.k$d r4 = p314qg.C10486k.d.C40
                if (r7 != r4) goto L53
                r9 = r2
            L53:
                int r6 = p314qg.C10486k.m31495j(r6, r8, r9, r3)
                int r6 = r6 * 2
                int r10 = r10 + r6
            L5a:
                qg.k$d r6 = p314qg.C10486k.d.ASCII
                if (r0 == r6) goto L40
                qg.k$d r6 = p314qg.C10486k.d.B256
                if (r0 != r6) goto L63
                goto L40
            L63:
                if (r0 == r7) goto Lb9
                qg.k$d r6 = p314qg.C10486k.d.C40
                if (r0 == r6) goto L3c
                qg.k$d r6 = p314qg.C10486k.d.TEXT
                if (r0 == r6) goto L3c
                if (r0 != r1) goto Lb9
                goto L93
            L70:
                int r10 = r10 + 1
                qg.k$d r6 = p314qg.C10486k.d.B256
                if (r0 == r6) goto L79
            L76:
                int r10 = r10 + 1
                goto L82
            L79:
                int r6 = r5.m31513g()
                r7 = 250(0xfa, float:3.5E-43)
                if (r6 != r7) goto L82
                goto L76
            L82:
                qg.k$d r6 = p314qg.C10486k.d.ASCII
                if (r0 != r6) goto L87
                goto L40
            L87:
                qg.k$d r6 = p314qg.C10486k.d.C40
                if (r0 == r6) goto L3c
                qg.k$d r6 = p314qg.C10486k.d.TEXT
                if (r0 == r6) goto L3c
                qg.k$d r6 = p314qg.C10486k.d.X12
                if (r0 != r6) goto Lb9
            L93:
                goto L3c
            L94:
                int r10 = r10 + 1
                boolean r7 = r6.mo9545a(r8)
                if (r7 != 0) goto Laa
                char r7 = r6.charAt(r8)
                int r6 = r6.m27670f()
                boolean r6 = p314qg.C10486k.m31496k(r7, r6)
                if (r6 == 0) goto Lac
            Laa:
                int r10 = r10 + 1
            Lac:
                qg.k$d r6 = p314qg.C10486k.d.C40
                if (r0 == r6) goto L40
                qg.k$d r6 = p314qg.C10486k.d.TEXT
                if (r0 == r6) goto L40
                qg.k$d r6 = p314qg.C10486k.d.X12
                if (r0 != r6) goto Lb9
                goto L40
            Lb9:
                r5.f26050f = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p314qg.C10486k.b.<init>(qg.k$c, qg.k$d, int, int, qg.k$b):void");
        }

        /* synthetic */ b(c cVar, d dVar, int i10, int i11, b bVar, a aVar) {
            this(cVar, dVar, i10, i11, bVar);
        }

        /* renamed from: h */
        static byte[] m31507h(int i10) {
            return new byte[]{(byte) i10};
        }

        /* renamed from: i */
        static byte[] m31508i(int i10, int i11) {
            return new byte[]{(byte) i10, (byte) i11};
        }

        /* renamed from: j */
        private static int m31509j(boolean z10, int i10, char c10, int i11) {
            if (c10 == i11) {
                return 27;
            }
            if (z10) {
                if (c10 <= 31) {
                    return c10;
                }
                if (c10 == ' ') {
                    return 3;
                }
                return c10 <= '/' ? c10 - '!' : c10 <= '9' ? c10 - ',' : c10 <= '@' ? c10 - '+' : c10 <= 'Z' ? c10 - '3' : c10 <= '_' ? c10 - 'E' : c10 <= 127 ? c10 - '`' : c10;
            }
            if (c10 != 0) {
                if (i10 == 0 && c10 <= 3) {
                    return c10 - 1;
                }
                if (i10 == 1 && c10 <= 31) {
                    return c10;
                }
                if (c10 == ' ') {
                    return 3;
                }
                if (c10 >= '!' && c10 <= '/') {
                    return c10 - '!';
                }
                if (c10 >= '0' && c10 <= '9') {
                    return c10 - ',';
                }
                if (c10 >= ':' && c10 <= '@') {
                    return c10 - '+';
                }
                if (c10 >= 'A' && c10 <= 'Z') {
                    return c10 - '@';
                }
                if (c10 >= '[' && c10 <= '_') {
                    return c10 - 'E';
                }
                if (c10 != '`') {
                    return (c10 < 'a' || c10 > 'z') ? (c10 < '{' || c10 > 127) ? c10 : c10 - '`' : c10 - 'S';
                }
            }
            return 0;
        }

        /* renamed from: v */
        static int m31510v(char c10, boolean z10, int i10) {
            if (!(z10 && C10486k.m31497l(c10)) && (z10 || !C10486k.m31499n(c10))) {
                return (!(z10 && C10486k.m31498m(c10, i10)) && (z10 || !C10486k.m31500o(c10, i10))) ? 2 : 1;
            }
            return 0;
        }

        /* renamed from: w */
        private static int m31511w(char c10) {
            if (c10 == '\r') {
                return 0;
            }
            if (c10 == '*') {
                return 1;
            }
            if (c10 == '>') {
                return 2;
            }
            if (c10 == ' ') {
                return 3;
            }
            return (c10 < '0' || c10 > '9') ? (c10 < 'A' || c10 > 'Z') ? c10 : c10 - '3' : c10 - ',';
        }

        /* renamed from: y */
        static void m31512y(byte[] bArr, int i10, int i11, int i12, int i13) {
            int i14 = ((i11 & 255) * 1600) + ((i12 & 255) * 40) + (i13 & 255) + 1;
            bArr[i10] = (byte) (i14 / RecognitionOptions.QR_CODE);
            bArr[i10 + 1] = (byte) (i14 % RecognitionOptions.QR_CODE);
        }

        /* renamed from: g */
        int m31513g() {
            int i10 = 0;
            for (b bVar = this; bVar != null && bVar.f26046b == d.B256 && i10 <= 250; bVar = bVar.f26049e) {
                i10++;
            }
            return i10;
        }

        /* renamed from: k */
        byte[] m31514k(boolean z10, int i10) {
            int m31509j;
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f26048d; i11++) {
                char charAt = this.f26045a.charAt(this.f26047c + i11);
                if ((!z10 || !C10485j.m31475h(charAt)) && (z10 || !C10485j.m31477j(charAt))) {
                    if (C10486k.m31496k(charAt, i10)) {
                        charAt = (char) ((charAt & 255) - 128);
                        if (!(z10 && C10485j.m31475h(charAt)) && (z10 || !C10485j.m31477j(charAt))) {
                            arrayList.add((byte) 1);
                            arrayList.add((byte) 30);
                        } else {
                            arrayList.add((byte) 1);
                            arrayList.add((byte) 30);
                        }
                    }
                    int m31510v = m31510v(charAt, z10, i10);
                    arrayList.add(Byte.valueOf((byte) m31510v));
                    m31509j = m31509j(z10, m31510v, charAt, i10);
                    arrayList.add(Byte.valueOf((byte) m31509j));
                }
                m31509j = m31509j(z10, 0, charAt, i10);
                arrayList.add(Byte.valueOf((byte) m31509j));
            }
            if (arrayList.size() % 3 != 0) {
                arrayList.add((byte) 0);
            }
            byte[] bArr = new byte[(arrayList.size() / 3) * 2];
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13 += 3) {
                m31512y(bArr, i12, ((Byte) arrayList.get(i13)).byteValue() & 255, ((Byte) arrayList.get(i13 + 1)).byteValue() & 255, ((Byte) arrayList.get(i13 + 2)).byteValue() & 255);
                i12 += 2;
            }
            return bArr;
        }

        /* renamed from: l */
        int m31515l(int i10) {
            return m31521r(i10) - i10;
        }

        /* renamed from: m */
        byte[] m31516m() {
            switch (a.f26040a[this.f26046b.ordinal()]) {
                case 1:
                    return this.f26045a.mo9545a(this.f26047c) ? m31508i(241, this.f26045a.mo9546b(this.f26047c) + 1) : C10486k.m31496k(this.f26045a.charAt(this.f26047c), this.f26045a.m27670f()) ? m31508i(235, this.f26045a.charAt(this.f26047c) - 127) : this.f26048d == 2 ? m31507h(((((this.f26045a.charAt(this.f26047c) - '0') * 10) + this.f26045a.charAt(this.f26047c + 1)) - 48) + 130) : this.f26045a.m27672h(this.f26047c) ? m31507h(232) : m31507h(this.f26045a.charAt(this.f26047c) + 1);
                case 2:
                    return m31507h(this.f26045a.charAt(this.f26047c));
                case 3:
                    return m31514k(true, this.f26045a.m27670f());
                case 4:
                    return m31514k(false, this.f26045a.m27670f());
                case 5:
                    return m31525x();
                case 6:
                    return m31517n();
                default:
                    return new byte[0];
            }
        }

        /* renamed from: n */
        byte[] m31517n() {
            int ceil = (int) Math.ceil(this.f26048d / 4.0d);
            byte[] bArr = new byte[ceil * 3];
            int i10 = this.f26047c;
            int min = Math.min((this.f26048d + i10) - 1, this.f26045a.length() - 1);
            for (int i11 = 0; i11 < ceil; i11 += 3) {
                int[] iArr = new int[4];
                for (int i12 = 0; i12 < 4; i12++) {
                    if (i10 <= min) {
                        iArr[i12] = this.f26045a.charAt(i10) & '?';
                        i10++;
                    } else {
                        iArr[i12] = i10 == min + 1 ? 31 : 0;
                    }
                }
                int i13 = (iArr[0] << 18) | (iArr[1] << 12) | (iArr[2] << 6) | iArr[3];
                bArr[i11] = (byte) ((i13 >> 16) & 255);
                bArr[i11 + 1] = (byte) ((i13 >> 8) & 255);
                bArr[i11 + 2] = (byte) (i13 & 255);
            }
            return bArr;
        }

        /* renamed from: o */
        d m31518o() {
            if (this.f26046b == d.EDF) {
                if (this.f26048d < 4) {
                    return d.ASCII;
                }
                int m31519p = m31519p();
                if (m31519p > 0 && m31515l(this.f26050f + m31519p) <= 2 - m31519p) {
                    return d.ASCII;
                }
            }
            d dVar = this.f26046b;
            if (dVar == d.C40 || dVar == d.TEXT || dVar == d.X12) {
                if (this.f26047c + this.f26048d >= this.f26045a.length() && m31515l(this.f26050f) == 0) {
                    return d.ASCII;
                }
                if (m31519p() == 1 && m31515l(this.f26050f + 1) == 0) {
                    return d.ASCII;
                }
            }
            return this.f26046b;
        }

        /* renamed from: p */
        int m31519p() {
            int length = this.f26045a.length();
            int i10 = this.f26047c + this.f26048d;
            int i11 = length - i10;
            if (i11 <= 4 && i10 < length) {
                if (i11 == 1) {
                    return C10486k.m31496k(this.f26045a.charAt(i10), this.f26045a.m27670f()) ? 0 : 1;
                }
                if (i11 == 2) {
                    if (!C10486k.m31496k(this.f26045a.charAt(i10), this.f26045a.m27670f())) {
                        int i12 = i10 + 1;
                        if (!C10486k.m31496k(this.f26045a.charAt(i12), this.f26045a.m27670f())) {
                            return (C10485j.m31473f(this.f26045a.charAt(i10)) && C10485j.m31473f(this.f26045a.charAt(i12))) ? 1 : 2;
                        }
                    }
                    return 0;
                }
                if (i11 == 3) {
                    if (C10485j.m31473f(this.f26045a.charAt(i10)) && C10485j.m31473f(this.f26045a.charAt(i10 + 1)) && !C10486k.m31496k(this.f26045a.charAt(i10 + 2), this.f26045a.m27670f())) {
                        return 2;
                    }
                    return (C10485j.m31473f(this.f26045a.charAt(i10 + 1)) && C10485j.m31473f(this.f26045a.charAt(i10 + 2)) && !C10486k.m31496k(this.f26045a.charAt(i10), this.f26045a.m27670f())) ? 2 : 0;
                }
                if (C10485j.m31473f(this.f26045a.charAt(i10)) && C10485j.m31473f(this.f26045a.charAt(i10 + 1)) && C10485j.m31473f(this.f26045a.charAt(i10 + 2)) && C10485j.m31473f(this.f26045a.charAt(i10 + 3))) {
                    return 2;
                }
            }
            return 0;
        }

        /* renamed from: q */
        byte[] m31520q() {
            int[] iArr = a.f26040a;
            switch (iArr[m31523t().ordinal()]) {
                case 1:
                case 2:
                    int i10 = iArr[this.f26046b.ordinal()];
                    if (i10 == 2) {
                        return m31507h(231);
                    }
                    if (i10 == 3) {
                        return m31507h(230);
                    }
                    if (i10 == 4) {
                        return m31507h(239);
                    }
                    if (i10 == 5) {
                        return m31507h(238);
                    }
                    if (i10 == 6) {
                        return m31507h(240);
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    if (this.f26046b != m31523t()) {
                        switch (iArr[this.f26046b.ordinal()]) {
                            case 1:
                                return m31507h(254);
                            case 2:
                                return m31508i(254, 231);
                            case 3:
                                return m31508i(254, 230);
                            case 4:
                                return m31508i(254, 239);
                            case 5:
                                return m31508i(254, 238);
                            case 6:
                                return m31508i(254, 240);
                        }
                    }
                    break;
            }
            return new byte[0];
        }

        /* renamed from: r */
        int m31521r(int i10) {
            int i11 = a.f26041b[this.f26045a.m31529l().ordinal()];
            if (i11 == 1) {
                for (int i12 : f26043h) {
                    if (i12 >= i10) {
                        return i12;
                    }
                }
            } else if (i11 == 2) {
                for (int i13 : f26044i) {
                    if (i13 >= i10) {
                        return i13;
                    }
                }
            }
            for (int i14 : f26042g) {
                if (i14 >= i10) {
                    return i14;
                }
            }
            int[] iArr = f26042g;
            return iArr[iArr.length - 1];
        }

        /* renamed from: s */
        d m31522s() {
            return this.f26046b;
        }

        /* renamed from: t */
        d m31523t() {
            b bVar = this.f26049e;
            return bVar == null ? d.ASCII : bVar.m31518o();
        }

        /* renamed from: u */
        d m31524u() {
            b bVar = this.f26049e;
            return bVar == null ? d.ASCII : bVar.f26046b;
        }

        /* renamed from: x */
        byte[] m31525x() {
            int i10 = (this.f26048d / 3) * 2;
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11 += 2) {
                int i12 = (i11 / 2) * 3;
                m31512y(bArr, i11, m31511w(this.f26045a.charAt(this.f26047c + i12)), m31511w(this.f26045a.charAt(this.f26047c + i12 + 1)), m31511w(this.f26045a.charAt(this.f26047c + i12 + 2)));
            }
            return bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qg.k$c */
    /* loaded from: classes2.dex */
    public static final class c extends C9276n {

        /* renamed from: c */
        private final EnumC10488m f26051c;

        /* renamed from: d */
        private final int f26052d;

        private c(String str, Charset charset, int i10, EnumC10488m enumC10488m, int i11) {
            super(str, charset, i10);
            this.f26051c = enumC10488m;
            this.f26052d = i11;
        }

        /* synthetic */ c(String str, Charset charset, int i10, EnumC10488m enumC10488m, int i11, a aVar) {
            this(str, charset, i10, enumC10488m, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public int m31528k() {
            return this.f26052d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public EnumC10488m m31529l() {
            return this.f26051c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg.k$d */
    /* loaded from: classes2.dex */
    public enum d {
        ASCII,
        C40,
        TEXT,
        X12,
        EDF,
        B256
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qg.k$e */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a */
        private final byte[] f26053a;

        e(b bVar) {
            int i10;
            c cVar = bVar.f26045a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            int m31531c = ((bVar.f26046b == d.C40 || bVar.f26046b == d.TEXT || bVar.f26046b == d.X12) && bVar.m31518o() != d.ASCII) ? m31531c(b.m31507h(254), arrayList) + 0 : 0;
            for (b bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f26049e) {
                m31531c += m31531c(bVar2.m31516m(), arrayList);
                if (bVar2.f26049e == null || bVar2.m31524u() != bVar2.m31522s()) {
                    if (bVar2.m31522s() == d.B256) {
                        if (m31531c <= 249) {
                            arrayList.add(0, Byte.valueOf((byte) m31531c));
                            i10 = m31531c + 1;
                        } else {
                            arrayList.add(0, Byte.valueOf((byte) (m31531c % 250)));
                            arrayList.add(0, Byte.valueOf((byte) ((m31531c / 250) + 249)));
                            i10 = m31531c + 2;
                        }
                        arrayList2.add(Integer.valueOf(arrayList.size()));
                        arrayList3.add(Integer.valueOf(i10));
                    }
                    m31531c(bVar2.m31520q(), arrayList);
                    m31531c = 0;
                }
            }
            if (cVar.m31528k() == 5) {
                m31531c(b.m31507h(236), arrayList);
            } else if (cVar.m31528k() == 6) {
                m31531c(b.m31507h(237), arrayList);
            }
            if (cVar.m27670f() > 0) {
                m31531c(b.m31507h(232), arrayList);
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                m31530a(arrayList, arrayList.size() - ((Integer) arrayList2.get(i12)).intValue(), ((Integer) arrayList3.get(i12)).intValue());
            }
            int m31521r = bVar.m31521r(arrayList.size());
            if (arrayList.size() < m31521r) {
                arrayList.add((byte) -127);
            }
            while (arrayList.size() < m31521r) {
                arrayList.add(Byte.valueOf((byte) m31532d(arrayList.size() + 1)));
            }
            this.f26053a = new byte[arrayList.size()];
            while (true) {
                byte[] bArr = this.f26053a;
                if (i11 >= bArr.length) {
                    return;
                }
                bArr[i11] = ((Byte) arrayList.get(i11)).byteValue();
                i11++;
            }
        }

        /* renamed from: a */
        static void m31530a(List<Byte> list, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = i10 + i12;
                int byteValue = (list.get(i13).byteValue() & 255) + (((i13 + 1) * 149) % 255) + 1;
                if (byteValue > 255) {
                    byteValue -= 256;
                }
                list.set(i13, Byte.valueOf((byte) byteValue));
            }
        }

        /* renamed from: c */
        static int m31531c(byte[] bArr, List<Byte> list) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                list.add(0, Byte.valueOf(bArr[length]));
            }
            return bArr.length;
        }

        /* renamed from: d */
        private static int m31532d(int i10) {
            int i11 = ((i10 * 149) % 253) + 1 + 129;
            return i11 <= 254 ? i11 : i11 - 254;
        }

        /* renamed from: b */
        public byte[] m31533b() {
            return this.f26053a;
        }
    }

    /* renamed from: e */
    static void m31490e(b[][] bVarArr, b bVar) {
        int i10 = bVar.f26047c + bVar.f26048d;
        if (bVarArr[i10][bVar.m31518o().ordinal()] == null || bVarArr[i10][bVar.m31518o().ordinal()].f26050f > bVar.f26050f) {
            bVarArr[i10][bVar.m31518o().ordinal()] = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* renamed from: f */
    static void m31491f(c cVar, b[][] bVarArr, int i10, b bVar) {
        if (cVar.mo9545a(i10)) {
            m31490e(bVarArr, new b(cVar, d.ASCII, i10, 1, bVar, null));
            return;
        }
        char charAt = cVar.charAt(i10);
        ?? r11 = 0;
        if (bVar == null || bVar.m31518o() != d.EDF) {
            m31490e(bVarArr, (C10485j.m31473f(charAt) && cVar.m27671g(i10, 2) && C10485j.m31473f(cVar.charAt(i10 + 1))) ? new b(cVar, d.ASCII, i10, 2, bVar, null) : new b(cVar, d.ASCII, i10, 1, bVar, null));
            d[] dVarArr = {d.C40, d.TEXT};
            int i11 = 0;
            while (i11 < 2) {
                d dVar = dVarArr[i11];
                int[] iArr = new int[1];
                if (m31495j(cVar, i10, dVar == d.C40 ? true : r11, iArr) > 0) {
                    m31490e(bVarArr, new b(cVar, dVar, i10, iArr[r11], bVar, null));
                }
                i11++;
                r11 = 0;
            }
            if (cVar.m27671g(i10, 3) && C10485j.m31478k(cVar.charAt(i10)) && C10485j.m31478k(cVar.charAt(i10 + 1)) && C10485j.m31478k(cVar.charAt(i10 + 2))) {
                m31490e(bVarArr, new b(cVar, d.X12, i10, 3, bVar, null));
            }
            m31490e(bVarArr, new b(cVar, d.B256, i10, 1, bVar, null));
        }
        int i12 = 0;
        while (i12 < 3) {
            int i13 = i10 + i12;
            if (!cVar.m27671g(i13, 1) || !C10485j.m31476i(cVar.charAt(i13))) {
                break;
            }
            i12++;
            m31490e(bVarArr, new b(cVar, d.EDF, i10, i12, bVar, null));
        }
        if (i12 == 3 && cVar.m27671g(i10, 4) && C10485j.m31476i(cVar.charAt(i10 + 3))) {
            m31490e(bVarArr, new b(cVar, d.EDF, i10, 4, bVar, null));
        }
    }

    /* renamed from: g */
    static byte[] m31492g(String str, Charset charset, int i10, EnumC10488m enumC10488m, int i11) {
        return m31494i(new c(str, charset, i10, enumC10488m, i11, null)).m31533b();
    }

    /* renamed from: h */
    public static String m31493h(String str, Charset charset, int i10, EnumC10488m enumC10488m) {
        int i11;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i11 = 5;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i11 = 6;
        } else {
            i11 = 0;
        }
        return new String(m31492g(str, charset, i10, enumC10488m, i11), StandardCharsets.ISO_8859_1);
    }

    /* renamed from: i */
    static e m31494i(c cVar) {
        int length = cVar.length();
        int i10 = 0;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, length + 1, 6);
        m31491f(cVar, bVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < 6; i12++) {
                b bVar = bVarArr[i11][i12];
                if (bVar != null && i11 < length) {
                    m31491f(cVar, bVarArr, i11, bVar);
                }
            }
            for (int i13 = 0; i13 < 6; i13++) {
                bVarArr[i11 - 1][i13] = null;
            }
        }
        int i14 = -1;
        int i15 = C5101a.e.API_PRIORITY_OTHER;
        while (i10 < 6) {
            b bVar2 = bVarArr[length][i10];
            if (bVar2 != null) {
                int i16 = (i10 < 1 || i10 > 3) ? bVar2.f26050f : bVar2.f26050f + 1;
                if (i16 < i15) {
                    i14 = i10;
                    i15 = i16;
                }
            }
            i10++;
        }
        if (i14 >= 0) {
            return new e(bVarArr[length][i14]);
        }
        throw new RuntimeException("Internal error: failed to encode \"" + cVar + "\"");
    }

    /* renamed from: j */
    static int m31495j(c cVar, int i10, boolean z10, int[] iArr) {
        int i11 = 0;
        for (int i12 = i10; i12 < cVar.length(); i12++) {
            if (cVar.mo9545a(i12)) {
                iArr[0] = 0;
                return 0;
            }
            char charAt = cVar.charAt(i12);
            if ((z10 && C10485j.m31475h(charAt)) || (!z10 && C10485j.m31477j(charAt))) {
                i11++;
            } else if (m31496k(charAt, cVar.m27670f())) {
                int i13 = charAt & 255;
                i11 = (i13 < 128 || (!(z10 && C10485j.m31475h((char) (i13 + (-128)))) && (z10 || !C10485j.m31477j((char) (i13 + (-128)))))) ? i11 + 4 : i11 + 3;
            } else {
                i11 += 2;
            }
            if (i11 % 3 == 0 || ((i11 - 2) % 3 == 0 && i12 + 1 == cVar.length())) {
                iArr[0] = (i12 - i10) + 1;
                return (int) Math.ceil(i11 / 3.0d);
            }
        }
        iArr[0] = 0;
        return 0;
    }

    /* renamed from: k */
    static boolean m31496k(char c10, int i10) {
        return c10 != i10 && c10 >= 128 && c10 <= 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m31497l(char c10) {
        return c10 <= 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m31498m(char c10, int i10) {
        for (char c11 : f26039a) {
            if (c11 == c10) {
                return true;
            }
        }
        return c10 == i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m31499n(char c10) {
        return m31497l(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static boolean m31500o(char c10, int i10) {
        return m31498m(c10, i10);
    }
}
