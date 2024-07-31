package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vj */
/* loaded from: assets/audience_network.dex */
public final class C4150Vj implements InterfaceC3238Gt {
    public static byte[] A06;
    public final int A00;
    public final InterfaceC3236Gr A01;
    public final InterfaceC3238Gt A02;
    public final InterfaceC3238Gt A03;
    public final InterfaceC3265HK A04;
    public final InterfaceC3267HM A05;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{106, 123, 108, 104, 125, 108, 77, 104, 125, 104, 90, 96, 103, 98};
    }

    public C4150Vj(InterfaceC3265HK interfaceC3265HK, InterfaceC3238Gt interfaceC3238Gt, InterfaceC3238Gt interfaceC3238Gt2, InterfaceC3236Gr interfaceC3236Gr, int i10, InterfaceC3267HM interfaceC3267HM) {
        this.A04 = interfaceC3265HK;
        this.A03 = interfaceC3238Gt;
        this.A02 = interfaceC3238Gt2;
        this.A01 = interfaceC3236Gr;
        this.A00 = i10;
        this.A05 = interfaceC3267HM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3238Gt
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C4151Vk A4X() {
        InterfaceC3265HK interfaceC3265HK = this.A04;
        InterfaceC3239Gu A4X = this.A03.A4X();
        InterfaceC3239Gu A4X2 = this.A02.A4X();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 37));
        }
        return new C4151Vk(interfaceC3265HK, A4X, A4X2, null, this.A00, null);
    }
}
