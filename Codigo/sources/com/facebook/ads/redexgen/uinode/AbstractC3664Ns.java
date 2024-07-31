package com.facebook.ads.redexgen.uinode;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ns */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3664Ns {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3n] */
    public static C24683n A00(final C3697OP c3697op, final C4107V2 c4107v2, final String str, final C2924BQ c2924bq) {
        final boolean z10 = true;
        return new C2918BK(c3697op, c4107v2, z10, str, c2924bq) { // from class: com.facebook.ads.redexgen.X.3n
            public ViewOnClickListenerC4029Tl A00;
            public C3785Pp A01;
            public final InterfaceC3369J2 A02 = this.A0I.A05().A01().A09();
            public final C4107V2 A03;
            public final C2924BQ A04;
            public final String A05;
            public static final int A07 = (int) (AbstractC3499LD.A02 * (-4.0f));
            public static final int A06 = (int) (AbstractC3499LD.A02 * 6.0f);

            {
                this.A03 = c4107v2;
                this.A05 = str;
                this.A04 = c2924bq;
                c4107v2.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
            public void setupNativeCtaExtension(C3785Pp c3785Pp) {
                C23271U A0y;
                this.A01 = c3785Pp;
                int A0M = C3348Ih.A0M(this.A0I.A05());
                C23221P A01 = this.A03.A0z().A0w().A01();
                C4337Yn A05 = this.A0I.A05();
                String A0L = this.A03.A0z().A0L();
                InterfaceC3369J2 interfaceC3369J2 = this.A02;
                InterfaceC3560MC dummyListener = C3642NW.getDummyListener();
                C3872RE A0b = this.A04.A0b();
                C3528Lg A19 = this.A03.A19();
                if (this.A03.A0z() == null) {
                    A0y = null;
                } else {
                    A0y = this.A03.A0z().A0y();
                }
                ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl = new ViewOnClickListenerC4029Tl(A05, A0L, A01, interfaceC3369J2, dummyListener, A0b, A19, A0y);
                this.A00 = viewOnClickListenerC4029Tl;
                viewOnClickListenerC4029Tl.setCta(c3785Pp.A03().A0F(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0M == 1) {
                    layoutParams.addRule(12);
                    AbstractC3536Lo.A0P(this.A00, A06, 5, A01.A09(false));
                    ((C2918BK) this).A06.addView(this.A00, layoutParams);
                } else {
                    if (A0M != 2) {
                        return;
                    }
                    layoutParams.addRule(3, ((C2918BK) this).A06.getId());
                    int extensionVariant = A07;
                    layoutParams.setMargins(0, extensionVariant, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C2918BK) this).A06.bringToFront();
                }
            }
        };
    }
}
