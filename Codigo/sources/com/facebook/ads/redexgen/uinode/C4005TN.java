package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.TN */
/* loaded from: assets/audience_network.dex */
public class C4005TN implements InterfaceC3736P2 {
    public static byte[] A01;
    public final /* synthetic */ C2901B3 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public C4005TN(C2901B3 c2901b3) {
        this.A00 = c2901b3;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3736P2
    public final void ADY(String str, JSONObject jSONObject) {
        C3745PB c3745pb;
        C4337Yn c4337Yn;
        C4337Yn c4337Yn2;
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AGY();
            c4337Yn = this.A00.A07;
            if (C3348Ih.A1W(c4337Yn)) {
                c4337Yn2 = this.A00.A07;
                c4337Yn2.A0A().ABG();
            }
        }
        c3745pb = this.A00.A0F;
        c3745pb.A0h(str, jSONObject);
    }
}
