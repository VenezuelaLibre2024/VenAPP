package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.1m */
/* loaded from: assets/audience_network.dex */
public class C23451m extends C23962b {
    @Override // com.facebook.ads.redexgen.uinode.C24483S
    public final C24653k A08(View view, C24653k c24653k) {
        WindowInsets result = (WindowInsets) C24653k.A01(c24653k);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C24653k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.uinode.C24483S
    public final C24653k A09(View view, C24653k c24653k) {
        WindowInsets result = (WindowInsets) C24653k.A01(c24653k);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C24653k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.uinode.C24483S
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.uinode.C24483S
    public final void A0F(View view, final InterfaceC24333D interfaceC24333D) {
        if (interfaceC24333D == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3R
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C24653k compatInsets = interfaceC24333D.AAk(view2, C24653k.A00(windowInsets));
                    return (WindowInsets) C24653k.A01(compatInsets);
                }
            });
        }
    }
}
