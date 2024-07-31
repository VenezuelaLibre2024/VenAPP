package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Vb */
/* loaded from: assets/audience_network.dex */
public class C4142Vb implements InterfaceC3905Rl {
    public static byte[] A02;
    public final /* synthetic */ C4336Ym A00;
    public final /* synthetic */ InterfaceC3903Rj A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C4142Vb(InterfaceC3903Rj interfaceC3903Rj, C4336Ym c4336Ym) {
        this.A01 = interfaceC3903Rj;
        this.A00 = c4336Ym;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3905Rl
    public final void A45() {
        try {
            C3348Ih.A0R(this.A00).A2Y(this.A01.A6h().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e10) {
            this.A00.A07().A3c(e10);
        }
    }
}
