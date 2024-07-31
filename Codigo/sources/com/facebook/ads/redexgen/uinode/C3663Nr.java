package com.facebook.ads.redexgen.uinode;

import android.content.ActivityNotFoundException;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Nr */
/* loaded from: assets/audience_network.dex */
public final class C3663Nr {
    public static long A0C;
    public static byte[] A0D;
    public static String[] A0E = {"Dlx9HUQ", "3SJpPR4POSYtfyo20zogCoACzZ0TFz6K", "kjKhSI2oz7rhTngoHOUaCo24OHJZbpIQ", "a4Zk7jMDxn", "WU0c1Yk7xIFA3rTFxMg", "", "SjppttcIPjZ3F", "aZkh9z8pdJw1o0Uivju"};
    public AbstractC4476b5 A00;
    public InterfaceC3662Nq A01;
    public C3688OG A02;
    public boolean A03;
    public boolean A04;
    public final C23271U A05;
    public final C4337Yn A06;
    public final InterfaceC3369J2 A07;
    public final C3528Lg A08;
    public final InterfaceC3560MC A09;
    public final C3872RE A0A;
    public final String A0B;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0D = new byte[]{31, 8, 29, 30, 41, 40, 40, 51, 50, 31, 48, 53, 63, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, 23, 82, 79, 82, 84, 66, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    static {
        A01();
        A0C = 0L;
    }

    public C3663Nr(C4337Yn c4337Yn, String str, C3872RE c3872re, C3528Lg c3528Lg, InterfaceC3369J2 interfaceC3369J2, C23271U c23271u) {
        this(c4337Yn, str, c3872re, c3528Lg, interfaceC3369J2, c23271u, new C4030Tm());
    }

    public C3663Nr(C4337Yn c4337Yn, String str, C3872RE c3872re, C3528Lg c3528Lg, InterfaceC3369J2 interfaceC3369J2, C23271U c23271u, InterfaceC3560MC interfaceC3560MC) {
        this.A03 = true;
        this.A06 = c4337Yn;
        this.A0B = str;
        this.A0A = c3872re;
        this.A08 = c3528Lg;
        this.A07 = interfaceC3369J2;
        this.A05 = c23271u;
        this.A09 = interfaceC3560MC;
    }

    private void A02(String str, String str2, Map<String, String> map) {
        String A00 = A00(0, 22, 52);
        try {
            AbstractC3536Lo.A0Z(map, this.A00);
            AbstractC22790h A01 = C22800i.A01(this.A06, this.A07, str, AbstractC3484Ky.A00(str2), new C3654Ni(map).A03(this.A0A).A02(this.A08).A05(), this.A03, this.A04, this.A05);
            if (A01 instanceof C3165Fg) {
                ((C3165Fg) A01).A0H(this.A02);
            }
            EnumC22780g actionOutcome = EnumC22780g.A08;
            if (A01 != null) {
                actionOutcome = A01.A0C();
            }
            if (!(((A01 instanceof C3163Fe) || (A01 instanceof C3165Fg)) && AbstractC3536Lo.A0e(this.A06, actionOutcome, map)) && actionOutcome != EnumC22780g.A05) {
                InterfaceC3662Nq interfaceC3662Nq = this.A01;
                if (interfaceC3662Nq != null) {
                    interfaceC3662Nq.ABE();
                }
                this.A09.A43(this.A0B);
            }
        } catch (ActivityNotFoundException e10) {
            Log.e(A00, A00(44, 20, 100) + str2, e10);
        } catch (Exception e11) {
            Log.e(A00, A00(22, 22, 95), e11);
        }
    }

    public static boolean A03(C4337Yn c4337Yn) {
        boolean isIABBottomSheetEnabled = C3348Ih.A2N(c4337Yn);
        int A06 = C3348Ih.A06(c4337Yn);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = A0C;
        long j11 = currentTimeMillis - j10;
        if (isIABBottomSheetEnabled) {
            String[] strArr = A0E;
            String str = strArr[0];
            String str2 = strArr[6];
            int clickguardTime = str.length();
            if (clickguardTime == str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "iHhMWVvnkjnFrqYtRUL";
            strArr2[4] = "26cGs68neeVahMKc5kl";
            if (j10 > 0 && j11 < A06) {
                return true;
            }
        }
        A0C = System.currentTimeMillis();
        return false;
    }

    public final void A04(AbstractC4476b5 abstractC4476b5) {
        this.A00 = abstractC4476b5;
    }

    public final void A05(InterfaceC3662Nq interfaceC3662Nq) {
        this.A01 = interfaceC3662Nq;
    }

    public final void A06(C3688OG c3688og) {
        this.A02 = c3688og;
    }

    public final void A07(String str, String str2, Map<String, String> extraData) {
        new C3377JA(str, this.A07).A04(EnumC3376J9.A0J, extraData);
        if (this.A08.A09(this.A06)) {
            this.A07.A9W(str, extraData);
        } else {
            A02(str, str2, extraData);
        }
    }

    public final void A08(boolean z10) {
        this.A04 = z10;
    }
}
