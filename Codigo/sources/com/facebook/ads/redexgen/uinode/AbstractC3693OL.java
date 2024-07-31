package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.OL */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3693OL extends RelativeLayout {
    public static final int A07 = (int) (AbstractC3499LD.A02 * 16.0f);
    public static final int A08 = (int) (AbstractC3499LD.A02 * 28.0f);
    public C23221P A00;
    public boolean A01;
    public final C4337Yn A02;
    public final InterfaceC3369J2 A03;
    public final ViewOnClickListenerC4029Tl A04;
    public final C3681O9 A05;
    public final C3697OP A06;

    public abstract boolean A11();

    public AbstractC3693OL(C3697OP c3697op, boolean z10) {
        super(c3697op.A05());
        C23221P A00;
        this.A06 = c3697op;
        C4337Yn A05 = c3697op.A05();
        this.A02 = A05;
        this.A03 = c3697op.A06();
        if (c3697op.A00() == 1) {
            A00 = c3697op.A04().A0w().A01();
        } else {
            A00 = c3697op.A04().A0w().A00();
        }
        this.A00 = A00;
        this.A01 = z10;
        ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl = new ViewOnClickListenerC4029Tl(c3697op.A05(), c3697op.A04(), this.A00, c3697op.A06(), c3697op.A09(), c3697op.A0B(), c3697op.A07());
        this.A04 = viewOnClickListenerC4029Tl;
        viewOnClickListenerC4029Tl.setRoundedCornersEnabled(A00());
        viewOnClickListenerC4029Tl.setViewShowsOverMedia(A0D());
        AbstractC3536Lo.A0G(AdError.NO_FILL_ERROR_CODE, viewOnClickListenerC4029Tl);
        C3681O9 c3681o9 = new C3681O9(A05, this.A00, this.A01, A01(), A02());
        this.A05 = c3681o9;
        AbstractC3536Lo.A0K(c3681o9);
    }

    public boolean A00() {
        return true;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public void A0B(C27929H c27929h) {
    }

    public void A0C(C277893 c277893) {
    }

    public boolean A0D() {
        return true;
    }

    public void A0v() {
    }

    public void A0w() {
    }

    public void A0x() {
    }

    public void A0y() {
    }

    public void A0z() {
    }

    public void A10(C23131G c23131g, String str, double d10, Bundle bundle) {
        this.A05.A03(c23131g.A0E().A05(), c23131g.A0E().A01(), null, false, !A11() && d10 > 0.0d && d10 < 1.0d);
        this.A04.setCta(c23131g.A0F(), str, new HashMap());
    }

    public boolean A12(boolean z10) {
        return false;
    }

    public C4337Yn getAdContextWrapper() {
        return this.A02;
    }

    public InterfaceC3369J2 getAdEventManager() {
        return this.A03;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C23221P getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC4029Tl getCtaButton() {
        return this.A04;
    }

    public C3681O9 getTitleDescContainer() {
        return this.A05;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C23221P A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A06.A04().A0w().A01();
        } else {
            A00 = this.A06.A04().A0w().A00();
        }
        this.A00 = A00;
        this.A04.setViewShowsOverMedia(A0D());
        this.A04.setUpButtonColors(this.A00);
        this.A05.A02(this.A00, this.A01);
    }
}
