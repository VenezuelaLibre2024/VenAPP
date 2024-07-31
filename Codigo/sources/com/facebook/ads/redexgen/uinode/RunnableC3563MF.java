package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.MF */
/* loaded from: assets/audience_network.dex */
public class RunnableC3563MF implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC2940Bi A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 56, 46, 57, 20, 41, 62, 45, 45, 46, 57, 46, 47, 20, 40, 39, 34, 40, 32, 20, 42, 45, 63, 46, 57, 20, 47, 46, 39, 42, 50};
    }

    public RunnableC3563MF(ViewOnClickListenerC2940Bi viewOnClickListenerC2940Bi) {
        this.A00 = viewOnClickListenerC2940Bi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 125));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
