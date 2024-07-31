package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tf */
/* loaded from: assets/audience_network.dex */
public final class C4023Tf extends AbstractC3693OL implements InterfaceC3686OE {
    public static byte[] A03;
    public final AbstractC4476b5 A00;
    public final InterfaceC3560MC A01;
    public final C3688OG A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-22, -18, -30, -24, -26};
    }

    public C4023Tf(C3697OP c3697op, boolean z10) {
        super(c3697op, true);
        FrameLayout.LayoutParams layoutParams;
        this.A01 = c3697op.A09();
        AbstractC4476b5 A04 = c3697op.A04();
        this.A00 = A04;
        RelativeLayout relativeLayout = new RelativeLayout(c3697op.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        AbstractC3536Lo.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c3697op.A05());
        linearLayout.setOrientation(!z10 ? 1 : 0);
        linearLayout.setGravity(80);
        AbstractC3536Lo.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC3693OL.A07, 0, AbstractC3693OL.A07, AbstractC3693OL.A07);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z10 ? -2 : -1, -2);
        layoutParams4.setMargins(z10 ? AbstractC3693OL.A07 : 0, z10 ? 0 : AbstractC3693OL.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(z10 ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        C3688OG A01 = C3688OG.A01(c3697op.A05(), A04, this);
        this.A02 = A01;
        C3687OF A09 = A01.A09(A04);
        c3697op.A05().A0F().A00(A09.A01);
        if (c3697op.A0C() && !z10) {
            C3784Po c3784Po = new C3784Po(c3697op.A05());
            c3784Po.setPageDetails(c3697op.A04().A10());
            int A042 = this.A06.A04().A0w().A00().A04(true);
            c3784Po.A02(A042, A042);
            AbstractC3536Lo.A0G(1007, c3784Po);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, AbstractC3693OL.A07, 0, 0);
            linearLayout.addView(c3784Po, layoutParams6);
            if (C3348Ih.A0z(c3697op.A05())) {
                c3784Po.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0A(c3697op.A04(), c3697op.A08());
        View A02 = c3697op.A02();
        if (A02 != null && (A09.A00 || C3348Ih.A16(getAdContextWrapper()))) {
            if (z10) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c3697op.A05());
            frameLayout.addView(A02, layoutParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            if (A09.A00) {
                getCtaButton().setCreativeAsCtaLoggingHelper(A01);
                A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OJ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C4023Tf.this.A13(view);
                    }
                });
            } else {
                AbstractC3657Nl.A00(A02, C3348Ih.A17(getAdContextWrapper()), new ViewOnClickListenerC3692OK(this));
            }
        } else if (A02 != null) {
            addView(A02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (C3348Ih.A0y(c3697op.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c3697op.A08() != null) {
                c3697op.A08().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final void A0v() {
        super.A0v();
        this.A02.A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final void A10(C23131G c23131g, String str, double d10, Bundle bundle) {
        super.A10(c23131g, str, d10, bundle);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A11() {
        return true;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 88));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3686OE
    public final void AC9() {
        this.A01.A43(this.A00.A0L());
    }
}
