package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9k */
/* loaded from: assets/audience_network.dex */
public final class C07789k {
    public int A00;
    public int A01;
    public C07899w A02;
    public boolean A03;

    public C07789k() {
    }

    public /* synthetic */ C07789k(RunnableC07759h runnableC07759h) {
        this();
    }

    public final void A03(int i10) {
        this.A01 += i10;
    }

    public final void A04(int i10) {
        if (this.A03 && this.A00 != 4) {
            AbstractC0955Ha.A03(i10 == 4);
        } else {
            this.A03 = true;
            this.A00 = i10;
        }
    }

    public final void A05(C07899w c07899w) {
        this.A02 = c07899w;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C07899w c07899w) {
        return c07899w != this.A02 || this.A01 > 0 || this.A03;
    }
}
