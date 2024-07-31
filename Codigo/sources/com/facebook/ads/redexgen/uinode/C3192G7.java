package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.G7 */
/* loaded from: assets/audience_network.dex */
public final class C3192G7 {
    public static byte[] A07;
    public static String[] A08 = {"qcU5l5rVDanZ0IBZnB67EILhI18GgdFe", "32XpuNghlFeF4zyqPL948gmCUNCGk", "bftD5DkqR73p2Uf2yBhEF5T9UOvyv9s", "0", "qryxRa4yOsFNWhLtu25s3YxhDLRy", "", "tLr9RBWs5E21", "UeFN6nMF8sjHvHxScJIKm37Ehl9oCVg2"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final Paint A03;
    public final C3184Fz A04;
    public final C3185G0 A05;
    public final C3191G6 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3184Fz A04(C3305Hy c3305Hy, int i10) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i11 = 8;
        int A045 = c3305Hy.A04(8);
        c3305Hy.A08(8);
        int i12 = i10 - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i12 > 0) {
            int A046 = c3305Hy.A04(i11);
            int A047 = c3305Hy.A04(i11);
            int i13 = i12 - 2;
            int[] iArr = (A047 & RecognitionOptions.ITF) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            if ((A047 & 1) != 0) {
                A04 = c3305Hy.A04(i11);
                A042 = c3305Hy.A04(i11);
                A043 = c3305Hy.A04(i11);
                A044 = c3305Hy.A04(i11);
                i12 = i13 - 4;
            } else {
                A04 = c3305Hy.A04(6) << 2;
                A042 = c3305Hy.A04(4) << 4;
                A043 = c3305Hy.A04(4) << 4;
                A044 = c3305Hy.A04(2) << 6;
                i12 = i13 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                A043 = 0;
                A044 = 255;
            }
            iArr[A046] = A00((byte) (255 - (A044 & 255)), AbstractC3322IF.A06((int) (A04 + ((A042 - 128) * 1.402d)), 0, 255), AbstractC3322IF.A06((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, 255), AbstractC3322IF.A06((int) (A04 + ((A043 - 128) * 1.772d)), 0, 255));
            i11 = 8;
        }
        return new C3184Fz(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3185G0 A05(C3305Hy c3305Hy) {
        int i10;
        int i11;
        int i12;
        int i13;
        c3305Hy.A08(4);
        boolean A0F = c3305Hy.A0F();
        c3305Hy.A08(3);
        int A04 = c3305Hy.A04(16);
        int A042 = c3305Hy.A04(16);
        if (A0F) {
            i10 = c3305Hy.A04(16);
            i13 = c3305Hy.A04(16);
            i11 = c3305Hy.A04(16);
            i12 = c3305Hy.A04(16);
        } else {
            i10 = 0;
            i11 = 0;
            i12 = A042;
            i13 = A04;
        }
        return new C3185G0(A04, A042, i10, i13, i11, i12);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3189G4 A08(C3305Hy c3305Hy, int i10) {
        int i11 = 8;
        int A04 = c3305Hy.A04(8);
        c3305Hy.A08(4);
        boolean A0F = c3305Hy.A0F();
        c3305Hy.A08(3);
        int A042 = c3305Hy.A04(16);
        int A043 = c3305Hy.A04(16);
        int A044 = c3305Hy.A04(3);
        int A045 = c3305Hy.A04(3);
        c3305Hy.A08(2);
        int A046 = c3305Hy.A04(8);
        int A047 = c3305Hy.A04(8);
        int A048 = c3305Hy.A04(4);
        int A049 = c3305Hy.A04(2);
        c3305Hy.A08(2);
        int i12 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i12 > 0) {
            int A0410 = c3305Hy.A04(16);
            int A0411 = c3305Hy.A04(2);
            int A0412 = c3305Hy.A04(2);
            int A0413 = c3305Hy.A04(12);
            c3305Hy.A08(4);
            int A0414 = c3305Hy.A04(12);
            i12 -= 6;
            int i13 = 0;
            int i14 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i13 = c3305Hy.A04(i11);
                i14 = c3305Hy.A04(i11);
                i12 -= 2;
            }
            sparseArray.put(A0410, new C3190G5(A0411, A0412, A0413, A0414, i13, i14));
            i11 = 8;
        }
        return new C3189G4(A04, A0F, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{18, 55, 34, 55, 118, 48, 63, 51, 58, 50, 118, 58, 51, 56, 49, 34, 62, 118, 51, 46, 53, 51, 51, 50, 37, 118, 58, 63, 59, 63, 34, 106, 88, 76, 126, 79, 92, 93, 75, 92};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final List<C3172Fn> A0I(byte[] bArr, int i10) {
        C3305Hy c3305Hy = new C3305Hy(bArr, i10);
        while (c3305Hy.A01() >= 48 && c3305Hy.A04(8) == 15) {
            A0C(c3305Hy, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        C3185G0 c3185g0 = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || c3185g0.A05 + 1 != this.A00.getWidth() || c3185g0.A00 + 1 != this.A00.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c3185g0.A05 + 1, c3185g0.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            this.A01.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C3188G3> sparseArray = this.A06.A01.A03;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            C3188G3 valueAt = sparseArray.valueAt(i11);
            C3189G4 c3189g4 = this.A06.A08.get(sparseArray.keyAt(i11));
            int i12 = valueAt.A00 + c3185g0.A02;
            int i13 = valueAt.A01 + c3185g0.A04;
            this.A01.clipRect(i12, i13, Math.min(c3189g4.A08 + i12, c3185g0.A01), Math.min(c3189g4.A02 + i13, c3185g0.A03), Region.Op.REPLACE);
            C3184Fz c3184Fz = this.A06.A06.get(c3189g4.A00);
            if (c3184Fz == null && (c3184Fz = this.A06.A04.get(c3189g4.A00)) == null) {
                c3184Fz = this.A04;
            }
            SparseArray<C3190G5> sparseArray2 = c3189g4.A09;
            for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                int keyAt = sparseArray2.keyAt(i14);
                C3190G5 valueAt2 = sparseArray2.valueAt(i14);
                C3186G1 c3186g1 = this.A06.A07.get(keyAt);
                String[] strArr = A08;
                if (strArr[0].charAt(24) == strArr[7].charAt(24)) {
                    throw new RuntimeException();
                }
                A08[1] = "0wDldquZfVkccfOmGfzJ1HL0d6oT0";
                if (c3186g1 == null) {
                    c3186g1 = this.A06.A05.get(keyAt);
                }
                if (c3186g1 != null) {
                    A0B(c3186g1, c3184Fz, c3189g4.A01, i12 + valueAt2.A02, i13 + valueAt2.A05, c3186g1.A01 ? null : this.A02, this.A01);
                }
            }
            if (c3189g4.A0A) {
                this.A03.setColor(c3189g4.A01 == 3 ? c3184Fz.A03[c3189g4.A07] : c3189g4.A01 == 2 ? c3184Fz.A02[c3189g4.A06] : c3184Fz.A01[c3189g4.A05]);
                this.A01.drawRect(i12, i13, c3189g4.A08 + i12, c3189g4.A02 + i13, this.A03);
            }
            arrayList.add(new C3172Fn(Bitmap.createBitmap(this.A00, i12, i13, c3189g4.A08, c3189g4.A02), i12 / c3185g0.A05, 0, i13 / c3185g0.A00, 0, c3189g4.A08 / c3185g0.A05, c3189g4.A02 / c3185g0.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public C3192G7(int i10, int i11) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C3185G0(719, 575, 0, 719, 0, 575);
        this.A04 = new C3184Fz(0, A0F(), A0G(), A0H());
        this.A06 = new C3191G6(i10, i11);
    }

    public static int A00(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0053. Please report as an issue. */
    public static int A01(C3305Hy c3305Hy, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12 = i10;
        boolean z10 = false;
        do {
            int i13 = 0;
            int i14 = 0;
            i14 = 0;
            i14 = 0;
            i14 = 0;
            int A04 = c3305Hy.A04(2);
            if (A04 != 0) {
                i13 = 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "cKDkKJCaTP5Z";
                i14 = A04;
            } else if (c3305Hy.A0F()) {
                i13 = c3305Hy.A04(3) + 3;
                i14 = c3305Hy.A04(2);
                if (A08[1].length() == 29) {
                    A08[1] = "Xe5wyvwrL1rxQiCfD8ENREY9AaRUH";
                }
            } else if (c3305Hy.A0F()) {
                i13 = 1;
            } else {
                switch (c3305Hy.A04(2)) {
                    case 0:
                        z10 = true;
                        break;
                    case 1:
                        i13 = 2;
                        break;
                    case 2:
                        i13 = c3305Hy.A04(4) + 12;
                        i14 = c3305Hy.A04(2);
                        break;
                    case 3:
                        i13 = c3305Hy.A04(8) + 29;
                        if (A08[1].length() == 29) {
                            A08[5] = "eZC8v48u";
                            i14 = c3305Hy.A04(2);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                }
            }
            if (i13 != 0 && paint != null) {
                if (bArr != null) {
                    i14 = bArr[i14];
                }
                paint.setColor(iArr[i14]);
                canvas.drawRect(i12, i11, i12 + i13, i11 + 1, paint);
            }
            i12 += i13;
        } while (!z10);
        return i12;
    }

    public static int A02(C3305Hy c3305Hy, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12 = i10;
        boolean z10 = false;
        do {
            int peek = 0;
            int A04 = c3305Hy.A04(4);
            if (A04 != 0) {
                peek = 1;
            } else if (!c3305Hy.A0F()) {
                int A042 = c3305Hy.A04(3);
                if (A042 != 0) {
                    peek = A042 + 2;
                    A04 = 0;
                } else {
                    z10 = true;
                    A04 = 0;
                }
            } else if (!c3305Hy.A0F()) {
                peek = c3305Hy.A04(2) + 4;
                A04 = c3305Hy.A04(4);
            } else {
                switch (c3305Hy.A04(2)) {
                    case 0:
                        peek = 1;
                        if (A08[1].length() == 29) {
                            String[] strArr = A08;
                            strArr[3] = "b";
                            strArr[4] = "RKCQrML1KI9i2rbeBXbE06C32ORX";
                            A04 = 0;
                            break;
                        } else {
                            A04 = 0;
                            break;
                        }
                    case 1:
                        peek = 2;
                        A04 = 0;
                        break;
                    case 2:
                        peek = c3305Hy.A04(4) + 9;
                        A04 = c3305Hy.A04(4);
                        break;
                    case 3:
                        peek = c3305Hy.A04(8) + 25;
                        String[] strArr2 = A08;
                        if (strArr2[3].length() != strArr2[4].length()) {
                            A08[6] = "tDVEwF5JbpPt";
                            A04 = c3305Hy.A04(4);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    default:
                        A04 = 0;
                        break;
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                float f10 = i12;
                float f11 = i11;
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "PxagUxU0Gd3Wd2jZQY5J7se2mW8fT";
                canvas.drawRect(f10, f11, i12 + peek, i11 + 1, paint);
            }
            i12 += peek;
        } while (!z10);
        return i12;
    }

    public static int A03(C3305Hy c3305Hy, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int clutIndex;
        int i12 = i10;
        boolean z10 = false;
        do {
            int A04 = c3305Hy.A04(8);
            if (A04 != 0) {
                clutIndex = 1;
            } else if (!c3305Hy.A0F()) {
                clutIndex = c3305Hy.A04(7);
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "SuejjuLnG0h9t9VMaryqiTg33Oi2Z";
                if (clutIndex != 0) {
                    A04 = 0;
                } else {
                    z10 = true;
                    clutIndex = 0;
                    A04 = 0;
                }
            } else {
                clutIndex = c3305Hy.A04(7);
                A04 = c3305Hy.A04(8);
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i12, i11, i12 + clutIndex, i11 + 1, paint);
            }
            i12 += clutIndex;
        } while (!z10);
        return i12;
    }

    public static C3186G1 A06(C3305Hy c3305Hy) {
        int A04 = c3305Hy.A04(16);
        c3305Hy.A08(4);
        int objectId = c3305Hy.A04(2);
        boolean A0F = c3305Hy.A0F();
        c3305Hy.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (objectId == 1) {
            int numberOfCodes = c3305Hy.A04(8);
            c3305Hy.A08(numberOfCodes * 16);
        } else if (objectId == 0) {
            int objectCodingMethod = c3305Hy.A04(16);
            int objectId2 = c3305Hy.A04(16);
            if (objectCodingMethod > 0) {
                bArr = new byte[objectCodingMethod];
                c3305Hy.A0E(bArr, 0, objectCodingMethod);
            }
            if (objectId2 > 0) {
                bArr2 = new byte[objectId2];
                c3305Hy.A0E(bArr2, 0, objectId2);
            } else {
                bArr2 = bArr;
            }
        }
        return new C3186G1(A04, A0F, bArr, bArr2);
    }

    public static C3187G2 A07(C3305Hy c3305Hy, int i10) {
        int A04 = c3305Hy.A04(8);
        int A042 = c3305Hy.A04(4);
        int A043 = c3305Hy.A04(2);
        c3305Hy.A08(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int remainingLength = c3305Hy.A04(8);
            c3305Hy.A08(8);
            int version = c3305Hy.A04(16);
            int timeoutSecs = c3305Hy.A04(16);
            i11 -= 6;
            sparseArray.put(remainingLength, new C3188G3(version, timeoutSecs));
        }
        return new C3187G2(A04, A042, A043, sparseArray);
    }

    public static void A0B(C3186G1 c3186g1, C3184Fz c3184Fz, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = c3184Fz.A03;
        } else {
            if (A08[2].length() == 20) {
                throw new RuntimeException();
            }
            A08[1] = "74G7JuTvJBV0INH1XI3DUfK6d2EWZ";
            if (i10 == 2) {
                iArr = c3184Fz.A02;
            } else {
                iArr = c3184Fz.A01;
            }
        }
        A0D(c3186g1.A03, iArr, i10, i11, i12, paint, canvas);
        A0D(c3186g1.A02, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r0 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r7.A01 = r4;
        r7.A08.clear();
        r7.A06.clear();
        r7.A07.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        if (r5 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        r1 = r5.A02;
        r0 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
    
        if (r1 == r0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011f, code lost:
    
        r7.A01 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        if (r0 != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0C(com.facebook.ads.redexgen.uinode.C3305Hy r6, com.facebook.ads.redexgen.uinode.C3191G6 r7) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3192G7.A0C(com.facebook.ads.redexgen.X.Hy, com.facebook.ads.redexgen.X.G6):void");
    }

    public static void A0D(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] clutMapTable4To8;
        byte[] clutMapTable4To82;
        int line = i12;
        C3305Hy c3305Hy = new C3305Hy(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        int column = i11;
        while (c3305Hy.A01() != 0) {
            switch (c3305Hy.A04(8)) {
                case 16:
                    if (i10 == 3) {
                        clutMapTable4To8 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i10 == 2) {
                        clutMapTable4To8 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        clutMapTable4To8 = null;
                        if (A08[5].length() == 5) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A08;
                        strArr[0] = "aCQdDxqS2bkmSWw219FL9FrVQLNlGxjh";
                        strArr[7] = "CXVqOrR1KNECyNPiemwICdwFVxmD3XsB";
                    }
                    if (A08[5].length() != 5) {
                        A08[1] = "sxwfPuAvCy0meNXm9qprXKFgJpDmZ";
                        column = A01(c3305Hy, iArr, clutMapTable4To8, column, line, paint, canvas);
                        c3305Hy.A05();
                        break;
                    } else {
                        throw new RuntimeException();
                    }
                case 17:
                    if (i10 == 3) {
                        clutMapTable4To82 = 0 == 0 ? A0B : null;
                    } else {
                        clutMapTable4To82 = null;
                    }
                    column = A02(c3305Hy, iArr, clutMapTable4To82, column, line, paint, canvas);
                    c3305Hy.A05();
                    break;
                case 18:
                    column = A03(c3305Hy, iArr, null, column, line, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c3305Hy);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c3305Hy);
                    break;
                case 34:
                    clutMapTable2To4 = A0E(16, 8, c3305Hy);
                    break;
                case 240:
                    line += 2;
                    column = i11;
                    break;
            }
        }
    }

    public static byte[] A0E(int i10, int i11, C3305Hy c3305Hy) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c3305Hy.A04(i11);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < iArr.length; i10++) {
            if (i10 < 8) {
                int i11 = i10 & 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "OBOqbcJ5TVgi";
                int i12 = i11 != 0 ? 255 : 0;
                iArr[i10] = A00(255, i12, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i13 = (i10 & 1) != 0 ? 127 : 0;
                iArr[i10] = A00(255, i13, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0161, code lost:
    
        if (r8 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0163, code lost:
    
        r0 = 170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b6, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b3, code lost:
    
        if (r8 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x003c, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x004f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3192G7.A0H():int[]");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
