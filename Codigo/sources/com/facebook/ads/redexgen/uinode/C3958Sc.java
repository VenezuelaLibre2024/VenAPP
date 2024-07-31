package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Sc */
/* loaded from: assets/audience_network.dex */
public class C3958Sc implements InterfaceC3726Os {
    public final /* synthetic */ C3957Sb A00;

    public C3958Sc(C3957Sb c3957Sb) {
        this.A00 = c3957Sb;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3726Os
    public final void ADb(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3726Os
    public final void ADd(View view) {
        AbstractC4010TS abstractC4010TS = (AbstractC4010TS) view;
        abstractC4010TS.A16();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC4010TS.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
