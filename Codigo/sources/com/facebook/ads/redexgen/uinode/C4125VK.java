package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.VK */
/* loaded from: assets/audience_network.dex */
public class C4125VK implements InterfaceC3814QI {
    public static String[] A01 = {"T9VzL8fHxpfySiwwlXedeY7mX", "guyVlBlOMcVDAIfN1wPFopCO0r0Zk0gq", "ttKJ4peW2WPtu1OROjgTykJGR", "A5J8ePX4fIk14ZpUSfaCkLGHXqqMAYt6", "kQp8myZeu", "7L0NbJj9RoUIRUZ", "UhNplE17b8XX", "zMftdbZDucx4tcPG97oOAYZ8vQU5TBbw"};
    public final /* synthetic */ C4119VE A00;

    public C4125VK(C4119VE c4119ve) {
        this.A00 = c4119ve;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3814QI
    public final void ADZ() {
        AtomicBoolean atomicBoolean;
        InterfaceC3387JK interfaceC3387JK;
        InterfaceC3387JK interfaceC3387JK2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        interfaceC3387JK = this.A00.A02;
        if (interfaceC3387JK != null) {
            interfaceC3387JK2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            boolean z10 = atomicBoolean2.get();
            if (A01[1].charAt(3) == 'h') {
                throw new RuntimeException();
            }
            A01[3] = "0cRb1Hjpfivo5OpVdykyl3dtou8RqpBl";
            interfaceC3387JK2.ACX(z10);
        }
    }
}
