package com.facebook.ads.redexgen.uinode;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Wu */
/* loaded from: assets/audience_network.dex */
public final class C4220Wu implements InterfaceC2950Bs {
    public static String[] A08 = {"pV6afMZIVEGTOqSkK4PJAxqV3cRTXe0d", "IAHwWl6p9dkO64XBfZ0QYdoG1FARrH3l", "8O8qDLmpQAmlCV9yXa4a4pqjSYQFT4zH", "zdF1gQZIlZar6BQddk1LhfG9pE3e2nBq", "3CFwU8lFm", "v9T9Lg78nTaSAiVLG9Jw7rJGA2UCfL0z", "6lAaLpwrnWkg", "Pzi"};
    public static final InterfaceC2953Bv A09 = new C4221Wv();
    public long A00;
    public InterfaceC2952Bu A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C3019D5> A05;
    public final C3306Hz A06;
    public final C3318IB A07;

    public C4220Wu() {
        this(new C3318IB(0L));
    }

    public C4220Wu(C3318IB c3318ib) {
        this.A07 = c3318ib;
        this.A06 = new C3306Hz(RecognitionOptions.AZTEC);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void A8o(InterfaceC2952Bu interfaceC2952Bu) {
        this.A01 = interfaceC2952Bu;
        interfaceC2952Bu.AFi(new C4271Xj(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final int AEH(InterfaceC2951Bt interfaceC2951Bt, C2957Bz c2957Bz) throws IOException, InterruptedException {
        long j10;
        if (!interfaceC2951Bt.ADw(this.A06.A00, 0, 4, true)) {
            return -1;
        }
        this.A06.A0Y(0);
        int A082 = this.A06.A08();
        if (A082 == 441) {
            return -1;
        }
        if (A082 == 442) {
            interfaceC2951Bt.ADv(this.A06.A00, 0, 10);
            this.A06.A0Y(9);
            int nextStartCode = this.A06.A0E();
            interfaceC2951Bt.AGP((nextStartCode & 7) + 14);
            return 0;
        }
        if (A082 == 443) {
            interfaceC2951Bt.ADv(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            int nextStartCode2 = this.A06.A0I();
            int i10 = nextStartCode2 + 6;
            if (A08[7].length() != 22) {
                String[] strArr = A08;
                strArr[5] = "HKquBkRqV5bg6e7zOk5qC1bF2o25gd0c";
                strArr[0] = "faW9VDigV6ilhrF8PW3drZ4wwMfODA0N";
                interfaceC2951Bt.AGP(i10);
                return 0;
            }
        } else {
            int nextStartCode3 = A082 & (-256);
            if ((nextStartCode3 >> 8) != 1) {
                interfaceC2951Bt.AGP(1);
                return 0;
            }
            int i11 = A082 & 255;
            C3019D5 c3019d5 = this.A05.get(i11);
            if (!this.A02) {
                if (c3019d5 == null) {
                    InterfaceC3012Cy elementaryStreamReader = null;
                    if (i11 == 189) {
                        elementaryStreamReader = new C4235X9();
                        this.A03 = true;
                        this.A00 = interfaceC2951Bt.A7i();
                    } else if ((i11 & 224) == 192) {
                        elementaryStreamReader = new C4223Wx();
                        this.A03 = true;
                        this.A00 = interfaceC2951Bt.A7i();
                    } else if ((i11 & 240) == 224) {
                        elementaryStreamReader = new C4228X2();
                        this.A04 = true;
                        this.A00 = interfaceC2951Bt.A7i();
                    }
                    if (elementaryStreamReader != null) {
                        elementaryStreamReader.A4p(this.A01, new C3025DC(i11, RecognitionOptions.QR_CODE));
                        c3019d5 = new C3019D5(elementaryStreamReader, this.A07);
                        this.A05.put(i11, c3019d5);
                    }
                }
                if (this.A03 && this.A04) {
                    j10 = this.A00 + 8192;
                } else {
                    j10 = 1048576;
                }
                if (interfaceC2951Bt.A7i() > j10) {
                    this.A02 = true;
                    InterfaceC2952Bu interfaceC2952Bu = this.A01;
                    if (A08[6].length() != 7) {
                        A08[4] = "xdmI1xGjCkbROfx6HlMFi8Q1HtnAUXbK";
                        interfaceC2952Bu.A5Y();
                    }
                }
            }
            interfaceC2951Bt.ADv(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            int nextStartCode4 = this.A06.A0I();
            int i12 = nextStartCode4 + 6;
            if (c3019d5 == null) {
                interfaceC2951Bt.AGP(i12);
            } else {
                this.A06.A0W(i12);
                interfaceC2951Bt.readFully(this.A06.A00, 0, i12);
                this.A06.A0Y(6);
                c3019d5.A03(this.A06);
                C3306Hz c3306Hz = this.A06;
                int nextStartCode5 = c3306Hz.A05();
                c3306Hz.A0X(nextStartCode5);
            }
            return 0;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000c */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFh(long r3, long r5) {
        /*
            r2 = this;
            com.facebook.ads.redexgen.X.IB r0 = r2.A07
            r0.A08()
            r1 = 0
        L6:
            android.util.SparseArray<com.facebook.ads.redexgen.X.D5> r0 = r2.A05
            int r0 = r0.size()
            if (r1 >= r0) goto L1c
            android.util.SparseArray<com.facebook.ads.redexgen.X.D5> r0 = r2.A05
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.D5 r0 = (com.facebook.ads.redexgen.uinode.C3019D5) r0
            r0.A02()
            int r1 = r1 + 1
            goto L6
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4220Wu.AFh(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final boolean AGR(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        interfaceC2951Bt.ADv(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4) {
            return false;
        }
        int i10 = bArr[8] & 4;
        if (A08[4].length() != 31) {
            A08[6] = "Yb1F33WkxQfWiaSVh137";
            if (i10 != 4) {
                return false;
            }
            String[] strArr = A08;
            if (strArr[5].charAt(30) == strArr[0].charAt(30)) {
                String[] strArr2 = A08;
                strArr2[2] = "0jRSG84WTzZndWahG37MGXBabYk0DmjV";
                strArr2[3] = "QaZZpRdUVGXpS1N3yC2DPVE3W204sMee";
                if ((bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
                    return false;
                }
                int packStuffingLength = bArr[13] & 7;
                interfaceC2951Bt.A3W(packStuffingLength);
                interfaceC2951Bt.ADv(bArr, 0, 3);
                int packStuffingLength2 = bArr[0];
                int i11 = (packStuffingLength2 & 255) << 16;
                int packStuffingLength3 = bArr[1];
                int i12 = i11 | ((packStuffingLength3 & 255) << 8);
                int packStuffingLength4 = bArr[2];
                return 1 == ((packStuffingLength4 & 255) | i12);
            }
        }
        throw new RuntimeException();
    }
}
