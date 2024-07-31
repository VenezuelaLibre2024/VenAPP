package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1320Vj implements InterfaceC0949Gt {
    public static byte[] A06;
    public final int A00;
    public final InterfaceC0947Gr A01;
    public final InterfaceC0949Gt A02;
    public final InterfaceC0949Gt A03;
    public final HK A04;
    public final HM A05;

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

    public C1320Vj(HK hk2, InterfaceC0949Gt interfaceC0949Gt, InterfaceC0949Gt interfaceC0949Gt2, InterfaceC0947Gr interfaceC0947Gr, int i10, HM hm2) {
        this.A04 = hk2;
        this.A03 = interfaceC0949Gt;
        this.A02 = interfaceC0949Gt2;
        this.A01 = interfaceC0947Gr;
        this.A00 = i10;
        this.A05 = hm2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0949Gt
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1321Vk A4X() {
        HK hk2 = this.A04;
        InterfaceC0950Gu A4X = this.A03.A4X();
        InterfaceC0950Gu A4X2 = this.A02.A4X();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 37));
        }
        return new C1321Vk(hk2, A4X, A4X2, null, this.A00, null);
    }
}
