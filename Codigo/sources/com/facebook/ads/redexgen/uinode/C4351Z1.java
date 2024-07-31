package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Z1 */
/* loaded from: assets/audience_network.dex */
public final class C4351Z1 {
    public static byte[] A02;
    public static final String A03;
    public final InterfaceC261066 A00;
    public final C26416c A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, 71, 78, 81, 67, 70, 75, 80, 73, 2, 7, 70, 2, 67, 85, 85, 71, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, 15, 93, 35, 69, 56, 63, 66, 52, 55, 60, 65, 58, -13, 64, 52, 69, 62, 72, 67, 13, -13, -8, 70, 25, 59, 46, 53, 56, 42, 45, 50, 55, 48, -23, 63, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, -31, -31, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, 19, 12, 9, 12, 13, 21, 12};
    }

    static {
        A02();
        A03 = C4351Z1.class.getSimpleName();
    }

    public C4351Z1(InterfaceC261066 interfaceC261066, C4336Ym c4336Ym) {
        this.A00 = interfaceC261066;
        interfaceC261066.A3P(new C4353Z3(this));
        this.A01 = new C26416c(c4336Ym);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(0, 20, 114), Integer.valueOf(this.A00.A62().size()));
        }
        for (InterfaceC261369 interfaceC261369 : this.A00.A62()) {
            switch (C260965.A00[interfaceC261369.A8D().ordinal()]) {
                case 1:
                    A04(interfaceC261369.getUrl());
                    break;
                case 2:
                    A06(interfaceC261369.getUrl());
                    break;
                case 3:
                    A05(interfaceC261369.getUrl());
                    break;
            }
        }
        this.A01.A0W(new C4352Z2(this), new C26346V(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 122), str);
        }
        C26396a c26396a = new C26396a(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        c26396a.A01 = A00(117, 8, 90);
        this.A01.A0b(c26396a);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 99), str);
        }
        C26376Y c26376y = new C26376Y(str, A00(81, 36, 11), A00(125, 7, 46));
        c26376y.A04 = true;
        c26376y.A02 = A00(117, 8, 90);
        this.A01.A0X(c26376y);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 89), str);
        }
        C26376Y c26376y = new C26376Y(str, A00(81, 36, 11), A00(125, 7, 46));
        c26376y.A04 = false;
        c26376y.A02 = A00(117, 8, 90);
        this.A01.A0a(c26376y);
    }
}
