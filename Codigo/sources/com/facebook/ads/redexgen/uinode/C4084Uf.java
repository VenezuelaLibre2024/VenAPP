package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Uf */
/* loaded from: assets/audience_network.dex */
public class C4084Uf implements InterfaceC3516LU {
    public int A00;
    public final InterfaceC3516LU A01;

    public C4084Uf(InterfaceC3516LU interfaceC3516LU, int i10) {
        this.A01 = interfaceC3516LU;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3516LU
    public final void AE8(String str) {
        if (this.A00 > 0) {
            this.A01.AE8(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3516LU
    public final void flush() {
        this.A01.flush();
    }
}
