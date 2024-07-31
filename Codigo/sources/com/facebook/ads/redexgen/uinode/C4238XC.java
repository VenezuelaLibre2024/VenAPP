package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XC */
/* loaded from: assets/audience_network.dex */
public final class C4238XC extends AbstractC3004Co {
    public static byte[] A05;
    public static String[] A06 = {"yJHQcBl4f4L", "G0ieIp3rn9VMbRQq", "FaSr", "diNTGhkPk6T4rZ0cbtlCtFUtzgnoDDOW", "ZsfK02RsUHO", "uQbwEIiYvgO", "fIpYaZEOmsgiiOCz2AK4PDqwDhI8GLBw", "t90Xt1PXy7A3GvR50K3KPdbeyD"};
    public int A00;
    public C3006Cq A01;
    public C3008Cs A02;
    public C3010Cu A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C3006Cq A02(C3306Hz c3306Hz) throws IOException {
        if (this.A03 == null) {
            this.A03 = AbstractC3011Cv.A04(c3306Hz);
            return null;
        }
        if (this.A02 == null) {
            this.A02 = AbstractC3011Cv.A03(c3306Hz);
            return null;
        }
        byte[] bArr = new byte[c3306Hz.A07()];
        System.arraycopy(c3306Hz.A00, 0, bArr, 0, c3306Hz.A07());
        return new C3006Cq(this.A03, this.A02, bArr, AbstractC3011Cv.A0C(c3306Hz, this.A03.A05), AbstractC3011Cv.A00(r4.length - 1));
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{88, 76, 93, 80, 86, 22, 79, 86, 75, 91, 80, 74};
    }

    static {
        A04();
    }

    public static int A00(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static int A01(byte b10, C3006Cq c3006Cq) {
        if (!c3006Cq.A04[A00(b10, c3006Cq.A00, 1)].A03) {
            int modeNumber = c3006Cq.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c3006Cq.A02.A04;
        return modeNumber2;
    }

    public static void A05(C3306Hz c3306Hz, long j10) {
        c3306Hz.A0X(c3306Hz.A07() + 4);
        c3306Hz.A00[c3306Hz.A07() - 4] = (byte) (j10 & 255);
        c3306Hz.A00[c3306Hz.A07() - 3] = (byte) ((j10 >>> 8) & 255);
        c3306Hz.A00[c3306Hz.A07() - 2] = (byte) ((j10 >>> 16) & 255);
        c3306Hz.A00[c3306Hz.A07() - 1] = (byte) (255 & (j10 >>> 24));
    }

    public static boolean A06(C3306Hz c3306Hz) {
        try {
            return AbstractC3011Cv.A0A(1, c3306Hz, true);
        } catch (C28319v unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3004Co
    public final long A07(C3306Hz c3306Hz) {
        int i10 = 0;
        if ((c3306Hz.A00[0] & 1) == 1) {
            return -1L;
        }
        int A01 = A01(c3306Hz.A00[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i10 = (packetBlockSize + A01) / 4;
        }
        A05(c3306Hz, i10);
        this.A04 = true;
        int samplesInPacket = A06[2].length();
        if (samplesInPacket == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "lV1SPFBYbG5lxAnFlWta4jj5erMHhp00";
        strArr[3] = "grWENQhpkSsLY54DCH6OLJaVWIdWM4Dq";
        this.A00 = A01;
        return i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3004Co
    public final void A08(long j10) {
        super.A08(j10);
        this.A04 = j10 != 0;
        C3010Cu c3010Cu = this.A03;
        this.A00 = c3010Cu != null ? c3010Cu.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3004Co
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3004Co
    public final boolean A0A(C3306Hz c3306Hz, long j10, C3003Cn c3003Cn) throws IOException, InterruptedException {
        if (this.A01 == null) {
            C3006Cq A02 = A02(c3306Hz);
            this.A01 = A02;
            if (A02 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.A01.A02.A09);
            arrayList.add(this.A01.A03);
            c3003Cn.A00 = Format.A07(null, A03(0, 12, 20), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
            return true;
        }
        return false;
    }
}
