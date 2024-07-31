package com.facebook.ads.redexgen.uinode;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.L7 */
/* loaded from: assets/audience_network.dex */
public final class C3493L7 implements InterfaceC3819QN {
    public static String[] A0B = {"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    public View A00;
    public C3930SA A01;
    public EnumC3831QZ A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC3790Pu A05;
    public final AbstractC3721On A06;
    public final AbstractC3679O7 A07;
    public final AbstractC3581MX A08;
    public final boolean A09;
    public final boolean A0A;

    public C3493L7(View view, EnumC3831QZ enumC3831QZ, boolean z10) {
        this(view, enumC3831QZ, z10, false);
    }

    public C3493L7(View view, EnumC3831QZ enumC3831QZ, boolean z10, boolean z11) {
        this.A06 = new AbstractC3721On() { // from class: com.facebook.ads.redexgen.X.7Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C278398 c278398) {
                C3493L7.this.A06(1, 0);
            }
        };
        this.A07 = new AbstractC3679O7() { // from class: com.facebook.ads.redexgen.X.7W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3680O8 c3680o8) {
                boolean z12;
                EnumC3831QZ enumC3831QZ2;
                boolean z13;
                z12 = C3493L7.this.A03;
                if (!z12) {
                    return;
                }
                enumC3831QZ2 = C3493L7.this.A02;
                if (enumC3831QZ2 != EnumC3831QZ.A03) {
                    z13 = C3493L7.this.A09;
                    if (!z13) {
                        C3493L7.this.A06(0, 8);
                        return;
                    }
                }
                C3493L7.this.A02 = null;
                C3493L7.this.A05();
            }
        };
        this.A05 = new AbstractC3790Pu() { // from class: com.facebook.ads.redexgen.X.7U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C27929H c27929h) {
                EnumC3831QZ enumC3831QZ2;
                View view2;
                View view3;
                enumC3831QZ2 = C3493L7.this.A02;
                if (enumC3831QZ2 == EnumC3831QZ.A04) {
                    return;
                }
                view2 = C3493L7.this.A00;
                view2.setAlpha(1.0f);
                view3 = C3493L7.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C26837T(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z10;
        this.A0A = z11;
        A08(view, enumC3831QZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C3830QY(this));
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

    private final void A08(View view, EnumC3831QZ enumC3831QZ) {
        this.A02 = enumC3831QZ;
        this.A00 = view;
        view.clearAnimation();
        if (enumC3831QZ == EnumC3831QZ.A04) {
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

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3819QN
    public final void A9R(C3930SA c3930sa) {
        this.A01 = c3930sa;
        c3930sa.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3819QN
    public final void AGl(C3930SA c3930sa) {
        A06(1, 0);
        c3930sa.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
