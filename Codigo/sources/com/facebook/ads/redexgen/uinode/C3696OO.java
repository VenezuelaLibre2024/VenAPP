package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.OO */
/* loaded from: assets/audience_network.dex */
public class C3696OO {
    public boolean A00;
    public View A03;
    public C4107V2 A04;
    public AbstractC3559MB A05;
    public C3451KP A06;
    public final View A07;
    public final AbstractC4476b5 A08;
    public final C4337Yn A09;
    public final InterfaceC3369J2 A0A;
    public final C3528Lg A0B;
    public final InterfaceC3560MC A0C;
    public final C3872RE A0D;
    public int A02 = 0;
    public int A01 = 1;

    public C3696OO(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, AbstractC4476b5 abstractC4476b5, View view, C3872RE c3872re, C3528Lg c3528Lg) {
        this.A09 = c4337Yn;
        this.A0A = interfaceC3369J2;
        this.A0C = interfaceC3560MC;
        this.A08 = abstractC4476b5;
        this.A07 = view;
        this.A0D = c3872re;
        this.A0B = c3528Lg;
    }

    public final C3696OO A0D(int i10) {
        this.A01 = i10;
        return this;
    }

    public final C3696OO A0E(int i10) {
        this.A02 = i10;
        return this;
    }

    public final C3696OO A0F(View view) {
        this.A03 = view;
        return this;
    }

    public final C3696OO A0G(C4107V2 c4107v2) {
        this.A04 = c4107v2;
        return this;
    }

    public final C3696OO A0H(AbstractC3559MB abstractC3559MB) {
        this.A05 = abstractC3559MB;
        return this;
    }

    public final C3696OO A0I(C3451KP c3451kp) {
        this.A06 = c3451kp;
        return this;
    }

    public final C3696OO A0J(boolean z10) {
        this.A00 = z10;
        return this;
    }

    public final C3697OP A0K() {
        return new C3697OP(this);
    }
}
