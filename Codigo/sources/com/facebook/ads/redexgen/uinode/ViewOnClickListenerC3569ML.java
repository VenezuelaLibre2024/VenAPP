package com.facebook.ads.redexgen.uinode;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.ML */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3569ML implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ViewOnClickListenerC3569ML(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3558MA interfaceC3558MA;
        C3585Mb c3585Mb;
        InterfaceC3558MA interfaceC3558MA2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3558MA = this.A00.A02;
            if (interfaceC3558MA == null) {
                return;
            }
            c3585Mb = this.A00.A07;
            if (!c3585Mb.A04()) {
                return;
            }
            interfaceC3558MA2 = this.A00.A02;
            interfaceC3558MA2.AB6();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
