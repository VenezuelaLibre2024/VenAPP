package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.RA */
/* loaded from: assets/audience_network.dex */
public class C3868RA extends AbstractC27678s<C277893> {
    public final /* synthetic */ C27939I A00;

    public C3868RA(C27939I c27939i) {
        this.A00 = c27939i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C277893 c277893) {
        C3930SA c3930sa;
        C3930SA c3930sa2;
        int A00 = c277893.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            c3930sa = this.A00.A0B;
            int currentPositionMS2 = c3930sa.getDuration();
            if (A00 == currentPositionMS2) {
                c3930sa2 = this.A00.A0B;
                int duration = c3930sa2.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        this.A00.A0f(A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    public final Class<C277893> A01() {
        return C277893.class;
    }
}
