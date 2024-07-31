package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.AX */
/* loaded from: assets/audience_network.dex */
public class C2869AX extends AbstractC3790Pu {
    public static byte[] A01;
    public final /* synthetic */ C3737P3 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{20, 32, 30, 33, 29, 22, 37, 22, 21};
    }

    public C2869AX(C3737P3 c3737p3) {
        this.A00 = c3737p3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C27929H c27929h) {
        InterfaceC3736P2 interfaceC3736P2;
        C3930SA c3930sa;
        JSONObject A04;
        this.A00.A07();
        interfaceC3736P2 = this.A00.A0B;
        C3737P3 c3737p3 = this.A00;
        c3930sa = c3737p3.A0D;
        A04 = c3737p3.A04(c3930sa.getDuration());
        interfaceC3736P2.ADY(A00(0, 9, 100), A04);
    }
}
