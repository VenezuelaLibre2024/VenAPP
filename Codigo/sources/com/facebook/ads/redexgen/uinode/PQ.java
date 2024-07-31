package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class PQ extends RelativeLayout {
    public boolean A00;
    public final int A01;
    public final RD A02;
    public final boolean A03;
    public final boolean A04;
    public final AbstractC1502b5 A05;
    public final C1399Yn A06;
    public final J2 A07;
    public final C1058Lg A08;
    public final MC A09;
    public final InterfaceC1087Mj A0A;
    public final RE A0B;

    public abstract void A0z();

    public abstract void A10();

    public abstract void A11();

    public abstract void A12(boolean z10);

    public abstract void A13(boolean z10);

    public abstract boolean A14();

    public abstract boolean A15();

    public abstract C1158Pc getFullScreenAdStyle();

    public PQ(C1399Yn c1399Yn, InterfaceC1087Mj interfaceC1087Mj, J2 j22, AbstractC1502b5 abstractC1502b5, int i10, boolean z10, boolean z11, MC mc2) {
        super(c1399Yn);
        this.A08 = new C1058Lg();
        this.A00 = false;
        TB tb2 = new TB(this);
        this.A02 = tb2;
        this.A01 = i10;
        this.A06 = c1399Yn;
        this.A04 = z10;
        this.A03 = z11;
        this.A09 = mc2;
        this.A0A = interfaceC1087Mj;
        this.A05 = abstractC1502b5;
        this.A07 = j22;
        RE re2 = new RE(this, 1, new WeakReference(tb2), c1399Yn);
        this.A0B = re2;
        re2.A0W(abstractC1502b5.A0C());
        re2.A0X(abstractC1502b5.A0D());
    }

    public final void A03() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public AbstractC1502b5 getAdDataBundle() {
        return this.A05;
    }

    public RE getAdViewabilityChecker() {
        return this.A0B;
    }

    public C1058Lg getTouchDataRecorder() {
        return this.A08;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
