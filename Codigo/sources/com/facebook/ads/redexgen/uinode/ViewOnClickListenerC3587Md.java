package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Md */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3587Md implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C4054UA A00;

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
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public ViewOnClickListenerC3587Md(C4054UA c4054ua) {
        this.A00 = c4054ua;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3560MC interfaceC3560MC;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3560MC = this.A00.A06;
            interfaceC3560MC.A43(A00(0, 15, 9));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
