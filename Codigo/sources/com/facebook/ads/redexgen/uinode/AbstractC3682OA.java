package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.OA */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3682OA {
    public static final int A00 = AbstractC3536Lo.A00();

    public static void A00(C4337Yn c4337Yn, ViewGroup viewGroup, String str) {
        new AsyncTaskC4034Tq(viewGroup, c4337Yn).A07(str);
        View view = new View(c4337Yn);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC3536Lo.A0R(view, c4337Yn);
        viewGroup.addView(view, 0);
    }
}
