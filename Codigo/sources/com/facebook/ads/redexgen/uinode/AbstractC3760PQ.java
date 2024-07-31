package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.PQ */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3760PQ extends RelativeLayout {
    public boolean A00;
    public final int A01;
    public final AbstractC3871RD A02;
    public final boolean A03;
    public final boolean A04;
    public final AbstractC4476b5 A05;
    public final C4337Yn A06;
    public final InterfaceC3369J2 A07;
    public final C3528Lg A08;
    public final InterfaceC3560MC A09;
    public final InterfaceC3593Mj A0A;
    public final C3872RE A0B;

    public abstract void A0z();

    public abstract void A10();

    public abstract void A11();

    public abstract void A12(boolean z10);

    public abstract void A13(boolean z10);

    public abstract boolean A14();

    public abstract boolean A15();

    public abstract C3772Pc getFullScreenAdStyle();

    public AbstractC3760PQ(C4337Yn c4337Yn, InterfaceC3593Mj interfaceC3593Mj, InterfaceC3369J2 interfaceC3369J2, AbstractC4476b5 abstractC4476b5, int i10, boolean z10, boolean z11, InterfaceC3560MC interfaceC3560MC) {
        super(c4337Yn);
        this.A08 = new C3528Lg();
        this.A00 = false;
        C3993TB c3993tb = new C3993TB(this);
        this.A02 = c3993tb;
        this.A01 = i10;
        this.A06 = c4337Yn;
        this.A04 = z10;
        this.A03 = z11;
        this.A09 = interfaceC3560MC;
        this.A0A = interfaceC3593Mj;
        this.A05 = abstractC4476b5;
        this.A07 = interfaceC3369J2;
        C3872RE c3872re = new C3872RE(this, 1, new WeakReference(c3993tb), c4337Yn);
        this.A0B = c3872re;
        c3872re.A0W(abstractC4476b5.A0C());
        c3872re.A0X(abstractC4476b5.A0D());
    }

    public final void A03() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public AbstractC4476b5 getAdDataBundle() {
        return this.A05;
    }

    public C3872RE getAdViewabilityChecker() {
        return this.A0B;
    }

    public C3528Lg getTouchDataRecorder() {
        return this.A08;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
