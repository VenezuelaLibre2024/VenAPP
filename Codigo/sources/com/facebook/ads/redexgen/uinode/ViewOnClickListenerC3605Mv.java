package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mv */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3605Mv implements View.OnClickListener {
    public final /* synthetic */ C4050U6 A00;

    public ViewOnClickListenerC3605Mv(C4050U6 c4050u6) {
        this.A00 = c4050u6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.ACI(EnumC23892U.A05);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
