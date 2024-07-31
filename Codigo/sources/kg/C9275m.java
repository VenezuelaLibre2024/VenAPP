package kg;

import java.lang.reflect.Array;
import p066dg.AbstractC6941b;
import p066dg.AbstractC6949j;

/* renamed from: kg.m */
/* loaded from: classes2.dex */
public final class C9275m extends C9273k {

    /* renamed from: e */
    private C9264b f22513e;

    public C9275m(AbstractC6949j abstractC6949j) {
        super(abstractC6949j);
    }

    /* renamed from: i */
    private static int[][] m27663i(byte[] bArr, int i10, int i11, int i12, int i13) {
        char c10;
        int i14 = 8;
        int i15 = i13 - 8;
        int i16 = i12 - 8;
        char c11 = 2;
        boolean z10 = true;
        int i17 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, i10);
        int i18 = 0;
        while (i18 < i11) {
            int i19 = i18 << 3;
            if (i19 > i15) {
                i19 = i15;
            }
            int i20 = i17;
            while (i20 < i10) {
                int i21 = i20 << 3;
                if (i21 > i16) {
                    i21 = i16;
                }
                int i22 = (i19 * i12) + i21;
                int i23 = i17;
                int i24 = i23;
                int i25 = i24;
                int i26 = 255;
                while (i23 < i14) {
                    int i27 = i25;
                    int i28 = 0;
                    while (i28 < i14) {
                        int i29 = bArr[i22 + i28] & 255;
                        i24 += i29;
                        if (i29 < i26) {
                            i26 = i29;
                        }
                        if (i29 > i27) {
                            i27 = i29;
                        }
                        i28++;
                        i14 = 8;
                    }
                    if (i27 - i26 <= 24) {
                        i23++;
                        i22 += i12;
                        i25 = i27;
                        z10 = true;
                        i14 = 8;
                    }
                    while (true) {
                        i23++;
                        i22 += i12;
                        if (i23 < 8) {
                            int i30 = 0;
                            for (int i31 = 8; i30 < i31; i31 = 8) {
                                i24 += bArr[i22 + i30] & 255;
                                i30++;
                            }
                        }
                    }
                    i23++;
                    i22 += i12;
                    i25 = i27;
                    z10 = true;
                    i14 = 8;
                }
                boolean z11 = z10;
                int i32 = i24 >> 6;
                if (i25 - i26 <= 24) {
                    i32 = i26 / 2;
                    if (i18 > 0 && i20 > 0) {
                        int[] iArr2 = iArr[i18 - 1];
                        int i33 = i20 - 1;
                        c10 = 2;
                        int i34 = ((iArr2[i20] + (iArr[i18][i33] * 2)) + iArr2[i33]) / 4;
                        if (i26 < i34) {
                            i32 = i34;
                        }
                        iArr[i18][i20] = i32;
                        i20++;
                        z10 = z11;
                        c11 = c10;
                        i14 = 8;
                        i17 = 0;
                    }
                }
                c10 = 2;
                iArr[i18][i20] = i32;
                i20++;
                z10 = z11;
                c11 = c10;
                i14 = 8;
                i17 = 0;
            }
            i18++;
            i14 = 8;
            i17 = 0;
        }
        return iArr;
    }

    /* renamed from: j */
    private static void m27664j(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, C9264b c9264b) {
        int i14 = i13 - 8;
        int i15 = i12 - 8;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i16 << 3;
            int i18 = i17 > i14 ? i14 : i17;
            int m27665k = m27665k(i16, i11 - 3);
            for (int i19 = 0; i19 < i10; i19++) {
                int i20 = i19 << 3;
                int i21 = i20 > i15 ? i15 : i20;
                int m27665k2 = m27665k(i19, i10 - 3);
                int i22 = 0;
                for (int i23 = -2; i23 <= 2; i23++) {
                    int[] iArr2 = iArr[m27665k + i23];
                    i22 += iArr2[m27665k2 - 2] + iArr2[m27665k2 - 1] + iArr2[m27665k2] + iArr2[m27665k2 + 1] + iArr2[2 + m27665k2];
                }
                m27666l(bArr, i21, i18, i22 / 25, i12, c9264b);
            }
        }
    }

    /* renamed from: k */
    private static int m27665k(int i10, int i11) {
        if (i10 < 2) {
            return 2;
        }
        return Math.min(i10, i11);
    }

    /* renamed from: l */
    private static void m27666l(byte[] bArr, int i10, int i11, int i12, int i13, C9264b c9264b) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    c9264b.m27612r(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    @Override // p066dg.AbstractC6941b
    /* renamed from: a */
    public AbstractC6941b mo20078a(AbstractC6949j abstractC6949j) {
        return new C9275m(abstractC6949j);
    }

    @Override // kg.C9273k, p066dg.AbstractC6941b
    /* renamed from: b */
    public C9264b mo20079b() {
        C9264b mo20079b;
        C9264b c9264b = this.f22513e;
        if (c9264b != null) {
            return c9264b;
        }
        AbstractC6949j m20082e = m20082e();
        int m20102d = m20082e.m20102d();
        int m20101a = m20082e.m20101a();
        if (m20102d < 40 || m20101a < 40) {
            mo20079b = super.mo20079b();
        } else {
            byte[] mo20096b = m20082e.mo20096b();
            int i10 = m20102d >> 3;
            if ((m20102d & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = m20101a >> 3;
            if ((m20101a & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] m27663i = m27663i(mo20096b, i11, i13, m20102d, m20101a);
            mo20079b = new C9264b(m20102d, m20101a);
            m27664j(mo20096b, i11, i13, m20102d, m20101a, m27663i, mo20079b);
        }
        this.f22513e = mo20079b;
        return this.f22513e;
    }
}
