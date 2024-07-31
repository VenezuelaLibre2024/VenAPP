package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public abstract class OA {
    public static final int A00 = AbstractC1066Lo.A00();

    public static void A00(C1399Yn c1399Yn, ViewGroup viewGroup, String str) {
        new AsyncTaskC1276Tq(viewGroup, c1399Yn).A07(str);
        View view = new View(c1399Yn);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC1066Lo.A0R(view, c1399Yn);
        viewGroup.addView(view, 0);
    }
}
