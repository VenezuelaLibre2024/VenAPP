package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ws */
/* loaded from: assets/audience_network.dex */
public final class C4218Ws implements InterfaceC3020D6 {
    public static byte[] A03;
    public InterfaceC2962C4 A00;
    public C3318IB A01;
    public boolean A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{90, 75, 75, 87, 82, 88, 90, 79, 82, 84, 85, 20, 67, 22, 72, 88, 79, 94, 8, 14};
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3020D6
    public final void A4R(C3306Hz c3306Hz) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A5n(Format.A02(null, A00(0, 20, 99), this.A01.A05()));
            this.A02 = true;
        }
        int A04 = c3306Hz.A04();
        this.A00.AFR(c3306Hz, A04);
        this.A00.AFS(this.A01.A04(), 1, A04, 0, null);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3020D6
    public final void A8q(C3318IB c3318ib, InterfaceC2952Bu interfaceC2952Bu, C3025DC c3025dc) {
        this.A01 = c3318ib;
        c3025dc.A05();
        InterfaceC2962C4 AGi = interfaceC2952Bu.AGi(c3025dc.A03(), 4);
        this.A00 = AGi;
        AGi.A5n(Format.A0B(c3025dc.A04(), A00(0, 20, 99), null, -1, null));
    }
}
