package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Co */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3004Co {
    public static String[] A0D = {"0vhu5jxS", "Yr1jkp10QbCUuCnawnVg6DyED3T", "sHPBJpa0rClOKB4ts4mek83zSMf", "023O0ZSY", "oXq1fAkWHKLdk2C1T6ZzlQ7WbkpG5dco", "r27coonoikndR5VwsgZJDPH1Xbh3nrzE", "wA4WoZs0OtPlvEvglX5psUeQApq37N8U", "1wN1LzZhcL4LE4gXrEEsM7fopE3lhqwu"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC2952Bu A06;
    public InterfaceC2962C4 A07;
    public InterfaceC3001Cl A08;
    public C3003Cn A09;
    public boolean A0A;
    public boolean A0B;
    public final C2999Cj A0C = new C2999Cj();

    public abstract long A07(C3306Hz c3306Hz);

    public abstract boolean A0A(C3306Hz c3306Hz, long j10, C3003Cn c3003Cn) throws IOException, InterruptedException;

    private int A00(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        boolean z10 = true;
        while (z10) {
            boolean readingHeaders = this.A0C.A05(interfaceC2951Bt);
            if (!readingHeaders) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = interfaceC2951Bt.A7i() - this.A04;
            z10 = A0A(this.A0C.A02(), this.A04, this.A09);
            if (z10) {
                this.A04 = interfaceC2951Bt.A7i();
            }
        }
        this.A00 = this.A09.A00.A0C;
        boolean readingHeaders2 = this.A0A;
        if (!readingHeaders2) {
            this.A07.A5n(this.A09.A00);
            this.A0A = true;
        }
        if (this.A09.A01 != null) {
            this.A08 = this.A09.A01;
        } else if (interfaceC2951Bt.A7I() == -1) {
            this.A08 = new C4239XD();
        } else {
            C3000Ck firstPayloadPageHeader = this.A0C.A01();
            this.A08 = new C4245XJ(this.A04, interfaceC2951Bt.A7I(), this, firstPayloadPageHeader.A01 + firstPayloadPageHeader.A00, firstPayloadPageHeader.A05);
        }
        this.A09 = null;
        this.A01 = 2;
        this.A0C.A04();
        return 0;
    }

    private int A01(InterfaceC2951Bt interfaceC2951Bt, C2957Bz c2957Bz) throws IOException, InterruptedException {
        long position = this.A08.AEI(interfaceC2951Bt);
        if (position >= 0) {
            c2957Bz.A00 = position;
            return 1;
        }
        if (position < -1) {
            A08(-(2 + position));
        }
        if (!this.A0B) {
            this.A06.AFi(this.A08.A4m());
            this.A0B = true;
        }
        if (this.A03 <= 0 && !this.A0C.A05(interfaceC2951Bt)) {
            this.A01 = 3;
            return -1;
        }
        this.A03 = 0L;
        C3306Hz A02 = this.A0C.A02();
        long A07 = A07(A02);
        if (A07 >= 0) {
            long j10 = this.A02;
            long granulesInPacket = j10 + A07;
            if (granulesInPacket >= this.A05) {
                long A03 = A03(j10);
                this.A07.AFR(A02, A02.A07());
                this.A07.AFS(A03, 1, A02.A07(), 0, null);
                this.A05 = -1L;
            }
        }
        this.A02 += A07;
        return 0;
    }

    public final int A02(InterfaceC2951Bt interfaceC2951Bt, C2957Bz c2957Bz) throws IOException, InterruptedException {
        switch (this.A01) {
            case 0:
                return A00(interfaceC2951Bt);
            case 1:
                interfaceC2951Bt.AGP((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A01(interfaceC2951Bt, c2957Bz);
            default:
                throw new IllegalStateException();
        }
    }

    public final long A03(long j10) {
        return (1000000 * j10) / this.A00;
    }

    public final long A04(long j10) {
        return (this.A00 * j10) / 1000000;
    }

    public final void A05(long j10, long j11) {
        this.A0C.A03();
        if (j10 == 0) {
            boolean z10 = !this.A0B;
            String[] strArr = A0D;
            if (strArr[6].charAt(24) == strArr[7].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[4] = "k4zvnx9t3uHSh6LLctIVLoh0Ftprjk2l";
            strArr2[5] = "HhnKvAaHZTpmoBA85UMRj52n1m1tHG3b";
            A09(z10);
            return;
        }
        if (this.A01 == 0) {
            return;
        }
        this.A05 = this.A08.AGX(j11);
        this.A01 = 2;
    }

    public final void A06(InterfaceC2952Bu interfaceC2952Bu, InterfaceC2962C4 interfaceC2962C4) {
        this.A06 = interfaceC2952Bu;
        this.A07 = interfaceC2962C4;
        A09(true);
    }

    public void A08(long j10) {
        this.A02 = j10;
    }

    public void A09(boolean z10) {
        if (z10) {
            this.A09 = new C3003Cn();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}