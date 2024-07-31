package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Qd */
/* loaded from: assets/audience_network.dex */
public class C3835Qd extends AbstractC27678s<C27929H> {
    public final /* synthetic */ C27939I A00;

    public C3835Qd(C27939I c27939i) {
        this.A00 = c27939i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C27929H c27929h) {
        int A00 = c27929h.A00();
        int duration = c27929h.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && A00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = A00 + 500;
        if (duration < currentPosition3) {
            if (duration == 0) {
                C27939I c27939i = this.A00;
                int currentPosition4 = c27939i.A00;
                c27939i.A0e(currentPosition4);
                return;
            }
            this.A00.A0e(duration);
            return;
        }
        this.A00.A0e(A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    public final Class<C27929H> A01() {
        return C27929H.class;
    }
}
