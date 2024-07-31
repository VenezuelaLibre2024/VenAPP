package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.UH */
/* loaded from: assets/audience_network.dex */
public class C4061UH implements InterfaceC3494L8 {
    public static byte[] A01;
    public final /* synthetic */ C4057UD A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, 120, 121, 98, 110, 97, 100, 110, 102};
    }

    public C4061UH(C4057UD c4057ud) {
        this.A00 = c4057ud;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3494L8
    public final void ABA() {
        boolean z10;
        boolean z11;
        z10 = this.A00.A0A;
        if (!z10) {
            z11 = this.A00.A09;
            if (!z11) {
                this.A00.A0U(false, A00(0, 9, 108));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3494L8
    public final void ACm(float f10) {
    }
}
