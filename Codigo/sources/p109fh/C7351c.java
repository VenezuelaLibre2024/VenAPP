package p109fh;

import com.google.android.gms.common.api.C5101a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kg.C9263a;
import kg.C9278p;
import kg.EnumC9266d;
import mg.C9580a;
import mg.C9583d;
import p066dg.C6961v;
import p067dh.C6971j;
import p067dh.EnumC6967f;
import p067dh.EnumC6969h;

/* renamed from: fh.c */
/* loaded from: classes2.dex */
public final class C7351c {

    /* renamed from: a */
    private static final int[] f16616a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b */
    static final Charset f16617b = StandardCharsets.ISO_8859_1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.c$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16618a;

        static {
            int[] iArr = new int[EnumC6969h.values().length];
            f16618a = iArr;
            try {
                iArr[EnumC6969h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16618a[EnumC6969h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16618a[EnumC6969h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16618a[EnumC6969h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    static void m22099a(String str, C9263a c9263a, Charset charset) {
        for (byte b10 : str.getBytes(charset)) {
            c9263a.m27583c(b10, 8);
        }
    }

    /* renamed from: b */
    static void m22100b(CharSequence charSequence, C9263a c9263a) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int m22114p = m22114p(charSequence.charAt(i10));
            if (m22114p == -1) {
                throw new C6961v();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int m22114p2 = m22114p(charSequence.charAt(i11));
                if (m22114p2 == -1) {
                    throw new C6961v();
                }
                c9263a.m27583c((m22114p * 45) + m22114p2, 11);
                i10 += 2;
            } else {
                c9263a.m27583c(m22114p, 6);
                i10 = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m22101c(String str, EnumC6969h enumC6969h, C9263a c9263a, Charset charset) {
        int i10 = a.f16618a[enumC6969h.ordinal()];
        if (i10 == 1) {
            m22106h(str, c9263a);
            return;
        }
        if (i10 == 2) {
            m22100b(str, c9263a);
            return;
        }
        if (i10 == 3) {
            m22099a(str, c9263a, charset);
        } else {
            if (i10 == 4) {
                m22103e(str, c9263a);
                return;
            }
            throw new C6961v("Invalid mode: " + enumC6969h);
        }
    }

    /* renamed from: d */
    private static void m22102d(EnumC9266d enumC9266d, C9263a c9263a) {
        c9263a.m27583c(EnumC6969h.ECI.m20153h(), 4);
        c9263a.m27583c(enumC9266d.m27624m(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[LOOP:0: B:4:0x000f->B:11:0x003c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m22103e(java.lang.String r6, kg.C9263a r7) {
        /*
            java.nio.charset.Charset r0 = kg.C9278p.f22530b
            byte[] r6 = r6.getBytes(r0)
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L54
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 0
        Lf:
            if (r1 >= r0) goto L53
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L2b
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L2b
        L29:
            int r2 = r2 - r3
            goto L3a
        L2b:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L39
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L39
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L29
        L39:
            r2 = r4
        L3a:
            if (r2 == r4) goto L4b
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.m27583c(r3, r2)
            int r1 = r1 + 2
            goto Lf
        L4b:
            dg.v r6 = new dg.v
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L53:
            return
        L54:
            dg.v r6 = new dg.v
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p109fh.C7351c.m22103e(java.lang.String, kg.a):void");
    }

    /* renamed from: f */
    static void m22104f(int i10, C6971j c6971j, EnumC6969h enumC6969h, C9263a c9263a) {
        int m20154i = enumC6969h.m20154i(c6971j);
        int i11 = 1 << m20154i;
        if (i10 < i11) {
            c9263a.m27583c(i10, m20154i);
            return;
        }
        throw new C6961v(i10 + " is bigger than " + (i11 - 1));
    }

    /* renamed from: g */
    static void m22105g(EnumC6969h enumC6969h, C9263a c9263a) {
        c9263a.m27583c(enumC6969h.m20153h(), 4);
    }

    /* renamed from: h */
    static void m22106h(CharSequence charSequence, C9263a c9263a) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                c9263a.m27583c((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    c9263a.m27583c((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    c9263a.m27583c(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m22107i(EnumC6969h enumC6969h, C9263a c9263a, C9263a c9263a2, C6971j c6971j) {
        return c9263a.m27590l() + enumC6969h.m20154i(c6971j) + c9263a2.m27590l();
    }

    /* renamed from: j */
    private static int m22108j(C7350b c7350b) {
        return C7352d.m22121a(c7350b) + C7352d.m22123c(c7350b) + C7352d.m22124d(c7350b) + C7352d.m22125e(c7350b);
    }

    /* renamed from: k */
    private static int m22109k(C9263a c9263a, EnumC6967f enumC6967f, C6971j c6971j, C7350b c7350b) {
        int i10 = C5101a.e.API_PRIORITY_OTHER;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            C7353e.m22129a(c9263a, enumC6967f, c6971j, i12, c7350b);
            int m22108j = m22108j(c7350b);
            if (m22108j < i10) {
                i11 = i12;
                i10 = m22108j;
            }
        }
        return i11;
    }

    /* renamed from: l */
    private static EnumC6969h m22110l(String str, Charset charset) {
        if (C9278p.f22530b.equals(charset) && m22117s(str)) {
            return EnumC6969h.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else {
                if (m22114p(charAt) == -1) {
                    return EnumC6969h.BYTE;
                }
                z10 = true;
            }
        }
        return z10 ? EnumC6969h.ALPHANUMERIC : z11 ? EnumC6969h.NUMERIC : EnumC6969h.BYTE;
    }

    /* renamed from: m */
    private static C6971j m22111m(int i10, EnumC6967f enumC6967f) {
        for (int i11 = 1; i11 <= 40; i11++) {
            C6971j m20159i = C6971j.m20159i(i11);
            if (m22120v(i10, m20159i, enumC6967f)) {
                return m20159i;
            }
        }
        throw new C6961v("Data too big");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x013b, code lost:
    
        if (p109fh.C7355g.m22182b(r8) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p109fh.C7355g m22112n(java.lang.String r6, p067dh.EnumC6967f r7, java.util.Map<p066dg.EnumC6946g, ?> r8) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p109fh.C7351c.m22112n(java.lang.String, dh.f, java.util.Map):fh.g");
    }

    /* renamed from: o */
    static byte[] m22113o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new C9583d(C9580a.f23344l).m28556b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int m22114p(int i10) {
        int[] iArr = f16616a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    /* renamed from: q */
    static void m22115q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 >= i12) {
            throw new C6961v("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new C6961v("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new C6961v("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new C6961v("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    /* renamed from: r */
    static C9263a m22116r(C9263a c9263a, int i10, int i11, int i12) {
        if (c9263a.m27591m() != i11) {
            throw new C6961v("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            m22115q(i10, i11, i12, i16, iArr, iArr2);
            int i17 = iArr[0];
            byte[] bArr = new byte[i17];
            c9263a.m27596u(i13 * 8, bArr, 0, i17);
            byte[] m22113o = m22113o(bArr, iArr2[0]);
            arrayList.add(new C7349a(bArr, m22113o));
            i14 = Math.max(i14, i17);
            i15 = Math.max(i15, m22113o.length);
            i13 += iArr[0];
        }
        if (i11 != i13) {
            throw new C6961v("Data bytes does not match offset");
        }
        C9263a c9263a2 = new C9263a();
        for (int i18 = 0; i18 < i14; i18++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] m22090a = ((C7349a) it.next()).m22090a();
                if (i18 < m22090a.length) {
                    c9263a2.m27583c(m22090a[i18], 8);
                }
            }
        }
        for (int i19 = 0; i19 < i15; i19++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] m22091b = ((C7349a) it2.next()).m22091b();
                if (i19 < m22091b.length) {
                    c9263a2.m27583c(m22091b[i19], 8);
                }
            }
        }
        if (i10 == c9263a2.m27591m()) {
            return c9263a2;
        }
        throw new C6961v("Interleaving error: " + i10 + " and " + c9263a2.m27591m() + " differ.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static boolean m22117s(String str) {
        byte[] bytes = str.getBytes(C9278p.f22530b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = bytes[i10] & 255;
            if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    private static C6971j m22118t(EnumC6967f enumC6967f, EnumC6969h enumC6969h, C9263a c9263a, C9263a c9263a2) {
        return m22111m(m22107i(enumC6969h, c9263a, c9263a2, m22111m(m22107i(enumC6969h, c9263a, c9263a2, C6971j.m20159i(1)), enumC6967f)), enumC6967f);
    }

    /* renamed from: u */
    static void m22119u(int i10, C9263a c9263a) {
        int i11 = i10 * 8;
        if (c9263a.m27590l() > i11) {
            throw new C6961v("data bits cannot fit in the QR Code" + c9263a.m27590l() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && c9263a.m27590l() < i11; i12++) {
            c9263a.m27581a(false);
        }
        int m27590l = c9263a.m27590l() & 7;
        if (m27590l > 0) {
            while (m27590l < 8) {
                c9263a.m27581a(false);
                m27590l++;
            }
        }
        int m27591m = i10 - c9263a.m27591m();
        for (int i13 = 0; i13 < m27591m; i13++) {
            c9263a.m27583c((i13 & 1) == 0 ? 236 : 17, 8);
        }
        if (c9263a.m27590l() != i11) {
            throw new C6961v("Bits size does not equal capacity");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static boolean m22120v(int i10, C6971j c6971j, EnumC6967f enumC6967f) {
        return c6971j.m20164h() - c6971j.m20163f(enumC6967f).m20171d() >= (i10 + 7) / 8;
    }
}
