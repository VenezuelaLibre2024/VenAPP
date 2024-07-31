package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XA */
/* loaded from: assets/audience_network.dex */
public final class C4236XA implements InterfaceC2950Bs {
    public static byte[] A04;
    public static String[] A05 = {"89ZAS4gKAvfsCOhGFLRndaPlzH5Jylu0", "WDj0w8iYShPhw5JkNLQVjMzFidij1YMB", "SZD8V9ebG6DMCxkEToUDQHseHkwYH45y", "flB69VC8Ebs69L5nDVZVAs6kLxLMfW9p", "Dc9Giep11FBAOEJK", "fiVRhSZcsaoyqUlEeIiHO4czNXpaN55t", "HHz5E2PDkz6p7na9zQig", "GASwop9kiLfFsL9tAHZWlbr16muWtU3x"};
    public static final InterfaceC2953Bv A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final C4235X9 A02;
    public final C3306Hz A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-8, -13, -30};
        if (A05[3].charAt(6) != 'C') {
            throw new RuntimeException();
        }
        A05[6] = "Dcf";
    }

    static {
        A01();
        A06 = new C4237XB();
        A07 = AbstractC3322IF.A08(A00(0, 3, 105));
    }

    public C4236XA() {
        this(0L);
    }

    public C4236XA(long j10) {
        this.A01 = j10;
        this.A02 = new C4235X9();
        this.A03 = new C3306Hz(2786);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void A8o(InterfaceC2952Bu interfaceC2952Bu) {
        this.A02.A4p(interfaceC2952Bu, new C3025DC(0, 1));
        interfaceC2952Bu.A5Y();
        interfaceC2952Bu.AFi(new C4271Xj(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final int AEH(InterfaceC2951Bt interfaceC2951Bt, C2957Bz c2957Bz) throws IOException, InterruptedException {
        int read = interfaceC2951Bt.read(this.A03.A00, 0, 2786);
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

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void AFh(long j10, long j11) {
        this.A00 = false;
        this.A02.AFg();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final boolean AGR(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        C3306Hz c3306Hz = new C3306Hz(10);
        int startPosition = 0;
        while (true) {
            interfaceC2951Bt.ADv(c3306Hz.A00, 0, 10);
            c3306Hz.A0Y(0);
            if (c3306Hz.A0G() != A07) {
                break;
            }
            c3306Hz.A0Z(3);
            int A0D = c3306Hz.A0D();
            startPosition += A0D + 10;
            interfaceC2951Bt.A3W(A0D);
        }
        interfaceC2951Bt.AFM();
        interfaceC2951Bt.A3W(startPosition);
        int syncBytes = startPosition;
        int i10 = 0;
        while (true) {
            interfaceC2951Bt.ADv(c3306Hz.A00, 0, 5);
            c3306Hz.A0Y(0);
            int headerPosition = c3306Hz.A0I();
            if (headerPosition != 2935) {
                i10 = 0;
                interfaceC2951Bt.AFM();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC2951Bt.A3W(syncBytes);
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int headerPosition3 = AbstractC2862AQ.A05(c3306Hz.A00);
                if (headerPosition3 == -1) {
                    return false;
                }
                interfaceC2951Bt.A3W(headerPosition3 - 5);
            }
        }
    }
}
