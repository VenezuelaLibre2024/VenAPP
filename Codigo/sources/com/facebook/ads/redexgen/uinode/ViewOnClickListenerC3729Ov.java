package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ov */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3729Ov implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ AbstractC2902B4 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{92, 88, 84, 82, 80};
    }

    public ViewOnClickListenerC3729Ov(AbstractC2902B4 abstractC2902B4) {
        this.A00 = abstractC2902B4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC4029Tl ctaButton;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            ctaButton = this.A00.getCtaButton();
            ctaButton.A09(A00(0, 5, 7));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
