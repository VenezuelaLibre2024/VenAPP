package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Y0 */
/* loaded from: assets/audience_network.dex */
public class C4288Y0 implements InterfaceC2895Ax {
    public final C4282Xu A00;
    public final C4281Xt A01;
    public final InterfaceC2873Ab[] A02;

    public C4288Y0(InterfaceC2873Ab... interfaceC2873AbArr) {
        InterfaceC2873Ab[] interfaceC2873AbArr2 = (InterfaceC2873Ab[]) Arrays.copyOf(interfaceC2873AbArr, interfaceC2873AbArr.length + 2);
        this.A02 = interfaceC2873AbArr2;
        C4282Xu c4282Xu = new C4282Xu();
        this.A00 = c4282Xu;
        C4281Xt c4281Xt = new C4281Xt();
        this.A01 = c4281Xt;
        interfaceC2873AbArr2[interfaceC2873AbArr.length] = c4282Xu;
        interfaceC2873AbArr2[interfaceC2873AbArr.length + 1] = c4281Xt;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2895Ax
    public final C28339x A3b(C28339x c28339x) {
        this.A00.A0B(c28339x.A02);
        return new C28339x(this.A01.A01(c28339x.A01), this.A01.A00(c28339x.A00), c28339x.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2895Ax
    public final InterfaceC2873Ab[] A64() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2895Ax
    public final long A7O(long j10) {
        return this.A01.A02(j10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2895Ax
    public final long A80() {
        return this.A00.A0A();
    }
}
