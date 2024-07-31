package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.ai */
/* loaded from: assets/audience_network.dex */
public class C4453ai implements InterfaceC230215 {
    public static byte[] A07;
    public static String[] A08 = {"NdU3dTBV9vpPy6YybD2Qky8Xp9oiymUK", "iGXlqhzjj4re98AW13mRmUxQt0ip7heY", "i4JUsV98mtHDxTx4GI", "uX4rqc35PVKyGMlab4Ievks4AeXTKuCR", "rLO13ppjW7wMy", "YX8F9O1K3gbo5OniWABn3Un2bmHHQded", "vQnjhTu4uDmsPPd6tCmWM2PRV3nZ7tVA", "6doRqStA7fW6oocsKlayDSgQ6jqa5ScM"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ C3147FO A04;
    public final /* synthetic */ C27408Q A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{57, 46, 46, 51, 46, 67, 93, 73};
    }

    static {
        A01();
    }

    public C4453ai(C3147FO c3147fo, Runnable runnable, long j10, C27408Q c27408q) {
        this.A04 = c3147fo;
        this.A06 = runnable;
        this.A03 = j10;
        this.A05 = c27408q;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC230215
    public final void ACM(C4491bK c4491bK) {
        if (!this.A00) {
            this.A00 = true;
            this.A04.A05(this.A05.A03(EnumC27448U.A03), null);
        }
        if (this.A04.A06 != null) {
            this.A04.A06.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC230215
    public final void ACN(C4491bK c4491bK) {
        Map A01;
        if (c4491bK != this.A04.A00) {
            return;
        }
        this.A04.A0F().removeCallbacks(this.A06);
        this.A04.A01 = c4491bK;
        this.A04.A06.A0F(c4491bK);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            this.A04.A05(this.A05.A03(EnumC27448U.A05), A01);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC230215
    public final void ACO(C4491bK c4491bK) {
        if (!this.A01) {
            this.A01 = true;
            C3147FO c3147fo = this.A04;
            C27408Q c27408q = this.A05;
            EnumC27448U enumC27448U = EnumC27448U.A04;
            String[] strArr = A08;
            if (strArr[3].charAt(16) != strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "w5hMaJohNUScvyTMb6YchiksjKW7iU2S";
            strArr2[0] = "lwejxTPFHVjkcDrib15s3w6szJ9sWeR6";
            c3147fo.A05(c27408q.A03(enumC27448U), null);
        }
        this.A04.A0L();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC230215
    public final void ACQ(C4491bK c4491bK, C3403Jb c3403Jb) {
        Map A01;
        if (c4491bK != this.A04.A00) {
            return;
        }
        this.A04.A0F().removeCallbacks(this.A06);
        this.A04.A0N(c4491bK);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            A01.put(A00(0, 5, 58), String.valueOf(c3403Jb.A03().getErrorCode()));
            A01.put(A00(5, 3, 72), String.valueOf(c3403Jb.A04()));
            this.A04.A05(this.A05.A03(EnumC27448U.A05), A01);
        }
        this.A04.ABR(c3403Jb);
    }
}
