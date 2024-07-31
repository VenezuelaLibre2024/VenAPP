package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ue */
/* loaded from: assets/audience_network.dex */
public class C4083Ue implements InterfaceC3516LU {
    public final C3515LT A00;
    public final InterfaceC3516LU A01;

    public C4083Ue(InterfaceC3516LU interfaceC3516LU, int i10, int i11) {
        this.A01 = interfaceC3516LU;
        this.A00 = new C3515LT(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3516LU
    public final void AE8(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = AbstractC3518LW.A08(this.A00);
            if (A08) {
                this.A01.AE8(this.A00.A02());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3516LU
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = AbstractC3518LW.A08(this.A00);
            if (A08) {
                this.A01.AE8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
