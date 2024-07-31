package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.OM */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3694OM {
    public static byte[] A00;
    public static String[] A01 = {"zHQaRI8Z04iZfuq60cOZ3MtOUQtnyLXk", "Py81lTfXTPvOohagzwztlFMwKgIeaa04", "ZBx", "ff4Sljy7OS0rEQC0yVPpTgSrr8dBXGgO", "WJ7E7dTZMlxiqC9ofw7stZL7dYzOgEyn", "lEp0yqe8iFuZgqtiF5MEL7dQIxoaDf7o", "1LQBU", "K3MGC9Pem9CSlPJADsZARPOkTW1wXgVW"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{8, 97, 91, 8, 97, 70, 91, 92, 73, 70, 92, 8, 79, 73, 69, 77, 91, 8, 73, 68, 68, 71, 95, 77, 76, 18, 8, 64, 41, 19, 64, 41, 14, 19, 20, 1, 14, 20, 64, 7, 1, 13, 5, 19, 90, 64, 77, 10, 2, 2, 10, 1, 8, 77, 11, 12, 1, 1, 15, 12, 14, 6, 77, 24, 31, 1, 77, 12, 27, 12, 4, 1, 12, 15, 1, 8, 87, 77, 119, 62, 36, 4, 35, 56, 37, 50, 109, 119, 124, 108, 58, 37, 40, 41, 35, 108, 57, 62, 32, 108, 37, 63, 108, 34, 57, 32, 32, 118, 108, 94, 82, 80, 19, 91, 92, 94, 88, 95, 82, 82, 86, 19, 86, 92, 73, 92, 83, 92, 74, 77, 86, 75, 92, 120, Byte.MAX_VALUE, 100, 121, 110, 84, 126, 121, 103, 84, 124, 110, 105, 84, 109, 106, 103, 103, 105, 106, 104, 96, 69, 90, 87, 86, 92, 108, 70, 65, 95};
    }

    static {
        A02();
    }

    public static AbstractC3693OL A00(C3697OP c3697op, Bundle bundle, boolean z10) {
        AbstractC3693OL c4020Tc;
        c3697op.A05().A0F().A00(false);
        C23131G A0x = c3697op.A04().A0x();
        double A002 = AbstractC3690OI.A00(A0x);
        boolean A0N = c3697op.A04().A0x().A0N();
        boolean A06 = AbstractC3690OI.A06(c3697op.A00(), c3697op.A01(), A002);
        AbstractC22790h A003 = C22800i.A00(c3697op.A05(), c3697op.A06(), A01(0, 0, 67), AbstractC3484Ky.A00(c3697op.A04().A0x().A0F().A05()), new HashMap(), c3697op.A04().A0y());
        boolean z11 = !TextUtils.isEmpty(A0x.A0D().A08());
        if (C3348Ih.A1W(c3697op.A05())) {
            c3697op.A05().A0A().AGv(c3697op.A02(), c3697op.A04().A12(), z11);
        }
        boolean A03 = A03(c3697op, z11);
        if ((A0N && (A003 instanceof C3163Fe)) || A03) {
            c4020Tc = new C4011TT(c3697op, A03);
        } else if (z11) {
            c4020Tc = new C2916BI(c3697op);
        } else if (!z11 && C3348Ih.A2A(c3697op.A05())) {
            c4020Tc = new C2917BJ(c3697op, A06);
        } else if (!A06) {
            c4020Tc = new C4020Tc(c3697op, AbstractC3690OI.A04(A002));
        } else {
            int A004 = c3697op.A00();
            if (A01[2].length() != 3) {
                throw new RuntimeException();
            }
            A01[6] = "JelR9";
            c4020Tc = new C4023Tf(c3697op, A004 == 2);
        }
        if (z10) {
            c4020Tc.A10(A0x, c3697op.A04().A12(), A002, bundle);
        }
        return c4020Tc;
    }

    public static boolean A03(C3697OP c3697op, boolean z10) {
        boolean z11 = false;
        if (!c3697op.A04().A0p() || !z10) {
            return false;
        }
        Uri A002 = AbstractC3484Ky.A00(c3697op.A04().A0x().A0F().A05());
        String authority = A002.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            c3697op.A05().A0E().AAF();
            return false;
        }
        boolean isInstantGames = authority.equals(A01(RecognitionOptions.ITF, 5, 126));
        boolean isStoreUrl = A002.getQueryParameter(A01(155, 9, 116)) == null;
        String queryParameter = A002.getQueryParameter(A01(133, 22, 76));
        boolean isGoogleFallBackUrlAvailable = !TextUtils.isEmpty(queryParameter) && queryParameter.contains(c3697op.A04().A0Q());
        boolean equals = c3697op.A05().getPackageName().equals(A01(109, 19, 122));
        boolean isVideoUrlNull = c3697op.A04().A0q();
        if (isInstantGames && isStoreUrl && isGoogleFallBackUrlAvailable && (!equals || isVideoUrlNull)) {
            z11 = true;
        }
        if (!z11) {
            int i10 = Build.VERSION.SDK_INT;
            if (A01[2].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "ixVJz4LKAvkUhWpfUwnrm68OXA5reQsq";
            strArr[1] = "n4hyezKFC81nHjNiPwRfUtRp762j8aVq";
            if (i10 >= 24) {
                c3697op.A05().A0E().AAE(A01(78, 11, 16) + isInstantGames + A01(89, 20, 11) + isStoreUrl + A01(46, 32, 42) + isGoogleFallBackUrlAvailable + A01(27, 19, 39) + equals + A01(0, 27, 111) + isVideoUrlNull);
            }
        }
        return z11;
    }
}
