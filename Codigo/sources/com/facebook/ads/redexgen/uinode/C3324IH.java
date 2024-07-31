package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.IH */
/* loaded from: assets/audience_network.dex */
public final class C3324IH {
    public static byte[] A05;
    public static String[] A06 = {"BmLXPPjgF3W3yl6sHxYVjODx4Gc4ZSvN", "I4b0P0MoHEzHAP7yyYIBBQ151YdBHOwS", "TnUUZ2ELhZytD28RyaEX2mWW0X", "N95", "x88QxZ2XVEltUSPssGjwLeARzs7qYdf0", "T8gtGJunXdUSumjdX3X9mxIBVL", "lBAIpAErMYY7sFwVqjboSux", "Abd"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3324IH A00(C3306Hz c3306Hz) throws C28319v {
        try {
            c3306Hz.A0Z(4);
            int A0E = (c3306Hz.A0E() & 3) + 1;
            if (A0E == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int A0E2 = c3306Hz.A0E() & 31;
            for (int i10 = 0; i10 < A0E2; i10++) {
                arrayList.add(A03(c3306Hz));
            }
            int A0E3 = c3306Hz.A0E();
            for (int i11 = 0; i11 < A0E3; i11++) {
                arrayList.add(A03(c3306Hz));
            }
            int i12 = -1;
            int i13 = -1;
            float f10 = 1.0f;
            if (A0E2 > 0) {
                C3301Hu A062 = AbstractC3302Hv.A06((byte[]) arrayList.get(0), A0E, ((byte[]) arrayList.get(0)).length);
                i12 = A062.A06;
                i13 = A062.A02;
                f10 = A062.A00;
            } else {
                String[] strArr = A06;
                if (strArr[3].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "uBIRbiuvHYy0oHv2RJvgJqXQ4A";
                strArr2[5] = "sPpQgCzWXqIb9lVIC566YsDxxs";
            }
            return new C3324IH(arrayList, A0E, i12, i13, f10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new C28319v(A01(0, 24, 65), e10);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-14, 31, 31, 28, 31, -51, 29, 14, 31, 32, 22, 27, 20, -51, -18, 3, -16, -51, 16, 28, 27, 19, 22, 20};
    }

    static {
        A02();
    }

    public C3324IH(List<byte[]> initializationData, int i10, int i11, int i12, float f10) {
        this.A04 = initializationData;
        this.A02 = i10;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = f10;
    }

    public static byte[] A03(C3306Hz c3306Hz) {
        int A0I = c3306Hz.A0I();
        int offset = c3306Hz.A06();
        c3306Hz.A0Z(A0I);
        return AbstractC3285He.A08(c3306Hz.A00, offset, A0I);
    }
}
