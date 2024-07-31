package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a9 */
/* loaded from: assets/audience_network.dex */
public final class C4418a9 implements InterfaceC24012g {
    private C24022h A00(InterfaceC24002f interfaceC24002f) {
        return (C24022h) interfaceC24002f.A6J();
    }

    public final void A01(InterfaceC24002f interfaceC24002f) {
        if (!interfaceC24002f.A8G()) {
            interfaceC24002f.AGE(0, 0, 0, 0);
            return;
        }
        float A7M = A7M(interfaceC24002f);
        float A7m = A7m(interfaceC24002f);
        float elevation = C24042j.A00(A7M, A7m, interfaceC24002f.A7l());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C24042j.A01(A7M, A7m, interfaceC24002f.A7l());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC24002f.AGE(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final ColorStateList A66(InterfaceC24002f interfaceC24002f) {
        return A00(interfaceC24002f).A05();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final float A6t(InterfaceC24002f interfaceC24002f) {
        return interfaceC24002f.A6K().getElevation();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final float A7M(InterfaceC24002f interfaceC24002f) {
        return A00(interfaceC24002f).A03();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final float A7R(InterfaceC24002f interfaceC24002f) {
        return A7m(interfaceC24002f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final float A7S(InterfaceC24002f interfaceC24002f) {
        return A7m(interfaceC24002f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final float A7m(InterfaceC24002f interfaceC24002f) {
        return A00(interfaceC24002f).A04();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void A8r() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void A8s(InterfaceC24002f interfaceC24002f, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C24022h background = new C24022h(colorStateList, f10);
        interfaceC24002f.AFu(background);
        View view = interfaceC24002f.A6K();
        view.setClipToOutline(true);
        view.setElevation(f11);
        AG6(interfaceC24002f, f12);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void AB7(InterfaceC24002f interfaceC24002f) {
        AG6(interfaceC24002f, A7M(interfaceC24002f));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void ACk(InterfaceC24002f interfaceC24002f) {
        AG6(interfaceC24002f, A7M(interfaceC24002f));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void AFt(InterfaceC24002f interfaceC24002f, ColorStateList colorStateList) {
        A00(interfaceC24002f).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void AFz(InterfaceC24002f interfaceC24002f, float f10) {
        interfaceC24002f.A6K().setElevation(f10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void AG6(InterfaceC24002f interfaceC24002f, float f10) {
        A00(interfaceC24002f).A07(f10, interfaceC24002f.A8G(), interfaceC24002f.A7l());
        A01(interfaceC24002f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void AGC(InterfaceC24002f interfaceC24002f, float f10) {
        A00(interfaceC24002f).A06(f10);
    }
}
