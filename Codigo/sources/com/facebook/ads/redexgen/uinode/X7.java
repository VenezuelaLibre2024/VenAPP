package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X7 implements InterfaceC0837Bs {
    public static byte[] A04;
    public static String[] A05 = {"zdP8mq1V4qx9ZCdsfAD4NG7cLFVpQAAe", "koAkuIv", "fyRTvmHGGGsRl9BV6D3JToZwd0QymLEV", "Ol6FmQC", "pWzJ4KWOtVeOprDRKRooJjLfCIz1i7Yl", "FaGWZpOEFJ3DEiDU22ljd64Ld5pUV9HD", "txEKQBUTk3v9kOkzxdvVTnLo1IME9gDG", "VQ1knBpCfCAoSCLl3kVfN2N5wBdN5LBp"};
    public static final InterfaceC0840Bv A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final X6 A02;
    public final C0980Hz A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[2].charAt(21) == strArr[4].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "6nR4pRT1Z5KTQHbqvhpghrBhlvQkSoKV";
            strArr2[5] = "SkXTa4uQceGhkSQtr6wVij7rDC15CMq5";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 67);
            i13++;
        }
    }

    public static void A01() {
        A04 = new byte[]{66, 79, 56};
    }

    static {
        A01();
        A06 = new X8();
        A07 = IF.A08(A00(0, 3, 72));
    }

    public X7() {
        this(0L);
    }

    public X7(long j10) {
        this.A01 = j10;
        this.A02 = new X6(true);
        this.A03 = new C0980Hz(200);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0837Bs
    public final void A8o(InterfaceC0839Bu interfaceC0839Bu) {
        this.A02.A4p(interfaceC0839Bu, new DC(0, 1));
        interfaceC0839Bu.A5Y();
        interfaceC0839Bu.AFi(new C1369Xj(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0837Bs
    public final int AEH(InterfaceC0838Bt interfaceC0838Bt, C0842Bz c0842Bz) throws IOException, InterruptedException {
        int read = interfaceC0838Bt.read(this.A03.A00, 0, 200);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.ADt(this.A01, true);
            this.A00 = true;
        }
        this.A02.A4R(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0837Bs
    public final void AFh(long j10, long j11) {
        this.A00 = false;
        this.A02.AFg();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0837Bs
    public final boolean AGR(InterfaceC0838Bt interfaceC0838Bt) throws IOException, InterruptedException {
        C0980Hz c0980Hz = new C0980Hz(10);
        C0979Hy c0979Hy = new C0979Hy(c0980Hz.A00);
        int startPosition = 0;
        while (true) {
            interfaceC0838Bt.ADv(c0980Hz.A00, 0, 10);
            c0980Hz.A0Y(0);
            if (c0980Hz.A0G() != A07) {
                break;
            }
            c0980Hz.A0Z(3);
            int A0D = c0980Hz.A0D();
            startPosition += A0D + 10;
            interfaceC0838Bt.A3W(A0D);
        }
        interfaceC0838Bt.AFM();
        interfaceC0838Bt.A3W(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int i10 = 0;
        while (true) {
            interfaceC0838Bt.ADv(c0980Hz.A00, 0, 2);
            c0980Hz.A0Y(0);
            int headerPosition = 65526 & c0980Hz.A0I();
            if (headerPosition != 65520) {
                i10 = 0;
                validFramesCount = 0;
                interfaceC0838Bt.AFM();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC0838Bt.A3W(syncBytes);
            } else {
                i10++;
                if (i10 >= 4 && validFramesCount > 188) {
                    return true;
                }
                interfaceC0838Bt.ADv(c0980Hz.A00, 0, 4);
                c0979Hy.A07(14);
                int headerPosition3 = c0979Hy.A04(13);
                if (headerPosition3 <= 6) {
                    return false;
                }
                interfaceC0838Bt.A3W(headerPosition3 - 6);
                validFramesCount += headerPosition3;
            }
        }
    }
}
