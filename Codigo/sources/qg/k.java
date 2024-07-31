package qg;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    static final char[] f23997a = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23998a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f23999b;

        static {
            int[] iArr = new int[m.values().length];
            f23999b = iArr;
            try {
                iArr[m.FORCE_SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23999b[m.FORCE_RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[d.values().length];
            f23998a = iArr2;
            try {
                iArr2[d.ASCII.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23998a[d.B256.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23998a[d.C40.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23998a[d.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23998a[d.X12.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23998a[d.EDF.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: g, reason: collision with root package name */
        private static final int[] f24000g = {3, 5, 8, 10, 12, 16, 18, 22, 30, 32, 36, 44, 49, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};

        /* renamed from: h, reason: collision with root package name */
        private static final int[] f24001h = {3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};

        /* renamed from: i, reason: collision with root package name */
        private static final int[] f24002i = {5, 10, 16, 33, 32, 49};

        /* renamed from: a, reason: collision with root package name */
        private final c f24003a;

        /* renamed from: b, reason: collision with root package name */
        private final d f24004b;

        /* renamed from: c, reason: collision with root package name */
        private final int f24005c;

        /* renamed from: d, reason: collision with root package name */
        private final int f24006d;

        /* renamed from: e, reason: collision with root package name */
        private final b f24007e;

        /* renamed from: f, reason: collision with root package name */
        private final int f24008f;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r0 != qg.k.d.X12) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        
            if (r0 == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
        
            if (r0 != qg.k.d.X12) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b6, code lost:
        
            if (r0 != qg.k.d.X12) goto L69;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private b(qg.k.c r6, qg.k.d r7, int r8, int r9, qg.k.b r10) {
            /*
                r5 = this;
                r5.<init>()
                r5.f24003a = r6
                r5.f24004b = r7
                r5.f24005c = r8
                r5.f24006d = r9
                r5.f24007e = r10
                r9 = 0
                if (r10 == 0) goto L13
                int r10 = r10.f24008f
                goto L14
            L13:
                r10 = r9
            L14:
                qg.k$d r0 = r5.t()
                int[] r1 = qg.k.a.f23998a
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
                qg.k$d r6 = qg.k.d.ASCII
                if (r0 == r6) goto L40
                qg.k$d r6 = qg.k.d.B256
                if (r0 != r6) goto L30
                goto L40
            L30:
                qg.k$d r6 = qg.k.d.C40
                if (r0 == r6) goto L3c
                qg.k$d r6 = qg.k.d.TEXT
                if (r0 == r6) goto L3c
                qg.k$d r6 = qg.k.d.X12
                if (r0 != r6) goto Lb9
            L3c:
                int r10 = r10 + 2
                goto Lb9
            L40:
                int r10 = r10 + 1
                goto Lb9
            L44:
                qg.k$d r1 = qg.k.d.X12
                if (r7 != r1) goto L4b
                int r10 = r10 + 2
                goto L5a
            L4b:
                r2 = 1
                int[] r3 = new int[r2]
                qg.k$d r4 = qg.k.d.C40
                if (r7 != r4) goto L53
                r9 = r2
            L53:
                int r6 = qg.k.j(r6, r8, r9, r3)
                int r6 = r6 * 2
                int r10 = r10 + r6
            L5a:
                qg.k$d r6 = qg.k.d.ASCII
                if (r0 == r6) goto L40
                qg.k$d r6 = qg.k.d.B256
                if (r0 != r6) goto L63
                goto L40
            L63:
                if (r0 == r7) goto Lb9
                qg.k$d r6 = qg.k.d.C40
                if (r0 == r6) goto L3c
                qg.k$d r6 = qg.k.d.TEXT
                if (r0 == r6) goto L3c
                if (r0 != r1) goto Lb9
                goto L93
            L70:
                int r10 = r10 + 1
                qg.k$d r6 = qg.k.d.B256
                if (r0 == r6) goto L79
            L76:
                int r10 = r10 + 1
                goto L82
            L79:
                int r6 = r5.g()
                r7 = 250(0xfa, float:3.5E-43)
                if (r6 != r7) goto L82
                goto L76
            L82:
                qg.k$d r6 = qg.k.d.ASCII
                if (r0 != r6) goto L87
                goto L40
            L87:
                qg.k$d r6 = qg.k.d.C40
                if (r0 == r6) goto L3c
                qg.k$d r6 = qg.k.d.TEXT
                if (r0 == r6) goto L3c
                qg.k$d r6 = qg.k.d.X12
                if (r0 != r6) goto Lb9
            L93:
                goto L3c
            L94:
                int r10 = r10 + 1
                boolean r7 = r6.a(r8)
                if (r7 != 0) goto Laa
                char r7 = r6.charAt(r8)
                int r6 = r6.f()
                boolean r6 = qg.k.k(r7, r6)
                if (r6 == 0) goto Lac
            Laa:
                int r10 = r10 + 1
            Lac:
                qg.k$d r6 = qg.k.d.C40
                if (r0 == r6) goto L40
                qg.k$d r6 = qg.k.d.TEXT
                if (r0 == r6) goto L40
                qg.k$d r6 = qg.k.d.X12
                if (r0 != r6) goto Lb9
                goto L40
            Lb9:
                r5.f24008f = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.k.b.<init>(qg.k$c, qg.k$d, int, int, qg.k$b):void");
        }

        /* synthetic */ b(c cVar, d dVar, int i10, int i11, b bVar, a aVar) {
            this(cVar, dVar, i10, i11, bVar);
        }

        static byte[] h(int i10) {
            return new byte[]{(byte) i10};
        }

        static byte[] i(int i10, int i11) {
            return new byte[]{(byte) i10, (byte) i11};
        }

        private static int j(boolean z10, int i10, char c10, int i11) {
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

        static int v(char c10, boolean z10, int i10) {
            if (!(z10 && k.l(c10)) && (z10 || !k.n(c10))) {
                return (!(z10 && k.m(c10, i10)) && (z10 || !k.o(c10, i10))) ? 2 : 1;
            }
            return 0;
        }

        private static int w(char c10) {
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

        static void y(byte[] bArr, int i10, int i11, int i12, int i13) {
            int i14 = ((i11 & 255) * 1600) + ((i12 & 255) * 40) + (i13 & 255) + 1;
            bArr[i10] = (byte) (i14 / RecognitionOptions.QR_CODE);
            bArr[i10 + 1] = (byte) (i14 % RecognitionOptions.QR_CODE);
        }

        int g() {
            int i10 = 0;
            for (b bVar = this; bVar != null && bVar.f24004b == d.B256 && i10 <= 250; bVar = bVar.f24007e) {
                i10++;
            }
            return i10;
        }

        byte[] k(boolean z10, int i10) {
            int j10;
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f24006d; i11++) {
                char charAt = this.f24003a.charAt(this.f24005c + i11);
                if ((!z10 || !j.h(charAt)) && (z10 || !j.j(charAt))) {
                    if (k.k(charAt, i10)) {
                        charAt = (char) ((charAt & 255) - 128);
                        if (!(z10 && j.h(charAt)) && (z10 || !j.j(charAt))) {
                            arrayList.add((byte) 1);
                            arrayList.add((byte) 30);
                        } else {
                            arrayList.add((byte) 1);
                            arrayList.add((byte) 30);
                        }
                    }
                    int v10 = v(charAt, z10, i10);
                    arrayList.add(Byte.valueOf((byte) v10));
                    j10 = j(z10, v10, charAt, i10);
                    arrayList.add(Byte.valueOf((byte) j10));
                }
                j10 = j(z10, 0, charAt, i10);
                arrayList.add(Byte.valueOf((byte) j10));
            }
            if (arrayList.size() % 3 != 0) {
                arrayList.add((byte) 0);
            }
            byte[] bArr = new byte[(arrayList.size() / 3) * 2];
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13 += 3) {
                y(bArr, i12, ((Byte) arrayList.get(i13)).byteValue() & 255, ((Byte) arrayList.get(i13 + 1)).byteValue() & 255, ((Byte) arrayList.get(i13 + 2)).byteValue() & 255);
                i12 += 2;
            }
            return bArr;
        }

        int l(int i10) {
            return r(i10) - i10;
        }

        byte[] m() {
            switch (a.f23998a[this.f24004b.ordinal()]) {
                case 1:
                    return this.f24003a.a(this.f24005c) ? i(241, this.f24003a.b(this.f24005c) + 1) : k.k(this.f24003a.charAt(this.f24005c), this.f24003a.f()) ? i(235, this.f24003a.charAt(this.f24005c) - 127) : this.f24006d == 2 ? h(((((this.f24003a.charAt(this.f24005c) - '0') * 10) + this.f24003a.charAt(this.f24005c + 1)) - 48) + 130) : this.f24003a.h(this.f24005c) ? h(232) : h(this.f24003a.charAt(this.f24005c) + 1);
                case 2:
                    return h(this.f24003a.charAt(this.f24005c));
                case 3:
                    return k(true, this.f24003a.f());
                case 4:
                    return k(false, this.f24003a.f());
                case 5:
                    return x();
                case 6:
                    return n();
                default:
                    return new byte[0];
            }
        }

        byte[] n() {
            int ceil = (int) Math.ceil(this.f24006d / 4.0d);
            byte[] bArr = new byte[ceil * 3];
            int i10 = this.f24005c;
            int min = Math.min((this.f24006d + i10) - 1, this.f24003a.length() - 1);
            for (int i11 = 0; i11 < ceil; i11 += 3) {
                int[] iArr = new int[4];
                for (int i12 = 0; i12 < 4; i12++) {
                    if (i10 <= min) {
                        iArr[i12] = this.f24003a.charAt(i10) & '?';
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

        d o() {
            if (this.f24004b == d.EDF) {
                if (this.f24006d < 4) {
                    return d.ASCII;
                }
                int p10 = p();
                if (p10 > 0 && l(this.f24008f + p10) <= 2 - p10) {
                    return d.ASCII;
                }
            }
            d dVar = this.f24004b;
            if (dVar == d.C40 || dVar == d.TEXT || dVar == d.X12) {
                if (this.f24005c + this.f24006d >= this.f24003a.length() && l(this.f24008f) == 0) {
                    return d.ASCII;
                }
                if (p() == 1 && l(this.f24008f + 1) == 0) {
                    return d.ASCII;
                }
            }
            return this.f24004b;
        }

        int p() {
            int length = this.f24003a.length();
            int i10 = this.f24005c + this.f24006d;
            int i11 = length - i10;
            if (i11 <= 4 && i10 < length) {
                if (i11 == 1) {
                    return k.k(this.f24003a.charAt(i10), this.f24003a.f()) ? 0 : 1;
                }
                if (i11 == 2) {
                    if (!k.k(this.f24003a.charAt(i10), this.f24003a.f())) {
                        int i12 = i10 + 1;
                        if (!k.k(this.f24003a.charAt(i12), this.f24003a.f())) {
                            return (j.f(this.f24003a.charAt(i10)) && j.f(this.f24003a.charAt(i12))) ? 1 : 2;
                        }
                    }
                    return 0;
                }
                if (i11 == 3) {
                    if (j.f(this.f24003a.charAt(i10)) && j.f(this.f24003a.charAt(i10 + 1)) && !k.k(this.f24003a.charAt(i10 + 2), this.f24003a.f())) {
                        return 2;
                    }
                    return (j.f(this.f24003a.charAt(i10 + 1)) && j.f(this.f24003a.charAt(i10 + 2)) && !k.k(this.f24003a.charAt(i10), this.f24003a.f())) ? 2 : 0;
                }
                if (j.f(this.f24003a.charAt(i10)) && j.f(this.f24003a.charAt(i10 + 1)) && j.f(this.f24003a.charAt(i10 + 2)) && j.f(this.f24003a.charAt(i10 + 3))) {
                    return 2;
                }
            }
            return 0;
        }

        byte[] q() {
            int[] iArr = a.f23998a;
            switch (iArr[t().ordinal()]) {
                case 1:
                case 2:
                    int i10 = iArr[this.f24004b.ordinal()];
                    if (i10 == 2) {
                        return h(231);
                    }
                    if (i10 == 3) {
                        return h(230);
                    }
                    if (i10 == 4) {
                        return h(239);
                    }
                    if (i10 == 5) {
                        return h(238);
                    }
                    if (i10 == 6) {
                        return h(240);
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    if (this.f24004b != t()) {
                        switch (iArr[this.f24004b.ordinal()]) {
                            case 1:
                                return h(254);
                            case 2:
                                return i(254, 231);
                            case 3:
                                return i(254, 230);
                            case 4:
                                return i(254, 239);
                            case 5:
                                return i(254, 238);
                            case 6:
                                return i(254, 240);
                        }
                    }
                    break;
            }
            return new byte[0];
        }

        int r(int i10) {
            int i11 = a.f23999b[this.f24003a.l().ordinal()];
            if (i11 == 1) {
                for (int i12 : f24001h) {
                    if (i12 >= i10) {
                        return i12;
                    }
                }
            } else if (i11 == 2) {
                for (int i13 : f24002i) {
                    if (i13 >= i10) {
                        return i13;
                    }
                }
            }
            for (int i14 : f24000g) {
                if (i14 >= i10) {
                    return i14;
                }
            }
            int[] iArr = f24000g;
            return iArr[iArr.length - 1];
        }

        d s() {
            return this.f24004b;
        }

        d t() {
            b bVar = this.f24007e;
            return bVar == null ? d.ASCII : bVar.o();
        }

        d u() {
            b bVar = this.f24007e;
            return bVar == null ? d.ASCII : bVar.f24004b;
        }

        byte[] x() {
            int i10 = (this.f24006d / 3) * 2;
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11 += 2) {
                int i12 = (i11 / 2) * 3;
                y(bArr, i11, w(this.f24003a.charAt(this.f24005c + i12)), w(this.f24003a.charAt(this.f24005c + i12 + 1)), w(this.f24003a.charAt(this.f24005c + i12 + 2)));
            }
            return bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c extends kg.n {

        /* renamed from: c, reason: collision with root package name */
        private final m f24009c;

        /* renamed from: d, reason: collision with root package name */
        private final int f24010d;

        private c(String str, Charset charset, int i10, m mVar, int i11) {
            super(str, charset, i10);
            this.f24009c = mVar;
            this.f24010d = i11;
        }

        /* synthetic */ c(String str, Charset charset, int i10, m mVar, int i11, a aVar) {
            this(str, charset, i10, mVar, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return this.f24010d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public m l() {
            return this.f24009c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f24011a;

        e(b bVar) {
            int i10;
            c cVar = bVar.f24003a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            int c10 = ((bVar.f24004b == d.C40 || bVar.f24004b == d.TEXT || bVar.f24004b == d.X12) && bVar.o() != d.ASCII) ? c(b.h(254), arrayList) + 0 : 0;
            for (b bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f24007e) {
                c10 += c(bVar2.m(), arrayList);
                if (bVar2.f24007e == null || bVar2.u() != bVar2.s()) {
                    if (bVar2.s() == d.B256) {
                        if (c10 <= 249) {
                            arrayList.add(0, Byte.valueOf((byte) c10));
                            i10 = c10 + 1;
                        } else {
                            arrayList.add(0, Byte.valueOf((byte) (c10 % 250)));
                            arrayList.add(0, Byte.valueOf((byte) ((c10 / 250) + 249)));
                            i10 = c10 + 2;
                        }
                        arrayList2.add(Integer.valueOf(arrayList.size()));
                        arrayList3.add(Integer.valueOf(i10));
                    }
                    c(bVar2.q(), arrayList);
                    c10 = 0;
                }
            }
            if (cVar.k() == 5) {
                c(b.h(236), arrayList);
            } else if (cVar.k() == 6) {
                c(b.h(237), arrayList);
            }
            if (cVar.f() > 0) {
                c(b.h(232), arrayList);
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                a(arrayList, arrayList.size() - ((Integer) arrayList2.get(i12)).intValue(), ((Integer) arrayList3.get(i12)).intValue());
            }
            int r10 = bVar.r(arrayList.size());
            if (arrayList.size() < r10) {
                arrayList.add((byte) -127);
            }
            while (arrayList.size() < r10) {
                arrayList.add(Byte.valueOf((byte) d(arrayList.size() + 1)));
            }
            this.f24011a = new byte[arrayList.size()];
            while (true) {
                byte[] bArr = this.f24011a;
                if (i11 >= bArr.length) {
                    return;
                }
                bArr[i11] = ((Byte) arrayList.get(i11)).byteValue();
                i11++;
            }
        }

        static void a(List<Byte> list, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = i10 + i12;
                int byteValue = (list.get(i13).byteValue() & 255) + (((i13 + 1) * 149) % 255) + 1;
                if (byteValue > 255) {
                    byteValue -= 256;
                }
                list.set(i13, Byte.valueOf((byte) byteValue));
            }
        }

        static int c(byte[] bArr, List<Byte> list) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                list.add(0, Byte.valueOf(bArr[length]));
            }
            return bArr.length;
        }

        private static int d(int i10) {
            int i11 = ((i10 * 149) % 253) + 1 + 129;
            return i11 <= 254 ? i11 : i11 - 254;
        }

        public byte[] b() {
            return this.f24011a;
        }
    }

    static void e(b[][] bVarArr, b bVar) {
        int i10 = bVar.f24005c + bVar.f24006d;
        if (bVarArr[i10][bVar.o().ordinal()] == null || bVarArr[i10][bVar.o().ordinal()].f24008f > bVar.f24008f) {
            bVarArr[i10][bVar.o().ordinal()] = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    static void f(c cVar, b[][] bVarArr, int i10, b bVar) {
        if (cVar.a(i10)) {
            e(bVarArr, new b(cVar, d.ASCII, i10, 1, bVar, null));
            return;
        }
        char charAt = cVar.charAt(i10);
        ?? r11 = 0;
        if (bVar == null || bVar.o() != d.EDF) {
            e(bVarArr, (j.f(charAt) && cVar.g(i10, 2) && j.f(cVar.charAt(i10 + 1))) ? new b(cVar, d.ASCII, i10, 2, bVar, null) : new b(cVar, d.ASCII, i10, 1, bVar, null));
            d[] dVarArr = {d.C40, d.TEXT};
            int i11 = 0;
            while (i11 < 2) {
                d dVar = dVarArr[i11];
                int[] iArr = new int[1];
                if (j(cVar, i10, dVar == d.C40 ? true : r11, iArr) > 0) {
                    e(bVarArr, new b(cVar, dVar, i10, iArr[r11], bVar, null));
                }
                i11++;
                r11 = 0;
            }
            if (cVar.g(i10, 3) && j.k(cVar.charAt(i10)) && j.k(cVar.charAt(i10 + 1)) && j.k(cVar.charAt(i10 + 2))) {
                e(bVarArr, new b(cVar, d.X12, i10, 3, bVar, null));
            }
            e(bVarArr, new b(cVar, d.B256, i10, 1, bVar, null));
        }
        int i12 = 0;
        while (i12 < 3) {
            int i13 = i10 + i12;
            if (!cVar.g(i13, 1) || !j.i(cVar.charAt(i13))) {
                break;
            }
            i12++;
            e(bVarArr, new b(cVar, d.EDF, i10, i12, bVar, null));
        }
        if (i12 == 3 && cVar.g(i10, 4) && j.i(cVar.charAt(i10 + 3))) {
            e(bVarArr, new b(cVar, d.EDF, i10, 4, bVar, null));
        }
    }

    static byte[] g(String str, Charset charset, int i10, m mVar, int i11) {
        return i(new c(str, charset, i10, mVar, i11, null)).b();
    }

    public static String h(String str, Charset charset, int i10, m mVar) {
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
        return new String(g(str, charset, i10, mVar, i11), StandardCharsets.ISO_8859_1);
    }

    static e i(c cVar) {
        int length = cVar.length();
        int i10 = 0;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, length + 1, 6);
        f(cVar, bVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < 6; i12++) {
                b bVar = bVarArr[i11][i12];
                if (bVar != null && i11 < length) {
                    f(cVar, bVarArr, i11, bVar);
                }
            }
            for (int i13 = 0; i13 < 6; i13++) {
                bVarArr[i11 - 1][i13] = null;
            }
        }
        int i14 = -1;
        int i15 = a.e.API_PRIORITY_OTHER;
        while (i10 < 6) {
            b bVar2 = bVarArr[length][i10];
            if (bVar2 != null) {
                int i16 = (i10 < 1 || i10 > 3) ? bVar2.f24008f : bVar2.f24008f + 1;
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

    static int j(c cVar, int i10, boolean z10, int[] iArr) {
        int i11 = 0;
        for (int i12 = i10; i12 < cVar.length(); i12++) {
            if (cVar.a(i12)) {
                iArr[0] = 0;
                return 0;
            }
            char charAt = cVar.charAt(i12);
            if ((z10 && j.h(charAt)) || (!z10 && j.j(charAt))) {
                i11++;
            } else if (k(charAt, cVar.f())) {
                int i13 = charAt & 255;
                i11 = (i13 < 128 || (!(z10 && j.h((char) (i13 + (-128)))) && (z10 || !j.j((char) (i13 + (-128)))))) ? i11 + 4 : i11 + 3;
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

    static boolean k(char c10, int i10) {
        return c10 != i10 && c10 >= 128 && c10 <= 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(char c10) {
        return c10 <= 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(char c10, int i10) {
        for (char c11 : f23997a) {
            if (c11 == c10) {
                return true;
            }
        }
        return c10 == i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(char c10) {
        return l(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean o(char c10, int i10) {
        return m(c10, i10);
    }
}
