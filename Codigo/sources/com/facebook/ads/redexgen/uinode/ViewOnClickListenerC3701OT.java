package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.OT */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3701OT implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C2916BI A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{42, 29, 24, 25, 35};
    }

    public ViewOnClickListenerC3701OT(C2916BI c2916bi) {
        this.A00 = c2916bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 72));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
