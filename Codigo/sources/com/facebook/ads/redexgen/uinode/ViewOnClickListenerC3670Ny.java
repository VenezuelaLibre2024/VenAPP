package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ny */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3670Ny implements View.OnClickListener {
    public final /* synthetic */ C3673O1 A00;

    public ViewOnClickListenerC3670Ny(C3673O1 c3673o1) {
        this.A00 = c3673o1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3672O0 interfaceC3672O0;
        AbstractC3559MB abstractC3559MB;
        View[] viewArr;
        C3930SA c3930sa;
        C3930SA c3930sa2;
        C3930SA c3930sa3;
        AbstractC3559MB abstractC3559MB2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3672O0 = this.A00.A04;
            interfaceC3672O0.ACB();
            abstractC3559MB = this.A00.A00;
            if (abstractC3559MB != null) {
                abstractC3559MB2 = this.A00.A00;
                AbstractC3536Lo.A0L(abstractC3559MB2);
            }
            viewArr = this.A00.A06;
            for (View view2 : viewArr) {
                AbstractC3536Lo.A0N(view2, 0);
            }
            AbstractC3536Lo.A0J(this.A00);
            c3930sa = this.A00.A05;
            if (c3930sa == null) {
                return;
            }
            c3930sa2 = this.A00.A05;
            AbstractC3536Lo.A0N(c3930sa2, 0);
            c3930sa3 = this.A00.A05;
            c3930sa3.A0b(EnumC3818QM.A02, 14);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
