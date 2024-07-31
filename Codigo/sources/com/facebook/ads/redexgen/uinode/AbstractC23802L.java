package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2L */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC23802L {
    public static byte[] A00;
    public static String[] A01 = {"WrFk0SRZaWHihd", "fPy0mByJ8yx934956QGB", "g2w1uQWwIR39u5", "pt5wAdKNxNbYnmh6FhOJDmdyWQTuXEAo", "0oNbDl9YVWCdicBGau", "qNPPB6iFKH", "NnJHVO1vLC9QtN9uNw1SMj1zPFME5Rgx", "8fLtOSF3VBMFUbvjmMamHOHsNTShHA1X"};

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-17, -25, -22, -16, -25, -23, -50, -37, -37, -40, -21, -47, -28, -36, -40, -43, -49, -43, -32, -21, -32, -47, -33, -32, -21, -39, -37, -48, -47, -21, -41, -47, -27, -9, 4, 4, 1, 20, -2, 8, 20, -5, 10, 3, 3, -6, 1, 20, 1, 4, -4, -4, -6, -7, 42, 55, 55, 52, 71, 49, 59, 71, 61, 54, 49, 60, 65, 56, 69, 69, 66, 85, 67, 63, 78, 59, 58, 85, 55, 75, 58, 63, 59, 68, 57, 59, 85, 65, 59, 79, 57, 70, 70, 67, 86, 73, 77, 86, 61, 56, 64, 67, 86, 70, 69, 86, 58, 56, 58, 63, 60, 86, 61, 56, 64, 67, 76, 73, 60, 86, 66, 60, 80, -50, -31, -38, -48, -40, -47, -21, -33, -47, -32, -32, -43, -38, -45, -33, -21, -41, -47, -27, -27, -30, -11, -30, 0, -15, -13, -16, -28, -26, -12, -12, -22, -17, -24, 0, -16, -15, -11, -22, -16, -17, -12, 0, -28, -16, -10, -17, -11, -13, -6, 0, -20, -26, -6, 43, 40, 59, 40, 70, 55, 57, 54, 42, 44, 58, 58, 48, 53, 46, 70, 54, 55, 59, 48, 54, 53, 58, 70, 50, 44, 64, -55, -58, -39, -58, -28, -43, -41, -44, -56, -54, -40, -40, -50, -45, -52, -28, -44, -43, -39, -50, -44, -45, -40, -28, -40, -39, -58, -39, -54, -28, -48, -54, -34, -14, -13, -15, -2, -32, -29, -2, -28, -9, -17, -28, -15, -24, -28, -19, -30, -28, -2, -13, -8, -17, -28, 71, 72, 70, 83, 53, 56, 83, 61, 56, 83, 63, 57, 77, 60, 61, 59, 72, 42, 45, 72, 61, 46, 60, 61, 72, 61, 66, 57, 46, 72, 52, 46, 66, -23, -22, -24, -11, -40, -33, -38, -11, -26, -41, -17, -30, -27, -41, -38, -11, -31, -37, -17, 7, 8, 6, 19, -10, 8, 19, 8, 3, -1, -7, 2, 19, -7, 12, 8, 6, -11, 7, -43, -42, -44, -31, -59, -50, -53, -57, -48, -42, -31, -43, -58, -51, -31, -40, -57, -44, -43, -53, -47, -48, -21, -20, -22, -9, -35, -16, -20, -22, -39, -9, -32, -31, -26, -20, -21, -9, -29, -35, -15, -12, -11, -13, 0, -22, -17, -11, 0, -28, -30, -28, -23, -26, 0, -25, -19, -30, -24, -12, 0, 1, -1, 12, -6, -14, -15, -10, -18, 1, -10, -4, -5, 12, -15, -18, 1, -18, 12, -8, -14, 6, 57, 58, 56, 69, 51, 43, 42, 47, 39, 58, 47, 53, 52, 69, 57, 43, 56, 60, 47, 41, 43, 69, 49, 43, 63, 52, 53, 51, 64, 49, 45, 34, 36, 38, 46, 38, 47, 53, 64, 44, 38, 58};
    }

    static {
        A07();
    }

    public static Bundle A00(C26937f c26937f) {
        Bundle bundle = new Bundle();
        A08(bundle, c26937f);
        String A06 = A06(123, 19, 18);
        Bundle data = A01(c26937f);
        bundle.putBundle(A06, data);
        return bundle;
    }

    public static Bundle A01(C26937f c26937f) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(A06(67, 23, 124), AdSettings.isMixedAudience());
        bundle.putBoolean(A06(6, 27, 18), AdInternalSettings.isExplicitTestMode());
        String adTypeString = AdSettings.getTestAdType().getAdTypeString();
        if (adTypeString != null) {
            bundle.putString(A06(272, 20, 111), adTypeString);
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
        String adTypeString2 = A06(177, 27, 109);
        String[] stringArray = multithreadedBundleWrapper.getStringArray(adTypeString2);
        if (stringArray != null) {
            bundle.putStringArray(adTypeString2, stringArray);
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper2 = AdInternalSettings.sSettingsBundle;
        String adTypeString3 = A06(142, 35, 39);
        Integer integer = multithreadedBundleWrapper2.getInteger(adTypeString3);
        if (integer != null) {
            bundle.putInt(adTypeString3, integer.intValue());
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper3 = AdInternalSettings.sSettingsBundle;
        String adTypeString4 = A06(204, 33, 11);
        Integer integer2 = multithreadedBundleWrapper3.getInteger(adTypeString4);
        if (integer2 != null) {
            bundle.putInt(adTypeString4, integer2.intValue());
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper4 = AdInternalSettings.sSettingsBundle;
        String adTypeString5 = A06(412, 25, 108);
        String string = multithreadedBundleWrapper4.getString(adTypeString5, null);
        if (string != null) {
            bundle.putString(adTypeString5, string);
        }
        if (A01[3].charAt(31) == 'y') {
            throw new RuntimeException();
        }
        String[] dpoArr = A01;
        dpoArr[7] = "XpPCLNEmMQwk6Xo71L4f47kqmhAOs7dk";
        bundle.putBoolean(A06(54, 13, 110), C3500LE.A05(c26937f));
        return bundle;
    }

    public static Bundle A02(String str, C236526 c236526) {
        Bundle bundle = new Bundle();
        A08(bundle, c236526.A05());
        bundle.putString(A06(437, 17, 103), c236526.A0A());
        bundle.putString(A06(259, 13, 122), str);
        bundle.putString(A06(292, 19, 28), c236526.A07());
        bundle.putString(A06(352, 19, 30), c236526.A08());
        bundle.putString(A06(390, 22, 51), c236526.A09());
        bundle.putString(A06(371, 19, 39), AbstractC23762H.A01(c236526.A0B()));
        RewardData A03 = c236526.A03();
        if (A03 != null) {
            AbstractC23812M.A00(bundle, A03);
        }
        bundle.putBundle(A06(123, 19, 18), A01(c236526.A05()));
        return bundle;
    }

    public static Bundle A03(String str, C23742F c23742f) {
        Bundle bundle = new Bundle();
        A08(bundle, c23742f.A0B);
        bundle.putString(A06(437, 17, 103), c23742f.A0D);
        bundle.putString(A06(259, 13, 122), str);
        bundle.putString(A06(292, 19, 28), c23742f.A05);
        bundle.putString(A06(352, 19, 30), c23742f.A06);
        bundle.putString(A06(390, 22, 51), c23742f.A07);
        AdExperienceType adExperienceType = c23742f.A02;
        if (adExperienceType != null) {
            bundle.putString(A06(237, 22, 37), AbstractC23752G.A02(adExperienceType));
        }
        bundle.putBoolean(A06(90, 33, 125), c23742f.A08);
        RewardData rewardData = c23742f.A03;
        if (rewardData != null) {
            AbstractC23812M.A00(bundle, rewardData);
        }
        Bundle A012 = A01(c23742f.A0B);
        if (A01[4].length() == 31) {
            throw new RuntimeException();
        }
        A01[7] = "v58AZGn4yW2MXgAwo8zd1tP5lhmEXT01";
        bundle.putBundle(A06(123, 19, 18), A012);
        return bundle;
    }

    public static C236526 A04(C4337Yn c4337Yn, Bundle bundle, String str) {
        String string = bundle.getString(A06(437, 17, 103));
        String placement = A06(292, 19, 28);
        String string2 = bundle.getString(placement);
        String placement2 = A06(352, 19, 30);
        String string3 = bundle.getString(placement2);
        String placement3 = A06(390, 22, 51);
        String sdkVersion = bundle.getString(placement3);
        String placement4 = A06(330, 22, 8);
        String string4 = bundle.getString(placement4);
        String placement5 = A06(123, 19, 18);
        Bundle bundle2 = bundle.getBundle(placement5);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (string == null) {
            string = A06(0, 0, 88);
        }
        C236526 c236526 = new C236526(c4337Yn, null, string, new C4430aL(str, string4, bundle2));
        c236526.A0I(string3);
        c236526.A0H(string2);
        c236526.A0J(sdkVersion);
        String placement6 = A06(371, 19, 39);
        c236526.A0K(AbstractC23762H.A02(bundle.getString(placement6)));
        RewardData A012 = AbstractC23812M.A01(bundle);
        if (A012 != null) {
            c236526.A0F(A012);
        }
        return c236526;
    }

    public static C23742F A05(C4337Yn c4337Yn, Bundle bundle, String str) {
        String string = bundle.getString(A06(437, 17, 103));
        String rvPlacement = A06(292, 19, 28);
        String string2 = bundle.getString(rvPlacement);
        String rvPlacement2 = A06(90, 33, 125);
        boolean z10 = bundle.getBoolean(rvPlacement2);
        String rvPlacement3 = A06(352, 19, 30);
        String adExperienceType = bundle.getString(rvPlacement3);
        String rvPlacement4 = A06(390, 22, 51);
        String mediationData = bundle.getString(rvPlacement4);
        String rvPlacement5 = A06(237, 22, 37);
        String string3 = bundle.getString(rvPlacement5);
        String rvPlacement6 = A06(330, 22, 8);
        String string4 = bundle.getString(rvPlacement6);
        String rvPlacement7 = A06(123, 19, 18);
        Bundle bundle2 = bundle.getBundle(rvPlacement7);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (string == null) {
            string = A06(0, 0, 88);
        }
        C23742F c23742f = new C23742F(c4337Yn, string, null, new C4430aL(str, string4, bundle2));
        c23742f.A06 = adExperienceType;
        c23742f.A05 = string2;
        c23742f.A08 = z10;
        c23742f.A02 = AbstractC23752G.A00(string3);
        c23742f.A07 = mediationData;
        RewardData A012 = AbstractC23812M.A01(bundle);
        if (A012 != null) {
            c23742f.A03 = A012;
        }
        return c23742f;
    }

    public static void A08(Bundle bundle, C26937f c26937f) {
        bundle.putString(A06(330, 22, 8), A06(0, 6, 63));
        bundle.putBoolean(A06(33, 21, 59), C271884.A0I(c26937f));
        if (AbstractC3351Ik.A0B(c26937f)) {
            String A03 = new C26316S().A03(c26937f);
            String bidderTokenExtras = A06(311, 19, 58);
            bundle.putString(bidderTokenExtras, A03);
        }
    }
}
