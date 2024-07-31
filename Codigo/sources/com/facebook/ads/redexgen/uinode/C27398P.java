package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.8P */
/* loaded from: assets/audience_network.dex */
public class C27398P extends AbstractC3679O7 {
    public final /* synthetic */ C3519LX A00;

    public C27398P(C3519LX c3519lx) {
        this.A00 = c3519lx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3680O8 c3680o8) {
        if (C3519LX.A07(this.A00) && C3519LX.A08(this.A00)) {
            C3519LX.A0B(this.A00, false);
            if (C3519LX.A0A(this.A00, EnumC3840Qi.A04) || C3519LX.A09(this.A00)) {
                C3519LX.A0C(this.A00, false);
                C3519LX.A01(this.A00).postDelayed(new C3534Lm(this), C3519LX.A00(this.A00));
            } else {
                if (!C3519LX.A0A(this.A00, EnumC3840Qi.A03)) {
                    return;
                }
                C3519LX.A04(this.A00);
                C3519LX.A05(this.A00, true, true);
            }
        }
    }
}
