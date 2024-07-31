package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.MS */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3576MS implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C4057UD A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{43, 41, 27, 40, 25, 34, 31, 25, 33};
    }

    public ViewOnClickListenerC3576MS(C4057UD c4057ud) {
        this.A00 = c4057ud;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0U(false, A00(0, 9, 121));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
