package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Y0 implements InterfaceC0816Ax {
    public final C1380Xu A00;
    public final C1379Xt A01;
    public final InterfaceC0794Ab[] A02;

    public Y0(InterfaceC0794Ab... interfaceC0794AbArr) {
        InterfaceC0794Ab[] interfaceC0794AbArr2 = (InterfaceC0794Ab[]) Arrays.copyOf(interfaceC0794AbArr, interfaceC0794AbArr.length + 2);
        this.A02 = interfaceC0794AbArr2;
        C1380Xu c1380Xu = new C1380Xu();
        this.A00 = c1380Xu;
        C1379Xt c1379Xt = new C1379Xt();
        this.A01 = c1379Xt;
        interfaceC0794AbArr2[interfaceC0794AbArr.length] = c1380Xu;
        interfaceC0794AbArr2[interfaceC0794AbArr.length + 1] = c1379Xt;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0816Ax
    public final C07909x A3b(C07909x c07909x) {
        this.A00.A0B(c07909x.A02);
        return new C07909x(this.A01.A01(c07909x.A01), this.A01.A00(c07909x.A00), c07909x.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0816Ax
    public final InterfaceC0794Ab[] A64() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0816Ax
    public final long A7O(long j10) {
        return this.A01.A02(j10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0816Ax
    public final long A80() {
        return this.A00.A0A();
    }
}
