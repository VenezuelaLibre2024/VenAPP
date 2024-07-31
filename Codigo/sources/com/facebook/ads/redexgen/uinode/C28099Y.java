package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.9Y */
/* loaded from: assets/audience_network.dex */
public final class C28099Y extends AbstractC3974Ss {
    public AbstractC3693OL A00;
    public final ImageView A01;
    public final InterfaceC25715T A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public C28099Y(C4337Yn c4337Yn, InterfaceC3593Mj interfaceC3593Mj, InterfaceC3369J2 interfaceC3369J2, AbstractC4476b5 abstractC4476b5, C26416c c26416c, InterfaceC3560MC interfaceC3560MC) {
        super(c4337Yn, interfaceC3593Mj, interfaceC3369J2, abstractC4476b5, c26416c, interfaceC3560MC);
        this.A02 = new C3969Sn(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new AsyncTaskC4034Tq(imageView, super.A03).A05(super.A01.A0x().A0D().A00(), super.A01.A0x().A0D().A01()).A06(new C3968Sm(this)).A07(super.A01.A0x().A0D().A07());
    }

    private AbstractC3693OL A01(int i10) {
        if (this.A01.getParent() != null) {
            AbstractC3536Lo.A0J(this.A01);
        }
        return AbstractC3694OM.A00(new C3696OO(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i10).A0K(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i10) {
        AbstractC3536Lo.A0J(this.A00);
        AbstractC3693OL A01 = A01(i10);
        this.A00 = A01;
        C23221P colors = A01.getColors();
        AbstractC3693OL abstractC3693OL = this.A00;
        AbstractC3536Lo.A0M(this, colors.A07(abstractC3693OL != null && (abstractC3693OL.A11() || (this.A00 instanceof AbstractC4024Tg))));
        this.A07.setFullscreen(this.A00.A11());
        this.A07.A06(colors, ViewOnClickListenerC4029Tl.A08(super.A01));
        addView(this.A00, 0, AbstractC3974Ss.A0E);
        AbstractC3693OL abstractC3693OL2 = this.A00;
        setUpFullscreenMode(abstractC3693OL2 != null && abstractC3693OL2.A11());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3974Ss
    public final void A0Q() {
        AbstractC3536Lo.A0L(this.A00);
        AbstractC3536Lo.A0L(this.A07);
        this.A03.set(true);
        A05();
        int A03 = super.A01.A0x().A0D().A03();
        if (A03 > 0) {
            AbstractC3693OL abstractC3693OL = this.A00;
            if (abstractC3693OL != null) {
                abstractC3693OL.A0z();
            }
            A0R(A03, new C3967Sl(this));
            return;
        }
        this.A05.set(true);
        AbstractC3559MB abstractC3559MB = this.A07;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC3559MB.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3974Ss
    public final void A0S(C25735V c25735v) {
        c25735v.A0N(this.A02);
        int orientation = c25735v.A0J().getResources().getConfiguration().orientation;
        A06(orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        AbstractC3536Lo.A0H(this.A00);
        AbstractC3536Lo.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3974Ss
    public final boolean A0T() {
        AbstractC3693OL abstractC3693OL = this.A00;
        return abstractC3693OL != null && abstractC3693OL.A12(false);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACW(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACu(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        AbstractC3693OL abstractC3693OL = this.A00;
        if (abstractC3693OL != null) {
            return abstractC3693OL.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3974Ss, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0x().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3974Ss, com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void onDestroy() {
        if (C3348Ih.A1W(super.A03)) {
            super.A03.A0A().AGk(this.A01);
        }
        AbstractC3693OL abstractC3693OL = this.A00;
        if (abstractC3693OL != null) {
            abstractC3693OL.A0v();
        }
        super.onDestroy();
    }
}
