package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.SQ */
/* loaded from: assets/audience_network.dex */
public class C3946SQ implements InterfaceC25715T {
    public final /* synthetic */ C25735V A00;
    public final /* synthetic */ C28009P A01;

    public C3946SQ(C28009P c28009p, C25735V c25735v) {
        this.A01 = c28009p;
        this.A00 = c25735v;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC25715T
    public final boolean A8u() {
        boolean A0Y;
        boolean A0Z;
        if (!this.A01.A0X()) {
            A0Y = this.A01.A0Y();
            if (A0Y) {
                return true;
            }
            A0Z = this.A01.A0Z();
            return A0Z;
        }
        this.A01.A0W(this.A00);
        return true;
    }
}
