package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC2219Ad;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aJ */
/* loaded from: assets/audience_network.dex */
public final class C4428aJ implements InterfaceC23722D {
    public static byte[] A05;
    public static String[] A06 = {"l1o30ubgNMqwIxdsvAhdwl", "uEolzpc8zYF03u8DLAeDfs0A9wQx2vsd", "zKwy", "mFz9Za5MD8BXE4Lkxv", "Wms6Ep20", "", "s6yiLC", "izOiniaIEQHycLDhhOkzL"};
    public final AbstractC4445aa A00;
    public final InterfaceC236021 A01;
    public final HandlerC236829 A02;
    public final C23742F A03;
    public final C4337Yn A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{57, 28, 88, 23, 26, 18, 29, 27, 12, 88, 17, 11, 88, 22, 13, 20, 20, 56, 47, 52, 62, 54, 63, 37, 63, 34, 46, 40, 59, 41, 37, 49, 63, 35, 9, 13, 14, 58, 43, 38, 42, 33, 44, 42, 1, 42, 59, 56, 32, 61, 36, 98, 101, Byte.MAX_VALUE, 116, 110, 121, 121, 100, 121, 116, 104, 100, 111, 110, 116, 96, 110, 114, 14, 9, 19, 24, 21, 17, 24, 17, 14, 3, 2, 8, 24, 3, 18, 21, 6, 19, 14, 8, 9, 24, 12, 2, 30, 111, 108, 109, 100, 124, 106, 109, 117, 98, 111, 106, 103, 98, 119, 106, 108, 109, 124, 119, 106, 110, 102, 124, 104, 102, 122, 59, 19, 5, 5, 23, 17, 19, 76, 86, 96, 68, 94, 94, 68, 67, 74, 13, 79, 88, 67, 73, 65, 72, 13, 75, 66, 95, 13, 64, 72, 94, 94, 76, 74, 72, 8, 44, 54, 54, 44, 43, 34, 101, 39, 48, 43, 33, 41, 32, 101, 35, 42, 55, 101, 40, 32, 54, 54, 36, 34, 32, 107, 90, 93, 91, 86, 76, 91, 91, 70, 91, 86, 68, 76, 90, 90, 72, 78, 76, 86, 66, 76, 80, 5, 20, 13};
        String[] strArr = A06;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[1] = "11z8nLjTbJ8kXGgkHyQ0qsLYj80GB6ec";
        strArr2[2] = "E5wc";
    }

    static {
        A01();
    }

    public C4428aJ(C4337Yn c4337Yn, C23742F c23742f, InterfaceC236021 interfaceC236021, AbstractC4445aa abstractC4445aa, HandlerC236829 handlerC236829) {
        this.A04 = c4337Yn;
        this.A03 = c23742f;
        this.A01 = interfaceC236021;
        this.A00 = abstractC4445aa;
        this.A02 = handlerC236829;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23722D
    public final Bundle A4e(String str) {
        return AbstractC23802L.A03(str, this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23722D
    public final void A56() {
        this.A02.A0F(AdError.CACHE_ERROR_CODE, null);
        this.A02.A0C();
        this.A03.A03(null);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23722D
    public final int A7J() {
        return AdError.SERVER_ERROR_CODE;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23722D
    public final void A8W(Message message) {
        InterfaceC2219Ad A00 = this.A03.A00();
        String A002 = A00(203, 3, 16);
        if (A00 == null) {
            this.A04.A07().A9a(A002, AbstractC27248A.A0K, new C27258B(A00(0, 17, 12)));
            return;
        }
        int i10 = message.what;
        String A003 = A00(120, 9, 2);
        String A004 = A00(17, 17, 14);
        switch (i10) {
            case 10:
            case 2103:
                Bundle bundle = message.getData().getBundle(A004);
                if (bundle != null) {
                    int i11 = bundle.getInt(A00(51, 18, 95));
                    String string = bundle.getString(A00(182, 21, 125));
                    AdError adError = new AdError(i11, string);
                    this.A01.AG0(adError);
                    if (this.A03.A04 != null) {
                        this.A03.A04.onError(A00, adError);
                    } else {
                        Log.e(A00(34, 17, 59), string);
                    }
                } else {
                    this.A01.AFw(EnumC235920.A05);
                    String errorMessage = A003 + message;
                    this.A04.A07().A9a(A002, AbstractC27248A.A0V, new C27258B(A00(155, 27, 49), errorMessage));
                }
                this.A03.A03(null);
                return;
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                this.A01.AG5();
                Bundle bundle2 = message.getData().getBundle(A004);
                if (bundle2 != null) {
                    this.A03.A01 = bundle2.getLong(A00(94, 26, 87));
                    C23742F c23742f = this.A03;
                    int i12 = bundle2.getInt(A00(69, 25, 51));
                    String[] strArr = A06;
                    if (strArr[6].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A06;
                    strArr2[6] = "eimvHB";
                    strArr2[7] = "9nAYjps8XJWkdVKe7ORqJ";
                    c23742f.A00 = i12;
                } else {
                    this.A04.A07().A9a(A002, AbstractC27248A.A0V, new C27258B(A00(129, 26, 89), A003 + message));
                }
                this.A03.A03(null);
                break;
            case 2106:
                this.A03.A03(null);
                break;
            case 2110:
                this.A01.AGF();
                break;
        }
        if (this.A03.A04 == null) {
            return;
        }
        switch (message.what) {
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                this.A03.A04.onAdLoaded(A00);
                return;
            case 2104:
                this.A03.A04.onAdClicked(A00);
                return;
            case 2105:
                this.A03.A04.onLoggingImpression(A00);
                return;
            case 2106:
                if (this.A03.A04 instanceof RewardedVideoAdExtendedListener) {
                    ((RewardedVideoAdExtendedListener) this.A03.A04).onRewardedVideoActivityDestroyed();
                    return;
                }
                return;
            case 2110:
                this.A03.A04.onRewardedVideoClosed();
                return;
            case 3000:
                this.A03.A04.onRewardedVideoCompleted();
                return;
            case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                if (this.A03.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A03.A04).onRewardServerSuccess();
                    return;
                }
                return;
            case 3002:
                if (this.A03.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A03.A04).onRewardServerFailed();
                    return;
                }
                return;
            default:
                return;
        }
    }
}