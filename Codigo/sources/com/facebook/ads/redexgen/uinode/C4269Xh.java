package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xh */
/* loaded from: assets/audience_network.dex */
public final class C4269Xh implements InterfaceC2950Bs {
    public static byte[] A07;
    public static String[] A08 = {"ovn62aUcwqSIvWTqoELg4J4D8wHkUDmq", "Ycr5XQrqBi4bqXq", "xp8qJzBZ1bRZYruPJEcRAHgYPTR5RYjX", "i3q4o3QoTWkNmhcyfYOgrV6edePVNuRX", "3foLzBlJQPuSe9je9cnopJfCpNuQ", "jIofLs5qujimwrYxWQlB52zkZNTbvGhY", "Oin2hfMzoDcJa9P29jyigMxfd8hffyV", "DiUz7SyfwAQ"};
    public static final InterfaceC2953Bv A09;
    public static final int A0A;
    public static final byte[] A0B;
    public static final byte[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC2962C4 A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06 = new byte[1];

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] - i12) - 104);
            String[] strArr = A08;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A08[7] = "o17bMTHd2bo";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {-89, -19, -7, -24, -12, -20, -89, -5, 0, -9, -20, -89, -65, -67, -35, -23, -18, -90, -17, -19, 13, 25, 30, -7, 35, 14, -42, 14, 58, 64, 55, 47, -21, 57, 58, 63, -21, 49, 52, 57, 47, -21, 12, 24, 29, -21, 51, 48, 44, 47, 48, 61, -7, 37, 72, 72, 65, 67, 61, 72, -4, 29, 41, 46, -4, 36, 73, 81, 60, 71, 68, 63, -5, 75, 60, 63, 63, 68, 73, 66, -5, 61, 68, 79, 78, -5, 65, 74, 77, -5, 65, 77, 60, 72, 64, -5, 67, 64, 60, 63, 64, 77, -5, -53, -65, -34, -55, 67, 87, 70, 75, 81, 17, 21, 73, 82, 82, -3, 17, 0, 5, 11, -53, -3, 9, 14, -55, 19, -2};
        if (A08[6].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "iWdi7SFZoODeZbEJMl3L6ntPbKeDMNvO";
        strArr[2] = "0wFRuzGYIju4XbKNAoPYNxHAh615x32s";
        A07 = bArr;
    }

    static {
        A05();
        A09 = new C4270Xi();
        A0D = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0E = iArr;
        A0B = AbstractC3322IF.A0i(A03(12, 6, 52));
        A0C = AbstractC3322IF.A0i(A03(18, 9, 100));
        A0A = iArr[8];
    }

    private int A00(int i10) throws C28319v {
        String A03;
        if (!A07(i10)) {
            StringBuilder append = new StringBuilder().append(A03(53, 12, 116));
            if (!this.A05) {
                A03 = A03(103, 2, 21);
            } else if (A08[6].length() == 31) {
                A08[7] = "wEjTIiVmShi";
                A03 = A03(105, 2, 31);
            }
            throw new C28319v(append.append(A03).append(A03(0, 12, 31)).append(i10).toString());
        }
        if (this.A05) {
            return A0E[i10];
        }
        int[] iArr = A0D;
        if (A08[6].length() == 31) {
            String[] strArr = A08;
            strArr[4] = "W5GqdpRCUv4UTAd2FZcqfYNQbOUH";
            strArr[1] = "vSYrWd8JkI4l23w";
            return iArr[i10];
        }
        throw new RuntimeException();
    }

    private int A01(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        interfaceC2951Bt.AFM();
        interfaceC2951Bt.ADv(this.A06, 0, 1);
        byte b10 = this.A06[0];
        if ((b10 & 131) <= 0) {
            return A00((b10 >> 3) & 15);
        }
        throw new C28319v(A03(65, 38, 115) + ((int) b10));
    }

    private int A02(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            try {
                int A01 = A01(interfaceC2951Bt);
                this.A01 = A01;
                this.A00 = A01;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int AFQ = this.A03.AFQ(interfaceC2951Bt, this.A00, true);
        if (AFQ == -1) {
            return -1;
        }
        int bytesAppended = this.A00 - AFQ;
        this.A00 = bytesAppended;
        if (bytesAppended > 0) {
            return 0;
        }
        this.A03.AFS(this.A02, 1, this.A01, 0, null);
        this.A02 += 20000;
        return 0;
    }

    private void A04() {
        if (!this.A04) {
            this.A04 = true;
            boolean z10 = this.A05;
            this.A03.A5n(Format.A06(null, z10 ? A03(117, 12, 52) : A03(107, 10, 122), null, -1, A0A, 1, z10 ? 16000 : 8000, -1, null, null, 0, null));
        }
    }

    private boolean A06(int i10) {
        return !this.A05 && (i10 < 12 || i10 > 14);
    }

    private boolean A07(int i10) {
        return i10 >= 0 && i10 <= 15 && (A08(i10) || A06(i10));
    }

    private boolean A08(int i10) {
        if (this.A05) {
            if (i10 >= 10) {
                if (A08[6].length() != 31) {
                    throw new RuntimeException();
                }
                A08[5] = "qMGeUOCLNxoOBJxwE1u31s5i7NTepy4l";
                if (i10 > 13) {
                }
            }
            return true;
        }
        return false;
    }

    private boolean A09(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        byte[] bArr = A0B;
        if (A0A(interfaceC2951Bt, bArr)) {
            this.A05 = false;
            interfaceC2951Bt.AGP(bArr.length);
            return true;
        }
        byte[] bArr2 = A0C;
        if (!A0A(interfaceC2951Bt, bArr2)) {
            return false;
        }
        this.A05 = true;
        interfaceC2951Bt.AGP(bArr2.length);
        return true;
    }

    private boolean A0A(InterfaceC2951Bt interfaceC2951Bt, byte[] bArr) throws IOException, InterruptedException {
        interfaceC2951Bt.AFM();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC2951Bt.ADv(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void A8o(InterfaceC2952Bu interfaceC2952Bu) {
        interfaceC2952Bu.AFi(new C4271Xj(-9223372036854775807L));
        this.A03 = interfaceC2952Bu.AGi(0, 1);
        interfaceC2952Bu.A5Y();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final int AEH(InterfaceC2951Bt interfaceC2951Bt, C2957Bz c2957Bz) throws IOException, InterruptedException {
        if (interfaceC2951Bt.A7i() != 0 || A09(interfaceC2951Bt)) {
            A04();
            return A02(interfaceC2951Bt);
        }
        throw new C28319v(A03(27, 26, 99));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void AFh(long j10, long j11) {
        this.A02 = 0L;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final boolean AGR(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        return A09(interfaceC2951Bt);
    }
}
