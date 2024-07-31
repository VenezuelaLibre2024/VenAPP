package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Q6 */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3802Q6 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C3942SM A00;

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

    public ViewOnClickListenerC3802Q6(C3942SM c3942sm) {
        this.A00 = c3942sm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl;
        ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC4029Tl = this.A00.A02;
            if (viewOnClickListenerC4029Tl == null) {
                return;
            }
            viewOnClickListenerC4029Tl2 = this.A00.A02;
            viewOnClickListenerC4029Tl2.A09(A00(0, 8, 65));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
