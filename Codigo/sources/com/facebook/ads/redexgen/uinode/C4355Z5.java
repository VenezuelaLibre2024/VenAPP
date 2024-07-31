package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Z5 */
/* loaded from: assets/audience_network.dex */
public class C4355Z5 extends AbstractRunnableC3455KT {
    public static byte[] A01;
    public final /* synthetic */ C260662 A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{62, 44, 44, 58, 43, 44};
    }

    public C4355Z5(C260662 c260662) {
        this.A00 = c260662;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        Handler handler;
        JSONObject jSONObject;
        C26416c c26416c;
        String str;
        String str2;
        try {
            jSONObject = this.A00.A05;
            JSONArray jSONArray = jSONObject.getJSONArray(A00(0, 6, 77));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C260460 assetData = C260460.A00(jSONArray.getJSONObject(i10));
                this.A00.A09(assetData.A04, assetData);
            }
            c26416c = this.A00.A02;
            C4357Z7 c4357z7 = new C4357Z7(this);
            str = this.A00.A04;
            str2 = this.A00.A03;
            c26416c.A0W(c4357z7, new C26346V(str, str2));
        } catch (JSONException unused) {
            handler = this.A00.A00;
            handler.post(new C4356Z6(this));
        }
    }
}
