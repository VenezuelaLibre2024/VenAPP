package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ZQ */
/* loaded from: assets/audience_network.dex */
public final class C4376ZQ extends AbstractC22870q {
    public static byte[] A03;
    public View A00;
    public final C25675P A01;
    public final C3089EQ A02;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, 26, -58, 22, 24, 11, 25, 11, 20, 26, -58, 20, 27, 18, 18, -58, 7, 10, -4, 15, 11, 29};
    }

    public C4376ZQ(C25675P c25675p) {
        this.A02 = c25675p.A09();
        this.A01 = c25675p;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0C() {
        this.A02.A0E().A3o();
        AbstractC3446KK.A00(new C4378ZS(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0D() {
        this.A02.A0E().A3r();
        AbstractC3446KK.A00(new C4377ZR(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0E().A3q();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof C4036Ts) {
                AbstractC3409Ji.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            C3150FR controller = this.A01.A08();
            if (controller != null) {
                controller.A0I();
            }
            AbstractC3446KK.A00(new C4379ZT(this));
            C25675P c25675p = this.A01;
            c25675p.A0B(c25675p.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && C3348Ih.A11(this.A01.A07().getContext())) {
                final C3652Ng c3652Ng = new C3652Ng();
                this.A01.A0D(c3652Ng);
                c3652Ng.A0C(this.A01.getPlacementId());
                c3652Ng.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0H() != null) {
                    c3652Ng.A09(this.A01.A08().A0H().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C4036Ts) {
                    c3652Ng.A0A(((C4036Ts) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5Z
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        View view4;
                        View view5;
                        View view6;
                        view4 = C4376ZQ.this.A00;
                        if (view4 != null) {
                            C3652Ng c3652Ng2 = c3652Ng;
                            view5 = C4376ZQ.this.A00;
                            int width = view5.getWidth();
                            view6 = C4376ZQ.this.A00;
                            c3652Ng2.setBounds(0, 0, width, view6.getHeight());
                            c3652Ng.A0D(!r1.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(c3652Ng);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0F(InterfaceC22860p interfaceC22860p) {
        this.A02.A0E().A3p(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0J();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0G(C3403Jb c3403Jb) {
        this.A02.A0E().A2m(C3527Lf.A01(this.A01.A04()), c3403Jb.A03().getErrorCode(), c3403Jb.A04());
        AbstractC3446KK.A00(new C4380ZU(this, c3403Jb));
    }
}
