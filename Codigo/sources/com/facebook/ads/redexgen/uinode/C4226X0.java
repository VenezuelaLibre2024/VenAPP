package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.X0 */
/* loaded from: assets/audience_network.dex */
public final class C4226X0 implements InterfaceC3012Cy {
    public static byte[] A0E;
    public static String[] A0F = {"NvpEV7R7ZS5uNQ5TFb57EvhjwIZCTQku", "DdUDSiCrGQUoEviiVingxcQFfwNbDa", "hetlnsRY2wqGSQpiRITV", "h6jp2Z", "H3YUjFwBN5I", "HDGGogJPAHFPfOUxVzLcmHcfpTDLo", "fvYnB4Gz7ZvwaQ8Y4EtF6ZMgsdzNJKEV", "DcduA0DmY9P8nwkm6XpLf73k0ckt"};
    public long A00;
    public long A01;
    public InterfaceC2962C4 A02;
    public C3017D3 A03;
    public String A04;
    public boolean A05;
    public final C3021D7 A0B;
    public final boolean[] A0D = new boolean[3];
    public final C3018D4 A0A = new C3018D4(32, RecognitionOptions.ITF);
    public final C3018D4 A08 = new C3018D4(33, RecognitionOptions.ITF);
    public final C3018D4 A06 = new C3018D4(34, RecognitionOptions.ITF);
    public final C3018D4 A07 = new C3018D4(39, RecognitionOptions.ITF);
    public final C3018D4 A09 = new C3018D4(40, RecognitionOptions.ITF);
    public final C3306Hz A0C = new C3306Hz();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A0F[3] = "YNSDJ1";
        A0E = new byte[]{121, 3, 7, 4, 99, 84, 80, 85, 84, 67, 126, 69, 78, 83, 91, 78, 72, 95, 78, 79, 11, 74, 88, 91, 78, 72, 95, 116, 89, 74, 95, 66, 68, 116, 66, 79, 72, 11, 93, 74, 71, 94, 78, 17, 11, 78, 81, 92, 93, 87, 23, 80, 93, 78, 91};
    }

    static {
        A02();
    }

    public C4226X0(C3021D7 c3021d7) {
        this.A0B = c3021d7;
    }

    public static Format A00(String str, C3018D4 c3018d4, C3018D4 c3018d42, C3018D4 c3018d43) {
        byte[] bArr = new byte[c3018d4.A00 + c3018d42.A00 + c3018d43.A00];
        System.arraycopy(c3018d4.A01, 0, bArr, 0, c3018d4.A00);
        System.arraycopy(c3018d42.A01, 0, bArr, c3018d4.A00, c3018d42.A00);
        System.arraycopy(c3018d43.A01, 0, bArr, c3018d4.A00 + c3018d42.A00, c3018d43.A00);
        C3307I0 c3307i0 = new C3307I0(c3018d42.A01, 0, c3018d42.A00);
        c3307i0.A07(44);
        int maxSubLayersMinus1 = c3307i0.A05(3);
        c3307i0.A06();
        c3307i0.A07(88);
        c3307i0.A07(8);
        int i10 = 0;
        for (int i11 = 0; i11 < maxSubLayersMinus1; i11++) {
            if (c3307i0.A0A()) {
                i10 += 89;
            }
            if (c3307i0.A0A()) {
                i10 += 8;
            }
        }
        c3307i0.A07(i10);
        if (maxSubLayersMinus1 > 0) {
            c3307i0.A07((8 - maxSubLayersMinus1) * 2);
        }
        c3307i0.A04();
        int A04 = c3307i0.A04();
        if (A04 == 3) {
            c3307i0.A06();
        }
        int picHeightInLumaSamples = c3307i0.A04();
        int confWinLeftOffset = c3307i0.A04();
        if (A0F[1].length() == 12) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[4] = "a8PzOvYW3xW";
        strArr[2] = "i4yWj6LgSPQERWLdQfta";
        if (c3307i0.A0A()) {
            int chromaFormatIdc = c3307i0.A04();
            int A042 = c3307i0.A04();
            int toSkip = c3307i0.A04();
            int A043 = c3307i0.A04();
            picHeightInLumaSamples -= (chromaFormatIdc + A042) * ((A04 == 1 || A04 == 2) ? 2 : 1);
            confWinLeftOffset -= (toSkip + A043) * (A04 == 1 ? 2 : 1);
        }
        c3307i0.A04();
        c3307i0.A04();
        int A044 = c3307i0.A04();
        for (int i12 = c3307i0.A0A() ? 0 : maxSubLayersMinus1; i12 <= maxSubLayersMinus1; i12++) {
            c3307i0.A04();
            c3307i0.A04();
            c3307i0.A04();
        }
        c3307i0.A04();
        c3307i0.A04();
        c3307i0.A04();
        c3307i0.A04();
        c3307i0.A04();
        c3307i0.A04();
        if (c3307i0.A0A() && c3307i0.A0A()) {
            A05(c3307i0);
        }
        c3307i0.A07(2);
        if (c3307i0.A0A()) {
            c3307i0.A07(8);
            c3307i0.A04();
            c3307i0.A04();
            c3307i0.A06();
        }
        A06(c3307i0);
        if (c3307i0.A0A()) {
            for (int i13 = 0; i13 < c3307i0.A04(); i13++) {
                c3307i0.A07(A044 + 4 + 1);
            }
        }
        c3307i0.A07(2);
        float f10 = 1.0f;
        if (c3307i0.A0A() && c3307i0.A0A()) {
            int picWidthInLumaSamples = c3307i0.A05(8);
            if (picWidthInLumaSamples == 255) {
                int A05 = c3307i0.A05(16);
                int A052 = c3307i0.A05(16);
                if (A05 != 0 && A052 != 0) {
                    f10 = A05 / A052;
                }
            } else {
                float[] fArr = AbstractC3302Hv.A04;
                String[] strArr2 = A0F;
                if (strArr2[4].length() == strArr2[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0F;
                strArr3[4] = "Mq8kmMTSiz0";
                strArr3[2] = "TBAE07oWZ5Khy7farxDr";
                if (picWidthInLumaSamples < fArr.length) {
                    f10 = AbstractC3302Hv.A04[picWidthInLumaSamples];
                } else {
                    Log.w(A01(0, 10, 24), A01(10, 35, 2) + picWidthInLumaSamples);
                }
            }
        }
        String A01 = A01(45, 10, 17);
        List singletonList = Collections.singletonList(bArr);
        if (A0F[3].length() != 6) {
            String[] strArr4 = A0F;
            strArr4[7] = "REKIidOCsv4ptzsgivtfnGOww6JG";
            strArr4[5] = "T94vPaWVm7jdMSWQElc8luWGTOlSo";
            return Format.A03(str, A01, null, -1, -1, picHeightInLumaSamples, confWinLeftOffset, -1.0f, singletonList, -1, f10, null);
        }
        String[] strArr5 = A0F;
        strArr5[7] = "W2GdBlThEFkhmpYhDIzNH9YY1BaI";
        strArr5[5] = "0yDCfDeoWht2juYgXJKTHBbNY9ana";
        return Format.A03(str, A01, null, -1, -1, picHeightInLumaSamples, confWinLeftOffset, -1.0f, singletonList, -1, f10, null);
    }

    private void A03(long j10, int i10, int i11, long j11) {
        if (this.A05) {
            this.A03.A02(j10, i10);
        } else {
            this.A0A.A04(i11);
            this.A08.A04(i11);
            this.A06.A04(i11);
            if (this.A0A.A03() && this.A08.A03() && this.A06.A03()) {
                this.A02.A5n(A00(this.A04, this.A0A, this.A08, this.A06));
                this.A05 = true;
            }
        }
        if (this.A07.A04(i11)) {
            C3018D4 c3018d4 = this.A07;
            if (A0F[1].length() == 12) {
                throw new RuntimeException();
            }
            A0F[3] = "Yba7mj";
            this.A0C.A0b(this.A07.A01, AbstractC3302Hv.A02(c3018d4.A01, this.A07.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j11, this.A0C);
        }
        if (this.A09.A04(i11)) {
            this.A0C.A0b(this.A09.A01, AbstractC3302Hv.A02(this.A09.A01, this.A09.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j11, this.A0C);
        }
    }

    private void A04(long j10, int i10, int i11, long j11) {
        if (this.A05) {
            this.A03.A03(j10, i10, i11, j11);
        } else {
            this.A0A.A01(i11);
            this.A08.A01(i11);
            this.A06.A01(i11);
        }
        this.A07.A01(i11);
        this.A09.A01(i11);
    }

    public static void A05(C3307I0 c3307i0) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int matrixId = 1;
                if (!c3307i0.A0A()) {
                    c3307i0.A04();
                } else {
                    int sizeId = i10 << 1;
                    int min = Math.min(64, 1 << (sizeId + 4));
                    if (i10 > 1) {
                        c3307i0.A03();
                    }
                    for (int sizeId2 = 0; sizeId2 < min; sizeId2++) {
                        c3307i0.A03();
                    }
                }
                if (i10 == 3) {
                    matrixId = 3;
                }
                i11 += matrixId;
            }
        }
    }

    public static void A06(C3307I0 c3307i0) {
        int A04 = c3307i0.A04();
        boolean z10 = false;
        int numNegativePics = 0;
        for (int stRpsIdx = 0; stRpsIdx < A04; stRpsIdx++) {
            if (stRpsIdx != 0) {
                z10 = c3307i0.A0A();
            }
            if (z10) {
                c3307i0.A06();
                c3307i0.A04();
                for (int i10 = 0; i10 <= numNegativePics; i10++) {
                    if (c3307i0.A0A()) {
                        c3307i0.A06();
                    }
                }
            } else {
                int previousNumDeltaPocs = c3307i0.A04();
                int A042 = c3307i0.A04();
                numNegativePics = previousNumDeltaPocs + A042;
                for (int numShortTermRefPicSets = 0; numShortTermRefPicSets < previousNumDeltaPocs; numShortTermRefPicSets++) {
                    c3307i0.A04();
                    c3307i0.A06();
                }
                for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < A042; numShortTermRefPicSets2++) {
                    c3307i0.A04();
                    c3307i0.A06();
                }
            }
        }
    }

    private void A07(byte[] bArr, int i10, int i11) {
        if (this.A05) {
            this.A03.A04(bArr, i10, i11);
        } else {
            this.A0A.A02(bArr, i10, i11);
            this.A08.A02(bArr, i10, i11);
            this.A06.A02(bArr, i10, i11);
        }
        this.A07.A02(bArr, i10, i11);
        this.A09.A02(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3012Cy
    public final void A4R(C3306Hz c3306Hz) {
        while (true) {
            int A04 = c3306Hz.A04();
            if (A0F[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[0] = "AvzYB124iDQiX3hdxqfkLksaQ25q0Ga1";
            strArr[6] = "Nv2bR4D3VQ28suo5ivBlL2099SuCEJEb";
            if (A04 > 0) {
                int limit = c3306Hz.A06();
                int A07 = c3306Hz.A07();
                byte[] bArr = c3306Hz.A00;
                long j10 = this.A01;
                int offset = c3306Hz.A04();
                this.A01 = j10 + offset;
                InterfaceC2962C4 interfaceC2962C4 = this.A02;
                int offset2 = c3306Hz.A04();
                interfaceC2962C4.AFR(c3306Hz, offset2);
                while (limit < A07) {
                    int A042 = AbstractC3302Hv.A04(bArr, limit, A07, this.A0D);
                    if (A042 == A07) {
                        A07(bArr, limit, A07);
                        return;
                    }
                    int bytesWrittenPastPosition = AbstractC3302Hv.A00(bArr, A042);
                    int i10 = A042 - limit;
                    if (i10 > 0) {
                        A07(bArr, limit, A042);
                    }
                    int i11 = A07 - A042;
                    long j11 = this.A01 - i11;
                    int offset3 = i10 < 0 ? -i10 : 0;
                    A03(j11, i11, offset3, this.A00);
                    long absolutePosition = this.A00;
                    A04(j11, i11, bytesWrittenPastPosition, absolutePosition);
                    limit = A042 + 3;
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3012Cy
    public final void A4p(InterfaceC2952Bu interfaceC2952Bu, C3025DC c3025dc) {
        c3025dc.A05();
        this.A04 = c3025dc.A04();
        InterfaceC2962C4 AGi = interfaceC2952Bu.AGi(c3025dc.A03(), 2);
        this.A02 = AGi;
        this.A03 = new C3017D3(AGi);
        this.A0B.A03(interfaceC2952Bu, c3025dc);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3012Cy
    public final void ADs() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3012Cy
    public final void ADt(long j10, boolean z10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3012Cy
    public final void AFg() {
        AbstractC3302Hv.A0B(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
