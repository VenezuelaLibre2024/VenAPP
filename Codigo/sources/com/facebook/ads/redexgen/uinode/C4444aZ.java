package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import com.facebook.ads.AdSettings;

/* renamed from: com.facebook.ads.redexgen.X.aZ */
/* loaded from: assets/audience_network.dex */
public final class C4444aZ implements InterfaceC27488Z {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC27488Z
    public final String A6E() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC27488Z
    public final String A6S() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC27488Z
    public final C27077t A6k(C26937f c26937f) {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC27488Z
    public final String A7Q() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC27488Z
    public final String A87() {
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            return AdSettings.getTestAdType().getAdTypeString();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC27488Z
    public final boolean A99() {
        return AdSettings.isMixedAudience();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC27488Z
    public final boolean A9E() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC27488Z
    public final Boolean A9J() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC27488Z
    public final boolean isTestMode(Context context) {
        return AdSettings.isTestMode(context);
    }
}
