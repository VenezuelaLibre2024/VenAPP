package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.api.NativeAdImageApi;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.JP */
/* loaded from: assets/audience_network.dex */
public final class C3392JP implements NativeAdImageApi {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final String A02;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{85, 88, 84, 90, 85, 73, 92, 91, 69, 12, 18, 31, 15, 19};
    }

    public C3392JP(String str, int i10, int i11) {
        this.A02 = str;
        this.A01 = i10;
        this.A00 = i11;
    }

    public static C3392JP A00(JSONObject jSONObject) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString(A01(6, 3, 51))) == null) {
            return null;
        }
        return new C3392JP(optString, jSONObject.optInt(A01(9, 5, 97), 0), jSONObject.optInt(A01(0, 6, 39), 0));
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getHeight() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final String getUrl() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getWidth() {
        return this.A01;
    }
}
