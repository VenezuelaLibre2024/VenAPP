package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pa */
/* loaded from: assets/audience_network.dex */
public class RunnableC3770Pa implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"uduF7y1C8f4BfvOCO4Bbq6znZfD289wY", "LfQQ99tGpIYoqROwWovpCF40OXz0xcCP", "pe2RdaJtvVEZmLt4Dkt9DCEmAABN", "zCkDdi8MMPMgBKhzCwwd8Y", "gpXsz89N0H7wm", "U57X7XmLFZehOxidvs2iHeLBOkC7", "VomEcvnoa3iVV8u", "uRkqt"};
    public final /* synthetic */ C28119a A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-28, -9, -14, -13, -3, -34, -6, -17, 7, -16, -17, -15, -7, -45, 0, 0, -3, 0};
        String[] strArr = A02;
        if (strArr[2].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[2] = "IRUmVXxJ3xpLtoKGmKUObZK1jjqw";
        strArr2[5] = "FvpPsD11YfGqSvfesnropeXaLbJS";
        A01 = bArr;
    }

    static {
        A01();
    }

    public RunnableC3770Pa(C28119a c28119a) {
        this.A00 = c28119a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3773Pd interfaceC3773Pd;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3773Pd = this.A00.A00.A0X;
            interfaceC3773Pd.ADX(A00(0, 18, 98));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
