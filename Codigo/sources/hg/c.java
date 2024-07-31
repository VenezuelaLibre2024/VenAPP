package hg;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f16766a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(kg.a aVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int l10 = aVar.l() / i10;
        for (int i12 = 0; i12 < l10; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= aVar.h((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    private static void b(kg.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bVar.r(i14, i13);
                    bVar.r(i14, i15);
                    bVar.r(i13, i14);
                    bVar.r(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bVar.r(i16, i16);
        int i17 = i16 + 1;
        bVar.r(i17, i16);
        bVar.r(i16, i17);
        int i18 = i10 + i11;
        bVar.r(i18, i16);
        bVar.r(i18, i17);
        bVar.r(i18, i18 - 1);
    }

    private static void c(kg.b bVar, boolean z10, int i10, kg.a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.h(i12)) {
                    bVar.r(i13, i11 - 5);
                }
                if (aVar.h(i12 + 7)) {
                    bVar.r(i11 + 5, i13);
                }
                if (aVar.h(20 - i12)) {
                    bVar.r(i13, i11 + 5);
                }
                if (aVar.h(27 - i12)) {
                    bVar.r(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.h(i12)) {
                bVar.r(i14, i11 - 7);
            }
            if (aVar.h(i12 + 10)) {
                bVar.r(i11 + 7, i14);
            }
            if (aVar.h(29 - i12)) {
                bVar.r(i14, i11 + 7);
            }
            if (aVar.h(39 - i12)) {
                bVar.r(i11 - 7, i14);
            }
            i12++;
        }
    }

    public static a d(String str, int i10, int i11, Charset charset) {
        return e(str.getBytes(charset != null ? charset : StandardCharsets.ISO_8859_1), i10, i11, charset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a e(byte[] bArr, int i10, int i11, Charset charset) {
        kg.a aVar;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        kg.a a10 = new d(bArr, charset).a();
        int l10 = ((a10.l() * i10) / 100) + 11;
        int l11 = a10.l() + l10;
        int i16 = 4;
        int i17 = 0;
        int i18 = 1;
        if (i11 == 0) {
            kg.a aVar2 = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 <= 32) {
                boolean z11 = i19 <= 3 ? i18 : i17;
                int i21 = z11 != 0 ? i19 + 1 : i19;
                int j10 = j(i21, z11);
                if (l11 <= j10) {
                    if (aVar2 == null || i20 != f16766a[i21]) {
                        int i22 = f16766a[i21];
                        i20 = i22;
                        aVar2 = i(a10, i22);
                    }
                    int i23 = j10 - (j10 % i20);
                    if ((z11 == 0 || aVar2.l() <= i20 * 64) && aVar2.l() + l10 <= i23) {
                        aVar = aVar2;
                        i12 = i20;
                        z10 = z11;
                        i13 = i21;
                        i14 = j10;
                    }
                }
                i19++;
                i18 = i18;
                i16 = 4;
                i17 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z10 = i11 < 0;
        i13 = Math.abs(i11);
        if (i13 > (z10 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
        }
        i14 = j(i13, z10);
        i12 = f16766a[i13];
        int i24 = i14 - (i14 % i12);
        aVar = i(a10, i12);
        if (aVar.l() + l10 > i24) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z10 && aVar.l() > i12 * 64) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        kg.a f10 = f(aVar, i14, i12);
        int l12 = aVar.l() / i12;
        kg.a g10 = g(z10, i13, l12);
        int i25 = (z10 ? 11 : 14) + (i13 * 4);
        int[] iArr = new int[i25];
        int i26 = 2;
        if (z10) {
            for (int i27 = i17; i27 < i25; i27++) {
                iArr[i27] = i27;
            }
            i15 = i25;
        } else {
            int i28 = i25 / 2;
            i15 = i25 + 1 + (((i28 - 1) / 15) * 2);
            int i29 = i15 / 2;
            for (int i30 = i17; i30 < i28; i30++) {
                iArr[(i28 - i30) - 1] = (i29 - r15) - 1;
                iArr[i28 + i30] = (i30 / 15) + i30 + i29 + i18;
            }
        }
        kg.b bVar = new kg.b(i15);
        int i31 = i17;
        int i32 = i31;
        while (i31 < i13) {
            int i33 = ((i13 - i31) * i16) + (z10 ? 9 : 12);
            int i34 = i17;
            while (i34 < i33) {
                int i35 = i34 * 2;
                while (i17 < i26) {
                    if (f10.h(i32 + i35 + i17)) {
                        int i36 = i31 * 2;
                        bVar.r(iArr[i36 + i17], iArr[i36 + i34]);
                    }
                    if (f10.h((i33 * 2) + i32 + i35 + i17)) {
                        int i37 = i31 * 2;
                        bVar.r(iArr[i37 + i34], iArr[((i25 - 1) - i37) - i17]);
                    }
                    if (f10.h((i33 * 4) + i32 + i35 + i17)) {
                        int i38 = (i25 - 1) - (i31 * 2);
                        bVar.r(iArr[i38 - i17], iArr[i38 - i34]);
                    }
                    if (f10.h((i33 * 6) + i32 + i35 + i17)) {
                        int i39 = i31 * 2;
                        bVar.r(iArr[((i25 - 1) - i39) - i34], iArr[i39 + i17]);
                    }
                    i17++;
                    i26 = 2;
                }
                i34++;
                i17 = 0;
                i26 = 2;
            }
            i32 += i33 * 8;
            i31++;
            i16 = 4;
            i17 = 0;
            i26 = 2;
        }
        c(bVar, z10, i15, g10);
        int i40 = i15 / 2;
        if (z10) {
            b(bVar, i40, 5);
        } else {
            b(bVar, i40, 7);
            int i41 = 0;
            int i42 = 0;
            while (i42 < (i25 / 2) - 1) {
                for (int i43 = i40 & 1; i43 < i15; i43 += 2) {
                    int i44 = i40 - i41;
                    bVar.r(i44, i43);
                    int i45 = i40 + i41;
                    bVar.r(i45, i43);
                    bVar.r(i43, i44);
                    bVar.r(i43, i45);
                }
                i42 += 15;
                i41 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.c(z10);
        aVar3.f(i15);
        aVar3.d(i13);
        aVar3.b(l12);
        aVar3.e(bVar);
        return aVar3;
    }

    private static kg.a f(kg.a aVar, int i10, int i11) {
        int l10 = aVar.l() / i11;
        mg.d dVar = new mg.d(h(i11));
        int i12 = i10 / i11;
        int[] a10 = a(aVar, i11, i12);
        dVar.b(a10, i12 - l10);
        kg.a aVar2 = new kg.a();
        aVar2.c(0, i10 % i11);
        for (int i13 : a10) {
            aVar2.c(i13, i11);
        }
        return aVar2;
    }

    static kg.a g(boolean z10, int i10, int i11) {
        int i12;
        kg.a aVar = new kg.a();
        int i13 = i10 - 1;
        if (z10) {
            aVar.c(i13, 2);
            aVar.c(i11 - 1, 6);
            i12 = 28;
        } else {
            aVar.c(i13, 5);
            aVar.c(i11 - 1, 11);
            i12 = 40;
        }
        return f(aVar, i12, 4);
    }

    private static mg.a h(int i10) {
        if (i10 == 4) {
            return mg.a.f21489k;
        }
        if (i10 == 6) {
            return mg.a.f21488j;
        }
        if (i10 == 8) {
            return mg.a.f21492n;
        }
        if (i10 == 10) {
            return mg.a.f21487i;
        }
        if (i10 == 12) {
            return mg.a.f21486h;
        }
        throw new IllegalArgumentException("Unsupported word size " + i10);
    }

    static kg.a i(kg.a aVar, int i10) {
        kg.a aVar2 = new kg.a();
        int l10 = aVar.l();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < l10) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= l10 || aVar.h(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 != i11) {
                if (i16 == 0) {
                    i16 = i13 | 1;
                } else {
                    aVar2.c(i13, i10);
                    i12 += i10;
                }
            }
            aVar2.c(i16, i10);
            i12--;
            i12 += i10;
        }
        return aVar2;
    }

    private static int j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 * 16)) * i10;
    }
}
