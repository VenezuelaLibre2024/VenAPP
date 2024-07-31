package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ok */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3718Ok implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C4011TT A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{71, 66, 66, 67, 82, 71, 79, 74, 85};
    }

    public ViewOnClickListenerC3718Ok(C4011TT c4011tt) {
        this.A00 = c4011tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        C3722Oo c3722Oo;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0O;
            if (z10) {
                return;
            }
            c3722Oo = this.A00.A0M;
            c3722Oo.A02(A00(0, 9, 31));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
