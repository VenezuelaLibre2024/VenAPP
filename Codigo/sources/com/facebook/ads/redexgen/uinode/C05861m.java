package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.1m */
/* loaded from: assets/audience_network.dex */
public class C05861m extends C06012b {
    @Override // com.facebook.ads.redexgen.uinode.C3S
    public final C06363k A08(View view, C06363k c06363k) {
        WindowInsets result = (WindowInsets) C06363k.A01(c06363k);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C06363k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.uinode.C3S
    public final C06363k A09(View view, C06363k c06363k) {
        WindowInsets result = (WindowInsets) C06363k.A01(c06363k);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C06363k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.uinode.C3S
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.uinode.C3S
    public final void A0F(View view, C3D c3d) {
        if (c3d == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3R
                public final /* synthetic */ C3D A00;

                public C3R(C3D c3d2) {
                    r2 = c3d2;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C06363k compatInsets = r2.AAk(view2, C06363k.A00(windowInsets));
                    return (WindowInsets) C06363k.A01(compatInsets);
                }
            });
        }
    }
}
