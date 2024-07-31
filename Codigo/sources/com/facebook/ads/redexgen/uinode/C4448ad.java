package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.ad */
/* loaded from: assets/audience_network.dex */
public final class C4448ad implements InterfaceC236021 {
    public static byte[] A05;
    public static String[] A06 = {"iEaWyjzULIZCFnp1nESlU5XZjwcvRjHd", "KbGYZiX8Pduw0KfpYwrRe1NWFWC1OMxy", "fhu9engps4P6WEn4zln6smGq5lQXex4h", "tbT6PfDqIL055", "rKa5gX4b0", "TAsNWcfBygYGmj6nueBPL3we7Mc4FYi0", "mn5595Nd0", "gAb4cPpeQcskkpTdmUE6rt9G8rZq3FNo"};
    public AdError A00;
    public EnumC235920 A01 = EnumC235920.A03;
    public EnumC235920 A02 = EnumC235920.A03;
    public final AbstractC4445aa A03;
    public final C4337Yn A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[7].charAt(1) != strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            A06[0] = "d2XCtNqKB2PlkmIVLWNasBjUSsZJOiBr";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 29);
            i13++;
        }
    }

    public static void A01() {
        A05 = new byte[]{-73, 11, 6, -73, 118, 104, -95, -73, -67, 104, -85, -87, -74, 104, -85, -80, -87, -74, -81, -83, 104, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, 104, -115, -70, -70, -73, -70, 104, -75, -73, -84, -83, 104, -86, -63, 104, -69, -83, -68, -68, -79, -74, -81, 104, -119, -84, -101, -83, -68, -68, -79, -74, -81, -69, 118, -69, -83, -68, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, -115, -70, -70, -73, -70, -107, -73, -84, -83, 112, 113, 112, 108, 107, -97, -114, -109, -113, -104, -115, -113, 120, -113, -98, -95, -103, -100, -107, -103, -59, -62, -64, 115, -41, -14, -17, -18, -25, -96, -23, -18, -12, -27, -14, -18, -31, -20, -96, -12, -14, -31, -18, -13, -23, -12, -23, -17, -18, -82, -15, 0, -7, -67, -64, -78, -75, 121, 122, -63, -74, -67, -59, 118, 119, 15, 3, -4, 15, -69, 4, 14, -69, -4, 7, 13, 0, -4, -1, 20, -69, -25, -22, -36, -33, -28, -23, -30, -57, -69, -25, -22, -36, -33, -32, -33, -69, 10, 13, -69, -18, -29, -22, -14, -28, -23, -30, -45, -57, -64, -45, Byte.MAX_VALUE, -56, -46, Byte.MAX_VALUE, -64, -53, -47, -60, -64, -61, -40, Byte.MAX_VALUE, -78, -89, -82, -74, -88, -83, -90, -14, -26, -33, -14, -98, -25, -15, -98, -20, -19, -14, -98, -54, -51, -65, -62, -61, -62};
    }

    static {
        A01();
    }

    public C4448ad(C4337Yn c4337Yn, AbstractC4445aa abstractC4445aa) {
        this.A04 = c4337Yn;
        this.A03 = abstractC4445aa;
    }

    private void A02(EnumC235920 enumC235920, EnumC235920 enumC2359202) {
        String A00 = A00(113, 26, 99);
        StringBuilder sb2 = new StringBuilder();
        String errorTitle = A00(108, 5, 54);
        StringBuilder append = sb2.append(errorTitle).append(enumC235920);
        String errorTitle2 = A00(0, 4, 122);
        String sb3 = append.append(errorTitle2).append(enumC2359202).toString();
        InterfaceC272389 A07 = this.A04.A07();
        int i10 = AbstractC27248A.A0e;
        C27258B c27258b = new C27258B(A00, sb3);
        String errorTitle3 = A00(139, 3, 115);
        A07.A9a(errorTitle3, i10, c27258b);
        String errorTitle4 = A00 + ' ' + sb3;
        this.A04.A0E().AHI(errorTitle4);
    }

    private void A03(String str, String str2, boolean z10) {
        AdSettings.IntegrationErrorMode A00 = AbstractC23561x.A00(this.A04);
        String format = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String A002 = A00(139, 3, 115);
        String A003 = A00(91, 17, 13);
        if (!z10) {
            Log.e(A003, format);
            this.A04.A07().A9a(A002, AbstractC27248A.A0c, new C27258B(format));
            this.A04.A0E().AHH(format);
            return;
        }
        switch (C23581z.A00[A00.ordinal()]) {
            case 1:
                String errorMessage = format + A00(4, 87, 43);
                throw new C236122(errorMessage);
            case 2:
                this.A03.A08();
                this.A03.A0B(10, AdErrorType.INCORRECT_STATE_ERROR, format);
                this.A04.A0E().AHH(format);
                Log.e(A003, format);
                this.A04.A07().A9a(A002, AbstractC27248A.A0c, new C27258B(format));
                break;
        }
        Log.e(A003, format);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC236021
    public final boolean A5d() {
        boolean z10 = (this.A01 == EnumC235920.A03 || this.A01 == EnumC235920.A05) && this.A02 != EnumC235920.A08;
        if (z10) {
            this.A01 = EnumC235920.A07;
        } else {
            A03(A00(142, 6, 52), A00(154, 42, 126), false);
        }
        return !z10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC236021
    public final boolean A5e() {
        AdError adError;
        if (this.A01 == EnumC235920.A05 && (adError = this.A00) != null && adError.getErrorCode() == 2008) {
            this.A04.A0E().AEt();
            this.A03.A0B(10, AdErrorType.AD_PRESENTATION_ERROR, null);
            return true;
        }
        boolean z10 = this.A01 == EnumC235920.A06 && (this.A02 != EnumC235920.A08 || C3348Ih.A0e(this.A04));
        if (z10) {
            this.A01 = EnumC235920.A03;
            this.A02 = EnumC235920.A08;
        } else {
            EnumC235920 enumC235920 = this.A01;
            EnumC235920 enumC2359202 = EnumC235920.A06;
            String A00 = A00(148, 6, 49);
            if (enumC235920 != enumC2359202) {
                A03(A00, A00(219, 18, 97), true);
            } else {
                A03(A00, A00(196, 23, 66), false);
            }
        }
        return !z10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC236021
    public final EnumC235920 A5v() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC236021
    public final EnumC235920 A5w() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC236021
    public final void AFw(EnumC235920 enumC235920) {
        this.A01 = enumC235920;
        this.A02 = enumC235920;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC236021
    public final void AG0(AdError adError) {
        this.A01 = EnumC235920.A05;
        this.A02 = EnumC235920.A05;
        this.A00 = adError;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC236021
    public final void AG5() {
        if (this.A01 != EnumC235920.A07) {
            A02(this.A01, EnumC235920.A06);
        }
        this.A01 = EnumC235920.A06;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC236021
    public final void AGF() {
        if (this.A02 != EnumC235920.A08) {
            A02(this.A01, EnumC235920.A09);
        }
        this.A02 = EnumC235920.A09;
    }
}
