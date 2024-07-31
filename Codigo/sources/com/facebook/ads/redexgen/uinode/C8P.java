package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.8P */
/* loaded from: assets/audience_network.dex */
public class C8P extends O7 {
    public final /* synthetic */ LX A00;

    public C8P(LX lx) {
        this.A00 = lx;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
    /* renamed from: A00 */
    public final void A03(O8 o82) {
        boolean z10;
        boolean z11;
        boolean A0D;
        Handler handler;
        int i10;
        boolean z12;
        boolean A0D2;
        z10 = this.A00.A03;
        if (!z10) {
            return;
        }
        z11 = this.A00.A02;
        if (!z11) {
            return;
        }
        this.A00.A03 = false;
        A0D = this.A00.A0D(EnumC1190Qi.A04);
        if (!A0D) {
            z12 = this.A00.A04;
            if (!z12) {
                A0D2 = this.A00.A0D(EnumC1190Qi.A03);
                if (!A0D2) {
                    return;
                }
                this.A00.A03();
                this.A00.A06(true, true);
                return;
            }
        }
        this.A00.A04 = false;
        handler = this.A00.A05;
        C1064Lm c1064Lm = new C1064Lm(this);
        i10 = this.A00.A00;
        handler.postDelayed(c1064Lm, i10);
    }
}
