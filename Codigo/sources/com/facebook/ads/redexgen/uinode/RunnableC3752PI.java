package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.PI */
/* loaded from: assets/audience_network.dex */
public class RunnableC3752PI implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C3756PM A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{108, 64, 90, 67, 75, 15, 65, 64, 91, 15, 95, 78, 93, 92, 74, 15, 92, 74, 93, 89, 74, 93, 15, 66, 74, 92, 92, 78, 72, 74, 123, 76, 76, 81, 76, 30, 78, 95, 76, 77, 87, 80, 89, 30, 116, 109, 113, 112, 30, 87, 80, 30, 78, 81, 77, 74, 115, 91, 77, 77, 95, 89, 91, 30, 103, 115, 114, 110, 77, 99, Byte.MAX_VALUE, 32, 61, 49, 55, 36, 26, 33, 36, 49, 36, 108, 97, 104, 125, 28, 26};
    }

    public RunnableC3752PI(C3756PM c3756pm, String str) {
        this.A00 = c3756pm;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3732Oy c3732Oy;
        String str;
        C3732Oy c3732Oy2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 47)))) {
                    this.A00.A0C(EnumC3754PK.A00(jSONObject.optString(A00(81, 4, 49))), jSONObject.optString(A00(71, 10, 108), A00(85, 2, 78)));
                } else {
                    c3732Oy2 = this.A00.A04;
                    c3732Oy2.A04(AbstractC27248A.A11, A00(0, 30, 6));
                }
            } catch (JSONException e10) {
                c3732Oy = this.A00.A04;
                c3732Oy.A04(AbstractC27248A.A15, A00(30, 34, 23) + e10.getMessage());
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
