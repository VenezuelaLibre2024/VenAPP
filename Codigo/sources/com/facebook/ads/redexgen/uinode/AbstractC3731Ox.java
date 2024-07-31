package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ox */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3731Ox {
    public static AbstractC2902B4 A00(final C3697OP c3697op, int i10, final String str, final C3957Sb c3957Sb) {
        if (i10 == 1) {
            return new AbstractC2902B4(c3697op, str, c3957Sb) { // from class: com.facebook.ads.redexgen.X.3Q
                public static final int A00 = (int) (AbstractC3499LD.A02 * 20.0f);
                public static final int A01 = (int) (AbstractC3499LD.A02 * 16.0f);

                @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.uinode.AbstractC2902B4
                public final void A19(C4337Yn c4337Yn) {
                    C3681O9 titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c4337Yn);
                    AbstractC3536Lo.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i11 = A01;
                    linearLayout.setPadding(i11, i11, i11, i11);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new AbstractC2902B4(c3697op, str, c3957Sb) { // from class: com.facebook.ads.redexgen.X.3b
            public static final int A00 = (int) (AbstractC3499LD.A02 * 12.0f);

            @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC2902B4, com.facebook.ads.redexgen.uinode.AbstractC3693OL
            public final boolean A0D() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC2902B4
            public final void A19(C4337Yn c4337Yn) {
                C3681O9 titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                int i11 = A00;
                titleDescContainer.setPadding(i11, i11, i11, i11);
                AbstractC3536Lo.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}