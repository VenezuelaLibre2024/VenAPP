package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ui */
/* loaded from: assets/audience_network.dex */
public class C4087Ui implements InterfaceC3516LU {
    public int A00;
    public final InterfaceC3516LU A01;
    public final InterfaceC3516LU A02;

    public C4087Ui(InterfaceC3516LU interfaceC3516LU, int i10, InterfaceC3516LU interfaceC3516LU2) {
        this.A01 = interfaceC3516LU;
        this.A00 = i10;
        this.A02 = interfaceC3516LU2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3516LU
    public final void AE8(String str) {
        if (this.A00 > 0) {
            this.A01.AE8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AE8(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3516LU
    public final void flush() {
        this.A02.flush();
    }
}
