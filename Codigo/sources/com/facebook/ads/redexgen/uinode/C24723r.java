package com.facebook.ads.redexgen.uinode;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.3r */
/* loaded from: assets/audience_network.dex */
public class C24723r extends C3100Eb {
    public C24723r(C4337Yn c4337Yn) {
        super(c4337Yn);
        setCarouselLayoutManager(c4337Yn);
    }

    public AbstractC3956Sa getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C3100Eb
    public C4399Zo getLayoutManager() {
        return (C4399Zo) super.getLayoutManager();
    }

    public AbstractC25354t getOnScrollListener() {
        return new C4071US(this);
    }

    private void setCarouselLayoutManager(C4337Yn c4337Yn) {
        C4399Zo c4399Zo = new C4399Zo(c4337Yn, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c4399Zo.A1R(true);
        }
        super.setLayoutManager(c4399Zo);
    }

    @Override // com.facebook.ads.redexgen.uinode.C3100Eb
    public void setLayoutManager(AbstractC25304o abstractC25304o) {
    }
}
