package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Aq */
/* loaded from: assets/audience_network.dex */
public class C2888Aq extends AbstractC3679O7 {
    public static byte[] A01;
    public final /* synthetic */ C3737P3 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{65, 93, 80, 72};
    }

    public C2888Aq(C3737P3 c3737p3) {
        this.A00 = c3737p3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C3680O8 c3680o8) {
        InterfaceC3736P2 interfaceC3736P2;
        JSONObject A03;
        this.A00.A04 = true;
        interfaceC3736P2 = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC3736P2.ADY(A00(0, 4, 62), A03);
    }
}
