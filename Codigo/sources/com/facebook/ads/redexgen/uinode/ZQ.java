package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZQ extends AbstractC05640q {
    public static byte[] A03;
    public View A00;
    public final C5P A01;
    public final EQ A02;

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

    public ZQ(C5P c5p) {
        this.A02 = c5p.A09();
        this.A01 = c5p;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A0C() {
        this.A02.A0E().A3o();
        KK.A00(new ZS(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A0D() {
        this.A02.A0E().A3r();
        KK.A00(new ZR(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0E().A3q();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof C1278Ts) {
                AbstractC1011Ji.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            FR controller = this.A01.A08();
            if (controller != null) {
                controller.A0I();
            }
            KK.A00(new ZT(this));
            C5P c5p = this.A01;
            c5p.A0B(c5p.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && C0988Ih.A11(this.A01.A07().getContext())) {
                C1110Ng c1110Ng = new C1110Ng();
                this.A01.A0D(c1110Ng);
                c1110Ng.A0C(this.A01.getPlacementId());
                c1110Ng.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0H() != null) {
                    c1110Ng.A09(this.A01.A08().A0H().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C1278Ts) {
                    c1110Ng.A0A(((C1278Ts) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5Z
                    public final /* synthetic */ C1110Ng A01;

                    public C5Z(C1110Ng c1110Ng2) {
                        r2 = c1110Ng2;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        View view4;
                        View view5;
                        View view6;
                        view4 = ZQ.this.A00;
                        if (view4 != null) {
                            C1110Ng c1110Ng2 = r2;
                            view5 = ZQ.this.A00;
                            int width = view5.getWidth();
                            view6 = ZQ.this.A00;
                            c1110Ng2.setBounds(0, 0, width, view6.getHeight());
                            r2.A0D(!r1.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(c1110Ng2);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A0F(InterfaceC05630p interfaceC05630p) {
        this.A02.A0E().A3p(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0J();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A0G(C1005Jb c1005Jb) {
        this.A02.A0E().A2m(C1057Lf.A01(this.A01.A04()), c1005Jb.A03().getErrorCode(), c1005Jb.A04());
        KK.A00(new ZU(this, c1005Jb));
    }
}
