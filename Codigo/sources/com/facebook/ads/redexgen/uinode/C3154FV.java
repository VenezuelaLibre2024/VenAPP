package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.FV */
/* loaded from: assets/audience_network.dex */
public final class C3154FV extends AbstractC4476b5 {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public C3154FV(List<C23131G> list) {
        super(list);
    }

    public static C3154FV A02(JSONObject jSONObject, C4337Yn c4337Yn) {
        C3154FV c3154fv = new C3154FV(AbstractC4476b5.A08(jSONObject, c4337Yn, new C4475b4()));
        c3154fv.A16(jSONObject);
        c3154fv.A0b(A03(0, 6, 27));
        return c3154fv;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC23121F
    public final int A0F() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC23121F
    public final int A0G() {
        return 0;
    }
}
