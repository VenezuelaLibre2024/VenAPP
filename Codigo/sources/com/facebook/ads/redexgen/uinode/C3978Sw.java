package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.Sw */
/* loaded from: assets/audience_network.dex */
public class C3978Sw extends AbstractC3871RD {
    public final /* synthetic */ AbstractC3974Ss A00;

    public C3978Sw(AbstractC3974Ss abstractC3974Ss) {
        this.A00 = abstractC3974Ss;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3871RD
    public final void A03() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A01.A12())) {
                this.A00.A04.A9g(this.A00.A01.A12(), new C3654Ni().A03(this.A00.A0A).A02(this.A00.A06).A04(this.A00.A01.A0O()).A05());
                C23271U.A07(this.A00.A01.A0y(), this.A00.A03);
                this.A00.A03.A0E().A2k();
                AbstractC23832O.A00(this.A00.A01.A0N());
                this.A00.A08.A43(this.A00.A09.A7B());
            }
        }
    }
}
