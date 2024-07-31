package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.5U */
/* loaded from: assets/audience_network.dex */
public class ViewOnLongClickListenerC25725U implements View.OnLongClickListener {
    public final /* synthetic */ C25735V A00;

    public ViewOnLongClickListenerC25725U(C25735V c25735v) {
        this.A00 = c25735v;
    }

    public /* synthetic */ ViewOnLongClickListenerC25725U(C25735V c25735v, C25695R c25695r) {
        this(c25735v);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (C25735V.A03(this.A00) != null && C25735V.A01(this.A00) != null) {
            C25735V.A03(this.A00).setBounds(0, 0, C25735V.A01(this.A00).getWidth(), C25735V.A01(this.A00).getHeight());
            C25735V.A03(this.A00).A0D(!C25735V.A03(this.A00).A0E());
        }
        return true;
    }
}
