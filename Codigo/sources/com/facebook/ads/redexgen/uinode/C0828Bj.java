package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0828Bj implements V1 {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C0828Bj(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.uinode.JH
    public final void AAc() {
        KK.A00(new C1308Ux(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.JH
    public final void AAg() {
        KK.A00(new C1309Uy(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.JH
    public final void ABR(C1005Jb c1005Jb) {
        KK.A00(new V0(this, c1005Jb));
    }

    @Override // com.facebook.ads.redexgen.uinode.JH
    public final void ACA() {
        KK.A00(new C1307Uw(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.V1
    public final void ACF() {
        KK.A00(new C1310Uz(this));
    }
}
