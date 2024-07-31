package com.facebook.ads.redexgen.uinode;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.BJ */
/* loaded from: assets/audience_network.dex */
public final class C2917BJ extends AbstractC4024Tg {
    public static byte[] A02;
    public static final int A03;
    public final View A00;
    public final boolean A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-24, -20, -32, -26, -28};
    }

    static {
        A01();
        A03 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C2917BJ(C3697OP c3697op, boolean z10) {
        super(c3697op, true);
        this.A01 = z10;
        View A022 = c3697op.A02();
        this.A00 = A022;
        A14();
        if (z10) {
            addView(c3697op.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c3697op.A05());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.setMargins(AbstractC3693OL.A07, 0, AbstractC3693OL.A07, 0);
            frameLayout.addView(A022, layoutParams2);
            addView(frameLayout);
        }
        C3687OF A09 = this.A07.A09(getAdDataBundle());
        c3697op.A05().A0F().A00(A09.A01);
        if (A022 != null) {
            if (A09.A00) {
                getCtaButton().setCreativeAsCtaLoggingHelper(this.A07);
                A022.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OQ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2917BJ.this.A15(view);
                    }
                });
            } else if (C3348Ih.A16(getAdContextWrapper())) {
                AbstractC3657Nl.A00(A022, C3348Ih.A17(getAdContextWrapper()), new ViewOnClickListenerC3699OR(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A02() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A0D() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4024Tg, com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final void A10(C23131G c23131g, String str, double d10, Bundle bundle) {
        super.A10(c23131g, str, d10, bundle);
        if (!this.A01 && d10 > 0.0d) {
            int mediaHeight = (int) ((A03 - (AbstractC3693OL.A07 * 2)) / d10);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i10 = AbstractC3693OL.A07;
            int mediaHeight2 = AbstractC3693OL.A07;
            layoutParams.setMargins(i10, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A11() {
        return this.A01;
    }

    public final /* synthetic */ void A15(View view) {
        getCtaButton().A09(A00(0, 5, 26));
    }
}
