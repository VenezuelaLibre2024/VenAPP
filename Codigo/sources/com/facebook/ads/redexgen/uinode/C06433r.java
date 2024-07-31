package com.facebook.ads.redexgen.uinode;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.3r */
/* loaded from: assets/audience_network.dex */
public class C06433r extends C0882Eb {
    public C06433r(C1399Yn c1399Yn) {
        super(c1399Yn);
        setCarouselLayoutManager(c1399Yn);
    }

    public AbstractC1234Sa getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C0882Eb
    public C1425Zo getLayoutManager() {
        return (C1425Zo) super.getLayoutManager();
    }

    public AbstractC06704t getOnScrollListener() {
        return new US(this);
    }

    private void setCarouselLayoutManager(C1399Yn c1399Yn) {
        C1425Zo c1425Zo = new C1425Zo(c1399Yn, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1425Zo.A1R(true);
        }
        super.setLayoutManager(c1425Zo);
    }

    @Override // com.facebook.ads.redexgen.uinode.C0882Eb
    public void setLayoutManager(AbstractC06654o abstractC06654o) {
    }
}
