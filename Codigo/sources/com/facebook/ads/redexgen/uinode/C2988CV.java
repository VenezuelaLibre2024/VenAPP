package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: com.facebook.ads.redexgen.X.CV */
/* loaded from: assets/audience_network.dex */
public final class C2988CV {
    public static String[] A0A = {"VV6EzFzDFGyxh7278LhkWh1nAnO", "a", "RIeoUtwh2k0Lp", "KiUc8yTTjWF6Y9v", "6tIA8m5WM2YSgVpCAFtgKZOFEkm", "A00z45", "ej2X1eDppCFfwh6aI5B812e88v7VHLnd", "obdd9bh"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C2983CP A04;
    public C2994Ce A05;
    public final InterfaceC2962C4 A06;
    public final C2996Cg A07 = new C2996Cg();
    public final C3306Hz A09 = new C3306Hz(1);
    public final C3306Hz A08 = new C3306Hz();

    public C2988CV(InterfaceC2962C4 interfaceC2962C4) {
        this.A06 = interfaceC2962C4;
    }

    private C2995Cf A00() {
        int i10 = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            C2996Cg c2996Cg = this.A07;
            if (A0A[2].length() == 16) {
                throw new RuntimeException();
            }
            A0A[2] = "yH";
            return c2996Cg.A08;
        }
        return this.A05.A00(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C3306Hz c3306Hz = this.A07.A09;
        C2995Cf encryptionBox = A00();
        if (encryptionBox.A00 != 0) {
            c3306Hz.A0Z(encryptionBox.A00);
        }
        if (this.A07.A0H[this.A01]) {
            c3306Hz.A0Z(c3306Hz.A0I() * 6);
        }
    }

    public final int A03() {
        C3306Hz c3306Hz;
        int vectorSize;
        if (!this.A07.A0A) {
            return 0;
        }
        C2995Cf A00 = A00();
        if (A0A[5].length() != 6) {
            throw new RuntimeException();
        }
        A0A[1] = "c";
        if (A00.A00 != 0) {
            c3306Hz = this.A07.A09;
            vectorSize = A00.A00;
        } else {
            byte[] initVectorData = A00.A04;
            this.A08.A0b(initVectorData, initVectorData.length);
            c3306Hz = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean z10 = this.A07.A0H[this.A01];
        this.A09.A00[0] = (byte) ((z10 ? RecognitionOptions.ITF : 0) | vectorSize);
        this.A09.A0Y(0);
        InterfaceC2962C4 interfaceC2962C4 = this.A06;
        C3306Hz initializationVectorData = this.A09;
        interfaceC2962C4.AFR(initializationVectorData, 1);
        this.A06.AFR(c3306Hz, vectorSize);
        if (!z10) {
            return vectorSize + 1;
        }
        C3306Hz c3306Hz2 = this.A07.A09;
        int A0I = c3306Hz2.A0I();
        c3306Hz2.A0Z(-2);
        int i10 = (A0I * 6) + 2;
        this.A06.AFR(c3306Hz2, i10);
        return vectorSize + 1 + i10;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j10) {
        long A01 = AbstractC28079W.A01(j10);
        for (int i10 = this.A01; i10 < this.A07.A00 && this.A07.A00(i10) < A01; i10++) {
            if (this.A07.A0I[i10]) {
                this.A03 = i10;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        C2995Cf encryptionBox = this.A05.A00(this.A07.A07.A02);
        this.A06.A5n(this.A05.A07.A0I(drmInitData.A02(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A07(C2994Ce c2994Ce, C2983CP c2983cp) {
        this.A05 = (C2994Ce) AbstractC3281Ha.A01(c2994Ce);
        this.A04 = (C2983CP) AbstractC3281Ha.A01(c2983cp);
        this.A06.A5n(c2994Ce.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        int i10 = this.A00 + 1;
        this.A00 = i10;
        int[] iArr = this.A07.A0E;
        int i11 = this.A02;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.A02 = i11 + 1;
        this.A00 = 0;
        return false;
    }
}
