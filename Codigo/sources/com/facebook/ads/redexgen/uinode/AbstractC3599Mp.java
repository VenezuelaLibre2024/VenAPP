package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Mp */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3599Mp {
    public static String[] A00 = {"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    public static final int A01 = (int) (AbstractC3499LD.A02 * 200.0f);
    public static final int A03 = (int) (AbstractC3499LD.A02 * 200.0f);
    public static final int A02 = (int) (AbstractC3499LD.A02 * 50.0f);

    public static EnumC230013 A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return EnumC230013.A05;
        }
        if (A03(nativeAdLayout)) {
            return EnumC230013.A06;
        }
        return EnumC230013.A04;
    }

    public static AbstractC3598Mo A01(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, String str, NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int h10 = nativeAdLayout.getWidth();
        int w10 = nativeAdLayout.getHeight();
        int i10 = A01;
        if (h10 >= i10 && w10 >= i10) {
            return new C4048U4(c4337Yn, interfaceC3369J2, str);
        }
        if (h10 < A03 || w10 < A02) {
            return null;
        }
        return new C4049U5(c4337Yn, interfaceC3369J2, str);
    }

    public static C4050U6 A02(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, String str, C23331a c23331a, InterfaceC3561MD interfaceC3561MD, InterfaceC3560MC interfaceC3560MC) {
        return new C4050U6(c4337Yn, interfaceC3369J2, str, c23331a, interfaceC3561MD, interfaceC3560MC);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h10 = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w10 = A01;
        if (h10 < w10 || height < w10) {
            if (h10 >= A03) {
                int i10 = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (height < i10) {
                }
            }
            return true;
        }
        return false;
    }
}
