package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.PS */
/* loaded from: assets/audience_network.dex */
public class RunnableC3762PS implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C2838A2 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{116, 75, 70, 71, 77, 114, 78, 67, 91, 64, 67, 65, 73, 103, 80, 80, 77, 80};
    }

    public RunnableC3762PS(C2838A2 c2838a2) {
        this.A00 = c2838a2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3773Pd interfaceC3773Pd;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3773Pd = this.A00.A00.A0F;
            interfaceC3773Pd.ADX(A00(0, 18, 116));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
