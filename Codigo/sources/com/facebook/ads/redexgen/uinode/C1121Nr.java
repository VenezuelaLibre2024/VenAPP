package com.facebook.ads.redexgen.uinode;

import android.content.ActivityNotFoundException;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Nr */
/* loaded from: assets/audience_network.dex */
public final class C1121Nr {
    public static long A0C;
    public static byte[] A0D;
    public static String[] A0E = {"Dlx9HUQ", "3SJpPR4POSYtfyo20zogCoACzZ0TFz6K", "kjKhSI2oz7rhTngoHOUaCo24OHJZbpIQ", "a4Zk7jMDxn", "WU0c1Yk7xIFA3rTFxMg", "", "SjppttcIPjZ3F", "aZkh9z8pdJw1o0Uivju"};
    public AbstractC1502b5 A00;
    public InterfaceC1120Nq A01;
    public OG A02;
    public boolean A03;
    public boolean A04;
    public final C1U A05;
    public final C1399Yn A06;
    public final J2 A07;
    public final C1058Lg A08;
    public final MC A09;
    public final RE A0A;
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

    public C1121Nr(C1399Yn c1399Yn, String str, RE re2, C1058Lg c1058Lg, J2 j22, C1U c1u) {
        this(c1399Yn, str, re2, c1058Lg, j22, c1u, new C1272Tm());
    }

    public C1121Nr(C1399Yn c1399Yn, String str, RE re2, C1058Lg c1058Lg, J2 j22, C1U c1u, MC mc2) {
        this.A03 = true;
        this.A06 = c1399Yn;
        this.A0B = str;
        this.A0A = re2;
        this.A08 = c1058Lg;
        this.A07 = j22;
        this.A05 = c1u;
        this.A09 = mc2;
    }

    private void A02(String str, String str2, Map<String, String> map) {
        String A00 = A00(0, 22, 52);
        try {
            AbstractC1066Lo.A0Z(map, this.A00);
            AbstractC05560h A01 = C05570i.A01(this.A06, this.A07, str, AbstractC1050Ky.A00(str2), new C1112Ni(map).A03(this.A0A).A02(this.A08).A05(), this.A03, this.A04, this.A05);
            if (A01 instanceof C0913Fg) {
                ((C0913Fg) A01).A0H(this.A02);
            }
            EnumC05550g actionOutcome = EnumC05550g.A08;
            if (A01 != null) {
                actionOutcome = A01.A0C();
            }
            if (!(((A01 instanceof C0911Fe) || (A01 instanceof C0913Fg)) && AbstractC1066Lo.A0e(this.A06, actionOutcome, map)) && actionOutcome != EnumC05550g.A05) {
                InterfaceC1120Nq interfaceC1120Nq = this.A01;
                if (interfaceC1120Nq != null) {
                    interfaceC1120Nq.ABE();
                }
                this.A09.A43(this.A0B);
            }
        } catch (ActivityNotFoundException e10) {
            Log.e(A00, A00(44, 20, 100) + str2, e10);
        } catch (Exception e11) {
            Log.e(A00, A00(22, 22, 95), e11);
        }
    }

    public static boolean A03(C1399Yn c1399Yn) {
        boolean isIABBottomSheetEnabled = C0988Ih.A2N(c1399Yn);
        int A06 = C0988Ih.A06(c1399Yn);
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

    public final void A04(AbstractC1502b5 abstractC1502b5) {
        this.A00 = abstractC1502b5;
    }

    public final void A05(InterfaceC1120Nq interfaceC1120Nq) {
        this.A01 = interfaceC1120Nq;
    }

    public final void A06(OG og2) {
        this.A02 = og2;
    }

    public final void A07(String str, String str2, Map<String, String> extraData) {
        new JA(str, this.A07).A04(J9.A0J, extraData);
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
