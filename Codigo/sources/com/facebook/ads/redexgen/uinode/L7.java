package com.facebook.ads.redexgen.uinode;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class L7 implements QN {
    public static String[] A0B = {"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    public View A00;
    public SA A01;
    public QZ A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC1176Pu A05;
    public final AbstractC1143On A06;
    public final O7 A07;
    public final MX A08;
    public final boolean A09;
    public final boolean A0A;

    public L7(View view, QZ qz, boolean z10) {
        this(view, qz, z10, false);
    }

    public L7(View view, QZ qz, boolean z10, boolean z11) {
        this.A06 = new AbstractC1143On() { // from class: com.facebook.ads.redexgen.X.7Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass98 anonymousClass98) {
                L7.this.A06(1, 0);
            }
        };
        this.A07 = new O7() { // from class: com.facebook.ads.redexgen.X.7W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(O8 o82) {
                boolean z12;
                QZ qz2;
                boolean z13;
                z12 = L7.this.A03;
                if (!z12) {
                    return;
                }
                qz2 = L7.this.A02;
                if (qz2 != QZ.A03) {
                    z13 = L7.this.A09;
                    if (!z13) {
                        L7.this.A06(0, 8);
                        return;
                    }
                }
                L7.this.A02 = null;
                L7.this.A05();
            }
        };
        this.A05 = new AbstractC1176Pu() { // from class: com.facebook.ads.redexgen.X.7U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                QZ qz2;
                View view2;
                View view3;
                qz2 = L7.this.A02;
                if (qz2 == QZ.A04) {
                    return;
                }
                view2 = L7.this.A00;
                view2.setAlpha(1.0f);
                view3 = L7.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C7T(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z10;
        this.A0A = z11;
        A08(view, qz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new QY(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i10, int i11) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i10);
        this.A00.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, QZ qz) {
        this.A02 = qz;
        this.A00 = view;
        view.clearAnimation();
        if (qz == QZ.A04) {
            this.A00.setAlpha(0.0f);
            String[] strArr = A0B;
            if (strArr[5].charAt(26) == strArr[0].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "3OWa54Sl5zOXBo6RskK22JrE4LW5JWKj";
            strArr2[0] = "lt7hksMEFpJVhV2333OBcIopOVPW9bfy";
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void A9R(SA sa2) {
        this.A01 = sa2;
        sa2.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void AGl(SA sa2) {
        A06(1, 0);
        sa2.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}