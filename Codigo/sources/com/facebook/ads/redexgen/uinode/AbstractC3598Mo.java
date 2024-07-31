package com.facebook.ads.redexgen.uinode;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Mo */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3598Mo extends FrameLayout {
    public int A00;
    public EnumC23892U A01;
    public C23902V A02;
    public C23912W A03;
    public final C23872S A04;
    public final C4337Yn A05;
    public final InterfaceC3369J2 A06;
    public final InterfaceC3560MC A07;
    public final InterfaceC3561MD A08;
    public final String A09;
    public final C23331a A0A;
    public final InterfaceC3600Mq A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C23912W c23912w, EnumC23892U enumC23892U);

    public abstract void A0O(C23912W c23912w, EnumC23892U enumC23892U);

    public abstract boolean A0P();

    public AbstractC3598Mo(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, String str) {
        this(c4337Yn, interfaceC3369J2, str, null, null, null);
    }

    public AbstractC3598Mo(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, String str, C23331a c23331a, InterfaceC3561MD interfaceC3561MD, InterfaceC3560MC interfaceC3560MC) {
        super(c4337Yn);
        this.A00 = 0;
        this.A01 = EnumC23892U.A04;
        this.A03 = null;
        this.A0B = new C4051U7(this);
        this.A05 = c4337Yn;
        this.A06 = interfaceC3369J2;
        this.A08 = interfaceC3561MD;
        this.A07 = interfaceC3560MC;
        this.A09 = str;
        this.A0A = c23331a;
        this.A04 = AbstractC23882T.A00(c4337Yn.A01());
    }

    public static /* synthetic */ int A00(AbstractC3598Mo abstractC3598Mo) {
        int i10 = abstractC3598Mo.A00;
        abstractC3598Mo.A00 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A01(AbstractC3598Mo abstractC3598Mo) {
        int i10 = abstractC3598Mo.A00;
        abstractC3598Mo.A00 = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A9T(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C23912W c23912w) {
        this.A02.A08(this.A01);
        A0N(c23912w, this.A01);
        C22930w.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C23912W c23912w) {
        this.A03 = c23912w;
        this.A02.A09(this.A01, this.A00);
        A0O(c23912w, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C23902V(new C3377JA(this.A09, this.A06));
        InterfaceC3561MD interfaceC3561MD = this.A08;
        if (interfaceC3561MD != null) {
            interfaceC3561MD.ACW(true);
        }
        A0C();
    }
}
