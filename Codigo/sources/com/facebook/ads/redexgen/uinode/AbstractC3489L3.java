package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.L3 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3489L3 {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<EnumC3405Je, EnumC3407Jg> A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, 25, 74, 30, 93, 76, 91, 95, 74, 91, 30, Byte.MAX_VALUE, 90, 109, 87, 68, 91, 30, 75, 77, 87, 80, 89, 30, 74, 86, 87, 77, 30, 73, 87, 90, 74, 86, 30, 95, 80, 90, 30, 86, 91, 87, 89, 86, 74, 16, 115, 72, 77, 72, 73, 81, 72, 6, 103, 66, 117, 79, 92, 67, 6, 82, 95, 86, 67, 8};
    }

    static {
        A07();
        HashMap hashMap = new HashMap();
        A02 = hashMap;
        hashMap.put(EnumC3405Je.A08, EnumC3407Jg.A0C);
        hashMap.put(EnumC3405Je.A06, EnumC3407Jg.A0E);
        hashMap.put(EnumC3405Je.A05, EnumC3407Jg.A0D);
    }

    public static AdSize A00(EnumC3405Je enumC3405Je) {
        return AdSize.fromWidthAndHeight(enumC3405Je.A03(), enumC3405Je.A02());
    }

    public static AdSize A01(EnumC3407Jg enumC3407Jg) {
        for (Map.Entry<EnumC3405Je, EnumC3407Jg> entry : A02.entrySet()) {
            if (entry.getValue() == enumC3407Jg) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static EnumC3405Je A02(int i10) {
        switch (i10) {
            case 4:
                return EnumC3405Je.A04;
            case 5:
                return EnumC3405Je.A05;
            case 6:
                return EnumC3405Je.A06;
            case 7:
                return EnumC3405Je.A08;
            case 100:
                return EnumC3405Je.A07;
            default:
                throw new IllegalArgumentException(A06(48, 20, 63));
        }
    }

    public static EnumC3405Je A03(int i10, int i11) {
        if (EnumC3405Je.A07.A02() == i11 && EnumC3405Je.A07.A03() == i10) {
            EnumC3405Je enumC3405Je = EnumC3405Je.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return enumC3405Je;
        }
        if (EnumC3405Je.A04.A02() == i11 && EnumC3405Je.A04.A03() == i10) {
            return EnumC3405Je.A04;
        }
        if (EnumC3405Je.A05.A02() == i11 && EnumC3405Je.A05.A03() == i10) {
            EnumC3405Je enumC3405Je2 = EnumC3405Je.A05;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
            strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
            return enumC3405Je2;
        }
        if (EnumC3405Je.A06.A02() == i11 && EnumC3405Je.A06.A03() == i10) {
            return EnumC3405Je.A06;
        }
        if (EnumC3405Je.A08.A02() == i11 && EnumC3405Je.A08.A03() == i10) {
            return EnumC3405Je.A08;
        }
        throw new IllegalArgumentException(A06(0, 48, 39));
    }

    public static EnumC3405Je A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static EnumC3407Jg A05(EnumC3405Je enumC3405Je) {
        EnumC3407Jg adTemplate = A02.get(enumC3405Je);
        if (adTemplate == null) {
            EnumC3407Jg enumC3407Jg = EnumC3407Jg.A0F;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
            strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
            return enumC3407Jg;
        }
        return adTemplate;
    }
}
