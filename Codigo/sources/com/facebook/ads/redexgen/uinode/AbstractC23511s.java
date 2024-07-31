package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1s */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC23511s {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            byte b10 = (byte) ((copyOfRange[i13] - i12) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            copyOfRange[i13] = b10;
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C4337Yn c4337Yn, AbstractC4476b5 abstractC4476b5, boolean z10, InterfaceC23491q interfaceC23491q) {
        if (!C3348Ih.A1k(c4337Yn)) {
            C26416c c26416c = new C26416c(c4337Yn);
            C23351c A06 = abstractC4476b5.A0x().A0D().A06();
            c26416c.A0d(new C3377JA(abstractC4476b5.A12(), c4337Yn.A09()));
            if (A06 == null) {
                interfaceC23491q.ACZ(AdError.CACHE_ERROR);
                return;
            }
            if (A06.A0J()) {
                interfaceC23491q.ACa();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            }
            C26376Y c26376y = new C26376Y(A06.A0E(), abstractC4476b5.A0S(), abstractC4476b5.A0P());
            c26376y.A04 = true;
            if (C3348Ih.A1Z(c4337Yn)) {
                c26376y.A03 = A00(0, 5, 22);
            }
            switch (C23481p.A00[A06.A09().ordinal()]) {
                case 1:
                case 2:
                    c26416c.A0X(c26376y);
                    break;
            }
            c26416c.A0b(new C26396a(abstractC4476b5.A10().A01(), -1, -1, abstractC4476b5.A0S(), abstractC4476b5.A0P()));
            c26416c.A0b(new C26396a(A06.A0D(), -1, -1, abstractC4476b5.A0S(), abstractC4476b5.A0P()));
            c26416c.A0W(new C4463as(c4337Yn, interfaceC23491q, c26416c, A06, z10), new C26346V(abstractC4476b5.A0S(), abstractC4476b5.A0P()));
            return;
        }
        interfaceC23491q.ACa();
    }
}
