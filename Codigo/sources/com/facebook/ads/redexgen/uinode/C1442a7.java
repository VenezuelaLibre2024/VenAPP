package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a7 */
/* loaded from: assets/audience_network.dex */
public class C1442a7 implements InterfaceC06062g {
    public final RectF A00 = new RectF();

    private C06092j A00(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new C06092j(context.getResources(), colorStateList, f10, f11, f12);
    }

    private C06092j A01(InterfaceC06052f interfaceC06052f) {
        return (C06092j) interfaceC06052f.A6J();
    }

    public final void A02(InterfaceC06052f interfaceC06052f) {
        Rect rect = new Rect();
        A01(interfaceC06052f).A0K(rect);
        interfaceC06052f.AG7((int) Math.ceil(A7S(interfaceC06052f)), (int) Math.ceil(A7R(interfaceC06052f)));
        interfaceC06052f.AGE(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final ColorStateList A66(InterfaceC06052f interfaceC06052f) {
        return A01(interfaceC06052f).A0F();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final float A6t(InterfaceC06052f interfaceC06052f) {
        return A01(interfaceC06052f).A0E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final float A7M(InterfaceC06052f interfaceC06052f) {
        return A01(interfaceC06052f).A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final float A7R(InterfaceC06052f interfaceC06052f) {
        return A01(interfaceC06052f).A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final float A7S(InterfaceC06052f interfaceC06052f) {
        return A01(interfaceC06052f).A0D();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final float A7m(InterfaceC06052f interfaceC06052f) {
        return A01(interfaceC06052f).A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public void A8r() {
        C06092j.A0G = new C1443a8(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void A8s(InterfaceC06052f interfaceC06052f, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C06092j A00 = A00(context, colorStateList, f10, f11, f12);
        A00.A0L(interfaceC06052f.A7l());
        interfaceC06052f.AFu(A00);
        A02(interfaceC06052f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void AB7(InterfaceC06052f interfaceC06052f) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void ACk(InterfaceC06052f interfaceC06052f) {
        A01(interfaceC06052f).A0L(interfaceC06052f.A7l());
        A02(interfaceC06052f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void AFt(InterfaceC06052f interfaceC06052f, ColorStateList colorStateList) {
        A01(interfaceC06052f).A0J(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void AFz(InterfaceC06052f interfaceC06052f, float f10) {
        A01(interfaceC06052f).A0I(f10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void AG6(InterfaceC06052f interfaceC06052f, float f10) {
        A01(interfaceC06052f).A0H(f10);
        A02(interfaceC06052f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06062g
    public final void AGC(InterfaceC06052f interfaceC06052f, float f10) {
        A01(interfaceC06052f).A0G(f10);
        A02(interfaceC06052f);
    }
}
