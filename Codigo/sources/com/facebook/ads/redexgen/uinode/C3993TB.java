package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.TB */
/* loaded from: assets/audience_network.dex */
public class C3993TB extends AbstractC3871RD {
    public static byte[] A01;
    public final /* synthetic */ AbstractC3760PQ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 81, 88, 80, 87, 92, 93, 102, 88, 93, 102, 80, 87, 93, 92, 65};
    }

    public C3993TB(AbstractC3760PQ abstractC3760PQ) {
        this.A00 = abstractC3760PQ;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3871RD
    public final void A03() {
        int i10;
        boolean z10;
        boolean z11;
        if (!this.A00.A08.A07()) {
            this.A00.A08.A05();
            if (!TextUtils.isEmpty(this.A00.A05.A12())) {
                Map<String, String> A05 = new C3654Ni().A03(this.A00.A0B).A02(this.A00.A08).A04(this.A00.A05.A0O()).A05();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 11));
                i10 = this.A00.A01;
                A05.put(A00(0, 16, 10), append.append(i10).toString());
                this.A00.A07.A9g(this.A00.A05.A12(), A05);
                C23271U.A07(this.A00.A05.A0y(), this.A00.A06);
                this.A00.A06.A0E().A2k();
                z10 = this.A00.A03;
                if (!z10) {
                    AbstractC23832O.A00(this.A00.A05.A0N());
                }
                z11 = this.A00.A04;
                if (!z11) {
                    this.A00.A09.A43(this.A00.A0A.A7B());
                }
            }
        }
    }
}
