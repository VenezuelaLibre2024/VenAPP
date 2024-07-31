package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.TI */
/* loaded from: assets/audience_network.dex */
public final class C4000TI extends FrameLayout implements InterfaceC3561MD {
    public String A00;
    public final InterfaceC3560MC A01;
    public final C3745PB A02;

    public C4000TI(C4337Yn c4337Yn, InterfaceC3560MC interfaceC3560MC, C3745PB c3745pb, String str) {
        super(c4337Yn);
        this.A02 = c3745pb;
        this.A01 = interfaceC3560MC;
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void A9Q(Intent intent, Bundle bundle, C25735V c25735v) {
        C3745PB.A0B().incrementAndGet();
        this.A02.A0V();
        AbstractC3536Lo.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A3U(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACW(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACu(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().ABd();
        }
        C3745PB.A0B().decrementAndGet();
    }

    public void setListener(InterfaceC3560MC interfaceC3560MC) {
    }
}
