package com.facebook.ads.redexgen.uinode;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tc */
/* loaded from: assets/audience_network.dex */
public final class C4020Tc extends AbstractC3693OL implements InterfaceC3686OE {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC4476b5 A00;
    public final InterfaceC3560MC A01;
    public final C3688OG A02;
    public final C3720Om A03;
    public final C3784Po A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{52, 48, 60, 58, 56};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C4020Tc(C3697OP c3697op, boolean z10) {
        super(c3697op, z10);
        int id2;
        int A01;
        this.A01 = c3697op.A09();
        AbstractC4476b5 A04 = c3697op.A04();
        this.A00 = A04;
        C3720Om c3720Om = new C3720Om(c3697op.A05(), c3697op.A02());
        this.A03 = c3720Om;
        c3720Om.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC3693OL.A07, AbstractC3693OL.A07, AbstractC3693OL.A07, AbstractC3693OL.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (c3697op.A0C()) {
            C3784Po c3784Po = new C3784Po(c3697op.A05());
            this.A04 = c3784Po;
            c3784Po.setPageDetails(c3697op.A04().A10());
            AbstractC3536Lo.A0G(1007, c3784Po);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(2, getCtaButton().getId());
            layoutParams2.setMargins(AbstractC3693OL.A07, AbstractC3693OL.A07 - (AbstractC3693OL.A07 / 2), AbstractC3693OL.A07, 0);
            c3784Po.setLayoutParams(layoutParams2);
            id2 = c3784Po.getId();
            A01 = c3697op.A01() - (AbstractC3693OL.A07 / 2);
        } else {
            id2 = getCtaButton().getId();
            A01 = c3697op.A01();
            this.A04 = null;
        }
        FrameLayout frameLayout = new FrameLayout(c3697op.A05());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(10);
        layoutParams3.addRule(2, id2);
        layoutParams3.setMargins(0, A01, 0, 0);
        frameLayout.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 17;
        layoutParams4.setMargins(AbstractC3693OL.A07, 0, AbstractC3693OL.A07, 0);
        frameLayout.addView(c3720Om, layoutParams4);
        addView(frameLayout);
        View view = this.A04;
        if (view != null) {
            addView(view);
        }
        addView(getCtaButton());
        getCtaButton().A0A(c3697op.A04(), c3697op.A08());
        View A02 = c3697op.A02();
        C3688OG A012 = C3688OG.A01(c3697op.A05(), A04, this);
        this.A02 = A012;
        C3687OF A09 = A012.A09(A04);
        c3697op.A05().A0F().A00(A09.A01);
        if (A02 != null && A09.A00) {
            getCtaButton().setCreativeAsCtaLoggingHelper(A012);
            A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C4020Tc.this.A13(view2);
                }
            });
        } else if (A02 != null && C3348Ih.A16(getAdContextWrapper())) {
            AbstractC3657Nl.A00(A02, C3348Ih.A17(getAdContextWrapper()), new ViewOnClickListenerC3704OW(this));
        }
        if (C3348Ih.A0y(c3697op.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c3697op.A08() != null) {
                c3697op.A08().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && C3348Ih.A0z(c3697op.A05())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final void A0v() {
        super.A0v();
        this.A02.A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final void A10(C23131G c23131g, String str, double d10, Bundle bundle) {
        super.A10(c23131g, str, d10, bundle);
        if (d10 > 0.0d) {
            int mediaHeight = (int) ((A06 - (AbstractC3693OL.A07 * 2)) / d10);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A11() {
        return false;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 75));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3686OE
    public final void AC9() {
        this.A01.A43(this.A00.A0L());
    }
}
