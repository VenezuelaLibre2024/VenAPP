package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Bj */
/* loaded from: assets/audience_network.dex */
public final class C2941Bj implements InterfaceC4106V1 {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C2941Bj(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3384JH
    public final void AAc() {
        AbstractC3446KK.A00(new C4102Ux(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3384JH
    public final void AAg() {
        AbstractC3446KK.A00(new C4103Uy(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3384JH
    public final void ABR(C3403Jb c3403Jb) {
        AbstractC3446KK.A00(new C4105V0(this, c3403Jb));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3384JH
    public final void ACA() {
        AbstractC3446KK.A00(new C4101Uw(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4106V1
    public final void ACF() {
        AbstractC3446KK.A00(new C4104Uz(this));
    }
}
