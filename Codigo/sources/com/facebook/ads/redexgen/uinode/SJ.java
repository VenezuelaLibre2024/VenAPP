package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class SJ implements InterfaceC1211Rd {
    public static String[] A01 = {"uB1RC", "E7rLPB8klTW5J9FjuULp7NzB4AWE19Zm", "BGfRoGqubHgomR1aknLAm7BQoVqY9Rjo", "2aqRDajB7mkFiu8JUeuEjEkcXKsGj4gd", "YPIu8FWl8tmTV", "O2dNNTCX3dr0fdBVB7HhwqWACslxe6aK", "WKmspm9NaQlidgYEldSczPSkp8W1cJlS", "CDbKVWoo3Luj5aOlcVCk0HC1kDrFWNgV"};
    public final /* synthetic */ Q7 A00;

    public SJ(Q7 q72) {
        this.A00 = q72;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1211Rd
    public final void AEA() {
        MC mc2;
        MC mc3;
        InterfaceC1087Mj interfaceC1087Mj;
        mc2 = this.A00.A02;
        if (mc2 != null) {
            Q7 q72 = this.A00;
            if (A01[3].charAt(8) == 'm') {
                throw new RuntimeException();
            }
            A01[3] = "G62o5XZ8JRlbj2NUyH9KkdSeUCUXeXTA";
            mc3 = q72.A02;
            interfaceC1087Mj = this.A00.A03;
            mc3.A43(interfaceC1087Mj.A7w());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1211Rd
    public final void AEC(C1213Rf c1213Rf) {
        MC mc2;
        MC mc3;
        InterfaceC1087Mj interfaceC1087Mj;
        MC mc4;
        InterfaceC1087Mj interfaceC1087Mj2;
        mc2 = this.A00.A02;
        if (mc2 == null) {
            return;
        }
        if (c1213Rf == null || !c1213Rf.A00()) {
            mc3 = this.A00.A02;
            interfaceC1087Mj = this.A00.A03;
            mc3.A43(interfaceC1087Mj.A7w());
            return;
        }
        mc4 = this.A00.A02;
        Q7 q72 = this.A00;
        if (A01[5].length() == 14) {
            throw new RuntimeException();
        }
        A01[1] = "MYgqySdSEunU6EGhIZ8lv2VKjJmAUpiH";
        interfaceC1087Mj2 = q72.A03;
        mc4.A43(interfaceC1087Mj2.A7x());
    }
}
