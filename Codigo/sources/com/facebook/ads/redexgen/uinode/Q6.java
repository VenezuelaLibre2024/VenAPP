package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Q6 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ SM A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{21, 30, 20, 19, 17, 34, 20, 35};
    }

    public Q6(SM sm) {
        this.A00 = sm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC1271Tl viewOnClickListenerC1271Tl;
        ViewOnClickListenerC1271Tl viewOnClickListenerC1271Tl2;
        if (KL.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC1271Tl = this.A00.A02;
            if (viewOnClickListenerC1271Tl == null) {
                return;
            }
            viewOnClickListenerC1271Tl2 = this.A00.A02;
            viewOnClickListenerC1271Tl2.A09(A00(0, 8, 65));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
