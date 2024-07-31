package com.facebook.ads.redexgen.uinode;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.FU */
/* loaded from: assets/audience_network.dex */
public final class C3153FU extends AbstractC4476b5 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{72, 79, 85, 68, 83, 82, 85, 72, 85, 72, 64, 77};
    }

    public C3153FU(List<C23131G> list) {
        super(list);
    }

    public static C3153FU A02(JSONObject jSONObject, C4337Yn c4337Yn) {
        C3153FU c3153fu = new C3153FU(AbstractC4476b5.A08(jSONObject, c4337Yn, new C4473b2()));
        c3153fu.A16(jSONObject);
        c3153fu.A0b(A03(0, 12, 67));
        return c3153fu;
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
