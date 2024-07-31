package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.UM */
/* loaded from: assets/audience_network.dex */
public class C4066UM implements InterfaceC3494L8 {
    public static String[] A02 = {"loUGRX1wFwfO8pi8DgxPrGsPJe85sO42", "t9Fx4", "3oarn8HbUVUj6u6EULIVhfy23k9jn", "", "MOoTM", "MayuUyWiOMYLrKJeDUJbe9Zh46", "X9niQtR04keYRbnSLMpJZHmvyyUcrdIf", "5gFPyDfRsmHweMwy7A1yA2IFiPZ"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC4065UL A01;

    public C4066UM(AbstractC4065UL abstractC4065UL, int i10) {
        this.A01 = abstractC4065UL;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3494L8
    public final void ABA() {
        InterfaceC3560MC interfaceC3560MC;
        this.A01.A03 = false;
        this.A01.A0S();
        this.A01.A0E.setToolbarActionMode(this.A01.getCloseButtonStyle());
        if (this.A01.A07) {
            C3803Q7 c3803q7 = this.A01.A06;
            if (A02[2].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "KtnVXPQG8pyake3V1oVxr2XzOzf";
            strArr[3] = "";
            if (c3803q7 != null) {
                this.A01.A06.A05();
                interfaceC3560MC = this.A01.A09;
                interfaceC3560MC.A43(new C4052U8().A5s());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3494L8
    public final void ACm(float f10) {
        this.A01.A0E.setProgress(100.0f * (1.0f - (f10 / this.A00)));
    }
}
