package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.SJ */
/* loaded from: assets/audience_network.dex */
public class C3939SJ implements InterfaceC3897Rd {
    public static String[] A01 = {"uB1RC", "E7rLPB8klTW5J9FjuULp7NzB4AWE19Zm", "BGfRoGqubHgomR1aknLAm7BQoVqY9Rjo", "2aqRDajB7mkFiu8JUeuEjEkcXKsGj4gd", "YPIu8FWl8tmTV", "O2dNNTCX3dr0fdBVB7HhwqWACslxe6aK", "WKmspm9NaQlidgYEldSczPSkp8W1cJlS", "CDbKVWoo3Luj5aOlcVCk0HC1kDrFWNgV"};
    public final /* synthetic */ C3803Q7 A00;

    public C3939SJ(C3803Q7 c3803q7) {
        this.A00 = c3803q7;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3897Rd
    public final void AEA() {
        InterfaceC3560MC interfaceC3560MC;
        InterfaceC3560MC interfaceC3560MC2;
        InterfaceC3593Mj interfaceC3593Mj;
        interfaceC3560MC = this.A00.A02;
        if (interfaceC3560MC != null) {
            C3803Q7 c3803q7 = this.A00;
            if (A01[3].charAt(8) == 'm') {
                throw new RuntimeException();
            }
            A01[3] = "G62o5XZ8JRlbj2NUyH9KkdSeUCUXeXTA";
            interfaceC3560MC2 = c3803q7.A02;
            interfaceC3593Mj = this.A00.A03;
            interfaceC3560MC2.A43(interfaceC3593Mj.A7w());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3897Rd
    public final void AEC(C3899Rf c3899Rf) {
        InterfaceC3560MC interfaceC3560MC;
        InterfaceC3560MC interfaceC3560MC2;
        InterfaceC3593Mj interfaceC3593Mj;
        InterfaceC3560MC interfaceC3560MC3;
        InterfaceC3593Mj interfaceC3593Mj2;
        interfaceC3560MC = this.A00.A02;
        if (interfaceC3560MC == null) {
            return;
        }
        if (c3899Rf == null || !c3899Rf.A00()) {
            interfaceC3560MC2 = this.A00.A02;
            interfaceC3593Mj = this.A00.A03;
            interfaceC3560MC2.A43(interfaceC3593Mj.A7w());
            return;
        }
        interfaceC3560MC3 = this.A00.A02;
        C3803Q7 c3803q7 = this.A00;
        if (A01[5].length() == 14) {
            throw new RuntimeException();
        }
        A01[1] = "MYgqySdSEunU6EGhIZ8lv2VKjJmAUpiH";
        interfaceC3593Mj2 = c3803q7.A03;
        interfaceC3560MC3.A43(interfaceC3593Mj2.A7x());
    }
}
