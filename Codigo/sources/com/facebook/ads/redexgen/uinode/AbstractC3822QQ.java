package com.facebook.ads.redexgen.uinode;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.QQ */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3822QQ extends RelativeLayout implements InterfaceC3819QN {
    public C3930SA A00;

    public AbstractC3822QQ(C4337Yn c4337Yn) {
        super(c4337Yn);
    }

    public AbstractC3822QQ(C4337Yn c4337Yn, AttributeSet attributeSet, int i10) {
        super(c4337Yn, attributeSet, i10);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3819QN
    public final void A9R(C3930SA c3930sa) {
        this.A00 = c3930sa;
        A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3819QN
    public final void AGl(C3930SA c3930sa) {
        A08();
        this.A00 = null;
    }

    public C3930SA getVideoView() {
        return this.A00;
    }
}
