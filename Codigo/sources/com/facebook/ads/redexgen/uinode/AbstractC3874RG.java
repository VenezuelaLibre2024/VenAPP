package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.RG */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3874RG {
    public static boolean A00(View view) {
        return view.getBackground() == null || (Build.VERSION.SDK_INT >= 19 && view.getBackground().getAlpha() <= 0);
    }
}
