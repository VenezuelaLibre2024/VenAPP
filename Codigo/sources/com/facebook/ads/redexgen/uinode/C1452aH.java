package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1452aH extends C2I implements InterstitialAdExtendedListener {
    public static byte[] A01;
    public final C1464aT A00;

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
        A01 = new byte[]{-68, -63, -57, -46, -72, -59, -59, -62, -59, -46, -74, -62, -73, -72, -46, -66, -72, -52, -103, -100, -101, -108, -84, -106, -101, -93, -114, -103, -106, -111, -114, -95, -106, -100, -101, -84, -95, -106, -102, -110, -84, -104, -110, -90, 15, 16, 14, 27, 1, 14, 14, 11, 14, 27, 9, 1, 15, 15, -3, 3, 1, 27, 7, 1, 21};
    }

    public C1452aH(String str, C2K c2k, C1464aT c1464aT) {
        super(str, c2k);
        this.A00 = c1464aT;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        super.A00.ACJ(RecognitionOptions.UPC_E, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(18, 26, 0), this.A00.A0D());
        super.A00.ACJ(1020, this.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(44, 21, 111), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 38), adError.getErrorCode());
        super.A00.ACJ(1023, this.A01, bundle);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        super.A00.ACJ(1026, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad2) {
        super.A00.ACJ(1022, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad2) {
        super.A00.ACJ(1021, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        super.A00.ACJ(1025, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
        super.A00.ACJ(3000, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
        super.A00.ACJ(3002, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
        super.A00.ACJ(AdError.MEDIATION_ERROR_CODE, this.A01, null);
    }
}