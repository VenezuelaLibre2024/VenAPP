package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.FT */
/* loaded from: assets/audience_network.dex */
public final class C3152FT extends AbstractC4476b5 {
    public static byte[] A00 = null;
    public static String[] A01 = {"jMc", "F9KJU5nWCxEJfH1MtrJPQ98rlg2xhqhb", "7jNlYgKw34wypv3TsOCVRM97qni1IFkS", "W5gvHzH3tQhCbbf1Q7sr07NWbFeRHxz0", "QDsxhdyObZs2LD8uuSUlwesP8VUImdt4", "RqkZZA1TQwwc7Sj8gFRGBwQRvCLKOG1p", "3", "FXFS7BhAGvbRYPXLgdilxhgSLH2Ol13Z"};
    public static final long serialVersionUID = 5751287062553772012L;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[0].length() == 16) {
                throw new RuntimeException();
            }
            A01[0] = "basKOcZiobbMvO07tra14WeVIAzrAzDF";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 105);
            i13++;
        }
    }

    public static void A04() {
        A00 = new byte[]{5, -8, 11, 0, 13, -4};
    }

    static {
        A04();
    }

    public C3152FT(List<C23131G> list) {
        super(list);
    }

    public static C3152FT A02(JSONObject jSONObject, C4337Yn c4337Yn) {
        C3152FT c3152ft = new C3152FT(AbstractC4476b5.A08(jSONObject, c4337Yn, new C4472b1()));
        c3152ft.A16(jSONObject);
        c3152ft.A0b(A03(0, 6, 46));
        return c3152ft;
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
