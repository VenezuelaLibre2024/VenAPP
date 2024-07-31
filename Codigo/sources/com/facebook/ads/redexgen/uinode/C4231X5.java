package com.facebook.ads.redexgen.uinode;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.X5 */
/* loaded from: assets/audience_network.dex */
public final class C4231X5 implements InterfaceC3024DB {
    public static byte[] A02;
    public static String[] A03 = {"W3zpeZwD9Fi1kBaR", "uMdULlbYt84VxY86rM0TiEJbhaqKcXZ1", "Usin4k2UYlEJmIUoIPMyl4MixoDpG9ii", "hBZpg4XSGRsBFeFqV0aqL6EoVOREEldE", "UimonN4w5kzXtUMO8SJw69s6gFNeuD2Z", "uuKAqm4Yer5CcRyJ", "zRTcmdaM3Tn4RRVoPrSr5tVrwuK6PMWw", "taTU185R1PVUiY2ntZzDAqagtcVNoAEE"};
    public final int A00;
    public final List<Format> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C3021D7 A00(C3023DA c3023da) {
        String A01;
        int i10;
        if (A03(32)) {
            return new C3021D7(this.A01);
        }
        C3306Hz c3306Hz = new C3306Hz(c3023da.A03);
        List<Format> list = this.A01;
        while (c3306Hz.A04() > 0) {
            int A0E = c3306Hz.A0E();
            int A06 = c3306Hz.A06() + c3306Hz.A0E();
            if (A0E == 134) {
                list = new ArrayList<>();
                int A0E2 = c3306Hz.A0E() & 31;
                for (int i11 = 0; i11 < A0E2; i11++) {
                    String A0S = c3306Hz.A0S(3);
                    int A0E3 = c3306Hz.A0E();
                    if ((A0E3 & RecognitionOptions.ITF) != 0) {
                        A01 = A01(19, 19, 101);
                        i10 = A0E3 & 63;
                    } else {
                        A01 = A01(0, 19, 66);
                        i10 = 1;
                    }
                    list.add(Format.A08(null, A01, null, -1, 0, A0S, i10, null));
                    c3306Hz.A0Z(2);
                }
            }
            c3306Hz.A0Y(A06);
        }
        return new C3021D7(list);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{16, 1, 1, 29, 24, 18, 16, 5, 24, 30, 31, 94, 18, 20, 16, 92, 71, 65, 73, 55, 38, 38, 58, 63, 53, 55, 34, 63, 57, 56, 121, 53, 51, 55, 123, 97, 102, 110};
    }

    static {
        A02();
    }

    public C4231X5() {
        this(0);
    }

    public C4231X5(int i10) {
        this(i10, Collections.emptyList());
    }

    public C4231X5(int i10, List<Format> list) {
        this.A00 = i10;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 66), 0, null));
        }
        this.A01 = list;
    }

    private boolean A03(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3024DB
    public final SparseArray<InterfaceC3026DD> A4d() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3024DB
    public final InterfaceC3026DD A4j(int i10, C3023DA c3023da) {
        switch (i10) {
            case 2:
                return new C4222Ww(new C4228X2());
            case 3:
            case 4:
                return new C4222Ww(new C4223Wx(c3023da.A01));
            case 15:
                if (A03(2)) {
                    return null;
                }
                return new C4222Ww(new C4232X6(false, c3023da.A01));
            case 17:
                boolean A032 = A03(2);
                String[] strArr = A03;
                if (strArr[4].charAt(2) == strArr[3].charAt(2)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "Zsc3HcoanD4hgKlowrimr1mcCeCJ4aqm";
                strArr2[6] = "fbfbpCk06enibsJo0cAFVF7ae3oKLvDz";
                if (A032) {
                    return null;
                }
                return new C4222Ww(new C4224Wy(c3023da.A01));
            case 21:
                return new C4222Ww(new C4225Wz());
            case 27:
                boolean A033 = A03(4);
                String[] strArr3 = A03;
                if (strArr3[7].charAt(13) != strArr3[1].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[2] = "MnHqmUaQQZIE89AoLzdx0BMakHNAXRZh";
                strArr4[6] = "UBVzW5fdc0gZ9W3oa8if0wBLwl14wyCB";
                if (A033) {
                    return null;
                }
                return new C4222Ww(new C4227X1(A00(c3023da), A03(1), A03(8)));
            case 36:
                return new C4222Ww(new C4226X0(A00(c3023da)));
            case 89:
                return new C4222Ww(new C4229X3(c3023da.A02));
            case 129:
            case 135:
                return new C4222Ww(new C4235X9(c3023da.A01));
            case 130:
            case 138:
                return new C4222Ww(new C4230X4(c3023da.A01));
            case 134:
                if (A03(16)) {
                    return null;
                }
                return new C4219Wt(new C4218Ws());
            default:
                return null;
        }
    }
}
