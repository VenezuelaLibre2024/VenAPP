package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1256Sw extends RD {
    public final /* synthetic */ AbstractC1252Ss A00;

    public C1256Sw(AbstractC1252Ss abstractC1252Ss) {
        this.A00 = abstractC1252Ss;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A01.A12())) {
                this.A00.A04.A9g(this.A00.A01.A12(), new C1112Ni().A03(this.A00.A0A).A02(this.A00.A06).A04(this.A00.A01.A0O()).A05());
                C1U.A07(this.A00.A01.A0y(), this.A00.A03);
                this.A00.A03.A0E().A2k();
                C2O.A00(this.A00.A01.A0N());
                this.A00.A08.A43(this.A00.A09.A7B());
            }
        }
    }
}
