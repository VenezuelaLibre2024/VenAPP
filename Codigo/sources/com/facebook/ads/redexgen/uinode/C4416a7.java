package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a7 */
/* loaded from: assets/audience_network.dex */
public class C4416a7 implements InterfaceC24012g {
    public final RectF A00 = new RectF();

    private C24042j A00(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new C24042j(context.getResources(), colorStateList, f10, f11, f12);
    }

    private C24042j A01(InterfaceC24002f interfaceC24002f) {
        return (C24042j) interfaceC24002f.A6J();
    }

    public final void A02(InterfaceC24002f interfaceC24002f) {
        Rect rect = new Rect();
        A01(interfaceC24002f).A0K(rect);
        interfaceC24002f.AG7((int) Math.ceil(A7S(interfaceC24002f)), (int) Math.ceil(A7R(interfaceC24002f)));
        interfaceC24002f.AGE(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final ColorStateList A66(InterfaceC24002f interfaceC24002f) {
        return A01(interfaceC24002f).A0F();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final float A6t(InterfaceC24002f interfaceC24002f) {
        return A01(interfaceC24002f).A0E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final float A7M(InterfaceC24002f interfaceC24002f) {
        return A01(interfaceC24002f).A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final float A7R(InterfaceC24002f interfaceC24002f) {
        return A01(interfaceC24002f).A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final float A7S(InterfaceC24002f interfaceC24002f) {
        return A01(interfaceC24002f).A0D();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final float A7m(InterfaceC24002f interfaceC24002f) {
        return A01(interfaceC24002f).A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public void A8r() {
        C24042j.A0G = new C4417a8(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void A8s(InterfaceC24002f interfaceC24002f, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C24042j A00 = A00(context, colorStateList, f10, f11, f12);
        A00.A0L(interfaceC24002f.A7l());
        interfaceC24002f.AFu(A00);
        A02(interfaceC24002f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void AB7(InterfaceC24002f interfaceC24002f) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void ACk(InterfaceC24002f interfaceC24002f) {
        A01(interfaceC24002f).A0L(interfaceC24002f.A7l());
        A02(interfaceC24002f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void AFt(InterfaceC24002f interfaceC24002f, ColorStateList colorStateList) {
        A01(interfaceC24002f).A0J(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void AFz(InterfaceC24002f interfaceC24002f, float f10) {
        A01(interfaceC24002f).A0I(f10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void AG6(InterfaceC24002f interfaceC24002f, float f10) {
        A01(interfaceC24002f).A0H(f10);
        A02(interfaceC24002f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24012g
    public final void AGC(InterfaceC24002f interfaceC24002f, float f10) {
        A01(interfaceC24002f).A0G(f10);
        A02(interfaceC24002f);
    }
}
