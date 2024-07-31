package com.facebook.ads.redexgen.uinode;

import android.util.Pair;

/* renamed from: com.facebook.ads.redexgen.X.AH */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2853AH {
    public static String[] A00 = {"PM7DSx0y0lrec1UT4WPnkT9xVE7xO4Q3", "BEgdeY8scYjWDgLVGs4ZUut3Hirr2MX3", "ZAPPhI63uMybzXuqxrZ5dKdt3S18BPE9", "MM2rXOZDxF7k2VlV9Dcr24aSmfbMyxXV", "eywYp4IUfN7s09w4sjk3CdaIEMxiykZ2", "eISkZjTp9yJ8vcJJgc2cD29HnvZjEHrc", "bxIeMq2jLgGDMU", "MX4WpiU2EnoJ87vmil9r758WOfjNIsLN"};
    public static final AbstractC2853AH A01 = new C4291Y3();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract C2851AF A0A(int i10, C2851AF c2851af, boolean z10);

    public abstract C2852AG A0D(int i10, C2852AG c2852ag, boolean z10, long j10);

    public int A02(int i10, int i11, boolean z10) {
        switch (i11) {
            case 0:
                if (i10 == A06(z10)) {
                    return -1;
                }
                return i10 + 1;
            case 1:
                return i10;
            case 2:
                if (i10 == A06(z10)) {
                    return A05(z10);
                }
                return i10 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A03(int i10, C2851AF c2851af, C2852AG c2852ag, int i11, boolean z10) {
        int i12 = A09(i10, c2851af).A00;
        int windowIndex = A0B(i12, c2852ag).A01;
        if (windowIndex == i10) {
            int A02 = A02(i12, i11, z10);
            if (A00[1].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            A00[5] = "vHlQRfGLACzPc9SqhGGMQS9yx8mDrtQw";
            if (A02 == -1) {
                return -1;
            }
            C2852AG A0B = A0B(A02, c2852ag);
            int nextWindowIndex = A00[6].length();
            if (nextWindowIndex == 14) {
                A00[5] = "g3EvwHO3x67yk3ScCmOHXM9FC4inpbOU";
                int windowIndex2 = A0B.A00;
                return windowIndex2;
            }
            String[] strArr = A00;
            strArr[4] = "oJT8BcC7iC9ashzghnGVZpN5rOviRVye";
            strArr[3] = "BXJ5tQfk704SS2XTm0iOlKfvNFhc4WVf";
            int windowIndex3 = A0B.A00;
            return windowIndex3;
        }
        int windowIndex4 = i10 + 1;
        return windowIndex4;
    }

    public int A05(boolean z10) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z10) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(C2852AG c2852ag, C2851AF c2851af, int i10, long j10) {
        return A08(c2852ag, c2851af, i10, j10, 0L);
    }

    public final Pair<Integer, Long> A08(C2852AG c2852ag, C2851AF c2851af, int i10, long j10, long j11) {
        AbstractC3281Ha.A00(i10, 0, A01());
        A0D(i10, c2852ag, false, j11);
        if (j10 == -9223372036854775807L) {
            j10 = c2852ag.A01();
            if (A00[5].charAt(22) != '9') {
                throw new RuntimeException();
            }
            A00[0] = "jYNh2aRlntxjcST03zipQODHWrcZ3Q9N";
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = c2852ag.A00;
        long A03 = c2852ag.A03() + j10;
        long A07 = A09(i11, c2851af).A07();
        while (A07 != -9223372036854775807L && A03 >= A07) {
            int i12 = c2852ag.A01;
            if (A00[1].charAt(27) == 'r') {
                String[] strArr = A00;
                strArr[7] = "IuvzXoPM3cIs3JU7ThgGmV6LQ39mYtz4";
                strArr[2] = "DGRaGmTIVAXEwTC12jYPgBDTgoVWDlIc";
                if (i11 >= i12) {
                    break;
                }
                A03 -= A07;
                i11++;
                A07 = A09(i11, c2851af).A07();
            } else {
                throw new RuntimeException();
            }
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(A03));
    }

    public final C2851AF A09(int i10, C2851AF c2851af) {
        return A0A(i10, c2851af, false);
    }

    public final C2852AG A0B(int i10, C2852AG c2852ag) {
        return A0C(i10, c2852ag, false);
    }

    public final C2852AG A0C(int i10, C2852AG c2852ag, boolean z10) {
        return A0D(i10, c2852ag, z10, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i10, C2851AF c2851af, C2852AG c2852ag, int i11, boolean z10) {
        return A03(i10, c2851af, c2852ag, i11, z10) == -1;
    }
}
