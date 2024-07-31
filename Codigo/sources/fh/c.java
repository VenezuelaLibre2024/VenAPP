package fh;

import com.google.android.gms.common.api.a;
import dg.v;
import dh.h;
import dh.j;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kg.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f15193a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final Charset f15194b = StandardCharsets.ISO_8859_1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15195a;

        static {
            int[] iArr = new int[h.values().length];
            f15195a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15195a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15195a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15195a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, kg.a aVar, Charset charset) {
        for (byte b10 : str.getBytes(charset)) {
            aVar.c(b10, 8);
        }
    }

    static void b(CharSequence charSequence, kg.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int p10 = p(charSequence.charAt(i10));
            if (p10 == -1) {
                throw new v();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int p11 = p(charSequence.charAt(i11));
                if (p11 == -1) {
                    throw new v();
                }
                aVar.c((p10 * 45) + p11, 11);
                i10 += 2;
            } else {
                aVar.c(p10, 6);
                i10 = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(String str, h hVar, kg.a aVar, Charset charset) {
        int i10 = a.f15195a[hVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
            return;
        }
        if (i10 == 2) {
            b(str, aVar);
            return;
        }
        if (i10 == 3) {
            a(str, aVar, charset);
        } else {
            if (i10 == 4) {
                e(str, aVar);
                return;
            }
            throw new v("Invalid mode: " + hVar);
        }
    }

    private static void d(kg.d dVar, kg.a aVar) {
        aVar.c(h.ECI.h(), 4);
        aVar.c(dVar.m(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[LOOP:0: B:4:0x000f->B:11:0x003c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void e(java.lang.String r6, kg.a r7) {
        /*
            java.nio.charset.Charset r0 = kg.p.f20708b
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
            r7.c(r3, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: fh.c.e(java.lang.String, kg.a):void");
    }

    static void f(int i10, j jVar, h hVar, kg.a aVar) {
        int i11 = hVar.i(jVar);
        int i12 = 1 << i11;
        if (i10 < i12) {
            aVar.c(i10, i11);
            return;
        }
        throw new v(i10 + " is bigger than " + (i12 - 1));
    }

    static void g(h hVar, kg.a aVar) {
        aVar.c(hVar.h(), 4);
    }

    static void h(CharSequence charSequence, kg.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.c((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.c((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.c(charAt, 4);
                }
            }
        }
    }

    private static int i(h hVar, kg.a aVar, kg.a aVar2, j jVar) {
        return aVar.l() + hVar.i(jVar) + aVar2.l();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(kg.a aVar, dh.f fVar, j jVar, b bVar) {
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, fVar, jVar, i12, bVar);
            int j10 = j(bVar);
            if (j10 < i10) {
                i11 = i12;
                i10 = j10;
            }
        }
        return i11;
    }

    private static h l(String str, Charset charset) {
        if (p.f20708b.equals(charset) && s(str)) {
            return h.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else {
                if (p(charAt) == -1) {
                    return h.BYTE;
                }
                z10 = true;
            }
        }
        return z10 ? h.ALPHANUMERIC : z11 ? h.NUMERIC : h.BYTE;
    }

    private static j m(int i10, dh.f fVar) {
        for (int i11 = 1; i11 <= 40; i11++) {
            j i12 = j.i(i11);
            if (v(i10, i12, fVar)) {
                return i12;
            }
        }
        throw new v("Data too big");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x013b, code lost:
    
        if (fh.g.b(r8) != false) goto L62;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static fh.g n(java.lang.String r6, dh.f r7, java.util.Map<dg.g, ?> r8) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.c.n(java.lang.String, dh.f, java.util.Map):fh.g");
    }

    static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new mg.d(mg.a.f21490l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i10) {
        int[] iArr = f15193a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 >= i12) {
            throw new v("Block ID too large");
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
            throw new v("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new v("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new v("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    static kg.a r(kg.a aVar, int i10, int i11, int i12) {
        if (aVar.m() != i11) {
            throw new v("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            q(i10, i11, i12, i16, iArr, iArr2);
            int i17 = iArr[0];
            byte[] bArr = new byte[i17];
            aVar.u(i13 * 8, bArr, 0, i17);
            byte[] o10 = o(bArr, iArr2[0]);
            arrayList.add(new fh.a(bArr, o10));
            i14 = Math.max(i14, i17);
            i15 = Math.max(i15, o10.length);
            i13 += iArr[0];
        }
        if (i11 != i13) {
            throw new v("Data bytes does not match offset");
        }
        kg.a aVar2 = new kg.a();
        for (int i18 = 0; i18 < i14; i18++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] a10 = ((fh.a) it.next()).a();
                if (i18 < a10.length) {
                    aVar2.c(a10[i18], 8);
                }
            }
        }
        for (int i19 = 0; i19 < i15; i19++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] b10 = ((fh.a) it2.next()).b();
                if (i19 < b10.length) {
                    aVar2.c(b10[i19], 8);
                }
            }
        }
        if (i10 == aVar2.m()) {
            return aVar2;
        }
        throw new v("Interleaving error: " + i10 + " and " + aVar2.m() + " differ.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(String str) {
        byte[] bytes = str.getBytes(p.f20708b);
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

    private static j t(dh.f fVar, h hVar, kg.a aVar, kg.a aVar2) {
        return m(i(hVar, aVar, aVar2, m(i(hVar, aVar, aVar2, j.i(1)), fVar)), fVar);
    }

    static void u(int i10, kg.a aVar) {
        int i11 = i10 * 8;
        if (aVar.l() > i11) {
            throw new v("data bits cannot fit in the QR Code" + aVar.l() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.l() < i11; i12++) {
            aVar.a(false);
        }
        int l10 = aVar.l() & 7;
        if (l10 > 0) {
            while (l10 < 8) {
                aVar.a(false);
                l10++;
            }
        }
        int m10 = i10 - aVar.m();
        for (int i13 = 0; i13 < m10; i13++) {
            aVar.c((i13 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.l() != i11) {
            throw new v("Bits size does not equal capacity");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v(int i10, j jVar, dh.f fVar) {
        return jVar.h() - jVar.f(fVar).d() >= (i10 + 7) / 8;
    }
}
