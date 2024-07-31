package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1444a9 implements InterfaceC06062g {
    private C06072h A00(InterfaceC06052f interfaceC06052f) {
        return (C06072h) interfaceC06052f.A6J();
    }

    public final void A01(InterfaceC06052f interfaceC06052f) {
        if (!interfaceC06052f.A8G()) {
            interfaceC06052f.AGE(0, 0, 0, 0);
            return;
        }
        float A7M = A7M(interfaceC06052f);
        float A7m = A7m(interfaceC06052f);
        float elevation = C06092j.A00(A7M, A7m, interfaceC06052f.A7l());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C06092j.A01(A7M, A7m, interfaceC06052f.A7l());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC06052f.AGE(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final ColorStateList A66(InterfaceC06052f interfaceC06052f) {
        return A00(interfaceC06052f).A05();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final float A6t(InterfaceC06052f interfaceC06052f) {
        return interfaceC06052f.A6K().getElevation();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final float A7M(InterfaceC06052f interfaceC06052f) {
        return A00(interfaceC06052f).A03();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final float A7R(InterfaceC06052f interfaceC06052f) {
        return A7m(interfaceC06052f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final float A7S(InterfaceC06052f interfaceC06052f) {
        return A7m(interfaceC06052f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final float A7m(InterfaceC06052f interfaceC06052f) {
        return A00(interfaceC06052f).A04();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void A8r() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void A8s(InterfaceC06052f interfaceC06052f, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C06072h background = new C06072h(colorStateList, f10);
        interfaceC06052f.AFu(background);
        View view = interfaceC06052f.A6K();
        view.setClipToOutline(true);
        view.setElevation(f11);
        AG6(interfaceC06052f, f12);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void AB7(InterfaceC06052f interfaceC06052f) {
        AG6(interfaceC06052f, A7M(interfaceC06052f));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void ACk(InterfaceC06052f interfaceC06052f) {
        AG6(interfaceC06052f, A7M(interfaceC06052f));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void AFt(InterfaceC06052f interfaceC06052f, ColorStateList colorStateList) {
        A00(interfaceC06052f).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void AFz(InterfaceC06052f interfaceC06052f, float f10) {
        interfaceC06052f.A6K().setElevation(f10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void AG6(InterfaceC06052f interfaceC06052f, float f10) {
        A00(interfaceC06052f).A07(f10, interfaceC06052f.A8G(), interfaceC06052f.A7l());
        A01(interfaceC06052f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void AGC(InterfaceC06052f interfaceC06052f, float f10) {
        A00(interfaceC06052f).A06(f10);
    }
}
